package com.ivan.androidultimateexample.ui.main.activities

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.OnLifecycleEvent
import com.ivan.androidultimateexample.ui.base.viewmodel.BaseViewModel
import com.ivan.androidultimateexample.ui.util.asMutableLiveData
import com.ivan.todoengine.logic.activity.Activity
import com.ivan.todoengine.logic.activity.ActivityLogic
import kotlinx.coroutines.CoroutineScope
import javax.inject.Inject

class ActivitiesViewModel
@Inject constructor(
    private val activityLogic: ActivityLogic,
    appScope: CoroutineScope
) : BaseViewModel(appScope) {

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun getActivities() {
        runWithLoading {
            tasks.value = activityLogic.getActivities()
        }
    }

    val tasks = listOf<Activity>().asMutableLiveData()
}
