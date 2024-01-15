package com.dominate.caravan.ui.addads.addcommercialads

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
import com.caravan.databinding.FragmentAddCommercialAdsBinding
import com.caravan.databinding.FragmentAddCommercialEstateBinding
import com.caravan.databinding.FragmentCommercialAdsBinding
import com.dominate.caravan.core.autoCleared
import com.dominate.caravan.core.base.BaseFragment
import com.dominate.caravan.ui.addads.AddAdsViewModel
import com.dominate.caravan.ui.addads.addcommercialestate.adapter.AddCommercialEstateAdapter
import com.dominate.caravan.ui.addads.addestateads.AddCategoryModel
import com.vdx.designertoast.DesignerToast
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AddCommercialAdsFragment : BaseFragment(), TextWatcher {

    var binding: FragmentAddCommercialAdsBinding by autoCleared()
    private val viewModel: AddAdsViewModel by viewModels()
    lateinit var addCommercialEstateAdapter: AddCommercialEstateAdapter
    var estateType = 0

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAddCommercialAdsBinding.inflate(inflater, container, false)

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


        var addCategoryList: MutableList<AddCategoryModel> = mutableListOf()
        addCategoryList.add(AddCategoryModel(1, "صيانة و تشطيبات", false))
        addCategoryList.add(AddCategoryModel(2, "أثاث مكتبي", false))
        addCategoryList.add(AddCategoryModel(3, "مقاولات", false))
        addCategoryList.add(AddCategoryModel(4, "حدائق و مشاتل", false))
        addCategoryList.add(AddCategoryModel(5, "ديكورات و تصميم", false))
        addCategoryList.add(AddCategoryModel(6, "مفروشات", false))
        addCategoryList.add(AddCategoryModel(7, "كهربائيات منزلية", false))
        addCategoryList.add(AddCategoryModel(8, "هندسة معمارية", false))
        addCategoryList.add(AddCategoryModel(9, "مطابخ", false))
        addCategoryList.add(AddCategoryModel(10, "أخرى", false))


        addCommercialEstateAdapter = AddCommercialEstateAdapter(addCategoryList) {
            estateType = it!!.id
        }
        addCommercialEstateAdapter.notifyDataSetChanged()
        binding.rvSelectAdCategory.adapter = addCommercialEstateAdapter

        binding.btnNext.setOnClickListener {
            if (estateType == 0) {
                showErrorToast("حدد نوع الإعلان التجاري")
            } else {
                findNavController().navigate(R.id.action_addCommercialAdsFragment_to_addAdsImages)
            }
        }
    }

    fun showErrorToast(message: String) {
        DesignerToast.Custom(
            requireContext(), message, Gravity.TOP or Gravity.FILL_HORIZONTAL, Toast.LENGTH_SHORT,
            R.drawable.purple_gradient, 16, "#FFFFFF", R.drawable.ic_close_purple, 55, 219
        )
    }


}