package com.dominate.caravan.ui.account.aboutcompany;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class AboutCompanyViewModel_AssistedFactory implements ViewModelAssistedFactory<AboutCompanyViewModel> {
  @Inject
  AboutCompanyViewModel_AssistedFactory() {
  }

  @Override
  @NonNull
  public AboutCompanyViewModel create(SavedStateHandle arg0) {
    return new AboutCompanyViewModel();
  }
}
