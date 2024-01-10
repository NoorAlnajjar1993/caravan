// Generated by view binder compiler. Do not edit!
package com.caravan.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.caravan.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class BottomSheetBlockReportBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout const01;

  @NonNull
  public final ConstraintLayout constraintLayout01;

  @NonNull
  public final AppCompatTextView tvBlock;

  @NonNull
  public final AppCompatTextView tvReport;

  @NonNull
  public final View view01;

  @NonNull
  public final View view02;

  private BottomSheetBlockReportBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout const01, @NonNull ConstraintLayout constraintLayout01,
      @NonNull AppCompatTextView tvBlock, @NonNull AppCompatTextView tvReport, @NonNull View view01,
      @NonNull View view02) {
    this.rootView = rootView;
    this.const01 = const01;
    this.constraintLayout01 = constraintLayout01;
    this.tvBlock = tvBlock;
    this.tvReport = tvReport;
    this.view01 = view01;
    this.view02 = view02;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static BottomSheetBlockReportBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static BottomSheetBlockReportBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.bottom_sheet_block_report, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static BottomSheetBlockReportBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.const_01;
      ConstraintLayout const01 = rootView.findViewById(id);
      if (const01 == null) {
        break missingId;
      }

      ConstraintLayout constraintLayout01 = (ConstraintLayout) rootView;

      id = R.id.tv_block;
      AppCompatTextView tvBlock = rootView.findViewById(id);
      if (tvBlock == null) {
        break missingId;
      }

      id = R.id.tv_report;
      AppCompatTextView tvReport = rootView.findViewById(id);
      if (tvReport == null) {
        break missingId;
      }

      id = R.id.view_01;
      View view01 = rootView.findViewById(id);
      if (view01 == null) {
        break missingId;
      }

      id = R.id.view_02;
      View view02 = rootView.findViewById(id);
      if (view02 == null) {
        break missingId;
      }

      return new BottomSheetBlockReportBinding((ConstraintLayout) rootView, const01,
          constraintLayout01, tvBlock, tvReport, view01, view02);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
