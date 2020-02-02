package com.ivan.todoengine.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\'\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\r\u0012\t\u0012\u00070\u0005\u00a2\u0006\u0002\b\u00060\u0004H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\'J\u0012\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\fH\'\u00a8\u0006\u000f"}, d2 = {"Lcom/ivan/todoengine/di/NetworkModule;", "", "()V", "bindEmptyUnauthenticatedInterceptors", "", "Lokhttp3/Interceptor;", "Lkotlin/jvm/JvmSuppressWildcards;", "provideDefaultNetworkConfig", "Lcom/ivan/todoengine/networking/configuration/NetworkConfig;", "defaultNetworkConfig", "Lcom/ivan/todoengine/networking/configuration/DefaultNetworkConfig;", "provideDefaultRetrofitApiFactory", "Lcom/ivan/todoengine/networking/di/IApiFactory;", "apiFactory", "Companion", "engine_debug"})
@dagger.Module()
public abstract class NetworkModule {
    public static final com.ivan.todoengine.di.NetworkModule.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @Authenticated(isAuthenticated = false)
    @dagger.multibindings.Multibinds()
    public abstract java.util.Set<okhttp3.Interceptor> bindEmptyUnauthenticatedInterceptors();
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Binds()
    public abstract com.ivan.todoengine.networking.di.IApiFactory provideDefaultRetrofitApiFactory(@org.jetbrains.annotations.NotNull()
    @Authenticated(isAuthenticated = true)
    com.ivan.todoengine.networking.di.IApiFactory apiFactory);
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Binds()
    public abstract com.ivan.todoengine.networking.configuration.NetworkConfig provideDefaultNetworkConfig(@org.jetbrains.annotations.NotNull()
    com.ivan.todoengine.networking.configuration.DefaultNetworkConfig defaultNetworkConfig);
    
    public NetworkModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @Authenticated(isAuthenticated = true)
    @javax.inject.Singleton()
    @dagger.Provides()
    public static final com.ivan.todoengine.networking.di.IApiFactory provideAuthenticatedRetrofitApiFactory(@org.jetbrains.annotations.NotNull()
    com.ivan.todoengine.networking.configuration.NetworkConfig networkConfig) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @Authenticated(isAuthenticated = false)
    @javax.inject.Singleton()
    @dagger.Provides()
    public static final com.ivan.todoengine.networking.di.IApiFactory provideUnauthenticatedRetrofitApiFactory(@org.jetbrains.annotations.NotNull()
    com.ivan.todoengine.networking.configuration.NetworkConfig networkConfig) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\b"}, d2 = {"Lcom/ivan/todoengine/di/NetworkModule$Companion;", "", "()V", "provideAuthenticatedRetrofitApiFactory", "Lcom/ivan/todoengine/networking/di/IApiFactory;", "networkConfig", "Lcom/ivan/todoengine/networking/configuration/NetworkConfig;", "provideUnauthenticatedRetrofitApiFactory", "engine_debug"})
    @dagger.Module()
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        @Authenticated(isAuthenticated = true)
        @javax.inject.Singleton()
        @dagger.Provides()
        public final com.ivan.todoengine.networking.di.IApiFactory provideAuthenticatedRetrofitApiFactory(@org.jetbrains.annotations.NotNull()
        com.ivan.todoengine.networking.configuration.NetworkConfig networkConfig) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @Authenticated(isAuthenticated = false)
        @javax.inject.Singleton()
        @dagger.Provides()
        public final com.ivan.todoengine.networking.di.IApiFactory provideUnauthenticatedRetrofitApiFactory(@org.jetbrains.annotations.NotNull()
        com.ivan.todoengine.networking.configuration.NetworkConfig networkConfig) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}