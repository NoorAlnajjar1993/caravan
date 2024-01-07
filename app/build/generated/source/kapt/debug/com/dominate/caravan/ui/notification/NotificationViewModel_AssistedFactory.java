package com.dominate.caravan.ui.notification;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class NotificationViewModel_AssistedFactory implements ViewModelAssistedFactory<NotificationViewModel> {
  @Inject
  NotificationViewModel_AssistedFactory() {
  }

  @Override
  @NonNull
  public NotificationViewModel create(SavedStateHandle arg0) {
    return new NotificationViewModel();
  }
}
