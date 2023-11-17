package com.dominate.caravan.core.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dominate.caravan.utils.Prefs
import dagger.hilt.android.AndroidEntryPoint
import java.util.*
import javax.inject.Inject

@AndroidEntryPoint
abstract class BaseActivity : AppCompatActivity() {

    @Inject
    lateinit var prefs: Prefs

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setLocale(prefs.language ?: "en")

        val conf = resources.configuration
        conf.locale = Locale.getDefault()
        baseContext.resources.updateConfiguration(
            conf,
            baseContext.resources.displayMetrics
        )
    }

    fun setLocale(localeName: String) {
        val locale = Locale(localeName)
        Locale.setDefault(locale)
        val res = resources
        val dm = res.displayMetrics
        val conf = res.configuration
        conf.locale = locale
        res.updateConfiguration(conf, dm)
    }

    override fun onStart() {
        super.onStart()
        supportActionBar?.title = ""
    }

}
