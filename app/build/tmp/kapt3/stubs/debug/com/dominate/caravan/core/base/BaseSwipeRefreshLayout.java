package com.dominate.caravan.core.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u000f\u001a\u00020\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u0014\u0010\u0011\u001a\u00020\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u0012\u0010\u0012\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0013H\u0017R\'\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0014"}, d2 = {"Lcom/dominate/caravan/core/base/BaseSwipeRefreshLayout;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "listeners", "", "Lkotlin/Function0;", "", "getListeners", "()Ljava/util/List;", "listeners$delegate", "Lkotlin/Lazy;", "addOnRefreshListener", "listener", "removedOnRefreshListener", "setOnRefreshListener", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;", "app_debug"})
public final class BaseSwipeRefreshLayout extends androidx.swiperefreshlayout.widget.SwipeRefreshLayout {
    private final kotlin.Lazy listeners$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    private final java.util.List<kotlin.jvm.functions.Function0<kotlin.Unit>> getListeners() {
        return null;
    }
    
    public final void addOnRefreshListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> listener) {
    }
    
    public final void removedOnRefreshListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> listener) {
    }
    
    @java.lang.Override()
    @java.lang.Deprecated()
    public void setOnRefreshListener(@org.jetbrains.annotations.Nullable()
    androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener listener) {
    }
    
    public BaseSwipeRefreshLayout(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public BaseSwipeRefreshLayout(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
}