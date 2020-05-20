package com.ivan.androidultimateexample.ui.base.view;

import java.lang.System;

/**
 * Base for all kotlin fragments with viewmodels
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0012\u0010\u001f\u001a\u00020\f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0014J\u0010\u0010\"\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u0012\u0010\u0006\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\u0010X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u00028\u0000X\u0086.\u00a2\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0019\u001a\u00020\u001a8\u0004@\u0004X\u0085.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u00a8\u0006#"}, d2 = {"Lcom/ivan/androidultimateexample/ui/base/view/BaseBoundFragment;", "VIEW_MODEL_TYPE", "Lcom/ivan/androidultimateexample/ui/base/viewmodel/BaseViewModel;", "Lcom/ivan/androidultimateexample/ui/base/view/BaseFragment;", "Lcom/ivan/androidultimateexample/ui/base/view/BoundView;", "()V", "headerStyles", "Lcom/ivan/androidultimateexample/ui/main/activity/MainActivity$HeaderStyles;", "getHeaderStyles", "()Lcom/ivan/androidultimateexample/ui/main/activity/MainActivity$HeaderStyles;", "onHeaderLeftClick", "Lkotlin/Function0;", "", "getOnHeaderLeftClick", "()Lkotlin/jvm/functions/Function0;", "title", "", "getTitle", "()Ljava/lang/String;", "viewModel", "getViewModel", "()Lcom/ivan/androidultimateexample/ui/base/viewmodel/BaseViewModel;", "setViewModel", "(Lcom/ivan/androidultimateexample/ui/base/viewmodel/BaseViewModel;)V", "Lcom/ivan/androidultimateexample/ui/base/viewmodel/BaseViewModel;", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "postInflate", "viewDataBinding", "Landroidx/databinding/ViewDataBinding;", "setTitle", "app_debug"})
public abstract class BaseBoundFragment<VIEW_MODEL_TYPE extends com.ivan.androidultimateexample.ui.base.viewmodel.BaseViewModel> extends com.ivan.androidultimateexample.ui.base.view.BaseFragment implements com.ivan.androidultimateexample.ui.base.view.BoundView<VIEW_MODEL_TYPE> {
    
    /**
     * Use this if you need to get activity view model
     * (ViewModelProviders.of(activity, viewModelFactory).get(activityViewModelClass))
     *
     * That way it will use the injected instance of ViewModel
     */
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    protected androidx.lifecycle.ViewModelProvider.Factory viewModelFactory;
    @org.jetbrains.annotations.NotNull()
    public VIEW_MODEL_TYPE viewModel;
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
    public abstract java.lang.String getTitle();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.ivan.androidultimateexample.ui.main.activity.MainActivity.HeaderStyles getHeaderStyles();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlin.jvm.functions.Function0<kotlin.Unit> getOnHeaderLeftClick();
    
    @java.lang.Override()
    protected void postInflate(@org.jetbrains.annotations.Nullable()
    androidx.databinding.ViewDataBinding viewDataBinding) {
    }
    
    private final void setTitle(java.lang.String title) {
    }
    
    public BaseBoundFragment() {
        super();
    }
}