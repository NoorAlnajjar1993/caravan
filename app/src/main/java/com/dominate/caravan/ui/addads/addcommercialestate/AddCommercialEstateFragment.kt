package com.dominate.caravan.ui.addads.addcommercialestate

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
import com.dominate.caravan.core.autoCleared
import com.dominate.caravan.core.base.BaseFragment
import com.dominate.caravan.ui.addads.AddAdsViewModel
import com.dominate.caravan.ui.addads.addcommercialestate.adapter.AddCommercialEstateAdapter
import com.dominate.caravan.ui.addads.addestateads.AddCategoryModel
import com.vdx.designertoast.DesignerToast
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AddCommercialEstateFragment : BaseFragment(), TextWatcher {

    var binding: FragmentAddCommercialEstateBinding by autoCleared()
    private val viewModel: AddAdsViewModel by viewModels()
    lateinit var addCommercialEstateAdapter: AddCommercialEstateAdapter
    var type = 0

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAddCommercialEstateBinding.inflate(inflater, container, false)

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
        addCategoryList.add(AddCategoryModel(1, "مجمع تجاري", false))
        addCategoryList.add(AddCategoryModel(2, "مصانع/معامل", false))
        addCategoryList.add(AddCategoryModel(3, "مكاتب", false))
        addCategoryList.add(AddCategoryModel(4, "مخازن/مستودعات", false))
        addCategoryList.add(AddCategoryModel(5, "منتجع سياحي", false))
        addCategoryList.add(AddCategoryModel(6, "فنادق", false))
        addCategoryList.add(AddCategoryModel(7, "محلات", false))
        addCategoryList.add(AddCategoryModel(8, "مستشفيات", false))
        addCategoryList.add(AddCategoryModel(9, "كازيات", false))
        addCategoryList.add(AddCategoryModel(10, "فيلا تجارية", false))
        addCategoryList.add(AddCategoryModel(11, "مدرسة/روضة/حضانة", false))
        addCategoryList.add(AddCategoryModel(12, "غير ذلك", false))


        addCommercialEstateAdapter = AddCommercialEstateAdapter(addCategoryList) {
            type = it!!.id
        }
        addCommercialEstateAdapter.notifyDataSetChanged()
        binding.rvSelectAdCategory.adapter = addCommercialEstateAdapter

        binding.btnNext.setOnClickListener {
            if (type == 0) {
                showErrorToast("حدد نوع الإعلان التجاري")
            } else {
                CommericalAdSpecificationsFragment.type = type
                findNavController().navigate(R.id.action_addCommercialEstateFragment_to_commericalAdSpecificationsFragment)
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