package com.dominate.caravan.ui.contactus;

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
public final class CountactUsViewModel_AssistedFactory_Factory implements Factory<CountactUsViewModel_AssistedFactory> {
  @Override
  public CountactUsViewModel_AssistedFactory get() {
    return newInstance();
  }

  public static CountactUsViewModel_AssistedFactory_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static CountactUsViewModel_AssistedFactory newInstance() {
    return new CountactUsViewModel_AssistedFactory();
  }

  private static final class InstanceHolder {
    private static final CountactUsViewModel_AssistedFactory_Factory INSTANCE = new CountactUsViewModel_AssistedFactory_Factory();
  }
}
