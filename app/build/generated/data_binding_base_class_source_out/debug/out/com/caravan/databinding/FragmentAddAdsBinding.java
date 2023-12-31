// Generated by view binder compiler. Do not edit!
package com.caravan.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.caravan.R;
import com.google.android.material.button.MaterialButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentAddAdsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MaterialButton btnSetPassword;

  @NonNull
  public final ConstraintLayout constraintLayout01;

  @NonNull
  public final ConstraintLayout constraintLayout02;

  @NonNull
  public final ConstraintLayout constraintLayout03;

  @NonNull
  public final ConstraintLayout constraintLayout04;

  @NonNull
  public final ConstraintLayout constraintLayout05;

  @NonNull
  public final AppCompatImageView ivBack;

  @NonNull
  public final AppCompatTextView text04;

  @NonNull
  public final AppCompatTextView text05;

  @NonNull
  public final AppCompatTextView text06;

  @NonNull
  public final AppCompatTextView text07;

  @NonNull
  public final AppCompatTextView text08;

  @NonNull
  public final AppCompatTextView text09;

  @NonNull
  public final AppCompatTextView text10;

  @NonNull
  public final AppCompatTextView text11;

  @NonNull
  public final AppCompatTextView textView02;

  private FragmentAddAdsBinding(@NonNull ConstraintLayout rootView,
      @NonNull MaterialButton btnSetPassword, @NonNull ConstraintLayout constraintLayout01,
      @NonNull ConstraintLayout constraintLayout02, @NonNull ConstraintLayout constraintLayout03,
      @NonNull ConstraintLayout constraintLayout04, @NonNull ConstraintLayout constraintLayout05,
      @NonNull AppCompatImageView ivBack, @NonNull AppCompatTextView text04,
      @NonNull AppCompatTextView text05, @NonNull AppCompatTextView text06,
      @NonNull AppCompatTextView text07, @NonNull AppCompatTextView text08,
      @NonNull AppCompatTextView text09, @NonNull AppCompatTextView text10,
      @NonNull AppCompatTextView text11, @NonNull AppCompatTextView textView02) {
    this.rootView = rootView;
    this.btnSetPassword = btnSetPassword;
    this.constraintLayout01 = constraintLayout01;
    this.constraintLayout02 = constraintLayout02;
    this.constraintLayout03 = constraintLayout03;
    this.constraintLayout04 = constraintLayout04;
    this.constraintLayout05 = constraintLayout05;
    this.ivBack = ivBack;
    this.text04 = text04;
    this.text05 = text05;
    this.text06 = text06;
    this.text07 = text07;
    this.text08 = text08;
    this.text09 = text09;
    this.text10 = text10;
    this.text11 = text11;
    this.textView02 = textView02;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentAddAdsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentAddAdsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_add_ads, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentAddAdsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_set_password;
      MaterialButton btnSetPassword = rootView.findViewById(id);
      if (btnSetPassword == null) {
        break missingId;
      }

      id = R.id.constraintLayout01;
      ConstraintLayout constraintLayout01 = rootView.findViewById(id);
      if (constraintLayout01 == null) {
        break missingId;
      }

      id = R.id.constraintLayout02;
      ConstraintLayout constraintLayout02 = rootView.findViewById(id);
      if (constraintLayout02 == null) {
        break missingId;
      }

      id = R.id.constraintLayout03;
      ConstraintLayout constraintLayout03 = rootView.findViewById(id);
      if (constraintLayout03 == null) {
        break missingId;
      }

      id = R.id.constraintLayout04;
      ConstraintLayout constraintLayout04 = rootView.findViewById(id);
      if (constraintLayout04 == null) {
        break missingId;
      }

      id = R.id.constraintLayout05;
      ConstraintLayout constraintLayout05 = rootView.findViewById(id);
      if (constraintLayout05 == null) {
        break missingId;
      }

      id = R.id.iv_back;
      AppCompatImageView ivBack = rootView.findViewById(id);
      if (ivBack == null) {
        break missingId;
      }

      id = R.id.text_04;
      AppCompatTextView text04 = rootView.findViewById(id);
      if (text04 == null) {
        break missingId;
      }

      id = R.id.text_05;
      AppCompatTextView text05 = rootView.findViewById(id);
      if (text05 == null) {
        break missingId;
      }

      id = R.id.text_06;
      AppCompatTextView text06 = rootView.findViewById(id);
      if (text06 == null) {
        break missingId;
      }

      id = R.id.text_07;
      AppCompatTextView text07 = rootView.findViewById(id);
      if (text07 == null) {
        break missingId;
      }

      id = R.id.text_08;
      AppCompatTextView text08 = rootView.findViewById(id);
      if (text08 == null) {
        break missingId;
      }

      id = R.id.text_09;
      AppCompatTextView text09 = rootView.findViewById(id);
      if (text09 == null) {
        break missingId;
      }

      id = R.id.text_10;
      AppCompatTextView text10 = rootView.findViewById(id);
      if (text10 == null) {
        break missingId;
      }

      id = R.id.text_11;
      AppCompatTextView text11 = rootView.findViewById(id);
      if (text11 == null) {
        break missingId;
      }

      id = R.id.textView_02;
      AppCompatTextView textView02 = rootView.findViewById(id);
      if (textView02 == null) {
        break missingId;
      }

      return new FragmentAddAdsBinding((ConstraintLayout) rootView, btnSetPassword,
          constraintLayout01, constraintLayout02, constraintLayout03, constraintLayout04,
          constraintLayout05, ivBack, text04, text05, text06, text07, text08, text09, text10,
          text11, textView02);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
