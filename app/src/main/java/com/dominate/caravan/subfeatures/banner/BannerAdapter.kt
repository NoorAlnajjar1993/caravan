package com.dominate.caravan.subfeatures.banner

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class BannerAdapter(fa: FragmentActivity, private val count: Int = 5) : FragmentStateAdapter(fa) {
    override fun getItemCount(): Int = count

    override fun createFragment(position: Int): Fragment =
        BannerFragment.newInstance(
            position
        )
}
