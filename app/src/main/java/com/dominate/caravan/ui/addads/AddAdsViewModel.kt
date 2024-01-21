package com.dominate.caravan.ui.addads

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dominate.caravan.medule.ExpectedResponse
import com.dominate.caravan.retrofit.data.HomeDataSource
import com.dominate.caravan.retrofit.data.ProfileDataSource
import com.dominate.caravan.utils.Resource
import kotlinx.coroutines.launch
import okhttp3.MultipartBody
import okhttp3.RequestBody

class AddAdsViewModel @ViewModelInject constructor(
    val homeDataSource: HomeDataSource
) : ViewModel() {

    val createRealStateAdsResponse = MutableLiveData<Resource<Any>>()
    val createCommercialEstateAdsResponse = MutableLiveData<Resource<Any>>()
    val createHousingAdsResponse = MutableLiveData<Resource<Any>>()
    val createCommercialAdsResponse = MutableLiveData<Resource<Any>>()




    fun createRealStateAds(
        token:String,
        is_new: RequestBody,
        is_commercial: RequestBody,
        age_of_construction: RequestBody,
        is_finished: RequestBody,
        bedrooms_number: RequestBody,
        bathrooms_number: RequestBody,
        building_floors: RequestBody,
        building_apartments: RequestBody,
        building_units: RequestBody,
        floor: RequestBody,
        with_garden: RequestBody,
        garden_area: RequestBody,
        with_roof: RequestBody,
        roof_area: RequestBody,
        building_area: RequestBody,
        land_area: RequestBody,
        land_level: RequestBody,
        land_organization: RequestBody,
        title: RequestBody,
        description: RequestBody,
        property_ownership: RequestBody,
        installment_payment: RequestBody,
        price: RequestBody,
        region: RequestBody,
        phone_number: RequestBody,
        whatsapp: RequestBody,
        lat: RequestBody,
        long: RequestBody,
        is_the_location_approximate: RequestBody,
        street: RequestBody,
        farmArea: RequestBody,
        media: List<MultipartBody.Part>?,
        property_id: RequestBody,
        typeOfAds: RequestBody
    ) {
        viewModelScope.launch {
            val response = homeDataSource.createRealStateAds(
                token,
                is_new,
                is_commercial,
                age_of_construction,
                is_finished,
                bedrooms_number,
                bathrooms_number,
                building_floors,
                building_apartments,
                building_units,
                floor,
                with_garden,
                garden_area,
                with_roof,
                roof_area,
                building_area,
                land_area,
                land_level,
                land_organization,
                title,
                description,
                property_ownership,
                installment_payment,
                price,
                region,
                phone_number,
                whatsapp,
                lat,
                long,
                is_the_location_approximate,
                street,
                farmArea,
                media,
                property_id,
                typeOfAds
            )
            createRealStateAdsResponse.postValue(response)
        }
    }

    fun createCommercialEstateAds(
        token:String,
        is_new: RequestBody,
        year_of_construction: RequestBody,
        building_area: RequestBody,
        land_area: RequestBody,
        type_of_organization: RequestBody,
        is_rented: RequestBody,
        number_of_bedroom: RequestBody,
        number_of_bed: RequestBody,
        number_of_bathroom: RequestBody,
        number_of_floors: RequestBody,
        hotel_rating: RequestBody,
        hospital_rating: RequestBody,
        school_rating: RequestBody,
        type: RequestBody,
        title: RequestBody,
        description: RequestBody,
        property_ownership: RequestBody,
        installment_payment: RequestBody,
        price: RequestBody,
        region: RequestBody,
        phone_number: RequestBody,
        whatsapp: RequestBody,
        lat: RequestBody,
        long: RequestBody,
        is_the_location_approximate: RequestBody,
        street: RequestBody,
        media: List<MultipartBody.Part>?,
        property_id: RequestBody,
        typeOfAds: RequestBody
    ) {
        viewModelScope.launch {
            val response = homeDataSource.createCommercialEstateAds(
                token,
                is_new,
                year_of_construction,
                building_area,
                land_area,
                type_of_organization,
                is_rented,
                number_of_bedroom,
                number_of_bed,
                number_of_bathroom,
                number_of_floors,
                hotel_rating,
                hospital_rating,
                school_rating,
                type,
                title,
                description,
                property_ownership,
                installment_payment,
                price,
                region,
                phone_number,
                whatsapp,
                lat,
                long,
                is_the_location_approximate,
                street,
                media,
                property_id,
                typeOfAds
            )
            createCommercialEstateAdsResponse.postValue(response)
        }
    }


    fun createHousingAds(
        token:String,
        building_apartments: RequestBody,
        floor: RequestBody,
        with_garden: RequestBody,
        garden_area: RequestBody,
        with_roof: RequestBody,
        roof_area: RequestBody,
        numberOfBedrooms: RequestBody,
        numberOfBathrooms: RequestBody,
        numberOfFloors: RequestBody,
        minAreaSpaceText: RequestBody,
        maxAreaSpaceText: RequestBody,
        totalNumberOfApartment: RequestBody,
        totalNumberOfApartmentInFloor: RequestBody,
        availableFloors: RequestBody,
        title: RequestBody,
        description: RequestBody,
        property_ownership: RequestBody,
        installment_payment: RequestBody,
        price: RequestBody,
        region: RequestBody,
        phone_number: RequestBody,
        whatsapp: RequestBody,
        lat: RequestBody,
        long: RequestBody,
        is_the_location_approximate: RequestBody,
        street: RequestBody,
        media: List<MultipartBody.Part>?,
        typeOfAds: RequestBody
    ) {
        viewModelScope.launch {
            val response = homeDataSource.createHousingAds(
                token,
                building_apartments,
                floor,
                with_garden,
                garden_area,
                with_roof,
                roof_area,
                numberOfBedrooms,
                numberOfBathrooms,
                numberOfFloors,
                minAreaSpaceText,
                maxAreaSpaceText,
                totalNumberOfApartment,
                totalNumberOfApartmentInFloor,
                availableFloors,
                title,
                description,
                property_ownership,
                installment_payment,
                price,
                region,
                phone_number,
                whatsapp,
                lat,
                long,
                is_the_location_approximate,
                street,
                media,
                typeOfAds
            )
            createHousingAdsResponse.postValue(response)
        }
    }


    fun createCommercialAds(
        token:String,
        type_id: RequestBody,
        title: RequestBody,
        description: RequestBody,
        property_ownership: RequestBody,
        installment_payment: RequestBody,
        price: RequestBody,
        region: RequestBody,
        phone_number: RequestBody,
        whatsapp: RequestBody,
        lat: RequestBody,
        long: RequestBody,
        is_the_location_approximate: RequestBody,
        street: RequestBody,
        media: List<MultipartBody.Part>?,
        typeOfAds: RequestBody
    ) {
        viewModelScope.launch {
            val response = homeDataSource.createCommercialAds(
                token,
                type_id,
                title,
                description,
                property_ownership,
                installment_payment,
                price,
                region,
                phone_number,
                whatsapp,
                lat,
                long,
                is_the_location_approximate,
                street,
                media,
                typeOfAds
            )
            createCommercialAdsResponse.postValue(response)
        }
    }

}