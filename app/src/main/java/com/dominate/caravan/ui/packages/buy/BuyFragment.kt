package com.dominate.caravan.ui.packages.buy

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
import com.caravan.databinding.FragmentBuyBinding
import com.caravan.databinding.FragmentFeatureAdsBinding
import com.caravan.databinding.FragmentPackagesBinding
import com.dominate.caravan.core.autoCleared
import com.dominate.caravan.core.base.BaseFragment
import com.dominate.caravan.ui.addads.AddAdsViewModel
import com.dominate.caravan.ui.addads.addcommercialestate.adapter.AddCommercialEstateAdapter
import com.dominate.caravan.ui.addads.addestateads.AddCategoryModel
import com.vdx.designertoast.DesignerToast
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class BuyFragment : BaseFragment(), TextWatcher {

    var binding: FragmentBuyBinding by autoCleared()
    var type = 0

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBuyBinding.inflate(inflater, container, false)

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



        binding.btnBuyNow.setOnClickListener {

            if (type == 0){
                showErrorToast("اختر طريقة الدفع")
            } else if (type == 1){
                findNavController().navigate(R.id.action_buyFragment_to_transferDataFragment)
            } else if (type == 2){
                findNavController().navigate(R.id.action_buyFragment_to_cliqFragment)
            }
        }

        binding.rbTransferData.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked){
                type = 1
            } else {
                type = 2
            }
        }

        binding.rbCliq.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked){
                type = 2
            } else {
                type = 1
            }
        }
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