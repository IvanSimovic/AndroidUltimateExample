package com.ivan.androidultimateexample.ui.base.view;

import java.lang.System;

/**
 * Base activity for all activities
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0014J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014J\u0012\u0010\u000e\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014J\b\u0010\u000f\u001a\u00020\nH\u0014R\u0014\u0010\u0003\u001a\u00020\u00048gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/ivan/androidultimateexample/ui/base/view/BaseActivity;", "Ldagger/android/support/DaggerAppCompatActivity;", "()V", "layoutRId", "", "getLayoutRId", "()I", "viewDataBinding", "Landroidx/databinding/ViewDataBinding;", "doInjections", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "postInflate", "preInflate", "app_release"})
public abstract class BaseActivity extends dagger.android.support.DaggerAppCompatActivity {
    private androidx.databinding.ViewDataBinding viewDataBinding;
    private java.util.HashMap _$_findViewCache;
    
    /**
     * Provides layout id of this view
     */
    @androidx.annotation.LayoutRes()
    public abstract int getLayoutRId();
    
    /**
     * Handles inflation and view binding
     * Don't forget to call super due to this!
     */
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * Invoked before inflating the view
     * Called even when view won't be inflated if layout id is 0
     */
    protected void preInflate() {
    }
    
    /**
     * Invoked just after inflating the view
     * Called even when view was not inflated if layout id was 0
     * Override to add variables, etc.
     */
    protected void postInflate(@org.jetbrains.annotations.Nullable()
    androidx.databinding.ViewDataBinding viewDataBinding) {
    }
    
    /**
     * Override this if you want to inject lifecycle delegates prior to your onCreate() code
     * This will be called only once (in onCreate() method)
     * Don't forget to call super
     */
    protected void doInjections() {
    }
    
    public BaseActivity() {
        super();
    }
}