package com.ivan.androidultimateexample.ui.base.di.module;

import com.ivan.androidultimateexample.ui.base.di.ActivityScope;
import com.ivan.androidultimateexample.ui.main.activity.MainActivity;
import com.ivan.androidultimateexample.ui.main.activity.MainFragmentBuilder;
import com.ivan.androidultimateexample.ui.main.activity.MainModule;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityBuilder_ProvideMainActivity.MainActivitySubcomponent.class)
public abstract class ActivityBuilder_ProvideMainActivity {
  private ActivityBuilder_ProvideMainActivity() {}

  @Binds
  @IntoMap
  @ClassKey(MainActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      MainActivitySubcomponent.Factory builder);

  @Subcomponent(modules = {MainModule.class, MainFragmentBuilder.class})
  @ActivityScope
  public interface MainActivitySubcomponent extends AndroidInjector<MainActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<MainActivity> {}
  }
}
