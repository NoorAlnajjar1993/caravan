package com.dominate.caravan.ui.auth.register;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012J\u0006\u0010\u0015\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R(\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0016"}, d2 = {"Lcom/dominate/caravan/ui/auth/register/ReqisterViewModel;", "Landroidx/lifecycle/ViewModel;", "ProfileDataSource", "Lcom/dominate/caravan/retrofit/data/ProfileDataSource;", "(Lcom/dominate/caravan/retrofit/data/ProfileDataSource;)V", "getProfileDataSource", "()Lcom/dominate/caravan/retrofit/data/ProfileDataSource;", "register", "Landroidx/lifecycle/MutableLiveData;", "Lcom/dominate/caravan/utils/Resource;", "Lcom/dominate/caravan/medule/profile/user/UserResponse;", "getRegister", "()Landroidx/lifecycle/MutableLiveData;", "setRegister", "(Landroidx/lifecycle/MutableLiveData;)V", "registerUser", "", "name", "", "phone_number", "password", "reset", "app_debug"})
public final class ReqisterViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.dominate.caravan.utils.Resource<com.dominate.caravan.medule.profile.user.UserResponse>> register;
    @org.jetbrains.annotations.NotNull()
    private final com.dominate.caravan.retrofit.data.ProfileDataSource ProfileDataSource = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.dominate.caravan.utils.Resource<com.dominate.caravan.medule.profile.user.UserResponse>> getRegister() {
        return null;
    }
    
    public final void setRegister(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.dominate.caravan.utils.Resource<com.dominate.caravan.medule.profile.user.UserResponse>> p0) {
    }
    
    public final void registerUser(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String phone_number, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
    }
    
    public final void reset() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dominate.caravan.retrofit.data.ProfileDataSource getProfileDataSource() {
        return null;
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public ReqisterViewModel(@org.jetbrains.annotations.NotNull()
    com.dominate.caravan.retrofit.data.ProfileDataSource ProfileDataSource) {
        super();
    }
}