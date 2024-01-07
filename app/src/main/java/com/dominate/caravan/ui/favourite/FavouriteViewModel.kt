package com.dominate.caravan.ui.favourite

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dominate.caravan.medule.favourite.FavouriteResponse
import com.dominate.caravan.medule.home.RealEstateAd
import com.dominate.caravan.retrofit.data.HomeDataSource
import com.dominate.caravan.utils.Resource
import kotlinx.coroutines.launch

class FavouriteViewModel @ViewModelInject constructor(
    val homeDataSource: HomeDataSource
) : ViewModel()  {

    val favoriteListResponse = MutableLiveData<Resource<FavouriteResponse>>()


    fun getFavoriteList(token:String) {
        viewModelScope.launch {
            val response = homeDataSource.getFavoriteList(token)
            favoriteListResponse.postValue(response)
        }
    }

}