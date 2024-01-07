package com.dominate.caravan.ui.account.accountsetting;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J*\u0010\u001d\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 H\u0016J\b\u0010#\u001a\u00020\u001aH\u0002J\b\u0010$\u001a\u00020\u001aH\u0002J\b\u0010%\u001a\u00020\u001aH\u0002J$\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J*\u0010.\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010/\u001a\u00020 2\u0006\u0010!\u001a\u00020 H\u0016J\u001a\u00100\u001a\u00020\u001a2\u0006\u00101\u001a\u00020\'2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\b\u00102\u001a\u00020\u001aH\u0002J\u000e\u00103\u001a\u00020\u001a2\u0006\u00104\u001a\u00020\u000eJ\u000e\u00105\u001a\u00020\u001a2\u0006\u00104\u001a\u00020\u000eJ\u0018\u00106\u001a\u0004\u0018\u0001072\u0006\u00108\u001a\u00020\u000e2\u0006\u00109\u001a\u00020\u000eR+\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00058F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006:"}, d2 = {"Lcom/dominate/caravan/ui/account/accountsetting/AccountSettingFragment;", "Lcom/dominate/caravan/core/base/BaseFragment;", "Landroid/text/TextWatcher;", "()V", "<set-?>", "Lcom/caravan/databinding/FragmentAccountSettingBinding;", "binding", "getBinding", "()Lcom/caravan/databinding/FragmentAccountSettingBinding;", "setBinding", "(Lcom/caravan/databinding/FragmentAccountSettingBinding;)V", "binding$delegate", "Lcom/dominate/caravan/core/AutoClearedValue;", "token", "", "getToken", "()Ljava/lang/String;", "setToken", "(Ljava/lang/String;)V", "viewModel", "Lcom/dominate/caravan/ui/account/accountsetting/AccountSettingViewModel;", "getViewModel", "()Lcom/dominate/caravan/ui/account/accountsetting/AccountSettingViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "clearSharedPreferenceLogout", "observeUpdateProfile", "observeUserProfile", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onTextChanged", "before", "onViewCreated", "view", "setData", "showErrorToast", "message", "showSuccessToast", "uploadImageBack", "Lokhttp3/MultipartBody$Part;", "filePath", "name", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class AccountSettingFragment extends com.dominate.caravan.core.base.BaseFragment implements android.text.TextWatcher {
    @org.jetbrains.annotations.NotNull()
    private final com.dominate.caravan.core.AutoClearedValue binding$delegate = null;
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String token = "";
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.caravan.databinding.FragmentAccountSettingBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.caravan.databinding.FragmentAccountSettingBinding p0) {
    }
    
    private final com.dominate.caravan.ui.account.accountsetting.AccountSettingViewModel getViewModel() {
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
    
    public final void showErrorToast(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public final void showSuccessToast(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    private final void clearSharedPreferenceLogout() {
    }
    
    private final void observeUserProfile() {
    }
    
    private final void observeUpdateProfile() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final okhttp3.MultipartBody.Part uploadImageBack(@org.jetbrains.annotations.NotNull()
    java.lang.String filePath, @org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    public AccountSettingFragment() {
        super();
    }
}