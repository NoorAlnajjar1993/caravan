package com.dominate.caravan.ui.notification;

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
public final class NotificationViewModel_AssistedFactory_Factory implements Factory<NotificationViewModel_AssistedFactory> {
  @Override
  public NotificationViewModel_AssistedFactory get() {
    return newInstance();
  }

  public static NotificationViewModel_AssistedFactory_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static NotificationViewModel_AssistedFactory newInstance() {
    return new NotificationViewModel_AssistedFactory();
  }

  private static final class InstanceHolder {
    private static final NotificationViewModel_AssistedFactory_Factory INSTANCE = new NotificationViewModel_AssistedFactory_Factory();
  }
}
