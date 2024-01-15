package com.dominate.caravan.ui.addads.commericaladvertisment

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.core.content.ContextCompat
import androidx.core.os.bundleOf
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.caravan.R
import com.caravan.databinding.FragmentAddAdsBinding
import com.caravan.databinding.FragmentCommericalAdverismentBinding
import com.caravan.databinding.FragmentSearchBinding
import com.dominate.caravan.core.autoCleared
import com.dominate.caravan.core.base.BaseFragment
import com.dominate.caravan.ui.addads.AddAdsViewModel
import com.dominate.caravan.ui.addads.addestateads.AddCategoryModel
import com.dominate.caravan.ui.addads.addestateads.adapter.AddCategoryAdapter
import com.dominate.caravan.ui.home.HomeActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CommericalAdvertismentFragment : BaseFragment() ,TextWatcher {

     var binding: FragmentCommericalAdverismentBinding by  autoCleared()
    private val viewModel: AddAdsViewModel by viewModels()
    lateinit var apartmentFeatureAdapter:ApartmentFeatureAdapter
    lateinit var addCategoryAdapter: AddCategoryAdapter
    lateinit var rateAdapter: AddCategoryAdapter
    lateinit var landOrganizationAdapter: AddCategoryAdapter

    companion object{
        var title = ""
        var estateType = 0
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCommericalAdverismentBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setData()
    }

    override fun afterTextChanged(s: Editable) {}
    override fun beforeTextChanged(
            s: CharSequence, start: Int, count: Int, after: Int
    ) {}

    override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {}

    private fun setData(){

        binding.tvTitle.text = title
        if (estateType == 1) {
            setType_1Design()
        }else if (estateType == 3) {
            setType_3Design()
        }else if (estateType == 4) {
            setType_4Design()
        }else if (estateType == 5) {
            setType_5Design()
        }else if (estateType == 6) {
            setType_6Design()
        }

        binding.ivBack.setOnClickListener {
            findNavController().popBackStack()
        }

        var farmFeaturesList: MutableList<AddCategoryModel> = mutableListOf()
        farmFeaturesList.add(AddCategoryModel(1, "منطقة شوي", false))
        farmFeaturesList.add(AddCategoryModel(2, "مسبحين", false))
        farmFeaturesList.add(AddCategoryModel(3, "مكيفات راكبة", false))
        farmFeaturesList.add(AddCategoryModel(4, "مسبح واحد", false))
        farmFeaturesList.add(AddCategoryModel(5, "مواقف سيارة", false))
        farmFeaturesList.add(AddCategoryModel(6, "منطقة ألعاب", false))
        addCategoryAdapter = AddCategoryAdapter (farmFeaturesList){}
        addCategoryAdapter . notifyDataSetChanged ()
        binding . rvFarmFeatures . adapter = addCategoryAdapter


        var rateList: MutableList<AddCategoryModel> = mutableListOf()
        rateList.add(AddCategoryModel(1, "غير محدد", false))
        rateList.add(AddCategoryModel(2, "ثلاث طوابق", false))
        rateList.add(AddCategoryModel(3, "طابق واحد", false))
        rateList.add(AddCategoryModel(4, "أكثر من ثلاث طوابق", false))
        rateList.add(AddCategoryModel(5, "طابقين", false))
        rateAdapter = AddCategoryAdapter (rateList){}
        rateAdapter . notifyDataSetChanged ()
        binding . rvRate . adapter = rateAdapter

        var landOrganizationList: MutableList<AddCategoryModel> = mutableListOf()
        landOrganizationList.add(AddCategoryModel(1, "تنظيم أ", false))
        landOrganizationList.add(AddCategoryModel(2, "أحكام خاصة", false))
        landOrganizationList.add(AddCategoryModel(3, "تنظيم ب", false))
        landOrganizationList.add(AddCategoryModel(4, "زراعي", false))
        landOrganizationList.add(AddCategoryModel(5, "تنظيم ج", false))
        landOrganizationList.add(AddCategoryModel(6, "تجاري", false))
        landOrganizationList.add(AddCategoryModel(7, "تنظيم د", false))
        landOrganizationList.add(AddCategoryModel(8, "صناعي", false))
        landOrganizationList.add(AddCategoryModel(9, "شعبي", false))
        landOrganizationList.add(AddCategoryModel(10, "غير ذلك", false))


        landOrganizationAdapter = AddCategoryAdapter (landOrganizationList){}
        landOrganizationAdapter . notifyDataSetChanged ()
        binding . rvLandOrganization . adapter = landOrganizationAdapter


        binding.radioYesContainsBuilding.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked){
                binding.tvNumberBedrooms.visibility = View.VISIBLE
                binding.tilNumberBedrooms.visibility=View.VISIBLE

                binding.tvNumberBathrooms.visibility = View.VISIBLE
                binding.tilNumberBathrooms.visibility=View.VISIBLE

                binding.tvBuildingArea.visibility = View.VISIBLE
                binding.tlBuildingAreaTitle.visibility = View.VISIBLE

                binding.tvFarmFeatures.visibility = View.VISIBLE
                binding.rvFarmFeatures.visibility = View.VISIBLE

                binding.tvDetermineApartmentsFeatures.visibility = View.VISIBLE
                binding.rvDetermineApartmentsFeatures.visibility = View.VISIBLE
            } else{
                binding.tvNumberBedrooms.visibility = View.GONE
                binding.tilNumberBedrooms.visibility=View.GONE

                binding.tvNumberBathrooms.visibility = View.GONE
                binding.tilNumberBathrooms.visibility=View.GONE

                binding.tvBuildingArea.visibility = View.GONE
                binding.tlBuildingAreaTitle.visibility = View.GONE

                binding.tvFarmFeatures.visibility = View.GONE
                binding.rvFarmFeatures.visibility = View.GONE

                binding.tvDetermineApartmentsFeatures.visibility = View.GONE
                binding.rvDetermineApartmentsFeatures.visibility = View.GONE
            }
        }

        binding.radioYesWithGardenGear.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked){
                binding.tvGearAreaSquareMetres.visibility = View.VISIBLE
                binding.tlGearAreaSquareMetres.visibility = View.VISIBLE
            } else{
                binding.tvGearAreaSquareMetres.visibility = View.GONE
                binding.tlGearAreaSquareMetres.visibility = View.GONE
            }
        }

        binding.radioYesWithRoof.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked){
                binding.tvRoofAreaSquareMetres.visibility = View.VISIBLE
                binding.tlRoofAreaSquareMetres.visibility = View.VISIBLE
            } else{
                binding.tvRoofAreaSquareMetres.visibility = View.GONE
                binding.tlRoofAreaSquareMetres.visibility = View.GONE
            }
        }

        var arrayList : MutableList<String> = mutableListOf()
        arrayList.add("1")
        arrayList.add("2")
        arrayList.add("3")
        arrayList.add("4")
        val testAdapter = SpinnerAdapter(
            requireContext(),
            androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,
            arrayList,
            Color.WHITE
        )
        val autoCompleteTv = binding.actvNumberBathrooms
        autoCompleteTv.setText("اختر")
        autoCompleteTv.setDropDownBackgroundDrawable(
            ColorDrawable(
                ContextCompat.getColor(
                    requireContext(),
                    R.color.light_purple
                )
            )
        )
        binding.actvNumberBathrooms.setAdapter(testAdapter)
        binding.actvNumberBathrooms.setOnItemClickListener { parent, view, position, id ->

//            val id = it.data?.find {
//                it.enTitle == autoCompleteTv.text.toString()
//            }?.id
//            viewModel.currencyId = id!!
        }

        val testAdapter2 = SpinnerAdapter(
            requireContext(),
            androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,
            arrayList,
            Color.WHITE
        )
        val autoCompleteTv2 = binding.actvNumberBedrooms
        autoCompleteTv2.setText("اختر")
        autoCompleteTv2.setDropDownBackgroundDrawable(
            ColorDrawable(
                ContextCompat.getColor(
                    requireContext(),
                    R.color.light_purple
                )
            )
        )
        binding.actvNumberBedrooms.setAdapter(testAdapter2)
        binding.actvNumberBedrooms.setOnItemClickListener { parent, view, position, id ->

//            val id = it.data?.find {
//                it.enTitle == autoCompleteTv.text.toString()
//            }?.id
//            viewModel.currencyId = id!!
        }

        val testAdapter3 = SpinnerAdapter(
            requireContext(),
            androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,
            arrayList,
            Color.WHITE
        )
        val autoCompleteTv3 = binding.actvFloor
        autoCompleteTv3.setText("اختر")
        autoCompleteTv3.setDropDownBackgroundDrawable(
            ColorDrawable(
                ContextCompat.getColor(
                    requireContext(),
                    R.color.light_purple
                )
            )
        )
        binding.actvFloor.setAdapter(testAdapter3)
        binding.actvFloor.setOnItemClickListener { parent, view, position, id ->

//            val id = it.data?.find {
//                it.enTitle == autoCompleteTv.text.toString()
//            }?.id
//            viewModel.currencyId = id!!
        }

        binding.rvDetermineApartmentsFeatures!!.layoutManager = GridLayoutManager(
            requireContext(), 4,
            GridLayoutManager.VERTICAL, false
        )

        var featureList : MutableList<ApartmentFeatureModel> = mutableListOf()
        featureList.add(ApartmentFeatureModel(R.drawable.ic_feature_1 , "فيربليس"))
        featureList.add(ApartmentFeatureModel(R.drawable.ic_feature_2 , "مطبخ غلوس"))
        featureList.add(ApartmentFeatureModel(R.drawable.ic_feature_3 , "مطبخ ألومنيوم"))
        featureList.add(ApartmentFeatureModel(R.drawable.ic_feature_4 , "مطبخ خشب"))

        featureList.add(ApartmentFeatureModel(R.drawable.ic_feature_5 , "تأسيس مكيفات"))
        featureList.add(ApartmentFeatureModel(R.drawable.ic_feature_6 , "مكيفات راكبة"))
        featureList.add(ApartmentFeatureModel(R.drawable.ic_feature_7 , "تأسيس تدفئة"))
        featureList.add(ApartmentFeatureModel(R.drawable.ic_feature_8 , "تدفئة راكبة"))

        featureList.add(ApartmentFeatureModel(R.drawable.ic_feature_9 , "خلايا شمسية"))
        featureList.add(ApartmentFeatureModel(R.drawable.ic_feature_10 , "سخان شمسي"))
        featureList.add(ApartmentFeatureModel(R.drawable.ic_feature_11 , "اباجورات كهرباء"))
        featureList.add(ApartmentFeatureModel(R.drawable.ic_feature_12 , "زجاج عازل"))

        featureList.add(ApartmentFeatureModel(R.drawable.ic_feature_13 , "منطقة للشوي"))
        featureList.add(ApartmentFeatureModel(R.drawable.ic_feature_14 , "غسيل/خادمة"))
        featureList.add(ApartmentFeatureModel(R.drawable.ic_feature_15 , "مخزن مستقل"))
        featureList.add(ApartmentFeatureModel(R.drawable.ic_feature_16 , "بئر ماء منفصل"))

        featureList.add(ApartmentFeatureModel(R.drawable.ic_feature_17 , "منطقة للألعاب"))
        featureList.add(ApartmentFeatureModel(R.drawable.ic_feature_18 , "مسبح"))
        featureList.add(ApartmentFeatureModel(R.drawable.ic_feature_19 , "موقف سيارة"))


        apartmentFeatureAdapter = ApartmentFeatureAdapter(featureList)
        apartmentFeatureAdapter.notifyDataSetChanged()
        binding.rvDetermineApartmentsFeatures.adapter = apartmentFeatureAdapter

        binding.btnNext.setOnClickListener {
            findNavController().navigate(R.id.action_commericalAdvertismentFragment_to_addAdsImages)
        }
    }

    private fun setType_1Design(){
        binding.tvApartmentCondition.visibility = View.VISIBLE
        binding.radioGroupApartmentCondition.visibility = View.VISIBLE

        binding.tvAgeConstructionYears.visibility = View.VISIBLE
        binding.tlAgeConstructionYears.visibility = View.VISIBLE

        binding.tvFurnished.visibility = View.VISIBLE
        binding.radioGroupFurnished.visibility = View.VISIBLE

        binding.tvNumberBedrooms.visibility = View.VISIBLE
        binding.tilNumberBedrooms.visibility=View.VISIBLE

        binding.tvNumberBathrooms.visibility = View.VISIBLE
        binding.tilNumberBathrooms.visibility=View.VISIBLE

        binding.tvBuildingArea.visibility = View.VISIBLE
        binding.tlBuildingAreaTitle.visibility = View.VISIBLE

        binding.tvLandArea.visibility = View.GONE
        binding.tlLandArea.visibility = View.GONE

        binding.tvFarmArea.visibility = View.GONE
        binding.tlFarmArea.visibility = View.GONE

        binding.tvContainsBuilding.visibility = View.GONE
        binding.radioGroupContainsBuilding.visibility = View.GONE

        binding.tvFarmFeatures.visibility = View.GONE
        binding.rvFarmFeatures.visibility = View.GONE

        binding.tvYearConstruction.visibility = View.GONE
        binding.tlYearConstruction.visibility = View.GONE

        binding.tvTotalNumberApartmentsBuilding.visibility = View.VISIBLE
        binding.tlTotalNumberApartmentsBuilding.visibility = View.VISIBLE

        binding.tvNumberFloorsBuilding.visibility = View.VISIBLE
        binding.tlNumberFloorsBuilding.visibility = View.VISIBLE

        binding.tvFloor.visibility = View.VISIBLE
        binding.tilFloor.visibility = View.VISIBLE


        binding.tvWithGardenGear.visibility = View.VISIBLE
        binding.radioGroupWithGardenGear.visibility = View.VISIBLE

        binding.tvGearAreaSquareMetres.visibility = View.VISIBLE
        binding.tlGearAreaSquareMetres.visibility = View.VISIBLE

        binding.tvWithRoof.visibility = View.VISIBLE
        binding.radioGroupWithRoof.visibility = View.VISIBLE

        binding.tvRoofAreaSquareMetres.visibility = View.VISIBLE
        binding.tlRoofAreaSquareMetres.visibility = View.VISIBLE

        binding.tvNumberUnitsBuilding.visibility = View.GONE
        binding.tlNumberUnitsBuilding.visibility = View.GONE

        binding.radioGroupResidentialBuilding.visibility = View.GONE

        binding.tvDetermineApartmentsFeatures.visibility = View.VISIBLE
        binding.rvDetermineApartmentsFeatures.visibility = View.VISIBLE

        binding.tvFacadeStreet.visibility = View.GONE
        binding.tlFacadeStreet.visibility = View.GONE

        binding.tvRate.visibility = View.GONE
        binding.rvRate.visibility = View.GONE

        binding.tvLandOrganization.visibility = View.GONE
        binding.rvLandOrganization.visibility = View.GONE
    }
    private fun setType_3Design(){
        binding.tvApartmentCondition.visibility = View.GONE
        binding.radioGroupApartmentCondition.visibility = View.GONE

        binding.tvAgeConstructionYears.visibility = View.VISIBLE
        binding.tlAgeConstructionYears.visibility = View.VISIBLE

        binding.tvFurnished.visibility = View.GONE
        binding.radioGroupFurnished.visibility = View.GONE

        binding.tvNumberBedrooms.visibility = View.GONE
        binding.tilNumberBedrooms.visibility=View.GONE

        binding.tvNumberBathrooms.visibility = View.GONE
        binding.tilNumberBathrooms.visibility=View.GONE

        binding.tvBuildingArea.visibility = View.VISIBLE
        binding.tlBuildingAreaTitle.visibility = View.VISIBLE

        binding.tvLandArea.visibility = View.VISIBLE
        binding.tlLandArea.visibility = View.VISIBLE

        binding.tvFarmArea.visibility = View.GONE
        binding.tlFarmArea.visibility = View.GONE

        binding.tvContainsBuilding.visibility = View.GONE
        binding.radioGroupContainsBuilding.visibility = View.GONE

        binding.tvFarmFeatures.visibility = View.GONE
        binding.rvFarmFeatures.visibility = View.GONE

        binding.tvYearConstruction.visibility = View.GONE
        binding.tlYearConstruction.visibility = View.GONE

        binding.tvTotalNumberApartmentsBuilding.visibility = View.GONE
        binding.tlTotalNumberApartmentsBuilding.visibility = View.GONE

        binding.tvNumberFloorsBuilding.visibility = View.VISIBLE
        binding.tlNumberFloorsBuilding.visibility = View.VISIBLE

        binding.tvFloor.visibility = View.GONE
        binding.tilFloor.visibility = View.GONE


        binding.tvWithGardenGear.visibility = View.GONE
        binding.radioGroupWithGardenGear.visibility = View.GONE

        binding.tvGearAreaSquareMetres.visibility = View.GONE
        binding.tlGearAreaSquareMetres.visibility = View.GONE

        binding.tvWithRoof.visibility = View.GONE
        binding.radioGroupWithRoof.visibility = View.GONE

        binding.tvRoofAreaSquareMetres.visibility = View.GONE
        binding.tlRoofAreaSquareMetres.visibility = View.GONE

        binding.tvNumberUnitsBuilding.visibility = View.VISIBLE
        binding.tlNumberUnitsBuilding.visibility = View.VISIBLE

        binding.radioGroupResidentialBuilding.visibility = View.VISIBLE

        binding.tvDetermineApartmentsFeatures.visibility = View.GONE
        binding.rvDetermineApartmentsFeatures.visibility = View.GONE

        binding.tvFacadeStreet.visibility = View.GONE
        binding.tlFacadeStreet.visibility = View.GONE

        binding.tvRate.visibility = View.GONE
        binding.rvRate.visibility = View.GONE

        binding.tvLandOrganization.visibility = View.GONE
        binding.rvLandOrganization.visibility = View.GONE
    }
    private fun setType_4Design(){
        binding.tvApartmentCondition.visibility = View.GONE
        binding.radioGroupApartmentCondition.visibility = View.GONE

        binding.tvAgeConstructionYears.visibility = View.GONE
        binding.tlAgeConstructionYears.visibility = View.GONE

        binding.tvFurnished.visibility = View.GONE
        binding.radioGroupFurnished.visibility = View.GONE

        binding.tvNumberBedrooms.visibility = View.GONE
        binding.tilNumberBedrooms.visibility=View.GONE

        binding.tvNumberBathrooms.visibility = View.GONE
        binding.tilNumberBathrooms.visibility=View.GONE

        binding.tvBuildingArea.visibility = View.GONE
        binding.tlBuildingAreaTitle.visibility = View.GONE

        binding.tvLandArea.visibility = View.VISIBLE
        binding.tlLandArea.visibility = View.VISIBLE

        binding.tvFarmArea.visibility = View.GONE
        binding.tlFarmArea.visibility = View.GONE

        binding.tvContainsBuilding.visibility = View.GONE
        binding.radioGroupContainsBuilding.visibility = View.GONE

        binding.tvFarmFeatures.visibility = View.GONE
        binding.rvFarmFeatures.visibility = View.GONE

        binding.tvYearConstruction.visibility = View.GONE
        binding.tlYearConstruction.visibility = View.GONE

        binding.tvTotalNumberApartmentsBuilding.visibility = View.GONE
        binding.tlTotalNumberApartmentsBuilding.visibility = View.GONE

        binding.tvNumberFloorsBuilding.visibility = View.GONE
        binding.tlNumberFloorsBuilding.visibility = View.GONE

        binding.tvFloor.visibility = View.GONE
        binding.tilFloor.visibility = View.GONE


        binding.tvWithGardenGear.visibility = View.GONE
        binding.radioGroupWithGardenGear.visibility = View.GONE

        binding.tvGearAreaSquareMetres.visibility = View.GONE
        binding.tlGearAreaSquareMetres.visibility = View.GONE

        binding.tvWithRoof.visibility = View.GONE
        binding.radioGroupWithRoof.visibility = View.GONE

        binding.tvRoofAreaSquareMetres.visibility = View.GONE
        binding.tlRoofAreaSquareMetres.visibility = View.GONE

        binding.tvNumberUnitsBuilding.visibility = View.GONE
        binding.tlNumberUnitsBuilding.visibility = View.GONE

        binding.radioGroupResidentialBuilding.visibility = View.GONE

        binding.tvDetermineApartmentsFeatures.visibility = View.GONE
        binding.rvDetermineApartmentsFeatures.visibility = View.GONE

        binding.tvFacadeStreet.visibility = View.VISIBLE
        binding.tlFacadeStreet.visibility = View.VISIBLE

        binding.tvRate.visibility = View.VISIBLE
        binding.rvRate.visibility = View.VISIBLE

        binding.tvLandOrganization.visibility = View.VISIBLE
        binding.rvLandOrganization.visibility = View.VISIBLE
    }
    private fun setType_5Design(){
        binding.tvApartmentCondition.visibility = View.VISIBLE
        binding.radioGroupApartmentCondition.visibility = View.VISIBLE

        binding.tvAgeConstructionYears.visibility = View.VISIBLE
        binding.tlAgeConstructionYears.visibility = View.VISIBLE

        binding.tvFurnished.visibility = View.VISIBLE
        binding.radioGroupFurnished.visibility = View.VISIBLE

        binding.tvNumberBedrooms.visibility = View.VISIBLE
        binding.tilNumberBedrooms.visibility=View.VISIBLE

        binding.tvNumberBathrooms.visibility = View.VISIBLE
        binding.tilNumberBathrooms.visibility=View.VISIBLE

        binding.tvBuildingArea.visibility = View.VISIBLE
        binding.tlBuildingAreaTitle.visibility = View.VISIBLE

        binding.tvLandArea.visibility = View.VISIBLE
        binding.tlLandArea.visibility = View.VISIBLE

        binding.tvFarmArea.visibility = View.GONE
        binding.tlFarmArea.visibility = View.GONE

        binding.tvContainsBuilding.visibility = View.GONE
        binding.radioGroupContainsBuilding.visibility = View.GONE

        binding.tvFarmFeatures.visibility = View.GONE
        binding.rvFarmFeatures.visibility = View.GONE

        binding.tvYearConstruction.visibility = View.GONE
        binding.tlYearConstruction.visibility = View.GONE

        binding.tvTotalNumberApartmentsBuilding.visibility = View.GONE
        binding.tlTotalNumberApartmentsBuilding.visibility = View.GONE

        binding.tvNumberFloorsBuilding.visibility = View.GONE
        binding.tlNumberFloorsBuilding.visibility = View.GONE

        binding.tvFloor.visibility = View.GONE
        binding.tilFloor.visibility = View.GONE


        binding.tvWithGardenGear.visibility = View.GONE
        binding.radioGroupWithGardenGear.visibility = View.GONE

        binding.tvGearAreaSquareMetres.visibility = View.GONE
        binding.tlGearAreaSquareMetres.visibility = View.GONE

        binding.tvWithRoof.visibility = View.GONE
        binding.radioGroupWithRoof.visibility = View.GONE

        binding.tvRoofAreaSquareMetres.visibility = View.GONE
        binding.tlRoofAreaSquareMetres.visibility = View.GONE

        binding.tvNumberUnitsBuilding.visibility = View.GONE
        binding.tlNumberUnitsBuilding.visibility = View.GONE

        binding.radioGroupResidentialBuilding.visibility = View.GONE

        binding.tvDetermineApartmentsFeatures.visibility = View.VISIBLE
        binding.rvDetermineApartmentsFeatures.visibility = View.VISIBLE

        binding.tvFacadeStreet.visibility = View.GONE
        binding.tlFacadeStreet.visibility = View.GONE

        binding.tvRate.visibility = View.GONE
        binding.rvRate.visibility = View.GONE

        binding.tvLandOrganization.visibility = View.GONE
        binding.rvLandOrganization.visibility = View.GONE
    }
    private fun setType_6Design(){
        binding.tvApartmentCondition.visibility = View.GONE
        binding.radioGroupApartmentCondition.visibility = View.GONE

        binding.tvAgeConstructionYears.visibility = View.GONE
        binding.tlAgeConstructionYears.visibility = View.GONE

        binding.tvFurnished.visibility = View.GONE
        binding.radioGroupFurnished.visibility = View.GONE

        binding.tvNumberBedrooms.visibility = View.VISIBLE
        binding.tilNumberBedrooms.visibility=View.VISIBLE

        binding.tvNumberBathrooms.visibility = View.VISIBLE
        binding.tilNumberBathrooms.visibility=View.VISIBLE

        binding.tvBuildingArea.visibility = View.VISIBLE
        binding.tlBuildingAreaTitle.visibility = View.VISIBLE

        binding.tvLandArea.visibility = View.GONE
        binding.tlLandArea.visibility = View.GONE

        binding.tvFarmArea.visibility = View.VISIBLE
        binding.tlFarmArea.visibility = View.VISIBLE

        binding.tvContainsBuilding.visibility = View.VISIBLE
        binding.radioGroupContainsBuilding.visibility = View.VISIBLE

        binding.tvFarmFeatures.visibility = View.VISIBLE
        binding.rvFarmFeatures.visibility = View.VISIBLE

        binding.tvYearConstruction.visibility = View.GONE
        binding.tlYearConstruction.visibility = View.GONE

        binding.tvTotalNumberApartmentsBuilding.visibility = View.GONE
        binding.tlTotalNumberApartmentsBuilding.visibility = View.GONE

        binding.tvNumberFloorsBuilding.visibility = View.GONE
        binding.tlNumberFloorsBuilding.visibility = View.GONE

        binding.tvFloor.visibility = View.GONE
        binding.tilFloor.visibility = View.GONE


        binding.tvWithGardenGear.visibility = View.GONE
        binding.radioGroupWithGardenGear.visibility = View.GONE

        binding.tvGearAreaSquareMetres.visibility = View.GONE
        binding.tlGearAreaSquareMetres.visibility = View.GONE

        binding.tvWithRoof.visibility = View.GONE
        binding.radioGroupWithRoof.visibility = View.GONE

        binding.tvRoofAreaSquareMetres.visibility = View.GONE
        binding.tlRoofAreaSquareMetres.visibility = View.GONE

        binding.tvNumberUnitsBuilding.visibility = View.GONE
        binding.tlNumberUnitsBuilding.visibility = View.GONE

        binding.radioGroupResidentialBuilding.visibility = View.GONE

        binding.tvDetermineApartmentsFeatures.visibility = View.VISIBLE
        binding.rvDetermineApartmentsFeatures.visibility = View.VISIBLE

        binding.tvFacadeStreet.visibility = View.GONE
        binding.tlFacadeStreet.visibility = View.GONE

        binding.tvRate.visibility = View.GONE
        binding.rvRate.visibility = View.GONE

        binding.tvLandOrganization.visibility = View.GONE
        binding.rvLandOrganization.visibility = View.GONE
    }

}
data class ApartmentFeatureModel(
    val image: Int, val text: String)