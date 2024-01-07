package com.dominate.caravan.ui.home.adapter

import android.view.ViewGroup
import android.widget.ImageView
import androidx.core.net.toUri
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.caravan.R
import com.caravan.databinding.RowCommertcialEstateBinding
import com.dominate.caravan.core.base.BaseAdapter
import com.dominate.caravan.core.base.BaseBindingViewHolder
import com.dominate.caravan.medule.home.CommercialEstate


class CommercialEstatesAdapter (
    marketCategories: MutableList<CommercialEstate>?,
    private val onclickListener: ((CommercialEstate?) -> Unit)
) : BaseAdapter<CommercialEstate, CommercialEstatesAdapter.MarketCategoryItemViewHolder>(marketCategories) {


    override fun getViewHolder(parent: ViewGroup, viewType: Int): MarketCategoryItemViewHolder {
        val binding = RowCommertcialEstateBinding.inflate(inflater, parent, false)
        return MarketCategoryItemViewHolder(binding)
    }


    inner class MarketCategoryItemViewHolder(
        val binding: RowCommertcialEstateBinding
    ) : BaseBindingViewHolder<CommercialEstate>(binding) {
        override fun bind(position: Int, itemPos: CommercialEstate?) {
            bind<RowCommertcialEstateBinding> {
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





