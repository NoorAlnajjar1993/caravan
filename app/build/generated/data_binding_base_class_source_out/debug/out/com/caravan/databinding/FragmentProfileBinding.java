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
import com.google.android.material.imageview.ShapeableImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentProfileBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MaterialButton btnPostAdNow;

  @NonNull
  public final ConstraintLayout constraintLayout01;

  @NonNull
  public final AppCompatImageView imageView03;

  @NonNull
  public final ShapeableImageView ivProfileImage;

  @NonNull
  public final AppCompatImageView ivUploadImage;

  @NonNull
  public final AppCompatTextView textView02;

  @NonNull
  public final AppCompatTextView textView03;

  @NonNull
  public final AppCompatTextView textView04;

  @NonNull
  public final AppCompatTextView textView05;

  @NonNull
  public final AppCompatTextView textView06;

  @NonNull
  public final AppCompatTextView textView07;

  @NonNull
  public final AppCompatTextView textView08;

  @NonNull
  public final AppCompatTextView textView09;

  @NonNull
  public final AppCompatTextView tvAboutCaravanCompany;

  @NonNull
  public final AppCompatTextView tvAccountSettings;

  @NonNull
  public final AppCompatTextView tvAdvertisementPackage;

  @NonNull
  public final AppCompatTextView tvMyCommercials;

  @NonNull
  public final AppCompatTextView tvMyRealEstateAds;

  @NonNull
  public final AppCompatTextView tvName;

  @NonNull
  public final AppCompatTextView tvPhone;

  private FragmentProfileBinding(@NonNull ConstraintLayout rootView,
      @NonNull MaterialButton btnPostAdNow, @NonNull ConstraintLayout constraintLayout01,
      @NonNull AppCompatImageView imageView03, @NonNull ShapeableImageView ivProfileImage,
      @NonNull AppCompatImageView ivUploadImage, @NonNull AppCompatTextView textView02,
      @NonNull AppCompatTextView textView03, @NonNull AppCompatTextView textView04,
      @NonNull AppCompatTextView textView05, @NonNull AppCompatTextView textView06,
      @NonNull AppCompatTextView textView07, @NonNull AppCompatTextView textView08,
      @NonNull AppCompatTextView textView09, @NonNull AppCompatTextView tvAboutCaravanCompany,
      @NonNull AppCompatTextView tvAccountSettings,
      @NonNull AppCompatTextView tvAdvertisementPackage, @NonNull AppCompatTextView tvMyCommercials,
      @NonNull AppCompatTextView tvMyRealEstateAds, @NonNull AppCompatTextView tvName,
      @NonNull AppCompatTextView tvPhone) {
    this.rootView = rootView;
    this.btnPostAdNow = btnPostAdNow;
    this.constraintLayout01 = constraintLayout01;
    this.imageView03 = imageView03;
    this.ivProfileImage = ivProfileImage;
    this.ivUploadImage = ivUploadImage;
    this.textView02 = textView02;
    this.textView03 = textView03;
    this.textView04 = textView04;
    this.textView05 = textView05;
    this.textView06 = textView06;
    this.textView07 = textView07;
    this.textView08 = textView08;
    this.textView09 = textView09;
    this.tvAboutCaravanCompany = tvAboutCaravanCompany;
    this.tvAccountSettings = tvAccountSettings;
    this.tvAdvertisementPackage = tvAdvertisementPackage;
    this.tvMyCommercials = tvMyCommercials;
    this.tvMyRealEstateAds = tvMyRealEstateAds;
    this.tvName = tvName;
    this.tvPhone = tvPhone;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentProfileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_profile, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentProfileBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_Post_ad_now;
      MaterialButton btnPostAdNow = rootView.findViewById(id);
      if (btnPostAdNow == null) {
        break missingId;
      }

      id = R.id.constraintLayout_01;
      ConstraintLayout constraintLayout01 = rootView.findViewById(id);
      if (constraintLayout01 == null) {
        break missingId;
      }

      id = R.id.imageView_03;
      AppCompatImageView imageView03 = rootView.findViewById(id);
      if (imageView03 == null) {
        break missingId;
      }

      id = R.id.iv_profile_image;
      ShapeableImageView ivProfileImage = rootView.findViewById(id);
      if (ivProfileImage == null) {
        break missingId;
      }

      id = R.id.iv_uploadImage;
      AppCompatImageView ivUploadImage = rootView.findViewById(id);
      if (ivUploadImage == null) {
        break missingId;
      }

      id = R.id.textView_02;
      AppCompatTextView textView02 = rootView.findViewById(id);
      if (textView02 == null) {
        break missingId;
      }

      id = R.id.textView_03;
      AppCompatTextView textView03 = rootView.findViewById(id);
      if (textView03 == null) {
        break missingId;
      }

      id = R.id.textView_04;
      AppCompatTextView textView04 = rootView.findViewById(id);
      if (textView04 == null) {
        break missingId;
      }

      id = R.id.textView_05;
      AppCompatTextView textView05 = rootView.findViewById(id);
      if (textView05 == null) {
        break missingId;
      }

      id = R.id.textView_06;
      AppCompatTextView textView06 = rootView.findViewById(id);
      if (textView06 == null) {
        break missingId;
      }

      id = R.id.textView_07;
      AppCompatTextView textView07 = rootView.findViewById(id);
      if (textView07 == null) {
        break missingId;
      }

      id = R.id.textView_08;
      AppCompatTextView textView08 = rootView.findViewById(id);
      if (textView08 == null) {
        break missingId;
      }

      id = R.id.textView_09;
      AppCompatTextView textView09 = rootView.findViewById(id);
      if (textView09 == null) {
        break missingId;
      }

      id = R.id.tv_about_caravan_company;
      AppCompatTextView tvAboutCaravanCompany = rootView.findViewById(id);
      if (tvAboutCaravanCompany == null) {
        break missingId;
      }

      id = R.id.tv_account_settings;
      AppCompatTextView tvAccountSettings = rootView.findViewById(id);
      if (tvAccountSettings == null) {
        break missingId;
      }

      id = R.id.tv_advertisement_package;
      AppCompatTextView tvAdvertisementPackage = rootView.findViewById(id);
      if (tvAdvertisementPackage == null) {
        break missingId;
      }

      id = R.id.tv_my_commercials;
      AppCompatTextView tvMyCommercials = rootView.findViewById(id);
      if (tvMyCommercials == null) {
        break missingId;
      }

      id = R.id.tv_my_real_estate_ads;
      AppCompatTextView tvMyRealEstateAds = rootView.findViewById(id);
      if (tvMyRealEstateAds == null) {
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

      return new FragmentProfileBinding((ConstraintLayout) rootView, btnPostAdNow,
          constraintLayout01, imageView03, ivProfileImage, ivUploadImage, textView02, textView03,
          textView04, textView05, textView06, textView07, textView08, textView09,
          tvAboutCaravanCompany, tvAccountSettings, tvAdvertisementPackage, tvMyCommercials,
          tvMyRealEstateAds, tvName, tvPhone);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
