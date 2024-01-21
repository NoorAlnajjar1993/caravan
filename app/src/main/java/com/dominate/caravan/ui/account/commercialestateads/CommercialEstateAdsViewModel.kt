package com.dominate.caravan.ui.account.commercialestateads

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dominate.caravan.medule.commercialestateads.CommercialEstateAdsResponse
import com.dominate.caravan.medule.home.HomeResponse
import com.dominate.caravan.medule.home.RealEstateAd
import com.dominate.caravan.medule.realstateads.RealStateAdsResponse
import com.dominate.caravan.retrofit.data.HomeDataSource
import com.dominate.caravan.utils.Resource
import kotlinx.coroutines.launch

class CommercialEstateAdsViewModel @ViewModelInject constructor(
    val homeDataSource: HomeDataSource
) : ViewModel()  {

    var getEffectiveResponse = MutableLiveData<Resource<CommercialEstateAdsResponse>>()
    var getPendingResponse = MutableLiveData<Resource<CommercialEstateAdsResponse>>()
    var getPausedResponse = MutableLiveData<Resource<CommercialEstateAdsResponse>>()
    var getRejectedResponse = MutableLiveData<Resource<CommercialEstateAdsResponse>>()


    fun getEffectiveCommercialEstate(token:String) {
        viewModelScope.launch {
            val response = homeDataSource.getEffectiveCommercialEstate(token)
            getEffectiveResponse.postValue(response)
        }
    }

    fun getPendingCommercialEstate(token:String) {
        viewModelScope.launch {
            val response = homeDataSource.getPendingCommercialEstate(token)
            getPendingResponse.postValue(response)
        }
    }

    fun getPausedCommercialEstate(token:String) {
        viewModelScope.launch {
            val response = homeDataSource.getPausedCommercialEstate(token)
            getPausedResponse.postValue(response)
        }
    }

    fun getRejectedCommercialEstate(token:String) {
        viewModelScope.launch {
            val response = homeDataSource.getRejectedCommercialEstate(token)
            getRejectedResponse.postValue(response)
        }
    }


}