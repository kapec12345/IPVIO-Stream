package com.ipvio.stream

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.onVisibilityChanged
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import kotlinx.coroutines.delay
import java.util.Locale

@Composable
internal fun BoxScope.KinoPosterInfo(item: Item, metadataYear: String?, inset: Modifier = Modifier) {
    if (!Look.vod || item.kind == Kind.LIVE) return
    val ctx = LocalContext.current
    val localYear = item.year ?: metadataYear?.toIntOrNull()
    var visible by remember { mutableStateOf(false) }
    var year by remember(item.id, item.title, localYear) { mutableStateOf(localYear) }
    var rating by remember(item.id, item.title, localYear) { mutableStateOf<TitleRating?>(null) }
    LaunchedEffect(item.id, item.title, item.kind, localYear, visible, DemoMode.active) {
        if (!visible || DemoMode.active) return@LaunchedEffect
        delay(550)
        val knownYear = kinoLookupYear(ctx, item, localYear)
        year = knownYear
        val result = TitleRating.lookup(ctx, item, knownYear)
        rating = result.takeIf { it.score != null }
        if (knownYear == null) year = result.filmweb.releaseYear()
    }
    Box(Modifier.matchParentSize().onVisibilityChanged(minFractionVisible = 0.18f) { visible = it }
        .then(inset).padding(dpx(8)), contentAlignment = Alignment.TopEnd) {
        if (year != null || rating != null) {
            Column(Modifier.background(Color(0xEC10151C), RoundedCornerShape(dpx(6)))
                .padding(horizontal = dpx(7), vertical = dpx(4)), horizontalAlignment = Alignment.End) {
                rating?.let {
                    val score = String.format(Locale.forLanguageTag(Lang.code()), "%.1f", it.score)
                    Text(raw = true, text = "${it.source} $score", color = DS.Gold, fontSize = spx(16),
                        fontWeight = FontWeight.Bold, maxLines = 1)
                }
                year?.let {
                    Text(raw = true, text = it.toString(), color = Color.White, fontSize = spx(15),
                        fontWeight = FontWeight.SemiBold, maxLines = 1)
                }
            }
        }
    }
}
