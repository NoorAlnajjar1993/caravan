package com.dominate.caravan.ui.account.changepassword;

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
public final class ChangePasswordViewModel_AssistedFactory_Factory implements Factory<ChangePasswordViewModel_AssistedFactory> {
  private final Provider<ProfileDataSource> profileDataSourceProvider;

  public ChangePasswordViewModel_AssistedFactory_Factory(
      Provider<ProfileDataSource> profileDataSourceProvider) {
    this.profileDataSourceProvider = profileDataSourceProvider;
  }

  @Override
  public ChangePasswordViewModel_AssistedFactory get() {
    return newInstance(profileDataSourceProvider);
  }

  public static ChangePasswordViewModel_AssistedFactory_Factory create(
      Provider<ProfileDataSource> profileDataSourceProvider) {
    return new ChangePasswordViewModel_AssistedFactory_Factory(profileDataSourceProvider);
  }

  public static ChangePasswordViewModel_AssistedFactory newInstance(
      Provider<ProfileDataSource> ProfileDataSource) {
    return new ChangePasswordViewModel_AssistedFactory(ProfileDataSource);
  }
}
