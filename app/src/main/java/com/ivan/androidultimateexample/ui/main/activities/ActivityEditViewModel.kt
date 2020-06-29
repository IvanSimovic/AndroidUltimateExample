package com.ivan.androidultimateexample.ui.main.activities

import androidx.lifecycle.MutableLiveData
import com.ivan.androidultimateexample.ui.base.viewmodel.BaseViewModel
import com.ivan.androidultimateexample.ui.util.SingleLiveEvent
import com.ivan.todoengine.logic.activity.Activity
import com.ivan.todoengine.logic.activity.ActivityLogic
import kotlinx.coroutines.CoroutineScope
import javax.inject.Inject

class ActivityEditViewModel
@Inject constructor(
    private val activityLogic: ActivityLogic,
    appScope: CoroutineScope
) : BaseViewModel(appScope) {
    val activity = MutableLiveData<Activity>()

    fun getActivity(activityId: String) {
        run {
            activity.value = activityLogic.getActivity(activityId)
        }
    }

    fun updateActivity() {
        runBackground {
            activity.value?.let {
                activityLogic.updateActivity(it)
                navigationEvent.postValue(NavigationEvent.BACK)
            }
        }
    }

    val navigationEvent = SingleLiveEvent<NavigationEvent>()

    enum class NavigationEvent {
        BACK
    }
}
