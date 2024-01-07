package com.dominate.caravan.ui.favourite;

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
public final class FavouriteViewModel_AssistedFactory_Factory implements Factory<FavouriteViewModel_AssistedFactory> {
  private final Provider<HomeDataSource> homeDataSourceProvider;

  public FavouriteViewModel_AssistedFactory_Factory(
      Provider<HomeDataSource> homeDataSourceProvider) {
    this.homeDataSourceProvider = homeDataSourceProvider;
  }

  @Override
  public FavouriteViewModel_AssistedFactory get() {
    return newInstance(homeDataSourceProvider);
  }

  public static FavouriteViewModel_AssistedFactory_Factory create(
      Provider<HomeDataSource> homeDataSourceProvider) {
    return new FavouriteViewModel_AssistedFactory_Factory(homeDataSourceProvider);
  }

  public static FavouriteViewModel_AssistedFactory newInstance(
      Provider<HomeDataSource> homeDataSource) {
    return new FavouriteViewModel_AssistedFactory(homeDataSource);
  }
}
