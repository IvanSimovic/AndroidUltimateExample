package com.ivan.todoengine.data.local.activity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.ivan.todoengine.data.datamodels.IActivity
import org.threeten.bp.LocalDateTime

@Entity
data class ActivityEntity(
    @PrimaryKey(autoGenerate = false)
    override val id: String,
    override var title: String,
    override var description: String,
    override var category: String,
    override var date: LocalDateTime?,
    override var city: String,
    override var venue: String
) : IActivity
