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
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.caravan.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentAddHousingAdsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatAutoCompleteTextView actvFloor;

  @NonNull
  public final AppCompatAutoCompleteTextView actvNumberBathrooms;

  @NonNull
  public final AppCompatAutoCompleteTextView actvNumberBedrooms;

  @NonNull
  public final AppCompatAutoCompleteTextView actvNumberFloorApartment;

  @NonNull
  public final MaterialButton btnNext;

  @NonNull
  public final TextInputEditText etBuildingAreaTitle;

  @NonNull
  public final TextInputEditText etFrom;

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
  public final AppCompatImageView ivBack;

  @NonNull
  public final LinearLayoutCompat linApartmentArea;

  @NonNull
  public final RadioGroup radioGroupWithGardenGear;

  @NonNull
  public final RadioGroup radioGroupWithRoof;

  @NonNull
  public final AppCompatRadioButton radioNoWithGardenGear;

  @NonNull
  public final AppCompatRadioButton radioNoWithRoof;

  @NonNull
  public final AppCompatRadioButton radioYesWithGardenGear;

  @NonNull
  public final AppCompatRadioButton radioYesWithRoof;

  @NonNull
  public final TextInputLayout tilFloor;

  @NonNull
  public final TextInputLayout tilNumberBathrooms;

  @NonNull
  public final TextInputLayout tilNumberBedrooms;

  @NonNull
  public final TextInputLayout tilNumberFloorApartment;

  @NonNull
  public final TextInputLayout tlBuildingAreaTitle;

  @NonNull
  public final TextInputLayout tlFrom;

  @NonNull
  public final TextInputLayout tlGearAreaSquareMetres;

  @NonNull
  public final TextInputLayout tlNumberFloorsBuilding;

  @NonNull
  public final TextInputLayout tlRoofAreaSquareMetres;

  @NonNull
  public final TextInputLayout tlTo;

  @NonNull
  public final TextInputLayout tlTotalNumberApartmentsBuilding;

  @NonNull
  public final AppCompatTextView tvApartmentArea;

  @NonNull
  public final AppCompatTextView tvBuildingArea;

  @NonNull
  public final AppCompatTextView tvFloor;

  @NonNull
  public final AppCompatTextView tvGearAreaSquareMetres;

  @NonNull
  public final AppCompatTextView tvNumberBathrooms;

  @NonNull
  public final AppCompatTextView tvNumberBedrooms;

  @NonNull
  public final AppCompatTextView tvNumberFloorApartment;

  @NonNull
  public final AppCompatTextView tvNumberFloorsBuilding;

  @NonNull
  public final AppCompatTextView tvRoofAreaSquareMetres;

  @NonNull
  public final AppCompatTextView tvTitle;

  @NonNull
  public final AppCompatTextView tvTotalNumberApartmentsBuilding;

  @NonNull
  public final AppCompatTextView tvWithGardenGear;

  @NonNull
  public final AppCompatTextView tvWithRoof;

  private FragmentAddHousingAdsBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppCompatAutoCompleteTextView actvFloor,
      @NonNull AppCompatAutoCompleteTextView actvNumberBathrooms,
      @NonNull AppCompatAutoCompleteTextView actvNumberBedrooms,
      @NonNull AppCompatAutoCompleteTextView actvNumberFloorApartment,
      @NonNull MaterialButton btnNext, @NonNull TextInputEditText etBuildingAreaTitle,
      @NonNull TextInputEditText etFrom, @NonNull TextInputEditText etGearAreaSquareMetres,
      @NonNull TextInputEditText etLandArea, @NonNull TextInputEditText etNumberFloorsBuilding,
      @NonNull TextInputEditText etRoofAreaSquareMetres,
      @NonNull TextInputEditText etTotalNumberApartmentsBuilding,
      @NonNull AppCompatImageView ivBack, @NonNull LinearLayoutCompat linApartmentArea,
      @NonNull RadioGroup radioGroupWithGardenGear, @NonNull RadioGroup radioGroupWithRoof,
      @NonNull AppCompatRadioButton radioNoWithGardenGear,
      @NonNull AppCompatRadioButton radioNoWithRoof,
      @NonNull AppCompatRadioButton radioYesWithGardenGear,
      @NonNull AppCompatRadioButton radioYesWithRoof, @NonNull TextInputLayout tilFloor,
      @NonNull TextInputLayout tilNumberBathrooms, @NonNull TextInputLayout tilNumberBedrooms,
      @NonNull TextInputLayout tilNumberFloorApartment,
      @NonNull TextInputLayout tlBuildingAreaTitle, @NonNull TextInputLayout tlFrom,
      @NonNull TextInputLayout tlGearAreaSquareMetres,
      @NonNull TextInputLayout tlNumberFloorsBuilding,
      @NonNull TextInputLayout tlRoofAreaSquareMetres, @NonNull TextInputLayout tlTo,
      @NonNull TextInputLayout tlTotalNumberApartmentsBuilding,
      @NonNull AppCompatTextView tvApartmentArea, @NonNull AppCompatTextView tvBuildingArea,
      @NonNull AppCompatTextView tvFloor, @NonNull AppCompatTextView tvGearAreaSquareMetres,
      @NonNull AppCompatTextView tvNumberBathrooms, @NonNull AppCompatTextView tvNumberBedrooms,
      @NonNull AppCompatTextView tvNumberFloorApartment,
      @NonNull AppCompatTextView tvNumberFloorsBuilding,
      @NonNull AppCompatTextView tvRoofAreaSquareMetres, @NonNull AppCompatTextView tvTitle,
      @NonNull AppCompatTextView tvTotalNumberApartmentsBuilding,
      @NonNull AppCompatTextView tvWithGardenGear, @NonNull AppCompatTextView tvWithRoof) {
    this.rootView = rootView;
    this.actvFloor = actvFloor;
    this.actvNumberBathrooms = actvNumberBathrooms;
    this.actvNumberBedrooms = actvNumberBedrooms;
    this.actvNumberFloorApartment = actvNumberFloorApartment;
    this.btnNext = btnNext;
    this.etBuildingAreaTitle = etBuildingAreaTitle;
    this.etFrom = etFrom;
    this.etGearAreaSquareMetres = etGearAreaSquareMetres;
    this.etLandArea = etLandArea;
    this.etNumberFloorsBuilding = etNumberFloorsBuilding;
    this.etRoofAreaSquareMetres = etRoofAreaSquareMetres;
    this.etTotalNumberApartmentsBuilding = etTotalNumberApartmentsBuilding;
    this.ivBack = ivBack;
    this.linApartmentArea = linApartmentArea;
    this.radioGroupWithGardenGear = radioGroupWithGardenGear;
    this.radioGroupWithRoof = radioGroupWithRoof;
    this.radioNoWithGardenGear = radioNoWithGardenGear;
    this.radioNoWithRoof = radioNoWithRoof;
    this.radioYesWithGardenGear = radioYesWithGardenGear;
    this.radioYesWithRoof = radioYesWithRoof;
    this.tilFloor = tilFloor;
    this.tilNumberBathrooms = tilNumberBathrooms;
    this.tilNumberBedrooms = tilNumberBedrooms;
    this.tilNumberFloorApartment = tilNumberFloorApartment;
    this.tlBuildingAreaTitle = tlBuildingAreaTitle;
    this.tlFrom = tlFrom;
    this.tlGearAreaSquareMetres = tlGearAreaSquareMetres;
    this.tlNumberFloorsBuilding = tlNumberFloorsBuilding;
    this.tlRoofAreaSquareMetres = tlRoofAreaSquareMetres;
    this.tlTo = tlTo;
    this.tlTotalNumberApartmentsBuilding = tlTotalNumberApartmentsBuilding;
    this.tvApartmentArea = tvApartmentArea;
    this.tvBuildingArea = tvBuildingArea;
    this.tvFloor = tvFloor;
    this.tvGearAreaSquareMetres = tvGearAreaSquareMetres;
    this.tvNumberBathrooms = tvNumberBathrooms;
    this.tvNumberBedrooms = tvNumberBedrooms;
    this.tvNumberFloorApartment = tvNumberFloorApartment;
    this.tvNumberFloorsBuilding = tvNumberFloorsBuilding;
    this.tvRoofAreaSquareMetres = tvRoofAreaSquareMetres;
    this.tvTitle = tvTitle;
    this.tvTotalNumberApartmentsBuilding = tvTotalNumberApartmentsBuilding;
    this.tvWithGardenGear = tvWithGardenGear;
    this.tvWithRoof = tvWithRoof;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentAddHousingAdsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentAddHousingAdsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_add_housing_ads, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentAddHousingAdsBinding bind(@NonNull View rootView) {
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

      id = R.id.actv_number_floor_apartment;
      AppCompatAutoCompleteTextView actvNumberFloorApartment = rootView.findViewById(id);
      if (actvNumberFloorApartment == null) {
        break missingId;
      }

      id = R.id.btn_next;
      MaterialButton btnNext = rootView.findViewById(id);
      if (btnNext == null) {
        break missingId;
      }

      id = R.id.et_building_area_title;
      TextInputEditText etBuildingAreaTitle = rootView.findViewById(id);
      if (etBuildingAreaTitle == null) {
        break missingId;
      }

      id = R.id.et_from;
      TextInputEditText etFrom = rootView.findViewById(id);
      if (etFrom == null) {
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

      id = R.id.iv_back;
      AppCompatImageView ivBack = rootView.findViewById(id);
      if (ivBack == null) {
        break missingId;
      }

      id = R.id.lin_apartment_area;
      LinearLayoutCompat linApartmentArea = rootView.findViewById(id);
      if (linApartmentArea == null) {
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

      id = R.id.til_number_floor_apartment;
      TextInputLayout tilNumberFloorApartment = rootView.findViewById(id);
      if (tilNumberFloorApartment == null) {
        break missingId;
      }

      id = R.id.tl_building_area_title;
      TextInputLayout tlBuildingAreaTitle = rootView.findViewById(id);
      if (tlBuildingAreaTitle == null) {
        break missingId;
      }

      id = R.id.tl_from;
      TextInputLayout tlFrom = rootView.findViewById(id);
      if (tlFrom == null) {
        break missingId;
      }

      id = R.id.tl_gear_area_square_metres;
      TextInputLayout tlGearAreaSquareMetres = rootView.findViewById(id);
      if (tlGearAreaSquareMetres == null) {
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

      id = R.id.tl_to;
      TextInputLayout tlTo = rootView.findViewById(id);
      if (tlTo == null) {
        break missingId;
      }

      id = R.id.tl_total_number_apartments_building;
      TextInputLayout tlTotalNumberApartmentsBuilding = rootView.findViewById(id);
      if (tlTotalNumberApartmentsBuilding == null) {
        break missingId;
      }

      id = R.id.tv_apartment_area;
      AppCompatTextView tvApartmentArea = rootView.findViewById(id);
      if (tvApartmentArea == null) {
        break missingId;
      }

      id = R.id.tv_building_area;
      AppCompatTextView tvBuildingArea = rootView.findViewById(id);
      if (tvBuildingArea == null) {
        break missingId;
      }

      id = R.id.tv_floor;
      AppCompatTextView tvFloor = rootView.findViewById(id);
      if (tvFloor == null) {
        break missingId;
      }

      id = R.id.tv_gear_area_square_metres;
      AppCompatTextView tvGearAreaSquareMetres = rootView.findViewById(id);
      if (tvGearAreaSquareMetres == null) {
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

      id = R.id.tv_number_floor_apartment;
      AppCompatTextView tvNumberFloorApartment = rootView.findViewById(id);
      if (tvNumberFloorApartment == null) {
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

      id = R.id.tv_title;
      AppCompatTextView tvTitle = rootView.findViewById(id);
      if (tvTitle == null) {
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

      return new FragmentAddHousingAdsBinding((ConstraintLayout) rootView, actvFloor,
          actvNumberBathrooms, actvNumberBedrooms, actvNumberFloorApartment, btnNext,
          etBuildingAreaTitle, etFrom, etGearAreaSquareMetres, etLandArea, etNumberFloorsBuilding,
          etRoofAreaSquareMetres, etTotalNumberApartmentsBuilding, ivBack, linApartmentArea,
          radioGroupWithGardenGear, radioGroupWithRoof, radioNoWithGardenGear, radioNoWithRoof,
          radioYesWithGardenGear, radioYesWithRoof, tilFloor, tilNumberBathrooms, tilNumberBedrooms,
          tilNumberFloorApartment, tlBuildingAreaTitle, tlFrom, tlGearAreaSquareMetres,
          tlNumberFloorsBuilding, tlRoofAreaSquareMetres, tlTo, tlTotalNumberApartmentsBuilding,
          tvApartmentArea, tvBuildingArea, tvFloor, tvGearAreaSquareMetres, tvNumberBathrooms,
          tvNumberBedrooms, tvNumberFloorApartment, tvNumberFloorsBuilding, tvRoofAreaSquareMetres,
          tvTitle, tvTotalNumberApartmentsBuilding, tvWithGardenGear, tvWithRoof);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}