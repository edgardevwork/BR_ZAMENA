package com.blackhub.bronline.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.p003ui.platform.ComposeView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewDataBindingKtx;
import com.blackhub.bronline.game.core.utils.ViewDataBindingAdaptersKt;
import com.blackhub.bronline.game.gui.tutorialhints.TutorialUiState;
import com.blackhub.bronline.game.gui.tutorialhints.TutorialViewModel;
import com.bless.client.R;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes3.dex */
public class FragmentTutorialGuiBindingImpl extends FragmentTutorialGuiBinding {

    @Nullable
    public static final ViewDataBinding.IncludedLayouts sIncludes = null;

    @Nullable
    public static final SparseIntArray sViewsWithIds;
    public long mDirtyFlags;

    @NonNull
    public final FrameLayout mboundView1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.inTutorialHintBottom, 3);
        sparseIntArray.put(R.id.inTutorialUncleCall, 4);
        sparseIntArray.put(R.id.inTutorialHintDrivingSchool, 5);
    }

    public FragmentTutorialGuiBindingImpl(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FragmentTutorialGuiBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        FrameLayout frameLayout = (FrameLayout) bindings[0];
        ComposeView composeView = (ComposeView) bindings[2];
        Object obj = bindings[3];
        HintBottomBinding hintBottomBindingBind = obj != null ? HintBottomBinding.bind((View) obj) : null;
        Object obj2 = bindings[5];
        HintDrivingSchoolBinding hintDrivingSchoolBindingBind = obj2 != null ? HintDrivingSchoolBinding.bind((View) obj2) : null;
        Object obj3 = bindings[4];
        super(bindingComponent, root, 1, frameLayout, composeView, hintBottomBindingBind, hintDrivingSchoolBindingBind, obj3 != null ? UncleCallBinding.bind((View) obj3) : null);
        this.mDirtyFlags = -1L;
        this.constraintLayout.setTag(null);
        this.cvTutorial.setTag(null);
        FrameLayout frameLayout2 = (FrameLayout) bindings[1];
        this.mboundView1 = frameLayout2;
        frameLayout2.setTag(null);
        setRootTag(root);
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
        setVm((TutorialViewModel) variable);
        return true;
    }

    @Override // com.blackhub.bronline.databinding.FragmentTutorialGuiBinding
    public void setVm(@Nullable TutorialViewModel Vm) {
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

    private boolean onChangeVmUiState(StateFlow<TutorialUiState> VmUiState, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        boolean z;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        TutorialViewModel tutorialViewModel = this.mVm;
        long j2 = j & 7;
        if (j2 != 0) {
            StateFlow<TutorialUiState> uiState = tutorialViewModel != null ? tutorialViewModel.getUiState() : null;
            ViewDataBindingKtx.updateStateFlowRegistration(this, 0, uiState);
            TutorialUiState value = uiState != null ? uiState.getValue() : null;
            zIsNewVersionVisible = value != null ? value.isNewVersionVisible() : false;
            z = !zIsNewVersionVisible;
        } else {
            z = false;
        }
        if (j2 != 0) {
            ViewDataBindingAdaptersKt.setVisible(this.cvTutorial, zIsNewVersionVisible);
            ViewDataBindingAdaptersKt.setVisible(this.mboundView1, z);
        }
    }
}
