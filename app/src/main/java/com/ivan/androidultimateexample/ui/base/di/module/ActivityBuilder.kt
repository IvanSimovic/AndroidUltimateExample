package com.ivan.androidultimateexample.ui.base.di.module

import com.ivan.androidultimateexample.ui.base.di.ActivityScope
import com.ivan.androidultimateexample.ui.main.activity.MainActivity
import com.ivan.androidultimateexample.ui.main.activity.MainFragmentBuilder
import com.ivan.androidultimateexample.ui.main.activity.MainModule
import com.ivan.androidultimateexample.ui.splash.SplashActivity
import com.ivan.androidultimateexample.ui.splash.SplashModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Activities and their components should be provided in this file
 */
@Module
abstract class ActivityBuilder {

    @ActivityScope
    @ContributesAndroidInjector(modules = [SplashModule::class])
    abstract fun provideSplashActivity(): SplashActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [MainModule::class, MainFragmentBuilder::class])
    abstract fun provideMainActivity(): MainActivity
}
