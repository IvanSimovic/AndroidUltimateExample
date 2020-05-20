package com.ivan.androidultimateexample.ui.main.activity;

import com.ivan.androidultimateexample.ui.base.di.FragmentScope;
import com.ivan.androidultimateexample.ui.main.activities.ActivityCreateFragment;
import com.ivan.androidultimateexample.ui.main.activities.ActivityCreateModule;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      MainFragmentBuilder_ProvideActivityCreateFragment.ActivityCreateFragmentSubcomponent.class
)
public abstract class MainFragmentBuilder_ProvideActivityCreateFragment {
  private MainFragmentBuilder_ProvideActivityCreateFragment() {}

  @Binds
  @IntoMap
  @ClassKey(ActivityCreateFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ActivityCreateFragmentSubcomponent.Factory builder);

  @Subcomponent(modules = ActivityCreateModule.class)
  @FragmentScope
  public interface ActivityCreateFragmentSubcomponent
      extends AndroidInjector<ActivityCreateFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ActivityCreateFragment> {}
  }
}
