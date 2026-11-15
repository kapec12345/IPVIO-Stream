package com.ipvio.stream

import android.os.SystemClock
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.produceState
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import kotlinx.coroutines.withContext
import java.text.DateFormat
import java.util.Date

private data class ExpiryResult(val date: Long?, val failed: Boolean, val refreshAt: Long)

private object ExpiryCache {
    private val lock = Mutex()
    private var account: XtreamLogic.Acct? = null
    private var last: ExpiryResult? = null

    suspend fun read(active: XtreamLogic.Acct): ExpiryResult = withContext(Dispatchers.IO) {
        lock.withLock {
            last?.takeIf { active == account && SystemClock.elapsedRealtime() < it.refreshAt }?.let { return@withLock it }
            val result = try {
                val date = PlaylistStore.xtreamApi().accountExpiryMillis(active)
                ExpiryResult(date, false, SystemClock.elapsedRealtime() + 3_600_000L)
            } catch (e: CancellationException) {
                throw e
            } catch (_: Exception) {
                ExpiryResult(null, true, SystemClock.elapsedRealtime() + 300_000L)
            }
            account = active
            last = result
            result
        }
    }
}

@Composable
internal fun AccountExpiryFooter(source: String, modifier: Modifier) {
    val account = remember(source) { XtreamLogic.fromUrl(source) }
    val result by produceState<ExpiryResult?>(null, account) {
        if (account != null) while (true) {
            val next = ExpiryCache.read(account)
            value = next
            delay((next.refreshAt - SystemClock.elapsedRealtime()).coerceAtLeast(1000L))
        }
    }
    val current = result
    val date = current?.date
    val value = when {
        date != null -> {
            val locale = Lang.locale()
            val zone = General.zone()
            remember(date, locale, zone.id) {
                DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT, locale)
                    .apply { timeZone = zone }.format(Date(date))
            }
        }
        current?.failed == true -> Lang.tr("Gültigkeitsdatum nicht verfügbar")
        account != null && current == null -> Lang.tr("Gültigkeitsdatum wird geladen")
        else -> Lang.tr("Gültigkeitsdatum nicht angegeben")
    }
    Row(modifier.background(Bg).padding(horizontal = RowPadX), verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(dpx(14))) {
        Text("Ablaufdatum des IPTV-Kontos", color = Tok.TextMid, fontSize = spx(20))
        Text(value, raw = true, color = Tok.TextHi, fontSize = spx(20), fontWeight = FontWeight.SemiBold, maxLines = 1)
    }
}
