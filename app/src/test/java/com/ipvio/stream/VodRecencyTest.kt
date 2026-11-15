package com.ipvio.stream

import org.junit.Assert.*
import org.junit.Test
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.DataOutputStream

class VodRecencyTest {
    private fun film(id: String, date: Long = 0L, group: String = "Other") =
        Item(id, Kind.MOVIE, id, 1999, "", null, group, addedAt = date)

    @Test fun additionsSurviveReorderingAndNewLanguagesAreNotNewReleases() {
        val items = listOf(film("existing"), film("recent"), film("new"), film("dated", 1750000000))
        VodRecency.carryDates(items, mapOf("recent" to 1700000000L, "existing" to 0L), true, 1800000000)
        assertEquals(listOf("new", "dated", "recent", "existing"), VodRecency.newest(items).map { it.id })
        val newLanguage = film("hidden before")
        VodRecency.carryDates(listOf(newLanguage), emptyMap(), false, 1800000000)
        assertEquals(0L, newLanguage.addedAt)
    }

    @Test fun baselinePrefersProviderShelfWithStableOrder() {
        val items = listOf(film("archive"), film("first", group = "|PL| OSTATNIO DODANE"), film("second", group = "|PL| OSTATNIO DODANE"))
        assertEquals(listOf("first", "second", "archive"), VodRecency.newest(items).map { it.title })
    }

    @Test fun timestampSurvivesTheProviderParserAndCache() {
        val a = XtreamLogic.Acct("http://test", "u", "p")
        val movie = XtreamLogic.movieEntry(a, mapOf("name" to "Movie", "stream_id" to "1", "added" to "1700000000000"), emptyMap())!!
        val series = XtreamLogic.seriesOf(mapOf("name" to "Series", "series_id" to "2", "added" to "1600000000"), emptyMap())!!
        val items = M3uParser.parse("#EXTM3U\n$movie\n" + XtreamLogic.lazyEntry(a, series))
        val out = ByteArrayOutputStream()
        PlaylistCacheIO.write(out, "test", items, emptyList(), emptyMap())
        fun input() = ByteArrayInputStream(out.toByteArray())
        val loaded = PlaylistCacheIO.read(input(), "test", emptySet())!!.items
        assertEquals(listOf(1700000000L, 1600000000L), loaded.map { it.addedAt })
        assertEquals(loaded.associate { it.id to it.addedAt }, PlaylistCacheIO.previousDates(input(), "test")!!.second)
    }

    @Test fun versionFiveSeedsExistingIdsWithoutCallingThemNew() {
        val out = ByteArrayOutputStream()
        val d = DataOutputStream(out)
        fun str(s: String) { val b = s.toByteArray(); d.writeInt(b.size); d.write(b) }
        d.writeInt(5); str("test"); d.writeInt(0); d.writeInt(0); str(""); d.writeInt(0); d.writeInt(0); d.writeInt(1)
        str("old"); d.writeInt(Kind.MOVIE.ordinal); str("pl"); str("Old"); d.writeInt(1999); str(""); str(""); str("Movies"); str(""); str(""); d.writeInt(0)
        fun input() = ByteArrayInputStream(out.toByteArray())
        assertEquals(0L, PlaylistCacheIO.read(input(), "test", emptySet())!!.items.single().addedAt)
        assertEquals(mapOf("old" to 0L), PlaylistCacheIO.previousDates(input(), "test")!!.second)
    }
}
