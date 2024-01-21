package com.dominate.caravan.ui.account.realestateads;

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
public final class RealEstateAdsViewModel_AssistedFactory_Factory implements Factory<RealEstateAdsViewModel_AssistedFactory> {
  private final Provider<HomeDataSource> homeDataSourceProvider;

  public RealEstateAdsViewModel_AssistedFactory_Factory(
      Provider<HomeDataSource> homeDataSourceProvider) {
    this.homeDataSourceProvider = homeDataSourceProvider;
  }

  @Override
  public RealEstateAdsViewModel_AssistedFactory get() {
    return newInstance(homeDataSourceProvider);
  }

  public static RealEstateAdsViewModel_AssistedFactory_Factory create(
      Provider<HomeDataSource> homeDataSourceProvider) {
    return new RealEstateAdsViewModel_AssistedFactory_Factory(homeDataSourceProvider);
  }

  public static RealEstateAdsViewModel_AssistedFactory newInstance(
      Provider<HomeDataSource> homeDataSource) {
    return new RealEstateAdsViewModel_AssistedFactory(homeDataSource);
  }
}
