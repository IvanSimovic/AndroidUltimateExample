package com.ivan.androidultimateexample.ui.main.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016J$\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00170\u001eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u00118VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\r8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u000f\u00a8\u0006 "}, d2 = {"Lcom/ivan/androidultimateexample/ui/main/activity/MainActivity;", "Lcom/ivan/androidultimateexample/ui/base/view/BaseBoundActivity;", "Lcom/ivan/androidultimateexample/ui/main/activity/MainViewModel;", "()V", "doubleBackToExitPressedOnce", "", "headerStyles", "Lcom/ivan/androidultimateexample/ui/main/activity/MainActivity$HeaderStyles;", "getHeaderStyles", "()Lcom/ivan/androidultimateexample/ui/main/activity/MainActivity$HeaderStyles;", "setHeaderStyles", "(Lcom/ivan/androidultimateexample/ui/main/activity/MainActivity$HeaderStyles;)V", "layoutRId", "", "getLayoutRId", "()I", "viewModelClass", "Ljava/lang/Class;", "getViewModelClass", "()Ljava/lang/Class;", "viewModelNameRId", "getViewModelNameRId", "bindToViewModel", "", "onBackPressed", "setHeader", "title", "", "headerStyle", "leftClick", "Lkotlin/Function0;", "HeaderStyles", "app_debug"})
public final class MainActivity extends com.ivan.androidultimateexample.ui.base.view.BaseBoundActivity<com.ivan.androidultimateexample.ui.main.activity.MainViewModel> {
    @org.jetbrains.annotations.NotNull()
    private com.ivan.androidultimateexample.ui.main.activity.MainActivity.HeaderStyles headerStyles;
    private boolean doubleBackToExitPressedOnce;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public int getLayoutRId() {
        return 0;
    }
    
    @java.lang.Override()
    public int getViewModelNameRId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.Class<com.ivan.androidultimateexample.ui.main.activity.MainViewModel> getViewModelClass() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ivan.androidultimateexample.ui.main.activity.MainActivity.HeaderStyles getHeaderStyles() {
        return null;
    }
    
    public final void setHeaderStyles(@org.jetbrains.annotations.NotNull()
    com.ivan.androidultimateexample.ui.main.activity.MainActivity.HeaderStyles p0) {
    }
    
    @java.lang.Override()
    public void bindToViewModel() {
    }
    
    public final void setHeader(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    com.ivan.androidultimateexample.ui.main.activity.MainActivity.HeaderStyles headerStyle, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> leftClick) {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    public MainActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007\u00a8\u0006\b"}, d2 = {"Lcom/ivan/androidultimateexample/ui/main/activity/MainActivity$HeaderStyles;", "", "value", "", "(Ljava/lang/String;II)V", "BASE_SCREEN", "INFO_SCREEN", "LANDING_PAGE", "app_debug"})
    public static enum HeaderStyles {
        /*public static final*/ BASE_SCREEN /* = new BASE_SCREEN(0) */,
        /*public static final*/ INFO_SCREEN /* = new INFO_SCREEN(0) */,
        /*public static final*/ LANDING_PAGE /* = new LANDING_PAGE(0) */;
        
        HeaderStyles(int value) {
        }
    }
}