package com.ivan.androidultimateexample.ui.base.view;

import java.lang.System;

/**
 * Base fragment for all fragments
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u001a\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0012\u0010\u0014\u001a\u00020\u00122\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014J\b\u0010\u0015\u001a\u00020\u0012H\u0014R\u0014\u0010\u0003\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/ivan/androidultimateexample/ui/base/view/BaseFragment;", "Ldagger/android/support/DaggerFragment;", "()V", "layoutRId", "", "getLayoutRId", "()I", "viewDataBinding", "Landroidx/databinding/ViewDataBinding;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "postInflate", "preInflate", "app_debug"})
public abstract class BaseFragment extends dagger.android.support.DaggerFragment {
    private androidx.databinding.ViewDataBinding viewDataBinding;
    private java.util.HashMap _$_findViewCache;
    
    /**
     * Provides layout id of this view
     * May not be 0!
     */
    @androidx.annotation.LayoutRes()
    public abstract int getLayoutRId();
    
    /**
     * Inflates layout
     * Don't forget to call super due to this
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * Invoked before inflating the view
     */
    protected void preInflate() {
    }
    
    /**
     * Invoked just after inflating the view
     * Override to add variables, etc.
     */
    protected void postInflate(@org.jetbrains.annotations.Nullable()
    androidx.databinding.ViewDataBinding viewDataBinding) {
    }
    
    public BaseFragment() {
        super();
    }
}