package com.dominate.caravan.medule

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class ExpectedResponse (

        @SerializedName("status")
        @Expose
        var status: Status?,
        @SerializedName("results")
        @Expose
        var results: String?
        )