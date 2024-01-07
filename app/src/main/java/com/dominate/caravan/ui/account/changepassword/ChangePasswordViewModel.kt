package com.dominate.caravan.ui.account.changepassword

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dominate.caravan.medule.ExpectedResponse
import com.dominate.caravan.retrofit.data.ProfileDataSource
import com.dominate.caravan.utils.Resource
import kotlinx.coroutines.launch

class ChangePasswordViewModel @ViewModelInject constructor(
    val ProfileDataSource: ProfileDataSource
) : ViewModel()  {

    val updatepass= MutableLiveData<Resource<ExpectedResponse>?>()


    fun resetPassword(token:String,currentPass:String,newPass:String){
        viewModelScope.launch {
            val reponse= ProfileDataSource.resetPasswordProfile(token,currentPass,newPass)
            updatepass.postValue(reponse)
        }
    }
    fun reset() {
        updatepass.postValue(null)
    }

}