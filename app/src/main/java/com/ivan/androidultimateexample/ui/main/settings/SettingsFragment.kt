package com.ivan.androidultimateexample.ui.main.settings

import androidx.lifecycle.ViewModel
import com.ivan.androidultimateexample.R
import com.ivan.androidultimateexample.BR
import com.ivan.androidultimateexample.ui.base.di.viewmodel.ViewModelKey
import com.ivan.androidultimateexample.ui.base.view.BaseBoundFragment
import com.ivan.androidultimateexample.ui.main.activity.MainActivity
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

class SettingsFragment: BaseBoundFragment<SettingsViewModel>() {

    override val layoutRId: Int
        get() = R.layout.fragment_settings
    override val viewModelNameRId: Int
        get() = BR.viewModel
    override val viewModelClass: Class<SettingsViewModel>
        get() = SettingsViewModel::class.java
    override val title: String
        get() = ""
    override val headerStyles: MainActivity.HeaderStyles
        get() = MainActivity.HeaderStyles.BASE_SCREEN
    override val onHeaderLeftClick: () -> Unit
        get() = { }

    override fun bindToViewModel() {
    }
}

@Module
abstract class SettingsModule {

    @Binds
    @IntoMap
    @ViewModelKey(SettingsViewModel::class)
    abstract fun provideSettingsViewModel(viewModel: SettingsViewModel): ViewModel
}
