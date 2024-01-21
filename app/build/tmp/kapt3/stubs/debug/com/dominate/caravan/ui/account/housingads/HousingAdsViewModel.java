package com.dominate.caravan.ui.account.housingads;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bR&\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR&\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR&\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR&\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\n\"\u0004\b\u0015\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006\u001f"}, d2 = {"Lcom/dominate/caravan/ui/account/housingads/HousingAdsViewModel;", "Landroidx/lifecycle/ViewModel;", "homeDataSource", "Lcom/dominate/caravan/retrofit/data/HomeDataSource;", "(Lcom/dominate/caravan/retrofit/data/HomeDataSource;)V", "getEffectiveResponse", "Landroidx/lifecycle/MutableLiveData;", "Lcom/dominate/caravan/utils/Resource;", "Lcom/dominate/caravan/medule/housingads/HousingAdsResponse;", "getGetEffectiveResponse", "()Landroidx/lifecycle/MutableLiveData;", "setGetEffectiveResponse", "(Landroidx/lifecycle/MutableLiveData;)V", "getPausedResponse", "getGetPausedResponse", "setGetPausedResponse", "getPendingResponse", "getGetPendingResponse", "setGetPendingResponse", "getRejectedResponse", "getGetRejectedResponse", "setGetRejectedResponse", "getHomeDataSource", "()Lcom/dominate/caravan/retrofit/data/HomeDataSource;", "getEffectiveHousing", "", "token", "", "getPausedHousing", "getPendingHousing", "getRejectedHousing", "app_debug"})
public final class HousingAdsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.dominate.caravan.utils.Resource<com.dominate.caravan.medule.housingads.HousingAdsResponse>> getEffectiveResponse;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.dominate.caravan.utils.Resource<com.dominate.caravan.medule.housingads.HousingAdsResponse>> getPendingResponse;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.dominate.caravan.utils.Resource<com.dominate.caravan.medule.housingads.HousingAdsResponse>> getPausedResponse;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.dominate.caravan.utils.Resource<com.dominate.caravan.medule.housingads.HousingAdsResponse>> getRejectedResponse;
    @org.jetbrains.annotations.NotNull()
    private final com.dominate.caravan.retrofit.data.HomeDataSource homeDataSource = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.dominate.caravan.utils.Resource<com.dominate.caravan.medule.housingads.HousingAdsResponse>> getGetEffectiveResponse() {
        return null;
    }
    
    public final void setGetEffectiveResponse(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.dominate.caravan.utils.Resource<com.dominate.caravan.medule.housingads.HousingAdsResponse>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.dominate.caravan.utils.Resource<com.dominate.caravan.medule.housingads.HousingAdsResponse>> getGetPendingResponse() {
        return null;
    }
    
    public final void setGetPendingResponse(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.dominate.caravan.utils.Resource<com.dominate.caravan.medule.housingads.HousingAdsResponse>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.dominate.caravan.utils.Resource<com.dominate.caravan.medule.housingads.HousingAdsResponse>> getGetPausedResponse() {
        return null;
    }
    
    public final void setGetPausedResponse(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.dominate.caravan.utils.Resource<com.dominate.caravan.medule.housingads.HousingAdsResponse>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.dominate.caravan.utils.Resource<com.dominate.caravan.medule.housingads.HousingAdsResponse>> getGetRejectedResponse() {
        return null;
    }
    
    public final void setGetRejectedResponse(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.dominate.caravan.utils.Resource<com.dominate.caravan.medule.housingads.HousingAdsResponse>> p0) {
    }
    
    public final void getEffectiveHousing(@org.jetbrains.annotations.NotNull()
    java.lang.String token) {
    }
    
    public final void getPendingHousing(@org.jetbrains.annotations.NotNull()
    java.lang.String token) {
    }
    
    public final void getPausedHousing(@org.jetbrains.annotations.NotNull()
    java.lang.String token) {
    }
    
    public final void getRejectedHousing(@org.jetbrains.annotations.NotNull()
    java.lang.String token) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dominate.caravan.retrofit.data.HomeDataSource getHomeDataSource() {
        return null;
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public HousingAdsViewModel(@org.jetbrains.annotations.NotNull()
    com.dominate.caravan.retrofit.data.HomeDataSource homeDataSource) {
        super();
    }
}