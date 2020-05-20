package com.ivan.androidultimateexample.ui.main.login

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.ivan.androidultimateexample.R

class LoginFragmentDirections private constructor() {
  companion object {
    fun actionLoginToActivities(): NavDirections =
        ActionOnlyNavDirections(R.id.action_login_to_activities)
  }
}
