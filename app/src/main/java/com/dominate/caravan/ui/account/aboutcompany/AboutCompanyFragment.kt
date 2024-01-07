package com.dominate.caravan.ui.account.aboutcompany

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.caravan.R
import com.caravan.databinding.FragmentAboutCompanyBinding
import com.caravan.databinding.FragmentAccountSettingBinding
import com.caravan.databinding.FragmentEditPasswordBinding
import com.dominate.caravan.core.autoCleared
import com.dominate.caravan.core.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AboutCompanyFragment  : BaseFragment()  , TextWatcher {

     var binding: FragmentAboutCompanyBinding by autoCleared()
    private val viewModel: AboutCompanyViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAboutCompanyBinding.inflate(inflater, container, false)


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

        binding.tvTermsOfUse.setOnClickListener {
            findNavController().navigate(R.id.action_aboutCompanyFragment_to_termOfUseFragment)

        }

        binding.tvPrivacyPolicy.setOnClickListener {
            findNavController().navigate(R.id.action_aboutCompanyFragment_to_privacyPolicyFragment)

        }

        binding.ivBack.setOnClickListener {
            findNavController().popBackStack()

        }
    }
}