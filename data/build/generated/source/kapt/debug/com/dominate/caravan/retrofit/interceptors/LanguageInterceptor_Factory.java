package com.dominate.caravan.retrofit.interceptors;

import com.dominate.caravan.utils.Prefs;
import dagger.internal.Factory;
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
public final class LanguageInterceptor_Factory implements Factory<LanguageInterceptor> {
  private final Provider<Prefs> prefsProvider;

  public LanguageInterceptor_Factory(Provider<Prefs> prefsProvider) {
    this.prefsProvider = prefsProvider;
  }

  @Override
  public LanguageInterceptor get() {
    return newInstance(prefsProvider.get());
  }

  public static LanguageInterceptor_Factory create(Provider<Prefs> prefsProvider) {
    return new LanguageInterceptor_Factory(prefsProvider);
  }

  public static LanguageInterceptor newInstance(Prefs prefs) {
    return new LanguageInterceptor(prefs);
  }
}
