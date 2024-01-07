package com.dominate.caravan.ui.account.profile

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dominate.caravan.medule.profile.profile.ProfileResponse
import com.dominate.caravan.medule.profile.user.UserResponse
import com.dominate.caravan.retrofit.data.ProfileDataSource
import com.dominate.caravan.utils.Resource
import kotlinx.coroutines.launch

class ProfileViewModel @ViewModelInject constructor(
    val ProfileDataSource: ProfileDataSource
) : ViewModel()  {

    val UserProfileResponse = MutableLiveData<Resource<ProfileResponse>>()
    var frontCivilIdImagePath = ""

    fun getUserProfile(token:String) {
        viewModelScope.launch {
            val response = ProfileDataSource.userProfile(token)
            UserProfileResponse.postValue(response)
        }
    }
}