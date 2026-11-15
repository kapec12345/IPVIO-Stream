package com.ipvio.stream

import org.json.JSONArray
import org.json.JSONObject

/** Only profile-scoped appearance settings belong in a saved look. */
internal data class Appearance(
    val vod: Boolean, val accent: Int, val primary: Int, val highlight: Int,
    val background: Int, val motion: Int, val scale: Int
) {
    fun json() = JSONObject().put("vod", vod).put("accent", accent).put("primary", primary)
        .put("highlight", highlight).put("background", background).put("motion", motion).put("scale", scale)

    companion object {
        fun current() = Appearance(Look.vod, Look.accentIdx, Look.custom, Look.custom2, Look.bgIdx, Look.motion, Look.uiScale)
        fun read(o: JSONObject) = Appearance(o.getBoolean("vod"), o.getInt("accent"), o.getInt("primary"),
            o.getInt("highlight"), o.getInt("background"), o.getInt("motion"), o.getInt("scale"))
    }
}

internal data class NamedStyle(val name: String, val appearance: Appearance)

internal data class SavedStyles(val entries: List<NamedStyle> = emptyList(), val chosen: String? = null) {
    val selected: NamedStyle? get() = entries.find { it.name == chosen }

    /** An existing name can be edited only when explicitly supplied as the editing target. */
    fun save(name: String, appearance: Appearance, editing: String? = null): SavedStyles? {
        val clean = name.trim()
        if (clean.isEmpty() || clean.length > NAME_LENGTH || clean.any { it.isISOControl() }) return null
        if (entries.any { it.name != editing && it.name.equals(clean, ignoreCase = true) }) return null
        val item = NamedStyle(clean, appearance)
        if (editing == null) return SavedStyles(entries + item, clean)
        if (entries.none { it.name == editing }) return null
        return SavedStyles(entries.map { if (it.name == editing) item else it }, clean)
    }

    fun remove(name: String) = SavedStyles(entries.filterNot { it.name == name }, chosen?.takeUnless { it == name })

    fun encode(): String {
        val items = JSONArray()
        entries.forEach { items.put(it.appearance.json().put("name", it.name)) }
        return JSONObject().put("items", items).put("chosen", chosen ?: JSONObject.NULL).toString()
    }

    companion object {
        const val NAME_LENGTH = 40
        fun decode(text: String?): SavedStyles {
            if (text.isNullOrBlank()) return SavedStyles()
            val root = runCatching { JSONObject(text) }.getOrNull() ?: return SavedStyles()
            val array = root.optJSONArray("items") ?: return SavedStyles()
            var library = SavedStyles()
            for (i in 0 until array.length()) {
                val item = array.optJSONObject(i) ?: continue
                val appearance = runCatching { Appearance.read(item) }.getOrNull() ?: continue
                library = library.save(item.optString("name"), appearance) ?: library
            }
            val selected = if (root.isNull("chosen")) null else root.optString("chosen")
            return library.copy(chosen = library.entries.find { it.name == selected }?.name)
        }
    }
}
