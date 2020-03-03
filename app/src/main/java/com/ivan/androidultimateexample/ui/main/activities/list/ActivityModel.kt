package com.ivan.androidultimateexample.ui.main.activities.list

import com.ivan.todoengine.logic.activity.Activity
import org.threeten.bp.LocalDateTime

class ActivityModel(
    private val data: Activity,
    private val rowClickListener: RowClickListener?
) {
    val title: String
        get() = data.title

    val host: String
        get() = "Hosted by Bob"

    val description: String
        get() = data.description

    val date: LocalDateTime?
        get() = data.date

    val location: String
        get() = data.venue + ", " + data.city

    fun onClick() {
        rowClickListener?.onRowClicked(data)
    }

    interface RowClickListener {

        fun onRowClicked(activity: Activity)
    }
}

fun List<Activity>.toRowModels(rowClickListener: ActivityModel.RowClickListener) =
    this.map {
        it.toRowModel(rowClickListener)
    }

fun Activity.toRowModel(rowClickListener: ActivityModel.RowClickListener) =
    ActivityModel(this, rowClickListener)
