package com.dominate.caravan.ui.splach

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
import com.dominate.caravan.core.base.BaseFragment
import com.dominate.caravan.ui.home.HomeActivity

class SplashFragment : BaseFragment() {

    val viewModel: SplashViewModel by viewModels()
    lateinit var binding: FragmentSplachBinding
    private val SPLASH_TIME_OUT:Long=3000 // 3 sec

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentSplachBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        Handler().postDelayed({
            this@SplashFragment.findNavController().navigate(R.id.action_splashFragment_to_talkThrough1Fragment)
        }, SPLASH_TIME_OUT)
    }
}