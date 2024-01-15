package com.dominate.caravan.ui.addads.addestateads.adapter

import android.graphics.drawable.Drawable
import android.view.ViewGroup
import android.widget.ImageView
import androidx.core.net.toUri
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.caravan.R
import com.caravan.databinding.RowAdCategoryBinding
import com.dominate.caravan.core.base.BaseAdapter
import com.dominate.caravan.core.base.BaseBindingViewHolder
import com.dominate.caravan.medule.home.CommercialAd
import com.dominate.caravan.ui.addads.addestateads.AddCategoryModel

class AddCategoryAdapter(
    val listItems: MutableList<AddCategoryModel>,
    private val onclickListener: ((AddCategoryModel?) -> Unit),
): BaseAdapter<AddCategoryModel, BaseBindingViewHolder<AddCategoryModel>>(listItems) {
    override fun getItemCount(): Int {
        return listItems.size
    }

    inner class SubCategoryViewHolder(
        private val binding: RowAdCategoryBinding,
    ) : BaseBindingViewHolder<AddCategoryModel>(binding) {
        override fun bind(position: Int, itemPos: AddCategoryModel?) {
            bind<RowAdCategoryBinding> {
                item = itemPos as AddCategoryModel

                if (itemPos.selected){
                    binding.constraintLayout01.background = context.getDrawable(R.drawable.custom_bg_purple)
                    binding.text.setTextColor(context.getColor(R.color.white))
                } else {
                    binding.constraintLayout01.background = context.getDrawable(R.drawable.outline_purple)
                    binding.text.setTextColor(context.getColor(R.color.dark_gray))
                }

                binding.constraintLayout01.setOnClickListener {
                    onclickListener(item)
                    var pre_selected = itemPos.selected
                    listItems.forEach {
                        it.selected = false
                    }
                    itemPos.selected = !pre_selected
                  notifyDataSetChanged()
                }
            }
        }
    }

    override fun getViewHolder(parent: ViewGroup, viewType: Int): BaseBindingViewHolder<AddCategoryModel> {
        return SubCategoryViewHolder(RowAdCategoryBinding.inflate(inflater, parent, false))
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

