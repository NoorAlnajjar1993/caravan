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
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentCompleteBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatImageView complete1;

  @NonNull
  public final AppCompatImageView complete2;

  @NonNull
  public final AppCompatImageView complete3;

  @NonNull
  public final AppCompatImageView complete4;

  @NonNull
  public final AppCompatImageView ivBack;

  @NonNull
  public final AppCompatTextView tvText01;

  @NonNull
  public final AppCompatTextView tvText02;

  @NonNull
  public final AppCompatTextView tvText03;

  @NonNull
  public final AppCompatTextView tvText04;

  private FragmentCompleteBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppCompatImageView complete1, @NonNull AppCompatImageView complete2,
      @NonNull AppCompatImageView complete3, @NonNull AppCompatImageView complete4,
      @NonNull AppCompatImageView ivBack, @NonNull AppCompatTextView tvText01,
      @NonNull AppCompatTextView tvText02, @NonNull AppCompatTextView tvText03,
      @NonNull AppCompatTextView tvText04) {
    this.rootView = rootView;
    this.complete1 = complete1;
    this.complete2 = complete2;
    this.complete3 = complete3;
    this.complete4 = complete4;
    this.ivBack = ivBack;
    this.tvText01 = tvText01;
    this.tvText02 = tvText02;
    this.tvText03 = tvText03;
    this.tvText04 = tvText04;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentCompleteBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentCompleteBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_complete, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentCompleteBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.complete_1;
      AppCompatImageView complete1 = rootView.findViewById(id);
      if (complete1 == null) {
        break missingId;
      }

      id = R.id.complete_2;
      AppCompatImageView complete2 = rootView.findViewById(id);
      if (complete2 == null) {
        break missingId;
      }

      id = R.id.complete_3;
      AppCompatImageView complete3 = rootView.findViewById(id);
      if (complete3 == null) {
        break missingId;
      }

      id = R.id.complete_4;
      AppCompatImageView complete4 = rootView.findViewById(id);
      if (complete4 == null) {
        break missingId;
      }

      id = R.id.iv_back;
      AppCompatImageView ivBack = rootView.findViewById(id);
      if (ivBack == null) {
        break missingId;
      }

      id = R.id.tv_text_01;
      AppCompatTextView tvText01 = rootView.findViewById(id);
      if (tvText01 == null) {
        break missingId;
      }

      id = R.id.tv_text_02;
      AppCompatTextView tvText02 = rootView.findViewById(id);
      if (tvText02 == null) {
        break missingId;
      }

      id = R.id.tv_text_03;
      AppCompatTextView tvText03 = rootView.findViewById(id);
      if (tvText03 == null) {
        break missingId;
      }

      id = R.id.tv_text_04;
      AppCompatTextView tvText04 = rootView.findViewById(id);
      if (tvText04 == null) {
        break missingId;
      }

      return new FragmentCompleteBinding((ConstraintLayout) rootView, complete1, complete2,
          complete3, complete4, ivBack, tvText01, tvText02, tvText03, tvText04);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}