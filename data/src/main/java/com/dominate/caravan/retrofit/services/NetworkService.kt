package com.dominate.caravan.retrofit.services

import com.dominate.caravan.medule.ExpectedResponse
import com.dominate.caravan.medule.favourite.FavouriteRequest
import com.dominate.caravan.medule.favourite.FavouriteResponse
import com.dominate.caravan.medule.home.HomeResponse
import com.dominate.caravan.medule.home.RealEstateAd
import com.dominate.caravan.medule.profile.changepassword.ChangePasswordRequest
import com.dominate.caravan.medule.profile.profile.ProfileResponse
import com.dominate.caravan.medule.profile.signin.SigninRequest
import com.dominate.caravan.medule.profile.signup.SignupRequest
import com.dominate.caravan.medule.profile.user.UserResponse
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part
import retrofit2.http.Path

interface NetworkService {

    @POST("user/register")
    suspend fun register(
        @Body signupRequest: SignupRequest
    ): Response<UserResponse>


    @POST("user/login")
    suspend fun signinUser(
        @Body signinRequest: SigninRequest
    ): Response<UserResponse>


    @GET("user/profile")
    suspend fun userProfile(
        @Header("Authorization") token: String
    ): Response<ProfileResponse>

    @Multipart
    @POST("user/update-profile")
    suspend fun updateProfile(
        @Header("Authorization") token: String,
        @Part("name") name: RequestBody,
        @Part("phone_number") phone_number: RequestBody,
        @Part("whatsapp_number") whatsapp_number: RequestBody,
        @Part("about") about: RequestBody,
        @Part image: MultipartBody.Part?,
    ): Response<ExpectedResponse>


    @POST("user/change_password")
    suspend fun changePassword(
        @Header("Authorization") token: String ,
        @Body changePassRequest: ChangePasswordRequest
    ): Response<ExpectedResponse>

    @GET("home")
    suspend fun getHome(): Response<HomeResponse>

    @POST("user/favorites/add")
    suspend fun addFavoriteItem(@Header("Authorization") token:String,
                                @Body favouriteRequest: FavouriteRequest
    ):Response<ExpectedResponse>

    @POST("user/favorites/remove")
    suspend fun removeFavoriteItem(@Header("Authorization") token:String,
                                   @Body favouriteRequest: FavouriteRequest
    ):Response<ExpectedResponse>


    @GET("user/favorites")
    suspend fun listFavorite(
        @Header("Authorization") token:String,
    ): Response<FavouriteResponse>

}