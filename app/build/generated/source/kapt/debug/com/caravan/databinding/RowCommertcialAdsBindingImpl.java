package com.caravan.databinding;
import com.caravan.R;
import com.caravan.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class RowCommertcialAdsBindingImpl extends RowCommertcialAdsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imageView_02, 5);
        sViewsWithIds.put(R.id.iv_favourite, 6);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RowCommertcialAdsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private RowCommertcialAdsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (com.google.android.material.imageview.ShapeableImageView) bindings[5]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[6]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[3]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[1]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[4]
            );
        this.constraintLayout01.setTag(null);
        this.tvDirection.setTag(null);
        this.tvLocation.setTag(null);
        this.tvName.setTag(null);
        this.tvPhoneNumber.setTag(null);
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
        java.lang.String itemPhoneNumber = null;
        java.lang.String itemTitle = null;
        java.lang.String tvDirectionAndroidStringNumberOfAdsCharStringValueOfItemId = null;
        java.lang.String stringValueOfItemId = null;
        java.lang.Integer itemId = null;
        int androidxDatabindingViewDataBindingSafeUnboxItemId = 0;
        java.lang.String itemRegion = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (item != null) {
                    // read item.phone_number
                    itemPhoneNumber = item.getPhone_number();
                    // read item.title
                    itemTitle = item.getTitle();
                    // read item.id
                    itemId = item.getId();
                    // read item.region
                    itemRegion = item.getRegion();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(item.id)
                androidxDatabindingViewDataBindingSafeUnboxItemId = androidx.databinding.ViewDataBinding.safeUnbox(itemId);


                // read String.valueOf(androidx.databinding.ViewDataBinding.safeUnbox(item.id))
                stringValueOfItemId = java.lang.String.valueOf(androidxDatabindingViewDataBindingSafeUnboxItemId);


                // read ((@android:string/number_of_ads_) + (' ')) + (String.valueOf(androidx.databinding.ViewDataBinding.safeUnbox(item.id)))
                tvDirectionAndroidStringNumberOfAdsCharStringValueOfItemId = ((tvDirection.getResources().getString(R.string.number_of_ads_)) + (' ')) + (stringValueOfItemId);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDirection, tvDirectionAndroidStringNumberOfAdsCharStringValueOfItemId);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvLocation, itemRegion);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvName, itemTitle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvPhoneNumber, itemPhoneNumber);
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