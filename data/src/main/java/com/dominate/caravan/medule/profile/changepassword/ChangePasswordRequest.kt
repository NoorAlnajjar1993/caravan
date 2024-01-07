package com.dominate.caravan.medule.profile.changepassword


data class ChangePasswordRequest (
    val old_password: String,
    val new_password: String
        )