package com.dominate.caravan.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u001a\u001a\u00020\u001bJ\b\u0010\u001c\u001a\u0004\u0018\u00010\u0006J\b\u0010\u001d\u001a\u0004\u0018\u00010\u0006J\b\u0010\u001e\u001a\u0004\u0018\u00010\u0006J\b\u0010\u001f\u001a\u0004\u0018\u00010\u0006J\u000e\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u0006J\u000e\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\u0006J\u000e\u0010$\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\u0006J\u000e\u0010&\u001a\u00020\u001b2\u0006\u0010\'\u001a\u00020\u0006R(\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R(\u0010\u0011\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0012\u0010\t\"\u0004\b\u0013\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0005\u001a\u0004\u0018\u00010\u00148F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u00a8\u0006("}, d2 = {"Lcom/dominate/caravan/utils/Prefs;", "", "sharedPrefs", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "value", "", "currentFragment", "getCurrentFragment", "()Ljava/lang/String;", "setCurrentFragment", "(Ljava/lang/String;)V", "", "isLoggedIn", "()Z", "setLoggedIn", "(Z)V", "language", "getLanguage", "setLanguage", "", "userType", "getUserType", "()Ljava/lang/Integer;", "setUserType", "(Ljava/lang/Integer;)V", "deleteAllSharedPrefs", "", "featchAuthToken", "featchEmailToken", "featchNameToken", "featchPhoneToken", "saveAuthToken", "token", "saveEmailToken", "email", "saveNameToken", "name", "savePhoneToken", "phone", "data_debug"})
public final class Prefs {
    private final android.content.SharedPreferences sharedPrefs = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCurrentFragment() {
        return null;
    }
    
    public final void setCurrentFragment(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLanguage() {
        return null;
    }
    
    public final void setLanguage(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    public final boolean isLoggedIn() {
        return false;
    }
    
    public final void setLoggedIn(boolean value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getUserType() {
        return null;
    }
    
    public final void setUserType(@org.jetbrains.annotations.Nullable()
    java.lang.Integer value) {
    }
    
    public final void saveAuthToken(@org.jetbrains.annotations.NotNull()
    java.lang.String token) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String featchAuthToken() {
        return null;
    }
    
    public final void saveEmailToken(@org.jetbrains.annotations.NotNull()
    java.lang.String email) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String featchEmailToken() {
        return null;
    }
    
    public final void savePhoneToken(@org.jetbrains.annotations.NotNull()
    java.lang.String phone) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String featchPhoneToken() {
        return null;
    }
    
    public final void saveNameToken(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String featchNameToken() {
        return null;
    }
    
    public final void deleteAllSharedPrefs() {
    }
    
    @javax.inject.Inject()
    public Prefs(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences sharedPrefs) {
        super();
    }
}