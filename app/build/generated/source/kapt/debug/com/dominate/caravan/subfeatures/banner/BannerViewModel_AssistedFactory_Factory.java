package com.dominate.caravan.subfeatures.banner;

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
public final class BannerViewModel_AssistedFactory_Factory implements Factory<BannerViewModel_AssistedFactory> {
  @Override
  public BannerViewModel_AssistedFactory get() {
    return newInstance();
  }

  public static BannerViewModel_AssistedFactory_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static BannerViewModel_AssistedFactory newInstance() {
    return new BannerViewModel_AssistedFactory();
  }

  private static final class InstanceHolder {
    private static final BannerViewModel_AssistedFactory_Factory INSTANCE = new BannerViewModel_AssistedFactory_Factory();
  }
}
