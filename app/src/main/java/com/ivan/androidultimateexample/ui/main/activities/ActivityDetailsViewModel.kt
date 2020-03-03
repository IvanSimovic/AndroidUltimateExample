package com.ivan.androidultimateexample.ui.main.activities

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.ivan.androidultimateexample.ui.base.viewmodel.BaseViewModel
import com.ivan.todoengine.logic.activity.Activity
import com.ivan.todoengine.logic.activity.ActivityLogic
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import javax.inject.Inject

class ActivityDetailsViewModel
@Inject constructor(
    private val activityLogic: ActivityLogic
) : BaseViewModel() {

    val activity = MutableLiveData<Activity>()

    fun getActivity(taskId: String) = viewModelScope.launch {
        activity.value = activityLogic.getActivity(taskId)
    }

    fun deleteActivity() {
        run {
            runBlocking {
                activity.value?.let {
                    activityLogic.deleteActivity(it.id)
                }
            }
        }
    }

}
