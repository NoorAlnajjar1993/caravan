// Generated by data binding compiler. Do not edit!
package com.caravan.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.caravan.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class DialogEnterAllFieldsBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatTextView btnLogout;

  @NonNull
  public final AppCompatImageView imageView01;

  @Bindable
  protected View.OnClickListener mOnClickListener;

  protected DialogEnterAllFieldsBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatTextView btnLogout, AppCompatImageView imageView01) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnLogout = btnLogout;
    this.imageView01 = imageView01;
  }

  public abstract void setOnClickListener(@Nullable View.OnClickListener onClickListener);

  @Nullable
  public View.OnClickListener getOnClickListener() {
    return mOnClickListener;
  }

  @NonNull
  public static DialogEnterAllFieldsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_enter_all_fields, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static DialogEnterAllFieldsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<DialogEnterAllFieldsBinding>inflateInternal(inflater, R.layout.dialog_enter_all_fields, root, attachToRoot, component);
  }

  @NonNull
  public static DialogEnterAllFieldsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_enter_all_fields, null, false, component)
   */
  @NonNull
  @Deprecated
  public static DialogEnterAllFieldsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<DialogEnterAllFieldsBinding>inflateInternal(inflater, R.layout.dialog_enter_all_fields, null, false, component);
  }

  public static DialogEnterAllFieldsBinding bind(@NonNull View view) {
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
  public static DialogEnterAllFieldsBinding bind(@NonNull View view, @Nullable Object component) {
    return (DialogEnterAllFieldsBinding)bind(component, view, R.layout.dialog_enter_all_fields);
  }
}