package com.dominate.caravan.utils

class AppConstants {

    companion object{
        const val BASE_URL = "https://caravan-ddedb9092a1f.herokuapp.com/apis/"
        const val defaultLanguage:String ="en"
        const val defaultLanguageKey:String ="DEFAULT_LANGUAGE"
        const val userTypeKey:String ="USER_TYPE"
        const val isLoggedInKey:String ="isLoggedInKey"
        const val USER_TOKEN="user token"
        const val CURRENT_FRAGMENT="Main Fragment"
        const val WEAK:String ="Weak"
        const val MEDIUM:String ="Medium"
        const val STRONG:String ="Strong"
        const val USER_EMAIL="user email"
        const val USER_PHONE="user phone"
        const val USER_NAME="user name"
        const val CURRENT_USER="current user"

        const val PASSWORD_PATTERN = "^" +
                "(?=.*[0-9])" +         //at least 1 digit
                "(?=.*[A-Z])" +         //at least 1 upper case letter
                ".{8,}" +               //at least 8 characters
                "$"

        const val EMAIL_PATTERN= "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" +
                "\\@" +
                "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +
                "(" +
                "\\." +
                "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +
                ")+"


    }
}