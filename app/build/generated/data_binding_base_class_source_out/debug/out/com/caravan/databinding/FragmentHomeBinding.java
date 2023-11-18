// Generated by view binder compiler. Do not edit!
package com.caravan.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.caravan.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentHomeBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatTextView btnCommercialRealEstate;

  @NonNull
  public final AppCompatTextView btnHouseVilla;

  @NonNull
  public final AppCompatTextView btnLandFarm;

  @NonNull
  public final MaterialButton btnNext;

  @NonNull
  public final AppCompatTextView btnPartment;

  @NonNull
  public final MaterialButton btnPostAdNow;

  @NonNull
  public final ConstraintLayout constraintLayout01;

  @NonNull
  public final TextInputEditText etSearch;

  @NonNull
  public final AppCompatImageView imageView01;

  @NonNull
  public final AppCompatImageView imageView03;

  @NonNull
  public final AppCompatImageView imageView2;

  @NonNull
  public final RowDistinctAdvertismentBinding includeDistinctAdvertisment;

  @NonNull
  public final RowLatestAdsBinding includeLatestAds;

  @NonNull
  public final RowPropertiesNearYouBinding includePropertiesNearYou;

  @NonNull
  public final RowHousingAdsBinding includeRowHousingAds;

  @NonNull
  public final LinearLayoutCompat llSearchView;

  @NonNull
  public final AppCompatImageView mageView01;

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
  public final AppCompatTextView tvFeaturedAds;

  @NonNull
  public final AppCompatTextView tvHousingAds;

  @NonNull
  public final AppCompatTextView tvLatestAds;

  @NonNull
  public final AppCompatTextView tvPropertiesNearYou;

  @NonNull
  public final AppCompatTextView tvRent;

  @NonNull
  public final AppCompatTextView tvSale;

  private FragmentHomeBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppCompatTextView btnCommercialRealEstate, @NonNull AppCompatTextView btnHouseVilla,
      @NonNull AppCompatTextView btnLandFarm, @NonNull MaterialButton btnNext,
      @NonNull AppCompatTextView btnPartment, @NonNull MaterialButton btnPostAdNow,
      @NonNull ConstraintLayout constraintLayout01, @NonNull TextInputEditText etSearch,
      @NonNull AppCompatImageView imageView01, @NonNull AppCompatImageView imageView03,
      @NonNull AppCompatImageView imageView2,
      @NonNull RowDistinctAdvertismentBinding includeDistinctAdvertisment,
      @NonNull RowLatestAdsBinding includeLatestAds,
      @NonNull RowPropertiesNearYouBinding includePropertiesNearYou,
      @NonNull RowHousingAdsBinding includeRowHousingAds, @NonNull LinearLayoutCompat llSearchView,
      @NonNull AppCompatImageView mageView01, @NonNull AppCompatTextView textView05,
      @NonNull AppCompatTextView textView06, @NonNull AppCompatTextView textView07,
      @NonNull AppCompatTextView textView08, @NonNull AppCompatTextView textView09,
      @NonNull AppCompatTextView tvFeaturedAds, @NonNull AppCompatTextView tvHousingAds,
      @NonNull AppCompatTextView tvLatestAds, @NonNull AppCompatTextView tvPropertiesNearYou,
      @NonNull AppCompatTextView tvRent, @NonNull AppCompatTextView tvSale) {
    this.rootView = rootView;
    this.btnCommercialRealEstate = btnCommercialRealEstate;
    this.btnHouseVilla = btnHouseVilla;
    this.btnLandFarm = btnLandFarm;
    this.btnNext = btnNext;
    this.btnPartment = btnPartment;
    this.btnPostAdNow = btnPostAdNow;
    this.constraintLayout01 = constraintLayout01;
    this.etSearch = etSearch;
    this.imageView01 = imageView01;
    this.imageView03 = imageView03;
    this.imageView2 = imageView2;
    this.includeDistinctAdvertisment = includeDistinctAdvertisment;
    this.includeLatestAds = includeLatestAds;
    this.includePropertiesNearYou = includePropertiesNearYou;
    this.includeRowHousingAds = includeRowHousingAds;
    this.llSearchView = llSearchView;
    this.mageView01 = mageView01;
    this.textView05 = textView05;
    this.textView06 = textView06;
    this.textView07 = textView07;
    this.textView08 = textView08;
    this.textView09 = textView09;
    this.tvFeaturedAds = tvFeaturedAds;
    this.tvHousingAds = tvHousingAds;
    this.tvLatestAds = tvLatestAds;
    this.tvPropertiesNearYou = tvPropertiesNearYou;
    this.tvRent = tvRent;
    this.tvSale = tvSale;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_commercial_real_estate;
      AppCompatTextView btnCommercialRealEstate = rootView.findViewById(id);
      if (btnCommercialRealEstate == null) {
        break missingId;
      }

      id = R.id.btn_house_villa;
      AppCompatTextView btnHouseVilla = rootView.findViewById(id);
      if (btnHouseVilla == null) {
        break missingId;
      }

      id = R.id.btn_land_farm;
      AppCompatTextView btnLandFarm = rootView.findViewById(id);
      if (btnLandFarm == null) {
        break missingId;
      }

      id = R.id.btn_next;
      MaterialButton btnNext = rootView.findViewById(id);
      if (btnNext == null) {
        break missingId;
      }

      id = R.id.btn_partment;
      AppCompatTextView btnPartment = rootView.findViewById(id);
      if (btnPartment == null) {
        break missingId;
      }

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

      id = R.id.et_search;
      TextInputEditText etSearch = rootView.findViewById(id);
      if (etSearch == null) {
        break missingId;
      }

      id = R.id.imageView_01;
      AppCompatImageView imageView01 = rootView.findViewById(id);
      if (imageView01 == null) {
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

      id = R.id.include_distinct_advertisment;
      View includeDistinctAdvertisment = rootView.findViewById(id);
      if (includeDistinctAdvertisment == null) {
        break missingId;
      }
      RowDistinctAdvertismentBinding binding_includeDistinctAdvertisment = RowDistinctAdvertismentBinding.bind(includeDistinctAdvertisment);

      id = R.id.include_latest_ads;
      View includeLatestAds = rootView.findViewById(id);
      if (includeLatestAds == null) {
        break missingId;
      }
      RowLatestAdsBinding binding_includeLatestAds = RowLatestAdsBinding.bind(includeLatestAds);

      id = R.id.include_properties_near_you;
      View includePropertiesNearYou = rootView.findViewById(id);
      if (includePropertiesNearYou == null) {
        break missingId;
      }
      RowPropertiesNearYouBinding binding_includePropertiesNearYou = RowPropertiesNearYouBinding.bind(includePropertiesNearYou);

      id = R.id.include_row_housing_ads;
      View includeRowHousingAds = rootView.findViewById(id);
      if (includeRowHousingAds == null) {
        break missingId;
      }
      RowHousingAdsBinding binding_includeRowHousingAds = RowHousingAdsBinding.bind(includeRowHousingAds);

      id = R.id.ll_search_view;
      LinearLayoutCompat llSearchView = rootView.findViewById(id);
      if (llSearchView == null) {
        break missingId;
      }

      id = R.id.mageView_01;
      AppCompatImageView mageView01 = rootView.findViewById(id);
      if (mageView01 == null) {
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

      id = R.id.tv_featured_ads;
      AppCompatTextView tvFeaturedAds = rootView.findViewById(id);
      if (tvFeaturedAds == null) {
        break missingId;
      }

      id = R.id.tv_housing_ads;
      AppCompatTextView tvHousingAds = rootView.findViewById(id);
      if (tvHousingAds == null) {
        break missingId;
      }

      id = R.id.tv_latest_ads;
      AppCompatTextView tvLatestAds = rootView.findViewById(id);
      if (tvLatestAds == null) {
        break missingId;
      }

      id = R.id.tv_properties_near_you;
      AppCompatTextView tvPropertiesNearYou = rootView.findViewById(id);
      if (tvPropertiesNearYou == null) {
        break missingId;
      }

      id = R.id.tv_rent;
      AppCompatTextView tvRent = rootView.findViewById(id);
      if (tvRent == null) {
        break missingId;
      }

      id = R.id.tv_sale;
      AppCompatTextView tvSale = rootView.findViewById(id);
      if (tvSale == null) {
        break missingId;
      }

      return new FragmentHomeBinding((ConstraintLayout) rootView, btnCommercialRealEstate,
          btnHouseVilla, btnLandFarm, btnNext, btnPartment, btnPostAdNow, constraintLayout01,
          etSearch, imageView01, imageView03, imageView2, binding_includeDistinctAdvertisment,
          binding_includeLatestAds, binding_includePropertiesNearYou, binding_includeRowHousingAds,
          llSearchView, mageView01, textView05, textView06, textView07, textView08, textView09,
          tvFeaturedAds, tvHousingAds, tvLatestAds, tvPropertiesNearYou, tvRent, tvSale);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}