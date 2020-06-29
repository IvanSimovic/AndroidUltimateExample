package com.ivan.androidultimateexample.ui.splash

import android.content.Intent
import androidx.lifecycle.ViewModel
import com.ivan.androidultimateexample.ui.base.di.viewmodel.ViewModelKey
import com.ivan.androidultimateexample.ui.base.view.BaseBoundActivity
import com.ivan.androidultimateexample.ui.base.viewmodel.BaseViewModel
import com.ivan.androidultimateexample.ui.main.activity.MainActivity
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import kotlinx.coroutines.CoroutineScope
import javax.inject.Inject

class SplashActivity : BaseBoundActivity<SplashViewModel>() {
    override val layoutRId: Int
        get() = 0
    override val viewModelNameRId: Int
        get() = 0
    override val viewModelClass: Class<SplashViewModel>
        get() = SplashViewModel::class.java

    override fun bindToViewModel() {
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
}

class SplashViewModel
@Inject constructor(
    appScope: CoroutineScope
) : BaseViewModel(appScope)

@Module
abstract class SplashModule {

    @Binds
    @IntoMap
    @ViewModelKey(SplashViewModel::class)
    abstract fun provideSplashViewModel(splashViewModel: SplashViewModel): ViewModel
}
