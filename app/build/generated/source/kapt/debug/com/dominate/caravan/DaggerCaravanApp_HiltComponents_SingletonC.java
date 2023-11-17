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
import com.dominate.caravan.retrofit.di.AppModule;
import com.dominate.caravan.retrofit.di.AppModule_ProvideSharedPreferencesFactory;
import com.dominate.caravan.subfeatures.banner.BannerViewModel_AssistedFactory;
import com.dominate.caravan.subfeatures.banner.BannerViewModel_AssistedFactory_Factory;
import com.dominate.caravan.ui.auth.editpassword.EditPasswordFragment;
import com.dominate.caravan.ui.auth.editpassword.EditPasswordViewModel_AssistedFactory;
import com.dominate.caravan.ui.auth.editpassword.EditPasswordViewModel_AssistedFactory_Factory;
import com.dominate.caravan.ui.auth.register.RegisterFragment;
import com.dominate.caravan.ui.auth.register.ReqisterViewModel_AssistedFactory;
import com.dominate.caravan.ui.auth.register.ReqisterViewModel_AssistedFactory_Factory;
import com.dominate.caravan.ui.auth.siginin.SiginInViewModel_AssistedFactory;
import com.dominate.caravan.ui.auth.siginin.SiginInViewModel_AssistedFactory_Factory;
import com.dominate.caravan.ui.auth.siginin.SigininFragment;
import com.dominate.caravan.ui.contactus.ContactUsFragment;
import com.dominate.caravan.ui.contactus.CountactUsViewModel_AssistedFactory;
import com.dominate.caravan.ui.contactus.CountactUsViewModel_AssistedFactory_Factory;
import com.dominate.caravan.ui.home.HomeActivity;
import com.dominate.caravan.ui.splach.SplachActivity;
import com.dominate.caravan.ui.uservisitor.UserNotLoginFragment;
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

      private volatile Provider<BannerViewModel_AssistedFactory> bannerViewModel_AssistedFactoryProvider;

      private volatile Provider<CountactUsViewModel_AssistedFactory> countactUsViewModel_AssistedFactoryProvider;

      private volatile Provider<EditPasswordViewModel_AssistedFactory> editPasswordViewModel_AssistedFactoryProvider;

      private volatile Provider<ReqisterViewModel_AssistedFactory> reqisterViewModel_AssistedFactoryProvider;

      private volatile Provider<SiginInViewModel_AssistedFactory> siginInViewModel_AssistedFactoryProvider;

      private ActivityCImpl(Activity activityParam) {
        this.activity = activityParam;
      }

      private Prefs getPrefs() {
        return new Prefs(DaggerCaravanApp_HiltComponents_SingletonC.this.getSharedPreferences());
      }

      private Provider<BannerViewModel_AssistedFactory> getBannerViewModel_AssistedFactoryProvider(
          ) {
        Object local = bannerViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(0);
          bannerViewModel_AssistedFactoryProvider = (Provider<BannerViewModel_AssistedFactory>) local;
        }
        return (Provider<BannerViewModel_AssistedFactory>) local;
      }

      private Provider<CountactUsViewModel_AssistedFactory> getCountactUsViewModel_AssistedFactoryProvider(
          ) {
        Object local = countactUsViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(1);
          countactUsViewModel_AssistedFactoryProvider = (Provider<CountactUsViewModel_AssistedFactory>) local;
        }
        return (Provider<CountactUsViewModel_AssistedFactory>) local;
      }

      private Provider<EditPasswordViewModel_AssistedFactory> getEditPasswordViewModel_AssistedFactoryProvider(
          ) {
        Object local = editPasswordViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(2);
          editPasswordViewModel_AssistedFactoryProvider = (Provider<EditPasswordViewModel_AssistedFactory>) local;
        }
        return (Provider<EditPasswordViewModel_AssistedFactory>) local;
      }

      private Provider<ReqisterViewModel_AssistedFactory> getReqisterViewModel_AssistedFactoryProvider(
          ) {
        Object local = reqisterViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(3);
          reqisterViewModel_AssistedFactoryProvider = (Provider<ReqisterViewModel_AssistedFactory>) local;
        }
        return (Provider<ReqisterViewModel_AssistedFactory>) local;
      }

      private Provider<SiginInViewModel_AssistedFactory> getSiginInViewModel_AssistedFactoryProvider(
          ) {
        Object local = siginInViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(4);
          siginInViewModel_AssistedFactoryProvider = (Provider<SiginInViewModel_AssistedFactory>) local;
        }
        return (Provider<SiginInViewModel_AssistedFactory>) local;
      }

      private Map<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>> getMapOfStringAndProviderOfViewModelAssistedFactoryOf(
          ) {
        return MapBuilder.<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>>newMapBuilder(5).put("com.dominate.caravan.subfeatures.banner.BannerViewModel", (Provider) getBannerViewModel_AssistedFactoryProvider()).put("com.dominate.caravan.ui.contactus.CountactUsViewModel", (Provider) getCountactUsViewModel_AssistedFactoryProvider()).put("com.dominate.caravan.ui.auth.editpassword.EditPasswordViewModel", (Provider) getEditPasswordViewModel_AssistedFactoryProvider()).put("com.dominate.caravan.ui.auth.register.ReqisterViewModel", (Provider) getReqisterViewModel_AssistedFactoryProvider()).put("com.dominate.caravan.ui.auth.siginin.SiginInViewModel", (Provider) getSiginInViewModel_AssistedFactoryProvider()).build();
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
      public void injectSplachActivity(SplachActivity splachActivity) {
        injectSplachActivity2(splachActivity);
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

      private SplachActivity injectSplachActivity2(SplachActivity instance) {
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
        public void injectContactUsFragment(ContactUsFragment contactUsFragment) {
          injectContactUsFragment2(contactUsFragment);
        }

        @Override
        public void injectUserNotLoginFragment(UserNotLoginFragment userNotLoginFragment) {
          injectUserNotLoginFragment2(userNotLoginFragment);
        }

        @Override
        public Set<ViewModelProvider.Factory> getFragmentViewModelFactory() {
          return Collections.<ViewModelProvider.Factory>singleton(getProvideFactory());
        }

        @Override
        public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
          return new ViewWithFragmentCBuilder();
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

        private ContactUsFragment injectContactUsFragment2(ContactUsFragment instance) {
          BaseFragment_MembersInjector.injectPrefs(instance, ActivityCImpl.this.getPrefs());
          return instance;
        }

        private UserNotLoginFragment injectUserNotLoginFragment2(UserNotLoginFragment instance) {
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
            case 0: // com.dominate.caravan.subfeatures.banner.BannerViewModel_AssistedFactory 
            return (T) BannerViewModel_AssistedFactory_Factory.newInstance();

            case 1: // com.dominate.caravan.ui.contactus.CountactUsViewModel_AssistedFactory 
            return (T) CountactUsViewModel_AssistedFactory_Factory.newInstance();

            case 2: // com.dominate.caravan.ui.auth.editpassword.EditPasswordViewModel_AssistedFactory 
            return (T) EditPasswordViewModel_AssistedFactory_Factory.newInstance();

            case 3: // com.dominate.caravan.ui.auth.register.ReqisterViewModel_AssistedFactory 
            return (T) ReqisterViewModel_AssistedFactory_Factory.newInstance();

            case 4: // com.dominate.caravan.ui.auth.siginin.SiginInViewModel_AssistedFactory 
            return (T) SiginInViewModel_AssistedFactory_Factory.newInstance();

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
