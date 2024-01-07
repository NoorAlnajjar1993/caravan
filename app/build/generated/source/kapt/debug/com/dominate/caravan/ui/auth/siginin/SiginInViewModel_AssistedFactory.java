package com.dominate.caravan.ui.auth.siginin;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.dominate.caravan.retrofit.data.ProfileDataSource;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class SiginInViewModel_AssistedFactory implements ViewModelAssistedFactory<SiginInViewModel> {
  private final Provider<ProfileDataSource> ProfileDataSource;

  @Inject
  SiginInViewModel_AssistedFactory(Provider<ProfileDataSource> ProfileDataSource) {
    this.ProfileDataSource = ProfileDataSource;
  }

  @Override
  @NonNull
  public SiginInViewModel create(SavedStateHandle arg0) {
    return new SiginInViewModel(ProfileDataSource.get());
  }
}
