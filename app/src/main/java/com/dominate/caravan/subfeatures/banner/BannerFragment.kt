package com.dominate.caravan.subfeatures.banner

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.caravan.databinding.FragmentBannerBinding
import com.dominate.caravan.core.base.BaseFragment

class BannerFragment : BaseFragment() {

    companion object {

        private const val ARG_SECTION_NUMBER = "section_number"

        @JvmStatic
        fun newInstance(sectionNumber: Int): BannerFragment {
            return BannerFragment().apply {
                arguments = Bundle().apply {
                    putInt(ARG_SECTION_NUMBER, sectionNumber)
                }
            }
        }
    }

    val viewModel: BannerViewModel by viewModels()

    lateinit var binding: FragmentBannerBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentBannerBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.setIndex(arguments?.getInt(ARG_SECTION_NUMBER) ?: 1)
    }


}