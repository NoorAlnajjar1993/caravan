package com.dominate.caravan.medule.profile.user

import com.dominate.caravan.medule.Status

data class UserResponse(
    val results: User,
    val status: Status
)