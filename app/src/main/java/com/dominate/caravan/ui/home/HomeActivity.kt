package com.dominate.caravan.ui.home

import android.os.Bundle
import androidx.lifecycle.LiveData
import androidx.navigation.NavController
import com.dominate.caravan.core.base.BaseActivity
import com.caravan.databinding.ActivityHomeBinding
import dagger.hilt.android.AndroidEntryPoint



@AndroidEntryPoint
class HomeActivity : BaseActivity() {
    companion object{
        var FragmentName="Home"
    }
    private var currentNavController: LiveData<NavController>? = null
    lateinit var binding: ActivityHomeBinding

    lateinit var navGraphIds: List<Int>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)


        setContentView(binding.root)
        if (savedInstanceState == null) {
            setupBottomNavigationBar()
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



}