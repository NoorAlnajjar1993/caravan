package com.dominate.caravan.ui.addads;

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
public final class AddAdsViewModel_AssistedFactory_Factory implements Factory<AddAdsViewModel_AssistedFactory> {
  @Override
  public AddAdsViewModel_AssistedFactory get() {
    return newInstance();
  }

  public static AddAdsViewModel_AssistedFactory_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static AddAdsViewModel_AssistedFactory newInstance() {
    return new AddAdsViewModel_AssistedFactory();
  }

  private static final class InstanceHolder {
    private static final AddAdsViewModel_AssistedFactory_Factory INSTANCE = new AddAdsViewModel_AssistedFactory_Factory();
  }
}
