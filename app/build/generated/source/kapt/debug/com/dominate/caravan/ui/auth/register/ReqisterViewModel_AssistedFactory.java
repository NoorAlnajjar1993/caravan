package com.dominate.caravan.ui.auth.register;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.dominate.caravan.retrofit.data.ProfileDataSource;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class ReqisterViewModel_AssistedFactory implements ViewModelAssistedFactory<ReqisterViewModel> {
  private final Provider<ProfileDataSource> ProfileDataSource;

  @Inject
  ReqisterViewModel_AssistedFactory(Provider<ProfileDataSource> ProfileDataSource) {
    this.ProfileDataSource = ProfileDataSource;
  }

  @Override
  @NonNull
  public ReqisterViewModel create(SavedStateHandle arg0) {
    return new ReqisterViewModel(ProfileDataSource.get());
  }
}
