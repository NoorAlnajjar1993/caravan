package com.dominate.caravan.ui.account.commercialestateads;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J*\u0010#\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010$2\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020&2\u0006\u0010(\u001a\u00020&H\u0016J\b\u0010)\u001a\u00020 H\u0002J\b\u0010*\u001a\u00020 H\u0002J\b\u0010+\u001a\u00020 H\u0002J\b\u0010,\u001a\u00020 H\u0002J$\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u0001022\b\u00103\u001a\u0004\u0018\u000104H\u0016J*\u00105\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010$2\u0006\u0010%\u001a\u00020&2\u0006\u00106\u001a\u00020&2\u0006\u0010\'\u001a\u00020&H\u0016J\u001a\u00107\u001a\u00020 2\u0006\u00108\u001a\u00020.2\b\u00103\u001a\u0004\u0018\u000104H\u0016J\b\u00109\u001a\u00020 H\u0002R+\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00058F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\r\u001a\u00020\u000eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001c\u00a8\u0006:"}, d2 = {"Lcom/dominate/caravan/ui/account/commercialestateads/CommercialEstateAdsFragment;", "Lcom/dominate/caravan/core/base/BaseFragment;", "Landroid/text/TextWatcher;", "()V", "<set-?>", "Lcom/caravan/databinding/FragmentRealEstateAdsBinding;", "binding", "getBinding", "()Lcom/caravan/databinding/FragmentRealEstateAdsBinding;", "setBinding", "(Lcom/caravan/databinding/FragmentRealEstateAdsBinding;)V", "binding$delegate", "Lcom/dominate/caravan/core/AutoClearedValue;", "myAdsAdapter", "Lcom/dominate/caravan/ui/account/commercialestateads/adapter/MyAdsCommercialEstateAdapter;", "getMyAdsAdapter", "()Lcom/dominate/caravan/ui/account/commercialestateads/adapter/MyAdsCommercialEstateAdapter;", "setMyAdsAdapter", "(Lcom/dominate/caravan/ui/account/commercialestateads/adapter/MyAdsCommercialEstateAdapter;)V", "token", "", "getToken", "()Ljava/lang/String;", "setToken", "(Ljava/lang/String;)V", "viewModel", "Lcom/dominate/caravan/ui/account/commercialestateads/CommercialEstateAdsViewModel;", "getViewModel", "()Lcom/dominate/caravan/ui/account/commercialestateads/CommercialEstateAdsViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "observeEffective", "observePaused", "observeRejected", "observeUnderReview", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onTextChanged", "before", "onViewCreated", "view", "setData", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class CommercialEstateAdsFragment extends com.dominate.caravan.core.base.BaseFragment implements android.text.TextWatcher {
    @org.jetbrains.annotations.NotNull()
    private final com.dominate.caravan.core.AutoClearedValue binding$delegate = null;
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String token = "";
    public com.dominate.caravan.ui.account.commercialestateads.adapter.MyAdsCommercialEstateAdapter myAdsAdapter;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.caravan.databinding.FragmentRealEstateAdsBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.caravan.databinding.FragmentRealEstateAdsBinding p0) {
    }
    
    private final com.dominate.caravan.ui.account.commercialestateads.CommercialEstateAdsViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getToken() {
        return null;
    }
    
    public final void setToken(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dominate.caravan.ui.account.commercialestateads.adapter.MyAdsCommercialEstateAdapter getMyAdsAdapter() {
        return null;
    }
    
    public final void setMyAdsAdapter(@org.jetbrains.annotations.NotNull()
    com.dominate.caravan.ui.account.commercialestateads.adapter.MyAdsCommercialEstateAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void beforeTextChanged(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence s, int start, int count, int after) {
    }
    
    @java.lang.Override()
    public void onTextChanged(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence s, int start, int before, int count) {
    }
    
    @java.lang.Override()
    public void afterTextChanged(@org.jetbrains.annotations.Nullable()
    android.text.Editable s) {
    }
    
    private final void setData() {
    }
    
    private final void observeEffective() {
    }
    
    private final void observeUnderReview() {
    }
    
    private final void observePaused() {
    }
    
    private final void observeRejected() {
    }
    
    public CommercialEstateAdsFragment() {
        super();
    }
}