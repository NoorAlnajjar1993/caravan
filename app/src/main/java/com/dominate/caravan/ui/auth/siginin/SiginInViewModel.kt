package com.dominate.caravan.ui.auth.siginin

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dominate.caravan.medule.profile.user.UserResponse
import com.dominate.caravan.retrofit.data.ProfileDataSource
import com.dominate.caravan.utils.Resource
import kotlinx.coroutines.launch

class SiginInViewModel @ViewModelInject constructor(
    val ProfileDataSource: ProfileDataSource
) : ViewModel() {

    var signinRespons = MutableLiveData<Resource<UserResponse>?>()

    fun signinUser(username:String,password:String){
        viewModelScope.launch {
            val response = ProfileDataSource.signin(username, password)
            signinRespons.postValue(response)
        }
    }

    fun reset() {
        signinRespons.postValue(null)
    }
}