package com.ivan.androidultimateexample.ui.main.activities

import androidx.lifecycle.ViewModel
import androidx.lifecycle.observe
import androidx.navigation.fragment.findNavController
import com.ivan.androidultimateexample.BR
import com.ivan.androidultimateexample.R
import com.ivan.androidultimateexample.ui.base.di.viewmodel.ViewModelKey
import com.ivan.androidultimateexample.ui.base.view.BaseBoundFragment
import com.ivan.androidultimateexample.ui.main.activity.MainActivity
import com.ivan.androidultimateexample.ui.util.setUpAsDateTimePicker
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import kotlinx.android.synthetic.main.activity_create_fragment.*

class ActivityCreateFragment : BaseBoundFragment<ActivityCreateViewModel>() {

    override val layoutRId: Int
        get() = R.layout.activity_create_fragment
    override val viewModelNameRId: Int
        get() = BR.viewModel
    override val viewModelClass: Class<ActivityCreateViewModel>
        get() = ActivityCreateViewModel::class.java
    override val title: String
        get() = "Create"
    override val headerStyles: MainActivity.HeaderStyles
        get() = MainActivity.HeaderStyles.INFO_SCREEN
    override val onHeaderLeftClick: () -> Unit
        get() = { findNavController().navigateUp() }

    override fun bindToViewModel() {
        txtDate.setUpAsDateTimePicker({
            viewModel.activity.value!!.date = it
        }, viewModel.activity.value?.date)

        btnSave.setOnClickListener {
            viewModel.createActivity()
        }

        viewModel.navigationEvent.observe(viewLifecycleOwner) {
            it?.let { navigation ->
                when (navigation) {
                    ActivityCreateViewModel.NavigationEvent.BACK -> findNavController().navigateUp()
                }
            }
        }
    }
}

@Module
abstract class ActivityCreateModule {

    @Binds
    @IntoMap
    @ViewModelKey(ActivityCreateViewModel::class)
    abstract fun provideActivityCreateViewModel(viewModel: ActivityCreateViewModel): ViewModel
}
