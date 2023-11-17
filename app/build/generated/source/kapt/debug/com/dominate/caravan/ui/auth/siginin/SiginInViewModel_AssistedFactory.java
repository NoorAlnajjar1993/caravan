package com.dominate.caravan.ui.auth.siginin;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class SiginInViewModel_AssistedFactory implements ViewModelAssistedFactory<SiginInViewModel> {
  @Inject
  SiginInViewModel_AssistedFactory() {
  }

  @Override
  @NonNull
  public SiginInViewModel create(SavedStateHandle arg0) {
    return new SiginInViewModel();
  }
}
