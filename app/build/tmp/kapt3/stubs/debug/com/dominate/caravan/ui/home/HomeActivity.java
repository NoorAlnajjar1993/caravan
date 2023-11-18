package com.dominate.caravan.ui.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020$H\u0016J\u0012\u0010&\u001a\u00020$2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0014J\b\u0010)\u001a\u00020*H\u0016J\b\u0010+\u001a\u00020$H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"\u00a8\u0006-"}, d2 = {"Lcom/dominate/caravan/ui/home/HomeActivity;", "Lcom/dominate/caravan/core/base/BaseActivity;", "()V", "binding", "Lcom/caravan/databinding/ActivityHomeBinding;", "getBinding", "()Lcom/caravan/databinding/ActivityHomeBinding;", "setBinding", "(Lcom/caravan/databinding/ActivityHomeBinding;)V", "currentNavController", "Landroidx/lifecycle/LiveData;", "Landroidx/navigation/NavController;", "isUpdateLanguage", "", "()Ljava/lang/String;", "setUpdateLanguage", "(Ljava/lang/String;)V", "navController", "getNavController", "()Landroidx/navigation/NavController;", "setNavController", "(Landroidx/navigation/NavController;)V", "navGraphIds", "", "", "getNavGraphIds", "()Ljava/util/List;", "setNavGraphIds", "(Ljava/util/List;)V", "navHostFragment", "Landroidx/navigation/fragment/NavHostFragment;", "getNavHostFragment", "()Landroidx/navigation/fragment/NavHostFragment;", "setNavHostFragment", "(Landroidx/navigation/fragment/NavHostFragment;)V", "handleNavController", "", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onSupportNavigateUp", "", "setupBottomNavigationBar", "Companion", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class HomeActivity extends com.dominate.caravan.core.base.BaseActivity {
    private androidx.lifecycle.LiveData<androidx.navigation.NavController> currentNavController;
    public com.caravan.databinding.ActivityHomeBinding binding;
    public java.util.List<java.lang.Integer> navGraphIds;
    @org.jetbrains.annotations.Nullable()
    private androidx.navigation.fragment.NavHostFragment navHostFragment;
    @org.jetbrains.annotations.Nullable()
    private androidx.navigation.NavController navController;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String isUpdateLanguage = "";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String FragmentName = "Home";
    @org.jetbrains.annotations.NotNull()
    public static final com.dominate.caravan.ui.home.HomeActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.caravan.databinding.ActivityHomeBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.caravan.databinding.ActivityHomeBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> getNavGraphIds() {
        return null;
    }
    
    public final void setNavGraphIds(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.navigation.fragment.NavHostFragment getNavHostFragment() {
        return null;
    }
    
    public final void setNavHostFragment(@org.jetbrains.annotations.Nullable()
    androidx.navigation.fragment.NavHostFragment p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.navigation.NavController getNavController() {
        return null;
    }
    
    public final void setNavController(@org.jetbrains.annotations.Nullable()
    androidx.navigation.NavController p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String isUpdateLanguage() {
        return null;
    }
    
    public final void setUpdateLanguage(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupBottomNavigationBar() {
    }
    
    @java.lang.Override()
    public boolean onSupportNavigateUp() {
        return false;
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    private final void handleNavController() {
    }
    
    public HomeActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/dominate/caravan/ui/home/HomeActivity$Companion;", "", "()V", "FragmentName", "", "getFragmentName", "()Ljava/lang/String;", "setFragmentName", "(Ljava/lang/String;)V", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFragmentName() {
            return null;
        }
        
        public final void setFragmentName(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        private Companion() {
            super();
        }
    }
}