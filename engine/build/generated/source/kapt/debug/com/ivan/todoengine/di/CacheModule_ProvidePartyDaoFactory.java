// Generated by Dagger (https://dagger.dev).
package com.ivan.todoengine.di;

import com.ivan.todoengine.data.base.AppDatabase;
import com.ivan.todoengine.data.local.activity.ActivityDao;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CacheModule_ProvidePartyDaoFactory implements Factory<ActivityDao> {
  private final Provider<AppDatabase> appDatabaseProvider;

  public CacheModule_ProvidePartyDaoFactory(Provider<AppDatabase> appDatabaseProvider) {
    this.appDatabaseProvider = appDatabaseProvider;
  }

  @Override
  public ActivityDao get() {
    return providePartyDao(appDatabaseProvider.get());
  }

  public static CacheModule_ProvidePartyDaoFactory create(
      Provider<AppDatabase> appDatabaseProvider) {
    return new CacheModule_ProvidePartyDaoFactory(appDatabaseProvider);
  }

  public static ActivityDao providePartyDao(AppDatabase appDatabase) {
    return Preconditions.checkNotNull(CacheModule.providePartyDao(appDatabase), "Cannot return null from a non-@Nullable @Provides method");
  }
}
