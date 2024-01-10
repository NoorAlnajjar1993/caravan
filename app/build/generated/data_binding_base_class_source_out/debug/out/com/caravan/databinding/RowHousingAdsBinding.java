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
import com.dominate.caravan.medule.home.HousingAd;
import com.google.android.material.imageview.ShapeableImageView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class RowHousingAdsBinding extends ViewDataBinding {
  @NonNull
  public final ConstraintLayout constraintLayout01;

  @NonNull
  public final ShapeableImageView imageView02;

  @NonNull
  public final AppCompatImageView imageView03;

  @NonNull
  public final AppCompatImageView ivFavourite;

  @NonNull
  public final AppCompatTextView tvDirection;

  @NonNull
  public final AppCompatTextView tvDistance;

  @NonNull
  public final AppCompatTextView tvLocation;

  @NonNull
  public final AppCompatTextView tvName;

  @NonNull
  public final AppCompatTextView tvPrice;

  @Bindable
  protected HousingAd mItem;

  protected RowHousingAdsBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ConstraintLayout constraintLayout01, ShapeableImageView imageView02,
      AppCompatImageView imageView03, AppCompatImageView ivFavourite, AppCompatTextView tvDirection,
      AppCompatTextView tvDistance, AppCompatTextView tvLocation, AppCompatTextView tvName,
      AppCompatTextView tvPrice) {
    super(_bindingComponent, _root, _localFieldCount);
    this.constraintLayout01 = constraintLayout01;
    this.imageView02 = imageView02;
    this.imageView03 = imageView03;
    this.ivFavourite = ivFavourite;
    this.tvDirection = tvDirection;
    this.tvDistance = tvDistance;
    this.tvLocation = tvLocation;
    this.tvName = tvName;
    this.tvPrice = tvPrice;
  }

  public abstract void setItem(@Nullable HousingAd item);

  @Nullable
  public HousingAd getItem() {
    return mItem;
  }

  @NonNull
  public static RowHousingAdsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.row_housing_ads, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static RowHousingAdsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<RowHousingAdsBinding>inflateInternal(inflater, R.layout.row_housing_ads, root, attachToRoot, component);
  }

  @NonNull
  public static RowHousingAdsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.row_housing_ads, null, false, component)
   */
  @NonNull
  @Deprecated
  public static RowHousingAdsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<RowHousingAdsBinding>inflateInternal(inflater, R.layout.row_housing_ads, null, false, component);
  }

  public static RowHousingAdsBinding bind(@NonNull View view) {
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
  public static RowHousingAdsBinding bind(@NonNull View view, @Nullable Object component) {
    return (RowHousingAdsBinding)bind(component, view, R.layout.row_housing_ads);
  }
}
