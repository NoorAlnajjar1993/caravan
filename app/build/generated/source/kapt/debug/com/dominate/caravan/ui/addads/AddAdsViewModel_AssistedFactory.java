package com.dominate.caravan.ui.addads;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class AddAdsViewModel_AssistedFactory implements ViewModelAssistedFactory<AddAdsViewModel> {
  @Inject
  AddAdsViewModel_AssistedFactory() {
  }

  @Override
  @NonNull
  public AddAdsViewModel create(SavedStateHandle arg0) {
    return new AddAdsViewModel();
  }
}
