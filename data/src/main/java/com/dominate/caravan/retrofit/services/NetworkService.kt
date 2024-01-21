package com.dominate.caravan.retrofit.services

import com.dominate.caravan.medule.ExpectedResponse
import com.dominate.caravan.medule.commercialads.CommercialAdsResponse
import com.dominate.caravan.medule.commercialestateads.CommercialEstateAdsResponse
import com.dominate.caravan.medule.favourite.FavouriteRequest
import com.dominate.caravan.medule.favourite.FavouriteResponse
import com.dominate.caravan.medule.home.CommercialAd
import com.dominate.caravan.medule.home.HomeResponse
import com.dominate.caravan.medule.home.RealEstateAd
import com.dominate.caravan.medule.housingads.HousingAdsResponse
import com.dominate.caravan.medule.profile.changepassword.ChangePasswordRequest
import com.dominate.caravan.medule.profile.profile.ProfileResponse
import com.dominate.caravan.medule.profile.signin.SigninRequest
import com.dominate.caravan.medule.profile.signup.SignupRequest
import com.dominate.caravan.medule.profile.user.UserResponse
import com.dominate.caravan.medule.realstateads.RealStateAdsResponse
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

    @Multipart
    @POST("user/update-profile")
    suspend fun updateProfile2(
        @Header("Authorization") token: String,
        @Part("name") name: RequestBody,
        @Part("phone_number") phone_number: RequestBody,
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

    @POST("ads/details")
    suspend fun getRealEstate(
        @Body favouriteRequest: FavouriteRequest
    ): Response<FavouriteResponse>

    @Multipart
    @POST("ads/create")
    suspend fun createRealStateAds(
        @Header("Authorization") token: String,
        @Part("is_new") is_new: RequestBody,
        @Part("is_commercial") is_commercial: RequestBody,
        @Part("age_of_construction") age_of_construction: RequestBody,
        @Part("is_finished") is_finished: RequestBody,
        @Part("bedrooms_number") bedrooms_number: RequestBody,
        @Part("bathrooms_number") bathrooms_number: RequestBody,
        @Part("building_floors") building_floors: RequestBody,
        @Part("building_apartments") building_apartments: RequestBody,
        @Part("building_units") building_units: RequestBody,
        @Part("floor") floor: RequestBody,
        @Part("with_garden") with_garden: RequestBody,
        @Part("garden_area") garden_area: RequestBody,
        @Part("with_roof") with_roof: RequestBody,
        @Part("roof_area") roof_area: RequestBody,
        @Part("building_area") building_area: RequestBody,
        @Part("land_area") land_area: RequestBody,
        @Part("land_level") land_level: RequestBody,
        @Part("land_organization") land_organization: RequestBody,
        @Part("title") title: RequestBody,
        @Part("description") description: RequestBody,
        @Part("property_ownership") property_ownership: RequestBody,
        @Part("installment_payment") installment_payment: RequestBody,
        @Part("price") price: RequestBody,
        @Part("region") region: RequestBody,
        @Part("phone_number") phone_number: RequestBody,
        @Part("whatsapp") whatsapp: RequestBody,
        @Part("lat") lat: RequestBody,
        @Part("long") long: RequestBody,
        @Part("is_the_location_approximate") is_the_location_approximate: RequestBody,
        @Part("street") street: RequestBody,
        @Part("farmArea") farmArea: RequestBody,
        @Part media: List<MultipartBody.Part>?,
        @Part("property_id") property_id: RequestBody,
        @Part("typeOfAds") typeOfAds: RequestBody

    ): Response<Any>


    @Multipart
    @POST("ads/create/commercial-estate")
    suspend fun createCommercialEstateAds(
        @Header("Authorization") token: String,
        @Part("is_new") is_new: RequestBody,
        @Part("year_of_construction") year_of_construction: RequestBody,
        @Part("building_area") building_area: RequestBody,
        @Part("land_area") land_area: RequestBody,
        @Part("type_of_organization") type_of_organization: RequestBody,
        @Part("is_rented") is_rented: RequestBody,
        @Part("number_of_bedroom") number_of_bedroom: RequestBody,
        @Part("number_of_bed") number_of_bed: RequestBody,
        @Part("number_of_bathroom") number_of_bathroom: RequestBody,
        @Part("number_of_floors") number_of_floors: RequestBody,
        @Part("hotel_rating") hotel_rating: RequestBody,
        @Part("hospital_rating") hospital_rating: RequestBody,
        @Part("school_rating") school_rating: RequestBody,
        @Part("type") type: RequestBody,
        @Part("title") title: RequestBody,
        @Part("description") description: RequestBody,
        @Part("property_ownership") property_ownership: RequestBody,
        @Part("installment_payment") installment_payment: RequestBody,
        @Part("price") price: RequestBody,
        @Part("region") region: RequestBody,
        @Part("phone_number") phone_number: RequestBody,
        @Part("whatsapp") whatsapp: RequestBody,
        @Part("lat") lat: RequestBody,
        @Part("long") long: RequestBody,
        @Part("is_the_location_approximate") is_the_location_approximate: RequestBody,
        @Part("street") street: RequestBody,
        @Part media: List<MultipartBody.Part>?,
        @Part("property_id") property_id: RequestBody,
        @Part("typeOfAds") typeOfAds: RequestBody

    ): Response<Any>


    @Multipart
    @POST("ads/create/housing")
    suspend fun createHousingAds(
        @Header("Authorization") token: String,
        @Part("building_apartments") building_apartments: RequestBody,
        @Part("floor") floor: RequestBody,
        @Part("with_garden") with_garden: RequestBody,
        @Part("garden_area") garden_area: RequestBody,
        @Part("with_roof") with_roof: RequestBody,
        @Part("roof_area") roof_area: RequestBody,
        @Part("numberOfBedrooms") numberOfBedrooms: RequestBody,
        @Part("numberOfBathrooms") numberOfBathrooms: RequestBody,
        @Part("numberOfFloors") numberOfFloors: RequestBody,
        @Part("minAreaSpaceText") minAreaSpaceText: RequestBody,
        @Part("maxAreaSpaceText") maxAreaSpaceText: RequestBody,
        @Part("totalNumberOfApartment") totalNumberOfApartment: RequestBody,
        @Part("totalNumberOfApartmentInFloor") totalNumberOfApartmentInFloor: RequestBody,
        @Part("availableFloors") availableFloors: RequestBody,
        @Part("title") title: RequestBody,
        @Part("description") description: RequestBody,
        @Part("property_ownership") property_ownership: RequestBody,
        @Part("installment_payment") installment_payment: RequestBody,
        @Part("price") price: RequestBody,
        @Part("region") region: RequestBody,
        @Part("phone_number") phone_number: RequestBody,
        @Part("whatsapp") whatsapp: RequestBody,
        @Part("lat") lat: RequestBody,
        @Part("long") long: RequestBody,
        @Part("is_the_location_approximate") is_the_location_approximate: RequestBody,
        @Part("street") street: RequestBody,
        @Part media: List<MultipartBody.Part>?,
        @Part("typeOfAds") typeOfAds: RequestBody

    ): Response<Any>


    @Multipart
    @POST("ads/create/commercial")
    suspend fun createCommercialAds(
        @Header("Authorization") token: String,
        @Part("type_id") type_id: RequestBody,
        @Part("title") title: RequestBody,
        @Part("description") description: RequestBody,
        @Part("property_ownership") property_ownership: RequestBody,
        @Part("installment_payment") installment_payment: RequestBody,
        @Part("price") price: RequestBody,
        @Part("region") region: RequestBody,
        @Part("phone_number") phone_number: RequestBody,
        @Part("whatsapp") whatsapp: RequestBody,
        @Part("lat") lat: RequestBody,
        @Part("long") long: RequestBody,
        @Part("is_the_location_approximate") is_the_location_approximate: RequestBody,
        @Part("street") street: RequestBody,
        @Part media: List<MultipartBody.Part>?,
        @Part("typeOfAds") typeOfAds: RequestBody

    ): Response<Any>

    @GET("user/ads/active")
    suspend fun getEffective(
        @Header("Authorization") token: String
    ): Response<RealStateAdsResponse>

    @GET("user/ads/pending")
    suspend fun getPending(
        @Header("Authorization") token: String
    ): Response<RealStateAdsResponse>

    @GET("user/ads/paused")
    suspend fun getPaused(
        @Header("Authorization") token: String
    ): Response<RealStateAdsResponse>


    @GET("user/ads/rejected")
    suspend fun getRejected(
        @Header("Authorization") token: String
    ): Response<RealStateAdsResponse>


    @GET("user/commercial-ads/active")
    suspend fun getEffectiveCommercial(
        @Header("Authorization") token: String
    ): Response<CommercialAdsResponse>

    @GET("user/commercial-ads/pending")
    suspend fun getPendingCommercial(
        @Header("Authorization") token: String
    ): Response<CommercialAdsResponse>

    @GET("user/commercial-ads/paused")
    suspend fun getPausedCommercial(
        @Header("Authorization") token: String
    ): Response<CommercialAdsResponse>


    @GET("user/commercial-ads/rejected")
    suspend fun getRejectedCommercial(
        @Header("Authorization") token: String
    ): Response<CommercialAdsResponse>


    @GET("user/housing-ads/active")
    suspend fun getEffectiveHousing(
        @Header("Authorization") token: String
    ): Response<HousingAdsResponse>

    @GET("user/housing-ads/pending")
    suspend fun getPendingHousing(
        @Header("Authorization") token: String
    ): Response<HousingAdsResponse>

    @GET("user/housing-ads/paused")
    suspend fun getPausedHousing(
        @Header("Authorization") token: String
    ): Response<HousingAdsResponse>


    @GET("user/housing-ads/rejected")
    suspend fun getRejectedHousing(
        @Header("Authorization") token: String
    ): Response<HousingAdsResponse>

    @GET("user/commercial-estates/active")
    suspend fun getEffectiveCommercialEstate(
        @Header("Authorization") token: String
    ): Response<CommercialEstateAdsResponse>

    @GET("user/commercial-estates/pending")
    suspend fun getPendingCommercialEstate(
        @Header("Authorization") token: String
    ): Response<CommercialEstateAdsResponse>

    @GET("user/commercial-estates/paused")
    suspend fun getPausedCommercialEstate(
        @Header("Authorization") token: String
    ): Response<CommercialEstateAdsResponse>


    @GET("user/commercial-estates/rejected")
    suspend fun getRejectedCommercialEstate(
        @Header("Authorization") token: String
    ): Response<CommercialEstateAdsResponse>
}