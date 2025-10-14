package com.blackhub.bronline.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewDataBindingKtx;
import com.blackhub.bronline.game.core.utils.ViewDataBindingAdaptersKt;
import com.blackhub.bronline.game.gui.taximap.TaxiMapUiState;
import com.blackhub.bronline.game.gui.taximap.TaxiMapViewModel;
import com.blackhub.bronline.generated.callback.OnClickListener;
import com.bless.client.R;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes3.dex */
public class FragmentTaxiMapBindingImpl extends FragmentTaxiMapBinding implements OnClickListener.Listener {

    @Nullable
    public static final ViewDataBinding.IncludedLayouts sIncludes = null;

    @Nullable
    public static final SparseIntArray sViewsWithIds;

    @Nullable
    public final View.OnClickListener mCallback11;

    @Nullable
    public final View.OnClickListener mCallback12;
    public long mDirtyFlags;

    @NonNull
    public final FrameLayout mboundView0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.br_taxi_map_map, 3);
        sparseIntArray.put(R.id.br_taxi_map_dest, 4);
    }

    public FragmentTaxiMapBindingImpl(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }

    public FragmentTaxiMapBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1, (ImageView) bindings[4], (Button) bindings[2], (RelativeLayout) bindings[3], (Button) bindings[1]);
        this.mDirtyFlags = -1L;
        this.brTaxiMapExit.setTag(null);
        this.brTaxiMapSelect.setTag(null);
        FrameLayout frameLayout = (FrameLayout) bindings[0];
        this.mboundView0 = frameLayout;
        frameLayout.setTag(null);
        setRootTag(root);
        this.mCallback12 = new OnClickListener(this, 2);
        this.mCallback11 = new OnClickListener(this, 1);
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
        if (2 != variableId) {
            return false;
        }
        setVm((TaxiMapViewModel) variable);
        return true;
    }

    @Override // com.blackhub.bronline.databinding.FragmentTaxiMapBinding
    public void setVm(@Nullable TaxiMapViewModel Vm) {
        this.mVm = Vm;
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        notifyPropertyChanged(2);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        if (localFieldId != 0) {
            return false;
        }
        return onChangeVmUiState((StateFlow) object, fieldId);
    }

    private boolean onChangeVmUiState(StateFlow<TaxiMapUiState> VmUiState, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0033  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void executeBindings() {
        long j;
        float buttonAlpha;
        boolean zIsButtonEnabled;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        TaxiMapViewModel taxiMapViewModel = this.mVm;
        long j2 = 7 & j;
        if (j2 == 0) {
            buttonAlpha = 0.0f;
            zIsButtonEnabled = false;
        } else {
            StateFlow<TaxiMapUiState> uiState = taxiMapViewModel != null ? taxiMapViewModel.getUiState() : null;
            ViewDataBindingKtx.updateStateFlowRegistration(this, 0, uiState);
            TaxiMapUiState value = uiState != null ? uiState.getValue() : null;
            if (value != null) {
                buttonAlpha = value.getButtonAlpha();
                zIsButtonEnabled = value.isButtonEnabled();
            }
        }
        if ((j & 4) != 0) {
            ViewDataBindingAdaptersKt.setOnClickListenerWithAnimate(this.brTaxiMapExit, this.mCallback12, null);
            ViewDataBindingAdaptersKt.setOnClickListenerWithAnimate(this.brTaxiMapSelect, this.mCallback11, null);
        }
        if (j2 != 0) {
            if (ViewDataBinding.getBuildSdkInt() >= 11) {
                this.brTaxiMapSelect.setAlpha(buttonAlpha);
            }
            this.brTaxiMapSelect.setEnabled(zIsButtonEnabled);
        }
    }

    @Override // com.blackhub.bronline.generated.callback.OnClickListener.Listener
    public final void _internalCallbackOnClick(int sourceId, View callbackArg_0) {
        StateFlow<TaxiMapUiState> uiState;
        TaxiMapUiState value;
        TaxiMapViewModel taxiMapViewModel;
        if (sourceId != 1) {
            if (sourceId == 2 && (taxiMapViewModel = this.mVm) != null) {
                taxiMapViewModel.sendCloseScreen();
                return;
            }
            return;
        }
        TaxiMapViewModel taxiMapViewModel2 = this.mVm;
        if (taxiMapViewModel2 == null || (uiState = taxiMapViewModel2.getUiState()) == null || (value = uiState.getValue()) == null) {
            return;
        }
        taxiMapViewModel2.sendCoordinates(value.getCoordinateX(), value.getCoordinateY());
    }
}
