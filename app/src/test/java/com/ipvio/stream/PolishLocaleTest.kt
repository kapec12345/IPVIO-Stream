package com.ipvio.stream

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class PolishLocaleTest {
    private val blocks = listOf(DictPl1, DictPl2, DictPl3, DictPl4, DictPl5, DictPl6, DictPl7)
    private val source = listOf(DictA, DictB, DictC, DictD, DictE, DictF, DictG, DictH, DictI, DictJ, DictK, DictL, DictM, DictN, DictO, DictW)
    private val placeholders = Regex("""\{#?\d\}""")
    private val pl get() = I18nCore.CODES.indexOf("pl")

    @Before fun load() {
        I18nCore.load(*source.toTypedArray())
        loadPolishTexts()
    }

    @Test fun polishIsSelectableAndDetectedWithoutChangingExistingIndices() {
        assertEquals(9, I18nCore.CODES.indexOf("nl"))
        assertEquals(10, pl)
        assertEquals("Polski", I18nCore.NATIVE[pl])
        assertEquals(pl, I18nCore.indexForSystem("pl"))
        assertEquals(pl, PhoneImportLogic.langIndex("pl-PL,pl;q=0.9,en;q=0.8"))
    }

    @Test fun dictionaryCoversEverySourceKeyAndPreservesPlaceholders() {
        fun rows(b: String) = b.lineSequence().filter { it.isNotBlank() && !it.startsWith("#") && it.contains('¦') }.map { it.split('¦').map(String::trim) }
        val dictionary = blocks.flatMap { rows(it).toList() }.associate { it[0] to it[1] }
        val keys = source.flatMap { rows(it).map { row -> row[0] }.toList() }.toSet()
        assertEquals(keys, dictionary.keys)
        for ((key, value) in dictionary) {
            assertTrue("Empty Polish text: $key", value.isNotBlank())
            assertEquals(key, placeholders.findAll(key).map { it.value }.toSet(), placeholders.findAll(value).map { it.value }.toSet())
        }
    }

    @Test fun coreScreensAndNumericMessagesArePolish() {
        assertEquals("Dodaj playlistę", I18nCore.translate("Playlist hinzufügen", pl))
        assertEquals("Ustawienia", I18nCore.translate("Einstellungen", pl))
        assertEquals("Odtwarzacz", I18nCore.translate("Player", pl))
        assertEquals("8 odcinków", I18nCore.translate("8 Folgen", pl))
        assertEquals("Brak danych EPG dla tego kanału", I18nCore.translate("Kein Programm für diesen Sender", pl))
        assertEquals("Wznów 01:23", I18nCore.translate("Fortsetzen 01:23", pl))
    }

    @Test fun wishboxReloadKeepsPolishOverrides() {
        loadWishboxTexts()
        assertEquals("Opóźnienie napisów", I18nCore.translate("Untertitel-Verzögerung", pl))
        assertEquals("Przywróć domyślne", I18nCore.translate("Zurücksetzen", pl))
    }
}
