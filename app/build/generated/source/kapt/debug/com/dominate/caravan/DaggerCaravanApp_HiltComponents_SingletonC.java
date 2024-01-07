package com.dominate.caravan;

import android.app.Activity;
import android.app.Service;
import android.content.SharedPreferences;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.dominate.caravan.core.base.BaseActivity;
import com.dominate.caravan.core.base.BaseActivity_MembersInjector;
import com.dominate.caravan.core.base.BaseFragment_MembersInjector;
import com.dominate.caravan.retrofit.data.HomeDataSource;
import com.dominate.caravan.retrofit.data.ProfileDataSource;
import com.dominate.caravan.retrofit.di.AppModule;
import com.dominate.caravan.retrofit.di.AppModule_ProvideGsonFactory;
import com.dominate.caravan.retrofit.di.AppModule_ProvideNetworkServiceFactory;
import com.dominate.caravan.retrofit.di.AppModule_ProvideRetrofitFactory;
import com.dominate.caravan.retrofit.di.AppModule_ProvideSharedPreferencesFactory;
import com.dominate.caravan.retrofit.services.NetworkService;
import com.dominate.caravan.subfeatures.banner.BannerViewModel_AssistedFactory;
import com.dominate.caravan.subfeatures.banner.BannerViewModel_AssistedFactory_Factory;
import com.dominate.caravan.ui.account.aboutcompany.AboutCompanyFragment;
import com.dominate.caravan.ui.account.aboutcompany.AboutCompanyViewModel_AssistedFactory;
import com.dominate.caravan.ui.account.aboutcompany.AboutCompanyViewModel_AssistedFactory_Factory;
import com.dominate.caravan.ui.account.aboutcompany.privacypolicy.PrivacyPolicyFragment;
import com.dominate.caravan.ui.account.aboutcompany.termofuse.TermOfUseFragment;
import com.dominate.caravan.ui.account.accountsetting.AccountSettingFragment;
import com.dominate.caravan.ui.account.accountsetting.AccountSettingViewModel_AssistedFactory;
import com.dominate.caravan.ui.account.accountsetting.AccountSettingViewModel_AssistedFactory_Factory;
import com.dominate.caravan.ui.account.changepassword.ChangePasswordFragment;
import com.dominate.caravan.ui.account.changepassword.ChangePasswordViewModel_AssistedFactory;
import com.dominate.caravan.ui.account.changepassword.ChangePasswordViewModel_AssistedFactory_Factory;
import com.dominate.caravan.ui.account.profile.ProfileFragment;
import com.dominate.caravan.ui.account.profile.ProfileViewModel_AssistedFactory;
import com.dominate.caravan.ui.account.profile.ProfileViewModel_AssistedFactory_Factory;
import com.dominate.caravan.ui.account.realestateads.RealEstateAdsFragment;
import com.dominate.caravan.ui.account.realestateads.RealEstateAdsViewModel_AssistedFactory;
import com.dominate.caravan.ui.account.realestateads.RealEstateAdsViewModel_AssistedFactory_Factory;
import com.dominate.caravan.ui.addads.AddAdsFragment;
import com.dominate.caravan.ui.addads.AddAdsViewModel_AssistedFactory;
import com.dominate.caravan.ui.addads.AddAdsViewModel_AssistedFactory_Factory;
import com.dominate.caravan.ui.addads.commericaladvertisment.CommericalAdvertismentFragment;
import com.dominate.caravan.ui.addads.commericaladvertisment.CommericalAdvertismentViewModel_AssistedFactory;
import com.dominate.caravan.ui.addads.commericaladvertisment.CommericalAdvertismentViewModel_AssistedFactory_Factory;
import com.dominate.caravan.ui.auth.editpassword.EditPasswordFragment;
import com.dominate.caravan.ui.auth.editpassword.EditPasswordViewModel_AssistedFactory;
import com.dominate.caravan.ui.auth.editpassword.EditPasswordViewModel_AssistedFactory_Factory;
import com.dominate.caravan.ui.auth.register.RegisterFragment;
import com.dominate.caravan.ui.auth.register.ReqisterViewModel_AssistedFactory;
import com.dominate.caravan.ui.auth.register.ReqisterViewModel_AssistedFactory_Factory;
import com.dominate.caravan.ui.auth.siginin.SiginInViewModel_AssistedFactory;
import com.dominate.caravan.ui.auth.siginin.SiginInViewModel_AssistedFactory_Factory;
import com.dominate.caravan.ui.auth.siginin.SigininFragment;
import com.dominate.caravan.ui.favourite.FavouriteFragment;
import com.dominate.caravan.ui.favourite.FavouriteViewModel_AssistedFactory;
import com.dominate.caravan.ui.favourite.FavouriteViewModel_AssistedFactory_Factory;
import com.dominate.caravan.ui.home.HomeActivity;
import com.dominate.caravan.ui.home.HomeFragment;
import com.dominate.caravan.ui.home.HomeViewModel_AssistedFactory;
import com.dominate.caravan.ui.home.HomeViewModel_AssistedFactory_Factory;
import com.dominate.caravan.ui.notification.NotificationFragment;
import com.dominate.caravan.ui.notification.NotificationViewModel_AssistedFactory;
import com.dominate.caravan.ui.notification.NotificationViewModel_AssistedFactory_Factory;
import com.dominate.caravan.ui.search.FilterFragment;
import com.dominate.caravan.ui.search.SearchFragment;
import com.dominate.caravan.ui.search.SearchViewModel_AssistedFactory;
import com.dominate.caravan.ui.search.SearchViewModel_AssistedFactory_Factory;
import com.dominate.caravan.ui.splach.SplashViewModel_AssistedFactory;
import com.dominate.caravan.ui.splach.SplashViewModel_AssistedFactory_Factory;
import com.dominate.caravan.utils.Prefs;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.MapBuilder;
import dagger.internal.MemoizedSentinel;
import dagger.internal.Preconditions;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerCaravanApp_HiltComponents_SingletonC extends CaravanApp_HiltComponents.SingletonC {
  private final ApplicationContextModule applicationContextModule;

  private volatile Object sharedPreferences = new MemoizedSentinel();

  private volatile Object retrofit = new MemoizedSentinel();

  private DaggerCaravanApp_HiltComponents_SingletonC(
      ApplicationContextModule applicationContextModuleParam) {
    this.applicationContextModule = applicationContextModuleParam;
  }

  public static Builder builder() {
    return new Builder();
  }

  private SharedPreferences getSharedPreferences() {
    Object local = sharedPreferences;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = sharedPreferences;
        if (local instanceof MemoizedSentinel) {
          local = AppModule_ProvideSharedPreferencesFactory.provideSharedPreferences(ApplicationContextModule_ProvideApplicationFactory.provideApplication(applicationContextModule));
          sharedPreferences = DoubleCheck.reentrantCheck(sharedPreferences, local);
        }
      }
    }
    return (SharedPreferences) local;
  }

  private Prefs getPrefs() {
    return new Prefs(getSharedPreferences());
  }

  private Retrofit getRetrofit() {
    Object local = retrofit;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = retrofit;
        if (local instanceof MemoizedSentinel) {
          local = AppModule_ProvideRetrofitFactory.provideRetrofit(AppModule_ProvideGsonFactory.provideGson(), getPrefs());
          retrofit = DoubleCheck.reentrantCheck(retrofit, local);
        }
      }
    }
    return (Retrofit) local;
  }

  private NetworkService getNetworkService() {
    return AppModule_ProvideNetworkServiceFactory.provideNetworkService(getRetrofit());
  }

  @Override
  public void injectCaravanApp(CaravanApp caravanApp) {
  }

  @Override
  public ActivityRetainedComponentBuilder retainedComponentBuilder() {
    return new ActivityRetainedCBuilder();
  }

  @Override
  public ServiceComponentBuilder serviceComponentBuilder() {
    return new ServiceCBuilder();
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private Builder() {
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder appModule(AppModule appModule) {
      Preconditions.checkNotNull(appModule);
      return this;
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    public CaravanApp_HiltComponents.SingletonC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new DaggerCaravanApp_HiltComponents_SingletonC(applicationContextModule);
    }
  }

  private final class ActivityRetainedCBuilder implements CaravanApp_HiltComponents.ActivityRetainedC.Builder {
    @Override
    public CaravanApp_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl();
    }
  }

  private final class ActivityRetainedCImpl extends CaravanApp_HiltComponents.ActivityRetainedC {
    private ActivityRetainedCImpl() {

    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder();
    }

    private final class ActivityCBuilder implements CaravanApp_HiltComponents.ActivityC.Builder {
      private Activity activity;

      @Override
      public ActivityCBuilder activity(Activity arg0) {
        this.activity = Preconditions.checkNotNull(arg0);
        return this;
      }

      @Override
      public CaravanApp_HiltComponents.ActivityC build() {
        Preconditions.checkBuilderRequirement(activity, Activity.class);
        return new ActivityCImpl(activity);
      }
    }

    private final class ActivityCImpl extends CaravanApp_HiltComponents.ActivityC {
      private final Activity activity;

      private volatile Provider<AboutCompanyViewModel_AssistedFactory> aboutCompanyViewModel_AssistedFactoryProvider;

      private volatile Provider<ProfileDataSource> profileDataSourceProvider;

      private volatile Provider<AccountSettingViewModel_AssistedFactory> accountSettingViewModel_AssistedFactoryProvider;

      private volatile Provider<AddAdsViewModel_AssistedFactory> addAdsViewModel_AssistedFactoryProvider;

      private volatile Provider<BannerViewModel_AssistedFactory> bannerViewModel_AssistedFactoryProvider;

      private volatile Provider<ChangePasswordViewModel_AssistedFactory> changePasswordViewModel_AssistedFactoryProvider;

      private volatile Provider<CommericalAdvertismentViewModel_AssistedFactory> commericalAdvertismentViewModel_AssistedFactoryProvider;

      private volatile Provider<EditPasswordViewModel_AssistedFactory> editPasswordViewModel_AssistedFactoryProvider;

      private volatile Provider<HomeDataSource> homeDataSourceProvider;

      private volatile Provider<FavouriteViewModel_AssistedFactory> favouriteViewModel_AssistedFactoryProvider;

      private volatile Provider<HomeViewModel_AssistedFactory> homeViewModel_AssistedFactoryProvider;

      private volatile Provider<NotificationViewModel_AssistedFactory> notificationViewModel_AssistedFactoryProvider;

      private volatile Provider<ProfileViewModel_AssistedFactory> profileViewModel_AssistedFactoryProvider;

      private volatile Provider<RealEstateAdsViewModel_AssistedFactory> realEstateAdsViewModel_AssistedFactoryProvider;

      private volatile Provider<ReqisterViewModel_AssistedFactory> reqisterViewModel_AssistedFactoryProvider;

      private volatile Provider<SearchViewModel_AssistedFactory> searchViewModel_AssistedFactoryProvider;

      private volatile Provider<SiginInViewModel_AssistedFactory> siginInViewModel_AssistedFactoryProvider;

      private volatile Provider<SplashViewModel_AssistedFactory> splashViewModel_AssistedFactoryProvider;

      private ActivityCImpl(Activity activityParam) {
        this.activity = activityParam;
      }

      private Prefs getPrefs() {
        return new Prefs(DaggerCaravanApp_HiltComponents_SingletonC.this.getSharedPreferences());
      }

      private Provider<AboutCompanyViewModel_AssistedFactory> getAboutCompanyViewModel_AssistedFactoryProvider(
          ) {
        Object local = aboutCompanyViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(0);
          aboutCompanyViewModel_AssistedFactoryProvider = (Provider<AboutCompanyViewModel_AssistedFactory>) local;
        }
        return (Provider<AboutCompanyViewModel_AssistedFactory>) local;
      }

      private ProfileDataSource getProfileDataSource() {
        return new ProfileDataSource(DaggerCaravanApp_HiltComponents_SingletonC.this.getNetworkService());
      }

      private Provider<ProfileDataSource> getProfileDataSourceProvider() {
        Object local = profileDataSourceProvider;
        if (local == null) {
          local = new SwitchingProvider<>(2);
          profileDataSourceProvider = (Provider<ProfileDataSource>) local;
        }
        return (Provider<ProfileDataSource>) local;
      }

      private AccountSettingViewModel_AssistedFactory getAccountSettingViewModel_AssistedFactory() {
        return AccountSettingViewModel_AssistedFactory_Factory.newInstance(getProfileDataSourceProvider());
      }

      private Provider<AccountSettingViewModel_AssistedFactory> getAccountSettingViewModel_AssistedFactoryProvider(
          ) {
        Object local = accountSettingViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(1);
          accountSettingViewModel_AssistedFactoryProvider = (Provider<AccountSettingViewModel_AssistedFactory>) local;
        }
        return (Provider<AccountSettingViewModel_AssistedFactory>) local;
      }

      private Provider<AddAdsViewModel_AssistedFactory> getAddAdsViewModel_AssistedFactoryProvider(
          ) {
        Object local = addAdsViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(3);
          addAdsViewModel_AssistedFactoryProvider = (Provider<AddAdsViewModel_AssistedFactory>) local;
        }
        return (Provider<AddAdsViewModel_AssistedFactory>) local;
      }

      private Provider<BannerViewModel_AssistedFactory> getBannerViewModel_AssistedFactoryProvider(
          ) {
        Object local = bannerViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(4);
          bannerViewModel_AssistedFactoryProvider = (Provider<BannerViewModel_AssistedFactory>) local;
        }
        return (Provider<BannerViewModel_AssistedFactory>) local;
      }

      private ChangePasswordViewModel_AssistedFactory getChangePasswordViewModel_AssistedFactory() {
        return ChangePasswordViewModel_AssistedFactory_Factory.newInstance(getProfileDataSourceProvider());
      }

      private Provider<ChangePasswordViewModel_AssistedFactory> getChangePasswordViewModel_AssistedFactoryProvider(
          ) {
        Object local = changePasswordViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(5);
          changePasswordViewModel_AssistedFactoryProvider = (Provider<ChangePasswordViewModel_AssistedFactory>) local;
        }
        return (Provider<ChangePasswordViewModel_AssistedFactory>) local;
      }

      private Provider<CommericalAdvertismentViewModel_AssistedFactory> getCommericalAdvertismentViewModel_AssistedFactoryProvider(
          ) {
        Object local = commericalAdvertismentViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(6);
          commericalAdvertismentViewModel_AssistedFactoryProvider = (Provider<CommericalAdvertismentViewModel_AssistedFactory>) local;
        }
        return (Provider<CommericalAdvertismentViewModel_AssistedFactory>) local;
      }

      private Provider<EditPasswordViewModel_AssistedFactory> getEditPasswordViewModel_AssistedFactoryProvider(
          ) {
        Object local = editPasswordViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(7);
          editPasswordViewModel_AssistedFactoryProvider = (Provider<EditPasswordViewModel_AssistedFactory>) local;
        }
        return (Provider<EditPasswordViewModel_AssistedFactory>) local;
      }

      private HomeDataSource getHomeDataSource() {
        return new HomeDataSource(DaggerCaravanApp_HiltComponents_SingletonC.this.getNetworkService());
      }

      private Provider<HomeDataSource> getHomeDataSourceProvider() {
        Object local = homeDataSourceProvider;
        if (local == null) {
          local = new SwitchingProvider<>(9);
          homeDataSourceProvider = (Provider<HomeDataSource>) local;
        }
        return (Provider<HomeDataSource>) local;
      }

      private FavouriteViewModel_AssistedFactory getFavouriteViewModel_AssistedFactory() {
        return FavouriteViewModel_AssistedFactory_Factory.newInstance(getHomeDataSourceProvider());
      }

      private Provider<FavouriteViewModel_AssistedFactory> getFavouriteViewModel_AssistedFactoryProvider(
          ) {
        Object local = favouriteViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(8);
          favouriteViewModel_AssistedFactoryProvider = (Provider<FavouriteViewModel_AssistedFactory>) local;
        }
        return (Provider<FavouriteViewModel_AssistedFactory>) local;
      }

      private HomeViewModel_AssistedFactory getHomeViewModel_AssistedFactory() {
        return HomeViewModel_AssistedFactory_Factory.newInstance(getHomeDataSourceProvider());
      }

      private Provider<HomeViewModel_AssistedFactory> getHomeViewModel_AssistedFactoryProvider() {
        Object local = homeViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(10);
          homeViewModel_AssistedFactoryProvider = (Provider<HomeViewModel_AssistedFactory>) local;
        }
        return (Provider<HomeViewModel_AssistedFactory>) local;
      }

      private Provider<NotificationViewModel_AssistedFactory> getNotificationViewModel_AssistedFactoryProvider(
          ) {
        Object local = notificationViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(11);
          notificationViewModel_AssistedFactoryProvider = (Provider<NotificationViewModel_AssistedFactory>) local;
        }
        return (Provider<NotificationViewModel_AssistedFactory>) local;
      }

      private ProfileViewModel_AssistedFactory getProfileViewModel_AssistedFactory() {
        return ProfileViewModel_AssistedFactory_Factory.newInstance(getProfileDataSourceProvider());
      }

      private Provider<ProfileViewModel_AssistedFactory> getProfileViewModel_AssistedFactoryProvider(
          ) {
        Object local = profileViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(12);
          profileViewModel_AssistedFactoryProvider = (Provider<ProfileViewModel_AssistedFactory>) local;
        }
        return (Provider<ProfileViewModel_AssistedFactory>) local;
      }

      private Provider<RealEstateAdsViewModel_AssistedFactory> getRealEstateAdsViewModel_AssistedFactoryProvider(
          ) {
        Object local = realEstateAdsViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(13);
          realEstateAdsViewModel_AssistedFactoryProvider = (Provider<RealEstateAdsViewModel_AssistedFactory>) local;
        }
        return (Provider<RealEstateAdsViewModel_AssistedFactory>) local;
      }

      private ReqisterViewModel_AssistedFactory getReqisterViewModel_AssistedFactory() {
        return ReqisterViewModel_AssistedFactory_Factory.newInstance(getProfileDataSourceProvider());
      }

      private Provider<ReqisterViewModel_AssistedFactory> getReqisterViewModel_AssistedFactoryProvider(
          ) {
        Object local = reqisterViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(14);
          reqisterViewModel_AssistedFactoryProvider = (Provider<ReqisterViewModel_AssistedFactory>) local;
        }
        return (Provider<ReqisterViewModel_AssistedFactory>) local;
      }

      private Provider<SearchViewModel_AssistedFactory> getSearchViewModel_AssistedFactoryProvider(
          ) {
        Object local = searchViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(15);
          searchViewModel_AssistedFactoryProvider = (Provider<SearchViewModel_AssistedFactory>) local;
        }
        return (Provider<SearchViewModel_AssistedFactory>) local;
      }

      private SiginInViewModel_AssistedFactory getSiginInViewModel_AssistedFactory() {
        return SiginInViewModel_AssistedFactory_Factory.newInstance(getProfileDataSourceProvider());
      }

      private Provider<SiginInViewModel_AssistedFactory> getSiginInViewModel_AssistedFactoryProvider(
          ) {
        Object local = siginInViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(16);
          siginInViewModel_AssistedFactoryProvider = (Provider<SiginInViewModel_AssistedFactory>) local;
        }
        return (Provider<SiginInViewModel_AssistedFactory>) local;
      }

      private Provider<SplashViewModel_AssistedFactory> getSplashViewModel_AssistedFactoryProvider(
          ) {
        Object local = splashViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(17);
          splashViewModel_AssistedFactoryProvider = (Provider<SplashViewModel_AssistedFactory>) local;
        }
        return (Provider<SplashViewModel_AssistedFactory>) local;
      }

      private Map<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>> getMapOfStringAndProviderOfViewModelAssistedFactoryOf(
          ) {
        return MapBuilder.<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>>newMapBuilder(16).put("com.dominate.caravan.ui.account.aboutcompany.AboutCompanyViewModel", (Provider) getAboutCompanyViewModel_AssistedFactoryProvider()).put("com.dominate.caravan.ui.account.accountsetting.AccountSettingViewModel", (Provider) getAccountSettingViewModel_AssistedFactoryProvider()).put("com.dominate.caravan.ui.addads.AddAdsViewModel", (Provider) getAddAdsViewModel_AssistedFactoryProvider()).put("com.dominate.caravan.subfeatures.banner.BannerViewModel", (Provider) getBannerViewModel_AssistedFactoryProvider()).put("com.dominate.caravan.ui.account.changepassword.ChangePasswordViewModel", (Provider) getChangePasswordViewModel_AssistedFactoryProvider()).put("com.dominate.caravan.ui.addads.commericaladvertisment.CommericalAdvertismentViewModel", (Provider) getCommericalAdvertismentViewModel_AssistedFactoryProvider()).put("com.dominate.caravan.ui.auth.editpassword.EditPasswordViewModel", (Provider) getEditPasswordViewModel_AssistedFactoryProvider()).put("com.dominate.caravan.ui.favourite.FavouriteViewModel", (Provider) getFavouriteViewModel_AssistedFactoryProvider()).put("com.dominate.caravan.ui.home.HomeViewModel", (Provider) getHomeViewModel_AssistedFactoryProvider()).put("com.dominate.caravan.ui.notification.NotificationViewModel", (Provider) getNotificationViewModel_AssistedFactoryProvider()).put("com.dominate.caravan.ui.account.profile.ProfileViewModel", (Provider) getProfileViewModel_AssistedFactoryProvider()).put("com.dominate.caravan.ui.account.realestateads.RealEstateAdsViewModel", (Provider) getRealEstateAdsViewModel_AssistedFactoryProvider()).put("com.dominate.caravan.ui.auth.register.ReqisterViewModel", (Provider) getReqisterViewModel_AssistedFactoryProvider()).put("com.dominate.caravan.ui.search.SearchViewModel", (Provider) getSearchViewModel_AssistedFactoryProvider()).put("com.dominate.caravan.ui.auth.siginin.SiginInViewModel", (Provider) getSiginInViewModel_AssistedFactoryProvider()).put("com.dominate.caravan.ui.splach.SplashViewModel", (Provider) getSplashViewModel_AssistedFactoryProvider()).build();
      }

      private ViewModelProvider.Factory getProvideFactory() {
        return ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory.provideFactory(activity, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerCaravanApp_HiltComponents_SingletonC.this.applicationContextModule), getMapOfStringAndProviderOfViewModelAssistedFactoryOf());
      }

      @Override
      public void injectBaseActivity(BaseActivity baseActivity) {
        injectBaseActivity2(baseActivity);
      }

      @Override
      public void injectHomeActivity(HomeActivity homeActivity) {
        injectHomeActivity2(homeActivity);
      }

      @Override
      public Set<ViewModelProvider.Factory> getActivityViewModelFactory() {
        return Collections.<ViewModelProvider.Factory>singleton(getProvideFactory());
      }

      @Override
      public FragmentComponentBuilder fragmentComponentBuilder() {
        return new FragmentCBuilder();
      }

      @Override
      public ViewComponentBuilder viewComponentBuilder() {
        return new ViewCBuilder();
      }

      private BaseActivity injectBaseActivity2(BaseActivity instance) {
        BaseActivity_MembersInjector.injectPrefs(instance, getPrefs());
        return instance;
      }

      private HomeActivity injectHomeActivity2(HomeActivity instance) {
        BaseActivity_MembersInjector.injectPrefs(instance, getPrefs());
        return instance;
      }

      private final class FragmentCBuilder implements CaravanApp_HiltComponents.FragmentC.Builder {
        private Fragment fragment;

        @Override
        public FragmentCBuilder fragment(Fragment arg0) {
          this.fragment = Preconditions.checkNotNull(arg0);
          return this;
        }

        @Override
        public CaravanApp_HiltComponents.FragmentC build() {
          Preconditions.checkBuilderRequirement(fragment, Fragment.class);
          return new FragmentCImpl(fragment);
        }
      }

      private final class FragmentCImpl extends CaravanApp_HiltComponents.FragmentC {
        private final Fragment fragment;

        private FragmentCImpl(Fragment fragmentParam) {
          this.fragment = fragmentParam;
        }

        private ViewModelProvider.Factory getProvideFactory() {
          return ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory.provideFactory(fragment, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerCaravanApp_HiltComponents_SingletonC.this.applicationContextModule), ActivityCImpl.this.getMapOfStringAndProviderOfViewModelAssistedFactoryOf());
        }

        @Override
        public void injectAboutCompanyFragment(AboutCompanyFragment aboutCompanyFragment) {
          injectAboutCompanyFragment2(aboutCompanyFragment);
        }

        @Override
        public void injectPrivacyPolicyFragment(PrivacyPolicyFragment privacyPolicyFragment) {
          injectPrivacyPolicyFragment2(privacyPolicyFragment);
        }

        @Override
        public void injectTermOfUseFragment(TermOfUseFragment termOfUseFragment) {
          injectTermOfUseFragment2(termOfUseFragment);
        }

        @Override
        public void injectAccountSettingFragment(AccountSettingFragment accountSettingFragment) {
          injectAccountSettingFragment2(accountSettingFragment);
        }

        @Override
        public void injectChangePasswordFragment(ChangePasswordFragment changePasswordFragment) {
          injectChangePasswordFragment2(changePasswordFragment);
        }

        @Override
        public void injectProfileFragment(ProfileFragment profileFragment) {
          injectProfileFragment2(profileFragment);
        }

        @Override
        public void injectRealEstateAdsFragment(RealEstateAdsFragment realEstateAdsFragment) {
          injectRealEstateAdsFragment2(realEstateAdsFragment);
        }

        @Override
        public void injectAddAdsFragment(AddAdsFragment addAdsFragment) {
          injectAddAdsFragment2(addAdsFragment);
        }

        @Override
        public void injectCommericalAdvertismentFragment(
            CommericalAdvertismentFragment commericalAdvertismentFragment) {
          injectCommericalAdvertismentFragment2(commericalAdvertismentFragment);
        }

        @Override
        public void injectEditPasswordFragment(EditPasswordFragment editPasswordFragment) {
          injectEditPasswordFragment2(editPasswordFragment);
        }

        @Override
        public void injectRegisterFragment(RegisterFragment registerFragment) {
          injectRegisterFragment2(registerFragment);
        }

        @Override
        public void injectSigininFragment(SigininFragment sigininFragment) {
          injectSigininFragment2(sigininFragment);
        }

        @Override
        public void injectFavouriteFragment(FavouriteFragment favouriteFragment) {
          injectFavouriteFragment2(favouriteFragment);
        }

        @Override
        public void injectHomeFragment(HomeFragment homeFragment) {
          injectHomeFragment2(homeFragment);
        }

        @Override
        public void injectNotificationFragment(NotificationFragment notificationFragment) {
          injectNotificationFragment2(notificationFragment);
        }

        @Override
        public void injectFilterFragment(FilterFragment filterFragment) {
          injectFilterFragment2(filterFragment);
        }

        @Override
        public void injectSearchFragment(SearchFragment searchFragment) {
          injectSearchFragment2(searchFragment);
        }

        @Override
        public Set<ViewModelProvider.Factory> getFragmentViewModelFactory() {
          return Collections.<ViewModelProvider.Factory>singleton(getProvideFactory());
        }

        @Override
        public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
          return new ViewWithFragmentCBuilder();
        }

        private AboutCompanyFragment injectAboutCompanyFragment2(AboutCompanyFragment instance) {
          BaseFragment_MembersInjector.injectPrefs(instance, ActivityCImpl.this.getPrefs());
          return instance;
        }

        private PrivacyPolicyFragment injectPrivacyPolicyFragment2(PrivacyPolicyFragment instance) {
          BaseFragment_MembersInjector.injectPrefs(instance, ActivityCImpl.this.getPrefs());
          return instance;
        }

        private TermOfUseFragment injectTermOfUseFragment2(TermOfUseFragment instance) {
          BaseFragment_MembersInjector.injectPrefs(instance, ActivityCImpl.this.getPrefs());
          return instance;
        }

        private AccountSettingFragment injectAccountSettingFragment2(
            AccountSettingFragment instance) {
          BaseFragment_MembersInjector.injectPrefs(instance, ActivityCImpl.this.getPrefs());
          return instance;
        }

        private ChangePasswordFragment injectChangePasswordFragment2(
            ChangePasswordFragment instance) {
          BaseFragment_MembersInjector.injectPrefs(instance, ActivityCImpl.this.getPrefs());
          return instance;
        }

        private ProfileFragment injectProfileFragment2(ProfileFragment instance) {
          BaseFragment_MembersInjector.injectPrefs(instance, ActivityCImpl.this.getPrefs());
          return instance;
        }

        private RealEstateAdsFragment injectRealEstateAdsFragment2(RealEstateAdsFragment instance) {
          BaseFragment_MembersInjector.injectPrefs(instance, ActivityCImpl.this.getPrefs());
          return instance;
        }

        private AddAdsFragment injectAddAdsFragment2(AddAdsFragment instance) {
          BaseFragment_MembersInjector.injectPrefs(instance, ActivityCImpl.this.getPrefs());
          return instance;
        }

        private CommericalAdvertismentFragment injectCommericalAdvertismentFragment2(
            CommericalAdvertismentFragment instance) {
          BaseFragment_MembersInjector.injectPrefs(instance, ActivityCImpl.this.getPrefs());
          return instance;
        }

        private EditPasswordFragment injectEditPasswordFragment2(EditPasswordFragment instance) {
          BaseFragment_MembersInjector.injectPrefs(instance, ActivityCImpl.this.getPrefs());
          return instance;
        }

        private RegisterFragment injectRegisterFragment2(RegisterFragment instance) {
          BaseFragment_MembersInjector.injectPrefs(instance, ActivityCImpl.this.getPrefs());
          return instance;
        }

        private SigininFragment injectSigininFragment2(SigininFragment instance) {
          BaseFragment_MembersInjector.injectPrefs(instance, ActivityCImpl.this.getPrefs());
          return instance;
        }

        private FavouriteFragment injectFavouriteFragment2(FavouriteFragment instance) {
          BaseFragment_MembersInjector.injectPrefs(instance, ActivityCImpl.this.getPrefs());
          return instance;
        }

        private HomeFragment injectHomeFragment2(HomeFragment instance) {
          BaseFragment_MembersInjector.injectPrefs(instance, ActivityCImpl.this.getPrefs());
          return instance;
        }

        private NotificationFragment injectNotificationFragment2(NotificationFragment instance) {
          BaseFragment_MembersInjector.injectPrefs(instance, ActivityCImpl.this.getPrefs());
          return instance;
        }

        private FilterFragment injectFilterFragment2(FilterFragment instance) {
          BaseFragment_MembersInjector.injectPrefs(instance, ActivityCImpl.this.getPrefs());
          return instance;
        }

        private SearchFragment injectSearchFragment2(SearchFragment instance) {
          BaseFragment_MembersInjector.injectPrefs(instance, ActivityCImpl.this.getPrefs());
          return instance;
        }

        private final class ViewWithFragmentCBuilder implements CaravanApp_HiltComponents.ViewWithFragmentC.Builder {
          private View view;

          @Override
          public ViewWithFragmentCBuilder view(View arg0) {
            this.view = Preconditions.checkNotNull(arg0);
            return this;
          }

          @Override
          public CaravanApp_HiltComponents.ViewWithFragmentC build() {
            Preconditions.checkBuilderRequirement(view, View.class);
            return new ViewWithFragmentCImpl(view);
          }
        }

        private final class ViewWithFragmentCImpl extends CaravanApp_HiltComponents.ViewWithFragmentC {
          private ViewWithFragmentCImpl(View view) {

          }
        }
      }

      private final class ViewCBuilder implements CaravanApp_HiltComponents.ViewC.Builder {
        private View view;

        @Override
        public ViewCBuilder view(View arg0) {
          this.view = Preconditions.checkNotNull(arg0);
          return this;
        }

        @Override
        public CaravanApp_HiltComponents.ViewC build() {
          Preconditions.checkBuilderRequirement(view, View.class);
          return new ViewCImpl(view);
        }
      }

      private final class ViewCImpl extends CaravanApp_HiltComponents.ViewC {
        private ViewCImpl(View view) {

        }
      }

      private final class SwitchingProvider<T> implements Provider<T> {
        private final int id;

        SwitchingProvider(int id) {
          this.id = id;
        }

        @SuppressWarnings("unchecked")
        @Override
        public T get() {
          switch (id) {
            case 0: // com.dominate.caravan.ui.account.aboutcompany.AboutCompanyViewModel_AssistedFactory 
            return (T) AboutCompanyViewModel_AssistedFactory_Factory.newInstance();

            case 1: // com.dominate.caravan.ui.account.accountsetting.AccountSettingViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getAccountSettingViewModel_AssistedFactory();

            case 2: // com.dominate.caravan.retrofit.data.ProfileDataSource 
            return (T) ActivityCImpl.this.getProfileDataSource();

            case 3: // com.dominate.caravan.ui.addads.AddAdsViewModel_AssistedFactory 
            return (T) AddAdsViewModel_AssistedFactory_Factory.newInstance();

            case 4: // com.dominate.caravan.subfeatures.banner.BannerViewModel_AssistedFactory 
            return (T) BannerViewModel_AssistedFactory_Factory.newInstance();

            case 5: // com.dominate.caravan.ui.account.changepassword.ChangePasswordViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getChangePasswordViewModel_AssistedFactory();

            case 6: // com.dominate.caravan.ui.addads.commericaladvertisment.CommericalAdvertismentViewModel_AssistedFactory 
            return (T) CommericalAdvertismentViewModel_AssistedFactory_Factory.newInstance();

            case 7: // com.dominate.caravan.ui.auth.editpassword.EditPasswordViewModel_AssistedFactory 
            return (T) EditPasswordViewModel_AssistedFactory_Factory.newInstance();

            case 8: // com.dominate.caravan.ui.favourite.FavouriteViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getFavouriteViewModel_AssistedFactory();

            case 9: // com.dominate.caravan.retrofit.data.HomeDataSource 
            return (T) ActivityCImpl.this.getHomeDataSource();

            case 10: // com.dominate.caravan.ui.home.HomeViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getHomeViewModel_AssistedFactory();

            case 11: // com.dominate.caravan.ui.notification.NotificationViewModel_AssistedFactory 
            return (T) NotificationViewModel_AssistedFactory_Factory.newInstance();

            case 12: // com.dominate.caravan.ui.account.profile.ProfileViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getProfileViewModel_AssistedFactory();

            case 13: // com.dominate.caravan.ui.account.realestateads.RealEstateAdsViewModel_AssistedFactory 
            return (T) RealEstateAdsViewModel_AssistedFactory_Factory.newInstance();

            case 14: // com.dominate.caravan.ui.auth.register.ReqisterViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getReqisterViewModel_AssistedFactory();

            case 15: // com.dominate.caravan.ui.search.SearchViewModel_AssistedFactory 
            return (T) SearchViewModel_AssistedFactory_Factory.newInstance();

            case 16: // com.dominate.caravan.ui.auth.siginin.SiginInViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getSiginInViewModel_AssistedFactory();

            case 17: // com.dominate.caravan.ui.splach.SplashViewModel_AssistedFactory 
            return (T) SplashViewModel_AssistedFactory_Factory.newInstance();

            default: throw new AssertionError(id);
          }
        }
      }
    }
  }

  private final class ServiceCBuilder implements CaravanApp_HiltComponents.ServiceC.Builder {
    private Service service;

    @Override
    public ServiceCBuilder service(Service arg0) {
      this.service = Preconditions.checkNotNull(arg0);
      return this;
    }

    @Override
    public CaravanApp_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(service);
    }
  }

  private final class ServiceCImpl extends CaravanApp_HiltComponents.ServiceC {
    private ServiceCImpl(Service service) {

    }
  }
}
