package com.dominate.caravan.retrofit.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J+\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ+\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\b\b\u0001\u0010\u0007\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J!\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J!\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00032\b\b\u0001\u0010\u0018\u001a\u00020\u0019H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ+\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ!\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00170\u00032\b\b\u0001\u0010\u001d\u001a\u00020\u001eH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJU\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010!\u001a\u00020\"2\b\b\u0001\u0010#\u001a\u00020\"2\b\b\u0001\u0010$\u001a\u00020\"2\b\b\u0001\u0010%\u001a\u00020\"2\n\b\u0001\u0010&\u001a\u0004\u0018\u00010\'H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010(J!\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006+"}, d2 = {"Lcom/dominate/caravan/retrofit/services/NetworkService;", "", "addFavoriteItem", "Lretrofit2/Response;", "Lcom/dominate/caravan/medule/ExpectedResponse;", "token", "", "favouriteRequest", "Lcom/dominate/caravan/medule/favourite/FavouriteRequest;", "(Ljava/lang/String;Lcom/dominate/caravan/medule/favourite/FavouriteRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "changePassword", "changePassRequest", "Lcom/dominate/caravan/medule/profile/changepassword/ChangePasswordRequest;", "(Ljava/lang/String;Lcom/dominate/caravan/medule/profile/changepassword/ChangePasswordRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHome", "Lcom/dominate/caravan/medule/home/HomeResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRealEstate", "Lcom/dominate/caravan/medule/favourite/FavouriteResponse;", "(Lcom/dominate/caravan/medule/favourite/FavouriteRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "listFavorite", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "register", "Lcom/dominate/caravan/medule/profile/user/UserResponse;", "signupRequest", "Lcom/dominate/caravan/medule/profile/signup/SignupRequest;", "(Lcom/dominate/caravan/medule/profile/signup/SignupRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeFavoriteItem", "signinUser", "signinRequest", "Lcom/dominate/caravan/medule/profile/signin/SigninRequest;", "(Lcom/dominate/caravan/medule/profile/signin/SigninRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateProfile", "name", "Lokhttp3/RequestBody;", "phone_number", "whatsapp_number", "about", "image", "Lokhttp3/MultipartBody$Part;", "(Ljava/lang/String;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "userProfile", "Lcom/dominate/caravan/medule/profile/profile/ProfileResponse;", "data_debug"})
public abstract interface NetworkService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "user/register")
    public abstract java.lang.Object register(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.dominate.caravan.medule.profile.signup.SignupRequest signupRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.dominate.caravan.medule.profile.user.UserResponse>> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "user/login")
    public abstract java.lang.Object signinUser(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.dominate.caravan.medule.profile.signin.SigninRequest signinRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.dominate.caravan.medule.profile.user.UserResponse>> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "user/profile")
    public abstract java.lang.Object userProfile(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.dominate.caravan.medule.profile.profile.ProfileResponse>> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "user/update-profile")
    @retrofit2.http.Multipart()
    public abstract java.lang.Object updateProfile(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Part(value = "name")
    okhttp3.RequestBody name, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Part(value = "phone_number")
    okhttp3.RequestBody phone_number, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Part(value = "whatsapp_number")
    okhttp3.RequestBody whatsapp_number, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Part(value = "about")
    okhttp3.RequestBody about, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Part()
    okhttp3.MultipartBody.Part image, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.dominate.caravan.medule.ExpectedResponse>> p6);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "user/change_password")
    public abstract java.lang.Object changePassword(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.dominate.caravan.medule.profile.changepassword.ChangePasswordRequest changePassRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.dominate.caravan.medule.ExpectedResponse>> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "home")
    public abstract java.lang.Object getHome(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.dominate.caravan.medule.home.HomeResponse>> p0);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "user/favorites/add")
    public abstract java.lang.Object addFavoriteItem(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.dominate.caravan.medule.favourite.FavouriteRequest favouriteRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.dominate.caravan.medule.ExpectedResponse>> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "user/favorites/remove")
    public abstract java.lang.Object removeFavoriteItem(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.dominate.caravan.medule.favourite.FavouriteRequest favouriteRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.dominate.caravan.medule.ExpectedResponse>> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "user/favorites")
    public abstract java.lang.Object listFavorite(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.dominate.caravan.medule.favourite.FavouriteResponse>> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "ads/details")
    public abstract java.lang.Object getRealEstate(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.dominate.caravan.medule.favourite.FavouriteRequest favouriteRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.dominate.caravan.medule.favourite.FavouriteResponse>> p1);
}