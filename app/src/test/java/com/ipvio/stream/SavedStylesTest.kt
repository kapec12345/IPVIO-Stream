package com.ipvio.stream

import org.junit.Assert.*
import org.junit.Test

class SavedStylesTest {
    private val day = Appearance(false, 0, 0x2da463, -1, 0, 1, 2)
    private val evening = Appearance(true, 12, 0x532318, 0xffa988, 2, 0, 3)

    @Test fun namedLooksRoundTripIncludingLayoutCustomColorsAndLastSelection() {
        val library = SavedStyles().save("Dzień", day)!!.save("Noc \"VOD\"", evening)!!
        val restored = SavedStyles.decode(library.encode())
        assertEquals(library, restored)
        assertEquals(evening, restored.selected?.appearance)
        assertEquals(day, restored.entries.first().appearance)
    }

    @Test fun editingOneLookPreservesTheOtherAndRenamingPreservesItsValues() {
        val library = SavedStyles().save("A", day)!!.save("B", evening)!!
        val changed = library.save("B", day.copy(scale = 4), "B")!!
        val renamed = changed.save("Kino", changed.selected!!.appearance, "B")!!
        assertEquals(listOf("A", "Kino"), renamed.entries.map { it.name })
        assertEquals(day.copy(scale = 4), renamed.selected!!.appearance)
        assertEquals(day, renamed.entries.first().appearance)
        assertEquals(listOf(NamedStyle("A", day)), renamed.remove("Kino").entries)
        assertNull(renamed.remove("Kino").selected)
    }

    @Test fun duplicatesBlankNamesAndMissingRenameTargetsAreRejected() {
        val a = SavedStyles().save("  Salon  ", day)!!
        assertEquals("Salon", a.chosen)
        assertNull(a.save("SALON", evening))
        assertNull(a.save("  ", day))
        assertNull(a.save("Nowy", day, "Brak"))
        assertNull(a.save("a".repeat(SavedStyles.NAME_LENGTH + 1), day))
        assertEquals("SALON", a.save("SALON", day, "Salon")!!.chosen)
    }

    @Test fun olderProfilesAndMissingOrDamagedEntriesAreSafeToLoad() {
        assertEquals(SavedStyles(), SavedStyles.decode(null))
        assertEquals(SavedStyles(), SavedStyles.decode("invalid"))
        val json = org.json.JSONObject(SavedStyles().save("TV", evening)!!.encode())
        json.getJSONArray("items").put(org.json.JSONObject().put("name", "Incomplete"))
        json.put("chosen", "missing")
        val restored = SavedStyles.decode(json.toString())
        assertEquals(listOf(NamedStyle("TV", evening)), restored.entries)
        assertNull(restored.chosen)
    }
}
