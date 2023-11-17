package com.dominate.caravan.retrofit.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ApplicationComponent.class})
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007\u00a8\u0006\u0013"}, d2 = {"Lcom/dominate/caravan/retrofit/di/AppModule;", "", "()V", "getLanguageHeaderOkHttpClient", "Lokhttp3/OkHttpClient;", "prefs", "Lcom/dominate/caravan/utils/Prefs;", "provideGson", "Lcom/google/gson/Gson;", "provideNetworkService", "Lcom/dominate/caravan/retrofit/services/NetworkService;", "retrofit", "Lretrofit2/Retrofit;", "provideRetrofit", "gson", "provideSharedPreferences", "Landroid/content/SharedPreferences;", "context", "Landroid/app/Application;", "data_debug"})
@dagger.Module()
public final class AppModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.dominate.caravan.retrofit.di.AppModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final retrofit2.Retrofit provideRetrofit(@org.jetbrains.annotations.NotNull()
    com.google.gson.Gson gson, @org.jetbrains.annotations.NotNull()
    com.dominate.caravan.utils.Prefs prefs) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.google.gson.Gson provideGson() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final android.content.SharedPreferences provideSharedPreferences(@org.jetbrains.annotations.NotNull()
    android.app.Application context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.dominate.caravan.retrofit.services.NetworkService provideNetworkService(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    /**
     * OkHttpClient
     */
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final okhttp3.OkHttpClient getLanguageHeaderOkHttpClient(@org.jetbrains.annotations.NotNull()
    com.dominate.caravan.utils.Prefs prefs) {
        return null;
    }
    
    private AppModule() {
        super();
    }
}