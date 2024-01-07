package com.dominate.caravan.ui.favourite;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0011"}, d2 = {"Lcom/dominate/caravan/ui/favourite/FavouriteViewModel;", "Landroidx/lifecycle/ViewModel;", "homeDataSource", "Lcom/dominate/caravan/retrofit/data/HomeDataSource;", "(Lcom/dominate/caravan/retrofit/data/HomeDataSource;)V", "favoriteListResponse", "Landroidx/lifecycle/MutableLiveData;", "Lcom/dominate/caravan/utils/Resource;", "Lcom/dominate/caravan/medule/favourite/FavouriteResponse;", "getFavoriteListResponse", "()Landroidx/lifecycle/MutableLiveData;", "getHomeDataSource", "()Lcom/dominate/caravan/retrofit/data/HomeDataSource;", "getFavoriteList", "", "token", "", "app_debug"})
public final class FavouriteViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.dominate.caravan.utils.Resource<com.dominate.caravan.medule.favourite.FavouriteResponse>> favoriteListResponse = null;
    @org.jetbrains.annotations.NotNull()
    private final com.dominate.caravan.retrofit.data.HomeDataSource homeDataSource = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.dominate.caravan.utils.Resource<com.dominate.caravan.medule.favourite.FavouriteResponse>> getFavoriteListResponse() {
        return null;
    }
    
    public final void getFavoriteList(@org.jetbrains.annotations.NotNull()
    java.lang.String token) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dominate.caravan.retrofit.data.HomeDataSource getHomeDataSource() {
        return null;
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public FavouriteViewModel(@org.jetbrains.annotations.NotNull()
    com.dominate.caravan.retrofit.data.HomeDataSource homeDataSource) {
        super();
    }
}