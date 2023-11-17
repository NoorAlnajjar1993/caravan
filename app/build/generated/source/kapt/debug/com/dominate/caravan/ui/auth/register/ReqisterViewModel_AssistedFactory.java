package com.dominate.caravan.ui.auth.register;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class ReqisterViewModel_AssistedFactory implements ViewModelAssistedFactory<ReqisterViewModel> {
  @Inject
  ReqisterViewModel_AssistedFactory() {
  }

  @Override
  @NonNull
  public ReqisterViewModel create(SavedStateHandle arg0) {
    return new ReqisterViewModel();
  }
}
