package com.ipvio.stream

import android.content.Context
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import kotlinx.coroutines.withContext
import okhttp3.HttpUrl.Companion.toHttpUrl
import org.json.JSONArray
import org.json.JSONException
import org.json.JSONObject
import java.io.IOException

internal sealed interface ImdbResult {
    data class Rating(val value: Double) : ImdbResult
    object Missing : ImdbResult
    object Unavailable : ImdbResult
}

internal data class TitleRating(val filmweb: FilmwebResult, val imdb: ImdbResult? = null) {
    val score: Double? get() = (filmweb as? FilmwebResult.Rating)?.value ?: (imdb as? ImdbResult.Rating)?.value
    val source: String get() = if (filmweb is FilmwebResult.Rating) "Filmweb" else "IMDb"

    companion object {
        suspend fun resolve(kind: Kind, filmweb: FilmwebResult, fallback: suspend () -> ImdbResult): TitleRating {
            val missing = filmweb == FilmwebResult.Missing || filmweb is FilmwebResult.Unrated
            return TitleRating(filmweb, if (kind == Kind.MOVIE && missing) fallback() else null)
        }

        suspend fun lookup(ctx: Context, item: Item, year: Int?): TitleRating {
            val filmweb = Filmweb.lookup(ctx, item, year)
            return resolve(item.kind, filmweb) { MovieImdb.lookup(ctx, item, year ?: filmweb.releaseYear()) }
        }
    }
}

/** Cinemeta exposes the explicitly named IMDb rating for a title ID. Lookup is on demand, never during Filmweb ranking. */
internal object MovieImdb {
    private val base = "https://v3-cinemeta.strem.io/".toHttpUrl()
    private val lock = Mutex()
    @Volatile private var nextAttempt = 0L
    private val imdbId = Regex("""tt[0-9]{7,12}""")
    private val providerSuffix = Regex("""\s+(?:lektor(?:\s+pl)?|dubbing(?:\s+pl)?|lq)$""", RegexOption.IGNORE_CASE)
    private val day = 86_400_000L

    fun validId(id: String?) = id?.takeIf(imdbId::matches)
    fun score(raw: String?): Double? = raw?.trim()?.replace(',', '.')?.toDoubleOrNull()?.takeIf { it in 1.0..10.0 }
    private fun cleanTitle(title: String) = MatchLogic.searchTitle(title).replace(providerSuffix, "").trim()
    private fun safeTitle(title: String) = title.length in 1..200 && "://" !in title && '/' !in title && '?' !in title && '@' !in title
    private fun movieMatch(o: JSONObject, year: Int?) = o.optString("type") == "movie" &&
        (year == null || o.optString("releaseInfo").toIntOrNull() == year)

    internal fun candidate(hits: JSONArray, title: String, year: Int?): String? {
        val ids = mutableSetOf<String>()
        for (idx in 0 until hits.length()) {
            val o = hits.optJSONObject(idx) ?: continue
            if (movieMatch(o, year) && MatchLogic.sameTitle(title, o.optString("name"))) validId(o.optString("id"))?.let(ids::add)
        }
        return ids.singleOrNull()
    }

    internal fun rating(meta: JSONObject?, id: String, year: Int?): ImdbResult {
        if (meta == null || validId(id) == null || meta.optString("id") != id || !movieMatch(meta, year)) return ImdbResult.Missing
        return score(meta.optString("imdbRating"))?.let(ImdbResult::Rating) ?: ImdbResult.Missing
    }

    private suspend fun json(vararg path: String): JSONObject? {
        val url = base.newBuilder().apply { path.forEach { addPathSegment(it) } }.build()
        return RatingHttp.json(url) { nextAttempt = it }
    }

    suspend fun lookup(ctx: Context, item: Item, year: Int?): ImdbResult = withContext(Dispatchers.IO) {
        val title = cleanTitle(item.title)
        if (item.kind != Kind.MOVIE || !safeTitle(title)) return@withContext ImdbResult.Missing
        val meta = MetaRepo.cached(item) ?: if (ProviderLogic.supports(item)) kinoProviderMeta(ctx, item) else null
        val metaYear = meta?.year?.toIntOrNull()
        val knownYear = year ?: metaYear
        val sameYear = year == null || metaYear == null || metaYear == year
        val matched = meta?.takeIf { !it.isTv && sameYear }
        score(matched?.imdbRating)?.let { return@withContext ImdbResult.Rating(it) }
        val idHint = validId(matched?.imdbId)
        val titles = listOfNotNull(title, matched?.originalTitle?.let(::cleanTitle)?.takeIf(::safeTitle)).distinct()
        val key = listOf(idHint.orEmpty(), knownYear ?: 0, titles.joinToString("|") { MatchLogic.norm(it) }).joinToString("|")
        val prefs = ctx.getSharedPreferences("ipvio_movie_imdb", Context.MODE_PRIVATE)
        lock.withLock {
            val now = System.currentTimeMillis()
            val cached = prefs.getString(key, null)?.split('|', limit = 2)
            if (cached?.size == 2 && (cached[0].toLongOrNull() ?: 0L) > now) {
                return@withLock score(cached[1])?.let(ImdbResult::Rating) ?: ImdbResult.Missing
            }
            if (now < nextAttempt) return@withLock ImdbResult.Unavailable
            try {
                var id = idHint
                for (name in titles) {
                    if (id != null) break
                    val data = json("catalog", "movie", "top", "search=$name.json") ?: continue
                    id = candidate(data.getJSONArray("metas"), name, knownYear)
                }
                val value = if (id == null) ImdbResult.Missing else rating(json("meta", "movie", "$id.json")?.optJSONObject("meta"), id, knownYear)
                val found = value as? ImdbResult.Rating
                val expires = now + if (found == null) day else 7 * day
                val edit = prefs.edit()
                val entries = prefs.all
                if (entries.size >= 256 && key !in entries) {
                    entries.minByOrNull { (it.value as? String)?.substringBefore('|')?.toLongOrNull() ?: 0L }?.let { edit.remove(it.key) }
                }
                edit.putString(key, "$expires|${found?.value ?: ""}").apply()
                value
            } catch (_: IOException) {
                nextAttempt = maxOf(nextAttempt, now + 15_000)
                ImdbResult.Unavailable
            } catch (_: JSONException) {
                ImdbResult.Unavailable
            }
        }
    }
}
