package com.dominate.caravan.retrofit.data

import com.dominate.caravan.medule.favourite.FavouriteRequest
import com.dominate.caravan.medule.profile.changepassword.ChangePasswordRequest
import com.dominate.caravan.retrofit.services.NetworkService
import javax.inject.Inject

class HomeDataSource @Inject constructor(
    private val networkService: NetworkService
): BaseDataSource() {


    suspend fun getHome()=getResult {
        networkService.getHome()
    }

    suspend fun addFavoriteItem(token:String,id:Int) = getResult {
        networkService.addFavoriteItem(token, FavouriteRequest(id))
    }

    suspend fun removeFavoriteItem(token:String,id:Int) = getResult {
        networkService.removeFavoriteItem(token, FavouriteRequest(id))
    }

    suspend fun getFavoriteList(token:String) = getResult {
        networkService.listFavorite(token)
    }
}