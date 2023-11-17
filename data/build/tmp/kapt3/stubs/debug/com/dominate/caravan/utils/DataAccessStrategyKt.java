package com.dominate.caravan.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000@\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0012\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u001a,\u0010\u0003\u001a\u00020\u00042\u001c\u0010\u0005\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u001a\u0082\u0001\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000e0\r0\f\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u0010\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000e0\f0\u00112\"\u0010\u0012\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000f0\r0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00062\"\u0010\u0013\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0014\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015\u001aD\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000f0\r0\f\"\u0004\b\u0000\u0010\u000f2\"\u0010\u0012\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000f0\r0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017\u001a,\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000e0\r0\f\"\u0004\b\u0000\u0010\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000e0\f0\u0011\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0019"}, d2 = {"encoder", "", "imagePath", "main", "Lkotlinx/coroutines/Job;", "work", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/Job;", "performGetOperation", "Landroidx/lifecycle/LiveData;", "Lcom/dominate/caravan/utils/Resource;", "T", "A", "databaseQuery", "Lkotlin/Function0;", "networkCall", "saveCallResult", "Lkotlin/Function2;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Landroidx/lifecycle/LiveData;", "performRemoteOperation", "(Lkotlin/jvm/functions/Function1;)Landroidx/lifecycle/LiveData;", "performRemoteOperation2", "data_debug"})
public final class DataAccessStrategyKt {
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object, A extends java.lang.Object>androidx.lifecycle.LiveData<com.dominate.caravan.utils.Resource<T>> performGetOperation(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<? extends androidx.lifecycle.LiveData<T>> databaseQuery, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super com.dominate.caravan.utils.Resource<? extends A>>, ? extends java.lang.Object> networkCall, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super A, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> saveCallResult) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <A extends java.lang.Object>androidx.lifecycle.LiveData<com.dominate.caravan.utils.Resource<A>> performRemoteOperation(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super com.dominate.caravan.utils.Resource<? extends A>>, ? extends java.lang.Object> networkCall) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>androidx.lifecycle.LiveData<com.dominate.caravan.utils.Resource<T>> performRemoteOperation2(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<? extends androidx.lifecycle.LiveData<T>> databaseQuery) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final kotlinx.coroutines.Job main(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> work) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.String encoder(@org.jetbrains.annotations.Nullable()
    java.lang.String imagePath) {
        return null;
    }
}