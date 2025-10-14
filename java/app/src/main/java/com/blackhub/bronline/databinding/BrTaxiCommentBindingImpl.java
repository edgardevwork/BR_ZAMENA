package com.blackhub.bronline.databinding;

import android.annotation.SuppressLint;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewDataBindingKtx;
import com.blackhub.bronline.game.core.utils.ViewDataBindingAdaptersKt;
import com.blackhub.bronline.game.gui.taxi.TaxiUiState;
import com.blackhub.bronline.game.gui.taxi.TaxiViewModel;
import com.blackhub.bronline.generated.callback.OnClickListener;
import com.bless.client.R;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes.dex */
@SuppressLint("RestrictedApi")
public class BrTaxiCommentBindingImpl extends BrTaxiCommentBinding implements OnClickListener.Listener {

    @Nullable
    public static final IncludedLayouts sIncludes = null;

    @Nullable
    public static final SparseIntArray sViewsWithIds;

    @Nullable
    public final View.OnClickListener mCallback6;
    public long mDirtyFlags;

    @NonNull
    public final FrameLayout mboundView0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.br_taxi_comment_title, 3);
    }

    public BrTaxiCommentBindingImpl(DataBindingComponent bindingComponent, View root) {//TODO: FIIIX
        this(bindingComponent, root, /*ViewDataBinding.mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds)*/ null);
    }

    public BrTaxiCommentBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1, (AppCompatButton) bindings[1], (TextView) bindings[2], (TextView) bindings[3]);
        this.mDirtyFlags = -1L;
        this.brTaxiCommentClose.setTag(null);
        this.brTaxiCommentComm.setTag(null);
        FrameLayout frameLayout = (FrameLayout) bindings[0];
        this.mboundView0 = frameLayout;
        frameLayout.setTag(null);
        setRootTag(root);
        this.mCallback6 = new OnClickListener(this, 1);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 4L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.mDirtyFlags != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        if (1 != variableId) {
            return false;
        }
        setData((TaxiViewModel) variable);
        return true;
    }

    @Override // com.blackhub.bronline.databinding.BrTaxiCommentBinding
    public void setData(@Nullable TaxiViewModel Data) {
        this.mData = Data;
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        notifyPropertyChanged(1);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        if (localFieldId != 0) {
            return false;
        }
        return onChangeDataUiState((StateFlow) object, fieldId);
    }

    public final boolean onChangeDataUiState(StateFlow<TaxiUiState> DataUiState, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x002f  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void executeBindings() {
        long j;
        String comment = "";
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        TaxiViewModel taxiViewModel = this.mData;
        long j2 = 7 & j;
        if (j2 == 0) {
            comment = null;
        } else {
            StateFlow<TaxiUiState> uiState = taxiViewModel != null ? taxiViewModel.getUiState() : null;
            ViewDataBindingKtx.updateStateFlowRegistration(this, 0, uiState);
            TaxiUiState value = uiState != null ? uiState.getValue() : null;
            if (value != null) {
                comment = value.getComment();
            }
        }
        if ((j & 4) != 0) {
            ViewDataBindingAdaptersKt.setOnClickListenerWithAnimate(this.brTaxiCommentClose, this.mCallback6, null);
        }
        if (j2 != 0) {
            this.brTaxiCommentComm.setText(comment);
        }
    }

    @Override // com.blackhub.bronline.generated.callback.OnClickListener.Listener
    public final void _internalCallbackOnClick(int sourceId, View callbackArg_0) {
        TaxiViewModel taxiViewModel = this.mData;
        if (taxiViewModel != null) {
            taxiViewModel.setCommentVisible(false);
        }
    }
}
