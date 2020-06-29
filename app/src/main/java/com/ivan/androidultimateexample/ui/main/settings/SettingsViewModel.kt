package com.ivan.androidultimateexample.ui.main.settings

import com.ivan.androidultimateexample.ui.base.viewmodel.BaseViewModel
import kotlinx.coroutines.CoroutineScope
import javax.inject.Inject

class SettingsViewModel @Inject constructor(
    appScope: CoroutineScope
) : BaseViewModel(appScope)
