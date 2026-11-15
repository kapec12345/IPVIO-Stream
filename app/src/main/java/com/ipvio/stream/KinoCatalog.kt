package com.ipvio.stream

import android.content.Context
import kotlinx.coroutines.currentCoroutineContext
import kotlinx.coroutines.delay
import kotlinx.coroutines.ensureActive
import kotlin.math.roundToInt

/** One consistent set of keys for a sort, its filters and its year choices. */
internal class KinoCatalog(private val titles: Map<String, Facts>) {
    data class Facts(val score: Double?, val year: Int?)
    fun year(i: Item) = titles[i.id]?.year
    fun score(i: Item) = titles[i.id]?.score

    fun ranked(items: List<Item>) = items.filter { score(it) != null }.sortedByDescending { score(it) }

    companion object {
        fun read(store: FilmwebStore, items: List<Item>): KinoCatalog {
            val facts = HashMap<String, Facts>()
            for (i in items) {
                val year = store.localYear(i, MetaRepo.cached(i)?.year?.toIntOrNull())
                val result = store.get(i, year)
                val score = (result as? FilmwebResult.Rating)?.value?.let { (it * 10).roundToInt() / 10.0 }
                val release = year ?: result.releaseYear()
                if (score != null || release != null) facts[i.id] = Facts(score, release)
            }
            return KinoCatalog(facts)
        }
    }
}

internal suspend fun kinoLookupYear(ctx: Context, item: Item, metadataYear: Int?): Int? =
    kotlinx.coroutines.withContext(kotlinx.coroutines.Dispatchers.IO) {
        FilmwebStore.open(ctx).localYear(item, metadataYear)
            ?: if (ProviderLogic.supports(item)) kinoProviderMeta(ctx, item)?.year?.toIntOrNull() else null
    }

/** Only while this sorting/filtering screen is open. Locally known titles need no request. */
internal suspend fun fillKinoCatalog(ctx: Context, items: List<Item>, ratings: Boolean) {
    val store = FilmwebStore.open(ctx)
    for (item in items) {
        currentCoroutineContext().ensureActive()
        var year = store.localYear(item, MetaRepo.cached(item)?.year?.toIntOrNull())
        if ((!ratings && year != null) || store.get(item, year) != null) continue
        delay(1100)
        if (year == null && ProviderLogic.supports(item)) year = kinoProviderMeta(ctx, item)?.year?.toIntOrNull()
        if (!ratings && year != null) {
            store.rememberYear(item, year)
            continue
        }
        while (Filmweb.lookup(ctx, item, year) == FilmwebResult.Unavailable) {
            delay(Filmweb.retryDelay())
        }
    }
}
