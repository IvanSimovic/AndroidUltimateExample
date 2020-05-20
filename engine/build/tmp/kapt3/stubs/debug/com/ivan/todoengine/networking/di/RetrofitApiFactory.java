package com.ivan.todoengine.networking.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J!\u0010\u0007\u001a\u0002H\b\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\nH\u0016\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/ivan/todoengine/networking/di/RetrofitApiFactory;", "Lcom/ivan/todoengine/networking/di/IApiFactory;", "okHttpClient", "Lokhttp3/OkHttpClient;", "networkConfig", "Lcom/ivan/todoengine/networking/configuration/NetworkConfig;", "(Lokhttp3/OkHttpClient;Lcom/ivan/todoengine/networking/configuration/NetworkConfig;)V", "buildApi", "T", "type", "Ljava/lang/Class;", "(Ljava/lang/Class;)Ljava/lang/Object;", "engine_debug"})
public final class RetrofitApiFactory implements com.ivan.todoengine.networking.di.IApiFactory {
    private final okhttp3.OkHttpClient okHttpClient = null;
    private final com.ivan.todoengine.networking.configuration.NetworkConfig networkConfig = null;
    
    /**
     * Should produce implementation of [T] using Retrofit2
     * This requires that it has Retrofit2 annotations
     */
    @java.lang.Override()
    public <T extends java.lang.Object>T buildApi(@org.jetbrains.annotations.NotNull()
    java.lang.Class<T> type) {
        return null;
    }
    
    public RetrofitApiFactory(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient, @org.jetbrains.annotations.NotNull()
    com.ivan.todoengine.networking.configuration.NetworkConfig networkConfig) {
        super();
    }
}