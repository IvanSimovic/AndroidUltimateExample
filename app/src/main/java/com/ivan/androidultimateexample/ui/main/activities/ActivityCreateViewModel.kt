package com.ivan.androidultimateexample.ui.main.activities

import com.ivan.androidultimateexample.ui.base.viewmodel.BaseViewModel
import com.ivan.androidultimateexample.ui.util.SingleLiveEvent
import com.ivan.androidultimateexample.ui.util.asMutableLiveData
import com.ivan.todoengine.logic.activity.ActivityLogic
import com.ivan.todoengine.logic.activity.insertTask
import javax.inject.Inject

class ActivityCreateViewModel
@Inject constructor(
    private val activityLogic: ActivityLogic
) : BaseViewModel() {

    val activity = insertTask().asMutableLiveData()

    fun createActivity() {
        run {
            activity.value?.let {
                activityLogic.insertActivity(it)
                navigationEvent.postValue(NavigationEvent.BACK)
            }
        }
    }

    val navigationEvent = SingleLiveEvent<NavigationEvent>()

    enum class NavigationEvent {
        BACK
    }
}
