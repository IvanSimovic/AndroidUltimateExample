// Generated by Dagger (https://dagger.dev).
package com.ivan.androidultimateexample.ui.base.di.module;

import com.ivan.androidultimateexample.App;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CoroutineModule_Companion_ProvideAppScopeFactory implements Factory<CoroutineScope> {
  private final CoroutineModule.Companion module;

  private final Provider<App> appProvider;

  public CoroutineModule_Companion_ProvideAppScopeFactory(CoroutineModule.Companion module,
      Provider<App> appProvider) {
    this.module = module;
    this.appProvider = appProvider;
  }

  @Override
  public CoroutineScope get() {
    return provideAppScope(module, appProvider.get());
  }

  public static CoroutineModule_Companion_ProvideAppScopeFactory create(
      CoroutineModule.Companion module, Provider<App> appProvider) {
    return new CoroutineModule_Companion_ProvideAppScopeFactory(module, appProvider);
  }

  public static CoroutineScope provideAppScope(CoroutineModule.Companion instance, App app) {
    return Preconditions.checkNotNull(instance.provideAppScope(app), "Cannot return null from a non-@Nullable @Provides method");
  }
}
