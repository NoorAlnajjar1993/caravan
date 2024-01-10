package com.dominate.caravan.ui.estatedetails;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.dominate.caravan.retrofit.data.HomeDataSource;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class EstateDetailsViewModel_AssistedFactory implements ViewModelAssistedFactory<EstateDetailsViewModel> {
  private final Provider<HomeDataSource> homeDataSource;

  @Inject
  EstateDetailsViewModel_AssistedFactory(Provider<HomeDataSource> homeDataSource) {
    this.homeDataSource = homeDataSource;
  }

  @Override
  @NonNull
  public EstateDetailsViewModel create(SavedStateHandle arg0) {
    return new EstateDetailsViewModel(homeDataSource.get());
  }
}
