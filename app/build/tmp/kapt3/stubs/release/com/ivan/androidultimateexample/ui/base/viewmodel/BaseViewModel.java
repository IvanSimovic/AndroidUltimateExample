package com.ivan.androidultimateexample.ui.base.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0014\u001a\u00020\u0015H\u0014J7\u0010\u0016\u001a\u00020\u00152\'\u0010\u0017\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0018\u00a2\u0006\u0002\b\u001b\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ7\u0010\u001d\u001a\u00020\u00152\'\u0010\u0017\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0018\u00a2\u0006\u0002\b\u001b\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001e"}, d2 = {"Lcom/ivan/androidultimateexample/ui/base/viewmodel/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/LifecycleObserver;", "()V", "coroutineExceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "error", "Landroidx/lifecycle/MutableLiveData;", "", "getError", "()Landroidx/lifecycle/MutableLiveData;", "isLoading", "Lcom/ivan/androidultimateexample/ui/util/SingleLiveEvent;", "", "viewModelScope", "Lkotlinx/coroutines/CoroutineScope;", "getViewModelScope", "()Lkotlinx/coroutines/CoroutineScope;", "viewModelScope$delegate", "Lkotlin/Lazy;", "onCleared", "", "run", "work", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;)V", "runWithLoading", "app_release"})
public abstract class BaseViewModel extends androidx.lifecycle.ViewModel implements androidx.lifecycle.LifecycleObserver {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> error = null;
    private final com.ivan.androidultimateexample.ui.util.SingleLiveEvent<java.lang.Boolean> isLoading = null;
    private kotlinx.coroutines.CoroutineExceptionHandler coroutineExceptionHandler;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModelScope$delegate = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final kotlinx.coroutines.CoroutineScope getViewModelScope() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public final void run(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> work) {
    }
    
    public final void runWithLoading(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> work) {
    }
    
    public BaseViewModel() {
        super();
    }
}