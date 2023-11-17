package com.dominate.caravan.core.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\b\u0010\r\u001a\u00020\nH\u0014J\u000e\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0011"}, d2 = {"Lcom/dominate/caravan/core/base/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "prefs", "Lcom/dominate/caravan/utils/Prefs;", "getPrefs", "()Lcom/dominate/caravan/utils/Prefs;", "setPrefs", "(Lcom/dominate/caravan/utils/Prefs;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "setLocale", "localeName", "", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public abstract class BaseActivity extends androidx.appcompat.app.AppCompatActivity {
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
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void setLocale(@org.jetbrains.annotations.NotNull()
    java.lang.String localeName) {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    public BaseActivity() {
        super();
    }
}