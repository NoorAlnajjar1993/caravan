package com.dominate.caravan.ui.addads.complete;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J(\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 H\u0016J\b\u0010#\u001a\u00020\u001aH\u0002J\b\u0010$\u001a\u00020\u001aH\u0002J\b\u0010%\u001a\u00020\u001aH\u0002J\b\u0010&\u001a\u00020\u001aH\u0002J&\u0010\'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J(\u0010/\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u00100\u001a\u00020 2\u0006\u0010!\u001a\u00020 H\u0016J\u001a\u00101\u001a\u00020\u001a2\u0006\u00102\u001a\u00020(2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\b\u00103\u001a\u00020\u001aH\u0002J\u000e\u00104\u001a\u00020\u001a2\u0006\u00105\u001a\u00020\u000eR+\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00058F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016\u00a8\u00066"}, d2 = {"Lcom/dominate/caravan/ui/addads/complete/CompleteFragment;", "Lcom/dominate/caravan/core/base/BaseFragment;", "Landroid/text/TextWatcher;", "()V", "<set-?>", "Lcom/caravan/databinding/FragmentCompleteBinding;", "binding", "getBinding", "()Lcom/caravan/databinding/FragmentCompleteBinding;", "setBinding", "(Lcom/caravan/databinding/FragmentCompleteBinding;)V", "binding$delegate", "Lcom/dominate/caravan/core/AutoClearedValue;", "token", "", "getToken", "()Ljava/lang/String;", "setToken", "(Ljava/lang/String;)V", "viewModel", "Lcom/dominate/caravan/ui/addads/AddAdsViewModel;", "getViewModel", "()Lcom/dominate/caravan/ui/addads/AddAdsViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "observeCreateCommercialAds", "observeCreateCommercialEstateAds", "observeCreateHousingAds", "observeCreateRealStateAds", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onTextChanged", "before", "onViewCreated", "view", "setData", "showErrorToast", "message", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class CompleteFragment extends com.dominate.caravan.core.base.BaseFragment implements android.text.TextWatcher {
    @org.jetbrains.annotations.NotNull()
    private final com.dominate.caravan.core.AutoClearedValue binding$delegate = null;
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String token = "";
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.caravan.databinding.FragmentCompleteBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.caravan.databinding.FragmentCompleteBinding p0) {
    }
    
    private final com.dominate.caravan.ui.addads.AddAdsViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getToken() {
        return null;
    }
    
    public final void setToken(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
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
    public void afterTextChanged(@org.jetbrains.annotations.NotNull()
    android.text.Editable s) {
    }
    
    @java.lang.Override()
    public void beforeTextChanged(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence s, int start, int count, int after) {
    }
    
    @java.lang.Override()
    public void onTextChanged(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence s, int start, int before, int count) {
    }
    
    private final void setData() {
    }
    
    private final void observeCreateCommercialAds() {
    }
    
    private final void observeCreateRealStateAds() {
    }
    
    private final void observeCreateCommercialEstateAds() {
    }
    
    private final void observeCreateHousingAds() {
    }
    
    public final void showErrorToast(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public CompleteFragment() {
        super();
    }
}