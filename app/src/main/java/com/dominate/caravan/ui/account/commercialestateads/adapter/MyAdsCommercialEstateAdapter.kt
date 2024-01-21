package com.dominate.caravan.ui.account.commercialestateads.adapter

import android.view.ViewGroup
import android.widget.ImageView
import androidx.core.net.toUri
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.caravan.R
import com.caravan.databinding.RowMyAdsCommercialEstateBinding
import com.dominate.caravan.core.base.BaseAdapter
import com.dominate.caravan.core.base.BaseBindingViewHolder
import com.dominate.caravan.medule.home.CommercialEstate


class MyAdsCommercialEstateAdapter (
    marketCategories: MutableList<CommercialEstate>?,
    private val onclickListener: ((CommercialEstate?) -> Unit)
) : BaseAdapter<CommercialEstate, MyAdsCommercialEstateAdapter.MarketCategoryItemViewHolder>(marketCategories) {


    override fun getViewHolder(parent: ViewGroup, viewType: Int): MarketCategoryItemViewHolder {
        val binding = RowMyAdsCommercialEstateBinding.inflate(inflater, parent, false)
        return MarketCategoryItemViewHolder(binding)
    }


    inner class MarketCategoryItemViewHolder(
        val binding: RowMyAdsCommercialEstateBinding
    ) : BaseBindingViewHolder<CommercialEstate>(binding) {
        override fun bind(position: Int, itemPos: CommercialEstate?) {
            bind<RowMyAdsCommercialEstateBinding> {
                item = itemPos


                binding.constraintLayout01.setOnClickListener {
                    onclickListener(item)
                    notifyDataSetChanged()
                }

                if (itemPos!!.is_featured!!){
                    binding.tvFeatureAds.background = context.getDrawable(R.drawable.custom_bg_purple2)
                    binding.tvFeatureAds.text = "اعلانك مميّز"
                } else {
                    binding.tvFeatureAds.background = context.getDrawable(R.drawable.custom_bg_yellow)
                    binding.tvFeatureAds.text = "ميّز اعلانك"
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





