package com.dominate.caravan.medule.addads

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue
import okhttp3.MultipartBody

@Parcelize
data class AddHousingAdsModel(

    val building_apartments: String,
    val floor: String,
    val with_garden: Boolean,
    val garden_area: String,
    val with_roof: Boolean,
    val roof_area: String,
    val numberOfBedrooms: String,
    val numberOfBathrooms: String,
    val numberOfFloors: String,
    val minAreaSpaceText: String,
    val maxAreaSpaceText: String,
    val totalNumberOfApartment: String,
    val totalNumberOfApartmentInFloor: String,
    val availableFloors: String,
    val typeOfAds: String,
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