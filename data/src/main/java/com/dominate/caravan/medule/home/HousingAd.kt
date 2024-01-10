package com.dominate.caravan.medule.home

import com.dominate.caravan.medule.profile.profile.Profile

data class HousingAd(
    val availableFloors: Int,
    val date: String,
    val description: String,
    val garden_area: Double,
    val id: Int,
    val installment_payment: Boolean = false,
    var is_favorite: Boolean,
    val is_the_location_approximate: Boolean,
    val lat: String,
    val long: String,
    val media: List<Media>,
    val typeOfAds: TypeOfAds? = null,
    val numberOfBathrooms: Int,
    val numberOfBedrooms: Int,
    val numberOfFloors: Int,
    val phone_number: String,
    val price: Double,
    val property_ownership: Int = 1,
    val region: String,
    val roof_area: Double,
    val title: String,
    val totalNumberOfApartment: Int,
    val totalNumberOfApartmentInFloor: Int,
    val user: Profile? = null,
    val videos: List<Any>,
    val whatsapp: String,
    val with_garden: Boolean,
    val with_roof: Boolean,
    val age_of_construction: Int,
    val is_featured: Boolean,
    val land_area: Double,
    val floor: String = "",
    val bathrooms_number: Int,
    val bedrooms_number: Int,
    val is_new: Boolean,
    val building_apartments: Int
    )