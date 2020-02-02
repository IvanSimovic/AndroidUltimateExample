package com.ivan.androidultimateexample.ui.util
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations

fun <X, Y> LiveData<X>.liveMap(func: (X) -> (Y)): LiveData<Y> {
    return Transformations.map(this) { it?.let(func) }
}

fun <X, Y> LiveData<X>.liveSwitchMap(func: (X) -> (LiveData<Y>)): LiveData<Y> {
    return Transformations.switchMap(this) { it?.let(func) }
}

fun <X> X.asMutableLiveData(): MutableLiveData<X> = MutableLiveData<X>().also { it.value = this }
fun <X> X.asMutableLiveDataOnNonMainThread(): MutableLiveData<X> =
    MutableLiveData<X>().also { it.postValue(this) }

fun <X> mutableLiveDataOf(x: X): MutableLiveData<X> = x.asMutableLiveData()
fun <X> X.asSingleLiveEvent(): SingleLiveEvent<X> = SingleLiveEvent<X>().also { it.value = this }
fun <X> singleLiveEventOf(x: X): SingleLiveEvent<X> = x.asSingleLiveEvent()
fun <X> X.asLiveData(): LiveData<X> = MutableLiveData<X>().also { it.value = this }
fun <X> liveDataOf(x: X): LiveData<X> = x.asLiveData()

fun <X> List<X>.asLiveData(): LiveData<List<X>> =
    MutableLiveData<List<X>>().also { it.value = this }
