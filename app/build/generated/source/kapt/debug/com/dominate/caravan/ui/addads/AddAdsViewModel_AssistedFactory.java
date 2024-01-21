package com.dominate.caravan.ui.addads;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.dominate.caravan.retrofit.data.HomeDataSource;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class AddAdsViewModel_AssistedFactory implements ViewModelAssistedFactory<AddAdsViewModel> {
  private final Provider<HomeDataSource> homeDataSource;

  @Inject
  AddAdsViewModel_AssistedFactory(Provider<HomeDataSource> homeDataSource) {
    this.homeDataSource = homeDataSource;
  }

  @Override
  @NonNull
  public AddAdsViewModel create(SavedStateHandle arg0) {
    return new AddAdsViewModel(homeDataSource.get());
  }
}
