package com.dominate.caravan.ui.account.commercialads;

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
public final class CommercialAdsViewModel_AssistedFactory_Factory implements Factory<CommercialAdsViewModel_AssistedFactory> {
  private final Provider<HomeDataSource> homeDataSourceProvider;

  public CommercialAdsViewModel_AssistedFactory_Factory(
      Provider<HomeDataSource> homeDataSourceProvider) {
    this.homeDataSourceProvider = homeDataSourceProvider;
  }

  @Override
  public CommercialAdsViewModel_AssistedFactory get() {
    return newInstance(homeDataSourceProvider);
  }

  public static CommercialAdsViewModel_AssistedFactory_Factory create(
      Provider<HomeDataSource> homeDataSourceProvider) {
    return new CommercialAdsViewModel_AssistedFactory_Factory(homeDataSourceProvider);
  }

  public static CommercialAdsViewModel_AssistedFactory newInstance(
      Provider<HomeDataSource> homeDataSource) {
    return new CommercialAdsViewModel_AssistedFactory(homeDataSource);
  }
}
