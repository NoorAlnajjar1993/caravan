package com.dominate.caravan.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000\u00b6\u0001\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r\u001a?\u0010\u000e\u001a\u00020\u000b*\u00020\r2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0013\u001a&\u0010\u0014\u001a\u00020\u000b*\u00020\u00152\u0014\b\u0004\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000b0\u0016H\u0086\b\u00f8\u0001\u0000\u001a\n\u0010\u0018\u001a\u00020\u000b*\u00020\u0019\u001a\n\u0010\u001a\u001a\u00020\u000b*\u00020\u0019\u001a\n\u0010\u001b\u001a\u00020\u000b*\u00020\u001c\u001a\n\u0010\u001d\u001a\u00020\u000b*\u00020\u001e\u001a\n\u0010\u001f\u001a\u00020\u000b*\u00020\u001c\u001a\n\u0010 \u001a\u00020\u000b*\u00020\u001c\u001a\u001a\u0010!\u001a\u00020\"\"\b\b\u0000\u0010#*\u00020\u001c*\b\u0012\u0004\u0012\u0002H#0$\u001a\u001a\u0010%\u001a\u00020\"\"\b\b\u0000\u0010#*\u00020\u001c*\b\u0012\u0004\u0012\u0002H#0$\u001a\u001a\u0010&\u001a\u00020\"\"\b\b\u0000\u0010#*\u00020\u001c*\b\u0012\u0004\u0012\u0002H#0$\u001a\f\u0010\'\u001a\u00020\"*\u0004\u0018\u00010\u001c\u001a-\u0010(\u001a\u00020\u000b*\u00020)2!\u0010*\u001a\u001d\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(-\u0012\u0004\u0012\u00020\u000b0\u0016\u001a-\u0010(\u001a\u00020\u000b*\u00020.2!\u0010*\u001a\u001d\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(-\u0012\u0004\u0012\u00020\u000b0\u0016\u001a&\u0010/\u001a\u00020\u000b*\u0002002\u0014\b\u0004\u0010*\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u000b0\u0016H\u0086\b\u00f8\u0001\u0000\u001a\u001e\u0010/\u001a\u00020\u000b*\u00020\u001c2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u000b0\u0016\u001a \u00101\u001a\u00020\u000b*\u00020\r2\u000e\b\u0004\u0010*\u001a\b\u0012\u0004\u0012\u00020\"02H\u0086\b\u00f8\u0001\u0000\u001a\u0083\u0001\u00103\u001a\u00020\u000b\"\u0004\b\u0000\u00104\"\u000e\b\u0001\u00105*\b\u0012\u0004\u0012\u0002H406*\u000e\u0012\u0004\u0012\u0002H4\u0012\u0004\u0012\u0002H5072O\b\u0004\u0010*\u001aI\u0012\u0013\u0012\u00110\u001c\u00a2\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(9\u0012\u0015\u0012\u0013\u0018\u0001H4\u00a2\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(:\u0012\u0004\u0012\u00020\u000b08H\u0086\b\u00f8\u0001\u0000\u001a5\u0010;\u001a\u00020\u000b*\u00020<2#\b\u0004\u0010*\u001a\u001d\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(9\u0012\u0004\u0012\u00020\u000b0\u0016H\u0086\b\u00f8\u0001\u0000\u001a5\u0010=\u001a\u00020\u000b*\u00020\u00192#\b\u0004\u0010*\u001a\u001d\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(9\u0012\u0004\u0012\u00020\u000b0\u0016H\u0086\b\u00f8\u0001\u0000\u001a5\u0010>\u001a\u00020\u000b*\u00020\u00192#\b\u0004\u0010*\u001a\u001d\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(9\u0012\u0004\u0012\u00020\u000b0\u0016H\u0086\b\u00f8\u0001\u0000\u001a7\u0010?\u001a\u00020\u000b*\u00020\r2%\b\u0004\u0010*\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010@\u00a2\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(A\u0012\u0004\u0012\u00020\u000b0\u0016H\u0086\b\u00f8\u0001\u0000\u001a\n\u0010B\u001a\u00020\u000b*\u00020\r\u001a\u0012\u0010C\u001a\u00020\u000b*\u00020\r2\u0006\u0010D\u001a\u00020\u0003\u001a\u0018\u0010E\u001a\u00020\u000b*\u00020\r2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000b02\u001a\u001c\u0010F\u001a\u00020\u000b*\u00020G2\u0006\u0010H\u001a\u00020I2\b\b\u0002\u0010J\u001a\u00020K\u001a\n\u0010L\u001a\u00020\u000b*\u00020\u001c\u001aC\u0010M\u001a\u00020\u000b*\u00020\u00072#\b\u0002\u0010N\u001a\u001d\u0012\u0013\u0012\u00110O\u00a2\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(P\u0012\u0004\u0012\u00020\u000b0\u00162\b\b\u0002\u0010Q\u001a\u00020\"2\b\b\u0002\u0010A\u001a\u00020\u0017\u001a^\u0010R\u001a\u00020\u000b*\u00020\u00072#\b\u0002\u0010N\u001a\u001d\u0012\u0013\u0012\u00110O\u00a2\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(P\u0012\u0004\u0012\u00020\u000b0\u00162#\b\u0002\u0010S\u001a\u001d\u0012\u0013\u0012\u00110O\u00a2\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(P\u0012\u0004\u0012\u00020\u000b0\u00162\b\b\u0002\u0010Q\u001a\u00020\"\u001a^\u0010T\u001a\u00020\u000b*\u00020\u00072#\b\u0002\u0010N\u001a\u001d\u0012\u0013\u0012\u00110O\u00a2\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(P\u0012\u0004\u0012\u00020\u000b0\u00162#\b\u0002\u0010S\u001a\u001d\u0012\u0013\u0012\u00110O\u00a2\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(P\u0012\u0004\u0012\u00020\u000b0\u00162\b\b\u0002\u0010Q\u001a\u00020\"\u001a9\u0010U\u001a\u00020\u000b*\u00020\u00072#\b\u0002\u0010N\u001a\u001d\u0012\u0013\u0012\u00110O\u00a2\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(P\u0012\u0004\u0012\u00020\u000b0\u00162\b\b\u0002\u0010Q\u001a\u00020\"\u001a^\u0010V\u001a\u00020\u000b*\u00020\u00072#\b\u0002\u0010N\u001a\u001d\u0012\u0013\u0012\u00110O\u00a2\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(P\u0012\u0004\u0012\u00020\u000b0\u00162#\b\u0002\u0010S\u001a\u001d\u0012\u0013\u0012\u00110O\u00a2\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(P\u0012\u0004\u0012\u00020\u000b0\u00162\b\b\u0002\u0010Q\u001a\u00020\"\u001a\n\u0010W\u001a\u00020\u000b*\u00020\u001c\u001a9\u0010X\u001a\u00020\u000b*\u00020\u00072#\b\u0002\u0010N\u001a\u001d\u0012\u0013\u0012\u00110O\u00a2\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(P\u0012\u0004\u0012\u00020\u000b0\u00162\b\b\u0002\u0010Q\u001a\u00020\"\u001a^\u0010Y\u001a\u00020\u000b*\u00020\u00072#\b\u0002\u0010N\u001a\u001d\u0012\u0013\u0012\u00110O\u00a2\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(P\u0012\u0004\u0012\u00020\u000b0\u00162#\b\u0002\u0010S\u001a\u001d\u0012\u0013\u0012\u00110O\u00a2\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(P\u0012\u0004\u0012\u00020\u000b0\u00162\b\b\u0002\u0010Q\u001a\u00020\"\u001a^\u0010Z\u001a\u00020\u000b*\u00020\u00072#\b\u0002\u0010N\u001a\u001d\u0012\u0013\u0012\u00110O\u00a2\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(P\u0012\u0004\u0012\u00020\u000b0\u00162#\b\u0002\u0010S\u001a\u001d\u0012\u0013\u0012\u00110O\u00a2\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(P\u0012\u0004\u0012\u00020\u000b0\u00162\b\b\u0002\u0010Q\u001a\u00020\"\u001a\n\u0010[\u001a\u00020\u000b*\u00020\u001c\u001a\n\u0010\\\u001a\u00020\u000b*\u00020\u001c\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0003*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u0015\u0010\u0006\u001a\u00020\u0003*\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006]"}, d2 = {"CLICK_DELAY", "", "px", "", "getPx", "(I)I", "statusBarHeight", "Landroid/content/Context;", "getStatusBarHeight", "(Landroid/content/Context;)I", "resetEditText", "", "view", "Landroid/widget/EditText;", "addCompoundDrawables", "leftDrawableId", "topDrawableId", "rightDrawableId", "bottomDrawableId", "(Landroid/widget/EditText;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "afterTextChanged", "Landroid/widget/TextView;", "Lkotlin/Function1;", "", "goToNextPage", "Landroidx/viewpager/widget/ViewPager;", "goToPreviousPage", "gone", "Landroid/view/View;", "handleNestedRecyclerTouch", "Landroidx/recyclerview/widget/RecyclerView;", "hideKeyboard", "invisible", "isCollapsed", "", "T", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "isExpanded", "isHidden", "isVisible", "onChecked", "Landroid/widget/RadioGroup;", "callback", "Lkotlin/ParameterName;", "name", "checkedId", "Lcom/google/android/material/chip/ChipGroup;", "onClick", "Landroid/view/MenuItem;", "onDoneClicked", "Lkotlin/Function0;", "onItemClick", "M", "V", "Lcom/dominate/caravan/core/base/BaseViewHolder;", "Lcom/dominate/caravan/core/base/BaseAdapter;", "Lkotlin/Function3;", "position", "item", "onItemSelected", "Landroid/widget/AutoCompleteTextView;", "onPageChanged", "onPageScrolled", "onTextChanged", "", "text", "removeCompoundDrawables", "setMinCharacterLength", "minCharacterLength", "setOnDrawbleRightClick", "setupWithNavController", "Landroidx/appcompat/widget/Toolbar;", "navController", "Landroidx/navigation/NavController;", "configuration", "Landroidx/navigation/ui/AppBarConfiguration;", "show", "showBlockDialog", "onPositiveButtonClick", "Landroid/app/Dialog;", "dialog", "isCancelable", "showCommercialDialog", "onNegativeButtonClick", "showDeactivateDialog", "showEnterAllFieldsDialog", "showHousingAdsDialog", "showKeyboard", "showLoginAddAdsDialog", "showLoginDialog", "showLogoutDialog", "trueOf", "trueOn", "app_debug"})
public final class ExtensionsKt {
    public static final long CLICK_DELAY = 1000L;
    
    public static final int getStatusBarHeight(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$statusBarHeight) {
        return 0;
    }
    
    public static final void onClick(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem $this$onClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.view.MenuItem, kotlin.Unit> callback) {
    }
    
    public static final void onClick(@org.jetbrains.annotations.NotNull()
    android.view.View $this$onClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> callback) {
    }
    
    public static final void onChecked(@org.jetbrains.annotations.NotNull()
    com.google.android.material.chip.ChipGroup $this$onChecked, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> callback) {
    }
    
    public static final void onChecked(@org.jetbrains.annotations.NotNull()
    android.widget.RadioGroup $this$onChecked, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> callback) {
    }
    
    public static final boolean isVisible(@org.jetbrains.annotations.Nullable()
    android.view.View $this$isVisible) {
        return false;
    }
    
    public static final void show(@org.jetbrains.annotations.NotNull()
    android.view.View $this$show) {
    }
    
    public static final void gone(@org.jetbrains.annotations.NotNull()
    android.view.View $this$gone) {
    }
    
    public static final void invisible(@org.jetbrains.annotations.NotNull()
    android.view.View $this$invisible) {
    }
    
    public static final void trueOf(@org.jetbrains.annotations.NotNull()
    android.view.View $this$trueOf) {
    }
    
    public static final void trueOn(@org.jetbrains.annotations.NotNull()
    android.view.View $this$trueOn) {
    }
    
    public static final <M extends java.lang.Object, V extends com.dominate.caravan.core.base.BaseViewHolder<M>>void onItemClick(@org.jetbrains.annotations.NotNull()
    com.dominate.caravan.core.base.BaseAdapter<M, V> $this$onItemClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function3<? super android.view.View, ? super java.lang.Integer, ? super M, kotlin.Unit> callback) {
    }
    
    public static final void handleNestedRecyclerTouch(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView $this$handleNestedRecyclerTouch) {
    }
    
    public static final <T extends android.view.View>boolean isCollapsed(@org.jetbrains.annotations.NotNull()
    com.google.android.material.bottomsheet.BottomSheetBehavior<T> $this$isCollapsed) {
        return false;
    }
    
    public static final <T extends android.view.View>boolean isHidden(@org.jetbrains.annotations.NotNull()
    com.google.android.material.bottomsheet.BottomSheetBehavior<T> $this$isHidden) {
        return false;
    }
    
    public static final <T extends android.view.View>boolean isExpanded(@org.jetbrains.annotations.NotNull()
    com.google.android.material.bottomsheet.BottomSheetBehavior<T> $this$isExpanded) {
        return false;
    }
    
    public static final void onTextChanged(@org.jetbrains.annotations.NotNull()
    android.widget.EditText $this$onTextChanged, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.CharSequence, kotlin.Unit> callback) {
    }
    
    public static final void onDoneClicked(@org.jetbrains.annotations.NotNull()
    android.widget.EditText $this$onDoneClicked, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<java.lang.Boolean> callback) {
    }
    
    public static final void addCompoundDrawables(@org.jetbrains.annotations.NotNull()
    android.widget.EditText $this$addCompoundDrawables, @org.jetbrains.annotations.Nullable()
    @androidx.annotation.DrawableRes()
    java.lang.Integer leftDrawableId, @org.jetbrains.annotations.Nullable()
    @androidx.annotation.DrawableRes()
    java.lang.Integer topDrawableId, @org.jetbrains.annotations.Nullable()
    @androidx.annotation.DrawableRes()
    java.lang.Integer rightDrawableId, @org.jetbrains.annotations.Nullable()
    @androidx.annotation.DrawableRes()
    java.lang.Integer bottomDrawableId) {
    }
    
    public static final void removeCompoundDrawables(@org.jetbrains.annotations.NotNull()
    android.widget.EditText $this$removeCompoundDrawables) {
    }
    
    public static final void hideKeyboard(@org.jetbrains.annotations.NotNull()
    android.view.View $this$hideKeyboard) {
    }
    
    public static final void showKeyboard(@org.jetbrains.annotations.NotNull()
    android.view.View $this$showKeyboard) {
    }
    
    public static final void onItemSelected(@org.jetbrains.annotations.NotNull()
    android.widget.AutoCompleteTextView $this$onItemSelected, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> callback) {
    }
    
    public static final void onPageChanged(@org.jetbrains.annotations.NotNull()
    androidx.viewpager.widget.ViewPager $this$onPageChanged, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> callback) {
    }
    
    public static final void onPageScrolled(@org.jetbrains.annotations.NotNull()
    androidx.viewpager.widget.ViewPager $this$onPageScrolled, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> callback) {
    }
    
    public static final void goToNextPage(@org.jetbrains.annotations.NotNull()
    androidx.viewpager.widget.ViewPager $this$goToNextPage) {
    }
    
    public static final void goToPreviousPage(@org.jetbrains.annotations.NotNull()
    androidx.viewpager.widget.ViewPager $this$goToPreviousPage) {
    }
    
    public static final void resetEditText(@org.jetbrains.annotations.NotNull()
    android.widget.EditText view) {
    }
    
    public static final void afterTextChanged(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$afterTextChanged, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> afterTextChanged) {
    }
    
    public static final int getPx(int $this$px) {
        return 0;
    }
    
    public static final void setOnDrawbleRightClick(@org.jetbrains.annotations.NotNull()
    android.widget.EditText $this$setOnDrawbleRightClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
    }
    
    public static final void setMinCharacterLength(@org.jetbrains.annotations.NotNull()
    android.widget.EditText $this$setMinCharacterLength, int minCharacterLength) {
    }
    
    public static final void setupWithNavController(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.Toolbar $this$setupWithNavController, @org.jetbrains.annotations.NotNull()
    androidx.navigation.NavController navController, @org.jetbrains.annotations.NotNull()
    androidx.navigation.ui.AppBarConfiguration configuration) {
    }
    
    public static final void showLogoutDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$showLogoutDialog, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.app.Dialog, kotlin.Unit> onPositiveButtonClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.app.Dialog, kotlin.Unit> onNegativeButtonClick, boolean isCancelable) {
    }
    
    public static final void showDeactivateDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$showDeactivateDialog, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.app.Dialog, kotlin.Unit> onPositiveButtonClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.app.Dialog, kotlin.Unit> onNegativeButtonClick, boolean isCancelable) {
    }
    
    public static final void showLoginDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$showLoginDialog, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.app.Dialog, kotlin.Unit> onPositiveButtonClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.app.Dialog, kotlin.Unit> onNegativeButtonClick, boolean isCancelable) {
    }
    
    public static final void showLoginAddAdsDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$showLoginAddAdsDialog, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.app.Dialog, kotlin.Unit> onPositiveButtonClick, boolean isCancelable) {
    }
    
    public static final void showEnterAllFieldsDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$showEnterAllFieldsDialog, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.app.Dialog, kotlin.Unit> onPositiveButtonClick, boolean isCancelable) {
    }
    
    public static final void showHousingAdsDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$showHousingAdsDialog, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.app.Dialog, kotlin.Unit> onPositiveButtonClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.app.Dialog, kotlin.Unit> onNegativeButtonClick, boolean isCancelable) {
    }
    
    public static final void showCommercialDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$showCommercialDialog, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.app.Dialog, kotlin.Unit> onPositiveButtonClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.app.Dialog, kotlin.Unit> onNegativeButtonClick, boolean isCancelable) {
    }
    
    public static final void showBlockDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$showBlockDialog, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.app.Dialog, kotlin.Unit> onPositiveButtonClick, boolean isCancelable, @org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
}