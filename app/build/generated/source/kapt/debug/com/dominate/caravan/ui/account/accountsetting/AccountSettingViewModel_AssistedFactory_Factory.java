package com.dominate.caravan.ui.account.accountsetting;

import com.dominate.caravan.retrofit.data.ProfileDataSource;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AccountSettingViewModel_AssistedFactory_Factory implements Factory<AccountSettingViewModel_AssistedFactory> {
  private final Provider<ProfileDataSource> profileDataSourceProvider;

  public AccountSettingViewModel_AssistedFactory_Factory(
      Provider<ProfileDataSource> profileDataSourceProvider) {
    this.profileDataSourceProvider = profileDataSourceProvider;
  }

  @Override
  public AccountSettingViewModel_AssistedFactory get() {
    return newInstance(profileDataSourceProvider);
  }

  public static AccountSettingViewModel_AssistedFactory_Factory create(
      Provider<ProfileDataSource> profileDataSourceProvider) {
    return new AccountSettingViewModel_AssistedFactory_Factory(profileDataSourceProvider);
  }

  public static AccountSettingViewModel_AssistedFactory newInstance(
      Provider<ProfileDataSource> ProfileDataSource) {
    return new AccountSettingViewModel_AssistedFactory(ProfileDataSource);
  }
}
