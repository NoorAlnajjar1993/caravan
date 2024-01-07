package com.dominate.caravan.ui.auth.siginin;

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
public final class SiginInViewModel_AssistedFactory_Factory implements Factory<SiginInViewModel_AssistedFactory> {
  private final Provider<ProfileDataSource> profileDataSourceProvider;

  public SiginInViewModel_AssistedFactory_Factory(
      Provider<ProfileDataSource> profileDataSourceProvider) {
    this.profileDataSourceProvider = profileDataSourceProvider;
  }

  @Override
  public SiginInViewModel_AssistedFactory get() {
    return newInstance(profileDataSourceProvider);
  }

  public static SiginInViewModel_AssistedFactory_Factory create(
      Provider<ProfileDataSource> profileDataSourceProvider) {
    return new SiginInViewModel_AssistedFactory_Factory(profileDataSourceProvider);
  }

  public static SiginInViewModel_AssistedFactory newInstance(
      Provider<ProfileDataSource> ProfileDataSource) {
    return new SiginInViewModel_AssistedFactory(ProfileDataSource);
  }
}
