package com.ivan.androidultimateexample.ui.base.di.component

import com.ivan.androidultimateexample.App
import com.ivan.androidultimateexample.ui.base.di.module.ActivityBuilder
import com.ivan.androidultimateexample.ui.base.di.module.AppModule
import com.ivan.androidultimateexample.ui.base.di.viewmodel.ViewModelFactoryModule
import com.ivan.todoengine.di.EngineModule
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Component(
    modules = [
        // Android
        AndroidSupportInjectionModule::class,

        // Application
        AppModule::class,
        ActivityBuilder::class,
        ViewModelFactoryModule::class,

        EngineModule::class
    ]
)
@Singleton
interface AppComponent : AndroidInjector<App> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<App>()
}
