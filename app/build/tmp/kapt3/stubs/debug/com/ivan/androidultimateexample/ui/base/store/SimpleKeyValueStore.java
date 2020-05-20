package com.ivan.androidultimateexample.ui.base.store;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\u0010\"\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u000bH&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H&J\u001e\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\fH&J\u0017\u0010\r\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a2\u0006\u0002\u0010\u000eJ\u0018\u0010\r\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0007H&J\u0017\u0010\u0010\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a2\u0006\u0002\u0010\u0011J\u0018\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\nH&J\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a2\u0006\u0002\u0010\u0013J\u0018\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000bH&J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H&J\u0018\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f2\u0006\u0010\u0004\u001a\u00020\u0005H&J$\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\f2\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\fH&\u00a8\u0006\u0016"}, d2 = {"Lcom/ivan/androidultimateexample/ui/base/store/SimpleKeyValueStore;", "", "delete", "", "key", "", "hasStored", "", "put", "value", "", "", "", "readBoolean", "(Ljava/lang/String;)Ljava/lang/Boolean;", "defaultValue", "readInt", "(Ljava/lang/String;)Ljava/lang/Integer;", "readLong", "(Ljava/lang/String;)Ljava/lang/Long;", "readString", "readStringSet", "app_debug"})
public abstract interface SimpleKeyValueStore {
    
    public abstract void put(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> value);
    
    public abstract void put(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String value);
    
    public abstract void put(@org.jetbrains.annotations.NotNull()
    java.lang.String key, boolean value);
    
    public abstract void put(@org.jetbrains.annotations.NotNull()
    java.lang.String key, int value);
    
    public abstract void put(@org.jetbrains.annotations.NotNull()
    java.lang.String key, long value);
    
    public abstract boolean hasStored(@org.jetbrains.annotations.NotNull()
    java.lang.String key);
    
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    java.lang.String key);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Set<java.lang.String> readStringSet(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> defaultValue);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String readString(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String defaultValue);
    
    public abstract boolean readBoolean(@org.jetbrains.annotations.NotNull()
    java.lang.String key, boolean defaultValue);
    
    public abstract int readInt(@org.jetbrains.annotations.NotNull()
    java.lang.String key, int defaultValue);
    
    public abstract long readLong(@org.jetbrains.annotations.NotNull()
    java.lang.String key, long defaultValue);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.util.Set<java.lang.String> readStringSet(@org.jetbrains.annotations.NotNull()
    java.lang.String key);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String readString(@org.jetbrains.annotations.NotNull()
    java.lang.String key);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Boolean readBoolean(@org.jetbrains.annotations.NotNull()
    java.lang.String key);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Integer readInt(@org.jetbrains.annotations.NotNull()
    java.lang.String key);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Long readLong(@org.jetbrains.annotations.NotNull()
    java.lang.String key);
}