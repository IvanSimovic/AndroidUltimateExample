// Generated by Dagger (https://dagger.dev).
package com.ivan.todoengine.networking.oauth2.request;

import com.ivan.todoengine.networking.ClientConfig;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class OAuth2RequestFactory_Factory implements Factory<OAuth2RequestFactory> {
  private final Provider<ClientConfig> clientConfigProvider;

  public OAuth2RequestFactory_Factory(Provider<ClientConfig> clientConfigProvider) {
    this.clientConfigProvider = clientConfigProvider;
  }

  @Override
  public OAuth2RequestFactory get() {
    return newInstance(clientConfigProvider.get());
  }

  public static OAuth2RequestFactory_Factory create(Provider<ClientConfig> clientConfigProvider) {
    return new OAuth2RequestFactory_Factory(clientConfigProvider);
  }

  public static OAuth2RequestFactory newInstance(ClientConfig clientConfig) {
    return new OAuth2RequestFactory(clientConfig);
  }
}
