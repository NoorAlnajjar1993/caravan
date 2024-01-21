package com.dominate.caravan.ui.account.profile;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000eJ(\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\f\u00a8\u0006\u001f"}, d2 = {"Lcom/dominate/caravan/ui/account/profile/ProfileViewModel;", "Landroidx/lifecycle/ViewModel;", "ProfileDataSource", "Lcom/dominate/caravan/retrofit/data/ProfileDataSource;", "(Lcom/dominate/caravan/retrofit/data/ProfileDataSource;)V", "getProfileDataSource", "()Lcom/dominate/caravan/retrofit/data/ProfileDataSource;", "UserProfileResponse", "Landroidx/lifecycle/MutableLiveData;", "Lcom/dominate/caravan/utils/Resource;", "Lcom/dominate/caravan/medule/profile/profile/ProfileResponse;", "getUserProfileResponse", "()Landroidx/lifecycle/MutableLiveData;", "frontCivilIdImagePath", "", "getFrontCivilIdImagePath", "()Ljava/lang/String;", "setFrontCivilIdImagePath", "(Ljava/lang/String;)V", "updateProfileResponse", "Lcom/dominate/caravan/medule/ExpectedResponse;", "getUpdateProfileResponse", "getUserProfile", "", "token", "updateProfile", "name", "Lokhttp3/RequestBody;", "phone_number", "image", "Lokhttp3/MultipartBody$Part;", "app_debug"})
public final class ProfileViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.dominate.caravan.utils.Resource<com.dominate.caravan.medule.profile.profile.ProfileResponse>> UserProfileResponse = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String frontCivilIdImagePath = "";
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.dominate.caravan.utils.Resource<com.dominate.caravan.medule.ExpectedResponse>> updateProfileResponse = null;
    @org.jetbrains.annotations.NotNull()
    private final com.dominate.caravan.retrofit.data.ProfileDataSource ProfileDataSource = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.dominate.caravan.utils.Resource<com.dominate.caravan.medule.profile.profile.ProfileResponse>> getUserProfileResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFrontCivilIdImagePath() {
        return null;
    }
    
    public final void setFrontCivilIdImagePath(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
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
    okhttp3.RequestBody phone_number, @org.jetbrains.annotations.Nullable()
    okhttp3.MultipartBody.Part image) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dominate.caravan.retrofit.data.ProfileDataSource getProfileDataSource() {
        return null;
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public ProfileViewModel(@org.jetbrains.annotations.NotNull()
    com.dominate.caravan.retrofit.data.ProfileDataSource ProfileDataSource) {
        super();
    }
}