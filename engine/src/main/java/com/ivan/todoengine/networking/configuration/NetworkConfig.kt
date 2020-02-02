package com.ivan.todoengine.networking.configuration

import com.ivan.todoengine.BuildConfig
import retrofit2.Response
import javax.inject.Inject
import javax.inject.Singleton

interface NetworkConfig{
    val baseUrl: String
    val connectTimeoutInMs: Long
    val readTimeoutInMs: Long
    val writeTimeoutInMs: Long
}

@Singleton
class DefaultNetworkConfig
@Inject constructor() : NetworkConfig {
    override val baseUrl: String = BuildConfig.BASE_URL
    override val connectTimeoutInMs: Long = DEFAULT_TIMEOUT_MS
    override val readTimeoutInMs: Long = DEFAULT_TIMEOUT_MS
    override val writeTimeoutInMs: Long = DEFAULT_TIMEOUT_MS

    companion object {
        private const val DEFAULT_TIMEOUT_MS = 10000L
    }
}
