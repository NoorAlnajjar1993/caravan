package com.dominate.caravan.medule.home

import com.dominate.caravan.medule.profile.profile.Profile

data class CommercialAd(
    val date: String,
    val description: String,
    val id: Int,
    val installment_payment: Boolean,
    val is_the_location_approximate: Boolean,
    val lat: Double,
    val long: Double,
    val media: List<Media>,
    var is_favorite: Boolean,
    val phone_number: String,
    val price: Double,
    val property_ownership: Int,
    val region: String,
    val title: String,
    val type: Type,
    val uesr: Profile,
    val videos: List<Any>,
    val whatsapp: String
)