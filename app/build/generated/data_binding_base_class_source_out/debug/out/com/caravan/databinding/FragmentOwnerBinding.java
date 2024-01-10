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
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import com.caravan.R;
import com.google.android.material.imageview.ShapeableImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentOwnerBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final CoordinatorLayout bottomSheetBlockReport;

  @NonNull
  public final CoordinatorLayout bottomSheetReport;

  @NonNull
  public final ConstraintLayout constraintLayout01;

  @NonNull
  public final AppCompatImageView imageView01;

  @NonNull
  public final AppCompatImageView imageView02;

  @NonNull
  public final BottomSheetBlockReportBinding includeBlockReportSheet;

  @NonNull
  public final BottomSheetReportBinding includeReportSheet;

  @NonNull
  public final ShapeableImageView ivProfileImage;

  @NonNull
  public final AppCompatTextView textView02;

  @NonNull
  public final AppCompatTextView tvAdsName;

  @NonNull
  public final AppCompatTextView tvEmail;

  @NonNull
  public final AppCompatTextView tvName;

  @NonNull
  public final AppCompatTextView tvPhone;

  @NonNull
  public final AppCompatTextView tvWhatsApp;

  private FragmentOwnerBinding(@NonNull ConstraintLayout rootView,
      @NonNull CoordinatorLayout bottomSheetBlockReport,
      @NonNull CoordinatorLayout bottomSheetReport, @NonNull ConstraintLayout constraintLayout01,
      @NonNull AppCompatImageView imageView01, @NonNull AppCompatImageView imageView02,
      @NonNull BottomSheetBlockReportBinding includeBlockReportSheet,
      @NonNull BottomSheetReportBinding includeReportSheet,
      @NonNull ShapeableImageView ivProfileImage, @NonNull AppCompatTextView textView02,
      @NonNull AppCompatTextView tvAdsName, @NonNull AppCompatTextView tvEmail,
      @NonNull AppCompatTextView tvName, @NonNull AppCompatTextView tvPhone,
      @NonNull AppCompatTextView tvWhatsApp) {
    this.rootView = rootView;
    this.bottomSheetBlockReport = bottomSheetBlockReport;
    this.bottomSheetReport = bottomSheetReport;
    this.constraintLayout01 = constraintLayout01;
    this.imageView01 = imageView01;
    this.imageView02 = imageView02;
    this.includeBlockReportSheet = includeBlockReportSheet;
    this.includeReportSheet = includeReportSheet;
    this.ivProfileImage = ivProfileImage;
    this.textView02 = textView02;
    this.tvAdsName = tvAdsName;
    this.tvEmail = tvEmail;
    this.tvName = tvName;
    this.tvPhone = tvPhone;
    this.tvWhatsApp = tvWhatsApp;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentOwnerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentOwnerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_owner, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentOwnerBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bottomSheet_block_report;
      CoordinatorLayout bottomSheetBlockReport = rootView.findViewById(id);
      if (bottomSheetBlockReport == null) {
        break missingId;
      }

      id = R.id.bottomSheet_report;
      CoordinatorLayout bottomSheetReport = rootView.findViewById(id);
      if (bottomSheetReport == null) {
        break missingId;
      }

      id = R.id.constraintLayout01;
      ConstraintLayout constraintLayout01 = rootView.findViewById(id);
      if (constraintLayout01 == null) {
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

      id = R.id.include_block_report_sheet;
      View includeBlockReportSheet = rootView.findViewById(id);
      if (includeBlockReportSheet == null) {
        break missingId;
      }
      BottomSheetBlockReportBinding binding_includeBlockReportSheet = BottomSheetBlockReportBinding.bind(includeBlockReportSheet);

      id = R.id.include_report_sheet;
      View includeReportSheet = rootView.findViewById(id);
      if (includeReportSheet == null) {
        break missingId;
      }
      BottomSheetReportBinding binding_includeReportSheet = BottomSheetReportBinding.bind(includeReportSheet);

      id = R.id.iv_profile_image;
      ShapeableImageView ivProfileImage = rootView.findViewById(id);
      if (ivProfileImage == null) {
        break missingId;
      }

      id = R.id.textView_02;
      AppCompatTextView textView02 = rootView.findViewById(id);
      if (textView02 == null) {
        break missingId;
      }

      id = R.id.tv_ads_name;
      AppCompatTextView tvAdsName = rootView.findViewById(id);
      if (tvAdsName == null) {
        break missingId;
      }

      id = R.id.tv_email;
      AppCompatTextView tvEmail = rootView.findViewById(id);
      if (tvEmail == null) {
        break missingId;
      }

      id = R.id.tv_name;
      AppCompatTextView tvName = rootView.findViewById(id);
      if (tvName == null) {
        break missingId;
      }

      id = R.id.tv_phone;
      AppCompatTextView tvPhone = rootView.findViewById(id);
      if (tvPhone == null) {
        break missingId;
      }

      id = R.id.tv_whatsApp;
      AppCompatTextView tvWhatsApp = rootView.findViewById(id);
      if (tvWhatsApp == null) {
        break missingId;
      }

      return new FragmentOwnerBinding((ConstraintLayout) rootView, bottomSheetBlockReport,
          bottomSheetReport, constraintLayout01, imageView01, imageView02,
          binding_includeBlockReportSheet, binding_includeReportSheet, ivProfileImage, textView02,
          tvAdsName, tvEmail, tvName, tvPhone, tvWhatsApp);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
