package com.dominate.caravan.ui.account.accountsetting

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
import com.caravan.databinding.FragmentEditPasswordBinding
import com.dominate.caravan.core.autoCleared
import com.dominate.caravan.core.base.BaseFragment
import com.dominate.caravan.core.showDeactivateDialog
import com.dominate.caravan.core.showLogoutDialog
import com.dominate.caravan.medule.profile.user.User
import com.dominate.caravan.medule.profile.user.UserResponse
import com.dominate.caravan.utils.Resource
import com.vdx.designertoast.DesignerToast
import dagger.hilt.android.AndroidEntryPoint
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.MultipartBody
import okhttp3.RequestBody.Companion.toRequestBody
import okhttp3.RequestBody
import java.io.File

@AndroidEntryPoint
class AccountSettingFragment : BaseFragment(), TextWatcher {

    var binding: FragmentAccountSettingBinding by autoCleared()
    private val viewModel: AccountSettingViewModel by viewModels()
    var token: String? = ""


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAccountSettingBinding.inflate(inflater, container, false)


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
        }catch (ec:Exception){}

        binding.tvChangePassword.setOnClickListener {
            findNavController().navigate(R.id.action_accountSettingFragment_to_changePasswordFragment)

        }

        binding.ivBack.setOnClickListener {
            findNavController().popBackStack()

        }
        binding.btnViewMyProfile.setOnClickListener {
            findNavController().popBackStack()

        }

        binding.tvLogout.setOnClickListener {
            requireContext().showLogoutDialog(
                onPositiveButtonClick = {
                    clearSharedPreferenceLogout()
                    findNavController().navigate(R.id.action_accountSettingFragment_to_homeFragment)
                    it.dismiss()
                }, onNegativeButtonClick = {
                    it.dismiss()
                })
        }

        binding.tvDeleteAccount.setOnClickListener {
            requireContext().showDeactivateDialog(
                onPositiveButtonClick = {
                    clearSharedPreferenceLogout()
                    findNavController().navigate(R.id.action_accountSettingFragment_to_homeFragment)
                    it.dismiss()
                }, onNegativeButtonClick = {
                    it.dismiss()
                })
        }

        binding.btnNext.setOnClickListener {
            if (binding.etName.text.toString().isNotEmpty() &&
                binding.etPhoneNumber.text.toString().isNotEmpty() &&
                binding.etWhatsapp.text.toString().isNotEmpty() &&
                binding.etIntroductionOptional.text.toString().isNotEmpty()) {
                observeUpdateProfile()
            } else {
                showErrorToast(resources.getString(R.string.fill_fields))
            }
        }

        observeUserProfile()
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

    private fun clearSharedPreferenceLogout(){
        prefs.isLoggedIn = false
        prefs.saveAuthToken("")
        prefs.saveCurrentUser(
            User(
                "",
                "",
                "",
                "",
                ""
            )
        )
    }

    private fun observeUserProfile() {
        viewModel.getUserProfile(token!!)
        viewModel.UserProfileResponse.observe(viewLifecycleOwner, androidx.lifecycle.Observer {
            if (it.status == Resource.Status.SUCCESS) {
                it.data!!.let {
                    binding.etName.setText(it.results.name)
                    binding.etPhoneNumber.setText(it.results.phone_number)
                    binding.etWhatsapp.setText(it.results.whatsapp_number)
                    binding.etIntroductionOptional.setText(it.results.about)
                }
            }
        })
    }


    private fun observeUpdateProfile() {
        viewModel.updateProfile(token!!,
            binding.etName.text.toString().toRequestBody(),
            binding.etPhoneNumber.text.toString().toRequestBody(),
            binding.etWhatsapp.text.toString().toRequestBody(),
            binding.etIntroductionOptional.text.toString().toRequestBody(),
            image = uploadImageBack("", "image"))
        viewModel.updateProfileResponse.observe(viewLifecycleOwner, androidx.lifecycle.Observer {
            if (it.status == Resource.Status.SUCCESS) {

                it.data!!.let {
                    showSuccessToast(it.results.toString())
                }
            }
        })
    }


    fun uploadImageBack(filePath: String, name:String): MultipartBody.Part? {
        if (filePath.isNotEmpty()) {
            val file = File(filePath)
            val requestFile =
                RequestBody.create("application/octet-stream".toMediaTypeOrNull(), file)
            val filePart = MultipartBody.Part.createFormData(
                name,
                "/C:/Users/Owner/Desktop/${file.name}.png",
                requestFile
            )
            return filePart
        } else {
            return null
        }
    }


}