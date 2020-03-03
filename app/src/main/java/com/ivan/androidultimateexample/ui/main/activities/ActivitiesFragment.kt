package com.ivan.androidultimateexample.ui.main.activities

import androidx.lifecycle.ViewModel
import androidx.lifecycle.observe
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.ivan.androidultimateexample.BR
import com.ivan.androidultimateexample.R
import com.ivan.androidultimateexample.ui.base.di.viewmodel.ViewModelKey
import com.ivan.androidultimateexample.ui.base.view.BaseBoundFragment
import com.ivan.androidultimateexample.ui.base.view.MarginItemDecoration
import com.ivan.androidultimateexample.ui.main.activities.list.ActivityAdapter
import com.ivan.androidultimateexample.ui.main.activity.MainActivity
import com.ivan.androidultimateexample.ui.main.activities.list.ActivityModel
import com.ivan.todoengine.logic.activity.Activity
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import kotlinx.android.synthetic.main.activities_fragment.*

class ActivitiesFragment : BaseBoundFragment<ActivitiesViewModel>() {

    override val layoutRId: Int
        get() = R.layout.activities_fragment
    override val viewModelNameRId: Int
        get() = BR.viewModel
    override val viewModelClass: Class<ActivitiesViewModel>
        get() = ActivitiesViewModel::class.java
    override val title: String
        get() = "Activities"
    override val headerStyles: MainActivity.HeaderStyles
        get() = MainActivity.HeaderStyles.BASE_SCREEN
    override val onHeaderLeftClick: () -> Unit
        get() = { }

    override fun bindToViewModel() {
        val adapter = ActivityAdapter()
        rwActivities.layoutManager = LinearLayoutManager(context)
        rwActivities.adapter = adapter
        rwActivities.addItemDecoration(MarginItemDecoration(resources.getDimension(R.dimen.list_item_margin).toInt()))
        viewModel.tasks.observe(viewLifecycleOwner) {
            adapter.refreshData(it)
        }

        adapter.setRowClickListener(object : ActivityModel.RowClickListener {
            override fun onRowClicked(activity: Activity) {
                findNavController().navigate(ActivitiesFragmentDirections.actionActivitiesToActivityDetails(activity.id))
            }
        })

        btnAdd.setOnClickListener {
            findNavController().navigate(ActivitiesFragmentDirections.actionActivitiesToActivityCreate())
        }
    }
}

@Module
abstract class ActivitiesModule {

    @Binds
    @IntoMap
    @ViewModelKey(ActivitiesViewModel::class)
    abstract fun provideActivitiesViewModel(viewModel: ActivitiesViewModel): ViewModel
}
