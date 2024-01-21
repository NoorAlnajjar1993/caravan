package com.dominate.caravan.medule.commercialads

import com.dominate.caravan.medule.Status
import com.dominate.caravan.medule.home.CommercialAd
import com.dominate.caravan.medule.home.RealEstateAd

data class CommercialAdsResponse(
    val results: MutableList<CommercialAd>,
    val status: Status
)