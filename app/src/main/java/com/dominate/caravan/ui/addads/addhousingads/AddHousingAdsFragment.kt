package com.dominate.caravan.ui.addads.addhousingads

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.core.content.ContextCompat
import androidx.core.os.bundleOf
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.caravan.R
import com.caravan.databinding.FragmentAddAdsBinding
import com.caravan.databinding.FragmentAddHousingAdsBinding
import com.caravan.databinding.FragmentCommericalAdverismentBinding
import com.caravan.databinding.FragmentSearchBinding
import com.dominate.caravan.core.autoCleared
import com.dominate.caravan.core.base.BaseFragment
import com.dominate.caravan.ui.addads.AddAdsViewModel
import com.dominate.caravan.ui.addads.addestateads.AddCategoryModel
import com.dominate.caravan.ui.addads.addestateads.adapter.AddCategoryAdapter
import com.dominate.caravan.ui.addads.commericaladvertisment.SpinnerAdapter
import com.dominate.caravan.ui.home.HomeActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AddHousingAdsFragment : BaseFragment() ,TextWatcher {

    var binding: FragmentAddHousingAdsBinding by  autoCleared()
    private val viewModel: AddAdsViewModel by viewModels()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAddHousingAdsBinding.inflate(inflater, container, false)

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

        binding.radioYesWithGardenGear.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked){
                binding.tvGearAreaSquareMetres.visibility = View.VISIBLE
                binding.tlGearAreaSquareMetres.visibility = View.VISIBLE
            } else{
                binding.tvGearAreaSquareMetres.visibility = View.GONE
                binding.tlGearAreaSquareMetres.visibility = View.GONE
            }
        }

        binding.radioYesWithRoof.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked){
                binding.tvRoofAreaSquareMetres.visibility = View.VISIBLE
                binding.tlRoofAreaSquareMetres.visibility = View.VISIBLE
            } else{
                binding.tvRoofAreaSquareMetres.visibility = View.GONE
                binding.tlRoofAreaSquareMetres.visibility = View.GONE
            }
        }

        var arrayList : MutableList<String> = mutableListOf()
        arrayList.add("1")
        arrayList.add("2")
        arrayList.add("3")
        arrayList.add("4")
        val testAdapter = SpinnerAdapter(
            requireContext(),
            androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,
            arrayList,
            Color.WHITE
        )
        val autoCompleteTv = binding.actvNumberBathrooms
        autoCompleteTv.setText("اختر")
        autoCompleteTv.setDropDownBackgroundDrawable(
            ColorDrawable(
                ContextCompat.getColor(
                    requireContext(),
                    R.color.light_purple
                )
            )
        )
        binding.actvNumberBathrooms.setAdapter(testAdapter)
        binding.actvNumberBathrooms.setOnItemClickListener { parent, view, position, id ->

//            val id = it.data?.find {
//                it.enTitle == autoCompleteTv.text.toString()
//            }?.id
//            viewModel.currencyId = id!!
        }

        val testAdapter2 = SpinnerAdapter(
            requireContext(),
            androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,
            arrayList,
            Color.WHITE
        )
        val autoCompleteTv2 = binding.actvNumberBedrooms
        autoCompleteTv2.setText("اختر")
        autoCompleteTv2.setDropDownBackgroundDrawable(
            ColorDrawable(
                ContextCompat.getColor(
                    requireContext(),
                    R.color.light_purple
                )
            )
        )
        binding.actvNumberBedrooms.setAdapter(testAdapter2)
        binding.actvNumberBedrooms.setOnItemClickListener { parent, view, position, id ->

//            val id = it.data?.find {
//                it.enTitle == autoCompleteTv.text.toString()
//            }?.id
//            viewModel.currencyId = id!!
        }

        val testAdapter3 = SpinnerAdapter(
            requireContext(),
            androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,
            arrayList,
            Color.WHITE
        )
        val autoCompleteTv3 = binding.actvFloor
        autoCompleteTv3.setText("اختر")
        autoCompleteTv3.setDropDownBackgroundDrawable(
            ColorDrawable(
                ContextCompat.getColor(
                    requireContext(),
                    R.color.light_purple
                )
            )
        )
        binding.actvFloor.setAdapter(testAdapter3)
        binding.actvFloor.setOnItemClickListener { parent, view, position, id ->

//            val id = it.data?.find {
//                it.enTitle == autoCompleteTv.text.toString()
//            }?.id
//            viewModel.currencyId = id!!
        }

        binding.btnNext.setOnClickListener {
            findNavController().navigate(R.id.action_addHousingAdsFragment_to_addAdsImages)
        }
    }

}