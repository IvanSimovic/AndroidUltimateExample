package com.ivan.todoengine.logic.task

import com.ivan.todoengine.data.api.ActivityDM
import com.ivan.todoengine.data.datamodels.IActivity
import com.ivan.todoengine.data.local.activity.ActivityEntity
import org.threeten.bp.LocalDateTime
import java.util.*

data class Activity(
    override val id: String,
    override var title: String,
    override var description: String,
    override var category: String,
    override var date: LocalDateTime?,
    override var city: String,
    override var venue: String
) : IActivity {
    fun location() = "$venue, $city"
}

fun insertTask() = Activity(UUID.randomUUID().toString(), "", "", "", null, "", "")

fun IActivity.toActivity() = Activity(id, title, description, category, date, city, venue)

fun List<IActivity>.toActivity() = this.map { it -> it.toActivity() }

fun Activity.toActivityEntity() =
    ActivityEntity(id, title, description, category, date, city, venue)

fun Activity.toActivityDM() = ActivityDM(id, title, description, category, date, city, venue)
