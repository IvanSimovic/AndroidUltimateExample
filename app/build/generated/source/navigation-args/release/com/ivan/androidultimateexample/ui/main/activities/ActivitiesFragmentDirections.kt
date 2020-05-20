package com.ivan.androidultimateexample.ui.main.activities

import android.os.Bundle
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.ivan.androidultimateexample.R
import kotlin.Int
import kotlin.String

class ActivitiesFragmentDirections private constructor() {
  private data class ActionActivitiesToActivityDetails(
    val activityId: String
  ) : NavDirections {
    override fun getActionId(): Int = R.id.action_activities_to_activity_details

    override fun getArguments(): Bundle {
      val result = Bundle()
      result.putString("activityId", this.activityId)
      return result
    }
  }

  companion object {
    fun actionActivitiesToActivityCreate(): NavDirections =
        ActionOnlyNavDirections(R.id.action_activities_to_activity_create)

    fun actionActivitiesToActivityDetails(activityId: String): NavDirections =
        ActionActivitiesToActivityDetails(activityId)
  }
}
