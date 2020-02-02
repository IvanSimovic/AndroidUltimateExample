package com.ivan.androidultimateexample.ui.base.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.ivan.androidultimateexample.R
import com.ivan.androidultimateexample.ui.base.store.SharedPreferencesStore
import com.ivan.androidultimateexample.ui.base.viewmodel.BaseViewModel
import javax.inject.Inject
import org.jetbrains.anko.defaultSharedPreferences

/**
 * Base activity for all activities with viewmodels
 */
abstract class BaseBoundActivity<VIEW_MODEL_TYPE : BaseViewModel> :
    BaseActivity(), BoundView<VIEW_MODEL_TYPE> {

    @Inject
    protected lateinit var viewModelFactory: ViewModelProvider.Factory

    final override lateinit var viewModel: VIEW_MODEL_TYPE
    protected val DEFAULT_NIGHT_MODE = "DEFAULT_NIGHT_MODE"

    override fun onCreate(savedInstanceState: Bundle?) {
        if (SharedPreferencesStore(defaultSharedPreferences).readInt(DEFAULT_NIGHT_MODE) == AppCompatDelegate.MODE_NIGHT_YES) {
            setTheme(R.style.AppThemeDark)
        }
        super.onCreate(savedInstanceState)
    }

    /**
     * Prepares viewmodel before inflating
     * Don't forget to call super due to this!
     */
    override fun preInflate() {
        super.preInflate()
        viewModel = ViewModelProviders.of(this, viewModelFactory).get(viewModelClass)
        lifecycle.addObserver(viewModel)
    }

    /**
     * Binds viewmodel after inflating
     * Don't forget to call super due to this!
     */
    override fun postInflate(viewDataBinding: ViewDataBinding?) {
        super.postInflate(viewDataBinding)
        viewDataBinding?.let {
            val viewModelRId = viewModelNameRId
            if (viewModelRId != 0) {
                it.setVariable(viewModelRId, viewModel)
                it.setLifecycleOwner(this)
                it.executePendingBindings()
            }
        }

        bindToViewModel()
    }
}
