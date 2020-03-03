package com.ivan.todoengine.di

import com.ivan.todoengine.data.api.ActivityApi
import com.ivan.todoengine.networking.di.IApiFactory
import com.ivan.todoengine.networking.oauth2.OAuth2TokenApi
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

        @Provides
        @Singleton
        @JvmStatic
        fun provideAuthApi(apiFactory: IApiFactory): OAuth2TokenApi = apiFactory.buildApi(OAuth2TokenApi::class.java)
    }
}
