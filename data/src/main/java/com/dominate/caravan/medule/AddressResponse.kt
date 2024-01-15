package com.dominate.caravan.medule

import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class AddressResponse(
    @SerializedName("lat")
    @Expose
    val lat: String,
    @SerializedName("lng")
    @Expose
    val lng: String
): Parcelable