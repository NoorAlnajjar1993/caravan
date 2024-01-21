package com.dominate.caravan.ui.account.realestateads;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.dominate.caravan.retrofit.data.HomeDataSource;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class RealEstateAdsViewModel_AssistedFactory implements ViewModelAssistedFactory<RealEstateAdsViewModel> {
  private final Provider<HomeDataSource> homeDataSource;

  @Inject
  RealEstateAdsViewModel_AssistedFactory(Provider<HomeDataSource> homeDataSource) {
    this.homeDataSource = homeDataSource;
  }

  @Override
  @NonNull
  public RealEstateAdsViewModel create(SavedStateHandle arg0) {
    return new RealEstateAdsViewModel(homeDataSource.get());
  }
}
