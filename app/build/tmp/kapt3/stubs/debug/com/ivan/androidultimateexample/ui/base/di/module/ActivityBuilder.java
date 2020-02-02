package com.ivan.androidultimateexample.ui.base.di.module;

import java.lang.System;

/**
 * Activities and their components should be provided in this file
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\'J\b\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/ivan/androidultimateexample/ui/base/di/module/ActivityBuilder;", "", "()V", "provideMainActivity", "Lcom/ivan/androidultimateexample/ui/main/activity/MainActivity;", "provideSplashActivity", "Lcom/ivan/androidultimateexample/ui/splash/SplashActivity;", "app_debug"})
@dagger.Module()
public abstract class ActivityBuilder {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {com.ivan.androidultimateexample.ui.splash.SplashModule.class})
    @com.ivan.androidultimateexample.ui.base.di.ActivityScope()
    public abstract com.ivan.androidultimateexample.ui.splash.SplashActivity provideSplashActivity();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {com.ivan.androidultimateexample.ui.main.activity.MainModule.class, com.ivan.androidultimateexample.ui.main.activity.MainFragmentBuilder.class})
    @com.ivan.androidultimateexample.ui.base.di.ActivityScope()
    public abstract com.ivan.androidultimateexample.ui.main.activity.MainActivity provideMainActivity();
    
    public ActivityBuilder() {
        super();
    }
}