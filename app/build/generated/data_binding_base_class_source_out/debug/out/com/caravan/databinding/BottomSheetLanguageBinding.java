// Generated by view binder compiler. Do not edit!
package com.caravan.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import com.caravan.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class BottomSheetLanguageBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final TextView arabicBtn;

  @NonNull
  public final CardView bottomSheet;

  @NonNull
  public final TextView englishBtn;

  private BottomSheetLanguageBinding(@NonNull CardView rootView, @NonNull TextView arabicBtn,
      @NonNull CardView bottomSheet, @NonNull TextView englishBtn) {
    this.rootView = rootView;
    this.arabicBtn = arabicBtn;
    this.bottomSheet = bottomSheet;
    this.englishBtn = englishBtn;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static BottomSheetLanguageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static BottomSheetLanguageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.bottom_sheet_language, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static BottomSheetLanguageBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.arabic_btn;
      TextView arabicBtn = rootView.findViewById(id);
      if (arabicBtn == null) {
        break missingId;
      }

      CardView bottomSheet = (CardView) rootView;

      id = R.id.english_btn;
      TextView englishBtn = rootView.findViewById(id);
      if (englishBtn == null) {
        break missingId;
      }

      return new BottomSheetLanguageBinding((CardView) rootView, arabicBtn, bottomSheet,
          englishBtn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}