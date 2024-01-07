package com.dominate.caravan.ui.search;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SearchViewModel_AssistedFactory_Factory implements Factory<SearchViewModel_AssistedFactory> {
  @Override
  public SearchViewModel_AssistedFactory get() {
    return newInstance();
  }

  public static SearchViewModel_AssistedFactory_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static SearchViewModel_AssistedFactory newInstance() {
    return new SearchViewModel_AssistedFactory();
  }

  private static final class InstanceHolder {
    private static final SearchViewModel_AssistedFactory_Factory INSTANCE = new SearchViewModel_AssistedFactory_Factory();
  }
}
