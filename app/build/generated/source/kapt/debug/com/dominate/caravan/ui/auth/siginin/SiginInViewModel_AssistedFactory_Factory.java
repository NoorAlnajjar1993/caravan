package com.dominate.caravan.ui.auth.siginin;

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
public final class SiginInViewModel_AssistedFactory_Factory implements Factory<SiginInViewModel_AssistedFactory> {
  @Override
  public SiginInViewModel_AssistedFactory get() {
    return newInstance();
  }

  public static SiginInViewModel_AssistedFactory_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static SiginInViewModel_AssistedFactory newInstance() {
    return new SiginInViewModel_AssistedFactory();
  }

  private static final class InstanceHolder {
    private static final SiginInViewModel_AssistedFactory_Factory INSTANCE = new SiginInViewModel_AssistedFactory_Factory();
  }
}
