// Generated by Dagger (https://dagger.dev).
package com.ivan.todoengine.di;

import com.ivan.todoengine.networking.configuration.NetworkConfig;
import com.ivan.todoengine.networking.di.IApiFactory;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideUnauthenticatedRetrofitApiFactoryFactory implements Factory<IApiFactory> {
  private final Provider<OkHttpClient> okHttpClientProvider;

  private final Provider<NetworkConfig> networkConfigProvider;

  public NetworkModule_ProvideUnauthenticatedRetrofitApiFactoryFactory(
      Provider<OkHttpClient> okHttpClientProvider, Provider<NetworkConfig> networkConfigProvider) {
    this.okHttpClientProvider = okHttpClientProvider;
    this.networkConfigProvider = networkConfigProvider;
  }

  @Override
  public IApiFactory get() {
    return provideUnauthenticatedRetrofitApiFactory(okHttpClientProvider.get(), networkConfigProvider.get());
  }

  public static NetworkModule_ProvideUnauthenticatedRetrofitApiFactoryFactory create(
      Provider<OkHttpClient> okHttpClientProvider, Provider<NetworkConfig> networkConfigProvider) {
    return new NetworkModule_ProvideUnauthenticatedRetrofitApiFactoryFactory(okHttpClientProvider, networkConfigProvider);
  }

  public static IApiFactory provideUnauthenticatedRetrofitApiFactory(OkHttpClient okHttpClient,
      NetworkConfig networkConfig) {
    return Preconditions.checkNotNull(NetworkModule.provideUnauthenticatedRetrofitApiFactory(okHttpClient, networkConfig), "Cannot return null from a non-@Nullable @Provides method");
  }
}