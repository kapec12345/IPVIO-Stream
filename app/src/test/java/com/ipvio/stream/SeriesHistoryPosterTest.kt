package com.ipvio.stream

import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Test

class SeriesHistoryPosterTest {
    private val series = Item("poster-test", Kind.SERIES, "Test", null, "", null, "")
    private val saved = Entry(series.id, "Test S2E4", "episode", 72_300, 3_000_000, 1, 2, 4)

    @After fun clear() {
        WatchStore.entries.removeAll { it.itemId == series.id }
    }

    @Test fun onlyTheMatchingSeriesGetsItsSavedPosition() {
        WatchStore.entries.add(saved)
        assertEquals(saved, WatchStore.historyEpisode(series))
        assertNull(WatchStore.historyEpisode(series.copy(kind = Kind.MOVIE)))
        assertNull(WatchStore.historyEpisode(series.copy(id = "different")))
    }

    @Test fun legacyCheckpointCanResumeWithoutSeparateEpisodeFields() {
        val old = saved.copy(season = 0, ep = 0)
        WatchStore.entries.add(old)
        assertEquals(old, WatchStore.historyEpisode(series))
        assertEquals(2 to 4, ResumeLogic.seasonEp(old.title))
    }

    @Test fun aZeroPositionOnlyOffersARecordedNextEpisode() {
        WatchStore.entries.add(saved.copy(pos = 0))
        assertNull(WatchStore.historyEpisode(series))
        val next = saved.copy(pos = 0, next = true)
        WatchStore.entries.add(next)
        assertEquals(next, WatchStore.historyEpisode(series))
    }
}
