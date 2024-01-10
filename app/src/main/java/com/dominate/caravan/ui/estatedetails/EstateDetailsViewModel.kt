package com.dominate.caravan.ui.estatedetails

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dominate.caravan.medule.favourite.FavouriteResponse
import com.dominate.caravan.medule.home.RealEstateAd
import com.dominate.caravan.retrofit.data.HomeDataSource
import com.dominate.caravan.utils.Resource
import kotlinx.coroutines.launch

class EstateDetailsViewModel @ViewModelInject constructor(
    val homeDataSource: HomeDataSource
) : ViewModel()  {

    val realEstateResponse = MutableLiveData<Resource<FavouriteResponse>>()


    fun getRealEstate(id:Int) {
        viewModelScope.launch {
            val response = homeDataSource.getRealEstate(id)
            realEstateResponse.postValue(response)
        }
    }

}