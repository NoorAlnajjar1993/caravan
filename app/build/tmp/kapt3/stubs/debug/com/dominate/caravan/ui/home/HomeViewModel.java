package com.dominate.caravan.ui.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u0015J\u0016\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR&\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\n\u00a8\u0006\u001c"}, d2 = {"Lcom/dominate/caravan/ui/home/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "homeDataSource", "Lcom/dominate/caravan/retrofit/data/HomeDataSource;", "(Lcom/dominate/caravan/retrofit/data/HomeDataSource;)V", "addFavoriteResponse", "Landroidx/lifecycle/MutableLiveData;", "Lcom/dominate/caravan/utils/Resource;", "Lcom/dominate/caravan/medule/ExpectedResponse;", "getAddFavoriteResponse", "()Landroidx/lifecycle/MutableLiveData;", "getHomeResponse", "Lcom/dominate/caravan/medule/home/HomeResponse;", "getGetHomeResponse", "setGetHomeResponse", "(Landroidx/lifecycle/MutableLiveData;)V", "getHomeDataSource", "()Lcom/dominate/caravan/retrofit/data/HomeDataSource;", "removeFavoriteResponse", "getRemoveFavoriteResponse", "addFavoriteItem", "", "token", "", "id", "", "getHome", "removeFavoriteItem", "app_debug"})
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.dominate.caravan.utils.Resource<com.dominate.caravan.medule.home.HomeResponse>> getHomeResponse;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.dominate.caravan.utils.Resource<com.dominate.caravan.medule.ExpectedResponse>> addFavoriteResponse = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.dominate.caravan.utils.Resource<com.dominate.caravan.medule.ExpectedResponse>> removeFavoriteResponse = null;
    @org.jetbrains.annotations.NotNull()
    private final com.dominate.caravan.retrofit.data.HomeDataSource homeDataSource = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.dominate.caravan.utils.Resource<com.dominate.caravan.medule.home.HomeResponse>> getGetHomeResponse() {
        return null;
    }
    
    public final void setGetHomeResponse(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.dominate.caravan.utils.Resource<com.dominate.caravan.medule.home.HomeResponse>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.dominate.caravan.utils.Resource<com.dominate.caravan.medule.ExpectedResponse>> getAddFavoriteResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.dominate.caravan.utils.Resource<com.dominate.caravan.medule.ExpectedResponse>> getRemoveFavoriteResponse() {
        return null;
    }
    
    public final void getHome() {
    }
    
    public final void addFavoriteItem(@org.jetbrains.annotations.NotNull()
    java.lang.String token, int id) {
    }
    
    public final void removeFavoriteItem(@org.jetbrains.annotations.NotNull()
    java.lang.String token, int id) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dominate.caravan.retrofit.data.HomeDataSource getHomeDataSource() {
        return null;
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public HomeViewModel(@org.jetbrains.annotations.NotNull()
    com.dominate.caravan.retrofit.data.HomeDataSource homeDataSource) {
        super();
    }
}