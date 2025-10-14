package com.blackhub.bronline.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewDataBindingKtx;
import com.blackhub.bronline.game.core.utils.ViewDataBindingAdaptersKt;
import com.blackhub.bronline.game.gui.electric.state.ChangeBulbUiState;
import com.blackhub.bronline.game.gui.electric.view.CircleView;
import com.blackhub.bronline.game.gui.electric.viewmodel.ChangeBulbViewModel;
import com.blackhub.bronline.generated.callback.OnClickListener;
import com.bless.client.R;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes3.dex */
public class FragmentChangeBulbBindingImpl extends FragmentChangeBulbBinding implements OnClickListener.Listener {

    @Nullable
    public static final ViewDataBinding.IncludedLayouts sIncludes = null;

    @Nullable
    public static final SparseIntArray sViewsWithIds;

    @Nullable
    public final View.OnClickListener mCallback18;

    @Nullable
    public final View.OnClickListener mCallback19;

    @Nullable
    public final View.OnClickListener mCallback20;
    public long mDirtyFlags;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.tvChangeBulbTitle, 11);
        sparseIntArray.put(R.id.tvChangeBulbHelp, 12);
        sparseIntArray.put(R.id.blockChangeBulbRight, 13);
        sparseIntArray.put(R.id.cvChangeBulbGlassBig, 14);
        sparseIntArray.put(R.id.cvChangeBulbGlassSmall, 15);
        sparseIntArray.put(R.id.ivChangeBulbLeg, 16);
        sparseIntArray.put(R.id.ivChangeBulbNeck, 17);
    }

    public FragmentChangeBulbBindingImpl(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 18, sIncludes, sViewsWithIds));
    }

    public FragmentChangeBulbBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1, (FrameLayout) bindings[6], (FrameLayout) bindings[1], (LinearLayout) bindings[7], (View) bindings[13], (ImageButton) bindings[5], (ImageButton) bindings[8], (TextView) bindings[9], (ConstraintLayout) bindings[0], (CircleView) bindings[14], (CircleView) bindings[15], (Group) bindings[10], (AppCompatImageView) bindings[3], (AppCompatImageView) bindings[4], (AppCompatImageView) bindings[2], (AppCompatImageView) bindings[16], (AppCompatImageView) bindings[17], (TextView) bindings[12], (TextView) bindings[11]);
        this.mDirtyFlags = -1L;
        this.blockChangeBulbDark.setTag(null);
        this.blockChangeBulbElementOne.setTag(null);
        this.blockChangeBulbHint.setTag(null);
        this.btnChangeBulbHint.setTag(null);
        this.btnChangeBulbHintClose.setTag(null);
        this.btnChangeBulbHintDesc.setTag(null);
        this.constraintLayout.setTag(null);
        this.groupChangeBulb.setTag(null);
        this.ivChangeBulbBulbBroke.setTag(null);
        this.ivChangeBulbBulbFull.setTag(null);
        this.ivChangeBulbElementOne.setTag(null);
        setRootTag(root);
        this.mCallback19 = new OnClickListener(this, 2);
        this.mCallback20 = new OnClickListener(this, 3);
        this.mCallback18 = new OnClickListener(this, 1);
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
        setVm((ChangeBulbViewModel) variable);
        return true;
    }

    @Override // com.blackhub.bronline.databinding.FragmentChangeBulbBinding
    public void setVm(@Nullable ChangeBulbViewModel Vm) {
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

    public final boolean onChangeVmUiState(StateFlow<ChangeBulbUiState> VmUiState, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0047  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void executeBindings() {
        long j;
        float elevationHint;
        boolean zIsBulbBrokeVisible;
        boolean zIsBulbFullVisible;
        boolean zIsHintBtnCloseVisible;
        String hintText;
        float elevationBulbFull;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        ChangeBulbViewModel changeBulbViewModel = this.mVm;
        long j2 = 7 & j;
        boolean zIsHintShow = false;
        if (j2 == 0) {
            elevationHint = 0.0f;
            zIsBulbBrokeVisible = false;
            zIsBulbFullVisible = false;
            zIsHintBtnCloseVisible = false;
            hintText = null;
            elevationBulbFull = 0.0f;
        } else {
            StateFlow<ChangeBulbUiState> uiState = changeBulbViewModel != null ? changeBulbViewModel.getUiState() : null;
            ViewDataBindingKtx.updateStateFlowRegistration(this, 0, uiState);
            ChangeBulbUiState value = uiState != null ? uiState.getValue() : null;
            if (value != null) {
                zIsHintShow = value.isHintShow();
                zIsBulbBrokeVisible = value.isBulbBrokeVisible();
                hintText = value.getHintText();
                zIsBulbFullVisible = value.isBulbFullVisible();
                elevationHint = value.getElevationHint();
                zIsHintBtnCloseVisible = value.isHintBtnCloseVisible();
                elevationBulbFull = value.getElevationBulbFull();
            }
        }
        if (j2 != 0) {
            ViewDataBindingAdaptersKt.setVisible(this.blockChangeBulbDark, zIsHintShow);
            ViewDataBindingAdaptersKt.setElevation(this.blockChangeBulbElementOne, elevationBulbFull);
            ViewDataBindingAdaptersKt.setVisible(this.blockChangeBulbHint, zIsHintShow);
            ViewDataBindingAdaptersKt.setVisible(this.btnChangeBulbHintClose, zIsHintBtnCloseVisible);
            ViewDataBindingAdaptersKt.setTextHtml(this.btnChangeBulbHintDesc, hintText);
            ViewDataBindingAdaptersKt.setElevation(this.groupChangeBulb, elevationHint);
            ViewDataBindingAdaptersKt.setVisible(this.ivChangeBulbBulbBroke, zIsBulbBrokeVisible);
            ViewDataBindingAdaptersKt.setElevation(this.ivChangeBulbBulbFull, elevationBulbFull);
            ViewDataBindingAdaptersKt.setVisible(this.ivChangeBulbBulbFull, zIsBulbFullVisible);
            ViewDataBindingAdaptersKt.setElevation(this.ivChangeBulbElementOne, elevationBulbFull);
        }
        if ((j & 4) != 0) {
            if (ViewDataBinding.getBuildSdkInt() >= 4) {
                this.btnChangeBulbHint.setContentDescription(null);
                this.btnChangeBulbHintClose.setContentDescription(null);
            }
            ViewDataBindingAdaptersKt.setOnClickListenerWithAnimate(this.btnChangeBulbHint, this.mCallback19, null);
            ViewDataBindingAdaptersKt.setOnClickListenerWithAnimate(this.btnChangeBulbHintClose, this.mCallback20, null);
            ViewDataBindingAdaptersKt.setOnClickListener(this.ivChangeBulbBulbBroke, this.mCallback18, null);
        }
    }

    @Override // com.blackhub.bronline.generated.callback.OnClickListener.Listener
    public final void _internalCallbackOnClick(int sourceId, View callbackArg_0) {
        ChangeBulbViewModel changeBulbViewModel;
        if (sourceId == 1) {
            ChangeBulbViewModel changeBulbViewModel2 = this.mVm;
            if (changeBulbViewModel2 != null) {
                changeBulbViewModel2.setBulbBrokeInvisible();
                return;
            }
            return;
        }
        if (sourceId != 2) {
            if (sourceId == 3 && (changeBulbViewModel = this.mVm) != null) {
                changeBulbViewModel.closeHint();
                return;
            }
            return;
        }
        ChangeBulbViewModel changeBulbViewModel3 = this.mVm;
        if (changeBulbViewModel3 != null) {
            changeBulbViewModel3.showHint();
        }
    }
}
