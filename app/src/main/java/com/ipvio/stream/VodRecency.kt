package com.ipvio.stream

/** Added to the catalog, independently of production year or playback history. */
internal object VodRecency {
    private val recentGroup = Regex("""\b(ostatnio dodane|nowości|nowosci|najnowsze|recently added|new releases|neu hinzugefügt)\b""", RegexOption.IGNORE_CASE)

    fun timestamp(raw: String?): Long {
        val value = raw?.trim()?.toLongOrNull() ?: return 0L
        val seconds = if (value >= 1_000_000_000_000L) value / 1000 else value
        return seconds.takeIf { it in 315_532_800L..7_258_118_400L } ?: 0L
    }

    /** The current provider order breaks ties inside a batch and inside its own new-arrivals shelf. */
    fun newest(items: List<Item>): List<Item> {
        val groups = HashMap<String, Boolean>()
        fun rank(item: Item): Long = when {
            item.addedAt > 0 -> item.addedAt
            groups.getOrPut(item.group) { recentGroup.containsMatchIn(item.group) } -> 0L
            else -> -1L
        }
        return items.sortedByDescending(::rank)
    }

    /** First import and newly enabled languages form a baseline. Only later unseen IDs get today's date. */
    fun carryDates(items: List<Item>, previous: Map<String, Long>, sameSelection: Boolean, now: Long) {
        for (item in items) {
            if (item.kind == Kind.LIVE || item.addedAt > 0) continue
            item.addedAt = previous[item.id] ?: if (sameSelection) now else 0L
        }
    }
}
