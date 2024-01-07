package com.dominate.caravan.ui.favourite;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.dominate.caravan.retrofit.data.HomeDataSource;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class FavouriteViewModel_AssistedFactory implements ViewModelAssistedFactory<FavouriteViewModel> {
  private final Provider<HomeDataSource> homeDataSource;

  @Inject
  FavouriteViewModel_AssistedFactory(Provider<HomeDataSource> homeDataSource) {
    this.homeDataSource = homeDataSource;
  }

  @Override
  @NonNull
  public FavouriteViewModel create(SavedStateHandle arg0) {
    return new FavouriteViewModel(homeDataSource.get());
  }
}
