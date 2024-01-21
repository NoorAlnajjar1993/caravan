package com.dominate.caravan.retrofit.data

import com.dominate.caravan.medule.favourite.FavouriteRequest
import com.dominate.caravan.medule.profile.changepassword.ChangePasswordRequest
import com.dominate.caravan.retrofit.services.NetworkService
import okhttp3.MultipartBody
import okhttp3.RequestBody
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

    suspend fun getRealEstate(id:Int) = getResult {
        networkService.getRealEstate(FavouriteRequest(id))
    }

    suspend fun createRealStateAds(token:String,
                                   is_new: RequestBody,
                                   is_commercial: RequestBody,
                                   age_of_construction: RequestBody,
                                   is_finished: RequestBody,
                                   bedrooms_number: RequestBody,
                                   bathrooms_number: RequestBody,
                                   building_floors: RequestBody,
                                   building_apartments: RequestBody,
                                   building_units: RequestBody,
                                   floor: RequestBody,
                                   with_garden: RequestBody,
                                   garden_area: RequestBody,
                                   with_roof: RequestBody,
                                   roof_area: RequestBody,
                                   building_area: RequestBody,
                                   land_area: RequestBody,
                                   land_level: RequestBody,
                                   land_organization: RequestBody,
                                   title: RequestBody,
                                   description: RequestBody,
                                   property_ownership: RequestBody,
                                   installment_payment: RequestBody,
                                   price: RequestBody,
                                   region: RequestBody,
                                   phone_number: RequestBody,
                                   whatsapp: RequestBody,
                                   lat: RequestBody,
                                   long: RequestBody,
                                   is_the_location_approximate: RequestBody,
                                   street: RequestBody,
                                   farmArea: RequestBody,
                                   media: List<MultipartBody.Part>?,
                                   property_id: RequestBody,
                                   typeOfAds: RequestBody
    )=getResult {
        networkService.createRealStateAds(
            token,
            is_new,
            is_commercial,
            age_of_construction,
            is_finished,
            bedrooms_number,
            bathrooms_number,
            building_floors,
            building_apartments,
            building_units,
            floor,
            with_garden,
            garden_area,
            with_roof,
            roof_area,
            building_area,
            land_area,
            land_level,
            land_organization,
            title,
            description,
            property_ownership,
            installment_payment,
            price,
            region,
            phone_number,
            whatsapp,
            lat,
            long,
            is_the_location_approximate,
            street,
            farmArea,
            media,
            property_id,
            typeOfAds
        )
    }

    suspend fun createCommercialEstateAds(
        token:String,
        is_new: RequestBody,
        year_of_construction: RequestBody,
        building_area: RequestBody,
        land_area: RequestBody,
        type_of_organization: RequestBody,
        is_rented: RequestBody,
        number_of_bedroom: RequestBody,
        number_of_bed: RequestBody,
        number_of_bathroom: RequestBody,
        number_of_floors: RequestBody,
        hotel_rating: RequestBody,
        hospital_rating: RequestBody,
        school_rating: RequestBody,
        type: RequestBody,
        title: RequestBody,
        description: RequestBody,
        property_ownership: RequestBody,
        installment_payment: RequestBody,
        price: RequestBody,
        region: RequestBody,
        phone_number: RequestBody,
        whatsapp: RequestBody,
        lat: RequestBody,
        long: RequestBody,
        is_the_location_approximate: RequestBody,
        street: RequestBody,
        media: List<MultipartBody.Part>?,
        property_id: RequestBody,
        typeOfAds: RequestBody
    )=getResult {
        networkService.createCommercialEstateAds(
            token,
            is_new,
            year_of_construction,
            building_area,
            land_area,
            type_of_organization,
            is_rented,
            number_of_bedroom,
            number_of_bed,
            number_of_bathroom,
            number_of_floors,
            hotel_rating,
            hospital_rating,
            school_rating,
            type,
            title,
            description,
            property_ownership,
            installment_payment,
            price,
            region,
            phone_number,
            whatsapp,
            lat,
            long,
            is_the_location_approximate,
            street,
            media,
            property_id,
            typeOfAds
        )
    }

    suspend fun createHousingAds(
        token:String,
        building_apartments: RequestBody,
        floor: RequestBody,
        with_garden: RequestBody,
        garden_area: RequestBody,
        with_roof: RequestBody,
        roof_area: RequestBody,
        numberOfBedrooms: RequestBody,
        numberOfBathrooms: RequestBody,
        numberOfFloors: RequestBody,
        minAreaSpaceText: RequestBody,
        maxAreaSpaceText: RequestBody,
        totalNumberOfApartment: RequestBody,
        totalNumberOfApartmentInFloor: RequestBody,
        availableFloors: RequestBody,
        title: RequestBody,
        description: RequestBody,
        property_ownership: RequestBody,
        installment_payment: RequestBody,
        price: RequestBody,
        region: RequestBody,
        phone_number: RequestBody,
        whatsapp: RequestBody,
        lat: RequestBody,
        long: RequestBody,
        is_the_location_approximate: RequestBody,
        street: RequestBody,
        media: List<MultipartBody.Part>?,
        typeOfAds: RequestBody
    )=getResult {
        networkService.createHousingAds(
            token,
            building_apartments,
            floor,
            with_garden,
            garden_area,
            with_roof,
            roof_area,
            numberOfBedrooms,
            numberOfBathrooms,
            numberOfFloors,
            minAreaSpaceText,
            maxAreaSpaceText,
            totalNumberOfApartment,
            totalNumberOfApartmentInFloor,
            availableFloors,
            title,
            description,
            property_ownership,
            installment_payment,
            price,
            region,
            phone_number,
            whatsapp,
            lat,
            long,
            is_the_location_approximate,
            street,
            media,
            typeOfAds
        )
    }

    suspend fun createCommercialAds(
        token:String,
        type_id: RequestBody,
        title: RequestBody,
        description: RequestBody,
        property_ownership: RequestBody,
        installment_payment: RequestBody,
        price: RequestBody,
        region: RequestBody,
        phone_number: RequestBody,
        whatsapp: RequestBody,
        lat: RequestBody,
        long: RequestBody,
        is_the_location_approximate: RequestBody,
        street: RequestBody,
        media: List<MultipartBody.Part>?,
        typeOfAds: RequestBody
    )=getResult {
        networkService.createCommercialAds(
            token,
            type_id,
            title,
            description,
            property_ownership,
            installment_payment,
            price,
            region,
            phone_number,
            whatsapp,
            lat,
            long,
            is_the_location_approximate,
            street,
            media,
            typeOfAds
        )
    }

    suspend fun getEffective(token:String)=getResult {
        networkService.getEffective(token)
    }

    suspend fun getPending(token:String)=getResult {
        networkService.getPending(token)
    }

    suspend fun getPaused(token:String)=getResult {
        networkService.getPaused(token)
    }

    suspend fun getRejected(token:String)=getResult {
        networkService.getRejected(token)
    }

    suspend fun getEffectiveCommercial(token:String)=getResult {
        networkService.getEffectiveCommercial(token)
    }

    suspend fun getPendingCommercial(token:String)=getResult {
        networkService.getPendingCommercial(token)
    }

    suspend fun getPausedCommercial(token:String)=getResult {
        networkService.getPausedCommercial(token)
    }

    suspend fun getRejectedCommercial(token:String)=getResult {
        networkService.getRejectedCommercial(token)
    }


    suspend fun getEffectiveHousing(token:String)=getResult {
        networkService.getEffectiveHousing(token)
    }

    suspend fun getPendingHousing(token:String)=getResult {
        networkService.getPendingHousing(token)
    }

    suspend fun getPausedHousing(token:String)=getResult {
        networkService.getPausedHousing(token)
    }

    suspend fun getRejectedHousing(token:String)=getResult {
        networkService.getRejectedHousing(token)
    }


    suspend fun getEffectiveCommercialEstate(token:String)=getResult {
        networkService.getEffectiveCommercialEstate(token)
    }

    suspend fun getPendingCommercialEstate(token:String)=getResult {
        networkService.getPendingCommercialEstate(token)
    }

    suspend fun getPausedCommercialEstate(token:String)=getResult {
        networkService.getPausedCommercialEstate(token)
    }

    suspend fun getRejectedCommercialEstate(token:String)=getResult {
        networkService.getRejectedCommercialEstate(token)
    }
}