package com.ivan.androidultimateexample.ui.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002\u00a2\u0006\u0002\u0010\u0004\u001a\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002\u00a2\u0006\u0002\u0010\u0007\u001a\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\t\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002\u00a2\u0006\u0002\u0010\n\u001a\u001b\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u0002H\u0002\u00a2\u0006\u0002\u0010\u0004\u001a\"\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\f0\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\f\u001a\u001b\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006\"\u0004\b\u0000\u0010\u0002*\u0002H\u0002\u00a2\u0006\u0002\u0010\u0007\u001a\u001b\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006\"\u0004\b\u0000\u0010\u0002*\u0002H\u0002\u00a2\u0006\u0002\u0010\u0007\u001a\u001b\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00020\t\"\u0004\b\u0000\u0010\u0002*\u0002H\u0002\u00a2\u0006\u0002\u0010\n\u001a6\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00110\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0011*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00110\u0013\u001a<\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00110\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0011*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00110\u00010\u0013\u00a8\u0006\u0015"}, d2 = {"liveDataOf", "Landroidx/lifecycle/LiveData;", "X", "x", "(Ljava/lang/Object;)Landroidx/lifecycle/LiveData;", "mutableLiveDataOf", "Landroidx/lifecycle/MutableLiveData;", "(Ljava/lang/Object;)Landroidx/lifecycle/MutableLiveData;", "singleLiveEventOf", "Lcom/ivan/androidultimateexample/ui/util/SingleLiveEvent;", "(Ljava/lang/Object;)Lcom/ivan/androidultimateexample/ui/util/SingleLiveEvent;", "asLiveData", "", "asMutableLiveData", "asMutableLiveDataOnNonMainThread", "asSingleLiveEvent", "liveMap", "Y", "func", "Lkotlin/Function1;", "liveSwitchMap", "app_debug"})
public final class LiveTransformationsKt {
    
    @org.jetbrains.annotations.NotNull()
    public static final <X extends java.lang.Object, Y extends java.lang.Object>androidx.lifecycle.LiveData<Y> liveMap(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<X> $this$liveMap, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super X, ? extends Y> func) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <X extends java.lang.Object, Y extends java.lang.Object>androidx.lifecycle.LiveData<Y> liveSwitchMap(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<X> $this$liveSwitchMap, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super X, ? extends androidx.lifecycle.LiveData<Y>> func) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <X extends java.lang.Object>androidx.lifecycle.MutableLiveData<X> asMutableLiveData(X $this$asMutableLiveData) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <X extends java.lang.Object>androidx.lifecycle.MutableLiveData<X> asMutableLiveDataOnNonMainThread(X $this$asMutableLiveDataOnNonMainThread) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <X extends java.lang.Object>androidx.lifecycle.MutableLiveData<X> mutableLiveDataOf(X x) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <X extends java.lang.Object>com.ivan.androidultimateexample.ui.util.SingleLiveEvent<X> asSingleLiveEvent(X $this$asSingleLiveEvent) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <X extends java.lang.Object>com.ivan.androidultimateexample.ui.util.SingleLiveEvent<X> singleLiveEventOf(X x) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <X extends java.lang.Object>androidx.lifecycle.LiveData<X> asLiveData(X $this$asLiveData) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <X extends java.lang.Object>androidx.lifecycle.LiveData<X> liveDataOf(X x) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <X extends java.lang.Object>androidx.lifecycle.LiveData<java.util.List<X>> asLiveData(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends X> $this$asLiveData) {
        return null;
    }
}