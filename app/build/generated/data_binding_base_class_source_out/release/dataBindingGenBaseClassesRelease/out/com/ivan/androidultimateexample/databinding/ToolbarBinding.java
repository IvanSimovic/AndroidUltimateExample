// Generated by data binding compiler. Do not edit!
package com.ivan.androidultimateexample.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.ivan.androidultimateexample.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ToolbarBinding extends ViewDataBinding {
  @NonNull
  public final FrameLayout btnLeft;

  @NonNull
  public final FrameLayout btnRight;

  @NonNull
  public final ImageView imgLeftIcon;

  @NonNull
  public final ImageView imgRightIcon;

  @NonNull
  public final ConstraintLayout toolbarRoot;

  @NonNull
  public final TextView txtTitle;

  protected ToolbarBinding(Object _bindingComponent, View _root, int _localFieldCount,
      FrameLayout btnLeft, FrameLayout btnRight, ImageView imgLeftIcon, ImageView imgRightIcon,
      ConstraintLayout toolbarRoot, TextView txtTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnLeft = btnLeft;
    this.btnRight = btnRight;
    this.imgLeftIcon = imgLeftIcon;
    this.imgRightIcon = imgRightIcon;
    this.toolbarRoot = toolbarRoot;
    this.txtTitle = txtTitle;
  }

  @NonNull
  public static ToolbarBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.toolbar, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ToolbarBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ToolbarBinding>inflateInternal(inflater, R.layout.toolbar, root, attachToRoot, component);
  }

  @NonNull
  public static ToolbarBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.toolbar, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ToolbarBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ToolbarBinding>inflateInternal(inflater, R.layout.toolbar, null, false, component);
  }

  public static ToolbarBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ToolbarBinding bind(@NonNull View view, @Nullable Object component) {
    return (ToolbarBinding)bind(component, view, R.layout.toolbar);
  }
}