package com.ivan.todoengine.data.datamodels

import org.threeten.bp.LocalDateTime

interface IActivity {
    val id: String
    var title: String
    var description: String
    var category: String
    var date: LocalDateTime?
    var city: String
    var venue: String
}
