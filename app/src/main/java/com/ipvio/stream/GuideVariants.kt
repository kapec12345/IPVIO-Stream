package com.ipvio.stream

import java.text.Normalizer
import java.util.Locale

/** The verified Polish catalogue pairs. Match the station, source, language and category exactly. */
internal object GuideVariants {
    private val quality = Regex("""^(.*?)\s+(UHD|FHD|HD)$""")
    private val spaces = Regex("""\s+""")
    private data class Station(val src: Int, val lang: String, val group: String, val name: String)

    fun donors(items: List<Item>): Map<String, Item> {
        val hd = mutableListOf<Pair<String, Station>>()
        val sources = mutableMapOf<Station, Item?>()
        for (item in items) {
            if (item.kind != Kind.LIVE || item.lang !in listOf("pl", LangTagLogic.UNKNOWN)) continue
            val group = item.group.trim().uppercase(Locale.ROOT)
            if (group != "PL| KANAŁY TVN PLAYER" && group != "PL| DOKUMENTALNE") continue
            val title = Normalizer.normalize(item.title, Normalizer.Form.NFKC)
                .uppercase(Locale.ROOT).removePrefix("PL|").trim().replace(spaces, " ")
            val match = quality.matchEntire(title) ?: continue
            val (name, tag) = match.destructured
            val donorQuality = when {
                group == "PL| KANAŁY TVN PLAYER" && name.startsWith("TVN ") -> "UHD"
                group == "PL| DOKUMENTALNE" && name == "CRIME AND INVESTIGATION" -> "FHD"
                else -> continue
            }
            val key = Station(item.src, item.lang, group, name)
            if (tag == "HD") hd.add(item.id to key)
            if (tag == donorQuality) sources[key] = if (key in sources) null else item
        }
        return hd.mapNotNull { (id, key) -> sources[key]?.takeIf { it.id != id }?.let { id to it } }.toMap()
    }
}
