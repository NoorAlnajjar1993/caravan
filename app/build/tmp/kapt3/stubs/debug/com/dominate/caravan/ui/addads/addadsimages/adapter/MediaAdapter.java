package com.dominate.caravan.ui.addads.addadsimages.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00030\u0001:\u0001\u001bB)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ\b\u0010\f\u001a\u00020\rH\u0016J\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u001a\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0007J\u001a\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0007R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/dominate/caravan/ui/addads/addadsimages/adapter/MediaAdapter;", "Lcom/dominate/caravan/core/base/BaseAdapter;", "Lcom/dominate/caravan/medule/home/Media;", "Lcom/dominate/caravan/core/base/BaseBindingViewHolder;", "listItems", "", "onclickListener", "Lkotlin/Function1;", "", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "getListItems", "()Ljava/util/List;", "getItemCount", "", "getViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setImageDrawable", "view", "Landroid/widget/ImageView;", "drawable", "Landroid/graphics/drawable/Drawable;", "setImageUrl", "imgView", "imgUrl", "", "SubCategoryViewHolder", "app_debug"})
public final class MediaAdapter extends com.dominate.caravan.core.base.BaseAdapter<com.dominate.caravan.medule.home.Media, com.dominate.caravan.core.base.BaseBindingViewHolder<com.dominate.caravan.medule.home.Media>> {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.dominate.caravan.medule.home.Media> listItems = null;
    private final kotlin.jvm.functions.Function1<com.dominate.caravan.medule.home.Media, kotlin.Unit> onclickListener = null;
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.dominate.caravan.core.base.BaseBindingViewHolder<com.dominate.caravan.medule.home.Media> getViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @androidx.databinding.BindingAdapter(value = {"imageUrl"})
    public final void setImageUrl(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView imgView, @org.jetbrains.annotations.Nullable()
    java.lang.String imgUrl) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"android:src"})
    public final void setImageDrawable(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView view, @org.jetbrains.annotations.Nullable()
    android.graphics.drawable.Drawable drawable) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.dominate.caravan.medule.home.Media> getListItems() {
        return null;
    }
    
    public MediaAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.dominate.caravan.medule.home.Media> listItems, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.dominate.caravan.medule.home.Media, kotlin.Unit> onclickListener) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/dominate/caravan/ui/addads/addadsimages/adapter/MediaAdapter$SubCategoryViewHolder;", "Lcom/dominate/caravan/core/base/BaseBindingViewHolder;", "Lcom/dominate/caravan/medule/home/Media;", "binding", "Lcom/caravan/databinding/RowAddMediaBinding;", "(Lcom/dominate/caravan/ui/addads/addadsimages/adapter/MediaAdapter;Lcom/caravan/databinding/RowAddMediaBinding;)V", "bind", "", "position", "", "itemPos", "app_debug"})
    public final class SubCategoryViewHolder extends com.dominate.caravan.core.base.BaseBindingViewHolder<com.dominate.caravan.medule.home.Media> {
        private final com.caravan.databinding.RowAddMediaBinding binding = null;
        
        @java.lang.Override()
        public void bind(int position, @org.jetbrains.annotations.Nullable()
        com.dominate.caravan.medule.home.Media itemPos) {
        }
        
        public SubCategoryViewHolder(@org.jetbrains.annotations.NotNull()
        com.caravan.databinding.RowAddMediaBinding binding) {
            super(null);
        }
    }
}