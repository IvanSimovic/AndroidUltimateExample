package com.ivan.todoengine.di

import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager
import androidx.room.Room
import com.ivan.todoengine.data.base.AppDatabase
import com.ivan.todoengine.data.local.activity.ActivityDao
import com.ivan.todoengine.data.store.SharedPreferencesStore
import com.ivan.todoengine.data.store.SimpleKeyValueStore
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
abstract class CacheModule {
    @Module
    companion object {
        private const val dbName: String = "main-db"
        @Singleton
        @Provides
        @JvmStatic
        fun provideAppDatabase(context: Context): AppDatabase {
            return Room.databaseBuilder(context, AppDatabase::class.java, dbName).build()
        }

        @Provides
        @Singleton
        @JvmStatic
        fun provideActivitiesDao(appDatabase: AppDatabase): ActivityDao = appDatabase.activityDao()

        @Singleton
        @Provides
        @JvmStatic
        fun provideSharedPreferences(context: Context): SharedPreferences = PreferenceManager.getDefaultSharedPreferences(context)
    }

    @Singleton
    @Binds
    abstract fun provideSharedPreferencesStore(sharedPreferencesStore: SharedPreferencesStore): SimpleKeyValueStore
}
