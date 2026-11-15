package com.ipvio.stream

import kotlinx.coroutines.suspendCancellableCoroutine
import okhttp3.Call
import okhttp3.Callback
import okhttp3.HttpUrl
import okhttp3.Request
import okhttp3.Response
import org.json.JSONObject
import java.io.IOException
import java.util.concurrent.TimeUnit

internal object RatingHttp {
    private val client = Net.base.newBuilder().callTimeout(8, TimeUnit.SECONDS).build()

    suspend fun json(url: HttpUrl, onRateLimit: (Long) -> Unit): JSONObject? {
        val req = Request.Builder().url(url).header("Accept", "application/json")
            .header("User-Agent", "IPVIO-Stream/${BuildConfig.VERSION_NAME} (Android TV)").build()
        return suspendCancellableCoroutine { cont ->
            val call = client.newCall(req)
            cont.invokeOnCancellation { call.cancel() }
            call.enqueue(object : Callback {
                override fun onFailure(call: Call, e: IOException) { cont.resumeWith(Result.failure(e)) }
                override fun onResponse(call: Call, response: Response) {
                    cont.resumeWith(runCatching {
                        response.use { r ->
                            if (r.code == 404) return@use null
                            if (r.code == 429) {
                                val seconds = r.header("Retry-After")?.toLongOrNull()?.coerceIn(60, 86400) ?: 600
                                onRateLimit(System.currentTimeMillis() + seconds * 1000)
                            }
                            if (!r.isSuccessful) throw IOException("Ratings HTTP ${r.code}")
                            val source = r.body?.source() ?: throw IOException("Missing ratings response")
                            if (source.request(512 * 1024L)) throw IOException("Oversized ratings response")
                            JSONObject(source.readUtf8())
                        }
                    })
                }
            })
        }
    }
}
