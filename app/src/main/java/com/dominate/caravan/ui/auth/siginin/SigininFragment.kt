package com.dominate.caravan.ui.auth.siginin

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.dominate.caravan.core.autoCleared
import com.dominate.caravan.core.base.BaseFragment
import com.caravan.databinding.FragmentSigininBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SigininFragment :BaseFragment() , TextWatcher {
     var binding: FragmentSigininBinding by autoCleared()
    private val viewModel: SiginInViewModel by viewModels()
    var isPasswordValid = false
    var isEmailValid = false
    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {
        binding = FragmentSigininBinding.inflate(inflater, container, false)


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