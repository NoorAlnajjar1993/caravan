package com.dominate.caravan.ui.home

import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.viewpager.widget.ViewPager
import com.caravan.R
import com.caravan.databinding.FragmentHomeBinding
import com.dominate.caravan.core.base.BaseFragment
import com.dominate.caravan.core.showLoginDialog
import com.dominate.caravan.medule.home.CommercialAd
import com.dominate.caravan.medule.home.CommercialEstate
import com.dominate.caravan.medule.home.HousingAd
import com.dominate.caravan.medule.home.RealEstateAd
import com.dominate.caravan.ui.home.adapter.CommercialAdsAdapter
import com.dominate.caravan.ui.home.adapter.CommercialEstatesAdapter
import com.dominate.caravan.ui.home.adapter.HousingAdsAdapter
import com.dominate.caravan.ui.home.adapter.RealEstateAdsAdapter
import com.dominate.caravan.utils.Resource
import dagger.hilt.android.AndroidEntryPoint
import java.util.Timer
import java.util.TimerTask

@AndroidEntryPoint
class HomeFragment : BaseFragment() {

    lateinit var binding: FragmentHomeBinding
    private val viewModel: HomeViewModel by viewModels()
    lateinit var housingAdsAdapter: HousingAdsAdapter
    lateinit var realEstateAdsAdapter: RealEstateAdsAdapter
    lateinit var commercialEstatesAdapter: CommercialEstatesAdapter
    lateinit var commercialAdsAdapter: CommercialAdsAdapter
    lateinit var bannerAdapter: BannerAdapter
    var token: String? = ""
    var currentPage = 0
    var NUM_PAGES = 5


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setData()
        setRecycleView()
    }

    private fun setData() {

        try {
            token = prefs.getCurrentUser().token.toString()
        } catch (_: Exception) {
        }


        binding.viewPager.setPageTransformer(true, ZoomOutPageTransformer())

        val handler = Handler()
        val update = Runnable {
            if (currentPage == NUM_PAGES) {
                currentPage = 0
            }
            binding.viewPager.setCurrentItem(currentPage++, true)
        }


        Timer().schedule(object : TimerTask() {
            override fun run() {
                handler.post(update)
            }
        }, 400, 10000)

        binding.btnSearchNow.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_searchFragment)
        }

        observeHome()
    }

    fun observeHome() {
        viewModel.getHome()
        viewModel.getHomeResponse.observe(viewLifecycleOwner, Observer {

            if (it.status == Resource.Status.SUCCESS) {
                if (it.data?.status?.code == 200) {
                    it.data!!.let {
                        housingAdsData(it.results.housing_ads)
                        realEstateAdsData(it.results.real_estate_ads)
                        commercialEstatesData(it.results.commercial_estates)
                        commercialAdsData(it.results.commercial_ads)
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

    private fun housingAdsData(housingAds: MutableList<HousingAd>) {
        if (housingAds.isNotEmpty()) {
            housingAdsAdapter = HousingAdsAdapter(housingAds) {
                if (prefs.isLoggedIn && !token.isNullOrEmpty()) {
                    it!!.is_favorite = !it.is_favorite
                    AddRemoveFavorite(id = it.id, it.is_favorite)
                } else {
                    // IF USER NOT LOGIN SHOW DIALOG
                    requireContext().showLoginDialog(
                        onPositiveButtonClick = {
                            findNavController().navigate(R.id.action_homeFragment_to_sigininFragment)
                            it.dismiss()
                        }, onNegativeButtonClick = {
                            it.dismiss()
                        })
                }
            }
            housingAdsAdapter.notifyDataSetChanged()
            binding.rvHousingAds.adapter = housingAdsAdapter
        } else {
            binding.tvHousingAds.visibility = View.GONE
            binding.tvMoreHousingAds.visibility = View.GONE
        }
    }

    private fun realEstateAdsData(realEstateAds: MutableList<RealEstateAd>) {
        if (realEstateAds.isNotEmpty()) {
            realEstateAdsAdapter = RealEstateAdsAdapter(realEstateAds) {
                if (prefs.isLoggedIn && !token.isNullOrEmpty()) {
                    it!!.is_favorite = !it.is_favorite
                    AddRemoveFavorite(id = it.id, it.is_favorite)
                } else {
                    // IF USER NOT LOGIN SHOW DIALOG
                    requireContext().showLoginDialog(
                        onPositiveButtonClick = {
                            findNavController().navigate(R.id.action_homeFragment_to_sigininFragment)
                            it.dismiss()
                        }, onNegativeButtonClick = {
                            it.dismiss()
                        })
                }
            }
            realEstateAdsAdapter.notifyDataSetChanged()
            binding.rvRealEstateAds.adapter = realEstateAdsAdapter
        } else {
            binding.tvRealEstateAds.visibility = View.GONE
            binding.tvMoreRealEstateAds.visibility = View.GONE
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


    private fun commercialEstatesData(commercialEstates: MutableList<CommercialEstate>) {
        if (commercialEstates.isNotEmpty()) {
            commercialEstatesAdapter = CommercialEstatesAdapter(commercialEstates) {
                if (prefs.isLoggedIn && !token.isNullOrEmpty()) {
                    it!!.is_favorite = !it.is_favorite
                    AddRemoveFavorite(id = it.id, it.is_favorite)
                } else {
                    // IF USER NOT LOGIN SHOW DIALOG
                    requireContext().showLoginDialog(
                        onPositiveButtonClick = {
                            findNavController().navigate(R.id.action_homeFragment_to_sigininFragment)
                            it.dismiss()
                        }, onNegativeButtonClick = {
                            it.dismiss()
                        })
                }
            }
            commercialEstatesAdapter.notifyDataSetChanged()
            binding.rvCommercialEstates.adapter = commercialEstatesAdapter
        } else {
            binding.tvCommercialEstates.visibility = View.GONE
            binding.tvMoreCommercialEstates.visibility = View.GONE
        }
    }

    private fun commercialAdsData(commercialAds: MutableList<CommercialAd>) {
        if (commercialAds.isNotEmpty()) {
            commercialAdsAdapter = CommercialAdsAdapter(commercialAds) {
                if (prefs.isLoggedIn && !token.isNullOrEmpty()) {
                    it!!.is_favorite = !it.is_favorite
                    AddRemoveFavorite(id = it.id, it.is_favorite)
                } else {
                    // IF USER NOT LOGIN SHOW DIALOG
                    requireContext().showLoginDialog(
                        onPositiveButtonClick = {
                            findNavController().navigate(R.id.action_homeFragment_to_sigininFragment)
                            it.dismiss()
                        }, onNegativeButtonClick = {
                            it.dismiss()
                        })
                }
            }
            commercialAdsAdapter.notifyDataSetChanged()
            binding.rvCommercialAds.adapter = commercialAdsAdapter
        } else {
            binding.tvMoreCommercialAds.visibility = View.GONE
            binding.tvCommercialAds.visibility = View.GONE
        }
    }

    private fun setRecycleView() {
        var imageList: MutableList<BannerModule> = mutableListOf()
        imageList.add(BannerModule(R.drawable.photo4))
        imageList.add(BannerModule(R.drawable.photo4))
        imageList.add(BannerModule(R.drawable.photo4))
        imageList.add(BannerModule(R.drawable.photo4))
        imageList.add(BannerModule(R.drawable.photo4))
        bannerAdapter = BannerAdapter(requireContext(), imageList)
        bannerAdapter.notifyDataSetChanged()

        binding.viewPager.adapter = bannerAdapter
        binding.tabLayout.setupWithViewPager(binding.viewPager, true)
    }

}

private const val MIN_SCALE = 0.85f
private const val MIN_ALPHA = 0.5f

class ZoomOutPageTransformer : ViewPager.PageTransformer {

    override fun transformPage(view: View, position: Float) {
        view.apply {
            val pageWidth = width
            val pageHeight = height
            when {
                position < -1 -> { // [-Infinity,-1)
                    // This page is way off-screen to the left.
                    alpha = 0f
                }

                position <= 1 -> { // [-1,1]
                    // Modify the default slide transition to shrink the page as well
                    val scaleFactor = Math.max(MIN_SCALE, 1 - Math.abs(position))
                    val vertMargin = pageHeight * (1 - scaleFactor) / 2
                    val horzMargin = pageWidth * (1 - scaleFactor) / 2
                    translationX = if (position < 0) {
                        horzMargin - vertMargin / 2
                    } else {
                        horzMargin + vertMargin / 2
                    }

                    // Scale the page down (between MIN_SCALE and 1)
                    scaleX = scaleFactor
                    scaleY = scaleFactor

                    // Fade the page relative to its size.
                    alpha = (MIN_ALPHA +
                            (((scaleFactor - MIN_SCALE) / (1 - MIN_SCALE)) * (1 - MIN_ALPHA)))
                }

                else -> { // (1,+Infinity]
                    // This page is way off-screen to the right.
                    alpha = 0f
                }
            }
        }
    }


}