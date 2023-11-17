package com.dominate.caravan.ui.auth.register;

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
    topLevelClass = ReqisterViewModel.class
)
public interface ReqisterViewModel_HiltModule {
  @Binds
  @IntoMap
  @StringKey("com.dominate.caravan.ui.auth.register.ReqisterViewModel")
  ViewModelAssistedFactory<? extends ViewModel> bind(ReqisterViewModel_AssistedFactory factory);
}
