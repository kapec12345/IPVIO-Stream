package com.ipvio.stream

import org.junit.Assert.assertEquals
import org.junit.Test

class KinoCatalogTest {
    private fun check(kind: Kind) {
        val items = listOf("unknown", "Allen", "second", "tie").map {
            Item(it, kind, it, null, "", null, "")
        }
        val kino = KinoCatalog(mapOf(
            "Allen" to KinoCatalog.Facts(5.1, 2026),
            "second" to KinoCatalog.Facts(8.2, 1989),
            "tie" to KinoCatalog.Facts(5.1, 2002)
        ))
        fun order(sort: Int, minimum: Int = 0, year: String = "Alle") =
            filterAndSort(items, BrowseKey(sort, minimum, year, null, null, 0), kino).map { it.title }
        assertEquals(listOf("second", "Allen", "tie", "unknown"), order(2))
        assertEquals(listOf("Allen", "tie", "second", "unknown"), order(3))
        assertEquals(listOf("Allen", "tie", "second", "unknown"), order(4))
        assertEquals(listOf("second", "tie", "Allen", "unknown"), order(5))
        assertEquals(listOf("second"), order(2, 2))
        assertEquals(listOf("Allen"), order(2, year = "2026"))
    }
    @Test fun movieScoresYearsTiesAndMissingValues() = check(Kind.MOVIE)
    @Test fun seriesScoresYearsTiesAndMissingValues() = check(Kind.SERIES)
}
