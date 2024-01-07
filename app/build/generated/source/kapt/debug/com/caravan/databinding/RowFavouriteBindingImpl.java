package com.caravan.databinding;
import com.caravan.R;
import com.caravan.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class RowFavouriteBindingImpl extends RowFavouriteBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imageView_02, 4);
        sViewsWithIds.put(R.id.tv_direction, 5);
        sViewsWithIds.put(R.id.imageView_03, 6);
        sViewsWithIds.put(R.id.tv_distance, 7);
        sViewsWithIds.put(R.id.ivFavourite, 8);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RowFavouriteBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private RowFavouriteBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[4]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[6]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[8]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[5]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[7]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[1]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[3]
            );
        this.constraintLayout02.setTag(null);
        this.tvLocation.setTag(null);
        this.tvName.setTag(null);
        this.tvPrice.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.item == variableId) {
            setItem((com.dominate.caravan.medule.home.RealEstateAd) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItem(@Nullable com.dominate.caravan.medule.home.RealEstateAd Item) {
        this.mItem = Item;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.item);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.dominate.caravan.medule.home.RealEstateAd item = mItem;
        java.lang.String itemRegionTitle = null;
        java.lang.String itemTitle = null;
        java.lang.String stringValueOfItemPriceChar = null;
        java.lang.String stringValueOfItemPriceCharTvPriceAndroidStringJod = null;
        double itemPrice = 0.0;
        com.dominate.caravan.medule.home.Region itemRegion = null;
        java.lang.String stringValueOfItemPrice = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (item != null) {
                    // read item.title
                    itemTitle = item.getTitle();
                    // read item.price
                    itemPrice = item.getPrice();
                    // read item.region
                    itemRegion = item.getRegion();
                }


                // read String.valueOf(item.price)
                stringValueOfItemPrice = java.lang.String.valueOf(itemPrice);
                if (itemRegion != null) {
                    // read item.region.title
                    itemRegionTitle = itemRegion.getTitle();
                }


                // read (String.valueOf(item.price)) + (' ')
                stringValueOfItemPriceChar = (stringValueOfItemPrice) + (' ');


                // read ((String.valueOf(item.price)) + (' ')) + (@android:string/jod)
                stringValueOfItemPriceCharTvPriceAndroidStringJod = (stringValueOfItemPriceChar) + (tvPrice.getResources().getString(R.string.jod));
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvLocation, itemRegionTitle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvName, itemTitle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvPrice, stringValueOfItemPriceCharTvPriceAndroidStringJod);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): item
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}