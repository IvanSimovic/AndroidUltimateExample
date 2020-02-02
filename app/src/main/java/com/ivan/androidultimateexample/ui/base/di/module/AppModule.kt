package com.ivan.androidultimateexample.ui.base.di.module

import android.app.Application
import android.content.Context
import com.ivan.androidultimateexample.App
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
abstract class AppModule {

    @Binds
    @Singleton
    abstract fun provideApplication(app: App): Application

    @Binds
    @Singleton
    abstract fun provideContext(application: Application): Context
}
