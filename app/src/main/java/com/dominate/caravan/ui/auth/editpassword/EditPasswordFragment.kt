package com.dominate.caravan.ui.auth.editpassword

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.caravan.R
import com.caravan.databinding.FragmentEditPasswordBinding
import com.dominate.caravan.core.autoCleared
import com.dominate.caravan.core.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class EditPasswordFragment  : BaseFragment()  , TextWatcher {

     var binding: FragmentEditPasswordBinding by autoCleared()
    private val viewModel: EditPasswordViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentEditPasswordBinding.inflate(inflater, container, false)


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

        binding.btnSetPassword.setOnClickListener {
            findNavController().navigate(R.id.action_editPasswordFragment_to_sigininFragment)

        }

        binding.ivClose.setOnClickListener {
            findNavController().popBackStack()

        }
    }
}