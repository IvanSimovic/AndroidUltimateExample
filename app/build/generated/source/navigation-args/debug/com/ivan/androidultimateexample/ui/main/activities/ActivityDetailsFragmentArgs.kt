package com.ivan.androidultimateexample.ui.main.activities

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

data class ActivityDetailsFragmentArgs(
  val activityId: String
) : NavArgs {
  fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("activityId", this.activityId)
    return result
  }

  companion object {
    @JvmStatic
    fun fromBundle(bundle: Bundle): ActivityDetailsFragmentArgs {
      bundle.setClassLoader(ActivityDetailsFragmentArgs::class.java.classLoader)
      val __activityId : String?
      if (bundle.containsKey("activityId")) {
        __activityId = bundle.getString("activityId")
        if (__activityId == null) {
          throw IllegalArgumentException("Argument \"activityId\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"activityId\" is missing and does not have an android:defaultValue")
      }
      return ActivityDetailsFragmentArgs(__activityId)
    }
  }
}
