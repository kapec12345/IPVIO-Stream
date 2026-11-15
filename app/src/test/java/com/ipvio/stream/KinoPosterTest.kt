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

    @Test fun tinyProviderPreviewsPreferVerifiedFullPostersAndKeepFallback() {
        val eden = "https://media.upflix.pl/renditions/1068817/v0/poster_card@1.webp"
        val strife = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTTCP3-_pBAfqj-2-PTgK6KzpsHCSjfEHV-8g&s"
        assertEquals(listOf("https://fwcdn.pl/fpo/01/30/10060130/8245725.3.jpg", eden), KinoPosterArt.sources(eden))
        assertEquals(listOf("https://grodzisksport.pl/files/image/strife_mma.jpg", strife), KinoPosterArt.sources(strife))
        val different = eden.replace("1068817", "1068818")
        assertEquals(listOf(different), KinoPosterArt.sources(different))
    }
}
