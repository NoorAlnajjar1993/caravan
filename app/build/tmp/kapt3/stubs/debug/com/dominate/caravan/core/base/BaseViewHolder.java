package com.dominate.caravan.core.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\tJ\u001f\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00018\u0000H&\u00a2\u0006\u0002\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/dominate/caravan/core/base/BaseViewHolder;", "M", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "adapterPosition", "", "callback", "Lkotlin/Function1;", "", "bind", "position", "item", "(ILjava/lang/Object;)V", "app_debug"})
public abstract class BaseViewHolder<M extends java.lang.Object> extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    
    public abstract void bind(int position, @org.jetbrains.annotations.Nullable()
    M item);
    
    public final void adapterPosition(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> callback) {
    }
    
    public BaseViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.View itemView) {
        super(null);
    }
}