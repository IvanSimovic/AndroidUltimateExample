package com.ivan.todoengine.data.store;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\t"}, d2 = {"Lcom/ivan/todoengine/data/store/SecureKeyValueStore;", "", "delete", "", "key", "", "put", "value", "readString", "engine_release"})
public abstract interface SecureKeyValueStore {
    
    public abstract void put(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String value);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String readString(@org.jetbrains.annotations.NotNull()
    java.lang.String key);
    
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    java.lang.String key);
}