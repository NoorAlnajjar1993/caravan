package com.dominate.caravan.ui.packages.completeFeature

import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.caravan.R
import com.caravan.databinding.FragmentCompleteBinding
import com.caravan.databinding.FragmentCompleteFeatureBinding
import com.dominate.caravan.core.autoCleared
import com.dominate.caravan.core.base.BaseFragment
import com.dominate.caravan.medule.home.CommercialAd
import com.dominate.caravan.medule.home.CommercialEstate
import com.dominate.caravan.medule.home.HousingAd
import com.dominate.caravan.medule.home.RealEstateAd
import com.dominate.caravan.ui.addads.AddAdsViewModel
import com.dominate.caravan.ui.addads.addadsimages.AddAdsImages
import com.dominate.caravan.ui.home.HomeActivity
import com.dominate.caravan.utils.Resource
import com.vdx.designertoast.DesignerToast
import dagger.hilt.android.AndroidEntryPoint
import okhttp3.RequestBody.Companion.toRequestBody
import java.net.URLEncoder

@AndroidEntryPoint
class CompleteFeatureFragment : BaseFragment(), TextWatcher {

    var binding: FragmentCompleteFeatureBinding by autoCleared()
    var token: String? = ""


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCompleteFeatureBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setData()
    }

    override fun afterTextChanged(s: Editable) {}
    override fun beforeTextChanged(
        s: CharSequence, start: Int, count: Int, after: Int
    ) {
    }

    override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {}

    private fun setData() {

        try {
            token = prefs.getCurrentUser().token
        } catch (ec: Exception) {}

        binding.constraintLayout01.setOnClickListener {
            isWhatsAppInstalled("com.caravan")
        }

        binding.ivBack.setOnClickListener {
            findNavController().popBackStack()
        }

    }

    private fun isWhatsAppInstalled(packageName: String): Boolean {
        val url =
            "https://api.whatsapp.com/send?phone=0795986039}" + URLEncoder.encode("", "utf-8")
        try {
            val pm: PackageManager = requireActivity().getPackageManager()
            pm.getPackageInfo(packageName, PackageManager.GET_ACTIVITIES)
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        } catch (e: PackageManager.NameNotFoundException) {
            Toast.makeText(
                context,
                getString(R.string.Whatsapp_is_not_installed),
                Toast.LENGTH_SHORT
            ).show()
            e.printStackTrace()
        }
        return true
    }


    fun showErrorToast(message: String) {
        DesignerToast.Custom(
            requireContext(), message, Gravity.TOP or Gravity.FILL_HORIZONTAL, Toast.LENGTH_SHORT,
            R.drawable.purple_gradient, 16, "#FFFFFF", R.drawable.ic_close_purple, 55, 219
        )
    }

}