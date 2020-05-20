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
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import kotlinx.android.synthetic.main.activity_details_fragment.*

class ActivityDetailsFragment : BaseBoundFragment<ActivityDetailsViewModel>() {

    override val layoutRId: Int
        get() = R.layout.activity_details_fragment
    override val viewModelNameRId: Int
        get() = BR.viewModel
    override val viewModelClass: Class<ActivityDetailsViewModel>
        get() = ActivityDetailsViewModel::class.java
    override val title: String
        get() = "Details"
    override val headerStyles: MainActivity.HeaderStyles
        get() = MainActivity.HeaderStyles.INFO_SCREEN
    override val onHeaderLeftClick: () -> Unit
        get() = { findNavController().navigateUp() }

    private val args by navArgs<ActivityDetailsFragmentArgs>()

    override fun bindToViewModel() {
        viewModel.getActivity(args.activityId)

        viewModel.navigationEvent.observe(viewLifecycleOwner){
            findNavController().navigateUp()
        }

        btnDelete.setOnClickListener {
            viewModel.deleteActivity()
        }

        btnEdit.setOnClickListener {
            findNavController().navigate(ActivityDetailsFragmentDirections.actionActivityDetailsToActivityEdit(args.activityId))
        }
    }
}

@Module
abstract class ActivityDetailsModule {

    @Binds
    @IntoMap
    @ViewModelKey(ActivityDetailsViewModel::class)
    abstract fun provideActivityDetailsViewModel(viewModel: ActivityDetailsViewModel): ViewModel
}
