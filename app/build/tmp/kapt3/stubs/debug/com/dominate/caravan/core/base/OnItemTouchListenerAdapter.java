package com.dominate.caravan.core.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0003H\u0016J\u0018\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\f"}, d2 = {"Lcom/dominate/caravan/core/base/OnItemTouchListenerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$OnItemTouchListener;", "onInterceptTouchEvent", "", "rv", "Landroidx/recyclerview/widget/RecyclerView;", "e", "Landroid/view/MotionEvent;", "onRequestDisallowInterceptTouchEvent", "", "disallowIntercept", "onTouchEvent", "app_debug"})
public abstract interface OnItemTouchListenerAdapter extends androidx.recyclerview.widget.RecyclerView.OnItemTouchListener {
    
    @java.lang.Override()
    public abstract void onTouchEvent(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView rv, @org.jetbrains.annotations.NotNull()
    android.view.MotionEvent e);
    
    @java.lang.Override()
    public abstract boolean onInterceptTouchEvent(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView rv, @org.jetbrains.annotations.NotNull()
    android.view.MotionEvent e);
    
    @java.lang.Override()
    public abstract void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept);
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
        
        @java.lang.Override()
        public static void onTouchEvent(@org.jetbrains.annotations.NotNull()
        com.dominate.caravan.core.base.OnItemTouchListenerAdapter $this, @org.jetbrains.annotations.NotNull()
        androidx.recyclerview.widget.RecyclerView rv, @org.jetbrains.annotations.NotNull()
        android.view.MotionEvent e) {
        }
        
        @java.lang.Override()
        public static boolean onInterceptTouchEvent(@org.jetbrains.annotations.NotNull()
        com.dominate.caravan.core.base.OnItemTouchListenerAdapter $this, @org.jetbrains.annotations.NotNull()
        androidx.recyclerview.widget.RecyclerView rv, @org.jetbrains.annotations.NotNull()
        android.view.MotionEvent e) {
            return false;
        }
        
        @java.lang.Override()
        public static void onRequestDisallowInterceptTouchEvent(@org.jetbrains.annotations.NotNull()
        com.dominate.caravan.core.base.OnItemTouchListenerAdapter $this, boolean disallowIntercept) {
        }
    }
}