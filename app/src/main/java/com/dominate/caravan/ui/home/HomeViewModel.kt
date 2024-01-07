package com.dominate.caravan.ui.home

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dominate.caravan.medule.ExpectedResponse
import com.dominate.caravan.medule.home.HomeResponse
import com.dominate.caravan.retrofit.data.HomeDataSource
import com.dominate.caravan.utils.Resource
import kotlinx.coroutines.launch

class HomeViewModel @ViewModelInject constructor(
    val homeDataSource: HomeDataSource
) : ViewModel() {


    var getHomeResponse = MutableLiveData<Resource<HomeResponse>>()
    val addFavoriteResponse = MutableLiveData<Resource<ExpectedResponse>>()
    val removeFavoriteResponse = MutableLiveData<Resource<ExpectedResponse>>()

    fun getHome() {
        viewModelScope.launch {
            val response = homeDataSource.getHome()
            getHomeResponse.postValue(response)
        }
    }

    fun addFavoriteItem(token:String, id:Int) {
        viewModelScope.launch {
            val response = homeDataSource.addFavoriteItem(token, id)
            addFavoriteResponse.postValue(response)
        }
    }

    fun removeFavoriteItem(token:String, id:Int) {
        viewModelScope.launch {
            val response = homeDataSource.removeFavoriteItem(token, id)
            removeFavoriteResponse.postValue(response)
        }
    }

}