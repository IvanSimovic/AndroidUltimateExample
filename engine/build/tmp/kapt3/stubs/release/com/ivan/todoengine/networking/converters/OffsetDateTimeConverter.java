package com.ivan.todoengine.networking.converters;

import java.lang.System;

/**
 * GSON serialiser/deserialiser for converting [OffsetDateTime] objects.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00102\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u0010B\u0005\u00a2\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\"\u0010\f\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000fH\u0016\u00a8\u0006\u0011"}, d2 = {"Lcom/ivan/todoengine/networking/converters/OffsetDateTimeConverter;", "Lcom/google/gson/JsonSerializer;", "Lorg/threeten/bp/OffsetDateTime;", "Lcom/google/gson/JsonDeserializer;", "()V", "deserialize", "json", "Lcom/google/gson/JsonElement;", "typeOfT", "Ljava/lang/reflect/Type;", "context", "Lcom/google/gson/JsonDeserializationContext;", "serialize", "src", "typeOfSrc", "Lcom/google/gson/JsonSerializationContext;", "Companion", "engine_release"})
public final class OffsetDateTimeConverter implements com.google.gson.JsonSerializer<org.threeten.bp.OffsetDateTime>, com.google.gson.JsonDeserializer<org.threeten.bp.OffsetDateTime> {
    
    /**
     * Formatter.
     */
    private static final org.threeten.bp.format.DateTimeFormatter FORMATTER = null;
    public static final com.ivan.todoengine.networking.converters.OffsetDateTimeConverter.Companion Companion = null;
    
    /**
     * Gson invokes this call-back method during serialization when it encounters a field of the
     * specified type.
     *
     *
     *
     * In the implementation of this call-back method, you should consider invoking
     * [JsonSerializationContext.serialize] method to create JsonElements for any
     * non-trivial field of the `src` object. However, you should never invoke it on the
     * `src` object itself since that will cause an infinite loop (Gson will call your
     * call-back method again).
     *
     * @param src the object that needs to be converted to Json.
     * @param typeOfSrc the actual type (fully genericized version) of the source object.
     * @return a JsonElement corresponding to the specified object.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.google.gson.JsonElement serialize(@org.jetbrains.annotations.Nullable()
    org.threeten.bp.OffsetDateTime src, @org.jetbrains.annotations.NotNull()
    java.lang.reflect.Type typeOfSrc, @org.jetbrains.annotations.NotNull()
    com.google.gson.JsonSerializationContext context) {
        return null;
    }
    
    /**
     * Gson invokes this call-back method during deserialization when it encounters a field of the
     * specified type.
     *
     *
     *
     * In the implementation of this call-back method, you should consider invoking
     * [JsonDeserializationContext.deserialize] method to create objects
     * for any non-trivial field of the returned object. However, you should never invoke it on the
     * the same type passing `json` since that will cause an infinite loop (Gson will call your
     * call-back method again).
     *
     * @param json The Json data being deserialized
     * @param typeOfT The type of the Object to deserialize to
     * @return a deserialized object of the specified type typeOfT which is a subclass of `T`
     * @throws JsonParseException if json is not in the expected format of `typeOfT`
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.threeten.bp.OffsetDateTime deserialize(@org.jetbrains.annotations.NotNull()
    com.google.gson.JsonElement json, @org.jetbrains.annotations.NotNull()
    java.lang.reflect.Type typeOfT, @org.jetbrains.annotations.NotNull()
    com.google.gson.JsonDeserializationContext context) throws com.google.gson.JsonParseException {
        return null;
    }
    
    public OffsetDateTimeConverter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/ivan/todoengine/networking/converters/OffsetDateTimeConverter$Companion;", "", "()V", "FORMATTER", "Lorg/threeten/bp/format/DateTimeFormatter;", "kotlin.jvm.PlatformType", "engine_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}