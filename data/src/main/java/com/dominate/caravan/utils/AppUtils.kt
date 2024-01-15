package com.dominate.caravan.utils

import android.Manifest
import android.content.ContentValues
import android.content.Context
import android.graphics.Bitmap
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.net.Uri
import android.os.Build
import android.os.Environment
import android.provider.MediaStore
import android.text.Html
import android.text.Spanned
import pub.devrel.easypermissions.EasyPermissions
import java.io.ByteArrayOutputStream
import java.io.OutputStream


object AppUtils {

    fun englishToArabic(str: String):String {
        var result = ""
        var en = '0'
        for (ch in str) {
            en = ch
            when (ch) {
                '0' -> en = '۰'
                '1' -> en = '۱'
                '2' -> en = '۲'
                '3' -> en = '۳'
                '4' -> en = '٤'
                '5' -> en = '۵'
                '6' -> en = '٦'
                '7' -> en = '۷'
                '8' -> en = '۸'
                '9' -> en = '۹'
                '.' -> en = ','
            }
            result = "${result}$en"
        }
        return result
    }


    fun arabicToEnglish(str: String):String {
        var result = ""
        var en = '0'
        for (ch in str) {
            en = ch
            when (ch) {
                '۰' -> en = '0'
                '۱' -> en = '1'
                '۲' -> en = '2'
                '۳' -> en = '3'
                '٤' -> en = '4'
                '۵' -> en = '5'
                '٦' -> en = '6'
                '۷' -> en = '7'
                '۸' -> en = '8'
                '۹' -> en = '9'
                ',' -> en = '.'
            }
            result = "${result}$en"
        }
        return result
    }



//     fun persistImage(context: Context,bitmap: Bitmap, name: String): File {
//        val filesDir: File = context.filesDir
//        val imageFile = File(filesDir, "$name.jpg")
//        val os: OutputStream
//        try {
//            os = FileOutputStream(imageFile)
//            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, os)
//            os.flush()
//            os.close()
//        } catch (e: Exception) {
//            Log.e(javaClass.simpleName, "Error writing bitmap", e)
//        }
//         return imageFile
//    }


    fun getImageUri(inContext: Context, inImage: Bitmap): Uri? {
        val bytes = ByteArrayOutputStream()
        inImage.compress(Bitmap.CompressFormat.JPEG, 70, bytes)
        val path =
            MediaStore.Images.Media.insertImage(
                inContext.contentResolver, inImage,
                "IMG_${System.currentTimeMillis()}", null
            )
        return Uri.parse(path)
    }


    fun getImageUriFromCamera(context: Context, inImage: Bitmap?): Uri? {
        val filename = "IMG_${System.currentTimeMillis()}.jpg"
        var fos: OutputStream?
        var imageUri: Uri?
        val contentValues = ContentValues().apply {
            put(MediaStore.MediaColumns.DISPLAY_NAME, filename)
            put(MediaStore.MediaColumns.MIME_TYPE, "image/jpg")
            put(MediaStore.MediaColumns.RELATIVE_PATH, Environment.DIRECTORY_PICTURES)
            put(MediaStore.Video.Media.IS_PENDING, 1)
        }

        //use application context to get contentResolver
        val contentResolver = context.contentResolver

        contentResolver.also { resolver ->
            imageUri = resolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues)
            fos = imageUri?.let { resolver.openOutputStream(it) }
        }

        fos?.use {
            inImage?.compress(Bitmap.CompressFormat.JPEG, 70, it)
        }



        contentValues.clear()
        contentValues.put(MediaStore.Video.Media.IS_PENDING, 0)
        imageUri?.let { contentResolver.update(it, contentValues, null, null) }

        return imageUri
    }


    /**
     * this function is used to set concatenated texts with different style
     */
    fun fromHtml(source: String?): Spanned? {
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            Html.fromHtml(source, Html.FROM_HTML_MODE_LEGACY)
        } else {
            Html.fromHtml(source)
        }
    }
    fun hasLocationPermissions(context: Context) =
        if(Build.VERSION.SDK_INT < Build.VERSION_CODES.Q) {
            EasyPermissions.hasPermissions(
                context,
                Manifest.permission.ACCESS_FINE_LOCATION,
                Manifest.permission.ACCESS_COARSE_LOCATION
            )
        } else {
            EasyPermissions.hasPermissions(
                context,
                Manifest.permission.ACCESS_FINE_LOCATION,
                Manifest.permission.ACCESS_COARSE_LOCATION
            )
        }












//    fun Activity.setLanguage(lang: String) {
//       val locale =  if (lang=="en") {
//             Locale(lang, "UK")
//        }else{
//             Locale(lang, "EG")
//        }
//        val configuration: Configuration = resources.configuration
//        Locale.setDefault(locale)
//        configuration.setLocale(locale)
//        if (Build.VERSION.SDK_INT >= 25) {
//            applicationContext.createConfigurationContext(configuration)
//            createConfigurationContext(configuration)
//        }
//        resources.updateConfiguration(configuration, resources.displayMetrics)
//        onConfigurationChanged(configuration)
//
//    }


    fun  hasInternetConnection(context: Context):Boolean{
        val connectivityManager = context.getSystemService(
            Context.CONNECTIVITY_SERVICE
        ) as ConnectivityManager
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
            val activeNetwork = connectivityManager.activeNetwork ?: return false
            val capabilities  = connectivityManager.getNetworkCapabilities(activeNetwork) ?: return false
            return when {
                capabilities.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) -> true
                capabilities.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) -> true
                capabilities.hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET) -> true
                else -> false
            }
        }else{
            connectivityManager.activeNetworkInfo?.run {
                return when (type){
                    ConnectivityManager.TYPE_WIFI -> true
                    ConnectivityManager.TYPE_MOBILE -> true
                    ConnectivityManager.TYPE_ETHERNET -> true
                    else -> false
                }
            }
        }
        return false
    }




}


