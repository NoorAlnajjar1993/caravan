package com.dominate.caravan.subfeatures.banner;

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
    topLevelClass = BannerViewModel.class
)
public interface BannerViewModel_HiltModule {
  @Binds
  @IntoMap
  @StringKey("com.dominate.caravan.subfeatures.banner.BannerViewModel")
  ViewModelAssistedFactory<? extends ViewModel> bind(BannerViewModel_AssistedFactory factory);
}
