package com.dominate.caravan.ui.account.changepassword;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.dominate.caravan.retrofit.data.ProfileDataSource;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class ChangePasswordViewModel_AssistedFactory implements ViewModelAssistedFactory<ChangePasswordViewModel> {
  private final Provider<ProfileDataSource> ProfileDataSource;

  @Inject
  ChangePasswordViewModel_AssistedFactory(Provider<ProfileDataSource> ProfileDataSource) {
    this.ProfileDataSource = ProfileDataSource;
  }

  @Override
  @NonNull
  public ChangePasswordViewModel create(SavedStateHandle arg0) {
    return new ChangePasswordViewModel(ProfileDataSource.get());
  }
}
