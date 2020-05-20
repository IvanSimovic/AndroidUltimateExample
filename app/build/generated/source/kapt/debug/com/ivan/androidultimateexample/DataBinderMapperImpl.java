package com.ivan.androidultimateexample;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.ivan.androidultimateexample.databinding.ActivitiesFragmentBindingImpl;
import com.ivan.androidultimateexample.databinding.ActivityCreateFragmentBindingImpl;
import com.ivan.androidultimateexample.databinding.ActivityDetailsFragmentBindingImpl;
import com.ivan.androidultimateexample.databinding.ActivityEditFragmentBindingImpl;
import com.ivan.androidultimateexample.databinding.ActivityItemBindingImpl;
import com.ivan.androidultimateexample.databinding.FragmentSettingsBindingImpl;
import com.ivan.androidultimateexample.databinding.LoginFragmentBindingImpl;
import com.ivan.androidultimateexample.databinding.ToolbarBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITIESFRAGMENT = 1;

  private static final int LAYOUT_ACTIVITYCREATEFRAGMENT = 2;

  private static final int LAYOUT_ACTIVITYDETAILSFRAGMENT = 3;

  private static final int LAYOUT_ACTIVITYEDITFRAGMENT = 4;

  private static final int LAYOUT_ACTIVITYITEM = 5;

  private static final int LAYOUT_FRAGMENTSETTINGS = 6;

  private static final int LAYOUT_LOGINFRAGMENT = 7;

  private static final int LAYOUT_TOOLBAR = 8;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(8);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ivan.androidultimateexample.R.layout.activities_fragment, LAYOUT_ACTIVITIESFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ivan.androidultimateexample.R.layout.activity_create_fragment, LAYOUT_ACTIVITYCREATEFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ivan.androidultimateexample.R.layout.activity_details_fragment, LAYOUT_ACTIVITYDETAILSFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ivan.androidultimateexample.R.layout.activity_edit_fragment, LAYOUT_ACTIVITYEDITFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ivan.androidultimateexample.R.layout.activity_item, LAYOUT_ACTIVITYITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ivan.androidultimateexample.R.layout.fragment_settings, LAYOUT_FRAGMENTSETTINGS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ivan.androidultimateexample.R.layout.login_fragment, LAYOUT_LOGINFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ivan.androidultimateexample.R.layout.toolbar, LAYOUT_TOOLBAR);
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
        case  LAYOUT_ACTIVITIESFRAGMENT: {
          if ("layout/activities_fragment_0".equals(tag)) {
            return new ActivitiesFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activities_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYCREATEFRAGMENT: {
          if ("layout/activity_create_fragment_0".equals(tag)) {
            return new ActivityCreateFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_create_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYDETAILSFRAGMENT: {
          if ("layout/activity_details_fragment_0".equals(tag)) {
            return new ActivityDetailsFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_details_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYEDITFRAGMENT: {
          if ("layout/activity_edit_fragment_0".equals(tag)) {
            return new ActivityEditFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_edit_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYITEM: {
          if ("layout/activity_item_0".equals(tag)) {
            return new ActivityItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_item is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSETTINGS: {
          if ("layout/fragment_settings_0".equals(tag)) {
            return new FragmentSettingsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_settings is invalid. Received: " + tag);
        }
        case  LAYOUT_LOGINFRAGMENT: {
          if ("layout/login_fragment_0".equals(tag)) {
            return new LoginFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for login_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_TOOLBAR: {
          if ("layout/toolbar_0".equals(tag)) {
            return new ToolbarBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for toolbar is invalid. Received: " + tag);
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
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(4);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "rowModel");
      sKeys.put(2, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(8);

    static {
      sKeys.put("layout/activities_fragment_0", com.ivan.androidultimateexample.R.layout.activities_fragment);
      sKeys.put("layout/activity_create_fragment_0", com.ivan.androidultimateexample.R.layout.activity_create_fragment);
      sKeys.put("layout/activity_details_fragment_0", com.ivan.androidultimateexample.R.layout.activity_details_fragment);
      sKeys.put("layout/activity_edit_fragment_0", com.ivan.androidultimateexample.R.layout.activity_edit_fragment);
      sKeys.put("layout/activity_item_0", com.ivan.androidultimateexample.R.layout.activity_item);
      sKeys.put("layout/fragment_settings_0", com.ivan.androidultimateexample.R.layout.fragment_settings);
      sKeys.put("layout/login_fragment_0", com.ivan.androidultimateexample.R.layout.login_fragment);
      sKeys.put("layout/toolbar_0", com.ivan.androidultimateexample.R.layout.toolbar);
    }
  }
}
