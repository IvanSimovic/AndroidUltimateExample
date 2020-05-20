package com.ivan.androidultimateexample.ui.main.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\r"}, d2 = {"Lcom/ivan/androidultimateexample/ui/main/activities/ActivitiesViewModel;", "Lcom/ivan/androidultimateexample/ui/base/viewmodel/BaseViewModel;", "activityLogic", "Lcom/ivan/todoengine/logic/activity/ActivityLogic;", "(Lcom/ivan/todoengine/logic/activity/ActivityLogic;)V", "tasks", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/ivan/todoengine/logic/activity/Activity;", "getTasks", "()Landroidx/lifecycle/MutableLiveData;", "getActivities", "", "app_release"})
public final class ActivitiesViewModel extends com.ivan.androidultimateexample.ui.base.viewmodel.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.ivan.todoengine.logic.activity.Activity>> tasks = null;
    private final com.ivan.todoengine.logic.activity.ActivityLogic activityLogic = null;
    
    @androidx.lifecycle.OnLifecycleEvent(value = androidx.lifecycle.Lifecycle.Event.ON_RESUME)
    public final void getActivities() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.ivan.todoengine.logic.activity.Activity>> getTasks() {
        return null;
    }
    
    @javax.inject.Inject()
    public ActivitiesViewModel(@org.jetbrains.annotations.NotNull()
    com.ivan.todoengine.logic.activity.ActivityLogic activityLogic) {
        super();
    }
}