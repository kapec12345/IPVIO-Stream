package com.ipvio.stream

import kotlinx.coroutines.runBlocking
import org.json.JSONArray
import org.json.JSONObject
import org.junit.Assert.*
import org.junit.Test

class MovieImdbTest {
    private fun film(id: String, year: Int, type: String = "movie") = JSONObject()
        .put("id", id).put("name", "Frankenstein").put("type", type).put("releaseInfo", year.toString())

    @Test fun fallbackOnlyAfterMissingOrUnratedMovie() = runBlocking {
        val fw = FilmwebResult.Rating(7, 5.1, 120, 2026)
        assertEquals("Filmweb", TitleRating.resolve(Kind.MOVIE, fw) { error("Unexpected request") }.source)
        for (result in listOf(FilmwebResult.Unrated(1931), FilmwebResult.Missing)) {
            val displayed = TitleRating.resolve(Kind.MOVIE, result) { ImdbResult.Rating(7.7) }
            assertEquals("IMDb", displayed.source)
            assertEquals(7.7, displayed.score!!, 0.001)
        }
        assertNull(TitleRating.resolve(Kind.SERIES, FilmwebResult.Missing) { error("Unexpected request") }.score)
        assertNull(TitleRating.resolve(Kind.MOVIE, FilmwebResult.Unavailable) { error("Unexpected request") }.score)
    }

    @Test fun distinguishesRemakesMediaTypesAndAmbiguousTitles() {
        val hits = JSONArray().put(film("tt0021884", 1931)).put(film("tt1312221", 2025))
            .put(film("tt1002000", 1931, "series"))
        assertEquals("tt0021884", MovieImdb.candidate(hits, "Frankenstein", 1931))
        assertNull(MovieImdb.candidate(hits, "Frankenstein", null))
        assertNull(MovieImdb.candidate(hits, "Frankenstein", 1950))
        assertNull(MovieImdb.candidate(hits, "Bride of Frankenstein", 1931))
        assertNull(MovieImdb.candidate(hits.put(film("tt9999999", 1931)), "Frankenstein", 1931))
    }

    @Test fun readsOnlyTheExplicitImdbFieldForTheMatchingMovie() {
        val meta = film("tt0021884", 1931).put("rating", "7.2")
        assertEquals(ImdbResult.Missing, MovieImdb.rating(meta, "tt0021884", 1931))
        meta.put("imdbRating", "7.7")
        assertEquals(ImdbResult.Rating(7.7), MovieImdb.rating(meta, "tt0021884", 1931))
        assertEquals(ImdbResult.Missing, MovieImdb.rating(meta, "tt0021884", 2025))
        assertEquals(ImdbResult.Missing, MovieImdb.rating(meta, "tt9999999", 1931))
        for (invalid in listOf("0", "N/A", "", "15", "NaN", "7.2/10")) assertNull(MovieImdb.score(invalid))
    }
}
