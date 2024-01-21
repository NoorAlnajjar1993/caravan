package com.dominate.caravan.ui.account.housingads;

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
public final class HousingAdsViewModel_AssistedFactory_Factory implements Factory<HousingAdsViewModel_AssistedFactory> {
  private final Provider<HomeDataSource> homeDataSourceProvider;

  public HousingAdsViewModel_AssistedFactory_Factory(
      Provider<HomeDataSource> homeDataSourceProvider) {
    this.homeDataSourceProvider = homeDataSourceProvider;
  }

  @Override
  public HousingAdsViewModel_AssistedFactory get() {
    return newInstance(homeDataSourceProvider);
  }

  public static HousingAdsViewModel_AssistedFactory_Factory create(
      Provider<HomeDataSource> homeDataSourceProvider) {
    return new HousingAdsViewModel_AssistedFactory_Factory(homeDataSourceProvider);
  }

  public static HousingAdsViewModel_AssistedFactory newInstance(
      Provider<HomeDataSource> homeDataSource) {
    return new HousingAdsViewModel_AssistedFactory(homeDataSource);
  }
}
