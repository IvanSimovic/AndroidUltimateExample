package com.ivan.androidultimateexample.ui.base.di.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u001c\u0010\u0007\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\n0\bH\'\u00a8\u0006\u000b"}, d2 = {"Lcom/ivan/androidultimateexample/ui/base/di/viewmodel/ViewModelFactoryModule;", "", "()V", "bindViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factory", "Lcom/ivan/androidultimateexample/ui/base/di/viewmodel/ViewModelFactory;", "bindViewModelProviders", "", "Ljava/lang/Class;", "Landroidx/lifecycle/ViewModel;", "app_debug"})
@dagger.Module()
public abstract class ViewModelFactoryModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModelProvider.Factory bindViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.ivan.androidultimateexample.ui.base.di.viewmodel.ViewModelFactory factory);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.multibindings.Multibinds()
    public abstract java.util.Map<java.lang.Class<? extends androidx.lifecycle.ViewModel>, androidx.lifecycle.ViewModel> bindViewModelProviders();
    
    public ViewModelFactoryModule() {
        super();
    }
}