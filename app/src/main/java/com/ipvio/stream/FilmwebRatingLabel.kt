package com.ipvio.stream

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import kotlinx.coroutines.delay
import java.text.NumberFormat
import java.util.Locale

@Composable
internal fun FilmwebRatingLabel(item: Item, metadataYear: Int?, metadataDone: Boolean, opened: Boolean, compact: Boolean = false) {
    if (DemoMode.active || item.kind == Kind.LIVE) return
    val ctx = LocalContext.current
    val year = item.year ?: metadataYear
    var result by remember(item.id, item.title, item.kind, year) { mutableStateOf<TitleRating?>(null) }
    LaunchedEffect(item.id, item.title, item.kind, year, metadataDone, opened) {
        if (year == null && !metadataDone) return@LaunchedEffect
        // Scrolling past titles should not start searches for the entire row.
        delay(if (opened) 150 else if (compact) 550 else 1500)
        val knownYear = kinoLookupYear(ctx, item, year)
        result = TitleRating.lookup(ctx, item, knownYear)
    }
    val data = result
    val score = data?.score
    if (data != null && score != null) {
        val locale = Locale.forLanguageTag(Lang.code())
        val value = String.format(locale, "%.1f", score)
        val votes = (data.filmweb as? FilmwebResult.Rating)?.votes
        val label = if (compact) "${data.source} $value" else buildString {
            append("${data.source}  ★  $value/10")
            if (votes != null) append("  ·  ${Lang.tr("Stimmen")}: ${NumberFormat.getIntegerInstance(locale).format(votes)}")
        }
        Text(raw = true, text = label, color = DS.Gold, fontSize = spx(18), fontWeight = FontWeight.Bold)
    } else if (opened) {
        val status = when {
            data == null -> "Filmweb-Bewertung wird geladen"
            data.filmweb == FilmwebResult.Unavailable -> "Filmweb ist vorübergehend nicht erreichbar"
            data.imdb == ImdbResult.Unavailable -> "IMDb-Wertung derzeit nicht verfügbar"
            item.kind == Kind.MOVIE -> "Keine bestätigte Bewertung bei Filmweb oder IMDb"
            else -> "Filmweb: Keine eindeutige Bewertung"
        }
        Text(status, color = Tok.TextLow, fontSize = spx(16))
    }
}
