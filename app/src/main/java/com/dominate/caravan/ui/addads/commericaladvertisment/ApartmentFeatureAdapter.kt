package com.dominate.caravan.ui.addads.commericaladvertisment

import android.graphics.Paint
import android.graphics.drawable.Drawable
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.appcompat.content.res.AppCompatResources.getDrawable
import androidx.core.net.toUri
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.caravan.R
import com.caravan.databinding.RowApartmentFeaturesBinding
import com.dominate.caravan.core.base.BaseAdapter
import com.dominate.caravan.core.base.BaseBindingViewHolder

class ApartmentFeatureAdapter(
    val listItems: MutableList<ApartmentFeatureModel>,
): BaseAdapter<ApartmentFeatureModel, BaseBindingViewHolder<ApartmentFeatureModel>>(listItems) {
    override fun getItemCount(): Int {
        return listItems.size
    }

    inner class SubCategoryViewHolder(
        private val binding: RowApartmentFeaturesBinding,
    ) : BaseBindingViewHolder<ApartmentFeatureModel>(binding) {
        override fun bind(position: Int, item: ApartmentFeatureModel?) {
//            bind<RowApartmentFeaturesBinding> {
//                popularProductsList = item as ApartmentFeatureModel
//            }

            binding.image.setImageResource(item!!.image)
            binding.text.text = item.text

        }
    }

    override fun getViewHolder(parent: ViewGroup, viewType: Int): BaseBindingViewHolder<ApartmentFeatureModel> {
        return SubCategoryViewHolder(RowApartmentFeaturesBinding.inflate(inflater, parent, false))
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
    @BindingAdapter("android:src")
    fun setImageDrawable(view: ImageView, drawable: Drawable?) {
        view.setImageDrawable(drawable)
    }
}

