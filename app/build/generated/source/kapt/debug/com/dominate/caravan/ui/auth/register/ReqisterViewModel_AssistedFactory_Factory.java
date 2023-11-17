package com.dominate.caravan.ui.auth.register;

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
public final class ReqisterViewModel_AssistedFactory_Factory implements Factory<ReqisterViewModel_AssistedFactory> {
  @Override
  public ReqisterViewModel_AssistedFactory get() {
    return newInstance();
  }

  public static ReqisterViewModel_AssistedFactory_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static ReqisterViewModel_AssistedFactory newInstance() {
    return new ReqisterViewModel_AssistedFactory();
  }

  private static final class InstanceHolder {
    private static final ReqisterViewModel_AssistedFactory_Factory INSTANCE = new ReqisterViewModel_AssistedFactory_Factory();
  }
}
