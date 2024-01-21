package com.dominate.caravan.ui.account.commercialestateads;

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
public final class CommercialEstateAdsViewModel_AssistedFactory_Factory implements Factory<CommercialEstateAdsViewModel_AssistedFactory> {
  private final Provider<HomeDataSource> homeDataSourceProvider;

  public CommercialEstateAdsViewModel_AssistedFactory_Factory(
      Provider<HomeDataSource> homeDataSourceProvider) {
    this.homeDataSourceProvider = homeDataSourceProvider;
  }

  @Override
  public CommercialEstateAdsViewModel_AssistedFactory get() {
    return newInstance(homeDataSourceProvider);
  }

  public static CommercialEstateAdsViewModel_AssistedFactory_Factory create(
      Provider<HomeDataSource> homeDataSourceProvider) {
    return new CommercialEstateAdsViewModel_AssistedFactory_Factory(homeDataSourceProvider);
  }

  public static CommercialEstateAdsViewModel_AssistedFactory newInstance(
      Provider<HomeDataSource> homeDataSource) {
    return new CommercialEstateAdsViewModel_AssistedFactory(homeDataSource);
  }
}
