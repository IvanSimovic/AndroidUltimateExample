package com.ivan.todoengine.logic.activity

import com.ivan.todoengine.data.repository.activity.ActivityRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ActivityLogic @Inject constructor(
    private val activityRepository: ActivityRepository
) {

    suspend fun insertActivity(activity: Activity) {
        activityRepository.insertActivity(activity)
    }

    suspend fun updateActivity(activity: Activity) {
        activityRepository.updateActivity(activity)
    }

    suspend fun deleteActivity(id: String) {
        activityRepository.deleteActivity(id)
    }

    suspend fun getActivities() = activityRepository.getActivities()

    suspend fun getActivity(id: String) = activityRepository.getActivity(id)
}