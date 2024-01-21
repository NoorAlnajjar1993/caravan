package com.dominate.caravan.ui.packages.transferdata

import android.app.Activity
import android.content.ClipboardManager
import android.content.Context
import android.content.Intent
import android.net.Uri
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
import com.bumptech.glide.Glide
import com.caravan.R
import com.caravan.databinding.FragmentAddCommercialEstateBinding
import com.caravan.databinding.FragmentBuyBinding
import com.caravan.databinding.FragmentFeatureAdsBinding
import com.caravan.databinding.FragmentPackagesBinding
import com.caravan.databinding.FragmentTransferDataBinding
import com.dominate.caravan.core.autoCleared
import com.dominate.caravan.core.base.BaseFragment
import com.dominate.caravan.medule.home.Media
import com.dominate.caravan.ui.addads.AddAdsViewModel
import com.dominate.caravan.ui.addads.addadsimages.adapter.MediaAdapter
import com.dominate.caravan.ui.addads.addcommercialestate.adapter.AddCommercialEstateAdapter
import com.dominate.caravan.ui.addads.addestateads.AddCategoryModel
import com.github.dhaval2404.imagepicker.ImagePicker
import com.vdx.designertoast.DesignerToast
import dagger.hilt.android.AndroidEntryPoint
import java.io.File
import java.io.FileOutputStream
import java.io.InputStream
import java.util.UUID

@AndroidEntryPoint
class TransferDataFragment : BaseFragment(), TextWatcher {

    var binding: FragmentTransferDataBinding by autoCleared()
    var type = 0

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTransferDataBinding.inflate(inflater, container, false)

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

    override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {}

    private fun setData() {

        binding.ivBack.setOnClickListener {
            findNavController().popBackStack()
        }


        binding.tvMobileCopy.setOnClickListener {
            val cm: ClipboardManager = requireContext().getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
            cm.text = binding.etMobile.text.toString()
            Toast.makeText(context, "نسخ", Toast.LENGTH_SHORT).show()
        }

        binding.tvBankAccountCopy.setOnClickListener {
            val cm: ClipboardManager = requireContext().getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
            cm.text = binding.etBankAccount.text.toString()
            Toast.makeText(context, "نسخ", Toast.LENGTH_SHORT).show()
        }

        binding.tvIbanCopy.setOnClickListener {
            val cm: ClipboardManager = requireContext().getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
            cm.text = binding.etIban.text.toString()
            Toast.makeText(context, "نسخ", Toast.LENGTH_SHORT).show()
        }

        binding.btnSend.setOnClickListener {
          findNavController().navigate(R.id.action_transferDataFragment_to_completeFeatureFragment)
        }

        binding.ivUploadImage.setOnClickListener {
            ImagePicker.with(this)
                .start(1001)
        }


        fun showErrorToast(message: String) {
            DesignerToast.Custom(
                requireContext(),
                message,
                Gravity.TOP or Gravity.FILL_HORIZONTAL,
                Toast.LENGTH_SHORT,
                R.drawable.purple_gradient,
                16,
                "#FFFFFF",
                R.drawable.ic_close_purple,
                55,
                219
            )
        }
    }

    fun getRealPathFromURI(uri: Uri, context: Context): String {
        val returnCursor = context.contentResolver.query(uri, null, null, null, null)
        returnCursor?.moveToFirst()
        val file = File(context.filesDir, UUID.randomUUID().toString())
        try {
            val inputStream: InputStream? = context.contentResolver.openInputStream(uri)
            val outputStream = FileOutputStream(file)
            var read = 0
            val maxBufferSize = 1 * 1024 * 1024
            val bytesAvailable: Int = inputStream?.available() ?: 0
            val bufferSize = Math.min(bytesAvailable, maxBufferSize)
            val buffers = ByteArray(bufferSize)
            while (inputStream?.read(buffers).also {
                    if (it != null) {
                        read = it
                    }
                } != -1) {
                outputStream.write(buffers, 0, read)
            }
            inputStream?.close()
            outputStream.close()
        } catch (e: java.lang.Exception) {
        }
        return file.path
    }


    fun showErrorToast(message: String) {
        DesignerToast.Custom(
            requireContext(), message, Gravity.TOP or Gravity.FILL_HORIZONTAL, Toast.LENGTH_SHORT,
            R.drawable.purple_gradient, 16, "#FFFFFF", R.drawable.ic_close_purple, 55, 219
        )
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when (resultCode) {
            Activity.RESULT_OK -> {
                if (requestCode == 1001) {
                    val contentURI = data!!.data
                    var imagePath = getRealPathFromURI(contentURI!!, requireContext())
                    Glide.with(this).load(data.data.toString()).into(binding.ivUploadImage)
                }
            }

            ImagePicker.RESULT_ERROR -> {
                showErrorToast("failed_pick_gallery_image")
            }

            else -> {
                showErrorToast("task_cancelled")
            }
        }
    }

}