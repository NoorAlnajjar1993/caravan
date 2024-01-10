package com.dominate.caravan.ui.estatedetails.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\u0014B+\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ\u001c\u0010\n\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001a\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007R\u001c\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/dominate/caravan/ui/estatedetails/adapter/SimilarEstateAdapter;", "Lcom/dominate/caravan/core/base/BaseAdapter;", "Lcom/dominate/caravan/medule/home/CommercialAd;", "Lcom/dominate/caravan/ui/estatedetails/adapter/SimilarEstateAdapter$MarketCategoryItemViewHolder;", "marketCategories", "", "onclickListener", "Lkotlin/Function1;", "", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "getViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "setImageUrl", "imgView", "Landroid/widget/ImageView;", "imgUrl", "", "MarketCategoryItemViewHolder", "app_debug"})
public final class SimilarEstateAdapter extends com.dominate.caravan.core.base.BaseAdapter<com.dominate.caravan.medule.home.CommercialAd, com.dominate.caravan.ui.estatedetails.adapter.SimilarEstateAdapter.MarketCategoryItemViewHolder> {
    private final kotlin.jvm.functions.Function1<com.dominate.caravan.medule.home.CommercialAd, kotlin.Unit> onclickListener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.dominate.caravan.ui.estatedetails.adapter.SimilarEstateAdapter.MarketCategoryItemViewHolder getViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @androidx.databinding.BindingAdapter(value = {"imageUrl"})
    public final void setImageUrl(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView imgView, @org.jetbrains.annotations.Nullable()
    java.lang.String imgUrl) {
    }
    
    public SimilarEstateAdapter(@org.jetbrains.annotations.Nullable()
    java.util.List<com.dominate.caravan.medule.home.CommercialAd> marketCategories, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.dominate.caravan.medule.home.CommercialAd, kotlin.Unit> onclickListener) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\r"}, d2 = {"Lcom/dominate/caravan/ui/estatedetails/adapter/SimilarEstateAdapter$MarketCategoryItemViewHolder;", "Lcom/dominate/caravan/core/base/BaseBindingViewHolder;", "Lcom/dominate/caravan/medule/home/CommercialAd;", "binding", "Lcom/caravan/databinding/RowSimilarEstateBinding;", "(Lcom/dominate/caravan/ui/estatedetails/adapter/SimilarEstateAdapter;Lcom/caravan/databinding/RowSimilarEstateBinding;)V", "getBinding", "()Lcom/caravan/databinding/RowSimilarEstateBinding;", "bind", "", "position", "", "itemPos", "app_debug"})
    public final class MarketCategoryItemViewHolder extends com.dominate.caravan.core.base.BaseBindingViewHolder<com.dominate.caravan.medule.home.CommercialAd> {
        @org.jetbrains.annotations.NotNull()
        private final com.caravan.databinding.RowSimilarEstateBinding binding = null;
        
        @java.lang.Override()
        public void bind(int position, @org.jetbrains.annotations.Nullable()
        com.dominate.caravan.medule.home.CommercialAd itemPos) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.caravan.databinding.RowSimilarEstateBinding getBinding() {
            return null;
        }
        
        public MarketCategoryItemViewHolder(@org.jetbrains.annotations.NotNull()
        com.caravan.databinding.RowSimilarEstateBinding binding) {
            super(null);
        }
    }
}