package com.dominate.caravan.ui.splach

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import com.dominate.caravan.core.base.BaseActivity
import com.caravan.databinding.ActivitySplachBinding
import com.dominate.caravan.ui.home.HomeActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SplachActivity : BaseActivity() {
    private val SPLASH_TIME_OUT:Long=3000 // 3 sec
    lateinit var binding: ActivitySplachBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplachBinding.inflate(layoutInflater)

        setContentView(binding.root)
        Handler().postDelayed({
            startActivity(Intent(this, HomeActivity::class.java))
            // close this activity
            finish()
        }, SPLASH_TIME_OUT)


    }
}