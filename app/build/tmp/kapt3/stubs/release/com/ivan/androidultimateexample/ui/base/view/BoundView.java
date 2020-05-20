package com.ivan.androidultimateexample.ui.base.view;

import java.lang.System;

/**
 * Represents a View that can be bound to a ViewModel
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J\b\u0010\u0011\u001a\u00020\u0012H&R\u0018\u0010\u0004\u001a\u00028\u0000X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0012\u0010\r\u001a\u00020\u000eX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0013"}, d2 = {"Lcom/ivan/androidultimateexample/ui/base/view/BoundView;", "VIEW_MODEL_TYPE", "Lcom/ivan/androidultimateexample/ui/base/viewmodel/BaseViewModel;", "", "viewModel", "getViewModel", "()Lcom/ivan/androidultimateexample/ui/base/viewmodel/BaseViewModel;", "setViewModel", "(Lcom/ivan/androidultimateexample/ui/base/viewmodel/BaseViewModel;)V", "viewModelClass", "Ljava/lang/Class;", "getViewModelClass", "()Ljava/lang/Class;", "viewModelNameRId", "", "getViewModelNameRId", "()I", "bindToViewModel", "", "app_release"})
public abstract interface BoundView<VIEW_MODEL_TYPE extends com.ivan.androidultimateexample.ui.base.viewmodel.BaseViewModel> {
    
    /**
     * Provides name of view model (BR.name)
     */
    public abstract int getViewModelNameRId();
    
    /**
     * Provides viewmodel of this view
     * ViewModel will be injected into the view and returned from this method
     */
    @org.jetbrains.annotations.NotNull()
    public abstract VIEW_MODEL_TYPE getViewModel();
    
    /**
     * Provides viewmodel of this view
     * ViewModel will be injected into the view and returned from this method
     */
    public abstract void setViewModel(@org.jetbrains.annotations.NotNull()
    VIEW_MODEL_TYPE p0);
    
    /**
     * Provides class of this views ViewModel
     * This is required to properly inject the ViewModel
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.Class<VIEW_MODEL_TYPE> getViewModelClass();
    
    /**
     * Invoked once everything is ready
     * Use this method to complete binding to view model
     * (all bindings that were not possible through XML)
     */
    public abstract void bindToViewModel();
}