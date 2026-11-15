package com.ipvio.stream

import android.content.Context
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import kotlinx.coroutines.withContext
import okhttp3.HttpUrl.Companion.toHttpUrl
import org.json.JSONObject
import java.io.IOException

internal sealed interface FilmwebResult {
    data class Rating(val id: Int, val value: Double, val votes: Long, val year: Int? = null) : FilmwebResult
    data class Unrated(val year: Int) : FilmwebResult
    object Missing : FilmwebResult
    object Unavailable : FilmwebResult
}

internal object Filmweb {
    data class Title(val id: Int, val year: Int?)
    private const val LIMIT = 6
    private val base = "https://www.filmweb.pl/api/v1/".toHttpUrl()
    private val lock = Mutex()
    @Volatile private var nextAttempt = 0L

    fun retryDelay() = maxOf(60_000L, nextAttempt - System.currentTimeMillis())

    internal fun candidates(data: JSONObject, title: String, type: String): List<Int> {
        val hits = data.getJSONArray("searchHits")
        val exact = linkedSetOf<Int>()
        for (i in 0 until hits.length()) {
            val hit = hits.optJSONObject(i) ?: continue
            if (hit.optString("type") == type && MatchLogic.sameTitle(title, hit.optString("matchedTitle"))) {
                hit.optInt("id").takeIf { it > 0 }?.let(exact::add)
            }
        }
        return exact.toList()
    }

    internal suspend fun match(ids: List<Int>, type: String, year: Int?, preview: suspend (Int) -> JSONObject?): Title? {
        if (ids.isEmpty() || ids.size > LIMIT || (year == null && ids.size != 1)) return null
        val matches = ids.mapNotNull { id ->
            val info = preview(id) ?: return@mapNotNull null
            val release = info.optInt("year").takeIf { it in 1880..2199 }
            if (info.optInt("id") == id && info.optString("entityName") == type && (year == null || release == year))
                Title(id, release) else null
        }
        return matches.singleOrNull()
    }

    internal fun rating(data: JSONObject?, id: Int, year: Int? = null): FilmwebResult {
        if (id <= 0 || data == null || data.optInt("id") != id) return FilmwebResult.Missing
        val value = data.optDouble("rate")
        val votes = data.optLong("count")
        return when {
            value in 1.0..10.0 && votes > 0 -> FilmwebResult.Rating(id, value, votes, year)
            year != null -> FilmwebResult.Unrated(year)
            else -> FilmwebResult.Missing
        }
    }

    private suspend fun json(path: String, query: String? = null): JSONObject? {
        val url = base.newBuilder().addPathSegments(path).apply {
            if (query != null) addQueryParameter("query", query)
        }.build()
        return RatingHttp.json(url) { nextAttempt = it }
    }

    suspend fun lookup(ctx: Context, item: Item, metadataYear: Int?): FilmwebResult = withContext(Dispatchers.IO) {
        val query = MatchLogic.searchTitle(item.title)
        if (item.kind == Kind.LIVE || query.isBlank() || query.length > 200 || "://" in query) return@withContext FilmwebResult.Missing
        val store = FilmwebStore.open(ctx)
        val year = store.localYear(item, metadataYear)
        if (metadataYear != null) store.rememberYear(item, metadataYear)
        val type = if (item.kind == Kind.SERIES) "serial" else "film"
        store.get(item, year)?.let { return@withContext it }
        lock.withLock {
            store.get(item, year)?.let { return@withLock it }
            val now = System.currentTimeMillis()
            if (now < nextAttempt) return@withLock FilmwebResult.Unavailable
            try {
                val hits = json("live/search", query) ?: return@withLock FilmwebResult.Unavailable
                val titleMatch = match(candidates(hits, query, type), type, year) { json("film/$it/preview") }
                val result = if (titleMatch == null) FilmwebResult.Missing else {
                    val data = json("film/${titleMatch.id}/rating")
                    if (data == null && titleMatch.year != null) FilmwebResult.Unrated(titleMatch.year)
                    else rating(data, titleMatch.id, titleMatch.year)
                }
                val entry = JSONObject().put("at", now)
                    .put("year", when (result) {
                        is FilmwebResult.Rating -> result.year ?: 0
                        is FilmwebResult.Unrated -> result.year
                        else -> 0
                    })
                if (result is FilmwebResult.Unrated) entry.put("id", titleMatch?.id)
                if (result is FilmwebResult.Rating) entry.put("id", result.id).put("rate", result.value).put("count", result.votes)
                store.put(item, year, entry, result)
                result
            } catch (_: IOException) {
                nextAttempt = maxOf(nextAttempt, now + 15_000)
                FilmwebResult.Unavailable
            } catch (_: org.json.JSONException) {
                FilmwebResult.Unavailable
            }
        }
    }
}
