package com.ivan.todoengine.networking.converters

import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken
import org.threeten.bp.*

/**
 * The `Converters` class contains static methods for registering Java Time converters.
 */
object Converters {
    /** The specific genericized type for `LocalDate`.  */
    val LOCAL_DATE_TYPE =
        object : TypeToken<LocalDate?>() {}.type
    /** The specific genericized type for `LocalDateTime`.  */
    val LOCAL_DATE_TIME_TYPE =
        object : TypeToken<LocalDateTime?>() {}.type
    /** The specific genericized type for `LocalTime`.  */
    val LOCAL_TIME_TYPE =
        object : TypeToken<LocalTime?>() {}.type
    /** The specific genericized type for `OffsetDateTime`.  */
    val OFFSET_DATE_TIME_TYPE =
        object : TypeToken<OffsetDateTime?>() {}.type
    /** The specific genericized type for `OffsetTime`.  */
    val OFFSET_TIME_TYPE =
        object : TypeToken<OffsetTime?>() {}.type
    /** The specific genericized type for `ZonedDateTime`.  */
    val ZONED_DATE_TIME_TYPE =
        object : TypeToken<ZonedDateTime?>() {}.type
    /** The specific genericized type for `Instant`.  */
    val INSTANT_TYPE =
        object : TypeToken<Instant?>() {}.type

    /**
     * Registers all the Java Time converters.
     * @param builder The GSON builder to register the converters with.
     * @return A reference to `builder`.
     */
    fun registerAll(builder: GsonBuilder?): GsonBuilder {
        if (builder == null) {
            throw NullPointerException("builder cannot be null")
        }
        registerLocalDate(builder)
        registerLocalDateTime(builder)
        registerLocalTime(builder)
        registerOffsetDateTime(builder)
        registerOffsetTime(builder)
        registerZonedDateTime(builder)
        registerInstant(builder)
        return builder
    }

    /**
     * Registers the [LocalDateConverter] converter.
     * @param builder The GSON builder to register the converter with.
     * @return A reference to `builder`.
     */
    fun registerLocalDate(builder: GsonBuilder): GsonBuilder {
        builder.registerTypeAdapter(LOCAL_DATE_TYPE, LocalDateConverter())
        return builder
    }

    /**
     * Registers the [LocalDateTimeConverter] converter.
     * @param builder The GSON builder to register the converter with.
     * @return A reference to `builder`.
     */
    fun registerLocalDateTime(builder: GsonBuilder): GsonBuilder {
        builder.registerTypeAdapter(LOCAL_DATE_TIME_TYPE, LocalDateTimeConverter())
        return builder
    }

    /**
     * Registers the [LocalTimeConverter] converter.
     * @param builder The GSON builder to register the converter with.
     * @return A reference to `builder`.
     */
    fun registerLocalTime(builder: GsonBuilder): GsonBuilder {
        builder.registerTypeAdapter(LOCAL_TIME_TYPE, LocalTimeConverter())
        return builder
    }

    /**
     * Registers the [OffsetDateTimeConverter] converter.
     * @param builder The GSON builder to register the converter with.
     * @return A reference to `builder`.
     */
    fun registerOffsetDateTime(builder: GsonBuilder): GsonBuilder {
        builder.registerTypeAdapter(OFFSET_DATE_TIME_TYPE, OffsetDateTimeConverter())
        return builder
    }

    /**
     * Registers the [OffsetTimeConverter] converter.
     * @param builder The GSON builder to register the converter with.
     * @return A reference to `builder`.
     */
    fun registerOffsetTime(builder: GsonBuilder): GsonBuilder {
        builder.registerTypeAdapter(OFFSET_TIME_TYPE, OffsetTimeConverter())
        return builder
    }

    /**
     * Registers the [ZonedDateTimeConverter] converter.
     * @param builder The GSON builder to register the converter with.
     * @return A reference to `builder`.
     */
    fun registerZonedDateTime(builder: GsonBuilder): GsonBuilder {
        builder.registerTypeAdapter(ZONED_DATE_TIME_TYPE, ZonedDateTimeConverter())
        return builder
    }

    /**
     * Registers the [InstantConverter] converter.
     * @param builder The GSON builder to register the converter with.
     * @return A reference to `builder`.
     */
    fun registerInstant(builder: GsonBuilder): GsonBuilder {
        builder.registerTypeAdapter(INSTANT_TYPE, InstantConverter())
        return builder
    }
}