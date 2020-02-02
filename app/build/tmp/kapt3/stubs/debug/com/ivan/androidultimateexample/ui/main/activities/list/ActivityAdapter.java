package com.ivan.androidultimateexample.ui.main.activities.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0014\u0010\u0016\u001a\u00020\f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u0018J\u000e\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0003R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/ivan/androidultimateexample/ui/main/activities/list/ActivityAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ivan/androidultimateexample/ui/main/activities/list/ActivityViewHolder;", "Lcom/ivan/androidultimateexample/ui/main/activities/list/ActivityModel$RowClickListener;", "()V", "rowClickListener", "rowModels", "Ljava/util/ArrayList;", "Lcom/ivan/androidultimateexample/ui/main/activities/list/ActivityModel;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onRowClicked", "activity", "Lcom/ivan/todoengine/logic/task/Activity;", "refreshData", "data", "", "setRowClickListener", "app_debug"})
public final class ActivityAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.ivan.androidultimateexample.ui.main.activities.list.ActivityViewHolder> implements com.ivan.androidultimateexample.ui.main.activities.list.ActivityModel.RowClickListener {
    private final java.util.ArrayList<com.ivan.androidultimateexample.ui.main.activities.list.ActivityModel> rowModels = null;
    private com.ivan.androidultimateexample.ui.main.activities.list.ActivityModel.RowClickListener rowClickListener;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.ivan.androidultimateexample.ui.main.activities.list.ActivityViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.ivan.androidultimateexample.ui.main.activities.list.ActivityViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void refreshData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ivan.todoengine.logic.task.Activity> data) {
    }
    
    public final void setRowClickListener(@org.jetbrains.annotations.NotNull()
    com.ivan.androidultimateexample.ui.main.activities.list.ActivityModel.RowClickListener rowClickListener) {
    }
    
    @java.lang.Override()
    public void onRowClicked(@org.jetbrains.annotations.NotNull()
    com.ivan.todoengine.logic.task.Activity activity) {
    }
    
    public ActivityAdapter() {
        super();
    }
}