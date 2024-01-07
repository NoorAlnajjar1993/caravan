package com.dominate.caravan.ui.addads.commericaladvertisment;

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
    topLevelClass = CommericalAdvertismentViewModel.class
)
public interface CommericalAdvertismentViewModel_HiltModule {
  @Binds
  @IntoMap
  @StringKey("com.dominate.caravan.ui.addads.commericaladvertisment.CommericalAdvertismentViewModel")
  ViewModelAssistedFactory<? extends ViewModel> bind(
      CommericalAdvertismentViewModel_AssistedFactory factory);
}
