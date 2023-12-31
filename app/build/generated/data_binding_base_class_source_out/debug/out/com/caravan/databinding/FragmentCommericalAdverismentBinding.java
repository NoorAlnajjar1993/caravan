// Generated by view binder compiler. Do not edit!
package com.caravan.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.caravan.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentCommericalAdverismentBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatAutoCompleteTextView actvFloor;

  @NonNull
  public final AppCompatAutoCompleteTextView actvNumberBathrooms;

  @NonNull
  public final AppCompatAutoCompleteTextView actvNumberBedrooms;

  @NonNull
  public final MaterialButton btnNext;

  @NonNull
  public final TextInputEditText etAgeConstructionYears;

  @NonNull
  public final TextInputEditText etBuildingAreaTitle;

  @NonNull
  public final TextInputEditText etGearAreaSquareMetres;

  @NonNull
  public final TextInputEditText etLandArea;

  @NonNull
  public final TextInputEditText etNumberFloorsBuilding;

  @NonNull
  public final TextInputEditText etRoofAreaSquareMetres;

  @NonNull
  public final TextInputEditText etTotalNumberApartmentsBuilding;

  @NonNull
  public final TextInputEditText etYearConstruction;

  @NonNull
  public final AppCompatImageView ivBack;

  @NonNull
  public final AppCompatRadioButton radio1;

  @NonNull
  public final AppCompatRadioButton radio2;

  @NonNull
  public final RadioGroup radioGroupApartmentCondition;

  @NonNull
  public final RadioGroup radioGroupFurnished;

  @NonNull
  public final RadioGroup radioGroupResidentialBuilding;

  @NonNull
  public final RadioGroup radioGroupWithGardenGear;

  @NonNull
  public final RadioGroup radioGroupWithRoof;

  @NonNull
  public final AppCompatRadioButton radioNo;

  @NonNull
  public final AppCompatRadioButton radioNoResidentialBuilding;

  @NonNull
  public final AppCompatRadioButton radioNoWithGardenGear;

  @NonNull
  public final AppCompatRadioButton radioNoWithRoof;

  @NonNull
  public final AppCompatRadioButton radioYes;

  @NonNull
  public final AppCompatRadioButton radioYesResidentialBuilding;

  @NonNull
  public final AppCompatRadioButton radioYesWithGardenGear;

  @NonNull
  public final AppCompatRadioButton radioYesWithRoof;

  @NonNull
  public final RecyclerView rvDetermineApartmentsFeatures;

  @NonNull
  public final TextInputLayout tilFloor;

  @NonNull
  public final TextInputLayout tilNumberBathrooms;

  @NonNull
  public final TextInputLayout tilNumberBedrooms;

  @NonNull
  public final TextInputLayout tlAgeConstructionYears;

  @NonNull
  public final TextInputLayout tlBuildingAreaTitle;

  @NonNull
  public final TextInputLayout tlGearAreaSquareMetres;

  @NonNull
  public final TextInputLayout tlLandArea;

  @NonNull
  public final TextInputLayout tlNumberFloorsBuilding;

  @NonNull
  public final TextInputLayout tlRoofAreaSquareMetres;

  @NonNull
  public final TextInputLayout tlTotalNumberApartmentsBuilding;

  @NonNull
  public final TextInputLayout tlYearConstruction;

  @NonNull
  public final AppCompatTextView tvAgeConstructionYears;

  @NonNull
  public final AppCompatTextView tvApartmentCondition;

  @NonNull
  public final AppCompatTextView tvBuildingArea;

  @NonNull
  public final AppCompatTextView tvDetermineApartmentsFeatures;

  @NonNull
  public final AppCompatTextView tvFloor;

  @NonNull
  public final AppCompatTextView tvFurnished;

  @NonNull
  public final AppCompatTextView tvGearAreaSquareMetres;

  @NonNull
  public final AppCompatTextView tvLandArea;

  @NonNull
  public final AppCompatTextView tvNumberBathrooms;

  @NonNull
  public final AppCompatTextView tvNumberBedrooms;

  @NonNull
  public final AppCompatTextView tvNumberFloorsBuilding;

  @NonNull
  public final AppCompatTextView tvRoofAreaSquareMetres;

  @NonNull
  public final AppCompatTextView tvTotalNumberApartmentsBuilding;

  @NonNull
  public final AppCompatTextView tvWithGardenGear;

  @NonNull
  public final AppCompatTextView tvWithRoof;

  @NonNull
  public final AppCompatTextView tvYearConstruction;

  private FragmentCommericalAdverismentBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppCompatAutoCompleteTextView actvFloor,
      @NonNull AppCompatAutoCompleteTextView actvNumberBathrooms,
      @NonNull AppCompatAutoCompleteTextView actvNumberBedrooms, @NonNull MaterialButton btnNext,
      @NonNull TextInputEditText etAgeConstructionYears,
      @NonNull TextInputEditText etBuildingAreaTitle,
      @NonNull TextInputEditText etGearAreaSquareMetres, @NonNull TextInputEditText etLandArea,
      @NonNull TextInputEditText etNumberFloorsBuilding,
      @NonNull TextInputEditText etRoofAreaSquareMetres,
      @NonNull TextInputEditText etTotalNumberApartmentsBuilding,
      @NonNull TextInputEditText etYearConstruction, @NonNull AppCompatImageView ivBack,
      @NonNull AppCompatRadioButton radio1, @NonNull AppCompatRadioButton radio2,
      @NonNull RadioGroup radioGroupApartmentCondition, @NonNull RadioGroup radioGroupFurnished,
      @NonNull RadioGroup radioGroupResidentialBuilding,
      @NonNull RadioGroup radioGroupWithGardenGear, @NonNull RadioGroup radioGroupWithRoof,
      @NonNull AppCompatRadioButton radioNo,
      @NonNull AppCompatRadioButton radioNoResidentialBuilding,
      @NonNull AppCompatRadioButton radioNoWithGardenGear,
      @NonNull AppCompatRadioButton radioNoWithRoof, @NonNull AppCompatRadioButton radioYes,
      @NonNull AppCompatRadioButton radioYesResidentialBuilding,
      @NonNull AppCompatRadioButton radioYesWithGardenGear,
      @NonNull AppCompatRadioButton radioYesWithRoof,
      @NonNull RecyclerView rvDetermineApartmentsFeatures, @NonNull TextInputLayout tilFloor,
      @NonNull TextInputLayout tilNumberBathrooms, @NonNull TextInputLayout tilNumberBedrooms,
      @NonNull TextInputLayout tlAgeConstructionYears, @NonNull TextInputLayout tlBuildingAreaTitle,
      @NonNull TextInputLayout tlGearAreaSquareMetres, @NonNull TextInputLayout tlLandArea,
      @NonNull TextInputLayout tlNumberFloorsBuilding,
      @NonNull TextInputLayout tlRoofAreaSquareMetres,
      @NonNull TextInputLayout tlTotalNumberApartmentsBuilding,
      @NonNull TextInputLayout tlYearConstruction,
      @NonNull AppCompatTextView tvAgeConstructionYears,
      @NonNull AppCompatTextView tvApartmentCondition, @NonNull AppCompatTextView tvBuildingArea,
      @NonNull AppCompatTextView tvDetermineApartmentsFeatures, @NonNull AppCompatTextView tvFloor,
      @NonNull AppCompatTextView tvFurnished, @NonNull AppCompatTextView tvGearAreaSquareMetres,
      @NonNull AppCompatTextView tvLandArea, @NonNull AppCompatTextView tvNumberBathrooms,
      @NonNull AppCompatTextView tvNumberBedrooms,
      @NonNull AppCompatTextView tvNumberFloorsBuilding,
      @NonNull AppCompatTextView tvRoofAreaSquareMetres,
      @NonNull AppCompatTextView tvTotalNumberApartmentsBuilding,
      @NonNull AppCompatTextView tvWithGardenGear, @NonNull AppCompatTextView tvWithRoof,
      @NonNull AppCompatTextView tvYearConstruction) {
    this.rootView = rootView;
    this.actvFloor = actvFloor;
    this.actvNumberBathrooms = actvNumberBathrooms;
    this.actvNumberBedrooms = actvNumberBedrooms;
    this.btnNext = btnNext;
    this.etAgeConstructionYears = etAgeConstructionYears;
    this.etBuildingAreaTitle = etBuildingAreaTitle;
    this.etGearAreaSquareMetres = etGearAreaSquareMetres;
    this.etLandArea = etLandArea;
    this.etNumberFloorsBuilding = etNumberFloorsBuilding;
    this.etRoofAreaSquareMetres = etRoofAreaSquareMetres;
    this.etTotalNumberApartmentsBuilding = etTotalNumberApartmentsBuilding;
    this.etYearConstruction = etYearConstruction;
    this.ivBack = ivBack;
    this.radio1 = radio1;
    this.radio2 = radio2;
    this.radioGroupApartmentCondition = radioGroupApartmentCondition;
    this.radioGroupFurnished = radioGroupFurnished;
    this.radioGroupResidentialBuilding = radioGroupResidentialBuilding;
    this.radioGroupWithGardenGear = radioGroupWithGardenGear;
    this.radioGroupWithRoof = radioGroupWithRoof;
    this.radioNo = radioNo;
    this.radioNoResidentialBuilding = radioNoResidentialBuilding;
    this.radioNoWithGardenGear = radioNoWithGardenGear;
    this.radioNoWithRoof = radioNoWithRoof;
    this.radioYes = radioYes;
    this.radioYesResidentialBuilding = radioYesResidentialBuilding;
    this.radioYesWithGardenGear = radioYesWithGardenGear;
    this.radioYesWithRoof = radioYesWithRoof;
    this.rvDetermineApartmentsFeatures = rvDetermineApartmentsFeatures;
    this.tilFloor = tilFloor;
    this.tilNumberBathrooms = tilNumberBathrooms;
    this.tilNumberBedrooms = tilNumberBedrooms;
    this.tlAgeConstructionYears = tlAgeConstructionYears;
    this.tlBuildingAreaTitle = tlBuildingAreaTitle;
    this.tlGearAreaSquareMetres = tlGearAreaSquareMetres;
    this.tlLandArea = tlLandArea;
    this.tlNumberFloorsBuilding = tlNumberFloorsBuilding;
    this.tlRoofAreaSquareMetres = tlRoofAreaSquareMetres;
    this.tlTotalNumberApartmentsBuilding = tlTotalNumberApartmentsBuilding;
    this.tlYearConstruction = tlYearConstruction;
    this.tvAgeConstructionYears = tvAgeConstructionYears;
    this.tvApartmentCondition = tvApartmentCondition;
    this.tvBuildingArea = tvBuildingArea;
    this.tvDetermineApartmentsFeatures = tvDetermineApartmentsFeatures;
    this.tvFloor = tvFloor;
    this.tvFurnished = tvFurnished;
    this.tvGearAreaSquareMetres = tvGearAreaSquareMetres;
    this.tvLandArea = tvLandArea;
    this.tvNumberBathrooms = tvNumberBathrooms;
    this.tvNumberBedrooms = tvNumberBedrooms;
    this.tvNumberFloorsBuilding = tvNumberFloorsBuilding;
    this.tvRoofAreaSquareMetres = tvRoofAreaSquareMetres;
    this.tvTotalNumberApartmentsBuilding = tvTotalNumberApartmentsBuilding;
    this.tvWithGardenGear = tvWithGardenGear;
    this.tvWithRoof = tvWithRoof;
    this.tvYearConstruction = tvYearConstruction;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentCommericalAdverismentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentCommericalAdverismentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_commerical_adverisment, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentCommericalAdverismentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.actv_floor;
      AppCompatAutoCompleteTextView actvFloor = rootView.findViewById(id);
      if (actvFloor == null) {
        break missingId;
      }

      id = R.id.actv_number_bathrooms;
      AppCompatAutoCompleteTextView actvNumberBathrooms = rootView.findViewById(id);
      if (actvNumberBathrooms == null) {
        break missingId;
      }

      id = R.id.actv_number_bedrooms;
      AppCompatAutoCompleteTextView actvNumberBedrooms = rootView.findViewById(id);
      if (actvNumberBedrooms == null) {
        break missingId;
      }

      id = R.id.btn_next;
      MaterialButton btnNext = rootView.findViewById(id);
      if (btnNext == null) {
        break missingId;
      }

      id = R.id.et_age_construction_years;
      TextInputEditText etAgeConstructionYears = rootView.findViewById(id);
      if (etAgeConstructionYears == null) {
        break missingId;
      }

      id = R.id.et_building_area_title;
      TextInputEditText etBuildingAreaTitle = rootView.findViewById(id);
      if (etBuildingAreaTitle == null) {
        break missingId;
      }

      id = R.id.et_gear_area_square_metres;
      TextInputEditText etGearAreaSquareMetres = rootView.findViewById(id);
      if (etGearAreaSquareMetres == null) {
        break missingId;
      }

      id = R.id.et_land_area;
      TextInputEditText etLandArea = rootView.findViewById(id);
      if (etLandArea == null) {
        break missingId;
      }

      id = R.id.et_number_floors_building;
      TextInputEditText etNumberFloorsBuilding = rootView.findViewById(id);
      if (etNumberFloorsBuilding == null) {
        break missingId;
      }

      id = R.id.et_roof_area_square_metres;
      TextInputEditText etRoofAreaSquareMetres = rootView.findViewById(id);
      if (etRoofAreaSquareMetres == null) {
        break missingId;
      }

      id = R.id.et_total_number_apartments_building;
      TextInputEditText etTotalNumberApartmentsBuilding = rootView.findViewById(id);
      if (etTotalNumberApartmentsBuilding == null) {
        break missingId;
      }

      id = R.id.et_year_construction;
      TextInputEditText etYearConstruction = rootView.findViewById(id);
      if (etYearConstruction == null) {
        break missingId;
      }

      id = R.id.iv_back;
      AppCompatImageView ivBack = rootView.findViewById(id);
      if (ivBack == null) {
        break missingId;
      }

      id = R.id.radio_1;
      AppCompatRadioButton radio1 = rootView.findViewById(id);
      if (radio1 == null) {
        break missingId;
      }

      id = R.id.radio_2;
      AppCompatRadioButton radio2 = rootView.findViewById(id);
      if (radio2 == null) {
        break missingId;
      }

      id = R.id.radioGroup_apartment_condition;
      RadioGroup radioGroupApartmentCondition = rootView.findViewById(id);
      if (radioGroupApartmentCondition == null) {
        break missingId;
      }

      id = R.id.radioGroup_furnished;
      RadioGroup radioGroupFurnished = rootView.findViewById(id);
      if (radioGroupFurnished == null) {
        break missingId;
      }

      id = R.id.radioGroup_residential_building;
      RadioGroup radioGroupResidentialBuilding = rootView.findViewById(id);
      if (radioGroupResidentialBuilding == null) {
        break missingId;
      }

      id = R.id.radioGroup_with_garden_gear;
      RadioGroup radioGroupWithGardenGear = rootView.findViewById(id);
      if (radioGroupWithGardenGear == null) {
        break missingId;
      }

      id = R.id.radioGroup_with_roof;
      RadioGroup radioGroupWithRoof = rootView.findViewById(id);
      if (radioGroupWithRoof == null) {
        break missingId;
      }

      id = R.id.radio_no;
      AppCompatRadioButton radioNo = rootView.findViewById(id);
      if (radioNo == null) {
        break missingId;
      }

      id = R.id.radio_no_residential_building;
      AppCompatRadioButton radioNoResidentialBuilding = rootView.findViewById(id);
      if (radioNoResidentialBuilding == null) {
        break missingId;
      }

      id = R.id.radio_no_with_garden_gear;
      AppCompatRadioButton radioNoWithGardenGear = rootView.findViewById(id);
      if (radioNoWithGardenGear == null) {
        break missingId;
      }

      id = R.id.radio_no_with_roof;
      AppCompatRadioButton radioNoWithRoof = rootView.findViewById(id);
      if (radioNoWithRoof == null) {
        break missingId;
      }

      id = R.id.radio_yes;
      AppCompatRadioButton radioYes = rootView.findViewById(id);
      if (radioYes == null) {
        break missingId;
      }

      id = R.id.radio_yes_residential_building;
      AppCompatRadioButton radioYesResidentialBuilding = rootView.findViewById(id);
      if (radioYesResidentialBuilding == null) {
        break missingId;
      }

      id = R.id.radio_yes_with_garden_gear;
      AppCompatRadioButton radioYesWithGardenGear = rootView.findViewById(id);
      if (radioYesWithGardenGear == null) {
        break missingId;
      }

      id = R.id.radio_yes_with_roof;
      AppCompatRadioButton radioYesWithRoof = rootView.findViewById(id);
      if (radioYesWithRoof == null) {
        break missingId;
      }

      id = R.id.rv_determine_apartments_features;
      RecyclerView rvDetermineApartmentsFeatures = rootView.findViewById(id);
      if (rvDetermineApartmentsFeatures == null) {
        break missingId;
      }

      id = R.id.til_floor;
      TextInputLayout tilFloor = rootView.findViewById(id);
      if (tilFloor == null) {
        break missingId;
      }

      id = R.id.til_number_bathrooms;
      TextInputLayout tilNumberBathrooms = rootView.findViewById(id);
      if (tilNumberBathrooms == null) {
        break missingId;
      }

      id = R.id.til_number_bedrooms;
      TextInputLayout tilNumberBedrooms = rootView.findViewById(id);
      if (tilNumberBedrooms == null) {
        break missingId;
      }

      id = R.id.tl_age_construction_years;
      TextInputLayout tlAgeConstructionYears = rootView.findViewById(id);
      if (tlAgeConstructionYears == null) {
        break missingId;
      }

      id = R.id.tl_building_area_title;
      TextInputLayout tlBuildingAreaTitle = rootView.findViewById(id);
      if (tlBuildingAreaTitle == null) {
        break missingId;
      }

      id = R.id.tl_gear_area_square_metres;
      TextInputLayout tlGearAreaSquareMetres = rootView.findViewById(id);
      if (tlGearAreaSquareMetres == null) {
        break missingId;
      }

      id = R.id.tl_land_area;
      TextInputLayout tlLandArea = rootView.findViewById(id);
      if (tlLandArea == null) {
        break missingId;
      }

      id = R.id.tl_number_floors_building;
      TextInputLayout tlNumberFloorsBuilding = rootView.findViewById(id);
      if (tlNumberFloorsBuilding == null) {
        break missingId;
      }

      id = R.id.tl_roof_area_square_metres;
      TextInputLayout tlRoofAreaSquareMetres = rootView.findViewById(id);
      if (tlRoofAreaSquareMetres == null) {
        break missingId;
      }

      id = R.id.tl_total_number_apartments_building;
      TextInputLayout tlTotalNumberApartmentsBuilding = rootView.findViewById(id);
      if (tlTotalNumberApartmentsBuilding == null) {
        break missingId;
      }

      id = R.id.tl_year_construction;
      TextInputLayout tlYearConstruction = rootView.findViewById(id);
      if (tlYearConstruction == null) {
        break missingId;
      }

      id = R.id.tv_age_construction_years;
      AppCompatTextView tvAgeConstructionYears = rootView.findViewById(id);
      if (tvAgeConstructionYears == null) {
        break missingId;
      }

      id = R.id.tv_apartment_condition;
      AppCompatTextView tvApartmentCondition = rootView.findViewById(id);
      if (tvApartmentCondition == null) {
        break missingId;
      }

      id = R.id.tv_building_area;
      AppCompatTextView tvBuildingArea = rootView.findViewById(id);
      if (tvBuildingArea == null) {
        break missingId;
      }

      id = R.id.tv_determine_apartments_features;
      AppCompatTextView tvDetermineApartmentsFeatures = rootView.findViewById(id);
      if (tvDetermineApartmentsFeatures == null) {
        break missingId;
      }

      id = R.id.tv_floor;
      AppCompatTextView tvFloor = rootView.findViewById(id);
      if (tvFloor == null) {
        break missingId;
      }

      id = R.id.tv_furnished;
      AppCompatTextView tvFurnished = rootView.findViewById(id);
      if (tvFurnished == null) {
        break missingId;
      }

      id = R.id.tv_gear_area_square_metres;
      AppCompatTextView tvGearAreaSquareMetres = rootView.findViewById(id);
      if (tvGearAreaSquareMetres == null) {
        break missingId;
      }

      id = R.id.tv_land_area;
      AppCompatTextView tvLandArea = rootView.findViewById(id);
      if (tvLandArea == null) {
        break missingId;
      }

      id = R.id.tv_number_bathrooms;
      AppCompatTextView tvNumberBathrooms = rootView.findViewById(id);
      if (tvNumberBathrooms == null) {
        break missingId;
      }

      id = R.id.tv_number_bedrooms;
      AppCompatTextView tvNumberBedrooms = rootView.findViewById(id);
      if (tvNumberBedrooms == null) {
        break missingId;
      }

      id = R.id.tv_number_floors_building;
      AppCompatTextView tvNumberFloorsBuilding = rootView.findViewById(id);
      if (tvNumberFloorsBuilding == null) {
        break missingId;
      }

      id = R.id.tv_roof_area_square_metres;
      AppCompatTextView tvRoofAreaSquareMetres = rootView.findViewById(id);
      if (tvRoofAreaSquareMetres == null) {
        break missingId;
      }

      id = R.id.tv_total_number_apartments_building;
      AppCompatTextView tvTotalNumberApartmentsBuilding = rootView.findViewById(id);
      if (tvTotalNumberApartmentsBuilding == null) {
        break missingId;
      }

      id = R.id.tv_with_garden_gear;
      AppCompatTextView tvWithGardenGear = rootView.findViewById(id);
      if (tvWithGardenGear == null) {
        break missingId;
      }

      id = R.id.tv_with_roof;
      AppCompatTextView tvWithRoof = rootView.findViewById(id);
      if (tvWithRoof == null) {
        break missingId;
      }

      id = R.id.tv_year_construction;
      AppCompatTextView tvYearConstruction = rootView.findViewById(id);
      if (tvYearConstruction == null) {
        break missingId;
      }

      return new FragmentCommericalAdverismentBinding((ConstraintLayout) rootView, actvFloor,
          actvNumberBathrooms, actvNumberBedrooms, btnNext, etAgeConstructionYears,
          etBuildingAreaTitle, etGearAreaSquareMetres, etLandArea, etNumberFloorsBuilding,
          etRoofAreaSquareMetres, etTotalNumberApartmentsBuilding, etYearConstruction, ivBack,
          radio1, radio2, radioGroupApartmentCondition, radioGroupFurnished,
          radioGroupResidentialBuilding, radioGroupWithGardenGear, radioGroupWithRoof, radioNo,
          radioNoResidentialBuilding, radioNoWithGardenGear, radioNoWithRoof, radioYes,
          radioYesResidentialBuilding, radioYesWithGardenGear, radioYesWithRoof,
          rvDetermineApartmentsFeatures, tilFloor, tilNumberBathrooms, tilNumberBedrooms,
          tlAgeConstructionYears, tlBuildingAreaTitle, tlGearAreaSquareMetres, tlLandArea,
          tlNumberFloorsBuilding, tlRoofAreaSquareMetres, tlTotalNumberApartmentsBuilding,
          tlYearConstruction, tvAgeConstructionYears, tvApartmentCondition, tvBuildingArea,
          tvDetermineApartmentsFeatures, tvFloor, tvFurnished, tvGearAreaSquareMetres, tvLandArea,
          tvNumberBathrooms, tvNumberBedrooms, tvNumberFloorsBuilding, tvRoofAreaSquareMetres,
          tvTotalNumberApartmentsBuilding, tvWithGardenGear, tvWithRoof, tvYearConstruction);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
