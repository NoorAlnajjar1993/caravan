package com.dominate.caravan.ui.addads.complete

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.caravan.R
import com.caravan.databinding.FragmentCompleteBinding
import com.dominate.caravan.core.autoCleared
import com.dominate.caravan.core.base.BaseFragment
import com.dominate.caravan.medule.home.CommercialAd
import com.dominate.caravan.medule.home.CommercialEstate
import com.dominate.caravan.medule.home.HousingAd
import com.dominate.caravan.medule.home.RealEstateAd
import com.dominate.caravan.ui.addads.AddAdsViewModel
import com.dominate.caravan.ui.addads.addadsimages.AddAdsImages
import com.dominate.caravan.ui.home.HomeActivity
import com.dominate.caravan.utils.Resource
import com.vdx.designertoast.DesignerToast
import dagger.hilt.android.AndroidEntryPoint
import okhttp3.RequestBody.Companion.toRequestBody

@AndroidEntryPoint
class CompleteFragment : BaseFragment(), TextWatcher {

    var binding: FragmentCompleteBinding by autoCleared()
    private val viewModel: AddAdsViewModel by viewModels()
    var token: String? = ""


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCompleteBinding.inflate(inflater, container, false)

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

        try {
            token = prefs.getCurrentUser().token
        } catch (ec: Exception) {
        }

        binding.constraintLayout01.setOnClickListener {
            findNavController().navigate(R.id.action_completeFragment_to_featureAdsFragment)
        }
        if (AddAdsImages.type == "real_estate") {
            observeCreateRealStateAds()
        } else if (AddAdsImages.type == "commercial_estate") {
            observeCreateCommercialEstateAds()
        } else if (AddAdsImages.type == "housing") {
            observeCreateHousingAds()
        } else if (AddAdsImages.type == "commercial") {
            observeCreateCommercialAds()
        }

        binding.ivBack.setOnClickListener {
            findNavController().navigate(R.id.action_completeFragment_to_homeFragment)
        }

    }

    private fun observeCreateCommercialAds() {
        viewModel.createCommercialAds(
            token = token!!,
            type_id = AddAdsImages.AddCommercialAdsModel.type_id.toString().toRequestBody(),
            title = AddAdsImages.AddCommercialAdsModel.title.toString().toRequestBody(),
            description = AddAdsImages.AddCommercialAdsModel.description.toString().toRequestBody(),
            property_ownership = AddAdsImages.AddCommercialAdsModel.property_ownership.toString()
                .toRequestBody(),
            installment_payment = AddAdsImages.AddCommercialAdsModel.installment_payment.toString()
                .toRequestBody(),
            price = AddAdsImages.AddCommercialAdsModel.price.toString().toRequestBody(),
            region = AddAdsImages.AddCommercialAdsModel.region.toString().toRequestBody(),
            phone_number = AddAdsImages.AddCommercialAdsModel.phone_number.toString().toRequestBody(),
            whatsapp = AddAdsImages.AddCommercialAdsModel.whatsapp.toString().toRequestBody(),
            lat = AddAdsImages.AddCommercialAdsModel.lat.toString().toRequestBody(),
            long = AddAdsImages.AddCommercialAdsModel.long.toString().toRequestBody(),
            is_the_location_approximate = AddAdsImages.AddCommercialAdsModel.is_the_location_approximate.toString()
                .toRequestBody(),
            media = AddAdsImages.AddCommercialAdsModel.media,
            street = AddAdsImages.AddCommercialAdsModel.street.toString().toRequestBody(),
            typeOfAds =  AddAdsImages.AddCommercialAdsModel.typeOfAds.toString().toRequestBody()
        )
        viewModel.createCommercialAdsResponse.observe(viewLifecycleOwner, Observer {

            if (it.status == Resource.Status.SUCCESS) {

            }

            if (it.status == Resource.Status.ERROR) {
                Toast.makeText(
                    context,
                    it.message.toString(),
                    Toast.LENGTH_SHORT
                ).show()
            }
        })
    }

    private fun observeCreateRealStateAds() {
        viewModel.createRealStateAds(
            token = token!!,
            is_new = AddAdsImages.realStateAdsModel.is_new.toString().toRequestBody(),
            is_commercial = AddAdsImages.realStateAdsModel.is_commercial.toString().toRequestBody(),
            age_of_construction = AddAdsImages.realStateAdsModel.age_of_construction.toRequestBody(),
            is_finished = AddAdsImages.realStateAdsModel.is_finished.toString().toRequestBody(),
            bedrooms_number = AddAdsImages.realStateAdsModel.bedrooms_number.toString()
                .toRequestBody(),
            bathrooms_number = AddAdsImages.realStateAdsModel.bathrooms_number.toString()
                .toRequestBody(),
            building_floors = AddAdsImages.realStateAdsModel.building_floors.toString()
                .toRequestBody(),
            building_apartments = AddAdsImages.realStateAdsModel.building_apartments.toString()
                .toRequestBody(),
            building_units = AddAdsImages.realStateAdsModel.building_units.toString()
                .toRequestBody(),
            floor = AddAdsImages.realStateAdsModel.floor.toString().toRequestBody(),
            with_garden = AddAdsImages.realStateAdsModel.with_garden.toString().toRequestBody(),
            garden_area = AddAdsImages.realStateAdsModel.garden_area.toString().toRequestBody(),
            with_roof = AddAdsImages.realStateAdsModel.with_roof.toString().toRequestBody(),
            roof_area = AddAdsImages.realStateAdsModel.roof_area.toString().toRequestBody(),
            building_area = AddAdsImages.realStateAdsModel.building_area.toString().toRequestBody(),
            land_area = AddAdsImages.realStateAdsModel.land_area.toString().toRequestBody(),
            land_level = AddAdsImages.realStateAdsModel.land_level.toString().toRequestBody(),
            land_organization = AddAdsImages.realStateAdsModel.land_organization.toString()
                .toRequestBody(),
            title = AddAdsImages.realStateAdsModel.title.toString().toRequestBody(),
            description = AddAdsImages.realStateAdsModel.description.toString().toRequestBody(),
            property_ownership = AddAdsImages.realStateAdsModel.property_ownership.toString()
                .toRequestBody(),
            installment_payment = AddAdsImages.realStateAdsModel.installment_payment.toString()
                .toRequestBody(),
            price = AddAdsImages.realStateAdsModel.price.toString().toRequestBody(),
            region = AddAdsImages.realStateAdsModel.region.toString().toRequestBody(),
            phone_number = AddAdsImages.realStateAdsModel.phone_number.toString().toRequestBody(),
            whatsapp = AddAdsImages.realStateAdsModel.whatsapp.toString().toRequestBody(),
            lat = AddAdsImages.realStateAdsModel.lat.toString().toRequestBody(),
            long = AddAdsImages.realStateAdsModel.long.toString().toRequestBody(),
            is_the_location_approximate = AddAdsImages.realStateAdsModel.is_the_location_approximate.toString()
                .toRequestBody(),
            media = AddAdsImages.realStateAdsModel.media,
            street = AddAdsImages.realStateAdsModel.street.toString().toRequestBody(),
            farmArea = AddAdsImages.realStateAdsModel.farmArea.toString().toRequestBody(),
            property_id =  AddAdsImages.realStateAdsModel.property_id.toString().toRequestBody(),
            typeOfAds =  AddAdsImages.realStateAdsModel.typeOfAds.toString().toRequestBody()
        )
        viewModel.createRealStateAdsResponse.observe(viewLifecycleOwner, Observer {

            if (it.status == Resource.Status.SUCCESS) {

            }

            if (it.status == Resource.Status.ERROR) {
                Toast.makeText(
                    context,
                    it.message.toString(),
                    Toast.LENGTH_SHORT
                ).show()
            }
        })
    }
    private fun observeCreateCommercialEstateAds() {
        viewModel.createCommercialEstateAds(
            token = token!!,
            is_new = AddAdsImages.AddCommercialEStateAdsModel.is_new.toString().toRequestBody(),
            year_of_construction = AddAdsImages.AddCommercialEStateAdsModel.year_of_construction.toString().toRequestBody(),
            building_area = AddAdsImages.AddCommercialEStateAdsModel.building_area.toRequestBody(),
            land_area = AddAdsImages.AddCommercialEStateAdsModel.land_area.toString().toRequestBody(),
            type_of_organization = AddAdsImages.AddCommercialEStateAdsModel.type_of_organization.toString()
                .toRequestBody(),
            is_rented = AddAdsImages.AddCommercialEStateAdsModel.is_rented.toString()
                .toRequestBody(),
            number_of_bedroom = AddAdsImages.AddCommercialEStateAdsModel.number_of_bedroom.toString()
                .toRequestBody(),
            number_of_bed = AddAdsImages.AddCommercialEStateAdsModel.number_of_bed.toString()
                .toRequestBody(),
            number_of_bathroom = AddAdsImages.AddCommercialEStateAdsModel.number_of_bathroom.toString()
                .toRequestBody(),
            number_of_floors = AddAdsImages.AddCommercialEStateAdsModel.number_of_floors.toString().toRequestBody(),
            hotel_rating = AddAdsImages.AddCommercialEStateAdsModel.hotel_rating.toString().toRequestBody(),
            hospital_rating = AddAdsImages.AddCommercialEStateAdsModel.hospital_rating.toString().toRequestBody(),
            school_rating = AddAdsImages.AddCommercialEStateAdsModel.school_rating.toString().toRequestBody(),
            type = AddAdsImages.AddCommercialEStateAdsModel.type.toString().toRequestBody(),
            title = AddAdsImages.AddCommercialEStateAdsModel.title.toString().toRequestBody(),
            description = AddAdsImages.AddCommercialEStateAdsModel.description.toString().toRequestBody(),
            property_ownership = AddAdsImages.AddCommercialEStateAdsModel.property_ownership.toString()
                .toRequestBody(),
            installment_payment = AddAdsImages.AddCommercialEStateAdsModel.installment_payment.toString()
                .toRequestBody(),
            price = AddAdsImages.AddCommercialEStateAdsModel.price.toString().toRequestBody(),
            region = AddAdsImages.AddCommercialEStateAdsModel.region.toString().toRequestBody(),
            phone_number = AddAdsImages.AddCommercialEStateAdsModel.phone_number.toString().toRequestBody(),
            whatsapp = AddAdsImages.AddCommercialEStateAdsModel.whatsapp.toString().toRequestBody(),
            lat = AddAdsImages.AddCommercialEStateAdsModel.lat.toString().toRequestBody(),
            long = AddAdsImages.AddCommercialEStateAdsModel.long.toString().toRequestBody(),
            is_the_location_approximate = AddAdsImages.AddCommercialEStateAdsModel.is_the_location_approximate.toString()
                .toRequestBody(),
            media = AddAdsImages.AddCommercialEStateAdsModel.media,
            street = AddAdsImages.AddCommercialEStateAdsModel.street.toString().toRequestBody(),
            property_id =  AddAdsImages.AddCommercialEStateAdsModel.property_id.toString().toRequestBody(),
            typeOfAds =  AddAdsImages.AddCommercialEStateAdsModel.typeOfAds.toString().toRequestBody()
        )
        viewModel.createCommercialEstateAdsResponse.observe(viewLifecycleOwner, Observer {

            if (it.status == Resource.Status.SUCCESS) {

            }

            if (it.status == Resource.Status.ERROR) {
                Toast.makeText(
                    context,
                    it.message.toString(),
                    Toast.LENGTH_SHORT
                ).show()
            }
        })
    }
    private fun observeCreateHousingAds() {
        viewModel.createHousingAds(
            token = token!!,
            building_apartments = AddAdsImages.AddHousingAdsModel.building_apartments.toString().toRequestBody(),
            floor = AddAdsImages.AddHousingAdsModel.floor.toString().toRequestBody(),
            with_garden = AddAdsImages.AddHousingAdsModel.with_garden.toString().toRequestBody(),
            garden_area = AddAdsImages.AddHousingAdsModel.garden_area.toString().toRequestBody(),
            with_roof = AddAdsImages.AddHousingAdsModel.with_roof.toString()
                .toRequestBody(),
            roof_area = AddAdsImages.AddHousingAdsModel.roof_area.toString()
                .toRequestBody(),
            numberOfBedrooms = AddAdsImages.AddHousingAdsModel.numberOfBedrooms.toString()
                .toRequestBody(),
            numberOfBathrooms = AddAdsImages.AddHousingAdsModel.numberOfBathrooms.toString()
                .toRequestBody(),
            numberOfFloors = AddAdsImages.AddHousingAdsModel.numberOfFloors.toString()
                .toRequestBody(),
            minAreaSpaceText = AddAdsImages.AddHousingAdsModel.minAreaSpaceText.toString().toRequestBody(),
            maxAreaSpaceText = AddAdsImages.AddHousingAdsModel.maxAreaSpaceText.toString().toRequestBody(),
            totalNumberOfApartment = AddAdsImages.AddHousingAdsModel.totalNumberOfApartment.toString().toRequestBody(),
            totalNumberOfApartmentInFloor = AddAdsImages.AddHousingAdsModel.totalNumberOfApartmentInFloor.toString().toRequestBody(),
            availableFloors = AddAdsImages.AddHousingAdsModel.availableFloors.toString().toRequestBody(),
            title = AddAdsImages.AddHousingAdsModel.title.toString().toRequestBody(),
            description = AddAdsImages.AddHousingAdsModel.description.toString().toRequestBody(),
            property_ownership = AddAdsImages.AddHousingAdsModel.property_ownership.toString()
                .toRequestBody(),
            installment_payment = AddAdsImages.AddHousingAdsModel.installment_payment.toString()
                .toRequestBody(),
            price = AddAdsImages.AddHousingAdsModel.price.toString().toRequestBody(),
            region = AddAdsImages.AddHousingAdsModel.region.toString().toRequestBody(),
            phone_number = AddAdsImages.AddHousingAdsModel.phone_number.toString().toRequestBody(),
            whatsapp = AddAdsImages.AddHousingAdsModel.whatsapp.toString().toRequestBody(),
            lat = AddAdsImages.AddHousingAdsModel.lat.toString().toRequestBody(),
            long = AddAdsImages.AddHousingAdsModel.long.toString().toRequestBody(),
            is_the_location_approximate = AddAdsImages.AddHousingAdsModel.is_the_location_approximate.toString()
                .toRequestBody(),
            media = AddAdsImages.AddHousingAdsModel.media,
            street = AddAdsImages.AddHousingAdsModel.street.toString().toRequestBody(),
            typeOfAds =  AddAdsImages.AddHousingAdsModel.typeOfAds.toString().toRequestBody()
        )
        viewModel.createHousingAdsResponse.observe(viewLifecycleOwner, Observer {

            if (it.status == Resource.Status.SUCCESS) {

            }

            if (it.status == Resource.Status.ERROR) {
                Toast.makeText(
                    context,
                    it.message.toString(),
                    Toast.LENGTH_SHORT
                ).show()
            }
        })
    }
    fun showErrorToast(message: String) {
        DesignerToast.Custom(
            requireContext(), message, Gravity.TOP or Gravity.FILL_HORIZONTAL, Toast.LENGTH_SHORT,
            R.drawable.purple_gradient, 16, "#FFFFFF", R.drawable.ic_close_purple, 55, 219
        )
    }

}