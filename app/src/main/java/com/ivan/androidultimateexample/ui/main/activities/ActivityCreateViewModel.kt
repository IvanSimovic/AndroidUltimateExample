package com.ivan.androidultimateexample.ui.main.activities

import com.ivan.androidultimateexample.ui.base.viewmodel.BaseViewModel
import com.ivan.androidultimateexample.ui.util.SingleLiveEvent
import com.ivan.androidultimateexample.ui.util.asMutableLiveData
import com.ivan.todoengine.logic.task.ActivityLogic
import com.ivan.todoengine.logic.task.insertTask
import kotlinx.coroutines.runBlocking
import javax.inject.Inject

class ActivityCreateViewModel
@Inject constructor(
    private val activityLogic: ActivityLogic
) : BaseViewModel() {

    val activity = insertTask().asMutableLiveData()

    fun createActivity() {
        run {
            runBlocking {
                activity.value?.let {
                    activityLogic.insertActivity(it)
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
