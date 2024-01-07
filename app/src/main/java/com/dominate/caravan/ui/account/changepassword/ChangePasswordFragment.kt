package com.dominate.caravan.ui.account.changepassword

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.caravan.R
import com.caravan.databinding.FragmentAccountSettingBinding
import com.caravan.databinding.FragmentChangePasswordBinding
import com.caravan.databinding.FragmentEditPasswordBinding
import com.dominate.caravan.core.autoCleared
import com.dominate.caravan.core.base.BaseFragment
import com.dominate.caravan.utils.Resource
import com.vdx.designertoast.DesignerToast
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ChangePasswordFragment : BaseFragment(), TextWatcher {

    var binding: FragmentChangePasswordBinding by autoCleared()
    private val viewModel: ChangePasswordViewModel by viewModels()
    var token: String? = ""


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentChangePasswordBinding.inflate(inflater, container, false)


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


    private fun setData() {
        try {
            token = prefs.getCurrentUser().token
        } catch (ec: java.lang.Exception) {}


        binding.btnSave.setOnClickListener {
            if (binding.etOldPassword.text.toString().isNotEmpty() &&
                binding.etNewPassword.text.toString().isNotEmpty() &&
                binding.etConfirmPassword.text.toString().isNotEmpty()
            ) {
                if (binding.etNewPassword.text.toString() == binding.etConfirmPassword.text.toString()) {
                    observeChangePassword()
                } else {
                    showErrorToast(resources.getString(R.string.password_should_be_match))
                }

            } else {
                showErrorToast(resources.getString(R.string.fill_fields))
            }

        }

        binding.ivBack.setOnClickListener {
            findNavController().popBackStack()

        }
    }


    private fun observeChangePassword() {
        viewModel.resetPassword(
            token!!,
            binding.etOldPassword.text.toString(),
            binding.etNewPassword.text.toString()
        )
        viewModel.updatepass.observe(
            viewLifecycleOwner, androidx.lifecycle.Observer {
                if (it != null) {
                    if (it.status == Resource.Status.SUCCESS) {
                        if (it.data?.status?.code == 200) {
                            findNavController().popBackStack()
                            showSuccessToast(getString(R.string.updated_successfully))
                        } else {
                            showErrorToast( it.data?.status?.message.toString())
                        }
                    }
                }
                if (it != null) {
                    if (it.status == Resource.Status.ERROR) {
                        showErrorToast(getString(R.string.invalid_old_password_please_try_again))
                    }
                }
                viewModel.reset()
            })
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
}