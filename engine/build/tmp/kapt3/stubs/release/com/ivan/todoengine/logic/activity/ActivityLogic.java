package com.ivan.todoengine.logic.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0019\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/ivan/todoengine/logic/activity/ActivityLogic;", "", "activityRepository", "Lcom/ivan/todoengine/data/repository/activity/ActivityRepository;", "(Lcom/ivan/todoengine/data/repository/activity/ActivityRepository;)V", "deleteActivity", "", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getActivities", "", "Lcom/ivan/todoengine/logic/activity/Activity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getActivity", "insertActivity", "activity", "(Lcom/ivan/todoengine/logic/activity/Activity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateActivity", "engine_release"})
@javax.inject.Singleton()
public final class ActivityLogic {
    private final com.ivan.todoengine.data.repository.activity.ActivityRepository activityRepository = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertActivity(@org.jetbrains.annotations.NotNull()
    com.ivan.todoengine.logic.activity.Activity activity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateActivity(@org.jetbrains.annotations.NotNull()
    com.ivan.todoengine.logic.activity.Activity activity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteActivity(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getActivities(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.ivan.todoengine.logic.activity.Activity>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getActivity(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.ivan.todoengine.logic.activity.Activity> p1) {
        return null;
    }
    
    @javax.inject.Inject()
    public ActivityLogic(@org.jetbrains.annotations.NotNull()
    com.ivan.todoengine.data.repository.activity.ActivityRepository activityRepository) {
        super();
    }
}