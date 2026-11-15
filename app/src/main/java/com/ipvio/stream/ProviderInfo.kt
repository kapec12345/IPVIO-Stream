package com.ipvio.stream

import android.content.Context
import android.util.JsonReader
import android.util.JsonToken
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import kotlinx.coroutines.withContext
import okhttp3.Request
import org.json.JSONObject
import java.io.File

/**
 * Film and series information straight from the provider (Xtream player_api.php): description, cover, backdrop, rating,
 * genres, running time and trailer. Works without any API key. Only used when TMDB is not set up or does not know the title.
 */
object ProviderInfo {
    private val client = Net.base
    private val catalogueRefresh = Mutex()
    private const val DAY = 24L * 3600 * 1000

    private fun get(url: String): okhttp3.Response? = try {
        client.newCall(Request.Builder().url(url).build()).execute()
    } catch (e: Exception) {
        null
    }

    private fun toMeta(i: ProviderLogic.Info, tv: Boolean, itemYear: Int?): Meta = Meta(
        tmdbId = 0, isTv = tv, poster = i.cover, backdrop = i.backdrop, overview = i.plot, rating = i.rating,
        year = i.year ?: itemYear?.toString(), genres = i.genres, runtime = i.runtime, trailerKey = i.trailer,
        extended = true, uiLang = Lang.code(), checked = true
    )

    /** Info about a title from the provider; null = unreachable or nothing available. */
    suspend fun fetch(ctx: Context, i: Item): Meta? = withContext(Dispatchers.IO) {
        try {
            when (i.kind) {
                Kind.MOVIE -> movie(i)
                Kind.SERIES -> series(ctx, i)
                else -> null
            }
        } catch (e: Exception) {
            null
        }
    }

    private fun movie(i: Item): Meta? {
        val (acct, id) = ProviderLogic.movieRef(i.url) ?: return null
        val body = get(ProviderLogic.apiUrl(acct, "get_vod_info", "&vod_id=$id"))?.use { r ->
            if (r.isSuccessful) r.body?.string() else null
        } ?: return null
        val info = JSONObject(body).optJSONObject("info") ?: return null
        val f = HashMap<String, String>()
        for (k in info.keys()) {
            val v = info.opt(k)
            if (v is String || v is Number) f[k] = v.toString()
        }
        val back = info.optJSONArray("backdrop_path")?.let { a -> (0 until a.length()).map { a.optString(it) }.firstOrNull { it.startsWith("http") } }
        val r = ProviderLogic.infoOf(f, back, listOf("cover_big", "movie_image", "cover"))
        val imdb = MovieImdb.validId(f["imdb_id"]) ?: MovieImdb.validId(f["imdb"])
        val original = ProviderLogic.clean(f["original_title"]) ?: ProviderLogic.clean(f["o_name"])
        return if (r.isEmpty() && imdb == null && original == null) null else toMeta(r, false, i.year).copy(imdbId = imdb, originalTitle = original)
    }

    private suspend fun series(ctx: Context, i: Item): Meta? {
        val acct = ProviderLogic.seriesAcct(i) ?: return null
        val info = seriesEntry(ctx, acct, i.title)?.info ?: return null
        return if (info.isEmpty()) null else toMeta(info, true, i.year)
    }

    suspend fun episodeRuntimes(ctx: Context, item: Item): Map<String, Int> = withContext(Dispatchers.IO) {
        val acct = ProviderLogic.seriesAcct(item) ?: return@withContext emptyMap()
        val id = seriesEntry(ctx, acct, item.title)?.id ?: return@withContext emptyMap()
        val apiAccount = XtreamLogic.Acct(acct.host, android.net.Uri.decode(acct.user), android.net.Uri.decode(acct.pass))
        PlaylistStore.xtreamApi().episodeRuntimes(apiAccount, id, "${acct.host}/series/${acct.user}/${acct.pass}/")
    }

    private data class SeriesEntry(val id: String?, val info: ProviderLogic.Info)

    private suspend fun seriesEntry(ctx: Context, acct: ProviderLogic.Acct, title: String): SeriesEntry? {
        val file = File(ctx.cacheDir, "prov_series_" + (acct.host + acct.user).hashCode() + ".json")
        catalogueRefresh.withLock {
            if (!file.exists() || System.currentTimeMillis() - file.lastModified() > DAY) {
                val tmp = File(file.path + ".tmp")
                try {
                    get(ProviderLogic.apiUrl(acct, "get_series"))?.use { r ->
                        if (r.isSuccessful) r.body?.let { b ->
                            tmp.outputStream().use { o -> b.byteStream().copyTo(o) }
                            tmp.renameTo(file)
                        }
                    }
                } finally { tmp.delete() }
                if (!file.exists()) return null
            }
        }
        return findSeries(file, title)
    }

    /** Reads the (large) series list entry by entry without loading it fully into memory. */
    private fun findSeries(file: File, title: String): SeriesEntry? {
        JsonReader(file.bufferedReader()).use { r ->
            r.beginArray()
            while (r.hasNext()) {
                val f = HashMap<String, String>()
                var back: String? = null
                r.beginObject()
                while (r.hasNext()) {
                    val n = r.nextName()
                    when (r.peek()) {
                        JsonToken.STRING, JsonToken.NUMBER -> f[n] = r.nextString()
                        JsonToken.BEGIN_ARRAY -> {
                            if (n == "backdrop_path") {
                                r.beginArray()
                                while (r.hasNext()) {
                                    if (r.peek() == JsonToken.STRING) { val v = r.nextString(); if (back == null && v.startsWith("http")) back = v }
                                    else r.skipValue()
                                }
                                r.endArray()
                            } else r.skipValue()
                        }
                        else -> r.skipValue()
                    }
                }
                r.endObject()
                if (ProviderLogic.sameName(title, f["name"])) return SeriesEntry(
                    f["series_id"]?.takeIf { it.isNotEmpty() && it.all(Char::isDigit) },
                    ProviderLogic.infoOf(f, back, listOf("cover_big", "cover"))
                )
            }
        }
        return null
    }
}
