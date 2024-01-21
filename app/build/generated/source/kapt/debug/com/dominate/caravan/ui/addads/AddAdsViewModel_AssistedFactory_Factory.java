package com.dominate.caravan.ui.addads;

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
public final class AddAdsViewModel_AssistedFactory_Factory implements Factory<AddAdsViewModel_AssistedFactory> {
  private final Provider<HomeDataSource> homeDataSourceProvider;

  public AddAdsViewModel_AssistedFactory_Factory(Provider<HomeDataSource> homeDataSourceProvider) {
    this.homeDataSourceProvider = homeDataSourceProvider;
  }

  @Override
  public AddAdsViewModel_AssistedFactory get() {
    return newInstance(homeDataSourceProvider);
  }

  public static AddAdsViewModel_AssistedFactory_Factory create(
      Provider<HomeDataSource> homeDataSourceProvider) {
    return new AddAdsViewModel_AssistedFactory_Factory(homeDataSourceProvider);
  }

  public static AddAdsViewModel_AssistedFactory newInstance(
      Provider<HomeDataSource> homeDataSource) {
    return new AddAdsViewModel_AssistedFactory(homeDataSource);
  }
}
