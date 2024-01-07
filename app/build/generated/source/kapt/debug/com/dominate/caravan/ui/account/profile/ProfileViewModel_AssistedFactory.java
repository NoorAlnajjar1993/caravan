package com.dominate.caravan.ui.account.profile;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.dominate.caravan.retrofit.data.ProfileDataSource;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class ProfileViewModel_AssistedFactory implements ViewModelAssistedFactory<ProfileViewModel> {
  private final Provider<ProfileDataSource> ProfileDataSource;

  @Inject
  ProfileViewModel_AssistedFactory(Provider<ProfileDataSource> ProfileDataSource) {
    this.ProfileDataSource = ProfileDataSource;
  }

  @Override
  @NonNull
  public ProfileViewModel create(SavedStateHandle arg0) {
    return new ProfileViewModel(ProfileDataSource.get());
  }
}
