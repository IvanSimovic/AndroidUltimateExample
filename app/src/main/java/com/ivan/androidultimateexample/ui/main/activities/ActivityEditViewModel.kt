package com.ivan.androidultimateexample.ui.main.activities

import androidx.lifecycle.MutableLiveData
import com.ivan.androidultimateexample.ui.base.viewmodel.BaseViewModel
import com.ivan.androidultimateexample.ui.util.SingleLiveEvent
import com.ivan.todoengine.logic.task.Activity
import com.ivan.todoengine.logic.task.ActivityLogic
import kotlinx.coroutines.runBlocking
import javax.inject.Inject

class ActivityEditViewModel
@Inject constructor(
    private val activityLogic: ActivityLogic
) : BaseViewModel() {
    val activity = MutableLiveData<Activity>()

    fun getActivity(activityId: String) {
        runForUI {
            runBlocking {
                activity.value = activityLogic.getActivity(activityId)
            }
        }
    }

    fun updateActivity() {
        run {
            runBlocking {
                activity.value?.let {
                    activityLogic.updateActivity(it)
                    navigationEvent.postValue(NavigationEvent.BACK)
                }
            }
        }
    }

    val navigationEvent = SingleLiveEvent<NavigationEvent>()

    enum class NavigationEvent {
        BACK
    }
}
