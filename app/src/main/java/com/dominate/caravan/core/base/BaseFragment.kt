package com.dominate.caravan.core.base

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.dominate.caravan.core.validator.onBackPressedAction
import com.dominate.caravan.utils.Prefs

import java.util.*
import javax.inject.Inject

abstract class BaseFragment : Fragment() {

    @Inject
lateinit var prefs: Prefs

    fun setLocale(localeName: String) {
        val locale = Locale(localeName)
        Locale.setDefault(locale)
        val res = resources
        val dm = res.displayMetrics
        val conf = res.configuration
        conf.locale = locale
        res.updateConfiguration(conf, dm)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        onBackPressedAction {
            findNavController().popBackStack()
        }

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

    }


}