package com.dominate.caravan.retrofit.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J/\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ/\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00062\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\'\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013JI\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00062\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u001f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00062\u0006\u0010\u000f\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001e"}, d2 = {"Lcom/dominate/caravan/retrofit/data/ProfileDataSource;", "Lcom/dominate/caravan/retrofit/data/BaseDataSource;", "networkService", "Lcom/dominate/caravan/retrofit/services/NetworkService;", "(Lcom/dominate/caravan/retrofit/services/NetworkService;)V", "register", "Lcom/dominate/caravan/utils/Resource;", "Lcom/dominate/caravan/medule/profile/user/UserResponse;", "name", "", "phone_number", "password", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resetPasswordProfile", "Lcom/dominate/caravan/medule/ExpectedResponse;", "token", "new_password", "signin", "username", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateProfile", "Lokhttp3/RequestBody;", "whatsapp_number", "about", "image", "Lokhttp3/MultipartBody$Part;", "(Ljava/lang/String;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "userProfile", "Lcom/dominate/caravan/medule/profile/profile/ProfileResponse;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_debug"})
public final class ProfileDataSource extends com.dominate.caravan.retrofit.data.BaseDataSource {
    private final com.dominate.caravan.retrofit.services.NetworkService networkService = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object register(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String phone_number, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.dominate.caravan.utils.Resource<com.dominate.caravan.medule.profile.user.UserResponse>> p3) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object signin(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.dominate.caravan.utils.Resource<com.dominate.caravan.medule.profile.user.UserResponse>> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object userProfile(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.dominate.caravan.utils.Resource<com.dominate.caravan.medule.profile.profile.ProfileResponse>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateProfile(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    okhttp3.RequestBody name, @org.jetbrains.annotations.NotNull()
    okhttp3.RequestBody phone_number, @org.jetbrains.annotations.NotNull()
    okhttp3.RequestBody whatsapp_number, @org.jetbrains.annotations.NotNull()
    okhttp3.RequestBody about, @org.jetbrains.annotations.Nullable()
    okhttp3.MultipartBody.Part image, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.dominate.caravan.utils.Resource<com.dominate.caravan.medule.ExpectedResponse>> p6) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object resetPasswordProfile(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    java.lang.String new_password, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.dominate.caravan.utils.Resource<com.dominate.caravan.medule.ExpectedResponse>> p3) {
        return null;
    }
    
    @javax.inject.Inject()
    public ProfileDataSource(@org.jetbrains.annotations.NotNull()
    com.dominate.caravan.retrofit.services.NetworkService networkService) {
        super();
    }
}