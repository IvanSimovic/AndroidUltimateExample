package com.ivan.todoengine.di

import com.ivan.todoengine.networking.oauth2.OAuth2Module
import com.ivan.todoengine.networking.session.SessionModule
import dagger.Module

@Module(
    includes = [
        CacheModule::class,
        NetworkModule::class,
        OAuth2Module::class,
        SessionModule::class,
        ApiModule::class
    ]
)
interface EngineModule
