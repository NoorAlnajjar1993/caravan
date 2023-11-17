package com.dominate.caravan.retrofit.di;

import com.dominate.caravan.retrofit.services.NetworkService;
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
public final class AppModule_ProvideNetworkServiceFactory implements Factory<NetworkService> {
  private final Provider<Retrofit> retrofitProvider;

  public AppModule_ProvideNetworkServiceFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public NetworkService get() {
    return provideNetworkService(retrofitProvider.get());
  }

  public static AppModule_ProvideNetworkServiceFactory create(Provider<Retrofit> retrofitProvider) {
    return new AppModule_ProvideNetworkServiceFactory(retrofitProvider);
  }

  public static NetworkService provideNetworkService(Retrofit retrofit) {
    return Preconditions.checkNotNull(AppModule.INSTANCE.provideNetworkService(retrofit), "Cannot return null from a non-@Nullable @Provides method");
  }
}
