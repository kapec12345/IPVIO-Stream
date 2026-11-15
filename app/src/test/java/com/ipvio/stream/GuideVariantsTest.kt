package com.ipvio.stream

import org.junit.Assert.*
import org.junit.Test

class GuideVariantsTest {
    private fun station(id: String, name: String) =
        Item(id, Kind.LIVE, name, null, "", null, "PL| KANAŁY TVN PLAYER", lang = "pl")

    @Test fun linksTheAuditedPairsInOneDirectionAndRejectsOtherStations() {
        val hd = station("h", "PL| TVN MILIONERZY ᴴᴰ")
        val uhd = station("u", "PL| TVN MILIONERZY ᵁᴴᴰ")
        val crime = station("c", "PL| CRIME AND INVESTIGATION HD").copy(group = "PL| DOKUMENTALNE")
        val crimeFhd = crime.copy(id = "f", title = "PL| CRIME AND INVESTIGATION FHD")
        val items = listOf(hd, uhd, crime, crimeFhd, hd.copy(id = "other", title = "PL| TVN MILIONERZY +1 HD"),
            hd.copy(id = "us", src = 1), hd.copy(id = "foreign", lang = "de"))
        assertEquals(mapOf("h" to uhd, "c" to crimeFhd), GuideVariants.donors(items))
        assertTrue(GuideVariants.donors(listOf(hd, uhd, uhd.copy(id = "second"))).isEmpty())
    }

    @Test fun crimeAndInvestigationGetsItsOwnOfficialStationDespiteMislabelledAliases() {
        val names = PolishGuideNames()
        names.register("ID", "ID")
        names.register("ID", "Crime and Investigation FHD")
        names.register("CI Polsat", "CI Polsat")
        for (quality in listOf("HD", "FHD")) {
            assertEquals("CI Polsat", names.match(station("x", "PL| CRIME AND INVESTIGATION $quality")))
        }
        assertEquals("ID", names.match(station("x", "PL| ID HD")))
    }
}
