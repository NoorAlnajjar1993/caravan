package com.dominate.caravan.ui.addads.addadsimages.adapter

import android.graphics.drawable.Drawable
import android.view.ViewGroup
import android.widget.ImageView
import androidx.core.net.toUri
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.caravan.R
import com.caravan.databinding.RowAddMediaBinding
import com.dominate.caravan.core.base.BaseAdapter
import com.dominate.caravan.core.base.BaseBindingViewHolder
import com.dominate.caravan.medule.home.Media

class MediaAdapter(
    val listItems: MutableList<Media>,
    private val onclickListener: ((Media?) -> Unit),
): BaseAdapter<Media, BaseBindingViewHolder<Media>>(listItems) {
    override fun getItemCount(): Int {
        return listItems.size
    }

    inner class SubCategoryViewHolder(
        private val binding: RowAddMediaBinding,
    ) : BaseBindingViewHolder<Media>(binding) {
        override fun bind(position: Int, itemPos: Media?) {
            bind<RowAddMediaBinding> {
                item = itemPos as Media

                Glide.with(context).load(itemPos.image).into(binding.ivImageVariant)


                binding.ivRemove.setOnClickListener {
                    onclickListener(item)
                  notifyDataSetChanged()
                }
            }
        }
    }

    override fun getViewHolder(parent: ViewGroup, viewType: Int): BaseBindingViewHolder<Media> {
        return SubCategoryViewHolder(RowAddMediaBinding.inflate(inflater, parent, false))
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

