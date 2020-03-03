package com.ivan.androidultimateexample.ui.main.activity

import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate
import androidx.appcompat.app.AppCompatDelegate.MODE_NIGHT_NO
import androidx.appcompat.app.AppCompatDelegate.MODE_NIGHT_YES
import androidx.lifecycle.ViewModel
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.ivan.androidultimateexample.R
import com.ivan.androidultimateexample.BR
import com.ivan.androidultimateexample.ui.base.di.FragmentScope
import com.ivan.androidultimateexample.ui.base.di.viewmodel.ViewModelKey
import com.ivan.androidultimateexample.ui.base.store.SharedPreferencesStore
import com.ivan.androidultimateexample.ui.base.view.BaseBoundActivity
import com.ivan.androidultimateexample.ui.main.settings.SettingsFragment
import com.ivan.androidultimateexample.ui.main.settings.SettingsModule
import com.ivan.androidultimateexample.ui.main.activities.*
import com.ivan.androidultimateexample.ui.main.login.LoginFragment
import com.ivan.androidultimateexample.ui.main.login.LoginModule
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.toolbar.view.*
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.jetbrains.anko.defaultSharedPreferences

class MainActivity : BaseBoundActivity<MainViewModel>() {

    override val layoutRId: Int
        get() = R.layout.activity_main
    override val viewModelNameRId: Int
        get() = BR.viewModel
    override val viewModelClass: Class<MainViewModel>
        get() = MainViewModel::class.java

    var headerStyles: HeaderStyles = HeaderStyles.LANDING_PAGE

    override fun bindToViewModel() {
        val navigationController = findNavController(R.id.main_navigation_host)
        nav_view.setupWithNavController(navigationController)

    }

    fun setHeader(title: String, headerStyle: HeaderStyles, leftClick: () -> Unit) {
        this.headerStyles = headerStyle
        toolbar.txtTitle.text = title
        toolbar.btnLeft.setOnClickListener { leftClick() }
        when (headerStyle) {
            HeaderStyles.BASE_SCREEN -> {
                toolbar.btnLeft.visibility = INVISIBLE
            }
            HeaderStyles.INFO_SCREEN -> {
                toolbar.btnLeft.visibility = VISIBLE
                toolbar.imgLeftIcon.setImageResource(R.drawable.ic_arrow_back)
            }
            HeaderStyles.LANDING_PAGE -> toolbar.btnLeft.visibility = INVISIBLE
        }

        toolbar.btnRight.setOnClickListener {
            val currentNightMode =
                SharedPreferencesStore(defaultSharedPreferences).readInt(DEFAULT_NIGHT_MODE)
            val nightMode =
                if (currentNightMode == MODE_NIGHT_YES) MODE_NIGHT_NO else MODE_NIGHT_YES
            AppCompatDelegate.setDefaultNightMode(nightMode)
            SharedPreferencesStore(defaultSharedPreferences).put(DEFAULT_NIGHT_MODE, nightMode)
            recreate()
        }
    }

    enum class HeaderStyles(value: Int) {
        BASE_SCREEN(0),
        INFO_SCREEN(1),
        LANDING_PAGE(2),
    }

    private var doubleBackToExitPressedOnce = false
    override fun onBackPressed() {
        if (headerStyles == HeaderStyles.BASE_SCREEN) {
            if (doubleBackToExitPressedOnce) {
                finishAndRemoveTask()
                return
            }

            this.doubleBackToExitPressedOnce = true
            Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show()

            GlobalScope.launch {
                delay(2000)
                doubleBackToExitPressedOnce = false
            }
        } else
            super.onBackPressed()
    }
}

@Module
abstract class MainModule {

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    abstract fun provideMainViewModel(mainViewModel: MainViewModel): ViewModel
}

@Module
abstract class MainFragmentBuilder {
    @FragmentScope
    @ContributesAndroidInjector(modules = [ActivitiesModule::class])
    abstract fun provideActivitiesFragment(): ActivitiesFragment

    @FragmentScope
    @ContributesAndroidInjector(modules = [ActivityDetailsModule::class])
    abstract fun provideActivityDetailsFragment(): ActivityDetailsFragment

    @FragmentScope
    @ContributesAndroidInjector(modules = [ActivityEditModule::class])
    abstract fun provideActivityEditFragment(): ActivityEditFragment

    @FragmentScope
    @ContributesAndroidInjector(modules = [ActivityCreateModule::class])
    abstract fun provideActivityCreateFragment(): ActivityCreateFragment

    @FragmentScope
    @ContributesAndroidInjector(modules = [SettingsModule::class])
    abstract fun provideSettingsFragment(): SettingsFragment

    @FragmentScope
    @ContributesAndroidInjector(modules = [LoginModule::class])
    abstract fun provideLoginFragment(): LoginFragment
}

