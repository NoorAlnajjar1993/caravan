package com.dominate.caravan.medule.addads

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue
import okhttp3.MultipartBody

@Parcelize
data class AddCommercialEStateAdsModel(

    val is_new: Boolean,
    val year_of_construction: String,
    val building_area: String,
    val land_area: String,
    val type_of_organization: String,
    val is_rented: Boolean,
    val number_of_bedroom: String,
    val number_of_bed: String,
    val number_of_bathroom: String,
    val number_of_floors: String,
    val hotel_rating: String,
    val hospital_rating: String,
    val school_rating: String,
    val property_id: String,
    val typeOfAds: String,
    val type: String,
    var title: String?=null,
    var description: String?=null,
    var property_ownership: String?=null,
    var installment_payment: Boolean?=null,
    var price: String?=null,
    var region: String?=null,
    var phone_number: String?=null,
    var whatsapp: String?=null,
    var lat: String?=null,
    var long: String?=null,
    var is_the_location_approximate: Boolean?=null,
    var media:@RawValue List<MultipartBody.Part>?=null,
    var street: String?=null,
): Parcelable