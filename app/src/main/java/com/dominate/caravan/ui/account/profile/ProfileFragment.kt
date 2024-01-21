package com.dominate.caravan.ui.account.profile

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.graphics.ImageDecoder
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.provider.MediaStore
import android.text.Editable
import android.text.TextWatcher
import android.util.Base64
import android.util.Log
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.bumptech.glide.Glide
import com.caravan.R
import com.caravan.databinding.FragmentEditPasswordBinding
import com.caravan.databinding.FragmentProfileBinding
import com.dominate.caravan.core.autoCleared
import com.dominate.caravan.core.base.BaseFragment
import com.dominate.caravan.ui.owner.OwnerFragment
import com.dominate.caravan.utils.Resource
import com.vdx.designertoast.DesignerToast
import dagger.hilt.android.AndroidEntryPoint
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.MultipartBody
import okhttp3.RequestBody
import okhttp3.RequestBody.Companion.toRequestBody
import java.io.File
import java.io.FileInputStream
import java.io.FileNotFoundException
import java.io.FileOutputStream
import java.io.IOException
import java.io.InputStream
import java.net.URLEncoder
import java.util.UUID

@AndroidEntryPoint
class ProfileFragment  : BaseFragment()  , TextWatcher {

     var binding: FragmentProfileBinding by autoCleared()
    private val viewModel: ProfileViewModel by viewModels()
    var token: String? = ""
    var frontCivilIdImageItem: String = ""
    var base64ImageString: String? = null
    lateinit var bitmapFrontCivilId: Bitmap

    companion object {
        const val SECOUNDIMAGE = 101
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentProfileBinding.inflate(inflater, container, false)
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


    private fun setData(){

        try {
            token = prefs.getCurrentUser().token
        }catch (ec:Exception){}


        binding.tvAccountSettings.setOnClickListener {
            findNavController().navigate(R.id.action_profileFragment_to_accountSettingFragment)

        }

        binding.tvAboutCaravanCompany.setOnClickListener {
            findNavController().navigate(R.id.action_profileFragment_to_aboutCompanyFragment)

        }

        binding.tvMyRealEstateAds.setOnClickListener {
            findNavController().navigate(R.id.action_profileFragment_to_realEstateAdsFragment)

        }
        binding.tvMyCommercials.setOnClickListener {
            findNavController().navigate(R.id.action_profileFragment_to_commercialAdsFragment2)

        }
        binding.tvHousing.setOnClickListener {
            findNavController().navigate(R.id.action_profileFragment_to_housingAdsFragment2)

        }
        binding.tvCommercialEstate.setOnClickListener {
            findNavController().navigate(R.id.action_profileFragment_to_commercialEstateAdsFragment)
        }

        binding.ivUploadImage.setOnClickListener {
            com.github.dhaval2404.imagepicker.ImagePicker.with(this)
                .start(SECOUNDIMAGE)
        }

        binding.btnPostAdNow.setOnClickListener {
            findNavController().navigate(R.id.action_profileFragment_to_addAdsFragment)
        }

        binding.constraintLayout01.setOnClickListener {
            isWhatsAppInstalled("com.caravan")

        }
        binding.tvAdvertisementPackage.setOnClickListener {
            findNavController().navigate(R.id.action_profileFragment_to_featureAdsFragment)

        }
        observeUserProfile()

    }


    private fun isWhatsAppInstalled(packageName: String): Boolean {
        val url =
            "https://api.whatsapp.com/send?phone=0795986039}" + URLEncoder.encode("", "utf-8")
        try {
            val pm: PackageManager = requireActivity().getPackageManager()
            pm.getPackageInfo(packageName, PackageManager.GET_ACTIVITIES)
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        } catch (e: PackageManager.NameNotFoundException) {
            Toast.makeText(
                context,
                getString(R.string.Whatsapp_is_not_installed),
                Toast.LENGTH_SHORT
            ).show()
            e.printStackTrace()
        }
        return true
    }

    private fun observeUserProfile() {
        viewModel.getUserProfile(token!!)
        viewModel.UserProfileResponse.observe(viewLifecycleOwner, androidx.lifecycle.Observer {
            if (it.status == Resource.Status.SUCCESS) {
               it.data!!.let {
                   binding.tvName.text= it.results.name
                   binding.tvPhone.text= it.results.phone_number
                  if (!it.results.image.isNullOrEmpty()){
                      Glide.with(this).load(it.results.image).into(binding.ivProfileImage)

                  }
               }
            }
        })
    }

    @SuppressLint("ResourceAsColor")
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (resultCode == Activity.RESULT_OK) {
            if (requestCode == SECOUNDIMAGE) {
                frontCivilIdImageItem =
                    com.github.dhaval2404.imagepicker.ImagePicker.getFilePath(data)!!
                Glide.with(this).load(data?.data.toString()).into(binding.ivProfileImage)
                base64ImageString = encoder(frontCivilIdImageItem)
                //HIDE CAMERA ICON AND TEXT
                val contentURI = data!!.data
                viewModel.frontCivilIdImagePath = getRealPathFromURI(contentURI!!, requireContext())
                observeUpdateProfile()
//                try {
//                    bitmapFrontCivilId = when {
//                        Build.VERSION.SDK_INT < 28 -> MediaStore.Images.Media.getBitmap(
//                            FacebookSdk.getApplicationContext().contentResolver, contentURI
//                        )
//
//                        else -> {
//                            val source = ImageDecoder.createSource(
//                                FacebookSdk.getApplicationContext().contentResolver, contentURI
//                            )
//                            ImageDecoder.decodeBitmap(source)
//                        }
//                    }
//                } catch (e: Exception) {
//                }
            }
            super.onActivityResult(requestCode, resultCode, data)
        }
    }


    private fun observeUpdateProfile() {
        viewModel.updateProfile(token!!,
            prefs.getCurrentUser().name.toRequestBody(),
            prefs.getCurrentUser().phone_number.toRequestBody(),
            image = uploadImageBack( viewModel.frontCivilIdImagePath, "image"))
        viewModel.updateProfileResponse.observe(viewLifecycleOwner, androidx.lifecycle.Observer {
            if (it.status == Resource.Status.SUCCESS) {

                it.data!!.let {
                    showSuccessToast(it.results.toString())
                }
            }
        })
    }

    fun showSuccessToast(message: String) {
        DesignerToast.Custom(
            requireContext(), message, Gravity.TOP or Gravity.FILL_HORIZONTAL, Toast.LENGTH_SHORT,
            R.drawable.purple_gradient, 16, "#FFFFFF", R.drawable.ic_checkbox_rect, 55, 219
        )
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


    fun encoder(imagePath: String?): String? {
        var base64Image = ""
        val file = File(imagePath)
        try {
            FileInputStream(file).use { imageInFile ->
                // Reading a Image file from file system
                val imageData = ByteArray(file.length().toInt())
                imageInFile.read(imageData)
                base64Image = Base64.encodeToString(imageData, 0)
            }
        } catch (e: FileNotFoundException) {
            println("Image not found$e")
        } catch (ioe: IOException) {
            println("Exception while reading the Image $ioe")
        }
        return base64Image
    }

    fun getRealPathFromURI(uri: Uri, context: Context): String {
        val returnCursor = context.contentResolver.query(uri, null, null, null, null)
        // val nameIndex =  returnCursor!!.getColumnIndex(OpenableColumns.DISPLAY_NAME)
        //  val sizeIndex = returnCursor.getColumnIndex(OpenableColumns.SIZE)
        returnCursor?.moveToFirst()
        //  val name = returnCursor.getString(nameIndex)
        //   val size = returnCursor?.getLong(sizeIndex).toString()
        val file = File(context.filesDir, UUID.randomUUID().toString())
        try {
            val inputStream: InputStream? = context.contentResolver.openInputStream(uri)
            val outputStream = FileOutputStream(file)
            var read = 0
            val maxBufferSize = 1 * 1024 * 1024
            val bytesAvailable: Int = inputStream?.available() ?: 0
            //int bufferSize = 1024;
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

}