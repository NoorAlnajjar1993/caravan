package com.dominate.caravan.ui.onboarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.navigation.fragment.findNavController
import com.caravan.R
import com.caravan.databinding.FragmentTalkThrough1Binding
import com.dominate.caravan.core.base.BaseFragment


class TalkThrough1Fragment : BaseFragment() {

    lateinit var binding: FragmentTalkThrough1Binding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentTalkThrough1Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setData()

    }

    private fun setData(){

        val fade_in: Animation = AnimationUtils.loadAnimation(
            requireContext(),
            R.anim.fade_in)
        val slide_up: Animation = AnimationUtils.loadAnimation(
            requireContext(),
            R.anim.slide_up)
        binding.constraintLayout01.startAnimation(fade_in)
        binding.textView01.startAnimation(slide_up)
        binding.textView02.startAnimation(slide_up)

        binding.btnNext.setOnClickListener {
            findNavController().navigate(R.id.action_talkThrough1Fragment_to_talkThrough2Fragment)
        }
    }


}