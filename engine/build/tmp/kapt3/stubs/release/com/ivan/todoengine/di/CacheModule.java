package com.ivan.todoengine.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\tH\'\u00a8\u0006\u000b"}, d2 = {"Lcom/ivan/todoengine/di/CacheModule;", "", "()V", "provideSecuredPreferencesStore", "Lcom/ivan/todoengine/data/store/SecureKeyValueStore;", "sharedPreferencesStore", "Lcom/ivan/todoengine/data/store/SecureSharedPreferencesStore;", "provideSharedPreferencesStore", "Lcom/ivan/todoengine/data/store/SimpleKeyValueStore;", "Lcom/ivan/todoengine/data/store/SharedPreferencesStore;", "Companion", "engine_release"})
@dagger.Module()
public abstract class CacheModule {
    private static final java.lang.String dbName = "main-db";
    public static final com.ivan.todoengine.di.CacheModule.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    @javax.inject.Singleton()
    public abstract com.ivan.todoengine.data.store.SimpleKeyValueStore provideSharedPreferencesStore(@org.jetbrains.annotations.NotNull()
    com.ivan.todoengine.data.store.SharedPreferencesStore sharedPreferencesStore);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    @javax.inject.Singleton()
    public abstract com.ivan.todoengine.data.store.SecureKeyValueStore provideSecuredPreferencesStore(@org.jetbrains.annotations.NotNull()
    com.ivan.todoengine.data.store.SecureSharedPreferencesStore sharedPreferencesStore);
    
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
    public static final com.ivan.todoengine.data.local.activity.ActivityDao provideActivitiesDao(@org.jetbrains.annotations.NotNull()
    com.ivan.todoengine.data.base.AppDatabase appDatabase) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public static final android.content.SharedPreferences provideSharedPreferences(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/ivan/todoengine/di/CacheModule$Companion;", "", "()V", "dbName", "", "provideActivitiesDao", "Lcom/ivan/todoengine/data/local/activity/ActivityDao;", "appDatabase", "Lcom/ivan/todoengine/data/base/AppDatabase;", "provideAppDatabase", "context", "Landroid/content/Context;", "provideSharedPreferences", "Landroid/content/SharedPreferences;", "engine_release"})
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
        public final com.ivan.todoengine.data.local.activity.ActivityDao provideActivitiesDao(@org.jetbrains.annotations.NotNull()
        com.ivan.todoengine.data.base.AppDatabase appDatabase) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @dagger.Provides()
        @javax.inject.Singleton()
        public final android.content.SharedPreferences provideSharedPreferences(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}