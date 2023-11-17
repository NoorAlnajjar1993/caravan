package com.dominate.caravan.ui.auth.siginin;

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
    topLevelClass = SiginInViewModel.class
)
public interface SiginInViewModel_HiltModule {
  @Binds
  @IntoMap
  @StringKey("com.dominate.caravan.ui.auth.siginin.SiginInViewModel")
  ViewModelAssistedFactory<? extends ViewModel> bind(SiginInViewModel_AssistedFactory factory);
}
