package com.dominate.caravan.ui.search;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class SearchViewModel_AssistedFactory implements ViewModelAssistedFactory<SearchViewModel> {
  @Inject
  SearchViewModel_AssistedFactory() {
  }

  @Override
  @NonNull
  public SearchViewModel create(SavedStateHandle arg0) {
    return new SearchViewModel();
  }
}
