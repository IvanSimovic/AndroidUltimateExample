package com.ivan.androidultimateexample.ui.main.activity;

import com.ivan.androidultimateexample.ui.base.di.FragmentScope;
import com.ivan.androidultimateexample.ui.main.activities.ActivityDetailsFragment;
import com.ivan.androidultimateexample.ui.main.activities.ActivityDetailsModule;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      MainFragmentBuilder_ProvideActivityDetailsFragment.ActivityDetailsFragmentSubcomponent.class
)
public abstract class MainFragmentBuilder_ProvideActivityDetailsFragment {
  private MainFragmentBuilder_ProvideActivityDetailsFragment() {}

  @Binds
  @IntoMap
  @ClassKey(ActivityDetailsFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ActivityDetailsFragmentSubcomponent.Factory builder);

  @Subcomponent(modules = ActivityDetailsModule.class)
  @FragmentScope
  public interface ActivityDetailsFragmentSubcomponent
      extends AndroidInjector<ActivityDetailsFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ActivityDetailsFragment> {}
  }
}
