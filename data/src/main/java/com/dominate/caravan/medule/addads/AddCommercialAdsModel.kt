package com.dominate.caravan.medule.addads

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue
import okhttp3.MultipartBody

@Parcelize
data class AddCommercialAdsModel(

    val type_id: String,
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