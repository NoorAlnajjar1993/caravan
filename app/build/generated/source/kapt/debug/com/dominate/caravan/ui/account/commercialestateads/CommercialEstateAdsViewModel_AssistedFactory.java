package com.dominate.caravan.ui.account.commercialestateads;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.dominate.caravan.retrofit.data.HomeDataSource;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class CommercialEstateAdsViewModel_AssistedFactory implements ViewModelAssistedFactory<CommercialEstateAdsViewModel> {
  private final Provider<HomeDataSource> homeDataSource;

  @Inject
  CommercialEstateAdsViewModel_AssistedFactory(Provider<HomeDataSource> homeDataSource) {
    this.homeDataSource = homeDataSource;
  }

  @Override
  @NonNull
  public CommercialEstateAdsViewModel create(SavedStateHandle arg0) {
    return new CommercialEstateAdsViewModel(homeDataSource.get());
  }
}
