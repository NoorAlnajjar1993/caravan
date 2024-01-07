package com.dominate.caravan.ui.home;

import com.dominate.caravan.retrofit.data.HomeDataSource;
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
public final class HomeViewModel_AssistedFactory_Factory implements Factory<HomeViewModel_AssistedFactory> {
  private final Provider<HomeDataSource> homeDataSourceProvider;

  public HomeViewModel_AssistedFactory_Factory(Provider<HomeDataSource> homeDataSourceProvider) {
    this.homeDataSourceProvider = homeDataSourceProvider;
  }

  @Override
  public HomeViewModel_AssistedFactory get() {
    return newInstance(homeDataSourceProvider);
  }

  public static HomeViewModel_AssistedFactory_Factory create(
      Provider<HomeDataSource> homeDataSourceProvider) {
    return new HomeViewModel_AssistedFactory_Factory(homeDataSourceProvider);
  }

  public static HomeViewModel_AssistedFactory newInstance(Provider<HomeDataSource> homeDataSource) {
    return new HomeViewModel_AssistedFactory(homeDataSource);
  }
}
