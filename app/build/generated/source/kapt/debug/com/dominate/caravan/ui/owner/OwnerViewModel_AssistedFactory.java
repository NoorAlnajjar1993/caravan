package com.dominate.caravan.ui.owner;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class OwnerViewModel_AssistedFactory implements ViewModelAssistedFactory<OwnerViewModel> {
  @Inject
  OwnerViewModel_AssistedFactory() {
  }

  @Override
  @NonNull
  public OwnerViewModel create(SavedStateHandle arg0) {
    return new OwnerViewModel();
  }
}
