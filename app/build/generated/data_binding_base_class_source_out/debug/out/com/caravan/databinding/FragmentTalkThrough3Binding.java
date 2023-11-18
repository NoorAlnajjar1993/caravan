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

public final class FragmentTalkThrough3Binding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatTextView btnBack;

  @NonNull
  public final MaterialButton btnNext;

  @NonNull
  public final AppCompatImageView imageView01;

  @NonNull
  public final AppCompatImageView imageView02;

  @NonNull
  public final AppCompatImageView imageView03;

  @NonNull
  public final AppCompatImageView imageView2;

  @NonNull
  public final AppCompatTextView textView01;

  @NonNull
  public final AppCompatTextView textView02;

  private FragmentTalkThrough3Binding(@NonNull ConstraintLayout rootView,
      @NonNull AppCompatTextView btnBack, @NonNull MaterialButton btnNext,
      @NonNull AppCompatImageView imageView01, @NonNull AppCompatImageView imageView02,
      @NonNull AppCompatImageView imageView03, @NonNull AppCompatImageView imageView2,
      @NonNull AppCompatTextView textView01, @NonNull AppCompatTextView textView02) {
    this.rootView = rootView;
    this.btnBack = btnBack;
    this.btnNext = btnNext;
    this.imageView01 = imageView01;
    this.imageView02 = imageView02;
    this.imageView03 = imageView03;
    this.imageView2 = imageView2;
    this.textView01 = textView01;
    this.textView02 = textView02;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentTalkThrough3Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentTalkThrough3Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_talk_through_3, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentTalkThrough3Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_back;
      AppCompatTextView btnBack = rootView.findViewById(id);
      if (btnBack == null) {
        break missingId;
      }

      id = R.id.btn_next;
      MaterialButton btnNext = rootView.findViewById(id);
      if (btnNext == null) {
        break missingId;
      }

      id = R.id.imageView_01;
      AppCompatImageView imageView01 = rootView.findViewById(id);
      if (imageView01 == null) {
        break missingId;
      }

      id = R.id.imageView_02;
      AppCompatImageView imageView02 = rootView.findViewById(id);
      if (imageView02 == null) {
        break missingId;
      }

      id = R.id.imageView_03;
      AppCompatImageView imageView03 = rootView.findViewById(id);
      if (imageView03 == null) {
        break missingId;
      }

      id = R.id.imageView2;
      AppCompatImageView imageView2 = rootView.findViewById(id);
      if (imageView2 == null) {
        break missingId;
      }

      id = R.id.textView_01;
      AppCompatTextView textView01 = rootView.findViewById(id);
      if (textView01 == null) {
        break missingId;
      }

      id = R.id.textView_02;
      AppCompatTextView textView02 = rootView.findViewById(id);
      if (textView02 == null) {
        break missingId;
      }

      return new FragmentTalkThrough3Binding((ConstraintLayout) rootView, btnBack, btnNext,
          imageView01, imageView02, imageView03, imageView2, textView01, textView02);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
