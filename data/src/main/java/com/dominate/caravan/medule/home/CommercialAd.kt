package com.dominate.caravan.medule.home

import com.dominate.caravan.medule.profile.profile.Profile

data class CommercialAd(
    val date: String? = null,
    val description: String? = null,
    val id: Int? = null,
    val installment_payment: Boolean? = false,
    val is_the_location_approximate: Boolean? = false,
    val lat: Double? = null,
    val long: Double? = null,
    val media: List<Media>? = null,
    var is_favorite: Boolean? = false,
    val phone_number: String? = null,
    val price: Double? = null,
    val property_ownership: Int? = null,
    val region: String? = null,
    val land_area: Double? = null,
    val number_of_bed: Int? = null,
    val title: String? = null,
    val type: Type? = null,
    val user: Profile? = null,
    val videos: List<Any>? = null,
    val whatsapp: String? = null,
    val age_of_construction: Int ? = null,
    val is_featured: Boolean? = false,
    val floor: String? = null,
    val bathrooms_number: Int? = null,
    val is_new: Boolean? = false,
    val building_apartments: Int? = null,
    val with_garden: Boolean? = false,
    val with_roof: Boolean? = false,
    val garden_area: Double? = null,
    val roof_area: Double? = null,
    val building_area: Double? = null,
    val typeOfAds: TypeOfAds
    )