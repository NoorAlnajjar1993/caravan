package com.dominate.caravan.core.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b&\u0018\u0000 x*\u0004\b\u0000\u0010\u0001*\u000e\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0012\u0004\u0012\u0002H\u00020\u0004:\u0001xB\u0019\b\u0007\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\u0015\u0010G\u001a\u0002012\u0006\u0010:\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010HJ\u001d\u0010G\u001a\u0002012\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010IJ\u001e\u0010G\u001a\u0002012\u0006\u00109\u001a\u0002082\f\u0010J\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016J\u0016\u0010G\u001a\u0002012\f\u0010J\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016J\u001d\u0010K\u001a\u0002012\u0006\u0010L\u001a\u00028\u00012\u0006\u00109\u001a\u000208H\u0016\u00a2\u0006\u0002\u0010MJ\b\u0010N\u001a\u000201H\u0004J\u0015\u0010O\u001a\u0004\u0018\u00018\u00002\u0006\u00109\u001a\u000208\u00a2\u0006\u0002\u0010PJ\b\u0010Q\u001a\u00020RH\u0002J\b\u0010S\u001a\u00020TH\u0002J\b\u0010U\u001a\u00020TH\u0002J\b\u0010V\u001a\u000208H\u0016J\u0010\u0010W\u001a\u0002082\u0006\u00109\u001a\u000208H\u0016J\u000e\u0010X\u001a\n\u0012\u0004\u0012\u000201\u0018\u000100JO\u0010Y\u001aK\u0012\u0013\u0012\u001104\u00a2\u0006\f\b5\u0012\b\b6\u0012\u0004\b\b(7\u0012\u0013\u0012\u001108\u00a2\u0006\f\b5\u0012\b\b6\u0012\u0004\b\b(9\u0012\u0015\u0012\u0013\u0018\u00018\u0000\u00a2\u0006\f\b5\u0012\b\b6\u0012\u0004\b\b(:\u0012\u0004\u0012\u000201\u0018\u000103J(\u0010Z\u001a\u00020R2\u0006\u0010[\u001a\u00020\t2\u0006\u0010\\\u001a\u00020\t2\u0006\u0010]\u001a\u00020\t2\u0006\u0010^\u001a\u00020\tH\u0002J\u001d\u0010_\u001a\u00028\u00012\u0006\u0010`\u001a\u00020a2\u0006\u0010b\u001a\u000208H&\u00a2\u0006\u0002\u0010cJ\b\u0010d\u001a\u000201H\u0002J\u0015\u0010e\u001a\u0002012\u0006\u0010L\u001a\u00028\u0001H\u0002\u00a2\u0006\u0002\u0010fJ\u0012\u0010g\u001a\u0002012\b\u0010h\u001a\u0004\u0018\u00010iH\u0002J\u0012\u0010j\u001a\u0002012\b\u0010h\u001a\u0004\u0018\u00010kH\u0002J\u0018\u0010l\u001a\u0002012\u0006\u00107\u001a\u0002042\u0006\u0010m\u001a\u000208H\u0004J\b\u0010n\u001a\u000201H\u0002J\u0010\u0010o\u001a\u0002012\u0006\u0010;\u001a\u00020<H\u0016J\u001d\u0010p\u001a\u0002012\u0006\u0010L\u001a\u00028\u00012\u0006\u00109\u001a\u000208H\u0016\u00a2\u0006\u0002\u0010MJ\u001d\u0010q\u001a\u00028\u00012\u0006\u0010`\u001a\u00020a2\u0006\u0010b\u001a\u000208H\u0016\u00a2\u0006\u0002\u0010cJ\u0010\u0010r\u001a\u0002012\u0006\u0010;\u001a\u00020<H\u0016J\u0013\u0010s\u001a\u0002012\u0006\u0010:\u001a\u00028\u0000\u00a2\u0006\u0002\u0010HJ\u000e\u0010s\u001a\u0002012\u0006\u00109\u001a\u000208J\u0014\u0010s\u001a\u0002012\f\u0010J\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006J\u0006\u0010t\u001a\u000201J\u0016\u0010t\u001a\u0002012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006J\u0014\u0010u\u001a\u0002012\f\u0010/\u001a\b\u0012\u0004\u0012\u00020100JU\u0010v\u001a\u0002012M\u00102\u001aI\u0012\u0013\u0012\u001104\u00a2\u0006\f\b5\u0012\b\b6\u0012\u0004\b\b(7\u0012\u0013\u0012\u001108\u00a2\u0006\f\b5\u0012\b\b6\u0012\u0004\b\b(9\u0012\u0015\u0012\u0013\u0018\u00018\u0000\u00a2\u0006\f\b5\u0012\b\b6\u0012\u0004\b\b(:\u0012\u0004\u0012\u00020103J\u0016\u0010w\u001a\u0002012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0002R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R+\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00178D@DX\u0084\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010 \u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u0015@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R+\u0010&\u001a\u00020%2\u0006\u0010\u0016\u001a\u00020%8D@DX\u0084\u008e\u0002\u00a2\u0006\u0012\n\u0004\b+\u0010\u001e\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010\u0007R\u0016\u0010/\u001a\n\u0012\u0004\u0012\u000201\u0018\u000100X\u0082\u000e\u00a2\u0006\u0002\n\u0000RW\u00102\u001aK\u0012\u0013\u0012\u001104\u00a2\u0006\f\b5\u0012\b\b6\u0012\u0004\b\b(7\u0012\u0013\u0012\u001108\u00a2\u0006\f\b5\u0012\b\b6\u0012\u0004\b\b(9\u0012\u0015\u0012\u0013\u0018\u00018\u0000\u00a2\u0006\f\b5\u0012\b\b6\u0012\u0004\b\b(:\u0012\u0004\u0012\u000201\u0018\u000103X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010;\u001a\u0004\u0018\u00010<X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001c\u0010A\u001a\u0004\u0018\u00010BX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010F\u00a8\u0006y"}, d2 = {"Lcom/dominate/caravan/core/base/BaseAdapter;", "M", "V", "Lcom/dominate/caravan/core/base/BaseViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "items", "", "(Ljava/util/List;)V", "animationDelta", "", "getAnimationDelta", "()F", "setAnimationDelta", "(F)V", "animationDuration", "", "getAnimationDuration", "()J", "setAnimationDuration", "(J)V", "animationEnabled", "", "<set-?>", "Landroid/content/Context;", "context", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "context$delegate", "Lkotlin/properties/ReadWriteProperty;", "value", "emptyPageEnabled", "getEmptyPageEnabled", "()Z", "setEmptyPageEnabled", "(Z)V", "Landroid/view/LayoutInflater;", "inflater", "getInflater", "()Landroid/view/LayoutInflater;", "setInflater", "(Landroid/view/LayoutInflater;)V", "inflater$delegate", "getItems", "()Ljava/util/List;", "setItems", "onEmptyPageActionClickListener", "Lkotlin/Function0;", "", "onItemClickListener", "Lkotlin/Function3;", "Landroid/view/View;", "Lkotlin/ParameterName;", "name", "view", "", "position", "item", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "refreshLayout", "Lcom/dominate/caravan/core/base/BaseSwipeRefreshLayout;", "getRefreshLayout", "()Lcom/dominate/caravan/core/base/BaseSwipeRefreshLayout;", "setRefreshLayout", "(Lcom/dominate/caravan/core/base/BaseSwipeRefreshLayout;)V", "add", "(Ljava/lang/Object;)V", "(ILjava/lang/Object;)V", "itemsToAdd", "bind", "holder", "(Lcom/dominate/caravan/core/base/BaseViewHolder;I)V", "disableAnimations", "get", "(I)Ljava/lang/Object;", "getAlphaAnimation", "Landroid/view/animation/Animation;", "getBottomAnimationSet", "Landroid/view/animation/AnimationSet;", "getEndAnimationSet", "getItemCount", "getItemViewType", "getOnEmptyPageActionClickListener", "getOnItemClickListener", "getTranslateAnimation", "fromXDelta", "toXDelta", "fromYDelta", "toYDelta", "getViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "(Landroid/view/ViewGroup;I)Lcom/dominate/caravan/core/base/BaseViewHolder;", "handleAnimations", "handleClickListener", "(Lcom/dominate/caravan/core/base/BaseViewHolder;)V", "handleGridAnimations", "manager", "Landroidx/recyclerview/widget/GridLayoutManager;", "handleLinearAnimations", "Landroidx/recyclerview/widget/LinearLayoutManager;", "handleOnItemClicked", "clickedPosition", "handleRefreshLayout", "onAttachedToRecyclerView", "onBindViewHolder", "onCreateViewHolder", "onDetachedFromRecyclerView", "remove", "reset", "setOnEmptyPageActionClickListener", "setOnItemClickListener", "submitList", "Companion", "app_debug"})
public abstract class BaseAdapter<M extends java.lang.Object, V extends com.dominate.caravan.core.base.BaseViewHolder<M>> extends androidx.recyclerview.widget.RecyclerView.Adapter<V> {
    private kotlin.jvm.functions.Function3<? super android.view.View, ? super java.lang.Integer, ? super M, kotlin.Unit> onItemClickListener;
    private kotlin.jvm.functions.Function0<kotlin.Unit> onEmptyPageActionClickListener;
    private long animationDuration = 600L;
    private float animationDelta = 0.5F;
    private boolean emptyPageEnabled = false;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty context$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty inflater$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private com.dominate.caravan.core.base.BaseSwipeRefreshLayout refreshLayout;
    @org.jetbrains.annotations.Nullable()
    private androidx.recyclerview.widget.RecyclerView recyclerView;
    private boolean animationEnabled = false;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<M> items;
    @java.lang.Deprecated()
    private static final float DEFAULT_DELTA = 0.5F;
    @java.lang.Deprecated()
    private static final long DEFAULT_DURATION = 600L;
    @java.lang.Deprecated()
    public static final int EMPTY_TYPE = 5213;
    @org.jetbrains.annotations.NotNull()
    private static final com.dominate.caravan.core.base.BaseAdapter.Companion Companion = null;
    
    public final long getAnimationDuration() {
        return 0L;
    }
    
    public final void setAnimationDuration(long p0) {
    }
    
    public final float getAnimationDelta() {
        return 0.0F;
    }
    
    public final void setAnimationDelta(float p0) {
    }
    
    public final boolean getEmptyPageEnabled() {
        return false;
    }
    
    public final void setEmptyPageEnabled(boolean value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final android.content.Context getContext() {
        return null;
    }
    
    protected final void setContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final android.view.LayoutInflater getInflater() {
        return null;
    }
    
    protected final void setInflater(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final com.dominate.caravan.core.base.BaseSwipeRefreshLayout getRefreshLayout() {
        return null;
    }
    
    protected final void setRefreshLayout(@org.jetbrains.annotations.Nullable()
    com.dominate.caravan.core.base.BaseSwipeRefreshLayout p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final androidx.recyclerview.widget.RecyclerView getRecyclerView() {
        return null;
    }
    
    protected final void setRecyclerView(@org.jetbrains.annotations.Nullable()
    androidx.recyclerview.widget.RecyclerView p0) {
    }
    
    @java.lang.Override()
    public void onAttachedToRecyclerView(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView) {
    }
    
    @java.lang.Override()
    public void onDetachedFromRecyclerView(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView) {
    }
    
    private final void handleAnimations() {
    }
    
    private final void handleGridAnimations(androidx.recyclerview.widget.GridLayoutManager manager) {
    }
    
    private final void handleLinearAnimations(androidx.recyclerview.widget.LinearLayoutManager manager) {
    }
    
    private final android.view.animation.AnimationSet getBottomAnimationSet() {
        return null;
    }
    
    private final android.view.animation.AnimationSet getEndAnimationSet() {
        return null;
    }
    
    private final android.view.animation.Animation getAlphaAnimation() {
        return null;
    }
    
    private final android.view.animation.Animation getTranslateAnimation(float fromXDelta, float toXDelta, float fromYDelta, float toYDelta) {
        return null;
    }
    
    public final void setOnItemClickListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function3<? super android.view.View, ? super java.lang.Integer, ? super M, kotlin.Unit> onItemClickListener) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function3<android.view.View, java.lang.Integer, M, kotlin.Unit> getOnItemClickListener() {
        return null;
    }
    
    public final void setOnEmptyPageActionClickListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onEmptyPageActionClickListener) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnEmptyPageActionClickListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public V onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    V holder, int position) {
    }
    
    public void bind(@org.jetbrains.annotations.NotNull()
    V holder, int position) {
    }
    
    private final void handleClickListener(V holder) {
    }
    
    protected final void handleOnItemClicked(@org.jetbrains.annotations.NotNull()
    android.view.View view, int clickedPosition) {
    }
    
    protected final void disableAnimations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract V getViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType);
    
    public void add(M item) {
    }
    
    public void add(int position, M item) {
    }
    
    public void add(@org.jetbrains.annotations.NotNull()
    java.util.List<M> itemsToAdd) {
    }
    
    private final void handleRefreshLayout() {
    }
    
    private final void submitList(java.util.List<M> items) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final M get(int position) {
        return null;
    }
    
    public void add(int position, @org.jetbrains.annotations.NotNull()
    java.util.List<M> itemsToAdd) {
    }
    
    public final void remove(M item) {
    }
    
    public final void remove(int position) {
    }
    
    public final void remove(@org.jetbrains.annotations.NotNull()
    java.util.List<M> itemsToAdd) {
    }
    
    public final void reset() {
    }
    
    public final void reset(@org.jetbrains.annotations.Nullable()
    java.util.List<M> items) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<M> getItems() {
        return null;
    }
    
    public final void setItems(@org.jetbrains.annotations.Nullable()
    java.util.List<M> p0) {
    }
    
    public BaseAdapter(@org.jetbrains.annotations.Nullable()
    java.util.List<M> items) {
        super();
    }
    
    public BaseAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/dominate/caravan/core/base/BaseAdapter$Companion;", "", "()V", "DEFAULT_DELTA", "", "DEFAULT_DURATION", "", "EMPTY_TYPE", "", "app_debug"})
    static final class Companion {
        
        private Companion() {
            super();
        }
    }
}