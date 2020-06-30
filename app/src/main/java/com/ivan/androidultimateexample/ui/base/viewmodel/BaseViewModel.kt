package com.ivan.androidultimateexample.ui.base.viewmodel

import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ivan.androidultimateexample.ui.util.SingleLiveEvent
import kotlinx.coroutines.*
import java.lang.Exception
import javax.inject.Inject

abstract class BaseViewModel(private val appScope: CoroutineScope) : ViewModel(), LifecycleObserver {
    val error = MutableLiveData<String>()
    private val isLoading = SingleLiveEvent<Boolean>()

    private var coroutineExceptionHandler = CoroutineExceptionHandler { _, exception ->
        error.postValue(exception.message)
    }

    protected val viewModelScope: CoroutineScope by lazy {
        CoroutineScope(Dispatchers.Main + SupervisorJob(null))
    }


    override fun onCleared() {
        super.onCleared()
        viewModelScope.cancel()
    }

    fun run(work: suspend CoroutineScope.() -> Unit) {
        viewModelScope.launch(coroutineExceptionHandler) {
            work()
        }
    }

    fun runBackground(work: suspend CoroutineScope.() -> Unit) {
        appScope.launch(coroutineExceptionHandler) {
            work()
        }
    }

    fun runWithLoading(work: suspend CoroutineScope.() -> Unit) {
        viewModelScope.launch(coroutineExceptionHandler) {
            try {
                isLoading.postValue(true)
                work()
            } catch (exception: Exception) {
                coroutineExceptionHandler.handleException(this.coroutineContext, exception)
            } finally {
                isLoading.postValue(false)
            }
        }
    }
}
