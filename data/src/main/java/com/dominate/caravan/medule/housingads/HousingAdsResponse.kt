package com.dominate.caravan.medule.housingads

import com.dominate.caravan.medule.Status
import com.dominate.caravan.medule.home.HousingAd
import com.dominate.caravan.medule.home.RealEstateAd

data class HousingAdsResponse(
    val results: MutableList<HousingAd>,
    val status: Status
)