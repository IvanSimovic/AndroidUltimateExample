// Generated by Dagger (https://dagger.dev).
package com.ivan.todoengine.di;

import com.ivan.todoengine.data.api.ActivityApi;
import com.ivan.todoengine.networking.di.IApiFactory;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ApiModule_Companion_ProvideActivityApiFactory implements Factory<ActivityApi> {
  private final ApiModule.Companion module;

  private final Provider<IApiFactory> apiFactoryProvider;

  public ApiModule_Companion_ProvideActivityApiFactory(ApiModule.Companion module,
      Provider<IApiFactory> apiFactoryProvider) {
    this.module = module;
    this.apiFactoryProvider = apiFactoryProvider;
  }

  @Override
  public ActivityApi get() {
    return provideActivityApi(module, apiFactoryProvider.get());
  }

  public static ApiModule_Companion_ProvideActivityApiFactory create(ApiModule.Companion module,
      Provider<IApiFactory> apiFactoryProvider) {
    return new ApiModule_Companion_ProvideActivityApiFactory(module, apiFactoryProvider);
  }

  public static ActivityApi provideActivityApi(ApiModule.Companion instance,
      IApiFactory apiFactory) {
    return Preconditions.checkNotNull(instance.provideActivityApi(apiFactory), "Cannot return null from a non-@Nullable @Provides method");
  }
}
