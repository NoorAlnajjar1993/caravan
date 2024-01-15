package com.dominate.caravan.ui.housingads

import android.view.ViewGroup
import android.widget.ImageView
import androidx.core.net.toUri
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.caravan.R
import com.caravan.databinding.RowHousingAdsSingleBinding
import com.dominate.caravan.core.base.BaseAdapter
import com.dominate.caravan.core.base.BaseBindingViewHolder
import com.dominate.caravan.medule.home.HousingAd


class HousingAdsSingleAdapter (
    marketCategories: MutableList<HousingAd>?,
    private val onclickListener: ((HousingAd?) -> Unit),
    private val onclickListenerItem: ((HousingAd?) -> Unit),
) : BaseAdapter<HousingAd, HousingAdsSingleAdapter.MarketCategoryItemViewHolder>(marketCategories) {
    
    override fun getViewHolder(parent: ViewGroup, viewType: Int): MarketCategoryItemViewHolder {
        val binding = RowHousingAdsSingleBinding.inflate(inflater, parent, false)
        return MarketCategoryItemViewHolder(binding)
    }


    inner class MarketCategoryItemViewHolder(
        val binding: RowHousingAdsSingleBinding
    ) : BaseBindingViewHolder<HousingAd>(binding) {
        override fun bind(position: Int, itemPos: HousingAd?) {
            bind<RowHousingAdsSingleBinding> {
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





