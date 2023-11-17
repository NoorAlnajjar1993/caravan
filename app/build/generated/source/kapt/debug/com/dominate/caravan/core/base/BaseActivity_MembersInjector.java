package com.dominate.caravan.core.base;

import com.dominate.caravan.utils.Prefs;
import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
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
public final class BaseActivity_MembersInjector implements MembersInjector<BaseActivity> {
  private final Provider<Prefs> prefsProvider;

  public BaseActivity_MembersInjector(Provider<Prefs> prefsProvider) {
    this.prefsProvider = prefsProvider;
  }

  public static MembersInjector<BaseActivity> create(Provider<Prefs> prefsProvider) {
    return new BaseActivity_MembersInjector(prefsProvider);
  }

  @Override
  public void injectMembers(BaseActivity instance) {
    injectPrefs(instance, prefsProvider.get());
  }

  @InjectedFieldSignature("com.dominate.caravan.core.base.BaseActivity.prefs")
  public static void injectPrefs(BaseActivity instance, Prefs prefs) {
    instance.prefs = prefs;
  }
}
