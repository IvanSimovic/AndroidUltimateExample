package com.ivan.androidultimateexample.ui.main.activities

import android.os.Bundle
import androidx.navigation.NavDirections
import com.ivan.androidultimateexample.R
import kotlin.Int
import kotlin.String

class ActivityDetailsFragmentDirections private constructor() {
  private data class ActionActivityDetailsToActivityEdit(
    val activityId: String
  ) : NavDirections {
    override fun getActionId(): Int = R.id.action_activity_details_to_activity_edit

    override fun getArguments(): Bundle {
      val result = Bundle()
      result.putString("activityId", this.activityId)
      return result
    }
  }

  companion object {
    fun actionActivityDetailsToActivityEdit(activityId: String): NavDirections =
        ActionActivityDetailsToActivityEdit(activityId)
  }
}
