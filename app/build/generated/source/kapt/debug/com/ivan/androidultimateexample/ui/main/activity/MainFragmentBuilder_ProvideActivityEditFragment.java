package com.ivan.androidultimateexample.ui.main.activity;

import com.ivan.androidultimateexample.ui.base.di.FragmentScope;
import com.ivan.androidultimateexample.ui.main.activities.ActivityEditFragment;
import com.ivan.androidultimateexample.ui.main.activities.ActivityEditModule;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      MainFragmentBuilder_ProvideActivityEditFragment.ActivityEditFragmentSubcomponent.class
)
public abstract class MainFragmentBuilder_ProvideActivityEditFragment {
  private MainFragmentBuilder_ProvideActivityEditFragment() {}

  @Binds
  @IntoMap
  @ClassKey(ActivityEditFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ActivityEditFragmentSubcomponent.Factory builder);

  @Subcomponent(modules = ActivityEditModule.class)
  @FragmentScope
  public interface ActivityEditFragmentSubcomponent extends AndroidInjector<ActivityEditFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ActivityEditFragment> {}
  }
}
