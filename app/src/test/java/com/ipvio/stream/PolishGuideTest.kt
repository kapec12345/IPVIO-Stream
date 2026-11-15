package com.ipvio.stream

import org.junit.Assert.*
import org.junit.Test

class PolishGuideTest {
    private fun live(name: String, id: String? = null, language: String = "pl") =
        Item("stream", Kind.LIVE, name, null, "", null, "", tvgId = id, lang = language)

    @Test fun rawChannelsMatchSeparatePublicStationsWithoutIds() {
        val index = PolishGuideNames()
        listOf("TVN 24", "TVN 24 BiS", "TVN 24+ live 1").forEach { index.register(it, it) }
        index.register("TVN 24 BiS", "TVN24")
        assertEquals("TVN 24", index.match(live("PL-VIP| TVN 24 RAW")))
        assertEquals("TVN 24 BiS", index.match(live("PL-VIP| TVN24 BIS RAW")))
        assertNull(index.match(live("PL| TVN 24+")))
        assertNull(index.match(live("PL| TVN 24 +1 HD")))
        assertNull(index.match(live("TVN24 HD", language = "de")))
    }

    @Test fun aliasesRejectCollisionsAndKeepBrandedQualityAndRegionalNames() {
        val index = PolishGuideNames()
        index.register("TVP", "TVP")
        index.register("TVP HD", "TVP HD")
        index.register("A", "TVP 3 Łódź")
        index.register("B", "TVP 3 Kraków")
        index.register("A", "Regionalny")
        index.register("B", "Regionalny")
        assertEquals("TVP HD", index.match(live("PL| TVP HD RAW")))
        assertEquals("A", index.match(live("PL| TVP3 Lodz FHD (NA)")))
        assertNull(index.match(live("Regionalny HD")))
        assertNull(index.match(live("TVP 3")))
    }

    @Test fun primaryWinsAgainstDuplicatesAndPartiallyOverlappingShows() {
        fun show(n: String, start: Long, stop: Long) = EpgEntry(n, "", start, stop)
        val primary = listOf(show("One", 10, 20), show("Two", 30, 40))
        val public = listOf(show("Before", 0, 10), show("Earlier", 9, 18), show("Duplicate", 10, 20),
            show("In the gap", 20, 30), show("Another overlap", 29, 35), show("After", 40, 45))
        assertEquals(listOf("Before", "One", "In the gap", "Two", "After"), fillGuideGaps(primary, public).map { it.title })
        assertEquals(public, fillGuideGaps(emptyList(), public))
        assertEquals(primary, fillGuideGaps(primary, emptyList()))
    }
}
