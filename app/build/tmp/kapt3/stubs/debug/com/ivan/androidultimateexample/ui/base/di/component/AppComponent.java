package com.ivan.androidultimateexample.ui.base.di.component;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/ivan/androidultimateexample/ui/base/di/component/AppComponent;", "Ldagger/android/AndroidInjector;", "Lcom/ivan/androidultimateexample/App;", "Builder", "app_debug"})
@javax.inject.Singleton()
@dagger.Component(modules = {dagger.android.support.AndroidSupportInjectionModule.class, com.ivan.androidultimateexample.ui.base.di.module.AppModule.class, com.ivan.androidultimateexample.ui.base.di.module.ActivityBuilder.class, com.ivan.androidultimateexample.ui.base.di.viewmodel.ViewModelFactoryModule.class, com.ivan.todoengine.di.ToDoEngineModule.class})
public abstract interface AppComponent extends dagger.android.AndroidInjector<com.ivan.androidultimateexample.App> {
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/ivan/androidultimateexample/ui/base/di/component/AppComponent$Builder;", "Ldagger/android/AndroidInjector$Builder;", "Lcom/ivan/androidultimateexample/App;", "()V", "app_debug"})
    @dagger.Component.Builder()
    public static abstract class Builder extends dagger.android.AndroidInjector.Builder<com.ivan.androidultimateexample.App> {
        
        public Builder() {
            super();
        }
    }
}