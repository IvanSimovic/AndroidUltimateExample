package com.ivan.androidultimateexample.ui.main.activity;

import com.ivan.androidultimateexample.ui.base.di.FragmentScope;
import com.ivan.androidultimateexample.ui.main.activities.ActivitiesFragment;
import com.ivan.androidultimateexample.ui.main.activities.ActivitiesModule;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = MainFragmentBuilder_ProvideActivitiesFragment.ActivitiesFragmentSubcomponent.class
)
public abstract class MainFragmentBuilder_ProvideActivitiesFragment {
  private MainFragmentBuilder_ProvideActivitiesFragment() {}

  @Binds
  @IntoMap
  @ClassKey(ActivitiesFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ActivitiesFragmentSubcomponent.Factory builder);

  @Subcomponent(modules = ActivitiesModule.class)
  @FragmentScope
  public interface ActivitiesFragmentSubcomponent extends AndroidInjector<ActivitiesFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ActivitiesFragment> {}
  }
}
