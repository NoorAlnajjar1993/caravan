package com.dominate.caravan.ui.addads.commericaladvertisment;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class CommericalAdvertismentViewModel_AssistedFactory implements ViewModelAssistedFactory<CommericalAdvertismentViewModel> {
  @Inject
  CommericalAdvertismentViewModel_AssistedFactory() {
  }

  @Override
  @NonNull
  public CommericalAdvertismentViewModel create(SavedStateHandle arg0) {
    return new CommericalAdvertismentViewModel();
  }
}
