package com.dominate.caravan.core.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J/\u0010\t\u001a\u00020\n\"\b\b\u0001\u0010\u000b*\u00020\u00042\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u00020\n0\r\u00a2\u0006\u0002\b\u000eH\u0086\b\u00f8\u0001\u0000R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u000f"}, d2 = {"Lcom/dominate/caravan/core/base/BaseBindingViewHolder;", "M", "Lcom/dominate/caravan/core/base/BaseViewHolder;", "viewDataBinding", "Landroidx/databinding/ViewDataBinding;", "(Landroidx/databinding/ViewDataBinding;)V", "getViewDataBinding", "()Landroidx/databinding/ViewDataBinding;", "setViewDataBinding", "bind", "", "T", "binding", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "app_debug"})
public abstract class BaseBindingViewHolder<M extends java.lang.Object> extends com.dominate.caravan.core.base.BaseViewHolder<M> {
    @org.jetbrains.annotations.Nullable()
    private androidx.databinding.ViewDataBinding viewDataBinding;
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.databinding.ViewDataBinding getViewDataBinding() {
        return null;
    }
    
    public final void setViewDataBinding(@org.jetbrains.annotations.Nullable()
    androidx.databinding.ViewDataBinding p0) {
    }
    
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    public final <T extends androidx.databinding.ViewDataBinding>void bind(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> binding) {
    }
    
    public BaseBindingViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ViewDataBinding viewDataBinding) {
        super(null);
    }
}