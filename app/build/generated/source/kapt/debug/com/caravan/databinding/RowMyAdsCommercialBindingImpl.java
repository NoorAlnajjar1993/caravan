package com.caravan.databinding;
import com.caravan.R;
import com.caravan.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class RowMyAdsCommercialBindingImpl extends RowMyAdsCommercialBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.iv_image, 4);
        sViewsWithIds.put(R.id.tv_seen, 5);
        sViewsWithIds.put(R.id.iv_delete, 6);
        sViewsWithIds.put(R.id.iv_play, 7);
        sViewsWithIds.put(R.id.iv_edit, 8);
        sViewsWithIds.put(R.id.tvFeatureAds, 9);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RowMyAdsCommercialBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private RowMyAdsCommercialBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[6]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[8]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[4]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[7]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[3]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[9]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[1]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[5]
            );
        this.constraintLayout01.setTag(null);
        this.tvDate.setTag(null);
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
        com.dominate.caravan.medule.home.CommercialAd item = mItem;
        double androidxDatabindingViewDataBindingSafeUnboxItemPrice = 0.0;
        java.lang.String itemDate = null;
        java.lang.String itemTitle = null;
        java.lang.String stringValueOfItemPriceChar = null;
        java.lang.String stringValueOfItemPriceCharTvPriceAndroidStringJod = null;
        java.lang.Double itemPrice = null;
        java.lang.String stringValueOfItemPrice = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (item != null) {
                    // read item.date
                    itemDate = item.getDate();
                    // read item.title
                    itemTitle = item.getTitle();
                    // read item.price
                    itemPrice = item.getPrice();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(item.price)
                androidxDatabindingViewDataBindingSafeUnboxItemPrice = androidx.databinding.ViewDataBinding.safeUnbox(itemPrice);


                // read String.valueOf(androidx.databinding.ViewDataBinding.safeUnbox(item.price))
                stringValueOfItemPrice = java.lang.String.valueOf(androidxDatabindingViewDataBindingSafeUnboxItemPrice);


                // read (String.valueOf(androidx.databinding.ViewDataBinding.safeUnbox(item.price))) + (' ')
                stringValueOfItemPriceChar = (stringValueOfItemPrice) + (' ');


                // read ((String.valueOf(androidx.databinding.ViewDataBinding.safeUnbox(item.price))) + (' ')) + (@android:string/jod)
                stringValueOfItemPriceCharTvPriceAndroidStringJod = (stringValueOfItemPriceChar) + (tvPrice.getResources().getString(R.string.jod));
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDate, itemDate);
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