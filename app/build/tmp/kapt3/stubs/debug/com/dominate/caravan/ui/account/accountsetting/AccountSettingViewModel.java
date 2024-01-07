package com.dominate.caravan.ui.account.accountsetting;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J8\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\f\u00a8\u0006\u001c"}, d2 = {"Lcom/dominate/caravan/ui/account/accountsetting/AccountSettingViewModel;", "Landroidx/lifecycle/ViewModel;", "ProfileDataSource", "Lcom/dominate/caravan/retrofit/data/ProfileDataSource;", "(Lcom/dominate/caravan/retrofit/data/ProfileDataSource;)V", "getProfileDataSource", "()Lcom/dominate/caravan/retrofit/data/ProfileDataSource;", "UserProfileResponse", "Landroidx/lifecycle/MutableLiveData;", "Lcom/dominate/caravan/utils/Resource;", "Lcom/dominate/caravan/medule/profile/profile/ProfileResponse;", "getUserProfileResponse", "()Landroidx/lifecycle/MutableLiveData;", "updateProfileResponse", "Lcom/dominate/caravan/medule/ExpectedResponse;", "getUpdateProfileResponse", "getUserProfile", "", "token", "", "updateProfile", "name", "Lokhttp3/RequestBody;", "phone_number", "whatsapp_number", "about", "image", "Lokhttp3/MultipartBody$Part;", "app_debug"})
public final class AccountSettingViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.dominate.caravan.utils.Resource<com.dominate.caravan.medule.profile.profile.ProfileResponse>> UserProfileResponse = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.dominate.caravan.utils.Resource<com.dominate.caravan.medule.ExpectedResponse>> updateProfileResponse = null;
    @org.jetbrains.annotations.NotNull()
    private final com.dominate.caravan.retrofit.data.ProfileDataSource ProfileDataSource = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.dominate.caravan.utils.Resource<com.dominate.caravan.medule.profile.profile.ProfileResponse>> getUserProfileResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.dominate.caravan.utils.Resource<com.dominate.caravan.medule.ExpectedResponse>> getUpdateProfileResponse() {
        return null;
    }
    
    public final void getUserProfile(@org.jetbrains.annotations.NotNull()
    java.lang.String token) {
    }
    
    public final void updateProfile(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    okhttp3.RequestBody name, @org.jetbrains.annotations.NotNull()
    okhttp3.RequestBody phone_number, @org.jetbrains.annotations.NotNull()
    okhttp3.RequestBody whatsapp_number, @org.jetbrains.annotations.NotNull()
    okhttp3.RequestBody about, @org.jetbrains.annotations.Nullable()
    okhttp3.MultipartBody.Part image) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dominate.caravan.retrofit.data.ProfileDataSource getProfileDataSource() {
        return null;
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public AccountSettingViewModel(@org.jetbrains.annotations.NotNull()
    com.dominate.caravan.retrofit.data.ProfileDataSource ProfileDataSource) {
        super();
    }
}