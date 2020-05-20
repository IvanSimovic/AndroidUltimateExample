package com.ivan.todoengine.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\'\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/ivan/todoengine/di/ApiModule;", "", "()V", "Companion", "engine_release"})
@dagger.Module()
public abstract class ApiModule {
    public static final com.ivan.todoengine.di.ApiModule.Companion Companion = null;
    
    public ApiModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public static final com.ivan.todoengine.data.api.ActivityApi provideActivityApi(@org.jetbrains.annotations.NotNull()
    com.ivan.todoengine.networking.di.IApiFactory apiFactory) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public static final com.ivan.todoengine.networking.oauth2.OAuth2TokenApi provideAuthApi(@org.jetbrains.annotations.NotNull()
    com.ivan.todoengine.networking.di.IApiFactory apiFactory) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\t"}, d2 = {"Lcom/ivan/todoengine/di/ApiModule$Companion;", "", "()V", "provideActivityApi", "Lcom/ivan/todoengine/data/api/ActivityApi;", "apiFactory", "Lcom/ivan/todoengine/networking/di/IApiFactory;", "provideAuthApi", "Lcom/ivan/todoengine/networking/oauth2/OAuth2TokenApi;", "engine_release"})
    @dagger.Module()
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        @javax.inject.Singleton()
        @dagger.Provides()
        public final com.ivan.todoengine.data.api.ActivityApi provideActivityApi(@org.jetbrains.annotations.NotNull()
        com.ivan.todoengine.networking.di.IApiFactory apiFactory) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @javax.inject.Singleton()
        @dagger.Provides()
        public final com.ivan.todoengine.networking.oauth2.OAuth2TokenApi provideAuthApi(@org.jetbrains.annotations.NotNull()
        com.ivan.todoengine.networking.di.IApiFactory apiFactory) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}