package com.ivan.androidultimateexample.ui.base.viewmodel

import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

abstract class BaseViewModel : ViewModel(), LifecycleObserver {
    val error = MutableLiveData<Exception>()

    fun runForUI(work: () -> Unit) {
        viewModelScope.launch {
            try {
                work()
            } catch (ex: Exception) {
                error.value = ex
            }
        }
    }

    fun run(work: () -> Unit) {
        GlobalScope.launch {
            try {
                work()
            } catch (ex: Exception) {
                error.postValue(ex)
            }
        }
    }

}