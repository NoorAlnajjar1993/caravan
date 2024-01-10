// Generated by view binder compiler. Do not edit!
package com.caravan.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager.widget.ViewPager;
import com.caravan.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.tabs.TabLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentEstateDetailsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MaterialButton btnPostAdNow;

  @NonNull
  public final ConstraintLayout constraintLayout01;

  @NonNull
  public final ConstraintLayout constraintLayout02;

  @NonNull
  public final ConstraintLayout constraintLayout03;

  @NonNull
  public final ConstraintLayout constraintLayout04;

  @NonNull
  public final FloatingActionButton fab;

  @NonNull
  public final FloatingActionButton fab2;

  @NonNull
  public final AppCompatImageView imageView01;

  @NonNull
  public final AppCompatImageView imageView03;

  @NonNull
  public final AppCompatImageView ivArrowLeft;

  @NonNull
  public final AppCompatImageView ivFavourites;

  @NonNull
  public final ShapeableImageView ivProfileImage;

  @NonNull
  public final AppCompatImageView ivSeen;

  @NonNull
  public final AppCompatImageView ivShare;

  @NonNull
  public final ProgressBar loading;

  @NonNull
  public final ImageView map;

  @NonNull
  public final MaterialCardView materialCardViewMap;

  @NonNull
  public final RecyclerView rvSimilarEstate;

  @NonNull
  public final TabLayout tabLayout;

  @NonNull
  public final AppCompatTextView textView02;

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
  public final AppCompatTextView tvApproximateLocation;

  @NonNull
  public final AppCompatTextView tvArea;

  @NonNull
  public final AppCompatTextView tvBuildingArea;

  @NonNull
  public final AppCompatTextView tvBuildingAreaTitle;

  @NonNull
  public final AppCompatTextView tvConstructionAge;

  @NonNull
  public final AppCompatTextView tvConstructionAgeTitle;

  @NonNull
  public final AppCompatTextView tvDate;

  @NonNull
  public final AppCompatTextView tvDescription;

  @NonNull
  public final AppCompatTextView tvDescriptionTitle;

  @NonNull
  public final AppCompatTextView tvEstateDetails;

  @NonNull
  public final AppCompatTextView tvFloor;

  @NonNull
  public final AppCompatTextView tvFloorTitle;

  @NonNull
  public final AppCompatTextView tvFurnished;

  @NonNull
  public final AppCompatTextView tvFurnishedTitle;

  @NonNull
  public final AppCompatTextView tvGardenSpace;

  @NonNull
  public final AppCompatTextView tvGardenSpaceTitle;

  @NonNull
  public final AppCompatTextView tvHaveRoof;

  @NonNull
  public final AppCompatTextView tvHaveRoofTitle;

  @NonNull
  public final AppCompatTextView tvInstallmentsAvailable;

  @NonNull
  public final AppCompatTextView tvInstallmentsAvailableTitle;

  @NonNull
  public final AppCompatTextView tvItHasGarden;

  @NonNull
  public final AppCompatTextView tvItHasGardenTitle;

  @NonNull
  public final AppCompatTextView tvLocation;

  @NonNull
  public final AppCompatTextView tvName;

  @NonNull
  public final AppCompatTextView tvNumberApartmentsBuilding;

  @NonNull
  public final AppCompatTextView tvNumberApartmentsBuildingTitle;

  @NonNull
  public final AppCompatTextView tvNumberBathrooms;

  @NonNull
  public final AppCompatTextView tvNumberBathroomsTitle;

  @NonNull
  public final AppCompatTextView tvNumberBedrooms;

  @NonNull
  public final AppCompatTextView tvNumberBedroomsTitle;

  @NonNull
  public final AppCompatTextView tvNumberOfAds;

  @NonNull
  public final AppCompatTextView tvOwner;

  @NonNull
  public final AppCompatTextView tvOwnerTitle;

  @NonNull
  public final AppCompatTextView tvPrice;

  @NonNull
  public final AppCompatTextView tvPropertyCondition;

  @NonNull
  public final AppCompatTextView tvPropertyConditionTitle;

  @NonNull
  public final AppCompatTextView tvPropertyLocationTitle;

  @NonNull
  public final AppCompatTextView tvRoofSpace;

  @NonNull
  public final AppCompatTextView tvRoofSpaceTitle;

  @NonNull
  public final AppCompatTextView tvSaleOrRent;

  @NonNull
  public final AppCompatTextView tvSaleOrRentTitle;

  @NonNull
  public final AppCompatTextView tvSeen;

  @NonNull
  public final AppCompatTextView tvShare;

  @NonNull
  public final AppCompatTextView tvSimilarProperties;

  @NonNull
  public final AppCompatTextView tvToCommunicateTitle;

  @NonNull
  public final AppCompatTextView tvUserName;

  @NonNull
  public final AppCompatTextView tvUserOwner;

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

  @NonNull
  public final View view06;

  @NonNull
  public final View view07;

  @NonNull
  public final View view08;

  @NonNull
  public final View view09;

  @NonNull
  public final View view10;

  @NonNull
  public final View view11;

  @NonNull
  public final View view12;

  @NonNull
  public final View view13;

  @NonNull
  public final View view14;

  @NonNull
  public final ViewPager viewPager;

  private FragmentEstateDetailsBinding(@NonNull ConstraintLayout rootView,
      @NonNull MaterialButton btnPostAdNow, @NonNull ConstraintLayout constraintLayout01,
      @NonNull ConstraintLayout constraintLayout02, @NonNull ConstraintLayout constraintLayout03,
      @NonNull ConstraintLayout constraintLayout04, @NonNull FloatingActionButton fab,
      @NonNull FloatingActionButton fab2, @NonNull AppCompatImageView imageView01,
      @NonNull AppCompatImageView imageView03, @NonNull AppCompatImageView ivArrowLeft,
      @NonNull AppCompatImageView ivFavourites, @NonNull ShapeableImageView ivProfileImage,
      @NonNull AppCompatImageView ivSeen, @NonNull AppCompatImageView ivShare,
      @NonNull ProgressBar loading, @NonNull ImageView map,
      @NonNull MaterialCardView materialCardViewMap, @NonNull RecyclerView rvSimilarEstate,
      @NonNull TabLayout tabLayout, @NonNull AppCompatTextView textView02,
      @NonNull AppCompatTextView textView05, @NonNull AppCompatTextView textView06,
      @NonNull AppCompatTextView textView07, @NonNull AppCompatTextView textView08,
      @NonNull AppCompatTextView textView09, @NonNull AppCompatTextView tvApproximateLocation,
      @NonNull AppCompatTextView tvArea, @NonNull AppCompatTextView tvBuildingArea,
      @NonNull AppCompatTextView tvBuildingAreaTitle, @NonNull AppCompatTextView tvConstructionAge,
      @NonNull AppCompatTextView tvConstructionAgeTitle, @NonNull AppCompatTextView tvDate,
      @NonNull AppCompatTextView tvDescription, @NonNull AppCompatTextView tvDescriptionTitle,
      @NonNull AppCompatTextView tvEstateDetails, @NonNull AppCompatTextView tvFloor,
      @NonNull AppCompatTextView tvFloorTitle, @NonNull AppCompatTextView tvFurnished,
      @NonNull AppCompatTextView tvFurnishedTitle, @NonNull AppCompatTextView tvGardenSpace,
      @NonNull AppCompatTextView tvGardenSpaceTitle, @NonNull AppCompatTextView tvHaveRoof,
      @NonNull AppCompatTextView tvHaveRoofTitle,
      @NonNull AppCompatTextView tvInstallmentsAvailable,
      @NonNull AppCompatTextView tvInstallmentsAvailableTitle,
      @NonNull AppCompatTextView tvItHasGarden, @NonNull AppCompatTextView tvItHasGardenTitle,
      @NonNull AppCompatTextView tvLocation, @NonNull AppCompatTextView tvName,
      @NonNull AppCompatTextView tvNumberApartmentsBuilding,
      @NonNull AppCompatTextView tvNumberApartmentsBuildingTitle,
      @NonNull AppCompatTextView tvNumberBathrooms,
      @NonNull AppCompatTextView tvNumberBathroomsTitle,
      @NonNull AppCompatTextView tvNumberBedrooms, @NonNull AppCompatTextView tvNumberBedroomsTitle,
      @NonNull AppCompatTextView tvNumberOfAds, @NonNull AppCompatTextView tvOwner,
      @NonNull AppCompatTextView tvOwnerTitle, @NonNull AppCompatTextView tvPrice,
      @NonNull AppCompatTextView tvPropertyCondition,
      @NonNull AppCompatTextView tvPropertyConditionTitle,
      @NonNull AppCompatTextView tvPropertyLocationTitle, @NonNull AppCompatTextView tvRoofSpace,
      @NonNull AppCompatTextView tvRoofSpaceTitle, @NonNull AppCompatTextView tvSaleOrRent,
      @NonNull AppCompatTextView tvSaleOrRentTitle, @NonNull AppCompatTextView tvSeen,
      @NonNull AppCompatTextView tvShare, @NonNull AppCompatTextView tvSimilarProperties,
      @NonNull AppCompatTextView tvToCommunicateTitle, @NonNull AppCompatTextView tvUserName,
      @NonNull AppCompatTextView tvUserOwner, @NonNull View view01, @NonNull View view02,
      @NonNull View view03, @NonNull View view04, @NonNull View view05, @NonNull View view06,
      @NonNull View view07, @NonNull View view08, @NonNull View view09, @NonNull View view10,
      @NonNull View view11, @NonNull View view12, @NonNull View view13, @NonNull View view14,
      @NonNull ViewPager viewPager) {
    this.rootView = rootView;
    this.btnPostAdNow = btnPostAdNow;
    this.constraintLayout01 = constraintLayout01;
    this.constraintLayout02 = constraintLayout02;
    this.constraintLayout03 = constraintLayout03;
    this.constraintLayout04 = constraintLayout04;
    this.fab = fab;
    this.fab2 = fab2;
    this.imageView01 = imageView01;
    this.imageView03 = imageView03;
    this.ivArrowLeft = ivArrowLeft;
    this.ivFavourites = ivFavourites;
    this.ivProfileImage = ivProfileImage;
    this.ivSeen = ivSeen;
    this.ivShare = ivShare;
    this.loading = loading;
    this.map = map;
    this.materialCardViewMap = materialCardViewMap;
    this.rvSimilarEstate = rvSimilarEstate;
    this.tabLayout = tabLayout;
    this.textView02 = textView02;
    this.textView05 = textView05;
    this.textView06 = textView06;
    this.textView07 = textView07;
    this.textView08 = textView08;
    this.textView09 = textView09;
    this.tvApproximateLocation = tvApproximateLocation;
    this.tvArea = tvArea;
    this.tvBuildingArea = tvBuildingArea;
    this.tvBuildingAreaTitle = tvBuildingAreaTitle;
    this.tvConstructionAge = tvConstructionAge;
    this.tvConstructionAgeTitle = tvConstructionAgeTitle;
    this.tvDate = tvDate;
    this.tvDescription = tvDescription;
    this.tvDescriptionTitle = tvDescriptionTitle;
    this.tvEstateDetails = tvEstateDetails;
    this.tvFloor = tvFloor;
    this.tvFloorTitle = tvFloorTitle;
    this.tvFurnished = tvFurnished;
    this.tvFurnishedTitle = tvFurnishedTitle;
    this.tvGardenSpace = tvGardenSpace;
    this.tvGardenSpaceTitle = tvGardenSpaceTitle;
    this.tvHaveRoof = tvHaveRoof;
    this.tvHaveRoofTitle = tvHaveRoofTitle;
    this.tvInstallmentsAvailable = tvInstallmentsAvailable;
    this.tvInstallmentsAvailableTitle = tvInstallmentsAvailableTitle;
    this.tvItHasGarden = tvItHasGarden;
    this.tvItHasGardenTitle = tvItHasGardenTitle;
    this.tvLocation = tvLocation;
    this.tvName = tvName;
    this.tvNumberApartmentsBuilding = tvNumberApartmentsBuilding;
    this.tvNumberApartmentsBuildingTitle = tvNumberApartmentsBuildingTitle;
    this.tvNumberBathrooms = tvNumberBathrooms;
    this.tvNumberBathroomsTitle = tvNumberBathroomsTitle;
    this.tvNumberBedrooms = tvNumberBedrooms;
    this.tvNumberBedroomsTitle = tvNumberBedroomsTitle;
    this.tvNumberOfAds = tvNumberOfAds;
    this.tvOwner = tvOwner;
    this.tvOwnerTitle = tvOwnerTitle;
    this.tvPrice = tvPrice;
    this.tvPropertyCondition = tvPropertyCondition;
    this.tvPropertyConditionTitle = tvPropertyConditionTitle;
    this.tvPropertyLocationTitle = tvPropertyLocationTitle;
    this.tvRoofSpace = tvRoofSpace;
    this.tvRoofSpaceTitle = tvRoofSpaceTitle;
    this.tvSaleOrRent = tvSaleOrRent;
    this.tvSaleOrRentTitle = tvSaleOrRentTitle;
    this.tvSeen = tvSeen;
    this.tvShare = tvShare;
    this.tvSimilarProperties = tvSimilarProperties;
    this.tvToCommunicateTitle = tvToCommunicateTitle;
    this.tvUserName = tvUserName;
    this.tvUserOwner = tvUserOwner;
    this.view01 = view01;
    this.view02 = view02;
    this.view03 = view03;
    this.view04 = view04;
    this.view05 = view05;
    this.view06 = view06;
    this.view07 = view07;
    this.view08 = view08;
    this.view09 = view09;
    this.view10 = view10;
    this.view11 = view11;
    this.view12 = view12;
    this.view13 = view13;
    this.view14 = view14;
    this.viewPager = viewPager;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentEstateDetailsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentEstateDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_estate_details, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentEstateDetailsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_Post_ad_now;
      MaterialButton btnPostAdNow = rootView.findViewById(id);
      if (btnPostAdNow == null) {
        break missingId;
      }

      ConstraintLayout constraintLayout01 = (ConstraintLayout) rootView;

      id = R.id.constraintLayout_02;
      ConstraintLayout constraintLayout02 = rootView.findViewById(id);
      if (constraintLayout02 == null) {
        break missingId;
      }

      id = R.id.constraintLayout_03;
      ConstraintLayout constraintLayout03 = rootView.findViewById(id);
      if (constraintLayout03 == null) {
        break missingId;
      }

      id = R.id.constraintLayout_04;
      ConstraintLayout constraintLayout04 = rootView.findViewById(id);
      if (constraintLayout04 == null) {
        break missingId;
      }

      id = R.id.fab;
      FloatingActionButton fab = rootView.findViewById(id);
      if (fab == null) {
        break missingId;
      }

      id = R.id.fab_2;
      FloatingActionButton fab2 = rootView.findViewById(id);
      if (fab2 == null) {
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

      id = R.id.iv_arrow_left;
      AppCompatImageView ivArrowLeft = rootView.findViewById(id);
      if (ivArrowLeft == null) {
        break missingId;
      }

      id = R.id.iv_favourites;
      AppCompatImageView ivFavourites = rootView.findViewById(id);
      if (ivFavourites == null) {
        break missingId;
      }

      id = R.id.iv_profile_image;
      ShapeableImageView ivProfileImage = rootView.findViewById(id);
      if (ivProfileImage == null) {
        break missingId;
      }

      id = R.id.iv_seen;
      AppCompatImageView ivSeen = rootView.findViewById(id);
      if (ivSeen == null) {
        break missingId;
      }

      id = R.id.iv_share;
      AppCompatImageView ivShare = rootView.findViewById(id);
      if (ivShare == null) {
        break missingId;
      }

      id = R.id.loading;
      ProgressBar loading = rootView.findViewById(id);
      if (loading == null) {
        break missingId;
      }

      id = R.id.map;
      ImageView map = rootView.findViewById(id);
      if (map == null) {
        break missingId;
      }

      id = R.id.materialCardViewMap;
      MaterialCardView materialCardViewMap = rootView.findViewById(id);
      if (materialCardViewMap == null) {
        break missingId;
      }

      id = R.id.rvSimilarEstate;
      RecyclerView rvSimilarEstate = rootView.findViewById(id);
      if (rvSimilarEstate == null) {
        break missingId;
      }

      id = R.id.tabLayout;
      TabLayout tabLayout = rootView.findViewById(id);
      if (tabLayout == null) {
        break missingId;
      }

      id = R.id.textView_02;
      AppCompatTextView textView02 = rootView.findViewById(id);
      if (textView02 == null) {
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

      id = R.id.tv_approximate_location;
      AppCompatTextView tvApproximateLocation = rootView.findViewById(id);
      if (tvApproximateLocation == null) {
        break missingId;
      }

      id = R.id.tv_area;
      AppCompatTextView tvArea = rootView.findViewById(id);
      if (tvArea == null) {
        break missingId;
      }

      id = R.id.tv_building_area;
      AppCompatTextView tvBuildingArea = rootView.findViewById(id);
      if (tvBuildingArea == null) {
        break missingId;
      }

      id = R.id.tv_building_area_title;
      AppCompatTextView tvBuildingAreaTitle = rootView.findViewById(id);
      if (tvBuildingAreaTitle == null) {
        break missingId;
      }

      id = R.id.tv_construction_age;
      AppCompatTextView tvConstructionAge = rootView.findViewById(id);
      if (tvConstructionAge == null) {
        break missingId;
      }

      id = R.id.tv_construction_age_title;
      AppCompatTextView tvConstructionAgeTitle = rootView.findViewById(id);
      if (tvConstructionAgeTitle == null) {
        break missingId;
      }

      id = R.id.tv_date;
      AppCompatTextView tvDate = rootView.findViewById(id);
      if (tvDate == null) {
        break missingId;
      }

      id = R.id.tv_description;
      AppCompatTextView tvDescription = rootView.findViewById(id);
      if (tvDescription == null) {
        break missingId;
      }

      id = R.id.tv_description_title;
      AppCompatTextView tvDescriptionTitle = rootView.findViewById(id);
      if (tvDescriptionTitle == null) {
        break missingId;
      }

      id = R.id.tv_estate_details;
      AppCompatTextView tvEstateDetails = rootView.findViewById(id);
      if (tvEstateDetails == null) {
        break missingId;
      }

      id = R.id.tv_floor;
      AppCompatTextView tvFloor = rootView.findViewById(id);
      if (tvFloor == null) {
        break missingId;
      }

      id = R.id.tv_floor_title;
      AppCompatTextView tvFloorTitle = rootView.findViewById(id);
      if (tvFloorTitle == null) {
        break missingId;
      }

      id = R.id.tv_furnished;
      AppCompatTextView tvFurnished = rootView.findViewById(id);
      if (tvFurnished == null) {
        break missingId;
      }

      id = R.id.tv_furnished_title;
      AppCompatTextView tvFurnishedTitle = rootView.findViewById(id);
      if (tvFurnishedTitle == null) {
        break missingId;
      }

      id = R.id.tv_garden_space;
      AppCompatTextView tvGardenSpace = rootView.findViewById(id);
      if (tvGardenSpace == null) {
        break missingId;
      }

      id = R.id.tv_garden_space_title;
      AppCompatTextView tvGardenSpaceTitle = rootView.findViewById(id);
      if (tvGardenSpaceTitle == null) {
        break missingId;
      }

      id = R.id.tv_have_roof;
      AppCompatTextView tvHaveRoof = rootView.findViewById(id);
      if (tvHaveRoof == null) {
        break missingId;
      }

      id = R.id.tv_have_roof_title;
      AppCompatTextView tvHaveRoofTitle = rootView.findViewById(id);
      if (tvHaveRoofTitle == null) {
        break missingId;
      }

      id = R.id.tv_installments_available;
      AppCompatTextView tvInstallmentsAvailable = rootView.findViewById(id);
      if (tvInstallmentsAvailable == null) {
        break missingId;
      }

      id = R.id.tv_installments_available_title;
      AppCompatTextView tvInstallmentsAvailableTitle = rootView.findViewById(id);
      if (tvInstallmentsAvailableTitle == null) {
        break missingId;
      }

      id = R.id.tv_it_has_garden;
      AppCompatTextView tvItHasGarden = rootView.findViewById(id);
      if (tvItHasGarden == null) {
        break missingId;
      }

      id = R.id.tv_it_has_garden_title;
      AppCompatTextView tvItHasGardenTitle = rootView.findViewById(id);
      if (tvItHasGardenTitle == null) {
        break missingId;
      }

      id = R.id.tv_location;
      AppCompatTextView tvLocation = rootView.findViewById(id);
      if (tvLocation == null) {
        break missingId;
      }

      id = R.id.tv_name;
      AppCompatTextView tvName = rootView.findViewById(id);
      if (tvName == null) {
        break missingId;
      }

      id = R.id.tv_number_apartments_building;
      AppCompatTextView tvNumberApartmentsBuilding = rootView.findViewById(id);
      if (tvNumberApartmentsBuilding == null) {
        break missingId;
      }

      id = R.id.tv_number_apartments_building_title;
      AppCompatTextView tvNumberApartmentsBuildingTitle = rootView.findViewById(id);
      if (tvNumberApartmentsBuildingTitle == null) {
        break missingId;
      }

      id = R.id.tv_number_bathrooms;
      AppCompatTextView tvNumberBathrooms = rootView.findViewById(id);
      if (tvNumberBathrooms == null) {
        break missingId;
      }

      id = R.id.tv_number_bathrooms_title;
      AppCompatTextView tvNumberBathroomsTitle = rootView.findViewById(id);
      if (tvNumberBathroomsTitle == null) {
        break missingId;
      }

      id = R.id.tv_number_bedrooms;
      AppCompatTextView tvNumberBedrooms = rootView.findViewById(id);
      if (tvNumberBedrooms == null) {
        break missingId;
      }

      id = R.id.tv_number_bedrooms_title;
      AppCompatTextView tvNumberBedroomsTitle = rootView.findViewById(id);
      if (tvNumberBedroomsTitle == null) {
        break missingId;
      }

      id = R.id.tv_number_of_ads;
      AppCompatTextView tvNumberOfAds = rootView.findViewById(id);
      if (tvNumberOfAds == null) {
        break missingId;
      }

      id = R.id.tv_owner;
      AppCompatTextView tvOwner = rootView.findViewById(id);
      if (tvOwner == null) {
        break missingId;
      }

      id = R.id.tv_owner_title;
      AppCompatTextView tvOwnerTitle = rootView.findViewById(id);
      if (tvOwnerTitle == null) {
        break missingId;
      }

      id = R.id.tv_price;
      AppCompatTextView tvPrice = rootView.findViewById(id);
      if (tvPrice == null) {
        break missingId;
      }

      id = R.id.tv_property_condition;
      AppCompatTextView tvPropertyCondition = rootView.findViewById(id);
      if (tvPropertyCondition == null) {
        break missingId;
      }

      id = R.id.tv_property_condition_title;
      AppCompatTextView tvPropertyConditionTitle = rootView.findViewById(id);
      if (tvPropertyConditionTitle == null) {
        break missingId;
      }

      id = R.id.tv_property_location_title;
      AppCompatTextView tvPropertyLocationTitle = rootView.findViewById(id);
      if (tvPropertyLocationTitle == null) {
        break missingId;
      }

      id = R.id.tv_roof_space;
      AppCompatTextView tvRoofSpace = rootView.findViewById(id);
      if (tvRoofSpace == null) {
        break missingId;
      }

      id = R.id.tv_roof_space_title;
      AppCompatTextView tvRoofSpaceTitle = rootView.findViewById(id);
      if (tvRoofSpaceTitle == null) {
        break missingId;
      }

      id = R.id.tv_sale_or_rent;
      AppCompatTextView tvSaleOrRent = rootView.findViewById(id);
      if (tvSaleOrRent == null) {
        break missingId;
      }

      id = R.id.tv_sale_or_rent_title;
      AppCompatTextView tvSaleOrRentTitle = rootView.findViewById(id);
      if (tvSaleOrRentTitle == null) {
        break missingId;
      }

      id = R.id.tv_seen;
      AppCompatTextView tvSeen = rootView.findViewById(id);
      if (tvSeen == null) {
        break missingId;
      }

      id = R.id.tv_share;
      AppCompatTextView tvShare = rootView.findViewById(id);
      if (tvShare == null) {
        break missingId;
      }

      id = R.id.tv_similar_properties;
      AppCompatTextView tvSimilarProperties = rootView.findViewById(id);
      if (tvSimilarProperties == null) {
        break missingId;
      }

      id = R.id.tv_to_communicate_title;
      AppCompatTextView tvToCommunicateTitle = rootView.findViewById(id);
      if (tvToCommunicateTitle == null) {
        break missingId;
      }

      id = R.id.tv_user_name;
      AppCompatTextView tvUserName = rootView.findViewById(id);
      if (tvUserName == null) {
        break missingId;
      }

      id = R.id.tv_user_owner;
      AppCompatTextView tvUserOwner = rootView.findViewById(id);
      if (tvUserOwner == null) {
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

      id = R.id.view_06;
      View view06 = rootView.findViewById(id);
      if (view06 == null) {
        break missingId;
      }

      id = R.id.view_07;
      View view07 = rootView.findViewById(id);
      if (view07 == null) {
        break missingId;
      }

      id = R.id.view_08;
      View view08 = rootView.findViewById(id);
      if (view08 == null) {
        break missingId;
      }

      id = R.id.view_09;
      View view09 = rootView.findViewById(id);
      if (view09 == null) {
        break missingId;
      }

      id = R.id.view_10;
      View view10 = rootView.findViewById(id);
      if (view10 == null) {
        break missingId;
      }

      id = R.id.view_11;
      View view11 = rootView.findViewById(id);
      if (view11 == null) {
        break missingId;
      }

      id = R.id.view_12;
      View view12 = rootView.findViewById(id);
      if (view12 == null) {
        break missingId;
      }

      id = R.id.view_13;
      View view13 = rootView.findViewById(id);
      if (view13 == null) {
        break missingId;
      }

      id = R.id.view_14;
      View view14 = rootView.findViewById(id);
      if (view14 == null) {
        break missingId;
      }

      id = R.id.view_pager;
      ViewPager viewPager = rootView.findViewById(id);
      if (viewPager == null) {
        break missingId;
      }

      return new FragmentEstateDetailsBinding((ConstraintLayout) rootView, btnPostAdNow,
          constraintLayout01, constraintLayout02, constraintLayout03, constraintLayout04, fab, fab2,
          imageView01, imageView03, ivArrowLeft, ivFavourites, ivProfileImage, ivSeen, ivShare,
          loading, map, materialCardViewMap, rvSimilarEstate, tabLayout, textView02, textView05,
          textView06, textView07, textView08, textView09, tvApproximateLocation, tvArea,
          tvBuildingArea, tvBuildingAreaTitle, tvConstructionAge, tvConstructionAgeTitle, tvDate,
          tvDescription, tvDescriptionTitle, tvEstateDetails, tvFloor, tvFloorTitle, tvFurnished,
          tvFurnishedTitle, tvGardenSpace, tvGardenSpaceTitle, tvHaveRoof, tvHaveRoofTitle,
          tvInstallmentsAvailable, tvInstallmentsAvailableTitle, tvItHasGarden, tvItHasGardenTitle,
          tvLocation, tvName, tvNumberApartmentsBuilding, tvNumberApartmentsBuildingTitle,
          tvNumberBathrooms, tvNumberBathroomsTitle, tvNumberBedrooms, tvNumberBedroomsTitle,
          tvNumberOfAds, tvOwner, tvOwnerTitle, tvPrice, tvPropertyCondition,
          tvPropertyConditionTitle, tvPropertyLocationTitle, tvRoofSpace, tvRoofSpaceTitle,
          tvSaleOrRent, tvSaleOrRentTitle, tvSeen, tvShare, tvSimilarProperties,
          tvToCommunicateTitle, tvUserName, tvUserOwner, view01, view02, view03, view04, view05,
          view06, view07, view08, view09, view10, view11, view12, view13, view14, viewPager);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}