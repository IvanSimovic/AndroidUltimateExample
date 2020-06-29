package com.ivan.androidultimateexample.ui.main.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0011\u001a\u00020\u000eJ\u000e\u0010\n\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0015"}, d2 = {"Lcom/ivan/androidultimateexample/ui/main/activities/ActivityDetailsViewModel;", "Lcom/ivan/androidultimateexample/ui/base/viewmodel/BaseViewModel;", "activityLogic", "Lcom/ivan/todoengine/logic/activity/ActivityLogic;", "appScope", "Lkotlinx/coroutines/CoroutineScope;", "(Lcom/ivan/todoengine/logic/activity/ActivityLogic;Lkotlinx/coroutines/CoroutineScope;)V", "activity", "Landroidx/lifecycle/MutableLiveData;", "Lcom/ivan/todoengine/logic/activity/Activity;", "getActivity", "()Landroidx/lifecycle/MutableLiveData;", "navigationEvent", "Lcom/ivan/androidultimateexample/ui/util/SingleLiveEvent;", "", "getNavigationEvent", "()Lcom/ivan/androidultimateexample/ui/util/SingleLiveEvent;", "deleteActivity", "Lkotlinx/coroutines/Job;", "taskId", "", "app_debug"})
public final class ActivityDetailsViewModel extends com.ivan.androidultimateexample.ui.base.viewmodel.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.ivan.todoengine.logic.activity.Activity> activity = null;
    @org.jetbrains.annotations.NotNull()
    private final com.ivan.androidultimateexample.ui.util.SingleLiveEvent<kotlin.Unit> navigationEvent = null;
    private final com.ivan.todoengine.logic.activity.ActivityLogic activityLogic = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.ivan.todoengine.logic.activity.Activity> getActivity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ivan.androidultimateexample.ui.util.SingleLiveEvent<kotlin.Unit> getNavigationEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getActivity(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId) {
        return null;
    }
    
    public final void deleteActivity() {
    }
    
    @javax.inject.Inject()
    public ActivityDetailsViewModel(@org.jetbrains.annotations.NotNull()
    com.ivan.todoengine.logic.activity.ActivityLogic activityLogic, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope appScope) {
        super(null);
    }
}