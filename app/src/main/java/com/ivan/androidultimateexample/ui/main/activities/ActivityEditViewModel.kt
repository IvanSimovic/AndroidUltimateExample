package com.ivan.androidultimateexample.ui.main.activities

import androidx.lifecycle.MutableLiveData
import com.ivan.androidultimateexample.ui.base.viewmodel.BaseViewModel
import com.ivan.androidultimateexample.ui.util.SingleLiveEvent
import com.ivan.todoengine.logic.activity.Activity
import com.ivan.todoengine.logic.activity.ActivityLogic
import javax.inject.Inject

class ActivityEditViewModel
@Inject constructor(
    private val activityLogic: ActivityLogic
) : BaseViewModel() {
    val activity = MutableLiveData<Activity>()

    fun getActivity(activityId: String) {
        run {
            activity.value = activityLogic.getActivity(activityId)
        }
    }

    fun updateActivity() {
        run {
            activity.value?.let {
                activityLogic.updateActivity(it)
                navigationEvent.value = NavigationEvent.BACK
            }
        }
    }

    val navigationEvent = SingleLiveEvent<NavigationEvent>()

    enum class NavigationEvent {
        BACK
    }
}
