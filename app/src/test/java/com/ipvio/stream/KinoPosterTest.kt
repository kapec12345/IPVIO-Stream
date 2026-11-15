package com.ipvio.stream

import org.junit.Assert.*
import org.junit.Test

class KinoPosterTest {
    @Test fun promotesSmallTmdbImagesAndRetainsOriginalWhenUnavailable() {
        val src = "https://image.tmdb.org/t/p/w185/still.jpg"
        assertEquals(listOf(src.replace("w185", "w500"), src), KinoPosterArt.sources(src))
    }

    @Test fun keepsProviderAddressesAndLargerPostersIntact() {
        val urls = listOf("https://source.example/t/p/w185/file.jpg", "https://image.tmdb.org/t/p/w780/cover.jpg")
        urls.forEach { assertEquals(listOf(it), KinoPosterArt.sources(it)) }
        assertTrue(KinoPosterArt.sources(null).isEmpty())
    }

    @Test fun picksAPosterOverAnEpisodeStillAndLooksForBetterSmallArt() {
        assertTrue(KinoPosterArt.score(600, 900) > KinoPosterArt.score(500, 281))
        assertTrue(KinoPosterArt.score(500, 281) > KinoPosterArt.score(185, 104))
        assertFalse(KinoPosterArt.adequate(500, 281))
        assertFalse(KinoPosterArt.adequate(100, 150))
        assertTrue(KinoPosterArt.adequate(500, 750))
    }

    @Test fun invalidLargeCoverFallsBackToActualProviderPoster() {
        val fields = mapOf("cover_big" to "N/A", "cover" to "https://source.example/poster.jpg")
        assertEquals(fields["cover"], ProviderLogic.infoOf(fields, null, listOf("cover_big", "cover")).cover)
    }
}
