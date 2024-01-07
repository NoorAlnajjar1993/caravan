package com.dominate.caravan.ui.account.realestateads;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class RealEstateAdsViewModel_AssistedFactory implements ViewModelAssistedFactory<RealEstateAdsViewModel> {
  @Inject
  RealEstateAdsViewModel_AssistedFactory() {
  }

  @Override
  @NonNull
  public RealEstateAdsViewModel create(SavedStateHandle arg0) {
    return new RealEstateAdsViewModel();
  }
}
