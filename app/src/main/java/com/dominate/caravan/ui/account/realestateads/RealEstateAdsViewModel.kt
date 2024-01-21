package com.dominate.caravan.ui.account.realestateads

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dominate.caravan.medule.home.HomeResponse
import com.dominate.caravan.medule.home.RealEstateAd
import com.dominate.caravan.medule.realstateads.RealStateAdsResponse
import com.dominate.caravan.retrofit.data.HomeDataSource
import com.dominate.caravan.utils.Resource
import kotlinx.coroutines.launch

class RealEstateAdsViewModel @ViewModelInject constructor(
    val homeDataSource: HomeDataSource
) : ViewModel()  {

    var getEffectiveResponse = MutableLiveData<Resource<RealStateAdsResponse>>()
    var getPendingResponse = MutableLiveData<Resource<RealStateAdsResponse>>()
    var getPausedResponse = MutableLiveData<Resource<RealStateAdsResponse>>()
    var getRejectedResponse = MutableLiveData<Resource<RealStateAdsResponse>>()


    fun getEffective(token:String) {
        viewModelScope.launch {
            val response = homeDataSource.getEffective(token)
            getEffectiveResponse.postValue(response)
        }
    }

    fun getPending(token:String) {
        viewModelScope.launch {
            val response = homeDataSource.getPending(token)
            getPendingResponse.postValue(response)
        }
    }

    fun getPaused(token:String) {
        viewModelScope.launch {
            val response = homeDataSource.getPaused(token)
            getPausedResponse.postValue(response)
        }
    }

    fun getRejected(token:String) {
        viewModelScope.launch {
            val response = homeDataSource.getRejected(token)
            getRejectedResponse.postValue(response)
        }
    }


}