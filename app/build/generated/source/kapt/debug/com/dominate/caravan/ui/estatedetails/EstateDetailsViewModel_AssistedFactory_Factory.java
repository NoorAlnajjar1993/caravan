package com.dominate.caravan.ui.estatedetails;

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
public final class EstateDetailsViewModel_AssistedFactory_Factory implements Factory<EstateDetailsViewModel_AssistedFactory> {
  private final Provider<HomeDataSource> homeDataSourceProvider;

  public EstateDetailsViewModel_AssistedFactory_Factory(
      Provider<HomeDataSource> homeDataSourceProvider) {
    this.homeDataSourceProvider = homeDataSourceProvider;
  }

  @Override
  public EstateDetailsViewModel_AssistedFactory get() {
    return newInstance(homeDataSourceProvider);
  }

  public static EstateDetailsViewModel_AssistedFactory_Factory create(
      Provider<HomeDataSource> homeDataSourceProvider) {
    return new EstateDetailsViewModel_AssistedFactory_Factory(homeDataSourceProvider);
  }

  public static EstateDetailsViewModel_AssistedFactory newInstance(
      Provider<HomeDataSource> homeDataSource) {
    return new EstateDetailsViewModel_AssistedFactory(homeDataSource);
  }
}
