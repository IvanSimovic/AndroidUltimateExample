package com.ivan.todoengine.networking.session

import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
abstract class SessionModule {

    @Binds
    @Singleton
    abstract fun provideDefaultSessionRepository(
        sessionRepositoryImpl: SessionRepositoryImpl
    ): SessionRepository
}