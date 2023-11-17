package com.dominate.caravan.retrofit.di;

import com.dominate.caravan.utils.Prefs;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_GetLanguageHeaderOkHttpClientFactory implements Factory<OkHttpClient> {
  private final Provider<Prefs> prefsProvider;

  public AppModule_GetLanguageHeaderOkHttpClientFactory(Provider<Prefs> prefsProvider) {
    this.prefsProvider = prefsProvider;
  }

  @Override
  public OkHttpClient get() {
    return getLanguageHeaderOkHttpClient(prefsProvider.get());
  }

  public static AppModule_GetLanguageHeaderOkHttpClientFactory create(
      Provider<Prefs> prefsProvider) {
    return new AppModule_GetLanguageHeaderOkHttpClientFactory(prefsProvider);
  }

  public static OkHttpClient getLanguageHeaderOkHttpClient(Prefs prefs) {
    return Preconditions.checkNotNull(AppModule.INSTANCE.getLanguageHeaderOkHttpClient(prefs), "Cannot return null from a non-@Nullable @Provides method");
  }
}
