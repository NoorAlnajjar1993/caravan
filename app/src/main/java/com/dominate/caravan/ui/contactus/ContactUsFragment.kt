package com.dominate.caravan.ui.contactus

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.caravan.databinding.FragmentContactUsBinding
import com.dominate.caravan.core.autoCleared
import com.dominate.caravan.core.base.BaseFragment
import com.dominate.caravan.ui.home.HomeActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ContactUsFragment : BaseFragment() ,TextWatcher {

     var binding: FragmentContactUsBinding by  autoCleared()
    private val viewModel: CountactUsViewModel by viewModels()
    var isEmailValid = false
    var isMassageValid = false
    var isNameValid=false
    var isTelephoneValid=false
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentContactUsBinding.inflate(inflater, container, false)

        (activity as HomeActivity).binding.navView.visibility=View.GONE


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