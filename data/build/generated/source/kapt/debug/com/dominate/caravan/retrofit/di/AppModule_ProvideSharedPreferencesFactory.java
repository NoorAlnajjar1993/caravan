package com.dominate.caravan.retrofit.di;

import android.app.Application;
import android.content.SharedPreferences;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class AppModule_ProvideSharedPreferencesFactory implements Factory<SharedPreferences> {
  private final Provider<Application> contextProvider;

  public AppModule_ProvideSharedPreferencesFactory(Provider<Application> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public SharedPreferences get() {
    return provideSharedPreferences(contextProvider.get());
  }

  public static AppModule_ProvideSharedPreferencesFactory create(
      Provider<Application> contextProvider) {
    return new AppModule_ProvideSharedPreferencesFactory(contextProvider);
  }

  public static SharedPreferences provideSharedPreferences(Application context) {
    return Preconditions.checkNotNull(AppModule.INSTANCE.provideSharedPreferences(context), "Cannot return null from a non-@Nullable @Provides method");
  }
}
