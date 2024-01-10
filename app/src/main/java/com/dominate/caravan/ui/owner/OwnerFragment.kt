package com.dominate.caravan.ui.owner

import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.net.toUri
import androidx.databinding.BindingAdapter
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.caravan.R
import com.caravan.databinding.BottomSheetBlockReportBinding
import com.caravan.databinding.BottomSheetReportBinding
import com.caravan.databinding.FragmentOwnerBinding
import com.dominate.caravan.core.autoCleared
import com.dominate.caravan.core.base.BaseFragment
import com.dominate.caravan.core.showBlockDialog
import com.dominate.caravan.core.showLoginDialog
import com.dominate.caravan.medule.home.CommercialAd
import com.dominate.caravan.medule.home.CommercialEstate
import com.dominate.caravan.medule.home.HousingAd
import com.dominate.caravan.medule.home.RealEstateAd
import com.google.android.material.bottomsheet.BottomSheetBehavior
import dagger.hilt.android.AndroidEntryPoint
import java.net.URLEncoder

@AndroidEntryPoint
class OwnerFragment  : BaseFragment()  , TextWatcher {

     var binding: FragmentOwnerBinding by autoCleared()
    private val viewModel: OwnerViewModel by viewModels()
    private lateinit var bottomSheetBlockReportBinding: BottomSheetBlockReportBinding
    var sheet_open = false
    private lateinit var bottomSheetBehavior: BottomSheetBehavior<ConstraintLayout>
    private lateinit var bottomSheetReportBinding: BottomSheetReportBinding
    var sheet_open_report = false
    private lateinit var bottomSheetReportBehavior: BottomSheetBehavior<ConstraintLayout>

    companion object {
        var title : String = ""
        var phone : String = ""
        var whatsapp : String = ""
        var email : String = ""
        var image : String = ""

    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentOwnerBinding.inflate(inflater, container, false)


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

        bottomSheetBlockReportBinding = binding.includeBlockReportSheet
        bottomSheetBehavior =
            BottomSheetBehavior.from(bottomSheetBlockReportBinding.constraintLayout01)
        bottomSheetBehavior.state = BottomSheetBehavior.STATE_COLLAPSED
        bottomSheetBehavior.isDraggable = true
        bottomSheetBehavior.isHideable = true
        bottomSheetBehavior.peekHeight = 600

        bottomSheetBehavior.setBottomSheetCallback(object : BottomSheetBehavior.BottomSheetCallback() {
            override fun onStateChanged(bottomSheet: View, newState: Int) {
                if (newState == BottomSheetBehavior.STATE_HIDDEN) {

                }
            }

            override fun onSlide(bottomSheet: View, slideOffset: Float) {
                if (bottomSheetBehavior.peekHeight == 0){

                }
            }
        })

        bottomSheetReportBinding = binding.includeReportSheet
        bottomSheetReportBehavior =
            BottomSheetBehavior.from(bottomSheetReportBinding.constraintLayout01)
        bottomSheetReportBehavior.state = BottomSheetBehavior.STATE_COLLAPSED
        bottomSheetReportBehavior.isDraggable = true
        bottomSheetReportBehavior.isHideable = true
        bottomSheetReportBehavior.peekHeight = 1600

        bottomSheetReportBehavior.setBottomSheetCallback(object : BottomSheetBehavior.BottomSheetCallback() {
            override fun onStateChanged(bottomSheet: View, newState: Int) {
                if (newState == BottomSheetBehavior.STATE_HIDDEN) {

                }
            }

            override fun onSlide(bottomSheet: View, slideOffset: Float) {
                if (bottomSheetReportBehavior.peekHeight == 0){

                }
            }
        })

        bottomSheetBlockReportBinding.tvReport.setOnClickListener {
            closeBlockReportBottom()
            openReportBottom()
        }

        bottomSheetBlockReportBinding.tvBlock.setOnClickListener {
            requireContext().showBlockDialog(
                onPositiveButtonClick = {
                    closeReportBottom()
                    closeBlockReportBottom()
                    it.dismiss()
                }, isCancelable = true, text = title)
        }

        bottomSheetReportBinding.btnReport.setOnClickListener {
            closeReportBottom()
            closeBlockReportBottom()
        }

        val fade_in: Animation = AnimationUtils.loadAnimation(
            requireContext(),
            R.anim.fade_in)
        binding.constraintLayout01.startAnimation(fade_in)

        binding.textView02.text = title
        binding.tvName.text = title
        binding.tvPhone.text = phone
        binding.tvWhatsApp.text = whatsapp
        binding.tvEmail.text = email
        binding.tvAdsName.text = "إعلانات $title"

        binding.imageView02.setOnClickListener {
            findNavController().popBackStack()

        }

        binding.imageView01.setOnClickListener {
            openBlockReportBottom()
        }

        binding.tvPhone.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:$phone")
            startActivity(intent)
        }

        binding.tvWhatsApp.setOnClickListener {
            isWhatsAppInstalled("com.caravan")
        }
        binding.tvEmail.setOnClickListener {
            //get input from EditTexts and save in variables
            val recipient = email.trim()
            val subject = ""
            val message = ""

            //method call for email intent with these inputs as parameters
            sendEmail(recipient, subject, message)
        }

        setImageUrl(binding.ivProfileImage, image)
    }

    private fun sendEmail(recipient: String, subject: String, message: String) {
        /*ACTION_SEND action to launch an email client installed on your Android device.*/
        val mIntent = Intent(Intent.ACTION_SEND)
        /*To send an email you need to specify mailto: as URI using setData() method
        and data type will be to text/plain using setType() method*/
        mIntent.data = Uri.parse("mailto:")
        mIntent.type = "text/plain"
        // put recipient email in intent
        /* recipient is put as array because you may wanna send email to multiple emails
           so enter comma(,) separated emails, it will be stored in array*/
        mIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf(recipient))
        //put the Subject in the intent
        mIntent.putExtra(Intent.EXTRA_SUBJECT, subject)
        //put the message in the intent
        mIntent.putExtra(Intent.EXTRA_TEXT, message)


        try {
            //start email intent
            startActivity(Intent.createChooser(mIntent, "Choose Email Client..."))
        }
        catch (e: Exception){
            //if any thing goes wrong for example no email client application or any exception
            //get and show exception message
            Toast.makeText(requireContext(), e.message, Toast.LENGTH_LONG).show()
        }

    }

    private fun isWhatsAppInstalled(packageName: String): Boolean {
        val url =
            "https://api.whatsapp.com/send?phone=$whatsapp" + URLEncoder.encode("", "utf-8")
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

    @BindingAdapter("imageUrl")
    fun setImageUrl(imgView: ImageView, imgUrl: String?) {
        imgUrl?.let {
            val imgUri = it.toUri().buildUpon().scheme("http").build()
            Glide.with(imgView.context)
                .load(imgUri)
                .into(imgView)

        }
    }

    private fun openBlockReportBottom(){
        sheet_open = false
        bottomSheetBlockReportBinding.constraintLayout01.visibility = View.VISIBLE
    }


    private fun closeBlockReportBottom(){
        sheet_open = false
        bottomSheetBlockReportBinding.constraintLayout01.visibility = View.GONE
    }

    private fun openReportBottom(){
        sheet_open = false
        bottomSheetReportBinding.constraintLayout01.visibility = View.VISIBLE
    }


    private fun closeReportBottom(){
        sheet_open = false
        bottomSheetReportBinding.constraintLayout01.visibility = View.GONE
    }


}