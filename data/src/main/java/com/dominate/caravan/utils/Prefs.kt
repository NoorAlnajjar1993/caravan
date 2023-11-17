package com.dominate.caravan.utils

import android.content.SharedPreferences
import androidx.core.content.edit
import com.dominate.caravan.utils.AppConstants.Companion.USER_EMAIL
import com.dominate.caravan.utils.AppConstants.Companion.USER_NAME
import com.dominate.caravan.utils.AppConstants.Companion.USER_PHONE
import com.dominate.caravan.utils.AppConstants.Companion.USER_TOKEN
import java.util.*
import javax.inject.Inject

class Prefs @Inject constructor(
    private val sharedPrefs: SharedPreferences,
) {

    var currentFragment: String?
        get() {
            return sharedPrefs.getString(AppConstants.CURRENT_FRAGMENT, null)

        }
        set(value) {
            sharedPrefs.edit { putString(AppConstants.CURRENT_FRAGMENT, value) }
        }




    var language: String?
        get() {
            return sharedPrefs.getString(AppConstants.defaultLanguageKey, Locale.getDefault().language)
                ?: Locale.getDefault().language
        }
        set(value) {
            sharedPrefs.edit { putString(AppConstants.defaultLanguageKey, value) }
        }

    var isLoggedIn: Boolean
        get() = sharedPrefs.getBoolean(AppConstants.isLoggedInKey, false)
        set(value) = sharedPrefs.edit { putBoolean(AppConstants.isLoggedInKey, value)  ?: Locale.getDefault() }

    var userType: Int?
        get() = sharedPrefs.getInt(AppConstants.userTypeKey, 0)

        set(value) {
            sharedPrefs.edit { putInt(AppConstants.userTypeKey, value ?: 0) }
        }
    fun saveAuthToken(token: String){
        val editor =sharedPrefs.edit()
        editor.putString(USER_TOKEN, token)
        editor.apply()
    }
    fun featchAuthToken():String ?{
        return sharedPrefs.getString(USER_TOKEN, null)
    }


    fun saveEmailToken(email: String){
        val editor =sharedPrefs.edit()
        editor.putString(USER_EMAIL, email)
        editor.apply()
    }
    fun featchEmailToken():String ?{
        return sharedPrefs.getString(USER_EMAIL, null)
    }

    fun savePhoneToken(phone: String){
        val editor =sharedPrefs.edit()
        editor.putString(USER_PHONE, phone)
        editor.apply()
    }
    fun featchPhoneToken():String ?{
        return sharedPrefs.getString(USER_PHONE, null)
    }



    fun saveNameToken(name: String){
        val editor =sharedPrefs.edit()
        editor.putString(USER_NAME, name)
        editor.apply()
    }
    fun featchNameToken():String ?{
        return sharedPrefs.getString(USER_NAME, null)
    }
    fun deleteAllSharedPrefs() {
        sharedPrefs.edit().clear().apply()
    }
}