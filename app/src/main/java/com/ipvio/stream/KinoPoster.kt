package com.ipvio.stream

import android.graphics.Bitmap
import android.content.Context
import android.graphics.drawable.BitmapDrawable
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.core.graphics.drawable.toBitmap
import coil.imageLoader
import coil.request.ImageRequest
import coil.request.SuccessResult
import coil.size.Precision
import coil.size.Scale
import kotlinx.coroutines.currentCoroutineContext
import kotlinx.coroutines.delay
import kotlinx.coroutines.ensureActive
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock

internal object KinoPosterArt {
    private val smallTmdb = Regex("""^(https?://image\.tmdb\.org/t/p/)(w92|w154|w185|w342)/(.+)$""", RegexOption.IGNORE_CASE)
    fun sources(url: String?): List<String> {
        if (url.isNullOrBlank()) return emptyList()
        val m = smallTmdb.matchEntire(url) ?: return listOf(url)
        return listOf(m.groupValues[1] + "w500/" + m.groupValues[3], url)
    }

    // Prefer a portrait first, then the image that can fill more of a standard poster.
    fun score(w: Int, h: Int): Int = (if (w < h) 1000 else 0) + minOf(w, h * 2 / 3, 500)
    fun adequate(w: Int, h: Int) = w < h && w >= 340 && h >= 480
}

private val providerLocks = Array(2) { Mutex() }

/** Artwork and year can request the same metadata. Serialize each title and bound concurrent I/O. */
internal suspend fun kinoProviderMeta(ctx: Context, item: Item): Meta? =
    providerLocks[item.id.hashCode() and 1].withLock { MetaRepo.providerMeta(ctx, item) }

/** A portrait for this title, or the best available artwork at its native size or smaller. */
@Composable
internal fun KinoPoster(item: Item, poster: String?, modifier: Modifier = Modifier) {
    val ctx = LocalContext.current
    var best by remember(item.id, item.url, item.logo, poster) { mutableStateOf<Bitmap?>(null) }
    LaunchedEffect(item.id, item.url, item.logo, poster, DemoMode.active) {
        if (DemoMode.active) return@LaunchedEffect
        val tried = mutableSetOf<String>()
        var bestScore = -1
        suspend fun tryArt(url: String?): Boolean {
            for (src in KinoPosterArt.sources(url)) {
                if (!tried.add(src)) continue
                val request = ImageRequest.Builder(ctx).data(src).size(500, 750)
                    .scale(Scale.FIT).precision(Precision.INEXACT).build()
                val result = ctx.imageLoader.execute(request) as? SuccessResult ?: continue
                val bitmap = (result.drawable as? BitmapDrawable)?.bitmap ?: result.drawable.toBitmap()
                val score = KinoPosterArt.score(bitmap.width, bitmap.height)
                if (score > bestScore) { best = bitmap; bestScore = score }
                // The smaller version of this same asset cannot improve a successful download.
                return KinoPosterArt.adequate(bitmap.width, bitmap.height)
            }
            return false
        }
        if (tryArt(poster)) return@LaunchedEffect
        // An M3U series often uses the first episode's still as its logo. Look for the series cover.
        if (item.kind == Kind.MOVIE && tryArt(item.logo)) return@LaunchedEffect
        if (ProviderLogic.supports(item)) {
            delay(250)
            val cover = kinoProviderMeta(ctx, item)?.poster
            currentCoroutineContext().ensureActive()
            if (tryArt(cover)) return@LaunchedEffect
        }
        tryArt(item.logo)
    }
    Box(modifier) {
        val bitmap = best
        if (bitmap != null) Image(bitmap.asImageBitmap(), item.title, Modifier.fillMaxSize(), contentScale = ContentScale.Inside)
        else ArtPlaceholder(item, Modifier.fillMaxSize(), showTitle = false)
    }
}
