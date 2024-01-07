package com.dominate.caravan.ui.account.accountsetting;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.dominate.caravan.retrofit.data.ProfileDataSource;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class AccountSettingViewModel_AssistedFactory implements ViewModelAssistedFactory<AccountSettingViewModel> {
  private final Provider<ProfileDataSource> ProfileDataSource;

  @Inject
  AccountSettingViewModel_AssistedFactory(Provider<ProfileDataSource> ProfileDataSource) {
    this.ProfileDataSource = ProfileDataSource;
  }

  @Override
  @NonNull
  public AccountSettingViewModel create(SavedStateHandle arg0) {
    return new AccountSettingViewModel(ProfileDataSource.get());
  }
}
