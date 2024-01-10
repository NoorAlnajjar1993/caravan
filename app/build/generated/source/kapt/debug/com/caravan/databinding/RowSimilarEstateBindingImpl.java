package com.caravan.databinding;
import com.caravan.R;
import com.caravan.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class RowSimilarEstateBindingImpl extends RowSimilarEstateBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imageView_02, 6);
        sViewsWithIds.put(R.id.imageView_03, 7);
        sViewsWithIds.put(R.id.ivFavourite, 8);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RowSimilarEstateBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private RowSimilarEstateBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (com.google.android.material.imageview.ShapeableImageView) bindings[6]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[7]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[8]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[3]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[4]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[1]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[5]
            );
        this.constraintLayout02.setTag(null);
        this.tvDirection.setTag(null);
        this.tvDistance.setTag(null);
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
            setItem((com.dominate.caravan.medule.home.CommercialAd) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItem(@Nullable com.dominate.caravan.medule.home.CommercialAd Item) {
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
        java.lang.Integer itemNumberOfBed = null;
        com.dominate.caravan.medule.home.CommercialAd item = mItem;
        java.lang.String stringValueOfItemLandAreaChar = null;
        java.lang.String stringValueOfItemNumberOfBedChar = null;
        java.lang.String itemTitle = null;
        double androidxDatabindingViewDataBindingSafeUnboxItemLandArea = 0.0;
        java.lang.String stringValueOfItemPriceChar = null;
        java.lang.String stringValueOfItemLandAreaCharTvDirectionAndroidStringM2 = null;
        java.lang.String stringValueOfItemPriceCharTvPriceAndroidStringJod = null;
        java.lang.String stringValueOfItemPrice = null;
        java.lang.String stringValueOfItemLandArea = null;
        double androidxDatabindingViewDataBindingSafeUnboxItemPrice = 0.0;
        java.lang.Double itemLandArea = null;
        java.lang.String stringValueOfItemNumberOfBedCharTvDistanceAndroidStringRoom = null;
        int androidxDatabindingViewDataBindingSafeUnboxItemNumberOfBed = 0;
        java.lang.Double itemPrice = null;
        java.lang.String itemRegion = null;
        java.lang.String stringValueOfItemNumberOfBed = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (item != null) {
                    // read item.number_of_bed
                    itemNumberOfBed = item.getNumber_of_bed();
                    // read item.title
                    itemTitle = item.getTitle();
                    // read item.land_area
                    itemLandArea = item.getLand_area();
                    // read item.price
                    itemPrice = item.getPrice();
                    // read item.region
                    itemRegion = item.getRegion();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(item.number_of_bed)
                androidxDatabindingViewDataBindingSafeUnboxItemNumberOfBed = androidx.databinding.ViewDataBinding.safeUnbox(itemNumberOfBed);
                // read androidx.databinding.ViewDataBinding.safeUnbox(item.land_area)
                androidxDatabindingViewDataBindingSafeUnboxItemLandArea = androidx.databinding.ViewDataBinding.safeUnbox(itemLandArea);
                // read androidx.databinding.ViewDataBinding.safeUnbox(item.price)
                androidxDatabindingViewDataBindingSafeUnboxItemPrice = androidx.databinding.ViewDataBinding.safeUnbox(itemPrice);


                // read String.valueOf(androidx.databinding.ViewDataBinding.safeUnbox(item.number_of_bed))
                stringValueOfItemNumberOfBed = java.lang.String.valueOf(androidxDatabindingViewDataBindingSafeUnboxItemNumberOfBed);
                // read String.valueOf(androidx.databinding.ViewDataBinding.safeUnbox(item.land_area))
                stringValueOfItemLandArea = java.lang.String.valueOf(androidxDatabindingViewDataBindingSafeUnboxItemLandArea);
                // read String.valueOf(androidx.databinding.ViewDataBinding.safeUnbox(item.price))
                stringValueOfItemPrice = java.lang.String.valueOf(androidxDatabindingViewDataBindingSafeUnboxItemPrice);


                // read (String.valueOf(androidx.databinding.ViewDataBinding.safeUnbox(item.number_of_bed))) + (' ')
                stringValueOfItemNumberOfBedChar = (stringValueOfItemNumberOfBed) + (' ');
                // read (String.valueOf(androidx.databinding.ViewDataBinding.safeUnbox(item.land_area))) + (' ')
                stringValueOfItemLandAreaChar = (stringValueOfItemLandArea) + (' ');
                // read (String.valueOf(androidx.databinding.ViewDataBinding.safeUnbox(item.price))) + (' ')
                stringValueOfItemPriceChar = (stringValueOfItemPrice) + (' ');


                // read ((String.valueOf(androidx.databinding.ViewDataBinding.safeUnbox(item.number_of_bed))) + (' ')) + (@android:string/room)
                stringValueOfItemNumberOfBedCharTvDistanceAndroidStringRoom = (stringValueOfItemNumberOfBedChar) + (tvDistance.getResources().getString(R.string.room));
                // read ((String.valueOf(androidx.databinding.ViewDataBinding.safeUnbox(item.land_area))) + (' ')) + (@android:string/m2)
                stringValueOfItemLandAreaCharTvDirectionAndroidStringM2 = (stringValueOfItemLandAreaChar) + (tvDirection.getResources().getString(R.string.m2));
                // read ((String.valueOf(androidx.databinding.ViewDataBinding.safeUnbox(item.price))) + (' ')) + (@android:string/jod)
                stringValueOfItemPriceCharTvPriceAndroidStringJod = (stringValueOfItemPriceChar) + (tvPrice.getResources().getString(R.string.jod));
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDirection, stringValueOfItemLandAreaCharTvDirectionAndroidStringM2);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDistance, stringValueOfItemNumberOfBedCharTvDistanceAndroidStringRoom);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvLocation, itemRegion);
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