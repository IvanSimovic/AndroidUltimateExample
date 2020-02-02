package com.ivan.todoengine.di

import com.ivan.todoengine.data.api.ActivityApi
import com.ivan.todoengine.networking.di.IApiFactory
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
abstract class ApiModule {
    @Module
    companion object {

        @Provides
        @Singleton
        @JvmStatic
        fun provideActivityApi(apiFactory: IApiFactory): ActivityApi = apiFactory.buildApi(ActivityApi::class.java)
    }
}
