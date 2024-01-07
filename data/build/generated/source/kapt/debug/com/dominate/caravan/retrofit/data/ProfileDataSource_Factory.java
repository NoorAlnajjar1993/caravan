package com.dominate.caravan.retrofit.data;

import com.dominate.caravan.retrofit.services.NetworkService;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ProfileDataSource_Factory implements Factory<ProfileDataSource> {
  private final Provider<NetworkService> networkServiceProvider;

  public ProfileDataSource_Factory(Provider<NetworkService> networkServiceProvider) {
    this.networkServiceProvider = networkServiceProvider;
  }

  @Override
  public ProfileDataSource get() {
    return newInstance(networkServiceProvider.get());
  }

  public static ProfileDataSource_Factory create(Provider<NetworkService> networkServiceProvider) {
    return new ProfileDataSource_Factory(networkServiceProvider);
  }

  public static ProfileDataSource newInstance(NetworkService networkService) {
    return new ProfileDataSource(networkService);
  }
}
