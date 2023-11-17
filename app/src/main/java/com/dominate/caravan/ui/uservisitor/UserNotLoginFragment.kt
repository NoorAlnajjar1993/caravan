package com.dominate.caravan.ui.uservisitor

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dominate.caravan.core.base.BaseFragment
import com.caravan.databinding.FragmentUserNotLoginBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class UserNotLoginFragment : BaseFragment() {
    lateinit var binding: FragmentUserNotLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentUserNotLoginBinding.inflate(inflater, container, false)

        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        }


    }






