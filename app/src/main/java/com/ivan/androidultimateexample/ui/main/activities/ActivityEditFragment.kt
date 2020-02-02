package com.ivan.androidultimateexample.ui.main.activities

import androidx.lifecycle.ViewModel
import androidx.lifecycle.observe
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.ivan.androidultimateexample.BR
import com.ivan.androidultimateexample.R
import com.ivan.androidultimateexample.ui.base.di.viewmodel.ViewModelKey
import com.ivan.androidultimateexample.ui.base.view.BaseBoundFragment
import com.ivan.androidultimateexample.ui.main.activity.MainActivity
import com.ivan.androidultimateexample.ui.util.setUpAsDateTimePicker
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import kotlinx.android.synthetic.main.activity_edit_fragment.btnSave
import kotlinx.android.synthetic.main.activity_edit_fragment.txtDate

class ActivityEditFragment : BaseBoundFragment<ActivityEditViewModel>() {

    override val layoutRId: Int
        get() = R.layout.activity_edit_fragment
    override val viewModelNameRId: Int
        get() = BR.viewModel
    override val viewModelClass: Class<ActivityEditViewModel>
        get() = ActivityEditViewModel::class.java
    override val title: String
        get() = "Edit"
    override val headerStyles: MainActivity.HeaderStyles
        get() = MainActivity.HeaderStyles.INFO_SCREEN
    override val onHeaderLeftClick: () -> Unit
        get() = { findNavController().navigateUp() }

    private val args by navArgs<ActivityEditFragmentArgs>()

    override fun bindToViewModel() {
        viewModel.activity.observe(viewLifecycleOwner) {
            it?.let {
                txtDate.setUpAsDateTimePicker({
                    viewModel.activity.value!!.date = it
                }, it.date)
            }
        }
        viewModel.getActivity(args.activityId)
        btnSave.setOnClickListener {
            viewModel.updateActivity()
        }

        viewModel.navigationEvent.observe(viewLifecycleOwner) {
            it?.let { navigation ->
                when (navigation) {
                    ActivityEditViewModel.NavigationEvent.BACK -> findNavController().navigateUp()
                }
            }
        }
    }
}

@Module
abstract class ActivityEditModule {

    @Binds
    @IntoMap
    @ViewModelKey(ActivityEditViewModel::class)
    abstract fun provideActivityEditViewModel(viewModel: ActivityEditViewModel): ViewModel
}
