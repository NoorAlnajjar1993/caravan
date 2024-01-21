package com.dominate.caravan.retrofit.data


import com.dominate.caravan.medule.profile.changepassword.ChangePasswordRequest
import com.dominate.caravan.medule.profile.signin.SigninRequest
import com.dominate.caravan.medule.profile.signup.SignupRequest
import com.dominate.caravan.retrofit.services.NetworkService
import okhttp3.MultipartBody
import okhttp3.RequestBody
import javax.inject.Inject

class ProfileDataSource @Inject constructor(
    private val networkService: NetworkService
): BaseDataSource() {


    suspend fun register(name:String,phone_number:String,password:String)=getResult {
        networkService.register(SignupRequest(name,phone_number,password))
    }


    suspend fun signin(username: String, password: String) = getResult {
        networkService.signinUser(SigninRequest(username, password))
    }

    suspend fun userProfile( token: String)=getResult {
        networkService.userProfile(token)
    }

    suspend fun updateProfile( token:String, name: RequestBody , phone_number: RequestBody, whatsapp_number: RequestBody, about: RequestBody,image: MultipartBody.Part?)=getResult {
        networkService.updateProfile(token, name, phone_number, whatsapp_number, about, image)
    }

    suspend fun updateProfile2( token:String, name: RequestBody , phone_number: RequestBody,image: MultipartBody.Part?)=getResult {
        networkService.updateProfile2(token, name, phone_number, image)
    }
    suspend fun resetPasswordProfile( token: String,password: String,new_password: String)=getResult {
        networkService.changePassword(token, ChangePasswordRequest(password,new_password))
    }
}