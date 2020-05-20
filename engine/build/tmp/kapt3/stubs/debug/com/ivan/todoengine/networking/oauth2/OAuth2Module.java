package com.ivan.todoengine.networking.oauth2;

import java.lang.System;

/**
 * @author Ensar Sarajčić <ensar.sarajcic@klika.ba>.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\'J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\'\u00a8\u0006\u000f"}, d2 = {"Lcom/ivan/todoengine/networking/oauth2/OAuth2Module;", "", "()V", "provideDefaultOAuth2TokenApi", "Lcom/ivan/todoengine/networking/oauth2/OAuth2TokenApi;", "oAuth2TokenApi", "provideOAuth2Authenticator", "Lokhttp3/Authenticator;", "oAuth2Authenticator", "Lcom/ivan/todoengine/networking/oauth2/OAuth2Authenticator;", "provideOAuth2Interceptor", "Lokhttp3/Interceptor;", "oAuth2Interceptor", "Lcom/ivan/todoengine/networking/oauth2/OAuth2Interceptor;", "Companion", "engine_debug"})
@dagger.Module()
public abstract class OAuth2Module {
    public static final com.ivan.todoengine.networking.oauth2.OAuth2Module.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @com.ivan.todoengine.di.Authenticated(isAuthenticated = true)
    @dagger.multibindings.IntoSet()
    @javax.inject.Singleton()
    @dagger.Binds()
    public abstract okhttp3.Interceptor provideOAuth2Interceptor(@org.jetbrains.annotations.NotNull()
    com.ivan.todoengine.networking.oauth2.OAuth2Interceptor oAuth2Interceptor);
    
    @org.jetbrains.annotations.NotNull()
    @com.ivan.todoengine.di.Authenticated(isAuthenticated = true)
    @javax.inject.Singleton()
    @dagger.Binds()
    public abstract okhttp3.Authenticator provideOAuth2Authenticator(@org.jetbrains.annotations.NotNull()
    com.ivan.todoengine.networking.oauth2.OAuth2Authenticator oAuth2Authenticator);
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Binds()
    public abstract com.ivan.todoengine.networking.oauth2.OAuth2TokenApi provideDefaultOAuth2TokenApi(@org.jetbrains.annotations.NotNull()
    @com.ivan.todoengine.di.Authenticated(isAuthenticated = false)
    com.ivan.todoengine.networking.oauth2.OAuth2TokenApi oAuth2TokenApi);
    
    public OAuth2Module() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.ivan.todoengine.di.Authenticated(isAuthenticated = true)
    @javax.inject.Singleton()
    @dagger.Provides()
    public static final com.ivan.todoengine.networking.oauth2.OAuth2TokenApi provideAuthenticatedOAuth2TokenApi(@org.jetbrains.annotations.NotNull()
    @com.ivan.todoengine.di.Authenticated(isAuthenticated = true)
    com.ivan.todoengine.networking.di.IApiFactory apiFactory) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.ivan.todoengine.di.Authenticated(isAuthenticated = false)
    @javax.inject.Singleton()
    @dagger.Provides()
    public static final com.ivan.todoengine.networking.oauth2.OAuth2TokenApi provideUnauthenticatedOAuth2TokenApi(@org.jetbrains.annotations.NotNull()
    @com.ivan.todoengine.di.Authenticated(isAuthenticated = false)
    com.ivan.todoengine.networking.di.IApiFactory apiFactory) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\b"}, d2 = {"Lcom/ivan/todoengine/networking/oauth2/OAuth2Module$Companion;", "", "()V", "provideAuthenticatedOAuth2TokenApi", "Lcom/ivan/todoengine/networking/oauth2/OAuth2TokenApi;", "apiFactory", "Lcom/ivan/todoengine/networking/di/IApiFactory;", "provideUnauthenticatedOAuth2TokenApi", "engine_debug"})
    @dagger.Module()
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        @com.ivan.todoengine.di.Authenticated(isAuthenticated = true)
        @javax.inject.Singleton()
        @dagger.Provides()
        public final com.ivan.todoengine.networking.oauth2.OAuth2TokenApi provideAuthenticatedOAuth2TokenApi(@org.jetbrains.annotations.NotNull()
        @com.ivan.todoengine.di.Authenticated(isAuthenticated = true)
        com.ivan.todoengine.networking.di.IApiFactory apiFactory) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @com.ivan.todoengine.di.Authenticated(isAuthenticated = false)
        @javax.inject.Singleton()
        @dagger.Provides()
        public final com.ivan.todoengine.networking.oauth2.OAuth2TokenApi provideUnauthenticatedOAuth2TokenApi(@org.jetbrains.annotations.NotNull()
        @com.ivan.todoengine.di.Authenticated(isAuthenticated = false)
        com.ivan.todoengine.networking.di.IApiFactory apiFactory) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}