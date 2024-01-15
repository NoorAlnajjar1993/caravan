package com.dominate.caravan.ui.addads.addcommercialestate

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.caravan.R
import com.caravan.databinding.FragmentCommericalAdSpecificationBinding
import com.dominate.caravan.core.autoCleared
import com.dominate.caravan.core.base.BaseFragment
import com.dominate.caravan.ui.addads.AddAdsViewModel
import com.dominate.caravan.ui.addads.addestateads.AddCategoryModel
import com.dominate.caravan.ui.addads.addestateads.adapter.AddCategoryAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CommericalAdSpecificationsFragment : BaseFragment(), TextWatcher {

    var binding: FragmentCommericalAdSpecificationBinding by autoCleared()
    private val viewModel: AddAdsViewModel by viewModels()
    lateinit var categoryAdapter: AddCategoryAdapter
    lateinit var hospitalCategoryAdapter: AddCategoryAdapter
    lateinit var schoolCategoryAdapter: AddCategoryAdapter


    companion object {
        var estateType = 0
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCommericalAdSpecificationBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setData()
    }

    override fun afterTextChanged(s: Editable) {}
    override fun beforeTextChanged(
        s: CharSequence, start: Int, count: Int, after: Int
    ) {
    }

    override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {}

    private fun setData() {

        if (estateType == 1) {
            setType_2Design()
        } else if (estateType == 2) {
            setType_1Design()
        } else if (estateType == 3) {
            setType_3Design()
        } else if (estateType == 4) {
            setType_4Design()
        }else if (estateType == 5) {
            setType_5Design()
        } else if (estateType == 6) {
            setType_6Design()
        } else if (estateType == 7) {
            setType_4Design()
        } else if (estateType == 8) {
            setType_8Design()
        }else if (estateType == 9) {
            setType_5Design()
        } else if (estateType == 10) {
            setType_5Design()
        } else if (estateType == 11) {
            setType_11Design()
        } else if (estateType == 12) {
            setType_4Design()
        }

        binding.ivBack.setOnClickListener {
            findNavController().popBackStack()
        }

        var categoryList: MutableList<AddCategoryModel> = mutableListOf()
        categoryList.add(AddCategoryModel(1, "شقق فندقية", false))
        categoryList.add(AddCategoryModel(2, "5 نجوم", false))
        categoryList.add(AddCategoryModel(3, "+5 نجوم", false))
        categoryList.add(AddCategoryModel(4, "3 نجوم", false))
        categoryAdapter = AddCategoryAdapter(categoryList) {}
        categoryAdapter.notifyDataSetChanged()
        binding.rvCategory.adapter = categoryAdapter


        var hospitalCategoryList: MutableList<AddCategoryModel> = mutableListOf()
        hospitalCategoryList.add(AddCategoryModel(1, "أ", false))
        hospitalCategoryList.add(AddCategoryModel(2, "ج", false))
        hospitalCategoryList.add(AddCategoryModel(3, "ب", false))
        hospitalCategoryList.add(AddCategoryModel(4, "غير ذلك", false))
        hospitalCategoryAdapter = AddCategoryAdapter(hospitalCategoryList) {}
        hospitalCategoryAdapter.notifyDataSetChanged()
        binding.rvHospitalCategory.adapter = hospitalCategoryAdapter


        var schoolCategoryList: MutableList<AddCategoryModel> = mutableListOf()
        schoolCategoryList.add(AddCategoryModel(1, "حضانة", false))
        schoolCategoryList.add(AddCategoryModel(2, "مدرسة ثانوية", false))
        schoolCategoryList.add(AddCategoryModel(3, "روضة", false))
        schoolCategoryList.add(AddCategoryModel(4, "مدرسة أساسية", false))
        schoolCategoryAdapter = AddCategoryAdapter(schoolCategoryList) {}
        schoolCategoryAdapter.notifyDataSetChanged()
        binding.rvSchoolCategory.adapter = schoolCategoryAdapter


        binding.btnNext.setOnClickListener {
            findNavController().navigate(R.id.action_commericalAdSpecificationsFragment_to_addAdsImages)

        }
    }

    private fun setType_1Design() {
        binding.tvApartmentCondition.visibility = View.VISIBLE
        binding.radioGroupApartmentCondition.visibility = View.VISIBLE

        binding.tvOrganization.visibility = View.GONE
        binding.radioGroupOrganization.visibility = View.GONE

        binding.tvRentedBuilding.visibility = View.GONE
        binding.radioGroupRentedBuilding.visibility = View.GONE

        binding.tvNumberRooms.visibility = View.GONE
        binding.tilNumberRooms.visibility = View.GONE

        binding.tvNumberBathrooms.visibility = View.GONE
        binding.tilNumberBathrooms.visibility = View.GONE

        binding.tvBuildingArea.visibility = View.VISIBLE
        binding.tlBuildingAreaTitle.visibility = View.VISIBLE

        binding.tvLandArea.visibility = View.VISIBLE
        binding.tlLandArea.visibility = View.VISIBLE

        binding.tvYearConstruction.visibility = View.GONE
        binding.tlYearConstruction.visibility = View.GONE

        binding.tvFloor.visibility = View.GONE
        binding.tilFloor.visibility = View.GONE

        binding.tvCategory.visibility = View.GONE
        binding.rvCategory.visibility = View.GONE

        binding.tvFamilyCount.visibility = View.GONE
        binding.tlFamilyCount.visibility = View.GONE

        binding.tvHospitalCategory.visibility = View.GONE
        binding.rvHospitalCategory.visibility = View.GONE

        binding.tvSchoolCategory.visibility = View.GONE
        binding.rvSchoolCategory.visibility = View.GONE
    }

    private fun setType_2Design() {
        binding.tvApartmentCondition.visibility = View.VISIBLE
        binding.radioGroupApartmentCondition.visibility = View.VISIBLE

        binding.tvOrganization.visibility = View.VISIBLE
        binding.radioGroupOrganization.visibility = View.VISIBLE

        binding.tvRentedBuilding.visibility = View.VISIBLE
        binding.radioGroupRentedBuilding.visibility = View.VISIBLE

        binding.tvNumberRooms.visibility = View.GONE
        binding.tilNumberRooms.visibility = View.GONE

        binding.tvNumberBathrooms.visibility = View.GONE
        binding.tilNumberBathrooms.visibility = View.GONE

        binding.tvBuildingArea.visibility = View.VISIBLE
        binding.tlBuildingAreaTitle.visibility = View.VISIBLE

        binding.tvLandArea.visibility = View.VISIBLE
        binding.tlLandArea.visibility = View.VISIBLE

        binding.tvYearConstruction.visibility = View.VISIBLE
        binding.tlYearConstruction.visibility = View.VISIBLE

        binding.tvFloor.visibility = View.GONE
        binding.tilFloor.visibility = View.GONE

        binding.tvCategory.visibility = View.GONE
        binding.rvCategory.visibility = View.GONE

        binding.tvFamilyCount.visibility = View.GONE
        binding.tlFamilyCount.visibility = View.GONE

        binding.tvHospitalCategory.visibility = View.GONE
        binding.rvHospitalCategory.visibility = View.GONE

        binding.tvSchoolCategory.visibility = View.GONE
        binding.rvSchoolCategory.visibility = View.GONE
    }
    private fun setType_3Design() {
        binding.tvApartmentCondition.visibility = View.VISIBLE
        binding.radioGroupApartmentCondition.visibility = View.VISIBLE

        binding.tvOrganization.visibility = View.GONE
        binding.radioGroupOrganization.visibility = View.GONE

        binding.tvRentedBuilding.visibility = View.GONE
        binding.radioGroupRentedBuilding.visibility = View.GONE

        binding.tvNumberRooms.visibility = View.VISIBLE
        binding.tilNumberRooms.visibility = View.VISIBLE

        binding.tvNumberBathrooms.visibility = View.VISIBLE
        binding.tilNumberBathrooms.visibility = View.VISIBLE

        binding.tvBuildingArea.visibility = View.VISIBLE
        binding.tlBuildingAreaTitle.visibility = View.VISIBLE

        binding.tvLandArea.visibility = View.GONE
        binding.tlLandArea.visibility = View.GONE

        binding.tvYearConstruction.visibility = View.VISIBLE
        binding.tlYearConstruction.visibility = View.VISIBLE

        binding.tvFloor.visibility = View.VISIBLE
        binding.tilFloor.visibility = View.VISIBLE

        binding.tvCategory.visibility = View.GONE
        binding.rvCategory.visibility = View.GONE

        binding.tvFamilyCount.visibility = View.GONE
        binding.tlFamilyCount.visibility = View.GONE

        binding.tvHospitalCategory.visibility = View.GONE
        binding.rvHospitalCategory.visibility = View.GONE

        binding.tvSchoolCategory.visibility = View.GONE
        binding.rvSchoolCategory.visibility = View.GONE
    }
    private fun setType_4Design() {
        binding.tvApartmentCondition.visibility = View.VISIBLE
        binding.radioGroupApartmentCondition.visibility = View.VISIBLE

        binding.tvOrganization.visibility = View.GONE
        binding.radioGroupOrganization.visibility = View.GONE

        binding.tvRentedBuilding.visibility = View.GONE
        binding.radioGroupRentedBuilding.visibility = View.GONE

        binding.tvNumberRooms.visibility = View.GONE
        binding.tilNumberRooms.visibility = View.GONE

        binding.tvNumberBathrooms.visibility = View.GONE
        binding.tilNumberBathrooms.visibility = View.GONE

        binding.tvBuildingArea.visibility = View.VISIBLE
        binding.tlBuildingAreaTitle.visibility = View.VISIBLE

        binding.tvLandArea.visibility = View.GONE
        binding.tlLandArea.visibility = View.GONE

        binding.tvYearConstruction.visibility = View.VISIBLE
        binding.tlYearConstruction.visibility = View.VISIBLE

        binding.tvFloor.visibility = View.GONE
        binding.tilFloor.visibility = View.GONE

        binding.tvCategory.visibility = View.GONE
        binding.rvCategory.visibility = View.GONE

        binding.tvFamilyCount.visibility = View.GONE
        binding.tlFamilyCount.visibility = View.GONE

        binding.tvHospitalCategory.visibility = View.GONE
        binding.rvHospitalCategory.visibility = View.GONE

        binding.tvSchoolCategory.visibility = View.GONE
        binding.rvSchoolCategory.visibility = View.GONE
    }
    private fun setType_5Design() {
        binding.tvApartmentCondition.visibility = View.VISIBLE
        binding.radioGroupApartmentCondition.visibility = View.VISIBLE

        binding.tvOrganization.visibility = View.GONE
        binding.radioGroupOrganization.visibility = View.GONE

        binding.tvRentedBuilding.visibility = View.GONE
        binding.radioGroupRentedBuilding.visibility = View.GONE

        binding.tvNumberRooms.visibility = View.GONE
        binding.tilNumberRooms.visibility = View.GONE

        binding.tvNumberBathrooms.visibility = View.GONE
        binding.tilNumberBathrooms.visibility = View.GONE

        binding.tvBuildingArea.visibility = View.VISIBLE
        binding.tlBuildingAreaTitle.visibility = View.VISIBLE

        binding.tvLandArea.visibility = View.VISIBLE
        binding.tlLandArea.visibility = View.VISIBLE

        binding.tvYearConstruction.visibility = View.VISIBLE
        binding.tlYearConstruction.visibility = View.VISIBLE

        binding.tvFloor.visibility = View.GONE
        binding.tilFloor.visibility = View.GONE

        binding.tvCategory.visibility = View.GONE
        binding.rvCategory.visibility = View.GONE

        binding.tvFamilyCount.visibility = View.GONE
        binding.tlFamilyCount.visibility = View.GONE

        binding.tvHospitalCategory.visibility = View.GONE
        binding.rvHospitalCategory.visibility = View.GONE

        binding.tvSchoolCategory.visibility = View.GONE
        binding.rvSchoolCategory.visibility = View.GONE
    }
    private fun setType_6Design() {
        binding.tvApartmentCondition.visibility = View.VISIBLE
        binding.radioGroupApartmentCondition.visibility = View.VISIBLE

        binding.tvOrganization.visibility = View.GONE
        binding.radioGroupOrganization.visibility = View.GONE

        binding.tvRentedBuilding.visibility = View.GONE
        binding.radioGroupRentedBuilding.visibility = View.GONE

        binding.tvNumberRooms.visibility = View.GONE
        binding.tilNumberRooms.visibility = View.GONE

        binding.tvNumberBathrooms.visibility = View.GONE
        binding.tilNumberBathrooms.visibility = View.GONE

        binding.tvBuildingArea.visibility = View.VISIBLE
        binding.tlBuildingAreaTitle.visibility = View.VISIBLE

        binding.tvLandArea.visibility = View.VISIBLE
        binding.tlLandArea.visibility = View.VISIBLE

        binding.tvYearConstruction.visibility = View.VISIBLE
        binding.tlYearConstruction.visibility = View.VISIBLE

        binding.tvFloor.visibility = View.GONE
        binding.tilFloor.visibility = View.GONE

        binding.tvCategory.visibility = View.VISIBLE
        binding.rvCategory.visibility = View.VISIBLE

        binding.tvFamilyCount.visibility = View.GONE
        binding.tlFamilyCount.visibility = View.GONE

        binding.tvHospitalCategory.visibility = View.GONE
        binding.rvHospitalCategory.visibility = View.GONE

        binding.tvSchoolCategory.visibility = View.GONE
        binding.rvSchoolCategory.visibility = View.GONE
    }
    private fun setType_8Design() {
        binding.tvApartmentCondition.visibility = View.VISIBLE
        binding.radioGroupApartmentCondition.visibility = View.VISIBLE

        binding.tvOrganization.visibility = View.GONE
        binding.radioGroupOrganization.visibility = View.GONE

        binding.tvRentedBuilding.visibility = View.GONE
        binding.radioGroupRentedBuilding.visibility = View.GONE

        binding.tvNumberRooms.visibility = View.GONE
        binding.tilNumberRooms.visibility = View.GONE

        binding.tvNumberBathrooms.visibility = View.GONE
        binding.tilNumberBathrooms.visibility = View.GONE

        binding.tvBuildingArea.visibility = View.VISIBLE
        binding.tlBuildingAreaTitle.visibility = View.VISIBLE

        binding.tvLandArea.visibility = View.VISIBLE
        binding.tlLandArea.visibility = View.VISIBLE

        binding.tvYearConstruction.visibility = View.VISIBLE
        binding.tlYearConstruction.visibility = View.VISIBLE

        binding.tvFloor.visibility = View.GONE
        binding.tilFloor.visibility = View.GONE

        binding.tvCategory.visibility = View.GONE
        binding.rvCategory.visibility = View.GONE

        binding.tvFamilyCount.visibility = View.VISIBLE
        binding.tlFamilyCount.visibility = View.VISIBLE

        binding.tvHospitalCategory.visibility = View.VISIBLE
        binding.rvHospitalCategory.visibility = View.VISIBLE

        binding.tvSchoolCategory.visibility = View.GONE
        binding.rvSchoolCategory.visibility = View.GONE
    }
    private fun setType_11Design() {
        binding.tvApartmentCondition.visibility = View.VISIBLE
        binding.radioGroupApartmentCondition.visibility = View.VISIBLE

        binding.tvOrganization.visibility = View.GONE
        binding.radioGroupOrganization.visibility = View.GONE

        binding.tvRentedBuilding.visibility = View.GONE
        binding.radioGroupRentedBuilding.visibility = View.GONE

        binding.tvNumberRooms.visibility = View.GONE
        binding.tilNumberRooms.visibility = View.GONE

        binding.tvNumberBathrooms.visibility = View.GONE
        binding.tilNumberBathrooms.visibility = View.GONE

        binding.tvBuildingArea.visibility = View.VISIBLE
        binding.tlBuildingAreaTitle.visibility = View.VISIBLE

        binding.tvLandArea.visibility = View.VISIBLE
        binding.tlLandArea.visibility = View.VISIBLE

        binding.tvYearConstruction.visibility = View.VISIBLE
        binding.tlYearConstruction.visibility = View.VISIBLE

        binding.tvFloor.visibility = View.GONE
        binding.tilFloor.visibility = View.GONE

        binding.tvCategory.visibility = View.GONE
        binding.rvCategory.visibility = View.GONE

        binding.tvFamilyCount.visibility = View.GONE
        binding.tlFamilyCount.visibility = View.GONE

        binding.tvHospitalCategory.visibility = View.GONE
        binding.rvHospitalCategory.visibility = View.GONE

        binding.tvSchoolCategory.visibility = View.VISIBLE
        binding.rvSchoolCategory.visibility = View.VISIBLE
    }
}

data class ApartmentFeatureModel(
    val image: Int, val text: String
)