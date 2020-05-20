package com.ivan.androidultimateexample.ui.main.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0013B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u000fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0014"}, d2 = {"Lcom/ivan/androidultimateexample/ui/main/activities/ActivityEditViewModel;", "Lcom/ivan/androidultimateexample/ui/base/viewmodel/BaseViewModel;", "activityLogic", "Lcom/ivan/todoengine/logic/activity/ActivityLogic;", "(Lcom/ivan/todoengine/logic/activity/ActivityLogic;)V", "activity", "Landroidx/lifecycle/MutableLiveData;", "Lcom/ivan/todoengine/logic/activity/Activity;", "getActivity", "()Landroidx/lifecycle/MutableLiveData;", "navigationEvent", "Lcom/ivan/androidultimateexample/ui/util/SingleLiveEvent;", "Lcom/ivan/androidultimateexample/ui/main/activities/ActivityEditViewModel$NavigationEvent;", "getNavigationEvent", "()Lcom/ivan/androidultimateexample/ui/util/SingleLiveEvent;", "", "activityId", "", "updateActivity", "NavigationEvent", "app_debug"})
public final class ActivityEditViewModel extends com.ivan.androidultimateexample.ui.base.viewmodel.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.ivan.todoengine.logic.activity.Activity> activity = null;
    @org.jetbrains.annotations.NotNull()
    private final com.ivan.androidultimateexample.ui.util.SingleLiveEvent<com.ivan.androidultimateexample.ui.main.activities.ActivityEditViewModel.NavigationEvent> navigationEvent = null;
    private final com.ivan.todoengine.logic.activity.ActivityLogic activityLogic = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.ivan.todoengine.logic.activity.Activity> getActivity() {
        return null;
    }
    
    public final void getActivity(@org.jetbrains.annotations.NotNull()
    java.lang.String activityId) {
    }
    
    public final void updateActivity() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ivan.androidultimateexample.ui.util.SingleLiveEvent<com.ivan.androidultimateexample.ui.main.activities.ActivityEditViewModel.NavigationEvent> getNavigationEvent() {
        return null;
    }
    
    @javax.inject.Inject()
    public ActivityEditViewModel(@org.jetbrains.annotations.NotNull()
    com.ivan.todoengine.logic.activity.ActivityLogic activityLogic) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/ivan/androidultimateexample/ui/main/activities/ActivityEditViewModel$NavigationEvent;", "", "(Ljava/lang/String;I)V", "BACK", "app_debug"})
    public static enum NavigationEvent {
        /*public static final*/ BACK /* = new BACK() */;
        
        NavigationEvent() {
        }
    }
}