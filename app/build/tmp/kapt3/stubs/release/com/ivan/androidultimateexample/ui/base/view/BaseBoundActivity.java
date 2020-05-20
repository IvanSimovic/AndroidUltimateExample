package com.ivan.androidultimateexample.ui.base.view;

import java.lang.System;

/**
 * Base activity for all activities with viewmodels
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\u0012\u0010\u001a\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J\b\u0010\u001d\u001a\u00020\u0017H\u0014R\u0014\u0010\u0006\u001a\u00020\u0007X\u0084D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u00028\u0000X\u0086.\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0010\u001a\u00020\u00118\u0004@\u0004X\u0085.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006\u001e"}, d2 = {"Lcom/ivan/androidultimateexample/ui/base/view/BaseBoundActivity;", "VIEW_MODEL_TYPE", "Lcom/ivan/androidultimateexample/ui/base/viewmodel/BaseViewModel;", "Lcom/ivan/androidultimateexample/ui/base/view/BaseActivity;", "Lcom/ivan/androidultimateexample/ui/base/view/BoundView;", "()V", "DEFAULT_NIGHT_MODE", "", "getDEFAULT_NIGHT_MODE", "()Ljava/lang/String;", "viewModel", "getViewModel", "()Lcom/ivan/androidultimateexample/ui/base/viewmodel/BaseViewModel;", "setViewModel", "(Lcom/ivan/androidultimateexample/ui/base/viewmodel/BaseViewModel;)V", "Lcom/ivan/androidultimateexample/ui/base/viewmodel/BaseViewModel;", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "postInflate", "viewDataBinding", "Landroidx/databinding/ViewDataBinding;", "preInflate", "app_release"})
public abstract class BaseBoundActivity<VIEW_MODEL_TYPE extends com.ivan.androidultimateexample.ui.base.viewmodel.BaseViewModel> extends com.ivan.androidultimateexample.ui.base.view.BaseActivity implements com.ivan.androidultimateexample.ui.base.view.BoundView<VIEW_MODEL_TYPE> {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    protected androidx.lifecycle.ViewModelProvider.Factory viewModelFactory;
    @org.jetbrains.annotations.NotNull()
    public VIEW_MODEL_TYPE viewModel;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String DEFAULT_NIGHT_MODE = "DEFAULT_NIGHT_MODE";
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    protected final androidx.lifecycle.ViewModelProvider.Factory getViewModelFactory() {
        return null;
    }
    
    protected final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelProvider.Factory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public final VIEW_MODEL_TYPE getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    VIEW_MODEL_TYPE p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final java.lang.String getDEFAULT_NIGHT_MODE() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * Prepares viewmodel before inflating
     * Don't forget to call super due to this!
     */
    @java.lang.Override()
    protected void preInflate() {
    }
    
    /**
     * Binds viewmodel after inflating
     * Don't forget to call super due to this!
     */
    @java.lang.Override()
    protected void postInflate(@org.jetbrains.annotations.Nullable()
    androidx.databinding.ViewDataBinding viewDataBinding) {
    }
    
    public BaseBoundActivity() {
        super();
    }
}