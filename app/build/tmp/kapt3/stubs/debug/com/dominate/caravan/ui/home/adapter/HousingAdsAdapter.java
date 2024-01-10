package com.dominate.caravan.ui.home.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\u0015BA\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0014\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\nJ\u001c\u0010\u000b\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001a\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0007R\u001c\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/dominate/caravan/ui/home/adapter/HousingAdsAdapter;", "Lcom/dominate/caravan/core/base/BaseAdapter;", "Lcom/dominate/caravan/medule/home/HousingAd;", "Lcom/dominate/caravan/ui/home/adapter/HousingAdsAdapter$MarketCategoryItemViewHolder;", "marketCategories", "", "onclickListener", "Lkotlin/Function1;", "", "onclickListenerItem", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "setImageUrl", "imgView", "Landroid/widget/ImageView;", "imgUrl", "", "MarketCategoryItemViewHolder", "app_debug"})
public final class HousingAdsAdapter extends com.dominate.caravan.core.base.BaseAdapter<com.dominate.caravan.medule.home.HousingAd, com.dominate.caravan.ui.home.adapter.HousingAdsAdapter.MarketCategoryItemViewHolder> {
    private final kotlin.jvm.functions.Function1<com.dominate.caravan.medule.home.HousingAd, kotlin.Unit> onclickListener = null;
    private final kotlin.jvm.functions.Function1<com.dominate.caravan.medule.home.HousingAd, kotlin.Unit> onclickListenerItem = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.dominate.caravan.ui.home.adapter.HousingAdsAdapter.MarketCategoryItemViewHolder getViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @androidx.databinding.BindingAdapter(value = {"imageUrl"})
    public final void setImageUrl(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView imgView, @org.jetbrains.annotations.Nullable()
    java.lang.String imgUrl) {
    }
    
    public HousingAdsAdapter(@org.jetbrains.annotations.Nullable()
    java.util.List<com.dominate.caravan.medule.home.HousingAd> marketCategories, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.dominate.caravan.medule.home.HousingAd, kotlin.Unit> onclickListener, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.dominate.caravan.medule.home.HousingAd, kotlin.Unit> onclickListenerItem) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\r"}, d2 = {"Lcom/dominate/caravan/ui/home/adapter/HousingAdsAdapter$MarketCategoryItemViewHolder;", "Lcom/dominate/caravan/core/base/BaseBindingViewHolder;", "Lcom/dominate/caravan/medule/home/HousingAd;", "binding", "Lcom/caravan/databinding/RowHousingAdsBinding;", "(Lcom/dominate/caravan/ui/home/adapter/HousingAdsAdapter;Lcom/caravan/databinding/RowHousingAdsBinding;)V", "getBinding", "()Lcom/caravan/databinding/RowHousingAdsBinding;", "bind", "", "position", "", "itemPos", "app_debug"})
    public final class MarketCategoryItemViewHolder extends com.dominate.caravan.core.base.BaseBindingViewHolder<com.dominate.caravan.medule.home.HousingAd> {
        @org.jetbrains.annotations.NotNull()
        private final com.caravan.databinding.RowHousingAdsBinding binding = null;
        
        @java.lang.Override()
        public void bind(int position, @org.jetbrains.annotations.Nullable()
        com.dominate.caravan.medule.home.HousingAd itemPos) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.caravan.databinding.RowHousingAdsBinding getBinding() {
            return null;
        }
        
        public MarketCategoryItemViewHolder(@org.jetbrains.annotations.NotNull()
        com.caravan.databinding.RowHousingAdsBinding binding) {
            super(null);
        }
    }
}