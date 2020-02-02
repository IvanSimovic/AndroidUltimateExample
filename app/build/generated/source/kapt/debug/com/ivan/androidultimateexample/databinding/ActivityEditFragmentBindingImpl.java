package com.ivan.androidultimateexample.databinding;
import com.ivan.androidultimateexample.R;
import com.ivan.androidultimateexample.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityEditFragmentBindingImpl extends ActivityEditFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.txtDate, 6);
        sViewsWithIds.put(R.id.btnSave, 7);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener txtCategoryandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.activity.getValue().category
            //         is viewModel.activity.getValue().setCategory((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(txtCategory);
            // localize variables for thread safety
            // viewModel.activity.getValue()
            com.ivan.todoengine.logic.task.Activity viewModelActivityGetValue = null;
            // viewModel.activity.getValue().category
            java.lang.String viewModelActivityCategory = null;
            // viewModel.activity.getValue() != null
            boolean viewModelActivityGetValueJavaLangObjectNull = false;
            // viewModel.activity != null
            boolean viewModelActivityJavaLangObjectNull = false;
            // viewModel
            com.ivan.androidultimateexample.ui.main.activities.ActivityEditViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.activity
            androidx.lifecycle.MutableLiveData<com.ivan.todoengine.logic.task.Activity> viewModelActivity = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelActivity = viewModel.getActivity();

                viewModelActivityJavaLangObjectNull = (viewModelActivity) != (null);
                if (viewModelActivityJavaLangObjectNull) {


                    viewModelActivityGetValue = viewModelActivity.getValue();

                    viewModelActivityGetValueJavaLangObjectNull = (viewModelActivityGetValue) != (null);
                    if (viewModelActivityGetValueJavaLangObjectNull) {




                        viewModelActivityGetValue.setCategory(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener txtCityandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.activity.getValue().city
            //         is viewModel.activity.getValue().setCity((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(txtCity);
            // localize variables for thread safety
            // viewModel.activity.getValue().city
            java.lang.String viewModelActivityCity = null;
            // viewModel.activity.getValue()
            com.ivan.todoengine.logic.task.Activity viewModelActivityGetValue = null;
            // viewModel.activity.getValue() != null
            boolean viewModelActivityGetValueJavaLangObjectNull = false;
            // viewModel.activity != null
            boolean viewModelActivityJavaLangObjectNull = false;
            // viewModel
            com.ivan.androidultimateexample.ui.main.activities.ActivityEditViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.activity
            androidx.lifecycle.MutableLiveData<com.ivan.todoengine.logic.task.Activity> viewModelActivity = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelActivity = viewModel.getActivity();

                viewModelActivityJavaLangObjectNull = (viewModelActivity) != (null);
                if (viewModelActivityJavaLangObjectNull) {


                    viewModelActivityGetValue = viewModelActivity.getValue();

                    viewModelActivityGetValueJavaLangObjectNull = (viewModelActivityGetValue) != (null);
                    if (viewModelActivityGetValueJavaLangObjectNull) {




                        viewModelActivityGetValue.setCity(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener txtDescriptionandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.activity.getValue().description
            //         is viewModel.activity.getValue().setDescription((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(txtDescription);
            // localize variables for thread safety
            // viewModel.activity.getValue()
            com.ivan.todoengine.logic.task.Activity viewModelActivityGetValue = null;
            // viewModel.activity.getValue() != null
            boolean viewModelActivityGetValueJavaLangObjectNull = false;
            // viewModel.activity != null
            boolean viewModelActivityJavaLangObjectNull = false;
            // viewModel
            com.ivan.androidultimateexample.ui.main.activities.ActivityEditViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.activity
            androidx.lifecycle.MutableLiveData<com.ivan.todoengine.logic.task.Activity> viewModelActivity = null;
            // viewModel.activity.getValue().description
            java.lang.String viewModelActivityDescription = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelActivity = viewModel.getActivity();

                viewModelActivityJavaLangObjectNull = (viewModelActivity) != (null);
                if (viewModelActivityJavaLangObjectNull) {


                    viewModelActivityGetValue = viewModelActivity.getValue();

                    viewModelActivityGetValueJavaLangObjectNull = (viewModelActivityGetValue) != (null);
                    if (viewModelActivityGetValueJavaLangObjectNull) {




                        viewModelActivityGetValue.setDescription(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener txtTitleandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.activity.getValue().title
            //         is viewModel.activity.getValue().setTitle((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(txtTitle);
            // localize variables for thread safety
            // viewModel.activity.getValue().title
            java.lang.String viewModelActivityTitle = null;
            // viewModel.activity.getValue()
            com.ivan.todoengine.logic.task.Activity viewModelActivityGetValue = null;
            // viewModel.activity.getValue() != null
            boolean viewModelActivityGetValueJavaLangObjectNull = false;
            // viewModel.activity != null
            boolean viewModelActivityJavaLangObjectNull = false;
            // viewModel
            com.ivan.androidultimateexample.ui.main.activities.ActivityEditViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.activity
            androidx.lifecycle.MutableLiveData<com.ivan.todoengine.logic.task.Activity> viewModelActivity = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelActivity = viewModel.getActivity();

                viewModelActivityJavaLangObjectNull = (viewModelActivity) != (null);
                if (viewModelActivityJavaLangObjectNull) {


                    viewModelActivityGetValue = viewModelActivity.getValue();

                    viewModelActivityGetValueJavaLangObjectNull = (viewModelActivityGetValue) != (null);
                    if (viewModelActivityGetValueJavaLangObjectNull) {




                        viewModelActivityGetValue.setTitle(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener txtVenueandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.activity.getValue().venue
            //         is viewModel.activity.getValue().setVenue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(txtVenue);
            // localize variables for thread safety
            // viewModel.activity.getValue()
            com.ivan.todoengine.logic.task.Activity viewModelActivityGetValue = null;
            // viewModel.activity.getValue().venue
            java.lang.String viewModelActivityVenue = null;
            // viewModel.activity.getValue() != null
            boolean viewModelActivityGetValueJavaLangObjectNull = false;
            // viewModel.activity != null
            boolean viewModelActivityJavaLangObjectNull = false;
            // viewModel
            com.ivan.androidultimateexample.ui.main.activities.ActivityEditViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.activity
            androidx.lifecycle.MutableLiveData<com.ivan.todoengine.logic.task.Activity> viewModelActivity = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelActivity = viewModel.getActivity();

                viewModelActivityJavaLangObjectNull = (viewModelActivity) != (null);
                if (viewModelActivityJavaLangObjectNull) {


                    viewModelActivityGetValue = viewModelActivity.getValue();

                    viewModelActivityGetValueJavaLangObjectNull = (viewModelActivityGetValue) != (null);
                    if (viewModelActivityGetValueJavaLangObjectNull) {




                        viewModelActivityGetValue.setVenue(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };

    public ActivityEditFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private ActivityEditFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.Button) bindings[7]
            , (android.widget.EditText) bindings[3]
            , (android.widget.EditText) bindings[4]
            , (android.widget.EditText) bindings[6]
            , (android.widget.EditText) bindings[2]
            , (android.widget.EditText) bindings[1]
            , (android.widget.EditText) bindings[5]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.txtCategory.setTag(null);
        this.txtCity.setTag(null);
        this.txtDescription.setTag(null);
        this.txtTitle.setTag(null);
        this.txtVenue.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.viewModel == variableId) {
            setViewModel((com.ivan.androidultimateexample.ui.main.activities.ActivityEditViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.ivan.androidultimateexample.ui.main.activities.ActivityEditViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelActivity((androidx.lifecycle.MutableLiveData<com.ivan.todoengine.logic.task.Activity>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelActivity(androidx.lifecycle.MutableLiveData<com.ivan.todoengine.logic.task.Activity> ViewModelActivity, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
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
        java.lang.String viewModelActivityTitle = null;
        java.lang.String viewModelActivityCity = null;
        androidx.lifecycle.MutableLiveData<com.ivan.todoengine.logic.task.Activity> viewModelActivity = null;
        java.lang.String viewModelActivityDescription = null;
        java.lang.String viewModelActivityVenue = null;
        com.ivan.todoengine.logic.task.Activity viewModelActivityGetValue = null;
        java.lang.String viewModelActivityCategory = null;
        com.ivan.androidultimateexample.ui.main.activities.ActivityEditViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.activity
                    viewModelActivity = viewModel.getActivity();
                }
                updateLiveDataRegistration(0, viewModelActivity);


                if (viewModelActivity != null) {
                    // read viewModel.activity.getValue()
                    viewModelActivityGetValue = viewModelActivity.getValue();
                }


                if (viewModelActivityGetValue != null) {
                    // read viewModel.activity.getValue().title
                    viewModelActivityTitle = viewModelActivityGetValue.getTitle();
                    // read viewModel.activity.getValue().city
                    viewModelActivityCity = viewModelActivityGetValue.getCity();
                    // read viewModel.activity.getValue().description
                    viewModelActivityDescription = viewModelActivityGetValue.getDescription();
                    // read viewModel.activity.getValue().venue
                    viewModelActivityVenue = viewModelActivityGetValue.getVenue();
                    // read viewModel.activity.getValue().category
                    viewModelActivityCategory = viewModelActivityGetValue.getCategory();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtCategory, viewModelActivityCategory);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtCity, viewModelActivityCity);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtDescription, viewModelActivityDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtTitle, viewModelActivityTitle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtVenue, viewModelActivityVenue);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.txtCategory, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, txtCategoryandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.txtCity, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, txtCityandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.txtDescription, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, txtDescriptionandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.txtTitle, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, txtTitleandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.txtVenue, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, txtVenueandroidTextAttrChanged);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.activity
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}