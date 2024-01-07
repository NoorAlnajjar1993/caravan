package com.dominate.caravan.ui.account.accountsetting

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dominate.caravan.medule.ExpectedResponse
import com.dominate.caravan.medule.profile.profile.ProfileResponse
import com.dominate.caravan.retrofit.data.ProfileDataSource
import com.dominate.caravan.utils.Resource
import kotlinx.coroutines.launch
import okhttp3.MultipartBody
import okhttp3.RequestBody

class AccountSettingViewModel @ViewModelInject constructor(
    val ProfileDataSource: ProfileDataSource
) : ViewModel()  {


    val UserProfileResponse = MutableLiveData<Resource<ProfileResponse>>()
    val updateProfileResponse = MutableLiveData<Resource<ExpectedResponse>>()


    fun getUserProfile(token:String) {
        viewModelScope.launch {
            val response = ProfileDataSource.userProfile(token)
            UserProfileResponse.postValue(response)
        }
    }

    fun updateProfile(token:String, name: RequestBody , phone_number: RequestBody, whatsapp_number: RequestBody, about: RequestBody,image: MultipartBody.Part?) {
        viewModelScope.launch {
            val response = ProfileDataSource.updateProfile(token, name, phone_number, whatsapp_number, about, image)
            updateProfileResponse.postValue(response)
        }
    }
}