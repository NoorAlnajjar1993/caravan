package com.dominate.caravan.ui.addads

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.caravan.R
import com.caravan.databinding.FragmentAddAdsBinding
import com.caravan.databinding.FragmentSearchBinding
import com.dominate.caravan.core.autoCleared
import com.dominate.caravan.core.base.BaseFragment
import com.dominate.caravan.core.showCommercialDialog
import com.dominate.caravan.core.showHousingAdsDialog
import com.dominate.caravan.core.showLoginAddAdsDialog
import com.dominate.caravan.core.showLoginDialog
import com.dominate.caravan.ui.home.HomeActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AddAdsFragment : BaseFragment() ,TextWatcher {

     var binding: FragmentAddAdsBinding by  autoCleared()
    private val viewModel: AddAdsViewModel by viewModels()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAddAdsBinding.inflate(inflater, container, false)

        (activity as HomeActivity).binding.navView.visibility=View.VISIBLE


        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setData()
    }

    override fun afterTextChanged(s: Editable) {}
    override fun beforeTextChanged(
            s: CharSequence, start: Int, count: Int, after: Int
    ) {}

    override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {}

    private fun setData(){

        binding.ivBack.setOnClickListener {
            findNavController().popBackStack()
        }

        binding.constraintLayout02.setOnClickListener {
            if (prefs.isLoggedIn) {
                findNavController().navigate(R.id.action_addAdsFragment_to_addEstateAdsFragment)
            } else {
                // IF USER NOT LOGIN SHOW DIALOG
                requireContext().showLoginAddAdsDialog(
                    onPositiveButtonClick = {
                        findNavController().navigate(R.id.action_addAdsFragment_to_sigininFragment)
                        it.dismiss()
                    })
            }
        }

        binding.constraintLayout03.setOnClickListener {
            if (prefs.isLoggedIn) {
                requireContext().showHousingAdsDialog(
                    onPositiveButtonClick = {
                        findNavController().navigate(R.id.action_addAdsFragment_to_addHousingAdsFragment)
                        it.dismiss()
                    }, onNegativeButtonClick = {
                        it.dismiss()
                    })
            } else {
                // IF USER NOT LOGIN SHOW DIALOG
                requireContext().showLoginAddAdsDialog(
                    onPositiveButtonClick = {
                        findNavController().navigate(R.id.action_addAdsFragment_to_sigininFragment)
                        it.dismiss()
                    })
            }
        }

        binding.constraintLayout04.setOnClickListener {
            if (prefs.isLoggedIn) {
                requireContext().showCommercialDialog(
                    onPositiveButtonClick = {
                        findNavController().navigate(R.id.action_addAdsFragment_to_addCommercialAdsFragment)
                        it.dismiss()
                    }, onNegativeButtonClick = {
                        it.dismiss()
                    })
            } else {
                // IF USER NOT LOGIN SHOW DIALOG
                requireContext().showLoginAddAdsDialog(
                    onPositiveButtonClick = {
                        findNavController().navigate(R.id.action_addAdsFragment_to_sigininFragment)
                        it.dismiss()
                    })
            }
        }
    }

}