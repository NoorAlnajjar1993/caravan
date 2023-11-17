package com.dominate.caravan.ui.auth.resetpassword

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dominate.caravan.core.base.BaseFragment
import com.caravan.databinding.FragmentForgotPasswordBinding


class ForgotPasswordFragment : BaseFragment() {

    lateinit var binding: FragmentForgotPasswordBinding

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {
        binding = FragmentForgotPasswordBinding.inflate(inflater, container, false)


        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}