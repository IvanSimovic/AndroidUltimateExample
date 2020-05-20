package com.ivan.todoengine.data.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007J\u0014\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\bH\u0007J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a8\u0006\u000e"}, d2 = {"Lcom/ivan/todoengine/data/base/Converter;", "", "()V", "toBoolean", "", "value", "", "toDate", "Lorg/threeten/bp/LocalDateTime;", "dateString", "", "toDateString", "date", "toInt", "engine_debug"})
public final class Converter {
    public static final com.ivan.todoengine.data.base.Converter INSTANCE = null;
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public static final org.threeten.bp.LocalDateTime toDate(@org.jetbrains.annotations.Nullable()
    java.lang.String dateString) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public static final java.lang.String toDateString(@org.jetbrains.annotations.Nullable()
    org.threeten.bp.LocalDateTime date) {
        return null;
    }
    
    @androidx.room.TypeConverter()
    public static final int toInt(boolean value) {
        return 0;
    }
    
    @androidx.room.TypeConverter()
    public static final boolean toBoolean(int value) {
        return false;
    }
    
    private Converter() {
        super();
    }
}