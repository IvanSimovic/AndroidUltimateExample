package com.ivan.androidultimateexample.databinding;
import com.ivan.androidultimateexample.R;
import com.ivan.androidultimateexample.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityDetailsFragmentBindingImpl extends ActivityDetailsFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.lblHost, 5);
        sViewsWithIds.put(R.id.imgInfo, 6);
        sViewsWithIds.put(R.id.imgDate, 7);
        sViewsWithIds.put(R.id.imgLocation, 8);
        sViewsWithIds.put(R.id.btnDelete, 9);
        sViewsWithIds.put(R.id.btnEdit, 10);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityDetailsFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private ActivityDetailsFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.Button) bindings[9]
            , (android.widget.Button) bindings[10]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[1]
            );
        this.lblDescription.setTag(null);
        this.lblDescriptionDate.setTag(null);
        this.lblLocation.setTag(null);
        this.lblTitle.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
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
            setViewModel((com.ivan.androidultimateexample.ui.main.activities.ActivityDetailsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.ivan.androidultimateexample.ui.main.activities.ActivityDetailsViewModel ViewModel) {
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
                return onChangeViewModelActivity((androidx.lifecycle.MutableLiveData<com.ivan.todoengine.logic.activity.Activity>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelActivity(androidx.lifecycle.MutableLiveData<com.ivan.todoengine.logic.activity.Activity> ViewModelActivity, int fieldId) {
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
        com.ivan.todoengine.logic.activity.Activity viewModelActivityGetValue = null;
        org.threeten.bp.LocalDateTime viewModelActivityDate = null;
        java.lang.String viewModelActivityLocation = null;
        androidx.lifecycle.MutableLiveData<com.ivan.todoengine.logic.activity.Activity> viewModelActivity = null;
        java.lang.String viewModelActivityDescription = null;
        com.ivan.androidultimateexample.ui.main.activities.ActivityDetailsViewModel viewModel = mViewModel;

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
                    // read viewModel.activity.getValue().date
                    viewModelActivityDate = viewModelActivityGetValue.getDate();
                    // read viewModel.activity.getValue().location()
                    viewModelActivityLocation = viewModelActivityGetValue.location();
                    // read viewModel.activity.getValue().description
                    viewModelActivityDescription = viewModelActivityGetValue.getDescription();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.lblDescription, viewModelActivityDescription);
            com.ivan.androidultimateexample.ui.util.DatabindingUtilKt.setText(this.lblDescriptionDate, viewModelActivityDate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.lblLocation, viewModelActivityLocation);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.lblTitle, viewModelActivityTitle);
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