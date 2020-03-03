package com.ivan.androidultimateexample.ui.main.login

import androidx.lifecycle.ViewModel
import androidx.navigation.fragment.findNavController
import com.ivan.androidultimateexample.BR
import com.ivan.androidultimateexample.R
import androidx.lifecycle.observe
import com.ivan.androidultimateexample.ui.base.di.viewmodel.ViewModelKey
import com.ivan.androidultimateexample.ui.base.view.BaseBoundFragment
import com.ivan.androidultimateexample.ui.main.activity.MainActivity
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import kotlinx.android.synthetic.main.login_fragment.*

class LoginFragment: BaseBoundFragment<LoginViewModel>() {

    override val layoutRId: Int
        get() = R.layout.login_fragment
    override val viewModelNameRId: Int
        get() = BR.viewModel
    override val viewModelClass: Class<LoginViewModel>
        get() = LoginViewModel::class.java
    override val title: String
        get() = "Login"
    override val headerStyles: MainActivity.HeaderStyles
        get() = MainActivity.HeaderStyles.BASE_SCREEN
    override val onHeaderLeftClick: () -> Unit
        get() = { }

    override fun bindToViewModel() {
        btnSignIn.setOnClickListener {
            viewModel.login()
        }
        viewModel.onLogin.observe(viewLifecycleOwner) {
            findNavController().navigate(LoginFragmentDirections.actionLoginToActivities())
        }
    }
}

@Module
abstract class LoginModule {

    @Binds
    @IntoMap
    @ViewModelKey(LoginViewModel::class)
    abstract fun provideViewModel(viewModel: LoginViewModel): ViewModel
}
