// Generated by view binder compiler. Do not edit!
package com.caravan.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.caravan.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class BottomSheetReportBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MaterialButton btnReport;

  @NonNull
  public final ConstraintLayout const01;

  @NonNull
  public final ConstraintLayout constraintLayout01;

  @NonNull
  public final TextInputEditText etProblem;

  @NonNull
  public final AppCompatRadioButton radioButton01;

  @NonNull
  public final AppCompatRadioButton radioButton02;

  @NonNull
  public final AppCompatRadioButton radioButton03;

  @NonNull
  public final AppCompatRadioButton radioButton04;

  @NonNull
  public final AppCompatRadioButton radioButton05;

  @NonNull
  public final RadioGroup radioGroup;

  @NonNull
  public final TextInputLayout tlProblem;

  @NonNull
  public final AppCompatTextView tvTitle;

  @NonNull
  public final View view01;

  @NonNull
  public final View view02;

  @NonNull
  public final View view03;

  @NonNull
  public final View view04;

  @NonNull
  public final View view05;

  private BottomSheetReportBinding(@NonNull ConstraintLayout rootView,
      @NonNull MaterialButton btnReport, @NonNull ConstraintLayout const01,
      @NonNull ConstraintLayout constraintLayout01, @NonNull TextInputEditText etProblem,
      @NonNull AppCompatRadioButton radioButton01, @NonNull AppCompatRadioButton radioButton02,
      @NonNull AppCompatRadioButton radioButton03, @NonNull AppCompatRadioButton radioButton04,
      @NonNull AppCompatRadioButton radioButton05, @NonNull RadioGroup radioGroup,
      @NonNull TextInputLayout tlProblem, @NonNull AppCompatTextView tvTitle, @NonNull View view01,
      @NonNull View view02, @NonNull View view03, @NonNull View view04, @NonNull View view05) {
    this.rootView = rootView;
    this.btnReport = btnReport;
    this.const01 = const01;
    this.constraintLayout01 = constraintLayout01;
    this.etProblem = etProblem;
    this.radioButton01 = radioButton01;
    this.radioButton02 = radioButton02;
    this.radioButton03 = radioButton03;
    this.radioButton04 = radioButton04;
    this.radioButton05 = radioButton05;
    this.radioGroup = radioGroup;
    this.tlProblem = tlProblem;
    this.tvTitle = tvTitle;
    this.view01 = view01;
    this.view02 = view02;
    this.view03 = view03;
    this.view04 = view04;
    this.view05 = view05;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static BottomSheetReportBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static BottomSheetReportBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.bottom_sheet_report, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static BottomSheetReportBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_report;
      MaterialButton btnReport = rootView.findViewById(id);
      if (btnReport == null) {
        break missingId;
      }

      id = R.id.const_01;
      ConstraintLayout const01 = rootView.findViewById(id);
      if (const01 == null) {
        break missingId;
      }

      ConstraintLayout constraintLayout01 = (ConstraintLayout) rootView;

      id = R.id.et_problem;
      TextInputEditText etProblem = rootView.findViewById(id);
      if (etProblem == null) {
        break missingId;
      }

      id = R.id.radioButton_01;
      AppCompatRadioButton radioButton01 = rootView.findViewById(id);
      if (radioButton01 == null) {
        break missingId;
      }

      id = R.id.radioButton_02;
      AppCompatRadioButton radioButton02 = rootView.findViewById(id);
      if (radioButton02 == null) {
        break missingId;
      }

      id = R.id.radioButton_03;
      AppCompatRadioButton radioButton03 = rootView.findViewById(id);
      if (radioButton03 == null) {
        break missingId;
      }

      id = R.id.radioButton_04;
      AppCompatRadioButton radioButton04 = rootView.findViewById(id);
      if (radioButton04 == null) {
        break missingId;
      }

      id = R.id.radioButton_05;
      AppCompatRadioButton radioButton05 = rootView.findViewById(id);
      if (radioButton05 == null) {
        break missingId;
      }

      id = R.id.radioGroup;
      RadioGroup radioGroup = rootView.findViewById(id);
      if (radioGroup == null) {
        break missingId;
      }

      id = R.id.tl_problem;
      TextInputLayout tlProblem = rootView.findViewById(id);
      if (tlProblem == null) {
        break missingId;
      }

      id = R.id.tv_title;
      AppCompatTextView tvTitle = rootView.findViewById(id);
      if (tvTitle == null) {
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

      id = R.id.view_03;
      View view03 = rootView.findViewById(id);
      if (view03 == null) {
        break missingId;
      }

      id = R.id.view_04;
      View view04 = rootView.findViewById(id);
      if (view04 == null) {
        break missingId;
      }

      id = R.id.view_05;
      View view05 = rootView.findViewById(id);
      if (view05 == null) {
        break missingId;
      }

      return new BottomSheetReportBinding((ConstraintLayout) rootView, btnReport, const01,
          constraintLayout01, etProblem, radioButton01, radioButton02, radioButton03, radioButton04,
          radioButton05, radioGroup, tlProblem, tvTitle, view01, view02, view03, view04, view05);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
