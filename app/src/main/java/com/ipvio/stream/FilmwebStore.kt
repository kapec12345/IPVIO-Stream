package com.ipvio.stream

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import kotlinx.coroutines.flow.MutableStateFlow
import org.json.JSONObject
import java.util.concurrent.ConcurrentHashMap

/** Shared by posters, details and catalog sorting. Only public title metadata is stored. */
internal class FilmwebStore private constructor(ctx: Context) {
    private class Database(ctx: Context) : SQLiteOpenHelper(ctx, "filmweb.db", null, 1) {
        override fun onCreate(db: SQLiteDatabase) {
            db.execSQL("CREATE TABLE ratings (k TEXT PRIMARY KEY, payload TEXT NOT NULL, expires INTEGER NOT NULL)")
            db.execSQL("CREATE TABLE years (item TEXT PRIMARY KEY, year INTEGER NOT NULL)")
            // Import positive and negative entries produced by the previous preview.
            for ((key, raw) in ctx.getSharedPreferences("ipvio_filmweb", Context.MODE_PRIVATE).all) {
                val entry = (raw as? String)?.let { runCatching { JSONObject(it) }.getOrNull() } ?: continue
                if (!entry.has("year") && key.split('|', limit = 3).getOrNull(1) == "0") continue
                insert(db, key, entry)
            }
        }
        private val ctx = ctx.applicationContext
        override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) = Unit
    }

    private data class Entry(val result: FilmwebResult, val expires: Long)
    private val db = Database(ctx.applicationContext).writableDatabase
    private val entries = ConcurrentHashMap<String, Entry>()
    private val savedYear = MetaRepo.savedProviderYears(ctx)
    private val years = ConcurrentHashMap<String, Int>()

    init {
        db.delete("ratings", "expires <= ?", arrayOf(System.currentTimeMillis().toString()))
        db.rawQuery("SELECT k,payload,expires FROM ratings", null).use { c ->
            while (c.moveToNext()) {
                val raw = JSONObject(c.getString(1))
                val result = decode(raw) ?: continue
                entries[c.getString(0)] = Entry(result, c.getLong(2))
            }
        }
        db.rawQuery("SELECT item,year FROM years", null).use { c ->
            while (c.moveToNext()) years[c.getString(0)] = c.getInt(1)
        }
    }

    private fun itemKey(i: Item) = i.id + "|" + i.filmwebName
    fun localYear(i: Item, metadataYear: Int?): Int? =
        i.year ?: metadataYear ?: years[itemKey(i)] ?: savedYear(i)

    @Synchronized fun rememberYear(i: Item, year: Int) {
        if (i.year != null) return
        val key = itemKey(i)
        if (years[key] != year) {
            db.execSQL("INSERT OR REPLACE INTO years VALUES(?,?)", arrayOf<Any>(key, year))
            years[key] = year
            revision.value++
        }
    }

    fun get(i: Item, year: Int?): FilmwebResult? {
        val entry = entries[key(i, year)] ?: return null
        return entry.result.takeIf { System.currentTimeMillis() < entry.expires }
    }

    @Synchronized fun put(i: Item, year: Int?, raw: JSONObject, result: FilmwebResult) {
        val k = key(i, year)
        if (result == FilmwebResult.Missing) raw.put("matchVersion", MATCH_VERSION)
        insert(db, k, raw)
        val old = entries.put(k, Entry(result, expires(raw)))
        if (result != old?.result && (result is FilmwebResult.Rating || result is FilmwebResult.Unrated || old != null)) revision.value++
    }

    companion object {
        @Volatile private var instance: FilmwebStore? = null
        val revision = MutableStateFlow(0)
        fun open(ctx: Context): FilmwebStore = instance ?: synchronized(this) {
            instance ?: FilmwebStore(ctx.applicationContext).also { instance = it }
        }
        private fun key(i: Item, year: Int?) = (if (i.kind == Kind.SERIES) "serial" else "film") + "|" + (year ?: 0) + "|" + i.filmwebName
        private fun expires(raw: JSONObject) = raw.optLong("at") + (if (raw.optLong("count") > 0) 7L else 1L) * 86_400_000L
        private fun insert(db: SQLiteDatabase, key: String, entry: JSONObject) {
            db.execSQL("INSERT OR REPLACE INTO ratings VALUES(?,?,?)", arrayOf<Any>(key, entry.toString(), expires(entry)))
        }
        private const val MATCH_VERSION = 2

        internal fun decode(raw: JSONObject): FilmwebResult? {
            val result = Filmweb.rating(raw, raw.optInt("id"), raw.optInt("year").takeIf { it > 0 })
            // A miss cached by the strict-year matcher must not hide a newly valid title.
            return result.takeUnless { it == FilmwebResult.Missing && raw.optInt("matchVersion") < MATCH_VERSION }
        }
    }
}

internal fun FilmwebResult?.releaseYear(): Int? = when (this) {
    is FilmwebResult.Rating -> year
    is FilmwebResult.Unrated -> year
    else -> null
}
