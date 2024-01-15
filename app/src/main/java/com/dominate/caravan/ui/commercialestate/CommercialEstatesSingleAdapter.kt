package com.dominate.caravan.ui.commercialestate

import android.view.ViewGroup
import android.widget.ImageView
import androidx.core.net.toUri
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.caravan.R
import com.caravan.databinding.RowCommertcialEstateSingleBinding
import com.dominate.caravan.core.base.BaseAdapter
import com.dominate.caravan.core.base.BaseBindingViewHolder
import com.dominate.caravan.medule.home.CommercialEstate


class CommercialEstatesSingleAdapter (
    marketCategories: MutableList<CommercialEstate>?,
    private val onclickListener: ((CommercialEstate?) -> Unit),
    private val onclickListenerItem: ((CommercialEstate?) -> Unit)
) : BaseAdapter<CommercialEstate, CommercialEstatesSingleAdapter.MarketCategoryItemViewHolder>(marketCategories) {


    override fun getViewHolder(parent: ViewGroup, viewType: Int): MarketCategoryItemViewHolder {
        val binding = RowCommertcialEstateSingleBinding.inflate(inflater, parent, false)
        return MarketCategoryItemViewHolder(binding)
    }


    inner class MarketCategoryItemViewHolder(
        val binding: RowCommertcialEstateSingleBinding
    ) : BaseBindingViewHolder<CommercialEstate>(binding) {
        override fun bind(position: Int, itemPos: CommercialEstate?) {
            bind<RowCommertcialEstateSingleBinding> {
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





