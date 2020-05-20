package com.ivan.androidultimateexample.ui.base.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\'\u00a8\u0006\n"}, d2 = {"Lcom/ivan/androidultimateexample/ui/base/di/module/AppModule;", "", "()V", "provideApplication", "Landroid/app/Application;", "app", "Lcom/ivan/androidultimateexample/App;", "provideContext", "Landroid/content/Context;", "application", "app_release"})
@dagger.Module()
public abstract class AppModule {
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Binds()
    public abstract android.app.Application provideApplication(@org.jetbrains.annotations.NotNull()
    com.ivan.androidultimateexample.App app);
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Binds()
    public abstract android.content.Context provideContext(@org.jetbrains.annotations.NotNull()
    android.app.Application application);
    
    public AppModule() {
        super();
    }
}