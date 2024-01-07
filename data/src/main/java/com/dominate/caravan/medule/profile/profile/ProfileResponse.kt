package com.dominate.caravan.medule.profile.profile

import com.dominate.caravan.medule.Status

data class ProfileResponse(
    val results: Profile,
    val status: Status
)