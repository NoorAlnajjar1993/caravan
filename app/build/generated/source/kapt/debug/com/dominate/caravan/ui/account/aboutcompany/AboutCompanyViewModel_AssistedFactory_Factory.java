package com.dominate.caravan.ui.account.aboutcompany;

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
public final class AboutCompanyViewModel_AssistedFactory_Factory implements Factory<AboutCompanyViewModel_AssistedFactory> {
  @Override
  public AboutCompanyViewModel_AssistedFactory get() {
    return newInstance();
  }

  public static AboutCompanyViewModel_AssistedFactory_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static AboutCompanyViewModel_AssistedFactory newInstance() {
    return new AboutCompanyViewModel_AssistedFactory();
  }

  private static final class InstanceHolder {
    private static final AboutCompanyViewModel_AssistedFactory_Factory INSTANCE = new AboutCompanyViewModel_AssistedFactory_Factory();
  }
}
