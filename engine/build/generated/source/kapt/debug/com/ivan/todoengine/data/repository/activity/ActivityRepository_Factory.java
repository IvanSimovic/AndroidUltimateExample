// Generated by Dagger (https://dagger.dev).
package com.ivan.todoengine.data.repository.activity;

import com.ivan.todoengine.data.api.ActivityApi;
import com.ivan.todoengine.data.local.activity.ActivityDao;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ActivityRepository_Factory implements Factory<ActivityRepository> {
  private final Provider<ActivityDao> activityDaoProvider;

  private final Provider<ActivityApi> activityApiProvider;

  public ActivityRepository_Factory(Provider<ActivityDao> activityDaoProvider,
      Provider<ActivityApi> activityApiProvider) {
    this.activityDaoProvider = activityDaoProvider;
    this.activityApiProvider = activityApiProvider;
  }

  @Override
  public ActivityRepository get() {
    return newInstance(activityDaoProvider.get(), activityApiProvider.get());
  }

  public static ActivityRepository_Factory create(Provider<ActivityDao> activityDaoProvider,
      Provider<ActivityApi> activityApiProvider) {
    return new ActivityRepository_Factory(activityDaoProvider, activityApiProvider);
  }

  public static ActivityRepository newInstance(ActivityDao activityDao, ActivityApi activityApi) {
    return new ActivityRepository(activityDao, activityApi);
  }
}
