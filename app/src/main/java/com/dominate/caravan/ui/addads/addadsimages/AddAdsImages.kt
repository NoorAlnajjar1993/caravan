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
import com.dominate.caravan.medule.home.Media
import com.dominate.caravan.ui.addads.AddAdsViewModel
import com.dominate.caravan.ui.addads.addadsimages.adapter.MediaAdapter
import com.github.dhaval2404.imagepicker.ImagePicker
import com.vdx.designertoast.DesignerToast
import dagger.hilt.android.AndroidEntryPoint
import java.io.File
import java.io.FileOutputStream
import java.io.InputStream
import java.util.UUID

@AndroidEntryPoint
class AddAdsImages : BaseFragment(), TextWatcher {

    var binding: FragmentAddAdsImagesBinding by autoCleared()
    private val viewModel: AddAdsViewModel by viewModels()
    var mediasList :ArrayList<Media> = ArrayList()
    lateinit var mediaAdapter: MediaAdapter



    companion object {
        var estateType = 0
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
        binding.btnNext.setOnClickListener {
            findNavController().navigate(R.id.action_addAdsImages_to_mapsFragment)

        }
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
                    mediasList.add(Media(
                        image = contentURI.toString()))
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

