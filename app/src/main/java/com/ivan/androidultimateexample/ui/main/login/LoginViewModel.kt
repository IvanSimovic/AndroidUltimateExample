package com.ivan.androidultimateexample.ui.main.login

import androidx.lifecycle.MutableLiveData
import com.ivan.androidultimateexample.ui.base.viewmodel.BaseViewModel
import com.ivan.todoengine.networking.session.Credentials
import com.ivan.todoengine.networking.session.SessionRepository
import kotlinx.coroutines.runBlocking
import javax.inject.Inject

class LoginViewModel
@Inject constructor(
    var sessionRepository: SessionRepository
) : BaseViewModel() {

    var email = ""
    var password = ""

    val onLogin = MutableLiveData<Unit>()

    fun login() {
        run {
            runBlocking {
                sessionRepository.logIn(Credentials(email, password))
                onLogin.postValue(Unit)
            }
        }
    }

}
