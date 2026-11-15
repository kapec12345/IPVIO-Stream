package com.ipvio.stream

import android.content.Context
import android.util.Xml
import kotlinx.coroutines.Job
import kotlinx.coroutines.currentCoroutineContext
import kotlinx.coroutines.ensureActive
import okhttp3.Cache
import okhttp3.OkHttpClient
import okhttp3.Request
import org.xml.sax.Attributes
import org.xml.sax.helpers.DefaultHandler
import java.io.BufferedInputStream
import java.io.File
import java.text.Normalizer
import java.util.Locale
import java.util.zip.GZIPInputStream

/** Match complete names, keeping timeshifts, regional names, station numbers and '+' distinct. */
internal class PolishGuideNames {
    private val official = HashMap<String, String>()
    private val aliases = HashMap<String, String>()

    fun register(id: String, alias: String) {
        val key = key(alias)
        if (key.isEmpty()) return
        val index = if (alias == id) official else aliases
        val previous = index[key]
        index[key] = if (previous == null || previous == id) id else ""
    }

    fun match(item: Item): String? {
        if (item.kind != Kind.LIVE || (item.lang != "pl" && item.lang != LangTagLogic.UNKNOWN)) return null
        val keys = ArrayList<String>()
        var title = prefix.replace(item.title.trim(), "").trim()
        while (title.isNotEmpty()) {
            keys.add(key(title))
            val shorter = quality.replace(title, "").trimEnd()
            if (shorter == title) break
            title = shorter
        }
        // A secondary display-name for TVN 24 BiS is also spelled TVN24.
        // A station's own name takes precedence over another station's alias.
        // EPG.OVH also lists the English C+I name as an alias of Investigation Discovery.
        if ("crimeandinvestigation" in keys) return official[key("CI Polsat")]?.takeIf(String::isNotEmpty)
        keys.firstNotNullOfOrNull { official[it] }?.let { return it.takeIf(String::isNotEmpty) }
        item.tvgId?.let { id ->
            val name = key(id)
            (official[name] ?: aliases[name])?.takeIf(String::isNotEmpty)?.let { return it }
        }
        return keys.firstNotNullOfOrNull { aliases[it] }?.takeIf(String::isNotEmpty)
    }

    companion object {
        private val prefix = Regex("""(?i)^\s*(?:\[PL(?:-VIP)?\]|\|?PL(?:-VIP)?\s*[:|])\s*""")
        private val quality = Regex("""(?i)\s+(?:RAW|FHD|UHD|SD|HD|4K|HEVC|1080P|720P|\(NA\))$""")
        private val marks = Regex("""\p{M}+""")
        private val separators = Regex("""[^\p{L}0-9+-]+""")
        private fun key(value: String): String {
            val plain = prefix.replace(value.trim(), "").lowercase(Locale.ROOT).replace('ł', 'l')
            return Normalizer.normalize(plain, Normalizer.Form.NFD).replace(marks, "").replace(separators, "")
        }
    }
}

/** Add complete public programmes only inside gaps in the provider's sorted timetable. */
internal fun fillGuideGaps(primary: List<EpgEntry>, extra: List<EpgEntry>): List<EpgEntry> {
    if (extra.isEmpty()) return primary
    if (primary.isEmpty()) return extra
    var p = 0
    val added = extra.filter { show ->
        while (p < primary.size && primary[p].end <= show.start) p++
        p == primary.size || primary[p].start >= show.end
    }
    return if (added.isEmpty()) primary else (primary + added).sortedBy { it.start }
}

internal object PolishGuide {
    private const val FEED = "https://epg.ovh/pl.gz"
    private var cachedClient: OkHttpClient? = null

    @Synchronized private fun client(ctx: Context): OkHttpClient = cachedClient ?: OkHttpClient.Builder()
        .cache(Cache(File(ctx.cacheDir, "epg-ovh-http"), 20L * 1024 * 1024))
        .addNetworkInterceptor { chain ->
            val response = chain.proceed(chain.request())
            if (response.isSuccessful && response.header("Cache-Control") == null)
                response.newBuilder().header("Cache-Control", "max-age=21600").build() else response
        }.build().also { cachedClient = it }

    suspend fun load(ctx: Context, live: List<Item>): Map<String, List<EpgEntry>> {
        val parser = Stations(live, System.currentTimeMillis() / 1000, currentCoroutineContext()[Job]!!)
        client(ctx).newCall(Request.Builder().url(FEED).build()).execute().use { response ->
            if (!response.isSuccessful) throw PlaylistError("HTTP ${response.code}")
            val stream = BufferedInputStream(response.body!!.byteStream(), 32768)
            stream.mark(2)
            val compressed = stream.read() == 0x1f && stream.read() == 0x8b
            stream.reset()
            val xml = if (compressed) GZIPInputStream(stream, 32768) else stream
            xml.use { Xml.parse(it, Xml.Encoding.UTF_8, parser) }
        }
        return parser.result()
    }

    /** XMLTV declares channels before programmes. Variants share a single immutable schedule in memory. */
    private class Stations(private val live: List<Item>, private val now: Long, private val job: Job) : DefaultHandler() {
        private val aliases = PolishGuideNames()
        private var mapping: Map<String, String>? = null
        private val slots = HashMap<String, MutableList<EpgEntry>>()
        private var station: String? = null
        private var target: MutableList<EpgEntry>? = null
        private var start = 0L
        private var stop = 0L
        private var title = ""
        private var desc = ""
        private var field = ""
        private val text = StringBuilder()
        private var seen = 0

        override fun startElement(uri: String?, local: String, qName: String?, a: Attributes) {
            when (local) {
                "channel" -> { station = a.getValue("id"); station?.let { aliases.register(it, it) } }
                "display-name" -> if (station != null) begin(local)
                "programme" -> {
                    if (++seen % 256 == 0) job.ensureActive()
                    if (mapping == null) {
                        mapping = live.mapNotNull { item -> aliases.match(item)?.let { item.id to it } }.toMap()
                        mapping!!.values.forEach { slots.getOrPut(it) { ArrayList() } }
                    }
                    val list = slots[a.getValue("channel")] ?: return
                    start = xmltvTime(a.getValue("start")) ?: return
                    stop = xmltvTime(a.getValue("stop")) ?: return
                    if (start >= now + 129600 || stop <= now - 3600 || !epgSane(start, stop) || list.size >= 120) return
                    target = list
                    title = ""
                    desc = ""
                }
                "title" -> if (target != null && title.isEmpty()) begin(local)
                "desc" -> if (target != null && desc.isEmpty()) begin(local)
            }
        }

        private fun begin(name: String) { field = name; text.setLength(0) }

        override fun characters(ch: CharArray, offset: Int, length: Int) {
            if (field.isNotEmpty() && text.length < 400) text.append(ch, offset, minOf(length, 400 - text.length))
        }

        override fun endElement(uri: String?, local: String, qName: String?) {
            if (local == field) {
                val value = text.toString().trim()
                when (field) {
                    "display-name" -> station?.let { aliases.register(it, value) }
                    "title" -> title = value
                    "desc" -> desc = value
                }
                field = ""
            }
            when (local) {
                "channel" -> station = null
                "programme" -> { if (title.isNotBlank()) target?.add(EpgEntry(title, desc, start, stop)); target = null }
            }
        }

        fun result(): Map<String, List<EpgEntry>> {
            val sorted = slots.filterValues { it.isNotEmpty() }.mapValues { (_, shows) -> shows.distinctBy { it.start }.sortedBy { it.start } }
            return mapping.orEmpty().mapNotNull { (itemId, id) -> sorted[id]?.let { itemId to it } }.toMap()
        }
    }
}
