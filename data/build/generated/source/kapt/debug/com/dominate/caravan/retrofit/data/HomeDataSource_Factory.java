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
public final class HomeDataSource_Factory implements Factory<HomeDataSource> {
  private final Provider<NetworkService> networkServiceProvider;

  public HomeDataSource_Factory(Provider<NetworkService> networkServiceProvider) {
    this.networkServiceProvider = networkServiceProvider;
  }

  @Override
  public HomeDataSource get() {
    return newInstance(networkServiceProvider.get());
  }

  public static HomeDataSource_Factory create(Provider<NetworkService> networkServiceProvider) {
    return new HomeDataSource_Factory(networkServiceProvider);
  }

  public static HomeDataSource newInstance(NetworkService networkService) {
    return new HomeDataSource(networkService);
  }
}
