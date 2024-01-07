package com.dominate.caravan.ui.favourite.adapter

import android.view.ViewGroup
import android.widget.ImageView
import androidx.core.net.toUri
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.caravan.R
import com.caravan.databinding.RowFavouriteBinding
import com.dominate.caravan.core.base.BaseAdapter
import com.dominate.caravan.core.base.BaseBindingViewHolder
import com.dominate.caravan.medule.home.RealEstateAd


class FavouritesAdapter (
    marketCategories: MutableList<RealEstateAd>?,
    private val onclickListener: ((RealEstateAd?) -> Unit)
) : BaseAdapter<RealEstateAd, FavouritesAdapter.MarketCategoryItemViewHolder>(marketCategories) {


    override fun getViewHolder(parent: ViewGroup, viewType: Int): MarketCategoryItemViewHolder {
        val binding = RowFavouriteBinding.inflate(inflater, parent, false)
        return MarketCategoryItemViewHolder(binding)
    }


    inner class MarketCategoryItemViewHolder(
        val binding: RowFavouriteBinding
    ) : BaseBindingViewHolder<RealEstateAd>(binding) {
        override fun bind(position: Int, itemPos: RealEstateAd?) {
            bind<RowFavouriteBinding> {
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





