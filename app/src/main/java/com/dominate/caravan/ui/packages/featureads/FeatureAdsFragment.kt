package com.dominate.caravan.ui.packages.featureads

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.caravan.R
import com.caravan.databinding.FragmentAddCommercialEstateBinding
import com.caravan.databinding.FragmentFeatureAdsBinding
import com.dominate.caravan.core.autoCleared
import com.dominate.caravan.core.base.BaseFragment
import com.dominate.caravan.ui.addads.AddAdsViewModel
import com.dominate.caravan.ui.addads.addcommercialestate.adapter.AddCommercialEstateAdapter
import com.dominate.caravan.ui.addads.addestateads.AddCategoryModel
import com.vdx.designertoast.DesignerToast
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FeatureAdsFragment : BaseFragment(), TextWatcher {

    var binding: FragmentFeatureAdsBinding by autoCleared()
    var type = 0

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFeatureAdsBinding.inflate(inflater, container, false)

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

        binding.ivBack.setOnClickListener {
            findNavController().popBackStack()
        }

        binding.constraintLayout01.setOnClickListener {
            binding.linearLayoutCompat01.background = resources.getDrawable(R.drawable.outline_in_purple)
            binding.linearLayoutCompat02.background = resources.getDrawable(R.drawable.outline_in_purple2)

        }
        binding.constraintLayout02.setOnClickListener {
            binding.linearLayoutCompat01.background = resources.getDrawable(R.drawable.outline_in_purple2)
            binding.linearLayoutCompat02.background = resources.getDrawable(R.drawable.outline_in_purple)

        }

        binding.btnNext.setOnClickListener {
            findNavController().navigate(R.id.action_featureAdsFragment_to_packagesFragment)
        }


        fun showErrorToast(message: String) {
            DesignerToast.Custom(
                requireContext(),
                message,
                Gravity.TOP or Gravity.FILL_HORIZONTAL,
                Toast.LENGTH_SHORT,
                R.drawable.purple_gradient,
                16,
                "#FFFFFF",
                R.drawable.ic_close_purple,
                55,
                219
            )
        }
    }
}