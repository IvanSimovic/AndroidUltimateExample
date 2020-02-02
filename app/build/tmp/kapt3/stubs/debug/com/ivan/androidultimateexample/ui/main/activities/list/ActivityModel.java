package com.ivan.androidultimateexample.ui.main.activities.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0017B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b8F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\f8F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u000eR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001a\u00020\f8F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u000e\u00a8\u0006\u0018"}, d2 = {"Lcom/ivan/androidultimateexample/ui/main/activities/list/ActivityModel;", "", "data", "Lcom/ivan/todoengine/logic/task/Activity;", "rowClickListener", "Lcom/ivan/androidultimateexample/ui/main/activities/list/ActivityModel$RowClickListener;", "(Lcom/ivan/todoengine/logic/task/Activity;Lcom/ivan/androidultimateexample/ui/main/activities/list/ActivityModel$RowClickListener;)V", "date", "Lorg/threeten/bp/LocalDateTime;", "getDate", "()Lorg/threeten/bp/LocalDateTime;", "description", "", "getDescription", "()Ljava/lang/String;", "host", "getHost", "location", "getLocation", "title", "getTitle", "onClick", "", "RowClickListener", "app_debug"})
public final class ActivityModel {
    private final com.ivan.todoengine.logic.task.Activity data = null;
    private final com.ivan.androidultimateexample.ui.main.activities.list.ActivityModel.RowClickListener rowClickListener = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHost() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.threeten.bp.LocalDateTime getDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLocation() {
        return null;
    }
    
    public final void onClick() {
    }
    
    public ActivityModel(@org.jetbrains.annotations.NotNull()
    com.ivan.todoengine.logic.task.Activity data, @org.jetbrains.annotations.Nullable()
    com.ivan.androidultimateexample.ui.main.activities.list.ActivityModel.RowClickListener rowClickListener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/ivan/androidultimateexample/ui/main/activities/list/ActivityModel$RowClickListener;", "", "onRowClicked", "", "activity", "Lcom/ivan/todoengine/logic/task/Activity;", "app_debug"})
    public static abstract interface RowClickListener {
        
        public abstract void onRowClicked(@org.jetbrains.annotations.NotNull()
        com.ivan.todoengine.logic.task.Activity activity);
    }
}