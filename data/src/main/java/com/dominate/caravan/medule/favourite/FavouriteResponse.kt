package com.dominate.caravan.medule.favourite

import com.dominate.caravan.medule.Status
import com.dominate.caravan.medule.home.RealEstateAd

data class FavouriteResponse(
    val results: MutableList<RealEstateAd>,
    val status: Status
)