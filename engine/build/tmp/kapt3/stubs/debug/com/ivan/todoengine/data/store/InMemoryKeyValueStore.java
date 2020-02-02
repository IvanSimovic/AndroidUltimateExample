package com.ivan.todoengine.data.store;

import java.lang.System;

/**
 * @author Ensar Sarajčić <ensar.sarajcic@sleepnumber.com>.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\u0010\"\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000fH\u0016J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H\u0016J\u001e\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010H\u0016J\u0017\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\t\u001a\u00020\u0005H\u0016\u00a2\u0006\u0002\u0010\u0012J\u0018\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u000bH\u0016J\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\u0005H\u0016\u00a2\u0006\u0002\u0010\u0015J\u0018\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u000eH\u0016J\u0017\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\t\u001a\u00020\u0005H\u0016\u00a2\u0006\u0002\u0010\u0017J\u0018\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016J\u0018\u0010\u0018\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005H\u0016J\u0018\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00102\u0006\u0010\t\u001a\u00020\u0005H\u0016J$\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u00102\u0006\u0010\t\u001a\u00020\u00052\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010H\u0016J\u0018\u0010\u001a\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0006H\u0002R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/ivan/todoengine/data/store/InMemoryKeyValueStore;", "Lcom/ivan/todoengine/data/store/SimpleKeyValueStore;", "()V", "map", "Ljava/util/HashMap;", "", "", "delete", "", "key", "hasStored", "", "put", "value", "", "", "", "readBoolean", "(Ljava/lang/String;)Ljava/lang/Boolean;", "defaultValue", "readInt", "(Ljava/lang/String;)Ljava/lang/Integer;", "readLong", "(Ljava/lang/String;)Ljava/lang/Long;", "readString", "readStringSet", "store", "engine_debug"})
public final class InMemoryKeyValueStore implements com.ivan.todoengine.data.store.SimpleKeyValueStore {
    private final java.util.HashMap<java.lang.String, java.lang.Object> map = null;
    
    @java.lang.Override()
    public void put(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> value) {
    }
    
    @java.lang.Override()
    public void put(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @java.lang.Override()
    public void put(@org.jetbrains.annotations.NotNull()
    java.lang.String key, boolean value) {
    }
    
    @java.lang.Override()
    public void put(@org.jetbrains.annotations.NotNull()
    java.lang.String key, int value) {
    }
    
    @java.lang.Override()
    public void put(@org.jetbrains.annotations.NotNull()
    java.lang.String key, long value) {
    }
    
    @java.lang.Override()
    public boolean hasStored(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return false;
    }
    
    @java.lang.Override()
    public void delete(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Set<java.lang.String> readStringSet(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> defaultValue) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String readString(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String defaultValue) {
        return null;
    }
    
    @java.lang.Override()
    public boolean readBoolean(@org.jetbrains.annotations.NotNull()
    java.lang.String key, boolean defaultValue) {
        return false;
    }
    
    @java.lang.Override()
    public int readInt(@org.jetbrains.annotations.NotNull()
    java.lang.String key, int defaultValue) {
        return 0;
    }
    
    @java.lang.Override()
    public long readLong(@org.jetbrains.annotations.NotNull()
    java.lang.String key, long defaultValue) {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.util.Set<java.lang.String> readStringSet(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String readString(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Boolean readBoolean(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Integer readInt(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Long readLong(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
    
    private final void store(java.lang.String key, java.lang.Object value) {
    }
    
    @javax.inject.Inject()
    public InMemoryKeyValueStore() {
        super();
    }
}