package com.dominate.caravan.medule.commercialestateads

import com.dominate.caravan.medule.Status
import com.dominate.caravan.medule.home.CommercialEstate
import com.dominate.caravan.medule.home.RealEstateAd

data class CommercialEstateAdsResponse(
    val results: MutableList<CommercialEstate>,
    val status: Status
)