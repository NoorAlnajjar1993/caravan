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
public final class BaseFragment_MembersInjector implements MembersInjector<BaseFragment> {
  private final Provider<Prefs> prefsProvider;

  public BaseFragment_MembersInjector(Provider<Prefs> prefsProvider) {
    this.prefsProvider = prefsProvider;
  }

  public static MembersInjector<BaseFragment> create(Provider<Prefs> prefsProvider) {
    return new BaseFragment_MembersInjector(prefsProvider);
  }

  @Override
  public void injectMembers(BaseFragment instance) {
    injectPrefs(instance, prefsProvider.get());
  }

  @InjectedFieldSignature("com.dominate.caravan.core.base.BaseFragment.prefs")
  public static void injectPrefs(BaseFragment instance, Prefs prefs) {
    instance.prefs = prefs;
  }
}
