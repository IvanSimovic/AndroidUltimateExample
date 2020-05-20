package com.ivan.todoengine.data.repository.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u0019\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lcom/ivan/todoengine/data/repository/activity/ActivityRepository;", "", "activityDao", "Lcom/ivan/todoengine/data/local/activity/ActivityDao;", "activityApi", "Lcom/ivan/todoengine/data/api/ActivityApi;", "(Lcom/ivan/todoengine/data/local/activity/ActivityDao;Lcom/ivan/todoengine/data/api/ActivityApi;)V", "deleteActivity", "", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getActivities", "", "Lcom/ivan/todoengine/logic/activity/Activity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getActivity", "insertActivity", "task", "(Lcom/ivan/todoengine/logic/activity/Activity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateActivity", "engine_debug"})
@javax.inject.Singleton()
public final class ActivityRepository {
    private final com.ivan.todoengine.data.local.activity.ActivityDao activityDao = null;
    private final com.ivan.todoengine.data.api.ActivityApi activityApi = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertActivity(@org.jetbrains.annotations.NotNull()
    com.ivan.todoengine.logic.activity.Activity task, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateActivity(@org.jetbrains.annotations.NotNull()
    com.ivan.todoengine.logic.activity.Activity task, @org.jetbrains.annotations.NotNull()
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
    public ActivityRepository(@org.jetbrains.annotations.NotNull()
    com.ivan.todoengine.data.local.activity.ActivityDao activityDao, @org.jetbrains.annotations.NotNull()
    com.ivan.todoengine.data.api.ActivityApi activityApi) {
        super();
    }
}