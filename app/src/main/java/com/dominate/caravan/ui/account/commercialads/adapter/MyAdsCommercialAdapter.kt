package com.dominate.caravan.ui.account.commercialads.adapter

import android.view.ViewGroup
import android.widget.ImageView
import androidx.core.net.toUri
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.caravan.R
import com.caravan.databinding.RowMyAdsCommercialBinding
import com.dominate.caravan.core.base.BaseAdapter
import com.dominate.caravan.core.base.BaseBindingViewHolder
import com.dominate.caravan.medule.home.CommercialAd


class MyAdsCommercialAdapter (
    marketCategories: MutableList<CommercialAd>?,
    private val onclickListener: ((CommercialAd?) -> Unit)
) : BaseAdapter<CommercialAd, MyAdsCommercialAdapter.MarketCategoryItemViewHolder>(marketCategories) {


    override fun getViewHolder(parent: ViewGroup, viewType: Int): MarketCategoryItemViewHolder {
        val binding = RowMyAdsCommercialBinding.inflate(inflater, parent, false)
        return MarketCategoryItemViewHolder(binding)
    }


    inner class MarketCategoryItemViewHolder(
        val binding: RowMyAdsCommercialBinding
    ) : BaseBindingViewHolder<CommercialAd>(binding) {
        override fun bind(position: Int, itemPos: CommercialAd?) {
            bind<RowMyAdsCommercialBinding> {
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





