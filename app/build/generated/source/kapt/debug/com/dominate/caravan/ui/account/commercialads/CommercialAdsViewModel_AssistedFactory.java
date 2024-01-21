package com.dominate.caravan.ui.account.commercialads;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.dominate.caravan.retrofit.data.HomeDataSource;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class CommercialAdsViewModel_AssistedFactory implements ViewModelAssistedFactory<CommercialAdsViewModel> {
  private final Provider<HomeDataSource> homeDataSource;

  @Inject
  CommercialAdsViewModel_AssistedFactory(Provider<HomeDataSource> homeDataSource) {
    this.homeDataSource = homeDataSource;
  }

  @Override
  @NonNull
  public CommercialAdsViewModel create(SavedStateHandle arg0) {
    return new CommercialAdsViewModel(homeDataSource.get());
  }
}
