package com.dominate.caravan.ui.auth.register

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.caravan.R
import com.caravan.databinding.FragmentRegisterBinding
import com.dominate.caravan.core.autoCleared
import com.dominate.caravan.core.base.BaseFragment
import com.dominate.caravan.utils.Prefs
import com.dominate.caravan.utils.Resource
import com.vdx.designertoast.DesignerToast
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RegisterFragment : BaseFragment(), TextWatcher {
    var binding: FragmentRegisterBinding by autoCleared()
    private val viewModel: ReqisterViewModel by viewModels()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentRegisterBinding.inflate(inflater, container, false)
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

    private fun setData() {

        binding.tvSignin.setOnClickListener {
            findNavController().navigate(R.id.action_registerFragment_to_sigininFragment2)

        }

        binding.btnSubscribe.setOnClickListener {
            validation()
        }

        binding.ivClose.setOnClickListener {
            findNavController().popBackStack()

        }
    }

    private fun validation() {
        if (binding.etUsername.text.toString().isNotEmpty() &&
            binding.etPhoneNumber.text.toString().isNotEmpty() &&
            binding.etPassword.text.toString().isNotEmpty()
        ) {
            observeRegister()
        } else {
            showErrorToast(resources.getString(R.string.fill_fields))
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

    fun observeRegister() {
        viewModel.registerUser(
            binding.etUsername.text.toString(),
            binding.etPhoneNumber.text.toString(),
            binding.etPassword.text.toString()
        )
        viewModel.register.observe(viewLifecycleOwner, Observer {
            if (it != null) {
                if (it.status == Resource.Status.SUCCESS) {
                    if (it.data?.status?.code == 200) {
                        it.data!!.let {
                            prefs.isLoggedIn = true
                            prefs.saveCurrentUser(it.results)
                            findNavController().navigate(R.id.action_registerFragment_to_homeFragment2)
                            showSuccessToast(resources.getString(R.string.login_successfully))

                        }
                    } else {
                        Toast.makeText(
                            context,
                            it.data?.status?.message.toString(),
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                }
            }
            if (it != null) {
                if (it.status == Resource.Status.ERROR) {
                    Toast.makeText(
                        context,
                        it.message.toString(),
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
            viewModel.reset()
        })
    }


}