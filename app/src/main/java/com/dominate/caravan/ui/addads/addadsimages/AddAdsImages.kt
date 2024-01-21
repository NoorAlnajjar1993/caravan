package com.dominate.caravan.ui.addads.addadsimages

import android.app.Activity
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
import com.caravan.R
import com.caravan.databinding.FragmentAddAdsImagesBinding
import com.dominate.caravan.core.autoCleared
import com.dominate.caravan.core.base.BaseFragment
import com.dominate.caravan.core.showEnterAllFieldsDialog
import com.dominate.caravan.medule.addads.AddCommercialAdsModel
import com.dominate.caravan.medule.addads.AddCommercialEStateAdsModel
import com.dominate.caravan.medule.addads.AddHousingAdsModel
import com.dominate.caravan.medule.addads.AddRealStateAdsModel
import com.dominate.caravan.medule.home.Media
import com.dominate.caravan.ui.addads.AddAdsViewModel
import com.dominate.caravan.ui.addads.addadsimages.adapter.MediaAdapter
import com.github.dhaval2404.imagepicker.ImagePicker
import com.vdx.designertoast.DesignerToast
import dagger.hilt.android.AndroidEntryPoint
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File
import java.io.FileOutputStream
import java.io.InputStream
import java.util.UUID

@AndroidEntryPoint
class AddAdsImages : BaseFragment(), TextWatcher {

    var binding: FragmentAddAdsImagesBinding by autoCleared()
    private val viewModel: AddAdsViewModel by viewModels()
    var mediasList: ArrayList<Media> = ArrayList()
    lateinit var mediaAdapter: MediaAdapter

    var property_ownership = "1"
    var installment_payment = true

    companion object {
        var type = ""
        lateinit var realStateAdsModel: AddRealStateAdsModel
        lateinit var AddCommercialEStateAdsModel: AddCommercialEStateAdsModel
        lateinit var AddHousingAdsModel : AddHousingAdsModel
        lateinit var AddCommercialAdsModel : AddCommercialAdsModel
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAddAdsImagesBinding.inflate(inflater, container, false)

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

        requireContext().showEnterAllFieldsDialog(
            onPositiveButtonClick = {
                it.dismiss()
            })

        binding.ivBack.setOnClickListener {
            findNavController().popBackStack()

        }

        binding.ivUploadImage.setOnClickListener {
            if (mediasList.size >= 20) {
                showErrorToast("Can upload 20 image only")
            } else {
                ImagePicker.with(this)
                    .start(1001)
            }

        }

        binding.radioOwner.setOnCheckedChangeListener { buttonView, isChecked ->
            property_ownership = if (isChecked) {
                "1"
            } else {
                "2"
            }
        }
        binding.radioNotOwner.setOnCheckedChangeListener { buttonView, isChecked ->
            property_ownership = if (isChecked) {
                "2"
            } else {
                "1"
            }
        }
        binding.radioYes.setOnCheckedChangeListener { buttonView, isChecked ->
            installment_payment = isChecked
        }
        binding.radioNo.setOnCheckedChangeListener { buttonView, isChecked ->
            installment_payment = !isChecked
        }


        binding.btnNext.setOnClickListener {
            if (type == "real_estate") {
                realStateAdsModel.title = binding.etAdTitle.text.toString()
                realStateAdsModel.description = binding.etAdDescription.text.toString()
                realStateAdsModel.property_ownership = property_ownership
                realStateAdsModel.installment_payment = installment_payment
                realStateAdsModel.price = binding.etPrice.text.toString()
                realStateAdsModel.region = binding.etRegion.text.toString()
                realStateAdsModel.region = binding.etRegion.text.toString()
                realStateAdsModel.phone_number = binding.etPhoneNumber.text.toString()
                realStateAdsModel.media = medias(mediasList)
            } else   if (type == "commercial_estate") {
                AddCommercialEStateAdsModel.title = binding.etAdTitle.text.toString()
                AddCommercialEStateAdsModel.description = binding.etAdDescription.text.toString()
                AddCommercialEStateAdsModel.property_ownership = property_ownership
                AddCommercialEStateAdsModel.installment_payment = installment_payment
                AddCommercialEStateAdsModel.price = binding.etPrice.text.toString()
                AddCommercialEStateAdsModel.region = binding.etRegion.text.toString()
                AddCommercialEStateAdsModel.region = binding.etRegion.text.toString()
                AddCommercialEStateAdsModel.phone_number = binding.etPhoneNumber.text.toString()
                AddCommercialEStateAdsModel.media = medias(mediasList)
            } else   if (type == "housing") {
                AddHousingAdsModel.title = binding.etAdTitle.text.toString()
                AddHousingAdsModel.description = binding.etAdDescription.text.toString()
                AddHousingAdsModel.property_ownership = property_ownership
                AddHousingAdsModel.installment_payment = installment_payment
                AddHousingAdsModel.price = binding.etPrice.text.toString()
                AddHousingAdsModel.region = binding.etRegion.text.toString()
                AddHousingAdsModel.region = binding.etRegion.text.toString()
                AddHousingAdsModel.phone_number = binding.etPhoneNumber.text.toString()
                AddHousingAdsModel.media = medias(mediasList)
            } else   if (type == "commercial") {
                AddCommercialAdsModel.title = binding.etAdTitle.text.toString()
                AddCommercialAdsModel.description = binding.etAdDescription.text.toString()
                AddCommercialAdsModel.property_ownership = property_ownership
                AddCommercialAdsModel.installment_payment = installment_payment
                AddCommercialAdsModel.price = binding.etPrice.text.toString()
                AddCommercialAdsModel.region = binding.etRegion.text.toString()
                AddCommercialAdsModel.region = binding.etRegion.text.toString()
                AddCommercialAdsModel.phone_number = binding.etPhoneNumber.text.toString()
                AddCommercialAdsModel.media = medias(mediasList)
            }

            findNavController().navigate(R.id.action_addAdsImages_to_mapsFragment)

        }
    }

    private fun medias(mediasList: ArrayList<Media>?): ArrayList<MultipartBody.Part>? {
        return if (mediasList.isNullOrEmpty()) {
            null
        } else {
            val mediasPart = ArrayList<MultipartBody.Part>()
            mediasPart.clear()
            for ((index, mediaModel) in mediasList.withIndex()) {
                val imagePart = uploadImageMedia(mediaModel.path ?: mediaModel.image, index)
                if (imagePart != null) {
                    mediasPart.add(imagePart)
                }
            }
            mediasPart
        }
    }

    fun uploadImageMedia(path: String, index: Int): MultipartBody.Part? {
        return if (path.isNotEmpty() && File(path).exists()) {
            val file = File(path)
            val requestFile = RequestBody.create("application/octet-stream".toMediaTypeOrNull(), file)
            MultipartBody.Part.createFormData("media", "${file.name}.jpeg", requestFile)
        } else { null }
    }

    fun showErrorToast(message: String) {
        DesignerToast.Custom(
            requireContext(), message, Gravity.TOP or Gravity.FILL_HORIZONTAL, Toast.LENGTH_SHORT,
            R.drawable.purple_gradient, 16, "#FFFFFF", R.drawable.ic_close_purple, 55, 219
        )
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


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when (resultCode) {
            Activity.RESULT_OK -> {
                if (requestCode == 1001) {
                    val contentURI = data!!.data
                    var imagePath = getRealPathFromURI(contentURI!!, requireContext())
                    mediasList.add(
                        Media(
                            image = contentURI.toString(),
                            path = imagePath
                        )
                    )
                    mediaAdapter = MediaAdapter(mediasList) {
                        mediasList.remove(it)
                    }
                    mediaAdapter.notifyDataSetChanged()
                    binding.rvMedia.adapter = mediaAdapter
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

