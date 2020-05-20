package com.ivan.androidultimateexample.databinding;
import com.ivan.androidultimateexample.R;
import com.ivan.androidultimateexample.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityItemBindingImpl extends ActivityItemBinding implements com.ivan.androidultimateexample.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imgClock, 6);
        sViewsWithIds.put(R.id.imgLocation, 7);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private ActivityItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[6]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[1]
            );
        this.lblDate.setTag(null);
        this.lblDescription.setTag(null);
        this.lblHost.setTag(null);
        this.lblLocation.setTag(null);
        this.lblTitle.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.ivan.androidultimateexample.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.rowModel == variableId) {
            setRowModel((com.ivan.androidultimateexample.ui.main.activities.list.ActivityModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setRowModel(@Nullable com.ivan.androidultimateexample.ui.main.activities.list.ActivityModel RowModel) {
        this.mRowModel = RowModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.rowModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        java.lang.String rowModelDescription = null;
        java.lang.String rowModelTitle = null;
        java.lang.String rowModelHost = null;
        com.ivan.androidultimateexample.ui.main.activities.list.ActivityModel rowModel = mRowModel;
        org.threeten.bp.LocalDateTime rowModelDate = null;
        java.lang.String rowModelLocation = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (rowModel != null) {
                    // read rowModel.description
                    rowModelDescription = rowModel.getDescription();
                    // read rowModel.title
                    rowModelTitle = rowModel.getTitle();
                    // read rowModel.host
                    rowModelHost = rowModel.getHost();
                    // read rowModel.date
                    rowModelDate = rowModel.getDate();
                    // read rowModel.location
                    rowModelLocation = rowModel.getLocation();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.ivan.androidultimateexample.ui.util.DatabindingUtilKt.setText(this.lblDate, rowModelDate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.lblDescription, rowModelDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.lblHost, rowModelHost);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.lblLocation, rowModelLocation);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.lblTitle, rowModelTitle);
        }
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback1);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // rowModel
        com.ivan.androidultimateexample.ui.main.activities.list.ActivityModel rowModel = mRowModel;
        // rowModel != null
        boolean rowModelJavaLangObjectNull = false;



        rowModelJavaLangObjectNull = (rowModel) != (null);
        if (rowModelJavaLangObjectNull) {


            rowModel.onClick();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): rowModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}