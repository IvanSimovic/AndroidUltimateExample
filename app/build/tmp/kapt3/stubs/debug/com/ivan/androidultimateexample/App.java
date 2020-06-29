package com.ivan.androidultimateexample;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00000\rH\u0014J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u001a\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0010"}, d2 = {"Lcom/ivan/androidultimateexample/App;", "Ldagger/android/DaggerApplication;", "()V", "activityDispatchingAndroidInjector", "Ldagger/android/DispatchingAndroidInjector;", "Landroid/app/Activity;", "appScope", "Lkotlinx/coroutines/CoroutineScope;", "getAppScope", "()Lkotlinx/coroutines/CoroutineScope;", "appScope$delegate", "Lkotlin/Lazy;", "applicationInjector", "Ldagger/android/AndroidInjector;", "onCreate", "", "app_debug"})
public final class App extends dagger.android.DaggerApplication {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy appScope$delegate = null;
    @org.jetbrains.annotations.Nullable()
    @javax.inject.Inject()
    public dagger.android.DispatchingAndroidInjector<android.app.Activity> activityDispatchingAndroidInjector;
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.CoroutineScope getAppScope() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected dagger.android.AndroidInjector<com.ivan.androidultimateexample.App> applicationInjector() {
        return null;
    }
    
    public App() {
        super();
    }
}