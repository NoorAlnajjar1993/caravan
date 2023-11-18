package com.dominate.caravan.ui.onboarding

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.caravan.R
import com.caravan.databinding.FragmentBannerBinding
import com.caravan.databinding.FragmentSplachBinding
import com.caravan.databinding.FragmentTalkThrough1Binding
import com.caravan.databinding.FragmentTalkThrough2Binding
import com.dominate.caravan.core.base.BaseFragment
import com.dominate.caravan.ui.home.HomeActivity

class TalkThrough2Fragment : BaseFragment() {

    lateinit var binding: FragmentTalkThrough2Binding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentTalkThrough2Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setData()

    }

    private fun setData(){

        binding.btnNext.setOnClickListener {
            findNavController().navigate(R.id.action_talkThrough2Fragment_to_talkThrough3Fragment)
        }

        binding.btnBack.setOnClickListener {
            findNavController().popBackStack()
        }
    }

}