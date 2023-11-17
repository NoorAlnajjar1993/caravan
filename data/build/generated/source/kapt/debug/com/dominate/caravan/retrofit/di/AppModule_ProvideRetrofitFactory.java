package com.dominate.caravan.retrofit.di;

import com.dominate.caravan.utils.Prefs;
import com.google.gson.Gson;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class AppModule_ProvideRetrofitFactory implements Factory<Retrofit> {
  private final Provider<Gson> gsonProvider;

  private final Provider<Prefs> prefsProvider;

  public AppModule_ProvideRetrofitFactory(Provider<Gson> gsonProvider,
      Provider<Prefs> prefsProvider) {
    this.gsonProvider = gsonProvider;
    this.prefsProvider = prefsProvider;
  }

  @Override
  public Retrofit get() {
    return provideRetrofit(gsonProvider.get(), prefsProvider.get());
  }

  public static AppModule_ProvideRetrofitFactory create(Provider<Gson> gsonProvider,
      Provider<Prefs> prefsProvider) {
    return new AppModule_ProvideRetrofitFactory(gsonProvider, prefsProvider);
  }

  public static Retrofit provideRetrofit(Gson gson, Prefs prefs) {
    return Preconditions.checkNotNull(AppModule.INSTANCE.provideRetrofit(gson, prefs), "Cannot return null from a non-@Nullable @Provides method");
  }
}
