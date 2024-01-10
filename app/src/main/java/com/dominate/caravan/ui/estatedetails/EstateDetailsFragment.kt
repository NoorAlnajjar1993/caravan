package com.dominate.caravan.ui.estatedetails

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
import androidx.core.net.toUri
import androidx.databinding.BindingAdapter
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.caravan.R
import com.caravan.databinding.FragmentEstateDetailsBinding
import com.dominate.caravan.core.autoCleared
import com.dominate.caravan.core.base.BaseFragment
import com.dominate.caravan.core.showLoginDialog
import com.dominate.caravan.medule.home.CommercialAd
import com.dominate.caravan.medule.home.CommercialEstate
import com.dominate.caravan.medule.home.HousingAd
import com.dominate.caravan.medule.home.RealEstateAd
import com.dominate.caravan.ui.estatedetails.adapter.ImagesAdapter
import com.dominate.caravan.ui.favourite.adapter.FavouritesAdapter
import com.dominate.caravan.ui.home.HomeViewModel
import com.dominate.caravan.ui.owner.OwnerFragment
import com.dominate.caravan.utils.Resource
import com.squareup.picasso.Picasso
import dagger.hilt.android.AndroidEntryPoint
import java.net.URLEncoder

@AndroidEntryPoint
class EstateDetailsFragment : BaseFragment(), TextWatcher {

    var binding: FragmentEstateDetailsBinding by autoCleared()
    private val viewModel: EstateDetailsViewModel by viewModels()
    private val homeViewModel: HomeViewModel by viewModels()
    var token: String? = ""
    lateinit var imagesAdapter: ImagesAdapter
    var whatsAppNumber = ""
    var phoneNumber = ""
    var title = ""
    var user_name = ""
    var user_phone = ""
    var user_whatsapp = ""
    var user_email = ""
    var user_image = ""
    var is_favorite = false

    lateinit var favouritesAdapter: FavouritesAdapter

    companion object {
        lateinit var realEstate: RealEstateAd
        lateinit var housing: HousingAd
        lateinit var commertcial_estate: CommercialEstate
        lateinit var commertcial: CommercialAd
        var type = ""
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentEstateDetailsBinding.inflate(inflater, container, false)


        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setRecycleView()
        setData()

    }

    private fun setRecycleView() {


    }


    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

    }

    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {


    }

    override fun afterTextChanged(s: Editable?) {


    }


    private fun setData() {

        binding.imageView01.setOnClickListener {
            findNavController().popBackStack()

        }

        val fade_in: Animation = AnimationUtils.loadAnimation(
            requireContext(),
            R.anim.fade_in
        )
        binding.constraintLayout01.startAnimation(fade_in)

        try {
            token = prefs.getCurrentUser().token
        } catch (ec: java.lang.Exception) {
        }

        binding.fab2.setOnClickListener {
            isWhatsAppInstalled("com.caravan")
        }
        binding.fab.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:$phoneNumber")
            startActivity(intent)
        }
        binding.ivShare.setOnClickListener {
            val sendIntent: Intent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, title)
                type = "text/plain"
            }

            val shareIntent = Intent.createChooser(sendIntent, null)
            startActivity(shareIntent)
        }
        binding.tvShare.setOnClickListener {
            val sendIntent: Intent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, title)
                type = "text/plain"
            }

            val shareIntent = Intent.createChooser(sendIntent, null)
            startActivity(shareIntent)
        }
        binding.constraintLayout03.setOnClickListener {
            OwnerFragment.title = user_name
            OwnerFragment.phone = user_phone
            OwnerFragment.whatsapp = user_whatsapp
            OwnerFragment.email = user_email
            OwnerFragment.image = user_image

            findNavController().navigate(R.id.action_estateDetailsFragment_to_ownerFragment)
        }
        if (is_favorite) {
            binding.ivFavourites.setImageResource(R.drawable.ic_favourite)
        } else {
            binding.ivFavourites.setImageResource(R.drawable.ic_favourites_gray)
        }
        binding.ivFavourites.setOnClickListener {
            if (prefs.isLoggedIn && !token.isNullOrEmpty()) {
                if (is_favorite) {
                    is_favorite = false
                    binding.ivFavourites.setImageResource(R.drawable.ic_favourites_gray)
                } else {
                    is_favorite = true
                    binding.ivFavourites.setImageResource(R.drawable.ic_favourite)
                }

                AddRemoveFavorite(id = it.id, is_favorite)
            } else {
                // IF USER NOT LOGIN SHOW DIALOG
                requireContext().showLoginDialog(
                    onPositiveButtonClick = {
                        findNavController().navigate(R.id.action_estateDetailsFragment_to_sigininFragment)
                        it.dismiss()
                    }, onNegativeButtonClick = {
                        it.dismiss()
                    })
            }
        }
        if (type == "real_estate") {
            visible()
            realEstateSetData(realEstate)
        } else if (type == "housing") {
            visible()
            housingSetData(housing)
        } else if (type == "commertcial_estate") {
            unVisible()
            commertcialEstateSetData(commertcial_estate)
        } else if (type == "commertcial") {
            unVisible()
            commertcial(commertcial)
        }

    }

    private fun isWhatsAppInstalled(packageName: String): Boolean {
        val url =
            "https://api.whatsapp.com/send?phone=$whatsAppNumber" + URLEncoder.encode("", "utf-8")
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

    private fun realEstateSetData(data: RealEstateAd) {
        binding.loading.visibility = View.GONE

        imagesAdapter = ImagesAdapter(requireContext(), data.media)
        imagesAdapter.notifyDataSetChanged()

        binding.viewPager.adapter = imagesAdapter
        binding.tabLayout.setupWithViewPager(binding.viewPager, true)
        title = data.title
        binding.tvName.text = title
        binding.tvLocation.text = data.region?.title
        binding.tvNumberOfAds.text =
            resources.getString(R.string.number_of_ads_) + ' ' + data.id.toString()
        binding.tvPrice.text = data.price.toString() + ' ' + resources.getString(R.string.jod)
        binding.tvDate.text = data.date
        binding.tvSeen.text = data.id.toString()
        binding.tvArea.text = data.building_area.toString() + "متر مربع"
        if (data.typeOfAds.id == 1) {
            binding.tvSaleOrRent.text = "للإيجار"
        } else {
            binding.tvSaleOrRent.text = "للبيع"
        }
        if (data.property_ownership == 1) {
            binding.tvOwner.text = "المالك"
        }
        if (data.installment_payment) {
            binding.tvInstallmentsAvailable.text = "نعم"
        } else {
            binding.tvInstallmentsAvailable.text = "لا"
        }
        binding.tvConstructionAge.text = data.age_of_construction.toString() + "سنة"
        if (data.is_featured) {
            binding.tvFurnished.text = "نعم"
        } else {
            binding.tvFurnished.text = "لا"
        }

        binding.tvBuildingArea.text = data.land_area.toString() + "متر مربع"
        binding.tvFloor.text = data.floor
        binding.tvNumberBedrooms.text = data.bedrooms_number.toString() + "غرفة"
        binding.tvNumberBathrooms.text = data.bathrooms_number.toString() + "حمام"

        if (data.is_new) {
            binding.tvPropertyCondition.text = "جديد"
        } else {
            binding.tvPropertyCondition.text = "مستعمل"
        }

        binding.tvNumberApartmentsBuilding.text = data.building_apartments.toString()

        if (data.with_garden) {
            binding.tvItHasGarden.text = "نعم"
        } else {
            binding.tvItHasGarden.text = "لا"
        }
        binding.tvGardenSpace.text = data.garden_area.toString() + "متر مربع"
        if (data.with_roof) {
            binding.tvHaveRoof.text = "نعم"
        } else {
            binding.tvHaveRoof.text = "لا"
        }
        binding.tvRoofSpace.text = data.roof_area.toString() + "متر مربع"

        binding.tvDescription.text = data.description

        val lat = data.lat
        val lon = data.long
        Picasso.get()
            .load("https://maps.googleapis.com/maps/api/staticmap?markers=color:red%7Clabel:%7C" + lat + "," + lon + "&maptype=roadmap&zoom=13&size=600x251&sensor=false&key=AIzaSyDtQgHRpKBnlCfmlFyIKhliytfCb9tHgJY")
            .into(binding.map)

        data.user.let {
            if (!data.user?.name.isNullOrEmpty()) {
                user_name = data.user?.name!!
                binding.tvUserName.text = user_name
            }
            if (!data.user?.phone_number.isNullOrEmpty()) {
                user_phone = data.user?.phone_number!!
            }
            if (!data.user?.whatsapp_number.isNullOrEmpty()) {
                user_whatsapp = data.user?.whatsapp_number!!
            }
            if (!data.user?.email.isNullOrEmpty()) {
                user_email = data.user?.email!!
            }
            if (!data.user?.image.isNullOrEmpty()) {
                user_image = data.user?.image!!
                setImageUrl(binding.ivProfileImage, data.user?.image)
            }
        }

        whatsAppNumber = data.whatsapp
        phoneNumber = data.phone_number
        is_favorite = data.is_favorite
    }

    private fun housingSetData(data: HousingAd) {
        binding.loading.visibility = View.GONE


        imagesAdapter = ImagesAdapter(requireContext(), data.media)
        imagesAdapter.notifyDataSetChanged()

        binding.viewPager.adapter = imagesAdapter
        binding.tabLayout.setupWithViewPager(binding.viewPager, true)

        data.title.let {
            title = data.title
            binding.tvName.text = title
        }

        binding.tvLocation.text = data.region
        binding.tvNumberOfAds.text =
            resources.getString(R.string.number_of_ads_) + ' ' + data.id.toString()
        binding.tvPrice.text = data.price.toString() + ' ' + resources.getString(R.string.jod)
        binding.tvDate.text = data.date
        binding.tvSeen.text = data.id.toString()
        binding.tvArea.text = data.land_area.toString() + "متر مربع"
        if (data.typeOfAds?.id == 1) {
            binding.tvSaleOrRent.text = "للإيجار"
        } else {
            binding.tvSaleOrRent.text = "للبيع"
        }
        if (data.property_ownership == 1) {
            binding.tvOwner.text = "المالك"
        }
        if (data.installment_payment) {
            binding.tvInstallmentsAvailable.text = "نعم"
        } else {
            binding.tvInstallmentsAvailable.text = "لا"
        }
        binding.tvConstructionAge.text = data.age_of_construction.toString() + "سنة"
        if (data.is_featured) {
            binding.tvFurnished.text = "نعم"
        } else {
            binding.tvFurnished.text = "لا"
        }

        binding.tvBuildingArea.text = data.land_area.toString() + "متر مربع"
        binding.tvFloor.text = data.floor
        binding.tvNumberBedrooms.text = data.bedrooms_number.toString() + "غرفة"
        binding.tvNumberBathrooms.text = data.bathrooms_number.toString() + "حمام"

        if (data.is_new) {
            binding.tvPropertyCondition.text = "جديد"
        } else {
            binding.tvPropertyCondition.text = "مستعمل"
        }

        binding.tvNumberApartmentsBuilding.text = data.building_apartments.toString()

        if (data.with_garden) {
            binding.tvItHasGarden.text = "نعم"
        } else {
            binding.tvItHasGarden.text = "لا"
        }
        binding.tvGardenSpace.text = data.garden_area.toString() + "متر مربع"
        data.with_roof.let {
            if (data.with_roof) {
                binding.tvHaveRoof.text = "نعم"
            } else {
                binding.tvHaveRoof.text = "لا"
            }
        }
        binding.tvRoofSpace.text = data.roof_area.toString() + "متر مربع"

        binding.tvDescription.text = data.description

        val lat = data.lat
        val lon = data.long
        Picasso.get()
            .load("https://maps.googleapis.com/maps/api/staticmap?markers=color:red%7Clabel:%7C" + lat + "," + lon + "&maptype=roadmap&zoom=13&size=600x251&sensor=false&key=AIzaSyDtQgHRpKBnlCfmlFyIKhliytfCb9tHgJY")
            .into(binding.map)

        data.user.let {
            if (!data.user?.name.isNullOrEmpty()) {
                user_name = data.user?.name!!
                binding.tvUserName.text = user_name
            }
            if (!data.user?.phone_number.isNullOrEmpty()) {
                user_phone = data.user?.phone_number!!
            }
            if (!data.user?.whatsapp_number.isNullOrEmpty()) {
                user_whatsapp = data.user?.whatsapp_number!!
            }
            if (!data.user?.email.isNullOrEmpty()) {
                user_email = data.user?.email!!
            }
            if (!data.user?.image.isNullOrEmpty()) {
                user_image = data.user?.image!!
                setImageUrl(binding.ivProfileImage, data.user?.image)
            }
        }

        whatsAppNumber = data.whatsapp
        phoneNumber = data.phone_number
        is_favorite = data.is_favorite
    }

    private fun commertcialEstateSetData(data: CommercialEstate) {
        binding.loading.visibility = View.GONE

        imagesAdapter = ImagesAdapter(requireContext(), data.media)
        imagesAdapter.notifyDataSetChanged()

        binding.viewPager.adapter = imagesAdapter
        binding.tabLayout.setupWithViewPager(binding.viewPager, true)

        title = data.title
        binding.tvName.text = title
        binding.tvLocation.text = data.region
        binding.tvNumberOfAds.text =
            resources.getString(R.string.number_of_ads_) + ' ' + data.id.toString()
        binding.tvPrice.text = data.price.toString() + ' ' + resources.getString(R.string.jod)
        binding.tvDate.text = data.date
        binding.tvSeen.text = data.id.toString()
        binding.tvArea.text = data.building_area.toString() + "متر مربع"
        if (data.typeOfAds.id == 1) {
            binding.tvSaleOrRent.text = "للإيجار"
        } else {
            binding.tvSaleOrRent.text = "للبيع"
        }
        if (data.property_ownership == 1) {
            binding.tvOwner.text = "المالك"
        }
        if (data.installment_payment) {
            binding.tvInstallmentsAvailable.text = "نعم"
        } else {
            binding.tvInstallmentsAvailable.text = "لا"
        }
        binding.tvConstructionAge.text = data.year_of_construction.toString() + "سنة"
        if (data.is_featured) {
            binding.tvFurnished.text = "نعم"
        } else {
            binding.tvFurnished.text = "لا"
        }

        binding.tvBuildingArea.text = data.land_area.toString() + "متر مربع"
        binding.tvFloor.text = data.floor
        binding.tvNumberBedrooms.text = data.number_of_bedroom.toString() + "غرفة"
        binding.tvNumberBathrooms.text = data.number_of_bathroom.toString() + "حمام"

        if (data.is_new) {
            binding.tvPropertyCondition.text = "جديد"
        } else {
            binding.tvPropertyCondition.text = "مستعمل"
        }

        binding.tvNumberApartmentsBuilding.text = data.building_apartments.toString()

        if (data.with_garden) {
            binding.tvItHasGarden.text = "نعم"
        } else {
            binding.tvItHasGarden.text = "لا"
        }
        binding.tvGardenSpace.text = data.garden_area.toString() + "متر مربع"
        if (data.with_roof) {
            binding.tvHaveRoof.text = "نعم"
        } else {
            binding.tvHaveRoof.text = "لا"
        }
        binding.tvRoofSpace.text = data.roof_area.toString() + "متر مربع"

        binding.tvDescription.text = data.description

        val lat = data.lat
        val lon = data.long
        Picasso.get()
            .load("https://maps.googleapis.com/maps/api/staticmap?markers=color:red%7Clabel:%7C" + lat + "," + lon + "&maptype=roadmap&zoom=13&size=600x251&sensor=false&key=AIzaSyDtQgHRpKBnlCfmlFyIKhliytfCb9tHgJY")
            .into(binding.map)

        data.user.let {
            if (!data.user.name.isNullOrEmpty()) {
                user_name = data.user.name!!
                binding.tvUserName.text = user_name
            }
            if (!data.user.phone_number.isNullOrEmpty()) {
                user_phone = data.user.phone_number!!
            }
            if (!data.user.whatsapp_number.isNullOrEmpty()) {
                user_whatsapp = data.user.whatsapp_number!!
            }
            if (!data.user.email.isNullOrEmpty()) {
                user_email = data.user.email!!
            }
            if (!data.user.image.isNullOrEmpty()) {
                user_image = data.user.image!!
                setImageUrl(binding.ivProfileImage, data.user.image)
            }
        }

        whatsAppNumber = data.whatsapp
        phoneNumber = data.phone_number
        is_favorite = data.is_favorite
    }

    private fun commertcial(data: CommercialAd) {
        binding.loading.visibility = View.GONE

        imagesAdapter = ImagesAdapter(requireContext(), data.media!!)
        imagesAdapter.notifyDataSetChanged()

        binding.viewPager.adapter = imagesAdapter
        binding.tabLayout.setupWithViewPager(binding.viewPager, true)

        title = data.title!!
        binding.tvName.text = title
        binding.tvLocation.text = data.region
        binding.tvNumberOfAds.text =
            resources.getString(R.string.number_of_ads_) + ' ' + data.id.toString()
        binding.tvPrice.text = data.price.toString() + ' ' + resources.getString(R.string.jod)
        binding.tvDate.text = data.date
        binding.tvSeen.text = data.id.toString()
        binding.tvArea.text = data.building_area.toString() + "متر مربع"
        try {
            if (data.typeOfAds.id == 1) {
                binding.tvSaleOrRent.text = "للإيجار"
            } else {
                binding.tvSaleOrRent.text = "للبيع"
            }
        } catch (e: Exception) {
        }

        if (data.property_ownership == 1) {
            binding.tvOwner.text = "المالك"
        }
        if (data.installment_payment!!) {
            binding.tvInstallmentsAvailable.text = "نعم"
        } else {
            binding.tvInstallmentsAvailable.text = "لا"
        }
        binding.tvConstructionAge.text = data.age_of_construction.toString() + "سنة"
        try {
            if (data.is_featured!!) {
                binding.tvFurnished.text = "نعم"
            } else {
                binding.tvFurnished.text = "لا"
            }
        } catch (e: Exception) {
        }

        binding.tvBuildingArea.text = data.land_area.toString() + "متر مربع"
        binding.tvFloor.text = data.floor
        binding.tvNumberBedrooms.text = data.number_of_bed.toString() + "غرفة"
        binding.tvNumberBathrooms.text = data.bathrooms_number.toString() + "حمام"

        try {
            if (data.is_new!!) {
                binding.tvPropertyCondition.text = "جديد"
            } else {
                binding.tvPropertyCondition.text = "مستعمل"
            }
        } catch (e: Exception) {
        }
        binding.tvNumberApartmentsBuilding.text = data.building_apartments.toString()

        try {
            if (data.with_garden!!) {
                binding.tvItHasGarden.text = "نعم"
            } else {
                binding.tvItHasGarden.text = "لا"
            }
        } catch (e: Exception) {
        }
        binding.tvGardenSpace.text = data.garden_area.toString() + "متر مربع"
        data.with_roof!!.let {
            if (data.with_roof!!) {
                binding.tvHaveRoof.text = "نعم"
            } else {
                binding.tvHaveRoof.text = "لا"
            }
        }
        binding.tvRoofSpace.text = data.roof_area.toString() + "متر مربع"

        binding.tvDescription.text = data.description

        val lat = data.lat
        val lon = data.long
        Picasso.get()
            .load("https://maps.googleapis.com/maps/api/staticmap?markers=color:red%7Clabel:%7C" + lat + "," + lon + "&maptype=roadmap&zoom=13&size=600x251&sensor=false&key=AIzaSyDtQgHRpKBnlCfmlFyIKhliytfCb9tHgJY")
            .into(binding.map)

        data.user.let {
            if (!data.user?.name.isNullOrEmpty()) {
                user_name = data.user?.name!!
                binding.tvUserName.text = user_name
            }
            if (!data.user?.phone_number.isNullOrEmpty()) {
                user_phone = data.user?.phone_number!!
            }
            if (!data.user?.whatsapp_number.isNullOrEmpty()) {
                user_whatsapp = data.user?.whatsapp_number!!
            }
            if (!data.user?.email.isNullOrEmpty()) {
                user_email = data.user?.email!!
            }
            if (!data.user?.image.isNullOrEmpty()) {
                user_image = data.user?.image!!
                setImageUrl(binding.ivProfileImage, data.user?.image)
            }
        }

        whatsAppNumber = data.whatsapp!!
        phoneNumber = data.phone_number!!
        is_favorite = data.is_favorite!!
    }

    private fun visible() {
        binding.tvSaleOrRent.visibility = View.VISIBLE
        binding.tvSaleOrRentTitle.visibility = View.VISIBLE
        binding.view01.visibility = View.VISIBLE
        binding.tvFurnished.visibility = View.VISIBLE
        binding.tvFurnishedTitle.visibility = View.VISIBLE
        binding.view05.visibility = View.VISIBLE
        binding.tvFloor.visibility = View.VISIBLE
        binding.tvFloorTitle.visibility = View.VISIBLE
        binding.view07.visibility = View.VISIBLE
        binding.tvNumberBedrooms.visibility = View.VISIBLE
        binding.tvNumberBedroomsTitle.visibility = View.VISIBLE
        binding.view08.visibility = View.VISIBLE
        binding.tvNumberBathrooms.visibility = View.VISIBLE
        binding.tvNumberBathroomsTitle.visibility = View.VISIBLE
        binding.view09.visibility = View.VISIBLE
        binding.tvPropertyCondition.visibility = View.VISIBLE
        binding.tvPropertyConditionTitle.visibility = View.VISIBLE
        binding.view10.visibility = View.VISIBLE
        binding.tvNumberApartmentsBuilding.visibility = View.VISIBLE
        binding.tvNumberApartmentsBuildingTitle.visibility = View.VISIBLE
        binding.view11.visibility = View.VISIBLE
        binding.tvItHasGarden.visibility = View.VISIBLE
        binding.tvItHasGardenTitle.visibility = View.VISIBLE
        binding.view12.visibility = View.VISIBLE
        binding.tvGardenSpace.visibility = View.VISIBLE
        binding.tvGardenSpaceTitle.visibility = View.VISIBLE
        binding.view13.visibility = View.VISIBLE
        binding.tvHaveRoof.visibility = View.VISIBLE
        binding.tvHaveRoofTitle.visibility = View.VISIBLE
        binding.view14.visibility = View.VISIBLE
        binding.tvRoofSpace.visibility = View.VISIBLE
        binding.tvRoofSpaceTitle.visibility = View.VISIBLE
    }

    private fun unVisible() {
        binding.tvSaleOrRent.visibility = View.GONE
        binding.tvSaleOrRentTitle.visibility = View.GONE
        binding.view01.visibility = View.GONE
        binding.tvFurnished.visibility = View.GONE
        binding.tvFurnishedTitle.visibility = View.GONE
        binding.view05.visibility = View.GONE
        binding.tvFloor.visibility = View.GONE
        binding.tvFloorTitle.visibility = View.GONE
        binding.view07.visibility = View.GONE
        binding.tvNumberBedrooms.visibility = View.GONE
        binding.tvNumberBedroomsTitle.visibility = View.GONE
        binding.view08.visibility = View.GONE
        binding.tvNumberBathrooms.visibility = View.GONE
        binding.tvNumberBathroomsTitle.visibility = View.GONE
        binding.view09.visibility = View.GONE
        binding.tvPropertyCondition.visibility = View.GONE
        binding.tvPropertyConditionTitle.visibility = View.GONE
        binding.view10.visibility = View.GONE
        binding.tvNumberApartmentsBuilding.visibility = View.GONE
        binding.tvNumberApartmentsBuildingTitle.visibility = View.GONE
        binding.view11.visibility = View.GONE
        binding.tvItHasGarden.visibility = View.GONE
        binding.tvItHasGardenTitle.visibility = View.GONE
        binding.view12.visibility = View.GONE
        binding.tvGardenSpace.visibility = View.GONE
        binding.tvGardenSpaceTitle.visibility = View.GONE
        binding.view13.visibility = View.GONE
        binding.tvHaveRoof.visibility = View.GONE
        binding.tvHaveRoofTitle.visibility = View.GONE
        binding.view14.visibility = View.GONE
        binding.tvRoofSpace.visibility = View.GONE
        binding.tvRoofSpaceTitle.visibility = View.GONE
    }

//    private fun favoritesData(realEstateAd: MutableList<RealEstateAd>) {
//        if (realEstateAd.isNotEmpty()) {
//            binding.animationView.visibility = View.GONE
//            binding.tvNoFav.visibility = View.GONE
//            favouritesAdapter = FavouritesAdapter(realEstateAd) {
//                if (prefs.isLoggedIn && !token.isNullOrEmpty()) {
//                    it!!.is_favorite = !it.is_favorite
//                    AddRemoveFavorite(id = it.id, it.is_favorite)
//                } else {
//                    // IF USER NOT LOGIN SHOW DIALOG
//                    requireContext().showLoginDialog(
//                        onPositiveButtonClick = {
//                            findNavController().navigate(R.id.action_homeFragment_to_sigininFragment)
//                            it.dismiss()
//                        }, onNegativeButtonClick = {
//                            it.dismiss()
//                        })
//                }
//            }
//            favouritesAdapter.notifyDataSetChanged()
//            binding.rvFavourite.adapter = favouritesAdapter
//        } else {
//            binding.animationView.visibility = View.VISIBLE
//            binding.tvNoFav.visibility = View.VISIBLE
//        }
//    }

    private fun AddRemoveFavorite(id: Int, isFavorite: Boolean) {
        if (isFavorite) {
            id.let { id ->
                homeViewModel.addFavoriteItem(
                    token!!, id
                )
            }
            homeViewModel.addFavoriteResponse.observe(
                viewLifecycleOwner
            ) {
                if (it.status == Resource.Status.SUCCESS) {

                } else if (it.status == Resource.Status.ERROR) {
                    Toast.makeText(
                        requireContext(),
                        it.message,
                        Toast.LENGTH_SHORT
                    )
                        .show()
                }
            }
        } else {
            id.let { id ->
                homeViewModel.removeFavoriteItem(
                    token!!, id
                )
            }

            homeViewModel.removeFavoriteResponse.observe(
                viewLifecycleOwner
            ) {
                if (it.status == Resource.Status.SUCCESS) {

                } else if (it.status == Resource.Status.ERROR) {
                    Toast.makeText(
                        requireContext(),
                        it.message,
                        Toast.LENGTH_SHORT
                    )
                        .show()
                }
            }
        }

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

}