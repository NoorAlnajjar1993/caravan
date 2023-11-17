package com.dominate.caravan.ui.auth.editpassword;

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
public final class EditPasswordViewModel_AssistedFactory_Factory implements Factory<EditPasswordViewModel_AssistedFactory> {
  @Override
  public EditPasswordViewModel_AssistedFactory get() {
    return newInstance();
  }

  public static EditPasswordViewModel_AssistedFactory_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static EditPasswordViewModel_AssistedFactory newInstance() {
    return new EditPasswordViewModel_AssistedFactory();
  }

  private static final class InstanceHolder {
    private static final EditPasswordViewModel_AssistedFactory_Factory INSTANCE = new EditPasswordViewModel_AssistedFactory_Factory();
  }
}
