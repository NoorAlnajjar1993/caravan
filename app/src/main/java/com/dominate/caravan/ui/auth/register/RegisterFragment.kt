package com.dominate.caravan.ui.auth.register

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.caravan.databinding.FragmentRegisterBinding
import com.dominate.caravan.core.autoCleared
import com.dominate.caravan.core.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RegisterFragment  : BaseFragment()  , TextWatcher {
    var binding: FragmentRegisterBinding by autoCleared()
    private val viewModel: ReqisterViewModel by viewModels()
    var isPasswordValid = false
    var isEmailValid = false
    var isNameValid=false
    var isTelephoneValid=false
    var statusSwitch2=false
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentRegisterBinding.inflate(inflater, container, false)


        return binding.root

    }



    override fun afterTextChanged(s: Editable) {}
    override fun beforeTextChanged(
        s: CharSequence, start: Int, count: Int, after: Int
    ) {
    }

    override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {


    }
}