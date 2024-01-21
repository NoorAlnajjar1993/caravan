package com.dominate.caravan.ui.account.housingads;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.dominate.caravan.retrofit.data.HomeDataSource;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class HousingAdsViewModel_AssistedFactory implements ViewModelAssistedFactory<HousingAdsViewModel> {
  private final Provider<HomeDataSource> homeDataSource;

  @Inject
  HousingAdsViewModel_AssistedFactory(Provider<HomeDataSource> homeDataSource) {
    this.homeDataSource = homeDataSource;
  }

  @Override
  @NonNull
  public HousingAdsViewModel create(SavedStateHandle arg0) {
    return new HousingAdsViewModel(homeDataSource.get());
  }
}
