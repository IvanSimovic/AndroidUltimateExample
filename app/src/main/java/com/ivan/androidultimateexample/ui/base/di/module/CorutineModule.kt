package com.ivan.androidultimateexample.ui.base.di.module

import android.content.Context
import androidx.room.Room
import com.ivan.androidultimateexample.App
import com.ivan.todoengine.data.base.AppDatabase
import dagger.Module
import dagger.Provides
import kotlinx.coroutines.CoroutineScope
import javax.inject.Singleton

@Module
abstract class CoroutineModule {
    @Module
    companion object {
        @Singleton
        @Provides
        @JvmStatic
        fun provideAppScope(app: App): CoroutineScope {
            return app.appScope
        }
    }
}