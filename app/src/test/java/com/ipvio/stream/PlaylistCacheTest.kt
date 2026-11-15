package com.ipvio.stream

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Assert.assertSame
import org.junit.Assert.assertTrue
import org.junit.Test
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.DataOutputStream

/** Parsing (language, saving memory) and the playlist cache. */
class PlaylistCacheTest {
    private val m3u = """#EXTM3U
#EXTINF:-1 tvg-id="ard" group-title="DE | News",DE: Das Erste HD
http://h/live/u/p/1.ts
#EXTINF:-1 group-title="TR | Ulusal",TRT 1
http://h/live/u/p/2.ts
#EXTINF:-1 group-title="Sport",beIN Sports 1
http://h/live/u/p/3.ts
#EXTINF:-1 group-title="VOD | DE | Action",Matrix (1999)
http://h/movie/u/p/4.mp4
#EXTINF:-1 group-title="Netflix",EN - Glass Onion (2022)
http://h/movie/u/p/5.mp4
#EXTINF:-1 group-title="DE | Serien",Show S01E01
http://h/series/u/p/6.mkv
#EXTINF:-1 group-title="DE | Serien",Show S01E02
http://h/series/u/p/7.mkv
#EXTINF:-1 group-title="DE | Serien",Show S01E02 FHD
http://h/series/u/p/8.mkv
"""
    private val items = M3uParser.parse(m3u)

    @Test fun einlesen_spracheJeEintrag() {
        val byTitle = items.associate { it.title to it.lang }
        assertEquals("de", byTitle["DE: Das Erste HD"])
        assertEquals("tr", byTitle["TRT 1"])
        assertEquals(LangTagLogic.UNKNOWN, byTitle["beIN Sports 1"])
        assertEquals("de", byTitle["Matrix"])
        assertEquals("en", byTitle["Glass Onion"])
        assertEquals("de", byTitle["Show"])
    }

    @Test fun einlesen_einzelneQuelleOhneListe_mehrereMitListe() {
        val show = items.first { it.kind == Kind.SERIES }
        val e1 = show.episodes.first { it.num == 1 }
        val e2 = show.episodes.first { it.num == 2 }
        assertTrue(e1.variants.isEmpty())
        assertEquals("http://h/series/u/p/6.mkv", pickVariant(e1, null, null, null).url)
        assertEquals(2, e2.variants.size)
        assertEquals("FHD", e2.quality)          // best source first
        assertEquals("http://h/series/u/p/8.mkv", e2.url)
    }

    @Test fun einlesen_gleicheKategorieNurEinmalImSpeicher() {
        val a = M3uParser.parse(m3u + "#EXTINF:-1 group-title=\"DE | News\",ZDF\nhttp://h/live/u/p/9.ts\n")
        val g = a.filter { it.group == "DE | News" }
        assertEquals(2, g.size)
        assertSame(g[0].group, g[1].group)
    }

    @Test fun liveMovieChannelsStayInTheGuideAndRecordingsStayInVod() {
        val playlist = """#EXTM3U
#EXTINF:-1 tvg-id="canal.premium" catchup="xc" catchup-days="3" group-title="PL| FILMOWE",PL| CANAL+ PREMIUM FHD
https://tv/live/user/pass/42.ts
#EXTINF:-1 group-title="PL| FILMOWE",PL| CANAL+ PREMIUM HD
https://tv/live/user/pass/43.ts
#EXTINF:-1 group-title="Movie Channels",Station S01E01
https://tv/iptv/LIVE/user/pass/44.m3u8?format=ts
#EXTINF:-1 group-title="PL| FILMOWE",A movie (2026)
https://tv/movie/live/pass/45.mp4?next=/live/x/y/46.ts
#EXTINF:-1 group-title="PL| FILMOWE",A series S01E01
https://tv/series/user/live/46.mkv
#EXTINF:-1 group-title="VOD",Standalone movie
https://cdn.example/47
"""
        val parsed = M3uParser.parseStream(playlist.reader())
        val live = parsed.items.filter { it.kind == Kind.LIVE }
        assertEquals(listOf("PL| CANAL+ PREMIUM FHD", "PL| CANAL+ PREMIUM HD", "Station S01E01"), live.map { it.title })
        assertEquals("canal.premium", live.first().tvgId)
        assertTrue(live.first().id in parsed.catchup)
        assertEquals(listOf("A movie", "Standalone movie"), parsed.items.filter { it.kind == Kind.MOVIE }.map { it.title })
        assertEquals("A series", parsed.items.single { it.kind == Kind.SERIES }.title)
        assertEquals(live, M3uParser.parseStream(playlist.reader(), setOf(LangTagLogic.NO_VOD)).items)
        assertEquals(3, M3uParser.parseStream(playlist.reader(), setOf(LangTagLogic.NO_LIVE)).items.size)
    }

    @Test fun legacySnapshotWithoutSourceStillSeparatesChannelFromMovie() {
        val old = listOf(
            Item("station", Kind.MOVIE, "CANAL+ PREMIUM", null, "https://tv/live/u/p/12.ts", null, "PL| FILMOWE", lang = "pl", addedAt = 100),
            Item("film", Kind.MOVIE, "Film", 2025, "https://tv/movie/u/p/13.mp4", null, "PL| FILMOWE", lang = "pl", addedAt = 200)
        )
        val stream = ByteArrayOutputStream()
        PlaylistCacheIO.write(stream, "list", old, emptyList(), emptyMap())
        val bytes = stream.toByteArray()
        java.nio.ByteBuffer.wrap(bytes).putInt(6)
        assertEquals(6, PlaylistCacheIO.readHeader(bytes.inputStream(), "list")!!.version)
        val live = PlaylistCacheIO.read(bytes.inputStream(), "list", setOf(LangTagLogic.NO_VOD))!!.items.single()
        assertEquals(Kind.LIVE, live.kind)
        assertEquals("station", live.id)
        assertEquals(0L, live.addedAt)
        assertEquals(listOf(old.last()), PlaylistCacheIO.read(bytes.inputStream(), "list", setOf(LangTagLogic.NO_LIVE))!!.items)
    }

    private fun roundTrip(hidden: Set<String>): PlaylistCacheIO.Cached? {
        val out = ByteArrayOutputStream()
        PlaylistCacheIO.write(out, "http://x/get.php", items, listOf("http://epg"), mapOf("DE | News" to 0))
        return PlaylistCacheIO.read(ByteArrayInputStream(out.toByteArray()), "http://x/get.php", hidden)
    }

    @Test fun cache_rundreiseOhneFilter() {
        val c = roundTrip(emptySet())!!
        assertEquals(items, c.items)
        assertEquals(listOf("http://epg"), c.epg)
        assertEquals(mapOf("DE | News" to 0), c.order)
        assertEquals(items.size, c.counts.values.sum())
    }

    @Test fun cache_ausgeblendeteSprachenWerdenUebersprungenAberGezaehlt() {
        val c = roundTrip(setOf("tr", "en", LangTagLogic.UNKNOWN))!!
        assertTrue(c.items.all { it.lang == "de" })
        assertEquals(items.count { it.lang == "de" }, c.items.size)
        assertEquals(1, c.counts["tr"])
        assertEquals(1, c.counts["en"])
        assertEquals(items.size, c.counts.values.sum())
        // after skipping, the following entries are still correct (a series with variants comes last)
        assertEquals(2, c.items.first { it.kind == Kind.SERIES }.episodes.size)
    }

    @Test fun cache_andereAdresseOderVersion() {
        val out = ByteArrayOutputStream()
        PlaylistCacheIO.write(out, "http://a", items, emptyList(), emptyMap())
        assertNull(PlaylistCacheIO.read(ByteArrayInputStream(out.toByteArray()), "http://b", emptySet()))
        val bad = ByteArrayOutputStream().also { DataOutputStream(it).writeInt(99) }
        assertNull(PlaylistCacheIO.read(ByteArrayInputStream(bad.toByteArray()), "http://a", emptySet()))
    }

    /** Version 3 (older app, without language) is still read; the language is derived from category/name. */
    @Test fun cache_version3WirdGelesen() {
        val out = ByteArrayOutputStream()
        val o = DataOutputStream(out)
        fun str(s: String?) { if (s == null) o.writeInt(-1) else { val b = s.toByteArray(); o.writeInt(b.size); o.write(b) } }
        o.writeInt(3); str("http://a"); o.writeInt(0); o.writeInt(0); o.writeInt(2)
        // Live channel in a Turkish category
        str("1"); o.writeInt(Kind.LIVE.ordinal); str("TRT 1"); o.writeInt(-1); str("http://h/1"); str(null); str("TR | Ulusal"); str(null); str(null); o.writeInt(0)
        // Movie in a German category with a single source as a list (old form)
        str("2"); o.writeInt(Kind.SERIES.ordinal); str("Show"); o.writeInt(-1); str(""); str(null); str("DE | Serien"); str(null); str(null); o.writeInt(1)
        o.writeInt(1); o.writeInt(1); str("Episode 1"); str("http://h/e1"); str(null); o.writeInt(1); str("http://h/e1"); str("DE"); str(null); str("DE")
        val c = PlaylistCacheIO.read(ByteArrayInputStream(out.toByteArray()), "http://a", setOf("tr"))!!
        assertEquals(1, c.items.size)
        assertEquals("de", c.items[0].lang)
        assertTrue(c.items[0].episodes[0].variants.isEmpty())
        assertEquals(mapOf("tr" to 1, "de" to 1), c.counts)
    }
}
