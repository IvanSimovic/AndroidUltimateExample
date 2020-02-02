package com.ivan.todoengine.data.api

import com.ivan.todoengine.data.datamodels.IActivity
import org.threeten.bp.LocalDateTime

data class ActivityDM(
    override val id: String,
    override var title: String,
    override var description: String,
    override var category: String,
    override var date: LocalDateTime?,
    override var city: String,
    override var venue: String
): IActivity