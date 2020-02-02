package com.ivan.todoengine.data.local.activity

import androidx.room.*

@Dao
interface ActivityDao {
    @Insert
    suspend fun create(data: ActivityEntity)

    @Update
    suspend fun update(data: ActivityEntity)

    @Query("DELETE FROM ActivityEntity WHERE ID = :id")
    suspend fun delete(id: String)

    @Query("SELECT * FROM ActivityEntity")
    suspend fun list(): List<ActivityEntity>

    @Query("SELECT * FROM ActivityEntity WHERE id = :id")
    suspend fun details(id: String): ActivityEntity
}
