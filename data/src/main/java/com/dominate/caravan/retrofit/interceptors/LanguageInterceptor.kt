package com.dominate.caravan.retrofit.interceptors

import com.dominate.caravan.utils.Prefs
import okhttp3.Interceptor
import okhttp3.Response
import javax.inject.Inject

class LanguageInterceptor @Inject constructor(
    private val prefs: Prefs
) : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response =
        chain.proceed(
            chain.request().newBuilder()
                .addHeader(
                    "lang",
                    prefs.language ?: "en"
                ).build()
        )

}