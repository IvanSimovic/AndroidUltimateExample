package com.ivan.androidultimateexample.ui.main.activities;

import androidx.lifecycle.GeneratedAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MethodCallsLogger;
import java.lang.Override;

public class ActivitiesViewModel_LifecycleAdapter implements GeneratedAdapter {
  final ActivitiesViewModel mReceiver;

  ActivitiesViewModel_LifecycleAdapter(ActivitiesViewModel receiver) {
    this.mReceiver = receiver;
  }

  @Override
  public void callMethods(LifecycleOwner owner, Lifecycle.Event event, boolean onAny,
      MethodCallsLogger logger) {
    boolean hasLogger = logger != null;
    if (onAny) {
      return;
    }
    if (event == Lifecycle.Event.ON_RESUME) {
      if (!hasLogger || logger.approveCall("getActivities", 1)) {
        mReceiver.getActivities();
      }
      return;
    }
  }
}
