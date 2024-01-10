package com.dominate.caravan.ui.home.adapter

import android.view.ViewGroup
import android.widget.ImageView
import androidx.core.net.toUri
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.caravan.R
import com.caravan.databinding.RowHousingAdsBinding
import com.dominate.caravan.core.base.BaseAdapter
import com.dominate.caravan.core.base.BaseBindingViewHolder
import com.dominate.caravan.medule.home.HousingAd


class HousingAdsAdapter (
    marketCategories: MutableList<HousingAd>?,
    private val onclickListener: ((HousingAd?) -> Unit),
    private val onclickListenerItem: ((HousingAd?) -> Unit),
) : BaseAdapter<HousingAd, HousingAdsAdapter.MarketCategoryItemViewHolder>(marketCategories) {


    override fun getViewHolder(parent: ViewGroup, viewType: Int): MarketCategoryItemViewHolder {
        val binding = RowHousingAdsBinding.inflate(inflater, parent, false)
        return MarketCategoryItemViewHolder(binding)
    }


    inner class MarketCategoryItemViewHolder(
        val binding: RowHousingAdsBinding
    ) : BaseBindingViewHolder<HousingAd>(binding) {
        override fun bind(position: Int, itemPos: HousingAd?) {
            bind<RowHousingAdsBinding> {
                item = itemPos

                if (itemPos?.is_favorite!!){
                  binding.ivFavourite.setImageResource(R.drawable.ic_favourite)
                } else {
                    binding.ivFavourite.setImageResource(R.drawable.ic_favourites_gray)
                }

                binding.ivFavourite.setOnClickListener {
                    onclickListener(item)
                    notifyDataSetChanged()
                }
                binding.constraintLayout01.setOnClickListener {
                    onclickListenerItem(item)
                    notifyDataSetChanged()
                }
                if (item!!.media.isNotEmpty()) {
                    setImageUrl(binding.imageView02, item!!.media[0].image)
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





