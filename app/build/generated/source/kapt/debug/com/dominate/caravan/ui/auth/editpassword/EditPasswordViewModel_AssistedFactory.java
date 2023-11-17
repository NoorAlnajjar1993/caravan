package com.dominate.caravan.ui.auth.editpassword;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class EditPasswordViewModel_AssistedFactory implements ViewModelAssistedFactory<EditPasswordViewModel> {
  @Inject
  EditPasswordViewModel_AssistedFactory() {
  }

  @Override
  @NonNull
  public EditPasswordViewModel create(SavedStateHandle arg0) {
    return new EditPasswordViewModel();
  }
}
