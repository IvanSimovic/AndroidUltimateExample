package com.ivan.androidultimateexample.ui.main.activities

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.OnLifecycleEvent
import com.ivan.androidultimateexample.ui.base.viewmodel.BaseViewModel
import com.ivan.androidultimateexample.ui.util.asMutableLiveData
import com.ivan.todoengine.logic.activity.Activity
import com.ivan.todoengine.logic.activity.ActivityLogic
import javax.inject.Inject

class ActivitiesViewModel
@Inject constructor(
    private val activityLogic: ActivityLogic
) : BaseViewModel() {

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun getActivities() {
        runForUI {
            tasks.value = activityLogic.getActivities()
        }
    }

    val tasks = listOf<Activity>().asMutableLiveData()
}
