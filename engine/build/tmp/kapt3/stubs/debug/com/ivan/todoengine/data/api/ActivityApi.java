package com.ivan.todoengine.data.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\t\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0001\u0010\t\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000e0\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ+\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/ivan/todoengine/data/api/ActivityApi;", "", "create", "Lretrofit2/Response;", "", "activity", "Lcom/ivan/todoengine/data/api/ActivityDM;", "(Lcom/ivan/todoengine/data/api/ActivityDM;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delete", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "details", "list", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "(Ljava/lang/String;Lcom/ivan/todoengine/data/api/ActivityDM;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "engine_debug"})
public abstract interface ActivityApi {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "activities")
    public abstract java.lang.Object list(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<com.ivan.todoengine.data.api.ActivityDM>>> p0);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "activities/{id}")
    public abstract java.lang.Object details(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "id")
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.ivan.todoengine.data.api.ActivityDM>> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "activities")
    public abstract java.lang.Object create(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.ivan.todoengine.data.api.ActivityDM activity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<kotlin.Unit>> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.PUT(value = "activities/{id}")
    public abstract java.lang.Object update(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "id")
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.ivan.todoengine.data.api.ActivityDM activity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<kotlin.Unit>> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.DELETE(value = "activities/{id}")
    public abstract java.lang.Object delete(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "id")
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<kotlin.Unit>> p1);
}