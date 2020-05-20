package com.ivan.androidultimateexample.ui.base.di.module;

import com.ivan.androidultimateexample.ui.base.di.ActivityScope;
import com.ivan.androidultimateexample.ui.splash.SplashActivity;
import com.ivan.androidultimateexample.ui.splash.SplashModule;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityBuilder_ProvideSplashActivity.SplashActivitySubcomponent.class)
public abstract class ActivityBuilder_ProvideSplashActivity {
  private ActivityBuilder_ProvideSplashActivity() {}

  @Binds
  @IntoMap
  @ClassKey(SplashActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SplashActivitySubcomponent.Factory builder);

  @Subcomponent(modules = SplashModule.class)
  @ActivityScope
  public interface SplashActivitySubcomponent extends AndroidInjector<SplashActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SplashActivity> {}
  }
}
