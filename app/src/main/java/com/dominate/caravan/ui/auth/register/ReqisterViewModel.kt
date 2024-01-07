package com.dominate.caravan.ui.auth.register

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dominate.caravan.medule.profile.user.UserResponse
import com.dominate.caravan.retrofit.data.ProfileDataSource
import com.dominate.caravan.utils.Resource
import kotlinx.coroutines.launch

class ReqisterViewModel  @ViewModelInject constructor(
    val ProfileDataSource: ProfileDataSource
) : ViewModel() {


    var register= MutableLiveData<Resource<UserResponse>?>()


    fun registerUser(name:String,phone_number:String,password:String){
        viewModelScope.launch {
            val response = ProfileDataSource.register(
                name,phone_number,password
            )
            register.postValue(response)
        }
    }

    fun reset() {
        register.postValue(null)
    }

}