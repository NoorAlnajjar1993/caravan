package com.dominate.caravan.ui.contactus;

import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.codegen.OriginatingElement;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;
import javax.annotation.Generated;

@Generated("androidx.hilt.AndroidXHiltProcessor")
@Module
@InstallIn(ActivityRetainedComponent.class)
@OriginatingElement(
    topLevelClass = CountactUsViewModel.class
)
public interface CountactUsViewModel_HiltModule {
  @Binds
  @IntoMap
  @StringKey("com.dominate.caravan.ui.contactus.CountactUsViewModel")
  ViewModelAssistedFactory<? extends ViewModel> bind(CountactUsViewModel_AssistedFactory factory);
}
