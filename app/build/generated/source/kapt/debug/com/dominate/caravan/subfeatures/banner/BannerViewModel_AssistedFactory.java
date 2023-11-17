package com.dominate.caravan.subfeatures.banner;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class BannerViewModel_AssistedFactory implements ViewModelAssistedFactory<BannerViewModel> {
  @Inject
  BannerViewModel_AssistedFactory() {
  }

  @Override
  @NonNull
  public BannerViewModel create(SavedStateHandle arg0) {
    return new BannerViewModel();
  }
}
