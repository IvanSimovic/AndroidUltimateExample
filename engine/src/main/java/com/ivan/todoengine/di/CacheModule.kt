package com.ivan.todoengine.di

import android.content.Context
import androidx.room.Room
import com.ivan.todoengine.data.base.AppDatabase
import com.ivan.todoengine.data.local.activity.ActivityDao
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
        fun providePartyDao(appDatabase: AppDatabase): ActivityDao = appDatabase.activityDao()
    }
}
