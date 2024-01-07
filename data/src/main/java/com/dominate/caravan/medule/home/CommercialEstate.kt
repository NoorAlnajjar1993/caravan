package com.dominate.caravan.medule.home

import com.dominate.caravan.medule.profile.profile.Profile

data class CommercialEstate(
    val building_area: Double,
    val date: String,
    val description: String,
    val hospital_rating: String,
    val hotel_rating: String,
    val id: Int,
    val installment_payment: Boolean,
    val is_new: Boolean,
    val is_rented: Boolean,
    val is_the_location_approximate: Boolean,
    val land_area: Double,
    val lat: Double,
    val long: Double,
    val media: List<Media>,
    var is_favorite: Boolean,
    val number_of_bathroom: Int,
    val number_of_bed: Int,
    val number_of_bedroom: Int,
    val number_of_floors: Int,
    val phone_number: String,
    val price: Double,
    val property_ownership: Int,
    val region: String,
    val school_rating: String,
    val title: String,
    val type: Type,
    val typeOfAds: TypeOfAds,
    val type_of_organization: Int,
    val user: Profile,
    val video: List<Any>,
    val whatsapp: String,
    val year_of_construction: Int
)