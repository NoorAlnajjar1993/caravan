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
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.caravan.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentCommercialAdsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout constraintLayout01;

  @NonNull
  public final AppCompatImageView ivBack;

  @NonNull
  public final RecyclerView rvCommercialAds;

  @NonNull
  public final AppCompatTextView textView02;

  private FragmentCommercialAdsBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout constraintLayout01, @NonNull AppCompatImageView ivBack,
      @NonNull RecyclerView rvCommercialAds, @NonNull AppCompatTextView textView02) {
    this.rootView = rootView;
    this.constraintLayout01 = constraintLayout01;
    this.ivBack = ivBack;
    this.rvCommercialAds = rvCommercialAds;
    this.textView02 = textView02;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentCommercialAdsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentCommercialAdsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_commercial_ads, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentCommercialAdsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.constraintLayout01;
      ConstraintLayout constraintLayout01 = rootView.findViewById(id);
      if (constraintLayout01 == null) {
        break missingId;
      }

      id = R.id.iv_back;
      AppCompatImageView ivBack = rootView.findViewById(id);
      if (ivBack == null) {
        break missingId;
      }

      id = R.id.rvCommercialAds;
      RecyclerView rvCommercialAds = rootView.findViewById(id);
      if (rvCommercialAds == null) {
        break missingId;
      }

      id = R.id.textView_02;
      AppCompatTextView textView02 = rootView.findViewById(id);
      if (textView02 == null) {
        break missingId;
      }

      return new FragmentCommercialAdsBinding((ConstraintLayout) rootView, constraintLayout01,
          ivBack, rvCommercialAds, textView02);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
