package com.caravan;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.caravan.databinding.DialogDeactivateBindingImpl;
import com.caravan.databinding.DialogLogInBindingImpl;
import com.caravan.databinding.DialogLogOutBindingImpl;
import com.caravan.databinding.DialogReportBindingImpl;
import com.caravan.databinding.ItemBannerBindingImpl;
import com.caravan.databinding.ItemImagesBindingImpl;
import com.caravan.databinding.RowApartmentFeaturesBindingImpl;
import com.caravan.databinding.RowCommertcialAdsBindingImpl;
import com.caravan.databinding.RowCommertcialEstateBindingImpl;
import com.caravan.databinding.RowDistinctAdvertismentBindingImpl;
import com.caravan.databinding.RowFavouriteBindingImpl;
import com.caravan.databinding.RowHousingAdsBindingImpl;
import com.caravan.databinding.RowRealEstateAdsBindingImpl;
import com.caravan.databinding.RowSimilarEstateBindingImpl;
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
  private static final int LAYOUT_DIALOGDEACTIVATE = 1;

  private static final int LAYOUT_DIALOGLOGIN = 2;

  private static final int LAYOUT_DIALOGLOGOUT = 3;

  private static final int LAYOUT_DIALOGREPORT = 4;

  private static final int LAYOUT_ITEMBANNER = 5;

  private static final int LAYOUT_ITEMIMAGES = 6;

  private static final int LAYOUT_ROWAPARTMENTFEATURES = 7;

  private static final int LAYOUT_ROWCOMMERTCIALADS = 8;

  private static final int LAYOUT_ROWCOMMERTCIALESTATE = 9;

  private static final int LAYOUT_ROWDISTINCTADVERTISMENT = 10;

  private static final int LAYOUT_ROWFAVOURITE = 11;

  private static final int LAYOUT_ROWHOUSINGADS = 12;

  private static final int LAYOUT_ROWREALESTATEADS = 13;

  private static final int LAYOUT_ROWSIMILARESTATE = 14;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(14);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.caravan.R.layout.dialog_deactivate, LAYOUT_DIALOGDEACTIVATE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.caravan.R.layout.dialog_log_in, LAYOUT_DIALOGLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.caravan.R.layout.dialog_log_out, LAYOUT_DIALOGLOGOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.caravan.R.layout.dialog_report, LAYOUT_DIALOGREPORT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.caravan.R.layout.item_banner, LAYOUT_ITEMBANNER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.caravan.R.layout.item_images, LAYOUT_ITEMIMAGES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.caravan.R.layout.row_apartment_features, LAYOUT_ROWAPARTMENTFEATURES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.caravan.R.layout.row_commertcial_ads, LAYOUT_ROWCOMMERTCIALADS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.caravan.R.layout.row_commertcial_estate, LAYOUT_ROWCOMMERTCIALESTATE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.caravan.R.layout.row_distinct_advertisment, LAYOUT_ROWDISTINCTADVERTISMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.caravan.R.layout.row_favourite, LAYOUT_ROWFAVOURITE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.caravan.R.layout.row_housing_ads, LAYOUT_ROWHOUSINGADS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.caravan.R.layout.row_real_estate_ads, LAYOUT_ROWREALESTATEADS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.caravan.R.layout.row_similar_estate, LAYOUT_ROWSIMILARESTATE);
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
        case  LAYOUT_DIALOGDEACTIVATE: {
          if ("layout/dialog_deactivate_0".equals(tag)) {
            return new DialogDeactivateBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_deactivate is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGLOGIN: {
          if ("layout/dialog_log_in_0".equals(tag)) {
            return new DialogLogInBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_log_in is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGLOGOUT: {
          if ("layout/dialog_log_out_0".equals(tag)) {
            return new DialogLogOutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_log_out is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGREPORT: {
          if ("layout/dialog_report_0".equals(tag)) {
            return new DialogReportBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_report is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMBANNER: {
          if ("layout/item_banner_0".equals(tag)) {
            return new ItemBannerBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_banner is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMIMAGES: {
          if ("layout/item_images_0".equals(tag)) {
            return new ItemImagesBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_images is invalid. Received: " + tag);
        }
        case  LAYOUT_ROWAPARTMENTFEATURES: {
          if ("layout/row_apartment_features_0".equals(tag)) {
            return new RowApartmentFeaturesBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for row_apartment_features is invalid. Received: " + tag);
        }
        case  LAYOUT_ROWCOMMERTCIALADS: {
          if ("layout/row_commertcial_ads_0".equals(tag)) {
            return new RowCommertcialAdsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for row_commertcial_ads is invalid. Received: " + tag);
        }
        case  LAYOUT_ROWCOMMERTCIALESTATE: {
          if ("layout/row_commertcial_estate_0".equals(tag)) {
            return new RowCommertcialEstateBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for row_commertcial_estate is invalid. Received: " + tag);
        }
        case  LAYOUT_ROWDISTINCTADVERTISMENT: {
          if ("layout/row_distinct_advertisment_0".equals(tag)) {
            return new RowDistinctAdvertismentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for row_distinct_advertisment is invalid. Received: " + tag);
        }
        case  LAYOUT_ROWFAVOURITE: {
          if ("layout/row_favourite_0".equals(tag)) {
            return new RowFavouriteBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for row_favourite is invalid. Received: " + tag);
        }
        case  LAYOUT_ROWHOUSINGADS: {
          if ("layout/row_housing_ads_0".equals(tag)) {
            return new RowHousingAdsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for row_housing_ads is invalid. Received: " + tag);
        }
        case  LAYOUT_ROWREALESTATEADS: {
          if ("layout/row_real_estate_ads_0".equals(tag)) {
            return new RowRealEstateAdsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for row_real_estate_ads is invalid. Received: " + tag);
        }
        case  LAYOUT_ROWSIMILARESTATE: {
          if ("layout/row_similar_estate_0".equals(tag)) {
            return new RowSimilarEstateBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for row_similar_estate is invalid. Received: " + tag);
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
    static final SparseArray<String> sKeys = new SparseArray<String>(3);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "item");
      sKeys.put(2, "onClickListener");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(14);

    static {
      sKeys.put("layout/dialog_deactivate_0", com.caravan.R.layout.dialog_deactivate);
      sKeys.put("layout/dialog_log_in_0", com.caravan.R.layout.dialog_log_in);
      sKeys.put("layout/dialog_log_out_0", com.caravan.R.layout.dialog_log_out);
      sKeys.put("layout/dialog_report_0", com.caravan.R.layout.dialog_report);
      sKeys.put("layout/item_banner_0", com.caravan.R.layout.item_banner);
      sKeys.put("layout/item_images_0", com.caravan.R.layout.item_images);
      sKeys.put("layout/row_apartment_features_0", com.caravan.R.layout.row_apartment_features);
      sKeys.put("layout/row_commertcial_ads_0", com.caravan.R.layout.row_commertcial_ads);
      sKeys.put("layout/row_commertcial_estate_0", com.caravan.R.layout.row_commertcial_estate);
      sKeys.put("layout/row_distinct_advertisment_0", com.caravan.R.layout.row_distinct_advertisment);
      sKeys.put("layout/row_favourite_0", com.caravan.R.layout.row_favourite);
      sKeys.put("layout/row_housing_ads_0", com.caravan.R.layout.row_housing_ads);
      sKeys.put("layout/row_real_estate_ads_0", com.caravan.R.layout.row_real_estate_ads);
      sKeys.put("layout/row_similar_estate_0", com.caravan.R.layout.row_similar_estate);
    }
  }
}
