package com.dominate.caravan.ui.auth.siginin

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.caravan.R
import com.caravan.databinding.FragmentSigininBinding
import com.dominate.caravan.core.autoCleared
import com.dominate.caravan.core.base.BaseFragment
import com.dominate.caravan.utils.Resource
import com.vdx.designertoast.DesignerToast
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SigininFragment :BaseFragment() , TextWatcher {
     var binding: FragmentSigininBinding by autoCleared()
    private val viewModel: SiginInViewModel by viewModels()

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {
        binding = FragmentSigininBinding.inflate(inflater, container, false)


        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setData()
    }



    override fun afterTextChanged(s: Editable) {}
    override fun beforeTextChanged(
        s: CharSequence, start: Int, count: Int, after: Int
    ) {
    }

    override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {


    }

    private fun setData(){

        binding.tvSubscribe.setOnClickListener {
            findNavController().navigate(R.id.action_sigininFragment_to_registerFragment)

        }

        binding.btnSignin.setOnClickListener {
            if (binding.etPhonenumberUsername.text.toString().isNotEmpty() &&
                binding.etPassword.text.toString().isNotEmpty()) {
                observeSignin()
            } else {
                showErrorToast(resources.getString(R.string.fill_fields))
            }

        }

        binding.tvDidForgetPassword.setOnClickListener {
            findNavController().navigate(R.id.action_sigininFragment_to_forgotPasswordFragment)

        }
        binding.ivClose.setOnClickListener {
            findNavController().popBackStack()

        }
    }

    fun showErrorToast(message: String) {
        DesignerToast.Custom(
            requireContext(), message, Gravity.TOP or Gravity.FILL_HORIZONTAL, Toast.LENGTH_SHORT,
            R.drawable.purple_gradient, 16, "#FFFFFF", R.drawable.ic_close_purple, 55, 219
        )
    }


    fun showSuccessToast(message: String) {
        DesignerToast.Custom(
            requireContext(), message, Gravity.TOP or Gravity.FILL_HORIZONTAL, Toast.LENGTH_SHORT,
            R.drawable.purple_gradient, 16, "#FFFFFF", R.drawable.ic_checkbox_rect, 55, 219
        )
    }

    fun observeSignin() {
        viewModel.signinUser(binding.etPhonenumberUsername.text.toString(),
            binding.etPassword.text.toString())
        viewModel.signinRespons.observe(viewLifecycleOwner, Observer { it ->
            if (it != null) {
                if (it.status == Resource.Status.SUCCESS) {
                    if (it.data?.status?.code == 200) {
                        it.data!!.let {
                            prefs.isLoggedIn = true
                            prefs.saveCurrentUser(it.results)
                            findNavController().navigate(R.id.action_sigininFragment_to_homeFragment)
                            showSuccessToast(resources.getString(R.string.login_successfully))

                        }
                    } else {
                        showErrorToast(resources.getString(R.string.error_phone_number_password))
                    }
                }
            }
            if (it != null) {
                if (it.status == Resource.Status.ERROR) {
                    showErrorToast(resources.getString(R.string.error_phone_number_password))

                }
            }
            viewModel.reset()
        })
    }


}