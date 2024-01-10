package com.dominate.caravan.ui.home

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Color
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.net.toUri
import androidx.core.os.bundleOf
import androidx.databinding.BindingAdapter
import androidx.databinding.ViewDataBinding
import androidx.navigation.findNavController
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.viewpager.widget.PagerAdapter
import com.bumptech.glide.Glide
import com.caravan.R
import com.caravan.databinding.ItemBannerBinding
import com.dominate.caravan.medule.home.Banner

class BannerAdapter(
    private val context: Context,
    private val urls: List<Banner>,
    private val onclickListener: ((Banner?) -> Unit),
) : PagerAdapter() {

    private val inflater: LayoutInflater

    init {
        inflater = LayoutInflater.from(context)
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {

        container.removeView(`object` as View)
    }

    override fun getCount(): Int {
        return urls.size
    }

    @SuppressLint("ClickableViewAccessibility")
    override fun instantiateItem(view: ViewGroup, position: Int): Any {

        val imageLayout = inflater.inflate(R.layout.item_banner, view, false)!!

        val imageView_01 = imageLayout
            .findViewById(R.id.imageView_01) as ImageView

        setImageUrl(imageView_01, urls[position].image)


        imageView_01.setOnClickListener {
            onclickListener(urls[position])
            notifyDataSetChanged()
        }

        view.addView(imageLayout, 0)
        return imageLayout
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }

    override fun restoreState(state: Parcelable?, loader: ClassLoader?) {}
    override fun saveState(): Parcelable? {
        return null
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