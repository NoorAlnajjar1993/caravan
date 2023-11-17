package com.dominate.caravan.ui.auth.register;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016J(\u0010%\u001a\u00020\"2\u0006\u0010#\u001a\u00020&2\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020(H\u0016J$\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u0001002\b\u00101\u001a\u0004\u0018\u000102H\u0016J(\u00103\u001a\u00020\"2\u0006\u0010#\u001a\u00020&2\u0006\u0010\'\u001a\u00020(2\u0006\u00104\u001a\u00020(2\u0006\u0010)\u001a\u00020(H\u0016R+\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00058F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0014\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\u001a\u0010\u0016\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001e\u00a8\u00065"}, d2 = {"Lcom/dominate/caravan/ui/auth/register/RegisterFragment;", "Lcom/dominate/caravan/core/base/BaseFragment;", "Landroid/text/TextWatcher;", "()V", "<set-?>", "Lcom/caravan/databinding/FragmentRegisterBinding;", "binding", "getBinding", "()Lcom/caravan/databinding/FragmentRegisterBinding;", "setBinding", "(Lcom/caravan/databinding/FragmentRegisterBinding;)V", "binding$delegate", "Lcom/dominate/caravan/core/AutoClearedValue;", "isEmailValid", "", "()Z", "setEmailValid", "(Z)V", "isNameValid", "setNameValid", "isPasswordValid", "setPasswordValid", "isTelephoneValid", "setTelephoneValid", "statusSwitch2", "getStatusSwitch2", "setStatusSwitch2", "viewModel", "Lcom/dominate/caravan/ui/auth/register/ReqisterViewModel;", "getViewModel", "()Lcom/dominate/caravan/ui/auth/register/ReqisterViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onTextChanged", "before", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class RegisterFragment extends com.dominate.caravan.core.base.BaseFragment implements android.text.TextWatcher {
    @org.jetbrains.annotations.NotNull()
    private final com.dominate.caravan.core.AutoClearedValue binding$delegate = null;
    private final kotlin.Lazy viewModel$delegate = null;
    private boolean isPasswordValid = false;
    private boolean isEmailValid = false;
    private boolean isNameValid = false;
    private boolean isTelephoneValid = false;
    private boolean statusSwitch2 = false;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.caravan.databinding.FragmentRegisterBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.caravan.databinding.FragmentRegisterBinding p0) {
    }
    
    private final com.dominate.caravan.ui.auth.register.ReqisterViewModel getViewModel() {
        return null;
    }
    
    public final boolean isPasswordValid() {
        return false;
    }
    
    public final void setPasswordValid(boolean p0) {
    }
    
    public final boolean isEmailValid() {
        return false;
    }
    
    public final void setEmailValid(boolean p0) {
    }
    
    public final boolean isNameValid() {
        return false;
    }
    
    public final void setNameValid(boolean p0) {
    }
    
    public final boolean isTelephoneValid() {
        return false;
    }
    
    public final void setTelephoneValid(boolean p0) {
    }
    
    public final boolean getStatusSwitch2() {
        return false;
    }
    
    public final void setStatusSwitch2(boolean p0) {
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
    
    public RegisterFragment() {
        super();
    }
}