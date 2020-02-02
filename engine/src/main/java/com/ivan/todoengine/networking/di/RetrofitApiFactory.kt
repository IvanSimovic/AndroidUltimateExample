package com.ivan.todoengine.networking.di

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.ivan.todoengine.networking.configuration.NetworkConfig
import com.ivan.todoengine.networking.converters.Converters
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class RetrofitApiFactory
constructor(
    private val okHttpClient: OkHttpClient,
    private val networkConfig: NetworkConfig
) : IApiFactory {

    /**
     * Should produce implementation of [T] using Retrofit2
     * This requires that it has Retrofit2 annotations
     */
    override fun <T> buildApi(type: Class<T>): T {
        val dateConverters: Gson = Converters.registerAll(GsonBuilder()).create()
        val retrofit = Retrofit.Builder()
            .baseUrl(networkConfig.baseUrl)
            .addConverterFactory(GsonConverterFactory.create(dateConverters))
            .client(okHttpClient)
            .build()

        return retrofit.create(type)
    }
}
