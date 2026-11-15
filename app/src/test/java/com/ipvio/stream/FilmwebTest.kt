package com.ipvio.stream

import kotlinx.coroutines.runBlocking
import org.json.JSONObject
import org.junit.Assert.*
import org.junit.Test

class FilmwebTest {
    private val hits = JSONObject("""{"searchHits":[{"id":1,"type":"serial","matchedTitle":"Big Sky"},{"id":2,"type":"film","matchedTitle":"Big Sky"},{"id":3,"type":"serial","matchedTitle":"Big Sky"},{"id":4,"type":"serial","matchedTitle":"The Big Sky"},{"id":1,"type":"serial","matchedTitle":"Big Sky"}]}""")

    private fun preview(id: Int, year: Int) = JSONObject().put("id", id).put("year", year).put("entityName", "serial")

    @Test fun matchesOnlyExactTitleAndSelectedMediaType() {
        assertEquals(listOf(1, 3), Filmweb.candidates(hits, "PL - Big Sky", "serial"))
        assertEquals(listOf(2), Filmweb.candidates(hits, "BIG SKY", "film"))
    }

    @Test fun resolvesRemakesAndRejectsWrongOrAmbiguousYears() = runBlocking {
        val ids = listOf(1, 3)
        assertEquals(Filmweb.Title(1, 2020), Filmweb.match(ids, "serial", 2020) { preview(it, if (it == 1) 2020 else 1997) })
        assertNull(Filmweb.match(ids, "serial", null) { error("Unnecessary preview") })
        assertNull(Filmweb.match(ids, "serial", 2020) { preview(it, 2020) })
        assertNull(Filmweb.match(ids, "serial", 2021) { preview(it, 2020) })
        assertNull(Filmweb.match(listOf(1), "film", 2020) { preview(it, 2020) })
    }

    @Test fun aUniqueExactTitleCanHaveADifferentProviderYear() = runBlocking {
        val found = JSONObject("""{"searchHits":[{"id":10133758,"type":"serial","matchedTitle":"Apollo w ogniu"},{"id":7,"type":"film","matchedTitle":"Apollo w ogniu"},{"id":8,"type":"serial","matchedTitle":"Apollo w ogniu 2"}]}""")
        val ids = Filmweb.candidates(found, "PL - Apollo w ogniu", "serial")
        val matched = Filmweb.match(ids, "serial", 2024) { preview(it, 2026) }
        assertEquals(Filmweb.Title(10133758, 2026), matched)
        assertNull(Filmweb.match(ids, "serial", 2024) { preview(7, 2026) })
    }

    @Test fun anIncompleteNamesakeLookupCannotBecomeAUniqueMatch() = runBlocking {
        val ids = listOf(1, 3)
        assertNull(Filmweb.match(ids, "serial", 2020) { if (it == 1) preview(it, 2020) else null })
        assertNull(Filmweb.match(ids, "serial", 2020) { preview(it, if (it == 1) 2020 else 0) })
    }

    @Test fun retriesOldMissesAndRetainsOldScoresAndCurrentMisses() {
        assertNull(FilmwebStore.decode(JSONObject("""{"at":1,"year":0}""")))
        assertEquals(FilmwebResult.Missing, FilmwebStore.decode(JSONObject("""{"at":1,"year":0,"matchVersion":2}""")))
        assertEquals(FilmwebResult.Rating(3, 6.1, 5, 2026),
            FilmwebStore.decode(JSONObject("""{"id":3,"year":2026,"rate":6.1,"count":5}""")))
        assertEquals(FilmwebResult.Unrated(2026), FilmwebStore.decode(JSONObject("""{"id":3,"year":2026}""")))
    }

    @Test fun usesCommunityScoreForTheMatchedIdOnly() {
        val rating = JSONObject("""{"id":1,"rate":7.68,"count":1234,"countWantToSee":521}""")
        assertEquals(FilmwebResult.Rating(1, 7.68, 1234), Filmweb.rating(rating, 1))
        assertEquals(FilmwebResult.Missing, Filmweb.rating(rating, 2))
        assertEquals(FilmwebResult.Missing, Filmweb.rating(rating.put("count", 0), 1))
        assertEquals(FilmwebResult.Missing, Filmweb.rating(rating.put("count", 1).put("rate", 11), 1))
    }

    @Test fun aUniqueMatchSuppliesItsYearWithoutAPlaylistYear() = runBlocking {
        assertEquals(Filmweb.Title(3, 1997), Filmweb.match(listOf(3), "serial", null) { preview(it, 1997) })
        assertEquals(Filmweb.Title(3, null), Filmweb.match(listOf(3), "serial", null) { preview(it, 0) })
    }

    @Test fun preservesTheMatchedYearEvenIfThereAreNoVotes() {
        val data = JSONObject("""{"id":3,"rate":6.2,"count":4}""")
        assertEquals(FilmwebResult.Rating(3, 6.2, 4, 1997), Filmweb.rating(data, 3, 1997))
        assertEquals(FilmwebResult.Unrated(1997), Filmweb.rating(data.put("count", 0), 3, 1997))
        assertEquals(FilmwebResult.Missing, Filmweb.rating(data, 4, 1997))
        assertEquals(FilmwebResult.Missing, Filmweb.rating(JSONObject(), 0, 1997))
    }
}
