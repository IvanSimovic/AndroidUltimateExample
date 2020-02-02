package com.ivan.todoengine.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\'\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/ivan/todoengine/di/CacheModule;", "", "()V", "Companion", "engine_debug"})
@dagger.Module()
public abstract class CacheModule {
    private static final java.lang.String dbName = "main-db";
    public static final com.ivan.todoengine.di.CacheModule.Companion Companion = null;
    
    public CacheModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public static final com.ivan.todoengine.data.base.AppDatabase provideAppDatabase(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public static final com.ivan.todoengine.data.local.activity.ActivityDao providePartyDao(@org.jetbrains.annotations.NotNull()
    com.ivan.todoengine.data.base.AppDatabase appDatabase) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/ivan/todoengine/di/CacheModule$Companion;", "", "()V", "dbName", "", "provideAppDatabase", "Lcom/ivan/todoengine/data/base/AppDatabase;", "context", "Landroid/content/Context;", "providePartyDao", "Lcom/ivan/todoengine/data/local/activity/ActivityDao;", "appDatabase", "engine_debug"})
    @dagger.Module()
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        @dagger.Provides()
        @javax.inject.Singleton()
        public final com.ivan.todoengine.data.base.AppDatabase provideAppDatabase(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @javax.inject.Singleton()
        @dagger.Provides()
        public final com.ivan.todoengine.data.local.activity.ActivityDao providePartyDao(@org.jetbrains.annotations.NotNull()
        com.ivan.todoengine.data.base.AppDatabase appDatabase) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}