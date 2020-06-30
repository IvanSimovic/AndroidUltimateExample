package com.ivan.androidultimateexample.ui.main.activity

import com.ivan.androidultimateexample.ui.base.viewmodel.BaseViewModel
import kotlinx.coroutines.CoroutineScope
import javax.inject.Inject

class MainViewModel
@Inject constructor(appScope: CoroutineScope) : BaseViewModel(appScope)
