package com.dominate.caravan.ui.addads.addestateads

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
import com.caravan.databinding.FragmentAddEstateAdsBinding
import com.dominate.caravan.core.autoCleared
import com.dominate.caravan.core.base.BaseFragment
import com.dominate.caravan.ui.addads.AddAdsViewModel
import com.dominate.caravan.ui.addads.addestateads.adapter.AddCategoryAdapter
import com.dominate.caravan.ui.addads.addestateads.adapter.EstateTypeAdapter
import com.dominate.caravan.ui.addads.commericaladvertisment.CommericalAdvertismentFragment
import com.vdx.designertoast.DesignerToast
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AddEstateAdsFragment : BaseFragment(), TextWatcher {

    var binding: FragmentAddEstateAdsBinding by autoCleared()
    private val viewModel: AddAdsViewModel by viewModels()
    lateinit var addCategoryAdapter: AddCategoryAdapter
    lateinit var estateTypeAdapter: EstateTypeAdapter
    var adCategory = 0
    var estateType = 0

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAddEstateAdsBinding.inflate(inflater, container, false)

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

        binding.btnNext.setOnClickListener {
            if (adCategory != 0) {
                if (estateType == 0){
                    showErrorToast("حدد نوع العقار")
                } else if (estateType == 1){
                    CommericalAdvertismentFragment.title = "مواصفات الشقة"
                    CommericalAdvertismentFragment.estateType = estateType
                    findNavController().navigate(R.id.action_addEstateAdsFragment_to_commericalAdvertismentFragment)

                } else if (estateType == 2){
                    findNavController().navigate(R.id.action_addEstateAdsFragment_to_addCommercialEstateFragment)

                } else if (estateType == 3){
                    CommericalAdvertismentFragment.title = "مواصفات العمارة"
                    CommericalAdvertismentFragment.estateType = estateType
                    findNavController().navigate(R.id.action_addEstateAdsFragment_to_commericalAdvertismentFragment)

                } else if (estateType == 4){
                    CommericalAdvertismentFragment.title = "مواصفات قطعة الأرض"
                    CommericalAdvertismentFragment.estateType = estateType
                    findNavController().navigate(R.id.action_addEstateAdsFragment_to_commericalAdvertismentFragment)

                } else if (estateType == 5){
                    CommericalAdvertismentFragment.title = "مواصفات المنزل/فيلا"
                    CommericalAdvertismentFragment.estateType = estateType
                    findNavController().navigate(R.id.action_addEstateAdsFragment_to_commericalAdvertismentFragment)

                } else if (estateType == 6){
                    CommericalAdvertismentFragment.title = "مواصفات المزرعة/شاليه"
                    CommericalAdvertismentFragment.estateType = estateType
                    findNavController().navigate(R.id.action_addEstateAdsFragment_to_commericalAdvertismentFragment)

                }
            } else {
                showErrorToast("حدد فئة الإعلان")
            }
        }


        var addCategoryList: MutableList<AddCategoryModel> = mutableListOf()
        addCategoryList.add(AddCategoryModel(1, "للإيجار", false))
        addCategoryList.add(AddCategoryModel(2, "للبيع", false))

        addCategoryAdapter = AddCategoryAdapter (addCategoryList){
            adCategory = it!!.id
        }
        addCategoryAdapter . notifyDataSetChanged ()
        binding . rvSelectAdCategory . adapter = addCategoryAdapter


        var estateTypeList: MutableList<AddCategoryModel> = mutableListOf()
        estateTypeList.add(AddCategoryModel(1, "شقة", false))
        estateTypeList.add(AddCategoryModel(2, "عقار تجاري", false))
        estateTypeList.add(AddCategoryModel(3, "عمارة", false))
        estateTypeList.add(AddCategoryModel(4, "أرض", false))
        estateTypeList.add(AddCategoryModel(5, "فيلا/منزل", false))
        estateTypeList.add(AddCategoryModel(6, "مزرعة/شاليه", false))


        estateTypeAdapter = EstateTypeAdapter (estateTypeList){
            estateType = it!!.id
        }
        estateTypeAdapter . notifyDataSetChanged ()
        binding . rvEstateType . adapter = estateTypeAdapter
    }

    fun showErrorToast(message: String) {
        DesignerToast.Custom(
            requireContext(), message, Gravity.TOP or Gravity.FILL_HORIZONTAL, Toast.LENGTH_SHORT,
            R.drawable.purple_gradient, 16, "#FFFFFF", R.drawable.ic_close_purple, 55, 219
        )
    }

}

data class AddCategoryModel(
    val id: Int, val text: String, var selected: Boolean
)