package com.dominate.caravan.utils;

import android.content.SharedPreferences;
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
public final class Prefs_Factory implements Factory<Prefs> {
  private final Provider<SharedPreferences> sharedPrefsProvider;

  public Prefs_Factory(Provider<SharedPreferences> sharedPrefsProvider) {
    this.sharedPrefsProvider = sharedPrefsProvider;
  }

  @Override
  public Prefs get() {
    return newInstance(sharedPrefsProvider.get());
  }

  public static Prefs_Factory create(Provider<SharedPreferences> sharedPrefsProvider) {
    return new Prefs_Factory(sharedPrefsProvider);
  }

  public static Prefs newInstance(SharedPreferences sharedPrefs) {
    return new Prefs(sharedPrefs);
  }
}
