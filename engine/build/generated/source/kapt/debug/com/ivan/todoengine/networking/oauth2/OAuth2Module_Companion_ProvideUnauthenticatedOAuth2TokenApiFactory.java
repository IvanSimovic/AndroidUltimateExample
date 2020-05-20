// Generated by Dagger (https://dagger.dev).
package com.ivan.todoengine.networking.oauth2;

import com.ivan.todoengine.networking.di.IApiFactory;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class OAuth2Module_Companion_ProvideUnauthenticatedOAuth2TokenApiFactory implements Factory<OAuth2TokenApi> {
  private final OAuth2Module.Companion module;

  private final Provider<IApiFactory> apiFactoryProvider;

  public OAuth2Module_Companion_ProvideUnauthenticatedOAuth2TokenApiFactory(
      OAuth2Module.Companion module, Provider<IApiFactory> apiFactoryProvider) {
    this.module = module;
    this.apiFactoryProvider = apiFactoryProvider;
  }

  @Override
  public OAuth2TokenApi get() {
    return provideUnauthenticatedOAuth2TokenApi(module, apiFactoryProvider.get());
  }

  public static OAuth2Module_Companion_ProvideUnauthenticatedOAuth2TokenApiFactory create(
      OAuth2Module.Companion module, Provider<IApiFactory> apiFactoryProvider) {
    return new OAuth2Module_Companion_ProvideUnauthenticatedOAuth2TokenApiFactory(module, apiFactoryProvider);
  }

  public static OAuth2TokenApi provideUnauthenticatedOAuth2TokenApi(OAuth2Module.Companion instance,
      IApiFactory apiFactory) {
    return Preconditions.checkNotNull(instance.provideUnauthenticatedOAuth2TokenApi(apiFactory), "Cannot return null from a non-@Nullable @Provides method");
  }
}
