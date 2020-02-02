package com.ivan.todoengine.data.base

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverter
import androidx.room.TypeConverters
import com.ivan.todoengine.data.local.activity.ActivityDao
import com.ivan.todoengine.data.local.activity.ActivityEntity
import org.threeten.bp.LocalDateTime
import javax.inject.Singleton

@Singleton
@TypeConverters(value = [Converter::class])
@Database(
    entities = [ActivityEntity::class],
    version = 1
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun activityDao(): ActivityDao
}

object Converter {

    @TypeConverter
    @JvmStatic
    fun toDate(dateString: String?): LocalDateTime? {
        return if (dateString == null) {
            null
        } else {
            LocalDateTime.parse(dateString)
        }
    }

    @TypeConverter
    @JvmStatic
    fun toDateString(date: LocalDateTime?): String? {
        return date?.toString()
    }

/*

    @TypeConverter
    @JvmStatic
    fun toInt(value: Enum) = value.toInt()

    @TypeConverter
    @JvmStatic
    fun toEnum(value: Int) = value.toEnum<Enum>()
*/

    @TypeConverter
    @JvmStatic
    fun toInt(value: Boolean) = if (value) 1 else 0

    @TypeConverter
    @JvmStatic
    fun toBoolean(value: Int) = value == 1

}

@Suppress("NOTHING_TO_INLINE")
private inline fun <T : Enum<T>> T.toInt(): Int = this.ordinal

private inline fun <reified T : Enum<T>> Int.toEnum(): T = enumValues<T>()[this]
