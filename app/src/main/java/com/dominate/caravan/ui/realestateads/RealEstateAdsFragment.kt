package com.dominate.caravan.ui.realestateads

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.caravan.R
import com.caravan.databinding.FragmentEditPasswordBinding
import com.caravan.databinding.FragmentFavouriteBinding
import com.caravan.databinding.FragmentHousingAdsBinding
import com.caravan.databinding.FragmentNotificationBinding
import com.caravan.databinding.FragmentProfileBinding
import com.caravan.databinding.FragmentRealEstateAdsHomeBinding
import com.dominate.caravan.core.autoCleared
import com.dominate.caravan.core.base.BaseFragment
import com.dominate.caravan.core.showLoginDialog
import com.dominate.caravan.medule.home.CommercialAd
import com.dominate.caravan.medule.home.CommercialEstate
import com.dominate.caravan.medule.home.HousingAd
import com.dominate.caravan.medule.home.RealEstateAd
import com.dominate.caravan.ui.estatedetails.EstateDetailsFragment
import com.dominate.caravan.ui.home.HomeViewModel
import com.dominate.caravan.ui.home.adapter.HousingAdsAdapter
import com.dominate.caravan.ui.home.adapter.RealEstateAdsAdapter
import com.dominate.caravan.utils.Resource
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RealEstateAdsFragment  : BaseFragment()  , TextWatcher {

     var binding: FragmentRealEstateAdsHomeBinding by autoCleared()
    private val viewModel: HomeViewModel by viewModels()
    lateinit var realEstateAdsAdapter: RealEstateAdsAdapter
    var token: String? = ""

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentRealEstateAdsHomeBinding.inflate(inflater, container, false)

        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setData()

    }


    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

    }

    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {



    }

    override fun afterTextChanged(s: Editable?) {


    }


    private fun setData(){

        binding.ivBack.setOnClickListener {
            findNavController().popBackStack()
        }

        try {
            token = prefs.getCurrentUser().token
        } catch (_: Exception) {
        }

        val fade_in: Animation = AnimationUtils.loadAnimation(
            requireContext(),
            R.anim.fade_in)
        binding.constraintLayout01.startAnimation(fade_in)

        observeHome()
    }

    fun observeHome() {
        viewModel.getHome()
        viewModel.getHomeResponse.observe(viewLifecycleOwner, Observer {

            if (it.status == Resource.Status.SUCCESS) {
                if (it.data?.status?.code == 200) {
                    it.data!!.let { it ->
                        realEstateAdsData(it.results.real_estate_ads)
                    }
                } else {
                    Toast.makeText(
                        context,
                        it.data?.status?.message.toString(),
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }

            if (it.status == Resource.Status.ERROR) {
                Toast.makeText(
                    context,
                    it.message.toString(),
                    Toast.LENGTH_SHORT
                ).show()
            }
        })
    }

    private fun realEstateAdsData(realEstateAds: MutableList<RealEstateAd>) {
        if (realEstateAds.isNotEmpty()) {
            realEstateAdsAdapter = RealEstateAdsAdapter(realEstateAds, {
                if (prefs.isLoggedIn && !token.isNullOrEmpty()) {
                    it!!.is_favorite = !it.is_favorite
                    AddRemoveFavorite(id = it.id, it.is_favorite)
                } else {
                    // IF USER NOT LOGIN SHOW DIALOG
                    requireContext().showLoginDialog(
                        onPositiveButtonClick = {
                            findNavController().navigate(R.id.action_realEstateAdsFragment2_to_sigininFragment)
                            it.dismiss()
                        }, onNegativeButtonClick = {
                            it.dismiss()
                        })
                }
            }, {
                EstateDetailsFragment.realEstate = it!!
                EstateDetailsFragment.type = "real_estate"

                findNavController().navigate(R.id.action_realEstateAdsFragment2_to_estateDetailsFragment)

            })
            realEstateAdsAdapter.notifyDataSetChanged()
            binding.rvRealEstateAds.adapter = realEstateAdsAdapter
        }
    }

    private fun AddRemoveFavorite(id: Int, isFavorite: Boolean) {
        if (isFavorite) {
            id.let { id ->
                viewModel.addFavoriteItem(
                    token!!, id
                )
            }
            viewModel.addFavoriteResponse.observe(
                viewLifecycleOwner
            ) {
                if (it.status == Resource.Status.SUCCESS) {

                } else if (it.status == Resource.Status.ERROR) {
                    Toast.makeText(
                        requireContext(),
                        it.message,
                        Toast.LENGTH_SHORT
                    )
                        .show()
                }
            }
        } else {
            id.let { id ->
                viewModel.removeFavoriteItem(
                    token!!, id
                )
            }

            viewModel.removeFavoriteResponse.observe(
                viewLifecycleOwner
            ) {
                if (it.status == Resource.Status.SUCCESS) {

                } else if (it.status == Resource.Status.ERROR) {
                    Toast.makeText(
                        requireContext(),
                        it.message,
                        Toast.LENGTH_SHORT
                    )
                        .show()
                }
            }
        }

    }

}