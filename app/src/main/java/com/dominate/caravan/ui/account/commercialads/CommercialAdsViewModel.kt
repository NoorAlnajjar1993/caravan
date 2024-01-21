package com.dominate.caravan.ui.account.commercialads

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dominate.caravan.medule.commercialads.CommercialAdsResponse
import com.dominate.caravan.medule.home.CommercialAd
import com.dominate.caravan.medule.home.HomeResponse
import com.dominate.caravan.medule.home.RealEstateAd
import com.dominate.caravan.medule.realstateads.RealStateAdsResponse
import com.dominate.caravan.retrofit.data.HomeDataSource
import com.dominate.caravan.utils.Resource
import kotlinx.coroutines.launch

class CommercialAdsViewModel @ViewModelInject constructor(
    val homeDataSource: HomeDataSource
) : ViewModel()  {

    var getEffectiveResponse = MutableLiveData<Resource<CommercialAdsResponse>>()
    var getPendingResponse = MutableLiveData<Resource<CommercialAdsResponse>>()
    var getPausedResponse = MutableLiveData<Resource<CommercialAdsResponse>>()
    var getRejectedResponse = MutableLiveData<Resource<CommercialAdsResponse>>()


    fun getEffectiveCommercial(token:String) {
        viewModelScope.launch {
            val response = homeDataSource.getEffectiveCommercial(token)
            getEffectiveResponse.postValue(response)
        }
    }

    fun getPendingCommercial(token:String) {
        viewModelScope.launch {
            val response = homeDataSource.getPendingCommercial(token)
            getPendingResponse.postValue(response)
        }
    }

    fun getPausedCommercial(token:String) {
        viewModelScope.launch {
            val response = homeDataSource.getPausedCommercial(token)
            getPausedResponse.postValue(response)
        }
    }

    fun getRejectedCommercial(token:String) {
        viewModelScope.launch {
            val response = homeDataSource.getRejectedCommercial(token)
            getRejectedResponse.postValue(response)
        }
    }


}