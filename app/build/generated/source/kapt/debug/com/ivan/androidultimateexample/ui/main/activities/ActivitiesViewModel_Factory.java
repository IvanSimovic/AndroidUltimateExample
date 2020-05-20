// Generated by Dagger (https://dagger.dev).
package com.ivan.androidultimateexample.ui.main.activities;

import com.ivan.todoengine.logic.activity.ActivityLogic;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ActivitiesViewModel_Factory implements Factory<ActivitiesViewModel> {
  private final Provider<ActivityLogic> activityLogicProvider;

  public ActivitiesViewModel_Factory(Provider<ActivityLogic> activityLogicProvider) {
    this.activityLogicProvider = activityLogicProvider;
  }

  @Override
  public ActivitiesViewModel get() {
    return newInstance(activityLogicProvider.get());
  }

  public static ActivitiesViewModel_Factory create(Provider<ActivityLogic> activityLogicProvider) {
    return new ActivitiesViewModel_Factory(activityLogicProvider);
  }

  public static ActivitiesViewModel newInstance(ActivityLogic activityLogic) {
    return new ActivitiesViewModel(activityLogic);
  }
}
