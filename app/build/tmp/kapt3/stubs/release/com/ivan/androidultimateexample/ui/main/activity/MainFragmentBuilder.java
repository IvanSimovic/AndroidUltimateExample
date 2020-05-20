package com.ivan.androidultimateexample.ui.main.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\'J\b\u0010\u0005\u001a\u00020\u0006H\'J\b\u0010\u0007\u001a\u00020\bH\'J\b\u0010\t\u001a\u00020\nH\'J\b\u0010\u000b\u001a\u00020\fH\'J\b\u0010\r\u001a\u00020\u000eH\'\u00a8\u0006\u000f"}, d2 = {"Lcom/ivan/androidultimateexample/ui/main/activity/MainFragmentBuilder;", "", "()V", "provideActivitiesFragment", "Lcom/ivan/androidultimateexample/ui/main/activities/ActivitiesFragment;", "provideActivityCreateFragment", "Lcom/ivan/androidultimateexample/ui/main/activities/ActivityCreateFragment;", "provideActivityDetailsFragment", "Lcom/ivan/androidultimateexample/ui/main/activities/ActivityDetailsFragment;", "provideActivityEditFragment", "Lcom/ivan/androidultimateexample/ui/main/activities/ActivityEditFragment;", "provideLoginFragment", "Lcom/ivan/androidultimateexample/ui/main/login/LoginFragment;", "provideSettingsFragment", "Lcom/ivan/androidultimateexample/ui/main/settings/SettingsFragment;", "app_release"})
@dagger.Module()
public abstract class MainFragmentBuilder {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {com.ivan.androidultimateexample.ui.main.activities.ActivitiesModule.class})
    @com.ivan.androidultimateexample.ui.base.di.FragmentScope()
    public abstract com.ivan.androidultimateexample.ui.main.activities.ActivitiesFragment provideActivitiesFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {com.ivan.androidultimateexample.ui.main.activities.ActivityDetailsModule.class})
    @com.ivan.androidultimateexample.ui.base.di.FragmentScope()
    public abstract com.ivan.androidultimateexample.ui.main.activities.ActivityDetailsFragment provideActivityDetailsFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {com.ivan.androidultimateexample.ui.main.activities.ActivityEditModule.class})
    @com.ivan.androidultimateexample.ui.base.di.FragmentScope()
    public abstract com.ivan.androidultimateexample.ui.main.activities.ActivityEditFragment provideActivityEditFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {com.ivan.androidultimateexample.ui.main.activities.ActivityCreateModule.class})
    @com.ivan.androidultimateexample.ui.base.di.FragmentScope()
    public abstract com.ivan.androidultimateexample.ui.main.activities.ActivityCreateFragment provideActivityCreateFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {com.ivan.androidultimateexample.ui.main.settings.SettingsModule.class})
    @com.ivan.androidultimateexample.ui.base.di.FragmentScope()
    public abstract com.ivan.androidultimateexample.ui.main.settings.SettingsFragment provideSettingsFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {com.ivan.androidultimateexample.ui.main.login.LoginModule.class})
    @com.ivan.androidultimateexample.ui.base.di.FragmentScope()
    public abstract com.ivan.androidultimateexample.ui.main.login.LoginFragment provideLoginFragment();
    
    public MainFragmentBuilder() {
        super();
    }
}