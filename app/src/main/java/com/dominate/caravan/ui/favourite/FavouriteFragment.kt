package com.dominate.caravan.ui.favourite

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
import androidx.navigation.fragment.findNavController
import com.caravan.R
import com.caravan.databinding.FragmentFavouriteBinding
import com.dominate.caravan.core.autoCleared
import com.dominate.caravan.core.base.BaseFragment
import com.dominate.caravan.core.showLoginDialog
import com.dominate.caravan.medule.home.RealEstateAd
import com.dominate.caravan.ui.favourite.adapter.FavouritesAdapter
import com.dominate.caravan.ui.home.HomeViewModel
import com.dominate.caravan.utils.Resource
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FavouriteFragment : BaseFragment(), TextWatcher {

    var binding: FragmentFavouriteBinding by autoCleared()
    private val viewModel: FavouriteViewModel by viewModels()
    private val homeViewModel: HomeViewModel by viewModels()
    var token: String? = ""
    lateinit var favouritesAdapter: FavouritesAdapter


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFavouriteBinding.inflate(inflater, container, false)


        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setRecycleView()
        setData()

    }

    private fun setRecycleView() {


    }


    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

    }

    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {


    }

    override fun afterTextChanged(s: Editable?) {


    }


    private fun setData() {

        val fade_in: Animation = AnimationUtils.loadAnimation(
            requireContext(),
            R.anim.fade_in
        )
        binding.constraintLayout01.startAnimation(fade_in)

        try {
            token = prefs.getCurrentUser().token.toString()
        } catch (ec: java.lang.Exception) {
        }
        try {
            observeFavorites()
        } catch (e: java.lang.Exception) {
        }

    }

    private fun observeFavorites() {
        viewModel.getFavoriteList(token!!)
        viewModel.favoriteListResponse.observe(viewLifecycleOwner, androidx.lifecycle.Observer {
            if (it.status == Resource.Status.SUCCESS) {
                it.data!!.let {
                    binding.loading.visibility = View.GONE
                    favoritesData(it.results)
                }
            } else {
                binding.loading.visibility = View.GONE
            }
        })
    }

    private fun favoritesData(realEstateAd: MutableList<RealEstateAd>) {
        if (realEstateAd.isNotEmpty()) {
            binding.animationView.visibility = View.GONE
            binding.tvNoFav.visibility = View.GONE
            favouritesAdapter = FavouritesAdapter(realEstateAd) {
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
            favouritesAdapter.notifyDataSetChanged()
            binding.rvFavourite.adapter = favouritesAdapter
        } else {
            binding.animationView.visibility = View.VISIBLE
            binding.tvNoFav.visibility = View.VISIBLE
        }
    }

    private fun AddRemoveFavorite(id: Int, isFavorite: Boolean) {
        if (isFavorite) {
            id.let { id ->
                homeViewModel.addFavoriteItem(
                    token!!, id
                )
            }
            homeViewModel.addFavoriteResponse.observe(
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
                homeViewModel.removeFavoriteItem(
                    token!!, id
                )
            }

            homeViewModel.removeFavoriteResponse.observe(
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