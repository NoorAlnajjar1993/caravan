package com.dominate.caravan;

import androidx.hilt.lifecycle.ViewModelFactoryModules;
import com.dominate.caravan.core.base.BaseActivity_GeneratedInjector;
import com.dominate.caravan.retrofit.di.AppModule;
import com.dominate.caravan.subfeatures.banner.BannerViewModel_HiltModule;
import com.dominate.caravan.ui.account.aboutcompany.AboutCompanyFragment_GeneratedInjector;
import com.dominate.caravan.ui.account.aboutcompany.AboutCompanyViewModel_HiltModule;
import com.dominate.caravan.ui.account.aboutcompany.privacypolicy.PrivacyPolicyFragment_GeneratedInjector;
import com.dominate.caravan.ui.account.aboutcompany.termofuse.TermOfUseFragment_GeneratedInjector;
import com.dominate.caravan.ui.account.accountsetting.AccountSettingFragment_GeneratedInjector;
import com.dominate.caravan.ui.account.accountsetting.AccountSettingViewModel_HiltModule;
import com.dominate.caravan.ui.account.changepassword.ChangePasswordFragment_GeneratedInjector;
import com.dominate.caravan.ui.account.changepassword.ChangePasswordViewModel_HiltModule;
import com.dominate.caravan.ui.account.profile.ProfileFragment_GeneratedInjector;
import com.dominate.caravan.ui.account.profile.ProfileViewModel_HiltModule;
import com.dominate.caravan.ui.account.realestateads.RealEstateAdsFragment_GeneratedInjector;
import com.dominate.caravan.ui.account.realestateads.RealEstateAdsViewModel_HiltModule;
import com.dominate.caravan.ui.addads.AddAdsFragment_GeneratedInjector;
import com.dominate.caravan.ui.addads.AddAdsViewModel_HiltModule;
import com.dominate.caravan.ui.addads.addadsimages.AddAdsImages_GeneratedInjector;
import com.dominate.caravan.ui.addads.addcommercialads.AddCommercialAdsFragment_GeneratedInjector;
import com.dominate.caravan.ui.addads.addcommercialestate.AddCommercialEstateFragment_GeneratedInjector;
import com.dominate.caravan.ui.addads.addcommercialestate.CommericalAdSpecificationsFragment_GeneratedInjector;
import com.dominate.caravan.ui.addads.addestateads.AddEstateAdsFragment_GeneratedInjector;
import com.dominate.caravan.ui.addads.addhousingads.AddHousingAdsFragment_GeneratedInjector;
import com.dominate.caravan.ui.addads.commericaladvertisment.CommericalAdvertismentFragment_GeneratedInjector;
import com.dominate.caravan.ui.addads.complete.CompleteFragment_GeneratedInjector;
import com.dominate.caravan.ui.auth.editpassword.EditPasswordFragment_GeneratedInjector;
import com.dominate.caravan.ui.auth.editpassword.EditPasswordViewModel_HiltModule;
import com.dominate.caravan.ui.auth.register.RegisterFragment_GeneratedInjector;
import com.dominate.caravan.ui.auth.register.ReqisterViewModel_HiltModule;
import com.dominate.caravan.ui.auth.siginin.SiginInViewModel_HiltModule;
import com.dominate.caravan.ui.auth.siginin.SigininFragment_GeneratedInjector;
import com.dominate.caravan.ui.commercialads.CommercialAdsFragment_GeneratedInjector;
import com.dominate.caravan.ui.commercialestate.CommercialEstateFragment_GeneratedInjector;
import com.dominate.caravan.ui.estatedetails.EstateDetailsFragment_GeneratedInjector;
import com.dominate.caravan.ui.estatedetails.EstateDetailsViewModel_HiltModule;
import com.dominate.caravan.ui.favourite.FavouriteFragment_GeneratedInjector;
import com.dominate.caravan.ui.favourite.FavouriteViewModel_HiltModule;
import com.dominate.caravan.ui.home.HomeActivity_GeneratedInjector;
import com.dominate.caravan.ui.home.HomeFragment_GeneratedInjector;
import com.dominate.caravan.ui.home.HomeViewModel_HiltModule;
import com.dominate.caravan.ui.housingads.HousingAdsFragment_GeneratedInjector;
import com.dominate.caravan.ui.notification.NotificationFragment_GeneratedInjector;
import com.dominate.caravan.ui.notification.NotificationViewModel_HiltModule;
import com.dominate.caravan.ui.owner.OwnerFragment_GeneratedInjector;
import com.dominate.caravan.ui.owner.OwnerViewModel_HiltModule;
import com.dominate.caravan.ui.search.FilterFragment_GeneratedInjector;
import com.dominate.caravan.ui.search.SearchFragment_GeneratedInjector;
import com.dominate.caravan.ui.search.SearchViewModel_HiltModule;
import com.dominate.caravan.ui.splach.SplashViewModel_HiltModule;
import dagger.Binds;
import dagger.Component;
import dagger.Module;
import dagger.Subcomponent;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.components.FragmentComponent;
import dagger.hilt.android.components.ServiceComponent;
import dagger.hilt.android.components.ViewComponent;
import dagger.hilt.android.components.ViewWithFragmentComponent;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.managers.ActivityComponentManager;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.android.internal.managers.HiltWrapper_ActivityRetainedComponentManager_LifecycleComponentBuilderEntryPoint;
import dagger.hilt.android.internal.managers.ServiceComponentManager;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.HiltWrapper_ActivityModule;
import dagger.hilt.android.scopes.ActivityRetainedScoped;
import dagger.hilt.android.scopes.ActivityScoped;
import dagger.hilt.android.scopes.FragmentScoped;
import dagger.hilt.android.scopes.ServiceScoped;
import dagger.hilt.android.scopes.ViewScoped;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedComponent;
import dagger.hilt.migration.DisableInstallInCheck;
import javax.annotation.Generated;
import javax.inject.Singleton;

@Generated("dagger.hilt.processor.internal.root.RootProcessor")
public final class CaravanApp_HiltComponents {
  private CaravanApp_HiltComponents() {
  }

  @Module(
      subcomponents = ActivityC.class
  )
  @DisableInstallInCheck
  @Generated("dagger.hilt.processor.internal.root.RootProcessor")
  abstract interface ActivityCBuilderModule {
    @Binds
    ActivityComponentBuilder bind(ActivityC.Builder builder);
  }

  @Module(
      subcomponents = ActivityRetainedC.class
  )
  @DisableInstallInCheck
  @Generated("dagger.hilt.processor.internal.root.RootProcessor")
  abstract interface ActivityRetainedCBuilderModule {
    @Binds
    ActivityRetainedComponentBuilder bind(ActivityRetainedC.Builder builder);
  }

  @Module(
      subcomponents = FragmentC.class
  )
  @DisableInstallInCheck
  @Generated("dagger.hilt.processor.internal.root.RootProcessor")
  abstract interface FragmentCBuilderModule {
    @Binds
    FragmentComponentBuilder bind(FragmentC.Builder builder);
  }

  @Module(
      subcomponents = ServiceC.class
  )
  @DisableInstallInCheck
  @Generated("dagger.hilt.processor.internal.root.RootProcessor")
  abstract interface ServiceCBuilderModule {
    @Binds
    ServiceComponentBuilder bind(ServiceC.Builder builder);
  }

  @Module(
      subcomponents = ViewC.class
  )
  @DisableInstallInCheck
  @Generated("dagger.hilt.processor.internal.root.RootProcessor")
  abstract interface ViewCBuilderModule {
    @Binds
    ViewComponentBuilder bind(ViewC.Builder builder);
  }

  @Module(
      subcomponents = ViewWithFragmentC.class
  )
  @DisableInstallInCheck
  @Generated("dagger.hilt.processor.internal.root.RootProcessor")
  abstract interface ViewWithFragmentCBuilderModule {
    @Binds
    ViewWithFragmentComponentBuilder bind(ViewWithFragmentC.Builder builder);
  }

  @Subcomponent(
      modules = {
          FragmentCBuilderModule.class,
          ViewCBuilderModule.class,
          DefaultViewModelFactories.ActivityModule.class,
          HiltWrapper_ActivityModule.class,
          ViewModelFactoryModules.ActivityModule.class
      }
  )
  @ActivityScoped
  public abstract static class ActivityC implements BaseActivity_GeneratedInjector,
      HomeActivity_GeneratedInjector,
      ActivityComponent,
      DefaultViewModelFactories.ActivityEntryPoint,
      FragmentComponentManager.FragmentComponentBuilderEntryPoint,
      ViewComponentManager.ViewComponentBuilderEntryPoint,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ActivityComponentBuilder {
    }
  }

  @Subcomponent(
      modules = {
          AboutCompanyViewModel_HiltModule.class,
          AccountSettingViewModel_HiltModule.class,
          AddAdsViewModel_HiltModule.class,
          BannerViewModel_HiltModule.class,
          ActivityCBuilderModule.class,
          ChangePasswordViewModel_HiltModule.class,
          EditPasswordViewModel_HiltModule.class,
          EstateDetailsViewModel_HiltModule.class,
          FavouriteViewModel_HiltModule.class,
          HomeViewModel_HiltModule.class,
          NotificationViewModel_HiltModule.class,
          OwnerViewModel_HiltModule.class,
          ProfileViewModel_HiltModule.class,
          RealEstateAdsViewModel_HiltModule.class,
          ReqisterViewModel_HiltModule.class,
          SearchViewModel_HiltModule.class,
          SiginInViewModel_HiltModule.class,
          SplashViewModel_HiltModule.class
      }
  )
  @ActivityRetainedScoped
  public abstract static class ActivityRetainedC implements ActivityRetainedComponent,
      ActivityComponentManager.ActivityComponentBuilderEntryPoint,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ActivityRetainedComponentBuilder {
    }
  }

  @Component(
      modules = {
          AppModule.class,
          ApplicationContextModule.class,
          ActivityRetainedCBuilderModule.class,
          ServiceCBuilderModule.class
      }
  )
  @Singleton
  public abstract static class SingletonC implements CaravanApp_GeneratedInjector,
      HiltWrapper_ActivityRetainedComponentManager_LifecycleComponentBuilderEntryPoint,
      ServiceComponentManager.ServiceComponentBuilderEntryPoint,
      SingletonComponent,
      GeneratedComponent {
  }

  @Subcomponent(
      modules = {
          ViewWithFragmentCBuilderModule.class,
          DefaultViewModelFactories.FragmentModule.class,
          ViewModelFactoryModules.FragmentModule.class
      }
  )
  @FragmentScoped
  public abstract static class FragmentC implements AboutCompanyFragment_GeneratedInjector,
      PrivacyPolicyFragment_GeneratedInjector,
      TermOfUseFragment_GeneratedInjector,
      AccountSettingFragment_GeneratedInjector,
      ChangePasswordFragment_GeneratedInjector,
      ProfileFragment_GeneratedInjector,
      RealEstateAdsFragment_GeneratedInjector,
      AddAdsFragment_GeneratedInjector,
      AddAdsImages_GeneratedInjector,
      AddCommercialAdsFragment_GeneratedInjector,
      AddCommercialEstateFragment_GeneratedInjector,
      CommericalAdSpecificationsFragment_GeneratedInjector,
      AddEstateAdsFragment_GeneratedInjector,
      AddHousingAdsFragment_GeneratedInjector,
      CommericalAdvertismentFragment_GeneratedInjector,
      CompleteFragment_GeneratedInjector,
      EditPasswordFragment_GeneratedInjector,
      RegisterFragment_GeneratedInjector,
      SigininFragment_GeneratedInjector,
      CommercialAdsFragment_GeneratedInjector,
      CommercialEstateFragment_GeneratedInjector,
      EstateDetailsFragment_GeneratedInjector,
      FavouriteFragment_GeneratedInjector,
      HomeFragment_GeneratedInjector,
      HousingAdsFragment_GeneratedInjector,
      NotificationFragment_GeneratedInjector,
      OwnerFragment_GeneratedInjector,
      com.dominate.caravan.ui.realestateads.RealEstateAdsFragment_GeneratedInjector,
      FilterFragment_GeneratedInjector,
      SearchFragment_GeneratedInjector,
      FragmentComponent,
      DefaultViewModelFactories.FragmentEntryPoint,
      ViewComponentManager.ViewWithFragmentComponentBuilderEntryPoint,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends FragmentComponentBuilder {
    }
  }

  @Subcomponent
  @ServiceScoped
  public abstract static class ServiceC implements ServiceComponent,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ServiceComponentBuilder {
    }
  }

  @Subcomponent
  @ViewScoped
  public abstract static class ViewC implements ViewComponent,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ViewComponentBuilder {
    }
  }

  @Subcomponent
  @ViewScoped
  public abstract static class ViewWithFragmentC implements ViewWithFragmentComponent,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ViewWithFragmentComponentBuilder {
    }
  }
}
