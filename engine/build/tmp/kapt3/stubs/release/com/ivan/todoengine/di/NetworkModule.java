package com.ivan.todoengine.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\'\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\r\u0012\t\u0012\u00070\u0005\u00a2\u0006\u0002\b\u00060\u0004H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\'J\u0012\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\fH\'J\u0012\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0010\u001a\u00020\u000fH\'\u00a8\u0006\u0012"}, d2 = {"Lcom/ivan/todoengine/di/NetworkModule;", "", "()V", "bindEmptyUnauthenticatedInterceptors", "", "Lokhttp3/Interceptor;", "Lkotlin/jvm/JvmSuppressWildcards;", "provideDefaultNetworkConfig", "Lcom/ivan/todoengine/networking/configuration/NetworkConfig;", "defaultNetworkConfig", "Lcom/ivan/todoengine/networking/configuration/DefaultNetworkConfig;", "provideDefaultOkHttpClient", "Lokhttp3/OkHttpClient;", "okHttpClient", "provideDefaultRetrofitApiFactory", "Lcom/ivan/todoengine/networking/di/IApiFactory;", "apiFactory", "Companion", "engine_release"})
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
    public abstract okhttp3.OkHttpClient provideDefaultOkHttpClient(@org.jetbrains.annotations.NotNull()
    @Authenticated(isAuthenticated = true)
    okhttp3.OkHttpClient okHttpClient);
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Binds()
    public abstract com.ivan.todoengine.networking.configuration.NetworkConfig provideDefaultNetworkConfig(@org.jetbrains.annotations.NotNull()
    com.ivan.todoengine.networking.configuration.DefaultNetworkConfig defaultNetworkConfig);
    
    public NetworkModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @Authenticated(isAuthenticated = false)
    @javax.inject.Singleton()
    @dagger.Provides()
    public static final okhttp3.Authenticator provideAuthenticator() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public static final okhttp3.Dispatcher provideDispatcher() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.multibindings.IntoSet()
    @javax.inject.Singleton()
    @dagger.Provides()
    public static final okhttp3.Interceptor provideLoggingInterceptor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @Authenticated(isAuthenticated = false)
    @javax.inject.Singleton()
    @dagger.Provides()
    public static final okhttp3.OkHttpClient provideUnAuthenticatedOkHttpClient(@org.jetbrains.annotations.NotNull()
    com.ivan.todoengine.networking.configuration.NetworkConfig networkConfig, @org.jetbrains.annotations.NotNull()
    @Authenticated(isAuthenticated = false)
    okhttp3.Authenticator authenticator, @org.jetbrains.annotations.NotNull()
    okhttp3.Dispatcher dispatcher, @org.jetbrains.annotations.NotNull()
    @Authenticated(isAuthenticated = false)
    java.util.Set<okhttp3.Interceptor> unauthenticatedInterceptors, @org.jetbrains.annotations.NotNull()
    java.util.Set<okhttp3.Interceptor> interceptors) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @Authenticated(isAuthenticated = true)
    @javax.inject.Singleton()
    @dagger.Provides()
    public static final okhttp3.OkHttpClient provideAuthenticatedOkHttpClient(@org.jetbrains.annotations.NotNull()
    com.ivan.todoengine.networking.configuration.NetworkConfig networkConfig, @org.jetbrains.annotations.NotNull()
    @Authenticated(isAuthenticated = true)
    okhttp3.Authenticator authenticator, @org.jetbrains.annotations.NotNull()
    okhttp3.Dispatcher dispatcher, @org.jetbrains.annotations.NotNull()
    @Authenticated(isAuthenticated = true)
    java.util.Set<okhttp3.Interceptor> authenticatedInterceptors, @org.jetbrains.annotations.NotNull()
    java.util.Set<okhttp3.Interceptor> interceptors) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @Authenticated(isAuthenticated = true)
    @javax.inject.Singleton()
    @dagger.Provides()
    public static final com.ivan.todoengine.networking.di.IApiFactory provideAuthenticatedRetrofitApiFactory(@org.jetbrains.annotations.NotNull()
    @Authenticated(isAuthenticated = true)
    okhttp3.OkHttpClient okHttpClient, @org.jetbrains.annotations.NotNull()
    com.ivan.todoengine.networking.configuration.NetworkConfig networkConfig) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @Authenticated(isAuthenticated = false)
    @javax.inject.Singleton()
    @dagger.Provides()
    public static final com.ivan.todoengine.networking.di.IApiFactory provideUnauthenticatedRetrofitApiFactory(@org.jetbrains.annotations.NotNull()
    @Authenticated(isAuthenticated = false)
    okhttp3.OkHttpClient okHttpClient, @org.jetbrains.annotations.NotNull()
    com.ivan.todoengine.networking.configuration.NetworkConfig networkConfig) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J3\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0011\u0010\u000b\u001a\r\u0012\t\u0012\u00070\r\u00a2\u0006\u0002\b\u000e0\fH\u0002JJ\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0013\b\u0001\u0010\u0010\u001a\r\u0012\t\u0012\u00070\r\u00a2\u0006\u0002\b\u000e0\f2\u0011\u0010\u000b\u001a\r\u0012\t\u0012\u00070\r\u00a2\u0006\u0002\b\u000e0\fH\u0007J\u001a\u0010\u0011\u001a\u00020\u00122\b\b\u0001\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0014\u001a\u00020\bH\u0007J\b\u0010\u0015\u001a\u00020\nH\u0007J\b\u0010\u0016\u001a\u00020\rH\u0007JJ\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0013\b\u0001\u0010\u0018\u001a\r\u0012\t\u0012\u00070\r\u00a2\u0006\u0002\b\u000e0\f2\u0011\u0010\u000b\u001a\r\u0012\t\u0012\u00070\r\u00a2\u0006\u0002\b\u000e0\fH\u0007J\u001a\u0010\u0019\u001a\u00020\u00122\b\b\u0001\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u001a"}, d2 = {"Lcom/ivan/todoengine/di/NetworkModule$Companion;", "", "()V", "createOkHttpClient", "Lokhttp3/OkHttpClient;", "networkConfig", "Lcom/ivan/todoengine/networking/configuration/NetworkConfig;", "authenticator", "Lokhttp3/Authenticator;", "dispatcher", "Lokhttp3/Dispatcher;", "interceptors", "", "Lokhttp3/Interceptor;", "Lkotlin/jvm/JvmSuppressWildcards;", "provideAuthenticatedOkHttpClient", "authenticatedInterceptors", "provideAuthenticatedRetrofitApiFactory", "Lcom/ivan/todoengine/networking/di/IApiFactory;", "okHttpClient", "provideAuthenticator", "provideDispatcher", "provideLoggingInterceptor", "provideUnAuthenticatedOkHttpClient", "unauthenticatedInterceptors", "provideUnauthenticatedRetrofitApiFactory", "engine_release"})
    @dagger.Module()
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        @Authenticated(isAuthenticated = false)
        @javax.inject.Singleton()
        @dagger.Provides()
        public final okhttp3.Authenticator provideAuthenticator() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @javax.inject.Singleton()
        @dagger.Provides()
        public final okhttp3.Dispatcher provideDispatcher() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @dagger.multibindings.IntoSet()
        @javax.inject.Singleton()
        @dagger.Provides()
        public final okhttp3.Interceptor provideLoggingInterceptor() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @Authenticated(isAuthenticated = false)
        @javax.inject.Singleton()
        @dagger.Provides()
        public final okhttp3.OkHttpClient provideUnAuthenticatedOkHttpClient(@org.jetbrains.annotations.NotNull()
        com.ivan.todoengine.networking.configuration.NetworkConfig networkConfig, @org.jetbrains.annotations.NotNull()
        @Authenticated(isAuthenticated = false)
        okhttp3.Authenticator authenticator, @org.jetbrains.annotations.NotNull()
        okhttp3.Dispatcher dispatcher, @org.jetbrains.annotations.NotNull()
        @Authenticated(isAuthenticated = false)
        java.util.Set<okhttp3.Interceptor> unauthenticatedInterceptors, @org.jetbrains.annotations.NotNull()
        java.util.Set<okhttp3.Interceptor> interceptors) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @Authenticated(isAuthenticated = true)
        @javax.inject.Singleton()
        @dagger.Provides()
        public final okhttp3.OkHttpClient provideAuthenticatedOkHttpClient(@org.jetbrains.annotations.NotNull()
        com.ivan.todoengine.networking.configuration.NetworkConfig networkConfig, @org.jetbrains.annotations.NotNull()
        @Authenticated(isAuthenticated = true)
        okhttp3.Authenticator authenticator, @org.jetbrains.annotations.NotNull()
        okhttp3.Dispatcher dispatcher, @org.jetbrains.annotations.NotNull()
        @Authenticated(isAuthenticated = true)
        java.util.Set<okhttp3.Interceptor> authenticatedInterceptors, @org.jetbrains.annotations.NotNull()
        java.util.Set<okhttp3.Interceptor> interceptors) {
            return null;
        }
        
        private final okhttp3.OkHttpClient createOkHttpClient(com.ivan.todoengine.networking.configuration.NetworkConfig networkConfig, okhttp3.Authenticator authenticator, okhttp3.Dispatcher dispatcher, java.util.Set<okhttp3.Interceptor> interceptors) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @Authenticated(isAuthenticated = true)
        @javax.inject.Singleton()
        @dagger.Provides()
        public final com.ivan.todoengine.networking.di.IApiFactory provideAuthenticatedRetrofitApiFactory(@org.jetbrains.annotations.NotNull()
        @Authenticated(isAuthenticated = true)
        okhttp3.OkHttpClient okHttpClient, @org.jetbrains.annotations.NotNull()
        com.ivan.todoengine.networking.configuration.NetworkConfig networkConfig) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @Authenticated(isAuthenticated = false)
        @javax.inject.Singleton()
        @dagger.Provides()
        public final com.ivan.todoengine.networking.di.IApiFactory provideUnauthenticatedRetrofitApiFactory(@org.jetbrains.annotations.NotNull()
        @Authenticated(isAuthenticated = false)
        okhttp3.OkHttpClient okHttpClient, @org.jetbrains.annotations.NotNull()
        com.ivan.todoengine.networking.configuration.NetworkConfig networkConfig) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}