package com.caravan;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.caravan.databinding.RowDistinctAdvertismentBindingImpl;
import com.caravan.databinding.RowHousingAdsBindingImpl;
import com.caravan.databinding.RowLatestAdsBindingImpl;
import com.caravan.databinding.RowPropertiesNearYouBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.annotation.Generated;

@Generated("Android Data Binding")
public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ROWDISTINCTADVERTISMENT = 1;

  private static final int LAYOUT_ROWHOUSINGADS = 2;

  private static final int LAYOUT_ROWLATESTADS = 3;

  private static final int LAYOUT_ROWPROPERTIESNEARYOU = 4;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(4);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.caravan.R.layout.row_distinct_advertisment, LAYOUT_ROWDISTINCTADVERTISMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.caravan.R.layout.row_housing_ads, LAYOUT_ROWHOUSINGADS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.caravan.R.layout.row_latest_ads, LAYOUT_ROWLATESTADS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.caravan.R.layout.row_properties_near_you, LAYOUT_ROWPROPERTIESNEARYOU);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ROWDISTINCTADVERTISMENT: {
          if ("layout/row_distinct_advertisment_0".equals(tag)) {
            return new RowDistinctAdvertismentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for row_distinct_advertisment is invalid. Received: " + tag);
        }
        case  LAYOUT_ROWHOUSINGADS: {
          if ("layout/row_housing_ads_0".equals(tag)) {
            return new RowHousingAdsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for row_housing_ads is invalid. Received: " + tag);
        }
        case  LAYOUT_ROWLATESTADS: {
          if ("layout/row_latest_ads_0".equals(tag)) {
            return new RowLatestAdsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for row_latest_ads is invalid. Received: " + tag);
        }
        case  LAYOUT_ROWPROPERTIESNEARYOU: {
          if ("layout/row_properties_near_you_0".equals(tag)) {
            return new RowPropertiesNearYouBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for row_properties_near_you is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(2);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    result.add(new com.dominate.caravan.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(4);

    static {
      sKeys.put("layout/row_distinct_advertisment_0", com.caravan.R.layout.row_distinct_advertisment);
      sKeys.put("layout/row_housing_ads_0", com.caravan.R.layout.row_housing_ads);
      sKeys.put("layout/row_latest_ads_0", com.caravan.R.layout.row_latest_ads);
      sKeys.put("layout/row_properties_near_you_0", com.caravan.R.layout.row_properties_near_you);
    }
  }
}
