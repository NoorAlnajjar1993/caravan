// Generated by data binding compiler. Do not edit!
package com.caravan.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.caravan.R;
import com.dominate.caravan.medule.home.CommercialEstate;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class RowMyAdsCommercialEstateBinding extends ViewDataBinding {
  @NonNull
  public final ConstraintLayout constraintLayout01;

  @NonNull
  public final AppCompatImageView ivDelete;

  @NonNull
  public final AppCompatImageView ivEdit;

  @NonNull
  public final AppCompatImageView ivImage;

  @NonNull
  public final AppCompatImageView ivPlay;

  @NonNull
  public final AppCompatTextView tvDate;

  @NonNull
  public final AppCompatTextView tvFeatureAds;

  @NonNull
  public final AppCompatTextView tvName;

  @NonNull
  public final AppCompatTextView tvPrice;

  @NonNull
  public final AppCompatTextView tvSeen;

  @Bindable
  protected CommercialEstate mItem;

  protected RowMyAdsCommercialEstateBinding(Object _bindingComponent, View _root,
      int _localFieldCount, ConstraintLayout constraintLayout01, AppCompatImageView ivDelete,
      AppCompatImageView ivEdit, AppCompatImageView ivImage, AppCompatImageView ivPlay,
      AppCompatTextView tvDate, AppCompatTextView tvFeatureAds, AppCompatTextView tvName,
      AppCompatTextView tvPrice, AppCompatTextView tvSeen) {
    super(_bindingComponent, _root, _localFieldCount);
    this.constraintLayout01 = constraintLayout01;
    this.ivDelete = ivDelete;
    this.ivEdit = ivEdit;
    this.ivImage = ivImage;
    this.ivPlay = ivPlay;
    this.tvDate = tvDate;
    this.tvFeatureAds = tvFeatureAds;
    this.tvName = tvName;
    this.tvPrice = tvPrice;
    this.tvSeen = tvSeen;
  }

  public abstract void setItem(@Nullable CommercialEstate item);

  @Nullable
  public CommercialEstate getItem() {
    return mItem;
  }

  @NonNull
  public static RowMyAdsCommercialEstateBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.row_my_ads_commercial_estate, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static RowMyAdsCommercialEstateBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<RowMyAdsCommercialEstateBinding>inflateInternal(inflater, R.layout.row_my_ads_commercial_estate, root, attachToRoot, component);
  }

  @NonNull
  public static RowMyAdsCommercialEstateBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.row_my_ads_commercial_estate, null, false, component)
   */
  @NonNull
  @Deprecated
  public static RowMyAdsCommercialEstateBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<RowMyAdsCommercialEstateBinding>inflateInternal(inflater, R.layout.row_my_ads_commercial_estate, null, false, component);
  }

  public static RowMyAdsCommercialEstateBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static RowMyAdsCommercialEstateBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (RowMyAdsCommercialEstateBinding)bind(component, view, R.layout.row_my_ads_commercial_estate);
  }
}
