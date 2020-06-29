package com.ivan.todoengine.data.repository.activity

import com.ivan.todoengine.data.api.ActivityApi
import com.ivan.todoengine.data.local.activity.ActivityDao
import com.ivan.todoengine.logic.activity.Activity
import com.ivan.todoengine.logic.activity.toActivity
import com.ivan.todoengine.logic.activity.toActivityDM
import com.ivan.todoengine.logic.activity.toActivityEntity
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ActivityRepository @Inject constructor(
    private val activityDao: ActivityDao,
    private val activityApi: ActivityApi
) {


    /*suspend fun insertActivity(task: Activity) {
        activityApi.create(task.toActivityDM())
    }

    suspend fun updateActivity(task: Activity) {
        activityApi.update(task.id, task.toActivityDM())
    }

    suspend fun deleteActivity(id: String) {
        activityApi.delete(id)
    }

    suspend fun getActivities() =
        activityApi.list().body()!!.toActivity()

    suspend fun getActivity(id: String) = activityApi.details(id).body()!!.toActivity()
*/

    suspend fun insertActivity(task: Activity) {
        activityDao.create(task.toActivityEntity())
    }

    suspend fun updateActivity(task: Activity) {
        activityDao.update(task.toActivityEntity())
    }

    suspend fun deleteActivity(id: String) {
        activityDao.delete(id)
    }

    suspend fun getActivities() =
        activityDao.list().toActivity()

    suspend fun getActivity(id: String) = activityDao.details(id).toActivity()
}