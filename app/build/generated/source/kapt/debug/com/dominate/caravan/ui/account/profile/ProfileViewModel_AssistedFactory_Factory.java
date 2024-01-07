package com.dominate.caravan.ui.account.profile;

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
public final class ProfileViewModel_AssistedFactory_Factory implements Factory<ProfileViewModel_AssistedFactory> {
  private final Provider<ProfileDataSource> profileDataSourceProvider;

  public ProfileViewModel_AssistedFactory_Factory(
      Provider<ProfileDataSource> profileDataSourceProvider) {
    this.profileDataSourceProvider = profileDataSourceProvider;
  }

  @Override
  public ProfileViewModel_AssistedFactory get() {
    return newInstance(profileDataSourceProvider);
  }

  public static ProfileViewModel_AssistedFactory_Factory create(
      Provider<ProfileDataSource> profileDataSourceProvider) {
    return new ProfileViewModel_AssistedFactory_Factory(profileDataSourceProvider);
  }

  public static ProfileViewModel_AssistedFactory newInstance(
      Provider<ProfileDataSource> ProfileDataSource) {
    return new ProfileViewModel_AssistedFactory(ProfileDataSource);
  }
}
