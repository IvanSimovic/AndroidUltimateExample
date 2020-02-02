// Generated by Dagger (https://dagger.dev).
package com.ivan.todoengine.data.store;

import dagger.internal.Factory;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class InMemoryKeyValueStore_Factory implements Factory<InMemoryKeyValueStore> {
  @Override
  public InMemoryKeyValueStore get() {
    return newInstance();
  }

  public static InMemoryKeyValueStore_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static InMemoryKeyValueStore newInstance() {
    return new InMemoryKeyValueStore();
  }

  private static final class InstanceHolder {
    private static final InMemoryKeyValueStore_Factory INSTANCE = new InMemoryKeyValueStore_Factory();
  }
}
