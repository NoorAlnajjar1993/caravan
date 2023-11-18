package com.dominate.caravan.ui.splach;

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
public final class SplashViewModel_AssistedFactory_Factory implements Factory<SplashViewModel_AssistedFactory> {
  @Override
  public SplashViewModel_AssistedFactory get() {
    return newInstance();
  }

  public static SplashViewModel_AssistedFactory_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static SplashViewModel_AssistedFactory newInstance() {
    return new SplashViewModel_AssistedFactory();
  }

  private static final class InstanceHolder {
    private static final SplashViewModel_AssistedFactory_Factory INSTANCE = new SplashViewModel_AssistedFactory_Factory();
  }
}
