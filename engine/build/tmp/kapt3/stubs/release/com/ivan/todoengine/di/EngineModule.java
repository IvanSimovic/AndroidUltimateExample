package com.ivan.todoengine.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"}, d2 = {"Lcom/ivan/todoengine/di/EngineModule;", "", "engine_release"})
@dagger.Module(includes = {com.ivan.todoengine.di.CacheModule.class, com.ivan.todoengine.di.NetworkModule.class, com.ivan.todoengine.networking.oauth2.OAuth2Module.class, com.ivan.todoengine.networking.session.SessionModule.class, com.ivan.todoengine.di.ApiModule.class})
public abstract interface EngineModule {
}