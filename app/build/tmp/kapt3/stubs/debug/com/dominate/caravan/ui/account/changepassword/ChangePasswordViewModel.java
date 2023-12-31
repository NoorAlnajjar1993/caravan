package com.dominate.caravan.ui.account.changepassword;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\r\u001a\u00020\u000eJ\u001e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001f\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0014"}, d2 = {"Lcom/dominate/caravan/ui/account/changepassword/ChangePasswordViewModel;", "Landroidx/lifecycle/ViewModel;", "ProfileDataSource", "Lcom/dominate/caravan/retrofit/data/ProfileDataSource;", "(Lcom/dominate/caravan/retrofit/data/ProfileDataSource;)V", "getProfileDataSource", "()Lcom/dominate/caravan/retrofit/data/ProfileDataSource;", "updatepass", "Landroidx/lifecycle/MutableLiveData;", "Lcom/dominate/caravan/utils/Resource;", "Lcom/dominate/caravan/medule/ExpectedResponse;", "getUpdatepass", "()Landroidx/lifecycle/MutableLiveData;", "reset", "", "resetPassword", "token", "", "currentPass", "newPass", "app_debug"})
public final class ChangePasswordViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.dominate.caravan.utils.Resource<com.dominate.caravan.medule.ExpectedResponse>> updatepass = null;
    @org.jetbrains.annotations.NotNull()
    private final com.dominate.caravan.retrofit.data.ProfileDataSource ProfileDataSource = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.dominate.caravan.utils.Resource<com.dominate.caravan.medule.ExpectedResponse>> getUpdatepass() {
        return null;
    }
    
    public final void resetPassword(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    java.lang.String currentPass, @org.jetbrains.annotations.NotNull()
    java.lang.String newPass) {
    }
    
    public final void reset() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dominate.caravan.retrofit.data.ProfileDataSource getProfileDataSource() {
        return null;
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public ChangePasswordViewModel(@org.jetbrains.annotations.NotNull()
    com.dominate.caravan.retrofit.data.ProfileDataSource ProfileDataSource) {
        super();
    }
}