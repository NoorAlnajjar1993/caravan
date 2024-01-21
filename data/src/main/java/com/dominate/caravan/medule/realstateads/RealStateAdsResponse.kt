package com.dominate.caravan.medule.realstateads

import com.dominate.caravan.medule.Status
import com.dominate.caravan.medule.home.RealEstateAd

data class RealStateAdsResponse(
    val results: MutableList<RealEstateAd>,
    val status: Status
)