package com.dominate.caravan.ui.map

import android.Manifest
import android.annotation.SuppressLint
import android.app.AlertDialog
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.Canvas
import android.location.Address
import android.location.Geocoder
import android.net.Uri
import android.os.Build
import androidx.fragment.app.Fragment

import android.os.Bundle
import android.os.SystemClock
import android.provider.Settings
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.os.bundleOf
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.caravan.BuildConfig
import com.caravan.R
import com.caravan.databinding.FragmentAddAdsBinding
import com.caravan.databinding.FragmentMapsBinding
import com.dominate.caravan.core.autoCleared
import com.dominate.caravan.core.base.BaseFragment
import com.dominate.caravan.medule.AddressResponse
import com.dominate.caravan.medule.addads.AddRealStateAdsModel
import com.dominate.caravan.ui.addads.addadsimages.AddAdsImages
import com.dominate.caravan.ui.home.HomeActivity
import com.dominate.caravan.utils.AppConstants
import com.dominate.caravan.utils.AppUtils

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.model.BitmapDescriptor
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import pub.devrel.easypermissions.EasyPermissions
import java.io.IOException
import java.util.Locale
import com.google.android.gms.location.*
import com.google.android.gms.maps.model.*
import com.vdx.designertoast.DesignerToast
import java.util.Currency

class MapsFragment : BaseFragment() ,
    EasyPermissions.RationaleCallbacks{

    var binding: FragmentMapsBinding by  autoCleared()
    val REQUEST_CODE_LOCATION_PERMISSION = 3

    private val callback = OnMapReadyCallback { googleMap ->
        /**
         * Manipulates the map once available.
         * This callback is triggered when the map is ready to be used.
         * This is where we can add markers or lines, add listeners or move the camera.
         * In this case, we just add a marker near Sydney, Australia.
         * If Google Play services is not installed on the device, the user will be prompted to
         * install it inside the SupportMapFragment. This method will only be triggered once the
         * user has installed Google Play services and returned to the app.
         */
        val sydney = LatLng(-34.0, 151.0)
        googleMap.addMarker(MarkerOptions().position(sydney).title("Marker in Sydney"))
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(sydney))
    }

    private lateinit var  obj: Address

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMapsBinding.inflate(inflater, container, false)

        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.mapView.onCreate(savedInstanceState)

        binding.ivBack.setOnClickListener {
            findNavController().popBackStack()
        }
        binding.mapView.getMapAsync {
            map = it
            map?.setOnMapClickListener { point -> getAddressFromLatLng(point.latitude, point.longitude) }

            binding.btnConfirmLocation.setOnClickListener {
                if (SystemClock.elapsedRealtime() - mLastClickTime < 2000) {
                    return@setOnClickListener
                }
                mLastClickTime = SystemClock.elapsedRealtime()
                // do your magic here
                getAddressFromLatLng(map?.cameraPosition?.target?.latitude!!,
                    map?.cameraPosition?.target?.longitude!!)
                var delim1 = ","
                var delim2 = "،"
                getAddressName(map?.cameraPosition?.target?.latitude!!, map?.cameraPosition?.target?.longitude!!)
                var area = ""
                var block = ""
                var street = ""
                try {
                    area = obj.locality
                    block = obj.featureName
                    street = obj.subLocality + "," + obj.getAddressLine(0).split(delim1, delim2, ignoreCase = true).toTypedArray()[0]
                } catch (e:Exception){}
                val model = AddressResponse(
                    lat = map?.cameraPosition?.target?.latitude!!.toString(),
                    lng = map?.cameraPosition?.target?.longitude!!.toString()
                )

                if (AddAdsImages.type == "real_estate") {
                    AddAdsImages.realStateAdsModel.lat = model.lat
                    AddAdsImages.realStateAdsModel.long = model.lng
                    AddAdsImages.realStateAdsModel.street = street
                    AddAdsImages.realStateAdsModel.is_the_location_approximate = false
                }  else if (AddAdsImages.type == "commercial_estate") {
                    AddAdsImages.AddCommercialEStateAdsModel.lat = model.lat
                    AddAdsImages.AddCommercialEStateAdsModel.long = model.lng
                    AddAdsImages.AddCommercialEStateAdsModel.street = street
                    AddAdsImages.AddCommercialEStateAdsModel.is_the_location_approximate = false
                }  else if (AddAdsImages.type == "housing") {
                    AddAdsImages.AddHousingAdsModel.lat = model.lat
                    AddAdsImages.AddHousingAdsModel.long = model.lng
                    AddAdsImages.AddHousingAdsModel.street = street
                    AddAdsImages.AddHousingAdsModel.is_the_location_approximate = false
                }  else if (AddAdsImages.type == "commercial") {
                    AddAdsImages.AddCommercialAdsModel.lat = model.lat
                    AddAdsImages.AddCommercialAdsModel.long = model.lng
                    AddAdsImages.AddCommercialAdsModel.street = street
                    AddAdsImages.AddCommercialAdsModel.is_the_location_approximate = false
                }
                findNavController().navigate(R.id.action_mapsFragment_to_completeFragment,
                    bundleOf(AppConstants.BUNDLE_MODEL to model))

            }
        }
    }

    private var map: GoogleMap? = null
    private var mLastClickTime: Long = 0
    private lateinit var fusedLocationClient: FusedLocationProviderClient
    private lateinit var locationRequest: LocationRequest
    private lateinit var locationCallback: LocationCallback


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        fusedLocationClient = LocationServices.getFusedLocationProviderClient(requireContext())
        getLocationUpdates()
    }

    override fun onRationaleAccepted(requestCode: Int) {
        permissionsAppSettingsDialog(
            getString(R.string.label_app_settings),
            getString(R.string.label_permission_settings_desc)
        )
    }

    override fun onRationaleDenied(requestCode: Int) {
        findNavController().popBackStack()
    }

    private fun requestPermissions() {
        if(AppUtils.hasLocationPermissions(requireContext())) {
            return
        }
        if(Build.VERSION.SDK_INT < Build.VERSION_CODES.Q) {
            EasyPermissions.requestPermissions(
                this, getString(R.string.label_dialog_of_permissions),
                REQUEST_CODE_LOCATION_PERMISSION,
                Manifest.permission.ACCESS_COARSE_LOCATION,
                Manifest.permission.ACCESS_FINE_LOCATION
            )
        } else {
            EasyPermissions.requestPermissions(
                this, getString(R.string.label_dialog_of_permissions),
                REQUEST_CODE_LOCATION_PERMISSION,
                Manifest.permission.ACCESS_COARSE_LOCATION,
                Manifest.permission.ACCESS_FINE_LOCATION)
        }
    }


    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>,
                                            grantResults: IntArray){
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        EasyPermissions.onRequestPermissionsResult(requestCode, permissions, grantResults, this)
    }




    private fun permissionsAppSettingsDialog(title: String, message: String) {
        val builder: AlertDialog.Builder = AlertDialog.Builder(requireContext())
        builder.setTitle(title)
        builder.setCancelable(true)
        builder.setMessage(message).setPositiveButton(getString(R.string.label_ok)) { _, _ ->
            startActivity(
                Intent(
                    Settings.ACTION_APPLICATION_DETAILS_SETTINGS,
                    Uri.parse("package:" + BuildConfig.APPLICATION_ID))
            )
        }.setOnCancelListener {
            findNavController().popBackStack()
        }.setOnDismissListener {
            findNavController().popBackStack()
        }
        builder.create().show()
    }

    override fun onResume() {
        super.onResume()
        startLocationUpdates()
        binding.mapView.onResume()
    }

    override fun onStart() {
        super.onStart()
        requestPermissions()
        binding.mapView.onStart()
    }

    override fun onStop() {
        super.onStop()
        binding.mapView.onStop()
    }

    override fun onPause() {
        super.onPause()
        stopLocationUpdates()
        binding.mapView.onPause()
    }

    override fun onLowMemory() {
        super.onLowMemory()
        binding.mapView.onLowMemory()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        binding.mapView.onSaveInstanceState(outState)
    }


    private fun animateCamera(latitude: Double, longitude: Double) {
        map?.animateCamera(
            CameraUpdateFactory
                .newCameraPosition(getCameraPositionWithBearing(LatLng(latitude, longitude))))
        showMarker(LatLng(latitude, longitude))
    }


    private fun showMarker(latLng: LatLng) {
        map?.clear()
        map?.addMarker(
            MarkerOptions().icon(bitmapDescriptorFromVector(
                R.drawable.ic_point)).position(latLng))
    }


    private fun getCameraPositionWithBearing(latLng: LatLng): CameraPosition {
        return CameraPosition.Builder().target(latLng).zoom(12f).build()
    }

    private fun bitmapDescriptorFromVector( drawableId: Int): BitmapDescriptor {
        val drawable = ContextCompat.getDrawable(requireContext(), drawableId)
        val bitmap = Bitmap.createBitmap(
            drawable!!.intrinsicWidth,
            drawable.intrinsicHeight,
            Bitmap.Config.ARGB_8888
        )
        val canvas = Canvas(bitmap)
        drawable.setBounds(0, 0, canvas.width, canvas.height)
        drawable.draw(canvas)
        return BitmapDescriptorFactory.fromBitmap(bitmap)
    }



    fun getAddressFromLatLng(lat: Double, lng: Double) {
        try {
            animateCamera(lat, lng)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }


    private fun getLocationUpdates() {
        fusedLocationClient = LocationServices.getFusedLocationProviderClient(requireContext())
        locationRequest = LocationRequest.create().apply {
            interval = 100
            fastestInterval = 50
            priority = LocationRequest.PRIORITY_HIGH_ACCURACY
            maxWaitTime= 100
        }
        locationRequest.interval = 50000
        locationRequest.fastestInterval = 50000
        locationRequest.smallestDisplacement = 170f // 170 m = 0.1 mile
        locationRequest.priority = LocationRequest.PRIORITY_HIGH_ACCURACY //set according to your app function
        locationCallback = object : LocationCallback() {
            override fun onLocationResult(results: LocationResult) {
                if (!results.locations.isNullOrEmpty()) {
                    // get latest location
                    val location = results.lastLocation
                    // use your location object
                    // get latitude , longitude and other info from this
                    getAddressFromLatLng(location?.latitude!!, location.longitude)

                    binding.btnConfirmLocation.isEnabled = true
                    binding.btnConfirmLocation.isClickable = true

                }
            }
        }
    }

    @SuppressLint("MissingPermission")
    private fun startLocationUpdates() {
        fusedLocationClient.requestLocationUpdates(locationRequest, locationCallback, null /* Looper */)
    }


    private fun stopLocationUpdates() {
        fusedLocationClient.removeLocationUpdates(locationCallback)
    }



    private fun getAddressName(lat: Double, lng: Double) :String {
        val geocoder = Geocoder(requireContext(),  Locale("en"))
        return try {
            val addresses: MutableList<Address>? = geocoder.getFromLocation(lat, lng, 1)
            if (addresses.isNullOrEmpty()){
                ("")
            }else{
                var delim1 = ","
                var delim2 = "،"

                obj = addresses[0]
                obj.getAddressLine(0)
                (obj.locality + "," + obj.subLocality + "," +
                        obj.getAddressLine(0).split(delim1, delim2, ignoreCase = true).toTypedArray()[0])
            }

        } catch (e: IOException) {
            e.printStackTrace()
            showErrorToast(e.message.toString())
            ""
        }

    }
    fun showErrorToast(message: String) {
        DesignerToast.Custom(
            requireContext(), message, Gravity.TOP or Gravity.FILL_HORIZONTAL, Toast.LENGTH_SHORT,
            R.drawable.purple_gradient, 16, "#FFFFFF", R.drawable.ic_close_purple, 55, 219
        )
    }

}