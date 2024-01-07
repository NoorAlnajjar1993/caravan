package com.dominate.caravan.medule.home

import com.dominate.caravan.medule.Status

data class HomeResponse(
    val results: HomeResults,
    val status: Status
)