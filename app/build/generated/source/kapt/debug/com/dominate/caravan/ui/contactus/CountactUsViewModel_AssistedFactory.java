package com.dominate.caravan.ui.contactus;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class CountactUsViewModel_AssistedFactory implements ViewModelAssistedFactory<CountactUsViewModel> {
  @Inject
  CountactUsViewModel_AssistedFactory() {
  }

  @Override
  @NonNull
  public CountactUsViewModel create(SavedStateHandle arg0) {
    return new CountactUsViewModel();
  }
}
