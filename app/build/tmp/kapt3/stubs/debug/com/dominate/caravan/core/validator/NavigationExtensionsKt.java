package com.dominate.caravan.core.validator;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000j\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002\u001a\u0018\u0010\b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002\u001a(\u0010\r\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH\u0002\u001a0\u0010\u0011\u001a\u00020\u0001\"\b\b\u0000\u0010\u0012*\u00020\u0013*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\n2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u0002H\u0012\u0012\u0004\u0012\u00020\u00010\u0017\u001a\u0014\u0010\u0018\u001a\u00020\u0007*\u00020\u00032\u0006\u0010\u0019\u001a\u00020\nH\u0002\u001a\u0018\u0010\u001a\u001a\u00020\u0001*\u00020\u00142\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u001c\u001a3\u0010\u001d\u001a\u00020\u0001\"\b\b\u0000\u0010\u0012*\u00020\u0013*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u001e\u001a\u0002H\u00122\b\b\u0002\u0010\u001f\u001a\u00020\u0007\u00a2\u0006\u0002\u0010 \u001a2\u0010!\u001a\u00020\u0001*\u00020\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0$2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010%\u001a\u00020&H\u0002\u001a\"\u0010\'\u001a\u00020\u0001*\u00020\"2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\n0)2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a6\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+*\u00020\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0$2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010%\u001a\u00020&\u00a8\u0006-"}, d2 = {"attachNavHostFragment", "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "navHostFragment", "Landroidx/navigation/fragment/NavHostFragment;", "isPrimaryNavFragment", "", "detachNavHostFragment", "getFragmentTag", "", "index", "", "obtainNavHostFragment", "fragmentTag", "navGraphId", "containerId", "getBackStackData", "T", "", "Landroidx/fragment/app/Fragment;", "key", "result", "Lkotlin/Function1;", "isOnBackStack", "backStackName", "onBackPressedAction", "action", "Lkotlin/Function0;", "setBackStackData", "data", "doBack", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;Ljava/lang/Object;Z)V", "setupDeepLinks", "Lcom/google/android/material/bottomnavigation/BottomNavigationView;", "navGraphIds", "", "intent", "Landroid/content/Intent;", "setupItemReselected", "graphIdToTagMap", "Landroid/util/SparseArray;", "setupWithNavController", "Landroidx/lifecycle/LiveData;", "Landroidx/navigation/NavController;", "app_debug"})
public final class NavigationExtensionsKt {
    
    /**
     * Manages the various graphs needed for a [BottomNavigationView].
     *
     * This sample is a workaround until the Navigation Component supports multiple back stacks.
     */
    @org.jetbrains.annotations.NotNull()
    public static final androidx.lifecycle.LiveData<androidx.navigation.NavController> setupWithNavController(@org.jetbrains.annotations.NotNull()
    com.google.android.material.bottomnavigation.BottomNavigationView $this$setupWithNavController, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> navGraphIds, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager fragmentManager, int containerId, @org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
        return null;
    }
    
    private static final void setupDeepLinks(com.google.android.material.bottomnavigation.BottomNavigationView $this$setupDeepLinks, java.util.List<java.lang.Integer> navGraphIds, androidx.fragment.app.FragmentManager fragmentManager, int containerId, android.content.Intent intent) {
    }
    
    private static final void setupItemReselected(com.google.android.material.bottomnavigation.BottomNavigationView $this$setupItemReselected, android.util.SparseArray<java.lang.String> graphIdToTagMap, androidx.fragment.app.FragmentManager fragmentManager) {
    }
    
    private static final void detachNavHostFragment(androidx.fragment.app.FragmentManager fragmentManager, androidx.navigation.fragment.NavHostFragment navHostFragment) {
    }
    
    private static final void attachNavHostFragment(androidx.fragment.app.FragmentManager fragmentManager, androidx.navigation.fragment.NavHostFragment navHostFragment, boolean isPrimaryNavFragment) {
    }
    
    private static final androidx.navigation.fragment.NavHostFragment obtainNavHostFragment(androidx.fragment.app.FragmentManager fragmentManager, java.lang.String fragmentTag, int navGraphId, int containerId) {
        return null;
    }
    
    private static final boolean isOnBackStack(androidx.fragment.app.FragmentManager $this$isOnBackStack, java.lang.String backStackName) {
        return false;
    }
    
    public static final void onBackPressedAction(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$onBackPressedAction, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<java.lang.Boolean> action) {
    }
    
    public static final <T extends java.lang.Object>void setBackStackData(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$setBackStackData, @org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    T data, boolean doBack) {
    }
    
    public static final <T extends java.lang.Object>void getBackStackData(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$getBackStackData, @org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> result) {
    }
    
    private static final java.lang.String getFragmentTag(int index) {
        return null;
    }
}