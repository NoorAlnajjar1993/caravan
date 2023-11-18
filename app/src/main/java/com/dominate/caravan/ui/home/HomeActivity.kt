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
    var isUpdateLanguage = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)


        setContentView(binding.root)
        if (savedInstanceState == null) {
            //setupBottomNavigationBar()
            handleNavController()
        }

    }

    private fun setupBottomNavigationBar() {
        val bottomNavigationView=binding.navView
        bottomNavigationView.itemIconTintList = null
        navGraphIds = listOf(


        )

        // Setup the bottom navigation view with a list of navigation graphs
      /*  val controller = bottomNavigationView.setupWithNavController(
                navGraphIds = navGraphIds,
                fragmentManager = supportFragmentManager,
                containerId = R.id.nav_host_fragment,
                intent = intent
        )*/

        if (!prefs.isLoggedIn){

            navGraphIds
            bottomNavigationView.setOnNavigationItemSelectedListener { item ->
                when (item.itemId) {

                }
                true
            }

        }


       // currentNavController = controller



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



            }

            false
        }


        navController?.addOnDestinationChangedListener { _, destination, _ ->
            if (destination.id == R.id.homeFragment ){
                binding.navView.visibility = View.VISIBLE
            }else{
                binding.navView.visibility = View.GONE
            }
        }
    }


}