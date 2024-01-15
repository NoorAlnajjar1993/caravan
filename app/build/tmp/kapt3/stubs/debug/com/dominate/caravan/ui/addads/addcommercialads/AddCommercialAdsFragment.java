package com.dominate.caravan.ui.addads.addcommercialads;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J(\u0010#\u001a\u00020 2\u0006\u0010!\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\u00142\u0006\u0010\'\u001a\u00020\u0014H\u0016J&\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J(\u00100\u001a\u00020 2\u0006\u0010!\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00142\u0006\u00101\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\u0014H\u0016J\u001a\u00102\u001a\u00020 2\u0006\u00103\u001a\u00020)2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\b\u00104\u001a\u00020 H\u0002J\u000e\u00105\u001a\u00020 2\u0006\u00106\u001a\u000207R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR+\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001c\u00a8\u00068"}, d2 = {"Lcom/dominate/caravan/ui/addads/addcommercialads/AddCommercialAdsFragment;", "Lcom/dominate/caravan/core/base/BaseFragment;", "Landroid/text/TextWatcher;", "()V", "addCommercialEstateAdapter", "Lcom/dominate/caravan/ui/addads/addcommercialestate/adapter/AddCommercialEstateAdapter;", "getAddCommercialEstateAdapter", "()Lcom/dominate/caravan/ui/addads/addcommercialestate/adapter/AddCommercialEstateAdapter;", "setAddCommercialEstateAdapter", "(Lcom/dominate/caravan/ui/addads/addcommercialestate/adapter/AddCommercialEstateAdapter;)V", "<set-?>", "Lcom/caravan/databinding/FragmentAddCommercialAdsBinding;", "binding", "getBinding", "()Lcom/caravan/databinding/FragmentAddCommercialAdsBinding;", "setBinding", "(Lcom/caravan/databinding/FragmentAddCommercialAdsBinding;)V", "binding$delegate", "Lcom/dominate/caravan/core/AutoClearedValue;", "estateType", "", "getEstateType", "()I", "setEstateType", "(I)V", "viewModel", "Lcom/dominate/caravan/ui/addads/AddAdsViewModel;", "getViewModel", "()Lcom/dominate/caravan/ui/addads/AddAdsViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "count", "after", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onTextChanged", "before", "onViewCreated", "view", "setData", "showErrorToast", "message", "", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class AddCommercialAdsFragment extends com.dominate.caravan.core.base.BaseFragment implements android.text.TextWatcher {
    @org.jetbrains.annotations.NotNull()
    private final com.dominate.caravan.core.AutoClearedValue binding$delegate = null;
    private final kotlin.Lazy viewModel$delegate = null;
    public com.dominate.caravan.ui.addads.addcommercialestate.adapter.AddCommercialEstateAdapter addCommercialEstateAdapter;
    private int estateType = 0;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.caravan.databinding.FragmentAddCommercialAdsBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.caravan.databinding.FragmentAddCommercialAdsBinding p0) {
    }
    
    private final com.dominate.caravan.ui.addads.AddAdsViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dominate.caravan.ui.addads.addcommercialestate.adapter.AddCommercialEstateAdapter getAddCommercialEstateAdapter() {
        return null;
    }
    
    public final void setAddCommercialEstateAdapter(@org.jetbrains.annotations.NotNull()
    com.dominate.caravan.ui.addads.addcommercialestate.adapter.AddCommercialEstateAdapter p0) {
    }
    
    public final int getEstateType() {
        return 0;
    }
    
    public final void setEstateType(int p0) {
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
    
    public final void showErrorToast(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public AddCommercialAdsFragment() {
        super();
    }
}