package com.ipvio.stream

import android.content.Context
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.*
import androidx.compose.ui.unit.dp

@Composable
internal fun StyleControls(ctx: Context) {
    val shelf = Look.savedStyles
    val active = Appearance.current()
    val chosen = shelf.selected
    var editor by remember { mutableStateOf<String?>(null) }
    var name by remember { mutableStateOf("") }
    var error by remember { mutableStateOf(false) }
    fun begin(target: String) { editor = target; name = target; error = false }
    fun finish() {
        val target = editor ?: return
        val edited = target.takeIf { it.isNotEmpty() }
        val source = if (edited == null) active else shelf.entries.find { it.name == edited }?.appearance ?: return
        val next = shelf.save(name, source, edited)
        if (next == null) { error = true; return }
        AppSettings.storeStyles(ctx, next)
        editor = null
    }

    SectionTitle("Kataloglayout")
    Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
        ChoiceChip("Klassisch", !Look.vod) { AppSettings.applyStyle(ctx, active.copy(vod = false)) }
        ChoiceChip("VOD", Look.vod) { AppSettings.applyStyle(ctx, active.copy(vod = true)) }
    }
    SectionTitle("Meine Designs")
    Hint("Wähle ein Layout und stelle unten Farben, Hintergrund, Größe und Animationen ein. Speichere die Kombination unter einem Namen.")
    PillButton("Als neues Design speichern", icon = AIcon.Plus) { begin("") }
    if (editor != null) {
        Field(name, { name = it.take(SavedStyles.NAME_LENGTH); error = false }, "Designname", onDone = { finish() })
        if (error) Hint("Gib einen eindeutigen Namen ein.")
        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            PillButton("Speichern", light = true) { finish() }
            PillButton("Abbrechen") { editor = null }
        }
    }
    shelf.entries.forEach { entry ->
        key(entry.name) {
            val selected = entry.name == shelf.chosen && entry.appearance == active
            PillButton(entry.name, light = selected, icon = if (selected) AIcon.Check else AIcon.Sparkle, raw = true) {
                editor = null
                AppSettings.applyStyle(ctx, entry.appearance, shelf.copy(chosen = entry.name))
            }
        }
    }
    if (chosen != null) {
        Text(raw = true, text = Lang.tr("Gewähltes Design") + " · " + chosen.name, color = Tok.TextHi, fontSize = DS.TextBody)
        if (active != chosen.appearance) {
            Hint("Das gewählte Design wurde angepasst.")
            PillButton("Änderungen im Design speichern") {
                shelf.save(chosen.name, active, chosen.name)?.let { AppSettings.storeStyles(ctx, it) }
            }
        }
        PillButton("Design umbenennen") { begin(chosen.name) }
        key(chosen.name) {
            ConfirmPill("Design löschen") { editor = null; AppSettings.storeStyles(ctx, shelf.remove(chosen.name)) }
        }
    }
}
