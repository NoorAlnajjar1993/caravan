package com.dominate.caravan.ui.account.commercialestateads;

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
    topLevelClass = CommercialEstateAdsViewModel.class
)
public interface CommercialEstateAdsViewModel_HiltModule {
  @Binds
  @IntoMap
  @StringKey("com.dominate.caravan.ui.account.commercialestateads.CommercialEstateAdsViewModel")
  ViewModelAssistedFactory<? extends ViewModel> bind(
      CommercialEstateAdsViewModel_AssistedFactory factory);
}
