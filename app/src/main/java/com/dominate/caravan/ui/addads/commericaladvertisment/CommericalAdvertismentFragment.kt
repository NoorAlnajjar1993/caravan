package com.dominate.caravan.ui.addads.commericaladvertisment

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
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.caravan.R
import com.caravan.databinding.FragmentAddAdsBinding
import com.caravan.databinding.FragmentCommericalAdverismentBinding
import com.caravan.databinding.FragmentSearchBinding
import com.dominate.caravan.core.autoCleared
import com.dominate.caravan.core.base.BaseFragment
import com.dominate.caravan.ui.home.HomeActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CommericalAdvertismentFragment : BaseFragment() ,TextWatcher {

     var binding: FragmentCommericalAdverismentBinding by  autoCleared()
    private val viewModel: CommericalAdvertismentViewModel by viewModels()
    lateinit var apartmentFeatureAdapter:ApartmentFeatureAdapter


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCommericalAdverismentBinding.inflate(inflater, container, false)

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

        binding.rvDetermineApartmentsFeatures!!.layoutManager = GridLayoutManager(
            requireContext(), 4,
            GridLayoutManager.VERTICAL, false
        )

        var featureList : MutableList<ApartmentFeatureModel> = mutableListOf()
        featureList.add(ApartmentFeatureModel(R.drawable.ic_feature_1 , "فيربليس"))
        featureList.add(ApartmentFeatureModel(R.drawable.ic_feature_2 , "مطبخ غلوس"))
        featureList.add(ApartmentFeatureModel(R.drawable.ic_feature_3 , "مطبخ ألومنيوم"))
        featureList.add(ApartmentFeatureModel(R.drawable.ic_feature_4 , "مطبخ خشب"))

        featureList.add(ApartmentFeatureModel(R.drawable.ic_feature_5 , "تأسيس مكيفات"))
        featureList.add(ApartmentFeatureModel(R.drawable.ic_feature_6 , "مكيفات راكبة"))
        featureList.add(ApartmentFeatureModel(R.drawable.ic_feature_7 , "تأسيس تدفئة"))
        featureList.add(ApartmentFeatureModel(R.drawable.ic_feature_8 , "تدفئة راكبة"))

        featureList.add(ApartmentFeatureModel(R.drawable.ic_feature_9 , "خلايا شمسية"))
        featureList.add(ApartmentFeatureModel(R.drawable.ic_feature_10 , "سخان شمسي"))
        featureList.add(ApartmentFeatureModel(R.drawable.ic_feature_11 , "اباجورات كهرباء"))
        featureList.add(ApartmentFeatureModel(R.drawable.ic_feature_12 , "زجاج عازل"))

        featureList.add(ApartmentFeatureModel(R.drawable.ic_feature_13 , "منطقة للشوي"))
        featureList.add(ApartmentFeatureModel(R.drawable.ic_feature_14 , "غسيل/خادمة"))
        featureList.add(ApartmentFeatureModel(R.drawable.ic_feature_15 , "مخزن مستقل"))
        featureList.add(ApartmentFeatureModel(R.drawable.ic_feature_16 , "بئر ماء منفصل"))

        featureList.add(ApartmentFeatureModel(R.drawable.ic_feature_17 , "منطقة للألعاب"))
        featureList.add(ApartmentFeatureModel(R.drawable.ic_feature_18 , "مسبح"))
        featureList.add(ApartmentFeatureModel(R.drawable.ic_feature_19 , "موقف سيارة"))


        apartmentFeatureAdapter = ApartmentFeatureAdapter(featureList)
        apartmentFeatureAdapter.notifyDataSetChanged()
        binding.rvDetermineApartmentsFeatures.adapter = apartmentFeatureAdapter
    }

}
data class ApartmentFeatureModel(
    val image: Int, val text: String)