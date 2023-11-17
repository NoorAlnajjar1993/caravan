package com.dominate.caravan.core.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u001a\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u000e\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0013"}, d2 = {"Lcom/dominate/caravan/core/base/BaseFragment;", "Landroidx/fragment/app/Fragment;", "()V", "prefs", "Lcom/dominate/caravan/utils/Prefs;", "getPrefs", "()Lcom/dominate/caravan/utils/Prefs;", "setPrefs", "(Lcom/dominate/caravan/utils/Prefs;)V", "onActivityCreated", "", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "setLocale", "localeName", "", "app_debug"})
public abstract class BaseFragment extends androidx.fragment.app.Fragment {
    @javax.inject.Inject()
    public com.dominate.caravan.utils.Prefs prefs;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.dominate.caravan.utils.Prefs getPrefs() {
        return null;
    }
    
    public final void setPrefs(@org.jetbrains.annotations.NotNull()
    com.dominate.caravan.utils.Prefs p0) {
    }
    
    public final void setLocale(@org.jetbrains.annotations.NotNull()
    java.lang.String localeName) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public BaseFragment() {
        super();
    }
}