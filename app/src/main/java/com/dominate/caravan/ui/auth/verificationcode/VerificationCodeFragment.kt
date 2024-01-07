package com.dominate.caravan.ui.auth.verificationcode

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.caravan.R
import com.dominate.caravan.core.base.BaseFragment
import com.caravan.databinding.FragmentForgotPasswordBinding
import com.caravan.databinding.FragmentVerificationCodeBinding


class VerificationCodeFragment : BaseFragment() {

    lateinit var binding: FragmentVerificationCodeBinding

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {
        binding = FragmentVerificationCodeBinding.inflate(inflater, container, false)


        return binding.root

    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setData()

    }

    private fun setData(){

        binding.btnContinuation.setOnClickListener {
            findNavController().navigate(R.id.action_verificationCodeFragment_to_editPasswordFragment)

        }

        binding.ivClose.setOnClickListener {
            findNavController().popBackStack()

        }
    }
}