package com.dominate.caravan.ui.notification

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.caravan.R
import com.caravan.databinding.FragmentEditPasswordBinding
import com.caravan.databinding.FragmentFavouriteBinding
import com.caravan.databinding.FragmentNotificationBinding
import com.caravan.databinding.FragmentProfileBinding
import com.dominate.caravan.core.autoCleared
import com.dominate.caravan.core.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class NotificationFragment  : BaseFragment()  , TextWatcher {

     var binding: FragmentNotificationBinding by autoCleared()
    private val viewModel: NotificationViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentNotificationBinding.inflate(inflater, container, false)


        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setData()

    }


    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

    }

    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {



    }

    override fun afterTextChanged(s: Editable?) {


    }


    private fun setData(){

        val fade_in: Animation = AnimationUtils.loadAnimation(
            requireContext(),
            R.anim.fade_in)
        binding.constraintLayout01.startAnimation(fade_in)

    }
}