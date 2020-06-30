package com.ivan.androidultimateexample.ui.main.activities

import androidx.lifecycle.MutableLiveData
import androidx.navigation.fragment.findNavController
import com.ivan.androidultimateexample.ui.base.viewmodel.BaseViewModel
import com.ivan.androidultimateexample.ui.util.SingleLiveEvent
import com.ivan.androidultimateexample.ui.util.asSingleLiveEvent
import com.ivan.todoengine.logic.activity.Activity
import com.ivan.todoengine.logic.activity.ActivityLogic
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import javax.inject.Inject

class ActivityDetailsViewModel
@Inject constructor(
    private val activityLogic: ActivityLogic,
    appScope: CoroutineScope
) : BaseViewModel(appScope) {

    val activity = MutableLiveData<Activity>()
    val navigationEvent = SingleLiveEvent<Unit>()

    fun getActivity(taskId: String) = viewModelScope.launch {
        activity.value = activityLogic.getActivity(taskId)
    }

    fun deleteActivity() {
        runBackground {
            activity.value?.let {
                activityLogic.deleteActivity(it.id)
                navigationEvent.postValue(Unit)
            }
        }
    }
}
