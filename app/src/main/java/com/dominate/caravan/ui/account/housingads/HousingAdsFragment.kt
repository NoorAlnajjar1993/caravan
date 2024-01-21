package com.dominate.caravan.ui.account.housingads

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.caravan.R
import com.caravan.databinding.FragmentEditPasswordBinding
import com.caravan.databinding.FragmentProfileBinding
import com.caravan.databinding.FragmentRealEstateAdsBinding
import com.dominate.caravan.core.autoCleared
import com.dominate.caravan.core.base.BaseFragment
import com.dominate.caravan.core.showLoginDialog
import com.dominate.caravan.ui.account.housingads.adapter.MyAdsHousingAdapter
import com.dominate.caravan.ui.account.realestateads.adapter.MyAdsAdapter
import com.dominate.caravan.ui.favourite.adapter.FavouritesAdapter
import com.dominate.caravan.utils.Resource
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HousingAdsFragment : BaseFragment(), TextWatcher {

    var binding: FragmentRealEstateAdsBinding by autoCleared()
    private val viewModel: HousingAdsViewModel by viewModels()
    var token: String? = ""
    lateinit var myAdsAdapter: MyAdsHousingAdapter


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentRealEstateAdsBinding.inflate(inflater, container, false)


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


    private fun setData() {

        binding.textView02.text  = "اعلانات الإسكان"
        try {
            token = prefs.getCurrentUser().token.toString()
        } catch (ec: java.lang.Exception) {
        }

        observeEffective()

        binding.ivBack.setOnClickListener {
            findNavController().popBackStack()

        }
        binding.tvEffective.setOnClickListener {
            binding.tvEffective.background = resources.getDrawable(R.drawable.custom_bg_purple)
            binding.tvEffective.setTextColor(resources.getColor(R.color.white))

            binding.tvUnderReview.background = resources.getDrawable(R.drawable.custom_bg_gray)
            binding.tvUnderReview.setTextColor(resources.getColor(R.color.black))

            binding.tvArrested.background = resources.getDrawable(R.drawable.custom_bg_gray)
            binding.tvArrested.setTextColor(resources.getColor(R.color.black))

            binding.tvRejected.background = resources.getDrawable(R.drawable.custom_bg_gray)
            binding.tvRejected.setTextColor(resources.getColor(R.color.black))
            observeEffective()
        }

        binding.tvUnderReview.setOnClickListener {
            binding.tvEffective.background = resources.getDrawable(R.drawable.custom_bg_gray)
            binding.tvEffective.setTextColor(resources.getColor(R.color.black))

            binding.tvUnderReview.background = resources.getDrawable(R.drawable.custom_bg_purple)
            binding.tvUnderReview.setTextColor(resources.getColor(R.color.white))

            binding.tvArrested.background = resources.getDrawable(R.drawable.custom_bg_gray)
            binding.tvArrested.setTextColor(resources.getColor(R.color.black))

            binding.tvRejected.background = resources.getDrawable(R.drawable.custom_bg_gray)
            binding.tvRejected.setTextColor(resources.getColor(R.color.black))

            observeUnderReview()

        }

        binding.tvArrested.setOnClickListener {
            binding.tvEffective.background = resources.getDrawable(R.drawable.custom_bg_gray)
            binding.tvEffective.setTextColor(resources.getColor(R.color.black))

            binding.tvUnderReview.background = resources.getDrawable(R.drawable.custom_bg_gray)
            binding.tvUnderReview.setTextColor(resources.getColor(R.color.black))

            binding.tvArrested.background = resources.getDrawable(R.drawable.custom_bg_purple)
            binding.tvArrested.setTextColor(resources.getColor(R.color.white))

            binding.tvRejected.background = resources.getDrawable(R.drawable.custom_bg_gray)
            binding.tvRejected.setTextColor(resources.getColor(R.color.black))

            observePaused()
        }

        binding.tvRejected.setOnClickListener {
            binding.tvEffective.background = resources.getDrawable(R.drawable.custom_bg_gray)
            binding.tvEffective.setTextColor(resources.getColor(R.color.black))

            binding.tvUnderReview.background = resources.getDrawable(R.drawable.custom_bg_gray)
            binding.tvUnderReview.setTextColor(resources.getColor(R.color.black))

            binding.tvArrested.background = resources.getDrawable(R.drawable.custom_bg_gray)
            binding.tvArrested.setTextColor(resources.getColor(R.color.black))

            binding.tvRejected.background = resources.getDrawable(R.drawable.custom_bg_purple)
            binding.tvRejected.setTextColor(resources.getColor(R.color.white))

            observeRejected()
        }
    }

    private fun observeEffective() {
        binding.rvMyAds.visibility = View.GONE
        binding.loading.visibility = View.VISIBLE
        binding.animationView.visibility = View.GONE
        binding.tvNoAds.visibility = View.GONE
        viewModel.getEffectiveHousing(token = token!!)
        viewModel.getEffectiveResponse.observe(viewLifecycleOwner, Observer {

            if (it.status == Resource.Status.SUCCESS) {
                if (it.data?.status?.code == 200) {
                    it.data!!.let { it ->
                        if (it.results.isNotEmpty()) {
                            binding.rvMyAds.visibility = View.VISIBLE
                            binding.tvNoAds.visibility = View.GONE
                            binding.loading.visibility = View.GONE
                            binding.animationView.visibility = View.GONE
                            myAdsAdapter = MyAdsHousingAdapter(it.results) {}
                            myAdsAdapter.notifyDataSetChanged()
                            binding.rvMyAds.adapter = myAdsAdapter
                        } else {
                            binding.rvMyAds.visibility = View.GONE
                            binding.loading.visibility = View.GONE
                            binding.animationView.visibility = View.VISIBLE
                            binding.tvNoAds.visibility = View.VISIBLE
                        }
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

    private fun observeUnderReview() {
        binding.rvMyAds.visibility = View.GONE
        binding.loading.visibility = View.VISIBLE
        binding.animationView.visibility = View.GONE
        binding.tvNoAds.visibility = View.GONE
        viewModel.getPendingHousing(token = token!!)
        viewModel.getPendingResponse.observe(viewLifecycleOwner, Observer {

            if (it.status == Resource.Status.SUCCESS) {
                if (it.data?.status?.code == 200) {
                    it.data!!.let { it ->
                        if (it.results.isNotEmpty()) {
                            binding.rvMyAds.visibility = View.VISIBLE
                            binding.loading.visibility = View.GONE
                            binding.animationView.visibility = View.GONE
                            binding.tvNoAds.visibility = View.GONE
                            myAdsAdapter = MyAdsHousingAdapter(it.results) {}
                            myAdsAdapter.notifyDataSetChanged()
                            binding.rvMyAds.adapter = myAdsAdapter
                        } else {
                            binding.rvMyAds.visibility = View.GONE
                            binding.loading.visibility = View.GONE
                            binding.animationView.visibility = View.VISIBLE
                            binding.tvNoAds.visibility = View.VISIBLE
                        }
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

    private fun observePaused() {
        binding.rvMyAds.visibility = View.GONE
        binding.loading.visibility = View.VISIBLE
        binding.animationView.visibility = View.GONE
        binding.tvNoAds.visibility = View.GONE
        viewModel.getPausedHousing(token = token!!)
        viewModel.getPausedResponse.observe(viewLifecycleOwner, Observer {

            if (it.status == Resource.Status.SUCCESS) {
                if (it.data?.status?.code == 200) {
                    it.data!!.let { it ->
                        if (it.results.isNotEmpty()) {
                            binding.rvMyAds.visibility = View.VISIBLE
                            binding.loading.visibility = View.GONE
                            binding.animationView.visibility = View.GONE
                            binding.tvNoAds.visibility = View.GONE
                            myAdsAdapter = MyAdsHousingAdapter(it.results) {}
                            myAdsAdapter.notifyDataSetChanged()
                            binding.rvMyAds.adapter = myAdsAdapter
                        } else {
                            binding.rvMyAds.visibility = View.GONE
                            binding.loading.visibility = View.GONE
                            binding.animationView.visibility = View.VISIBLE
                            binding.tvNoAds.visibility = View.VISIBLE
                        }
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

    private fun observeRejected() {
        binding.rvMyAds.visibility = View.GONE
        binding.loading.visibility = View.VISIBLE
        binding.animationView.visibility = View.GONE
        binding.tvNoAds.visibility = View.GONE
        viewModel.getRejectedHousing(token = token!!)
        viewModel.getRejectedResponse.observe(viewLifecycleOwner, Observer {

            if (it.status == Resource.Status.SUCCESS) {
                if (it.data?.status?.code == 200) {
                    it.data!!.let { it ->
                        if (it.results.isNotEmpty()) {
                            binding.rvMyAds.visibility = View.VISIBLE
                            binding.loading.visibility = View.GONE
                            binding.animationView.visibility = View.GONE
                            binding.tvNoAds.visibility = View.GONE
                            myAdsAdapter = MyAdsHousingAdapter(it.results) {}
                            myAdsAdapter.notifyDataSetChanged()
                            binding.rvMyAds.adapter = myAdsAdapter
                        } else {
                            binding.rvMyAds.visibility = View.GONE
                            binding.loading.visibility = View.GONE
                            binding.animationView.visibility = View.VISIBLE
                            binding.tvNoAds.visibility = View.VISIBLE
                        }
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
}