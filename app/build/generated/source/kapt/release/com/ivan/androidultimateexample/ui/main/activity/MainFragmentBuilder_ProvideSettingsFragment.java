package com.ivan.androidultimateexample.ui.main.activity;

import com.ivan.androidultimateexample.ui.base.di.FragmentScope;
import com.ivan.androidultimateexample.ui.main.settings.SettingsFragment;
import com.ivan.androidultimateexample.ui.main.settings.SettingsModule;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = MainFragmentBuilder_ProvideSettingsFragment.SettingsFragmentSubcomponent.class
)
public abstract class MainFragmentBuilder_ProvideSettingsFragment {
  private MainFragmentBuilder_ProvideSettingsFragment() {}

  @Binds
  @IntoMap
  @ClassKey(SettingsFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SettingsFragmentSubcomponent.Factory builder);

  @Subcomponent(modules = SettingsModule.class)
  @FragmentScope
  public interface SettingsFragmentSubcomponent extends AndroidInjector<SettingsFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SettingsFragment> {}
  }
}
