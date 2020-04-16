package com.ivan.androidultimateexample.ui.base.view

import android.widget.Toast
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.lifecycle.observe
import com.ivan.androidultimateexample.ui.base.viewmodel.BaseViewModel
import com.ivan.androidultimateexample.ui.main.activity.MainActivity
import javax.inject.Inject

/**
 * Base for all kotlin fragments with viewmodels
 */
abstract class BaseBoundFragment<VIEW_MODEL_TYPE : BaseViewModel> : BaseFragment(),
    BoundView<VIEW_MODEL_TYPE> {

    /**
     * Use this if you need to get activity view model
     * (ViewModelProviders.of(activity, viewModelFactory).get(activityViewModelClass))
     *
     * That way it will use the injected instance of ViewModel
     */
    @Inject
    protected lateinit var viewModelFactory: ViewModelProvider.Factory

    final override lateinit var viewModel: VIEW_MODEL_TYPE
    abstract val title: String
    abstract val headerStyles: MainActivity.HeaderStyles
    abstract val onHeaderLeftClick: () -> Unit

    override fun postInflate(viewDataBinding: ViewDataBinding?) {
        super.postInflate(viewDataBinding)

        viewModel = ViewModelProviders.of(this, viewModelFactory).get(viewModelClass)
        lifecycle.addObserver(viewModel)

        viewDataBinding?.let {
            val viewModelRId = viewModelNameRId
            if (viewModelRId != 0) {
                it.setVariable(viewModelRId, viewModel)
                it.lifecycleOwner = viewLifecycleOwner
                it.executePendingBindings()
            }
        }

        viewModel.error.observe(viewLifecycleOwner) {
            it?.let {
                Toast.makeText(context, it, Toast.LENGTH_LONG).show()
            }
        }

        bindToViewModel()
        setTitle(title)
    }

    private fun setTitle(title: String) {
        val parentActivity = activity
        if (parentActivity is MainActivity)
            parentActivity.setHeader(title, headerStyles, onHeaderLeftClick)
    }
}
