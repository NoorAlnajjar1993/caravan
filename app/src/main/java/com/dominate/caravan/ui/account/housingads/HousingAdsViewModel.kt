package com.dominate.caravan.ui.account.housingads

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dominate.caravan.medule.home.HomeResponse
import com.dominate.caravan.medule.home.RealEstateAd
import com.dominate.caravan.medule.housingads.HousingAdsResponse
import com.dominate.caravan.medule.realstateads.RealStateAdsResponse
import com.dominate.caravan.retrofit.data.HomeDataSource
import com.dominate.caravan.utils.Resource
import kotlinx.coroutines.launch

class HousingAdsViewModel @ViewModelInject constructor(
    val homeDataSource: HomeDataSource
) : ViewModel()  {

    var getEffectiveResponse = MutableLiveData<Resource<HousingAdsResponse>>()
    var getPendingResponse = MutableLiveData<Resource<HousingAdsResponse>>()
    var getPausedResponse = MutableLiveData<Resource<HousingAdsResponse>>()
    var getRejectedResponse = MutableLiveData<Resource<HousingAdsResponse>>()


    fun getEffectiveHousing(token:String) {
        viewModelScope.launch {
            val response = homeDataSource.getEffectiveHousing(token)
            getEffectiveResponse.postValue(response)
        }
    }

    fun getPendingHousing(token:String) {
        viewModelScope.launch {
            val response = homeDataSource.getPendingHousing(token)
            getPendingResponse.postValue(response)
        }
    }

    fun getPausedHousing(token:String) {
        viewModelScope.launch {
            val response = homeDataSource.getPausedHousing(token)
            getPausedResponse.postValue(response)
        }
    }

    fun getRejectedHousing(token:String) {
        viewModelScope.launch {
            val response = homeDataSource.getRejectedHousing(token)
            getRejectedResponse.postValue(response)
        }
    }


}