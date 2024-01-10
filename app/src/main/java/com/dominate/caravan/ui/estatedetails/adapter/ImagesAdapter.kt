package com.dominate.caravan.ui.estatedetails.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.core.net.toUri
import androidx.databinding.BindingAdapter
import androidx.viewpager.widget.PagerAdapter
import com.bumptech.glide.Glide
import com.caravan.R
import com.dominate.caravan.medule.home.Media

class ImagesAdapter (private val context: Context,
                     private val urls: List<Media>) : PagerAdapter() {

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

        val imageLayout = inflater.inflate(R.layout.item_images, view, false)!!

        val imageView_01 = imageLayout
            .findViewById(R.id.imageView_01) as ImageView

        setImageUrl(imageView_01, urls[position].image)

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