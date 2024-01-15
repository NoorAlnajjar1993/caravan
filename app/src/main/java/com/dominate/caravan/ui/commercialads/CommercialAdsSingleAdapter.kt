package com.dominate.caravan.ui.commercialads

import android.view.ViewGroup
import android.widget.ImageView
import androidx.core.net.toUri
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.caravan.R
import com.caravan.databinding.RowCommertcialAdsSingleBinding
import com.dominate.caravan.core.base.BaseAdapter
import com.dominate.caravan.core.base.BaseBindingViewHolder
import com.dominate.caravan.medule.home.CommercialAd

class CommercialAdsSingleAdapter (
    marketCategories: MutableList<CommercialAd>?,
    private val onclickListener: ((CommercialAd?) -> Unit),
    private val onclickListenerItem: ((CommercialAd?) -> Unit),
) : BaseAdapter<CommercialAd, CommercialAdsSingleAdapter.MarketCategoryItemViewHolder>(marketCategories) {


    override fun getViewHolder(parent: ViewGroup, viewType: Int): MarketCategoryItemViewHolder {
        val binding = RowCommertcialAdsSingleBinding.inflate(inflater, parent, false)
        return MarketCategoryItemViewHolder(binding)
    }


    inner class MarketCategoryItemViewHolder(
        val binding: RowCommertcialAdsSingleBinding
    ) : BaseBindingViewHolder<CommercialAd>(binding) {
        override fun bind(position: Int, itemPos: CommercialAd?) {
            bind<RowCommertcialAdsSingleBinding> {
                item = itemPos


                try {
                    if (itemPos?.is_favorite!!){
                        binding.ivFavourite.setImageResource(R.drawable.ic_favourite)
                    } else {
                        binding.ivFavourite.setImageResource(R.drawable.ic_favourites_gray)
                    }
                } catch (e:Exception){}


                binding.ivFavourite.setOnClickListener {
                    onclickListener(item)
                    notifyDataSetChanged()
                }
                binding.constraintLayout01.setOnClickListener {
                    onclickListenerItem(item)
                    notifyDataSetChanged()
                }

                if (item!!.media!!.isNotEmpty()) {
                    setImageUrl(binding.imageView02, item!!.media?.get(0)?.image)
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





