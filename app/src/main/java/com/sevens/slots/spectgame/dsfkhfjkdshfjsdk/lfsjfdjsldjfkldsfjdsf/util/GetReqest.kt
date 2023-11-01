package com.sevens.slots.spectgame.dsfkhfjkdshfjsdk.lfsjfdjsldjfkldsfjdsf.util

import okhttp3.OkHttpClient
import okhttp3.Request
import java.io.IOException


object GetReqest {
    private val client = OkHttpClient()
    suspend  fun makeGetRequest(url: String):  String {
        val request = Request.Builder()
            .url(url)
            .build()

        client.newCall(request).execute().use { response ->
            if (!response.isSuccessful) throw IOException("Unexpected code $response")
            return response.body?.string()?:""
        }
    }

}