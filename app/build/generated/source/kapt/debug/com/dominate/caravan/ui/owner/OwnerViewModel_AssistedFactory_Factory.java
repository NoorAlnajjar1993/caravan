package com.dominate.caravan.ui.owner;

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
public final class OwnerViewModel_AssistedFactory_Factory implements Factory<OwnerViewModel_AssistedFactory> {
  @Override
  public OwnerViewModel_AssistedFactory get() {
    return newInstance();
  }

  public static OwnerViewModel_AssistedFactory_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static OwnerViewModel_AssistedFactory newInstance() {
    return new OwnerViewModel_AssistedFactory();
  }

  private static final class InstanceHolder {
    private static final OwnerViewModel_AssistedFactory_Factory INSTANCE = new OwnerViewModel_AssistedFactory_Factory();
  }
}
