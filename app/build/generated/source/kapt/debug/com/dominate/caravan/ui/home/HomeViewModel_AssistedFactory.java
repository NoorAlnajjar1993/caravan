package com.dominate.caravan.ui.home;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.dominate.caravan.retrofit.data.HomeDataSource;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class HomeViewModel_AssistedFactory implements ViewModelAssistedFactory<HomeViewModel> {
  private final Provider<HomeDataSource> homeDataSource;

  @Inject
  HomeViewModel_AssistedFactory(Provider<HomeDataSource> homeDataSource) {
    this.homeDataSource = homeDataSource;
  }

  @Override
  @NonNull
  public HomeViewModel create(SavedStateHandle arg0) {
    return new HomeViewModel(homeDataSource.get());
  }
}
