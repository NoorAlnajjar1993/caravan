package com.dominate.caravan.ui.splach;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class SplashViewModel_AssistedFactory implements ViewModelAssistedFactory<SplashViewModel> {
  @Inject
  SplashViewModel_AssistedFactory() {
  }

  @Override
  @NonNull
  public SplashViewModel create(SavedStateHandle arg0) {
    return new SplashViewModel();
  }
}
