package com.dominate.caravan.retrofit.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\'\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00062\u0006\u0010\b\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\'\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lcom/dominate/caravan/retrofit/data/HomeDataSource;", "Lcom/dominate/caravan/retrofit/data/BaseDataSource;", "networkService", "Lcom/dominate/caravan/retrofit/services/NetworkService;", "(Lcom/dominate/caravan/retrofit/services/NetworkService;)V", "addFavoriteItem", "Lcom/dominate/caravan/utils/Resource;", "Lcom/dominate/caravan/medule/ExpectedResponse;", "token", "", "id", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFavoriteList", "Lcom/dominate/caravan/medule/favourite/FavouriteResponse;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHome", "Lcom/dominate/caravan/medule/home/HomeResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRealEstate", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeFavoriteItem", "data_debug"})
public final class HomeDataSource extends com.dominate.caravan.retrofit.data.BaseDataSource {
    private final com.dominate.caravan.retrofit.services.NetworkService networkService = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getHome(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.dominate.caravan.utils.Resource<com.dominate.caravan.medule.home.HomeResponse>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object addFavoriteItem(@org.jetbrains.annotations.NotNull()
    java.lang.String token, int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.dominate.caravan.utils.Resource<com.dominate.caravan.medule.ExpectedResponse>> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object removeFavoriteItem(@org.jetbrains.annotations.NotNull()
    java.lang.String token, int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.dominate.caravan.utils.Resource<com.dominate.caravan.medule.ExpectedResponse>> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getFavoriteList(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.dominate.caravan.utils.Resource<com.dominate.caravan.medule.favourite.FavouriteResponse>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getRealEstate(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.dominate.caravan.utils.Resource<com.dominate.caravan.medule.favourite.FavouriteResponse>> p1) {
        return null;
    }
    
    @javax.inject.Inject()
    public HomeDataSource(@org.jetbrains.annotations.NotNull()
    com.dominate.caravan.retrofit.services.NetworkService networkService) {
        super();
    }
}