package com.dominate.caravan.ui.home

import android.os.Bundle
import android.view.View
import androidx.lifecycle.LiveData
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.caravan.R
import com.dominate.caravan.core.base.BaseActivity
import com.caravan.databinding.ActivityHomeBinding
import dagger.hilt.android.AndroidEntryPoint
import androidx.navigation.ui.setupWithNavController

@AndroidEntryPoint
class HomeActivity : BaseActivity() {
    companion object{
        var FragmentName="Home"
    }
    private var currentNavController: LiveData<NavController>? = null
    lateinit var binding: ActivityHomeBinding

    lateinit var navGraphIds: List<Int>

    var navHostFragment :NavHostFragment ?= null
    var navController :NavController ?= null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)


        setContentView(binding.root)
        if (savedInstanceState == null) {
            handleNavController()
        }

    }
    override fun onSupportNavigateUp(): Boolean {
        return currentNavController?.value?.navigateUp() ?: false
    }
    override fun onBackPressed() {

        if(FragmentName == "Home"){
           /* val exitIntent = Intent(Intent.ACTION_MAIN)
            exitIntent.addCategory(Intent.CATEGORY_HOME)
            exitIntent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            startActivity(exitIntent)*/
          //  finish()
        }
    }

    private fun handleNavController(){
        navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment?.navController

        binding.navView.setupWithNavController(navController!!)

        binding.navView.setOnNavigationItemSelectedListener {item->
            when (item.itemId) {

                R.id.homeFragment -> {
                    navController?.navigate(R.id.homeFragment)
                    true
                }

                R.id.profileFragment -> {
                    if (prefs.isLoggedIn){
                        navController?.navigate(R.id.profileFragment)
                    } else {
                        navController?.navigate(R.id.sigininFragment)
                    }
                    true
                }

                R.id.notificationFragment -> {
                    navController?.navigate(R.id.notificationFragment)
                    true
                }

                R.id.favouriteFragment -> {
                    navController?.navigate(R.id.favouriteFragment)
                    true
                }

                R.id.addAdsFragment -> {
                    navController?.navigate(R.id.addAdsFragment)
                    true
                }
            }

            false
        }


        navController?.addOnDestinationChangedListener { _, destination, _ ->
            if (destination.id == R.id.homeFragment ||
                destination.id == R.id.profileFragment ||
                destination.id == R.id.notificationFragment ||
                destination.id == R.id.favouriteFragment ||
                destination.id == R.id.addAdsFragment){
                binding.navView.visibility = View.VISIBLE
            }else{
                binding.navView.visibility = View.GONE
            }
        }
    }


}