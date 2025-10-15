package com.blackhub.bronline.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewDataBindingKtx;
import com.blackhub.bronline.game.core.utils.ViewDataBindingAdaptersKt;
import com.blackhub.bronline.game.gui.electric.state.CollectSchemeUiState;
import com.blackhub.bronline.game.gui.electric.viewmodel.CollectSchemeViewModel;
import com.blackhub.bronline.generated.callback.OnClickListener;
import com.bless.client.R;
import com.google.android.material.divider.MaterialDivider;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes3.dex */
public class FragmentCollectSchemeBindingImpl extends FragmentCollectSchemeBinding implements OnClickListener.Listener {

    @Nullable
    public static final ViewDataBinding.IncludedLayouts sIncludes = null;

    @Nullable
    public static final SparseIntArray sViewsWithIds;

    @Nullable
    public final View.OnClickListener mCallback10;

    @Nullable
    public final View.OnClickListener mCallback7;

    @Nullable
    public final View.OnClickListener mCallback8;

    @Nullable
    public final View.OnClickListener mCallback9;
    public long mDirtyFlags;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.rbCollectSchemeToggleSwitchOneOne, 12);
        sparseIntArray.put(R.id.rbCollectSchemeToggleSwitchOneTwo, 13);
        sparseIntArray.put(R.id.rbCollectSchemeToggleSwitchOneThree, 14);
        sparseIntArray.put(R.id.rbCollectSchemeToggleSwitchOneFour, 15);
        sparseIntArray.put(R.id.rbCollectSchemeToggleSwitchOneFive, 16);
        sparseIntArray.put(R.id.rbCollectSchemeToggleSwitchTwoOne, 17);
        sparseIntArray.put(R.id.rbCollectSchemeToggleSwitchTwoTwo, 18);
        sparseIntArray.put(R.id.rb_collect_scheme_toggle_switch_two_three, 19);
        sparseIntArray.put(R.id.rb_collect_scheme_toggle_switch_two_four, 20);
        sparseIntArray.put(R.id.rb_collect_scheme_toggle_switch_two_five, 21);
        sparseIntArray.put(R.id.tvCollectSchemeTitle, 22);
        sparseIntArray.put(R.id.tvCollectSchemeTitleScheme, 23);
        sparseIntArray.put(R.id.blockCollectSchemeTarget, 24);
        sparseIntArray.put(R.id.ivCollectSchemeBulbColorSchemeOneOne, 25);
        sparseIntArray.put(R.id.ivCollectSchemeBulbColorSchemeOneTwo, 26);
        sparseIntArray.put(R.id.ivCollectSchemeBulbColorSchemeOneThree, 27);
        sparseIntArray.put(R.id.ivCollectSchemeBulbColorSchemeOneFour, 28);
        sparseIntArray.put(R.id.ivCollectSchemeBulbColorSchemeOneFive, 29);
        sparseIntArray.put(R.id.ivCollectSchemeBulbColorSchemeTwoOne, 30);
        sparseIntArray.put(R.id.ivCollectSchemeBulbColorSchemeTwoTwo, 31);
        sparseIntArray.put(R.id.ivCollectSchemeBulbColorSchemeTwoThree, 32);
        sparseIntArray.put(R.id.ivCollectSchemeBulbColorSchemeTwoFour, 33);
        sparseIntArray.put(R.id.ivCollectSchemeBulbColorSchemeTwoFive, 34);
        sparseIntArray.put(R.id.blockCollectSchemeTimer, 35);
        sparseIntArray.put(R.id.ivCollectSchemeTime, 36);
        sparseIntArray.put(R.id.divCollectSchemeOne, 37);
        sparseIntArray.put(R.id.tvCollectSchemeTime, 38);
        sparseIntArray.put(R.id.blockCollectSchemeCenter, 39);
        sparseIntArray.put(R.id.guidelineCollectSchemeLeft, 40);
        sparseIntArray.put(R.id.guidelineCollectSchemeRight, 41);
    }

    public FragmentCollectSchemeBindingImpl(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 42, sIncludes, sViewsWithIds));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FragmentCollectSchemeBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        View view = (View) bindings[39];
        View view2 = (View) bindings[4];
        LinearLayout linearLayout = (LinearLayout) bindings[6];
        TableLayout tableLayout = (TableLayout) bindings[24];
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[35];
        View view3 = (View) bindings[5];
        ImageButton imageButton = (ImageButton) bindings[2];
        ImageButton imageButton2 = (ImageButton) bindings[7];
        TextView textView = (TextView) bindings[8];
        MaterialDivider materialDivider = (MaterialDivider) bindings[37];
        Group group = (Group) bindings[9];
        Group group2 = (Group) bindings[11];
        Group group3 = (Group) bindings[10];
        Guideline guideline = (Guideline) bindings[40];
        Guideline guideline2 = (Guideline) bindings[41];
        AppCompatImageView appCompatImageView = (AppCompatImageView) bindings[29];
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) bindings[28];
        AppCompatImageView appCompatImageView3 = (AppCompatImageView) bindings[25];
        AppCompatImageView appCompatImageView4 = (AppCompatImageView) bindings[27];
        AppCompatImageView appCompatImageView5 = (AppCompatImageView) bindings[26];
        AppCompatImageView appCompatImageView6 = (AppCompatImageView) bindings[34];
        AppCompatImageView appCompatImageView7 = (AppCompatImageView) bindings[33];
        AppCompatImageView appCompatImageView8 = (AppCompatImageView) bindings[30];
        AppCompatImageView appCompatImageView9 = (AppCompatImageView) bindings[32];
        AppCompatImageView appCompatImageView10 = (AppCompatImageView) bindings[31];
        ImageView imageView = (ImageView) bindings[3];
        AppCompatImageView appCompatImageView11 = (AppCompatImageView) bindings[36];
        AppCompatImageView appCompatImageView12 = (AppCompatImageView) bindings[1];
        ConstraintLayout constraintLayout2 = (ConstraintLayout) bindings[0];
        Object obj = bindings[16];
        BlockToggleSwitchElectricBinding blockToggleSwitchElectricBindingBind = obj != null ? BlockToggleSwitchElectricBinding.bind((View) obj) : null;
        Object obj2 = bindings[15];
        BlockToggleSwitchElectricBinding blockToggleSwitchElectricBindingBind2 = obj2 != null ? BlockToggleSwitchElectricBinding.bind((View) obj2) : null;
        Object obj3 = bindings[12];
        BlockToggleSwitchElectricBinding blockToggleSwitchElectricBindingBind3 = obj3 != null ? BlockToggleSwitchElectricBinding.bind((View) obj3) : null;
        Object obj4 = bindings[14];
        BlockToggleSwitchElectricBinding blockToggleSwitchElectricBindingBind4 = obj4 != null ? BlockToggleSwitchElectricBinding.bind((View) obj4) : null;
        Object obj5 = bindings[13];
        BlockToggleSwitchElectricBinding blockToggleSwitchElectricBindingBind5 = obj5 != null ? BlockToggleSwitchElectricBinding.bind((View) obj5) : null;
        Object obj6 = bindings[21];
        BlockToggleSwitchElectricBinding blockToggleSwitchElectricBindingBind6 = obj6 != null ? BlockToggleSwitchElectricBinding.bind((View) obj6) : null;
        Object obj7 = bindings[20];
        BlockToggleSwitchElectricBinding blockToggleSwitchElectricBindingBind7 = obj7 != null ? BlockToggleSwitchElectricBinding.bind((View) obj7) : null;
        Object obj8 = bindings[17];
        BlockToggleSwitchElectricBinding blockToggleSwitchElectricBindingBind8 = obj8 != null ? BlockToggleSwitchElectricBinding.bind((View) obj8) : null;
        Object obj9 = bindings[19];
        BlockToggleSwitchElectricBinding blockToggleSwitchElectricBindingBind9 = obj9 != null ? BlockToggleSwitchElectricBinding.bind((View) obj9) : null;
        Object obj10 = bindings[18];
        super(bindingComponent, root, 1, view, view2, linearLayout, tableLayout, constraintLayout, view3, imageButton, imageButton2, textView, materialDivider, group, group2, group3, guideline, guideline2, appCompatImageView, appCompatImageView2, appCompatImageView3, appCompatImageView4, appCompatImageView5, appCompatImageView6, appCompatImageView7, appCompatImageView8, appCompatImageView9, appCompatImageView10, imageView, appCompatImageView11, appCompatImageView12, constraintLayout2, blockToggleSwitchElectricBindingBind, blockToggleSwitchElectricBindingBind2, blockToggleSwitchElectricBindingBind3, blockToggleSwitchElectricBindingBind4, blockToggleSwitchElectricBindingBind5, blockToggleSwitchElectricBindingBind6, blockToggleSwitchElectricBindingBind7, blockToggleSwitchElectricBindingBind8, blockToggleSwitchElectricBindingBind9, obj10 != null ? BlockToggleSwitchElectricBinding.bind((View) obj10) : null, (AppCompatTextView) bindings[38], (TextView) bindings[22], (AppCompatTextView) bindings[23]);
        this.mDirtyFlags = -1L;
        this.blockCollectSchemeDark.setTag(null);
        this.blockCollectSchemeHint.setTag(null);
        this.blockCollectSchemeTransparent.setTag(null);
        this.btnCollectSchemeHint.setTag(null);
        this.btnCollectSchemeHintClose.setTag(null);
        this.btnCollectSchemeHintDesc.setTag(null);
        this.groupCollectSchemeHintOne.setTag(null);
        this.groupCollectSchemeHintThree.setTag(null);
        this.groupCollectSchemeHintTwo.setTag(null);
        this.ivCollectSchemeHand.setTag(null);
        this.ivCollectSchemeTrafficLight.setTag(null);
        this.mlCollectScheme.setTag(null);
        setRootTag(root);
        this.mCallback9 = new OnClickListener(this, 3);
        this.mCallback8 = new OnClickListener(this, 2);
        this.mCallback10 = new OnClickListener(this, 4);
        this.mCallback7 = new OnClickListener(this, 1);
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
        setVm((CollectSchemeViewModel) variable);
        return true;
    }

    @Override // com.blackhub.bronline.databinding.FragmentCollectSchemeBinding
    public void setVm(@Nullable CollectSchemeViewModel Vm) {
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

    private boolean onChangeVmUiState(StateFlow<CollectSchemeUiState> VmUiState, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x005a  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void executeBindings() {
        long j;
        float f;
        float f2;
        float f3;
        float f4;
        int resourceColorTrafficLight;
        boolean zIsHandViewShow;
        boolean zIsHintBtnCloseVisible;
        String hintText;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        CollectSchemeViewModel collectSchemeViewModel = this.mVm;
        long j2 = 7 & j;
        boolean z = false;
        if (j2 == 0) {
            f = 0.0f;
            f2 = 0.0f;
            f3 = 0.0f;
            f4 = 0.0f;
            resourceColorTrafficLight = 0;
            zIsHandViewShow = false;
            zIsHintBtnCloseVisible = false;
            hintText = null;
        } else {
            StateFlow<CollectSchemeUiState> uiState = collectSchemeViewModel != null ? collectSchemeViewModel.getUiState() : null;
            ViewDataBindingKtx.updateStateFlowRegistration(this, 0, uiState);
            CollectSchemeUiState value = uiState != null ? uiState.getValue() : null;
            if (value != null) {
                float elevationHintThree = value.getElevationHintThree();
                float elevationHintTwo = value.getElevationHintTwo();
                float elevationHint = value.getElevationHint();
                float elevationHintOne = value.getElevationHintOne();
                zIsHandViewShow = value.isHandViewShow();
                boolean zIsHintShow = value.isHintShow();
                hintText = value.getHintText();
                zIsHintBtnCloseVisible = value.isHintBtnCloseVisible();
                resourceColorTrafficLight = value.getResourceColorTrafficLight();
                f = elevationHintThree;
                z = zIsHintShow;
                f4 = elevationHintOne;
                f3 = elevationHint;
                f2 = elevationHintTwo;
            }
        }
        if (j2 != 0) {
            ViewDataBindingAdaptersKt.setVisible(this.blockCollectSchemeDark, z);
            ViewDataBindingAdaptersKt.setVisible(this.blockCollectSchemeHint, z);
            ViewDataBindingAdaptersKt.setElevation(this.blockCollectSchemeTransparent, f3);
            ViewDataBindingAdaptersKt.setVisible(this.blockCollectSchemeTransparent, z);
            ViewDataBindingAdaptersKt.setVisible(this.btnCollectSchemeHintClose, zIsHintBtnCloseVisible);
            ViewDataBindingAdaptersKt.setTextHtml(this.btnCollectSchemeHintDesc, hintText);
            ViewDataBindingAdaptersKt.setElevation(this.groupCollectSchemeHintOne, f4);
            ViewDataBindingAdaptersKt.setElevation(this.groupCollectSchemeHintThree, f);
            ViewDataBindingAdaptersKt.setElevation(this.groupCollectSchemeHintTwo, f2);
            ViewDataBindingAdaptersKt.setVisible(this.ivCollectSchemeHand, zIsHandViewShow);
            ViewDataBindingAdaptersKt.setImageResource(this.ivCollectSchemeTrafficLight, resourceColorTrafficLight);
        }
        if ((j & 4) != 0) {
            ViewDataBindingAdaptersKt.setOnClickListener(this.blockCollectSchemeDark, this.mCallback8, null);
            ViewDataBindingAdaptersKt.setOnClickListener(this.blockCollectSchemeTransparent, this.mCallback9, null);
            ViewDataBindingAdaptersKt.setOnClickListenerWithAnimate(this.btnCollectSchemeHint, this.mCallback7, null);
            ViewDataBindingAdaptersKt.setOnClickListenerWithAnimate(this.btnCollectSchemeHintClose, this.mCallback10, null);
            if (ViewDataBinding.getBuildSdkInt() >= 4) {
                this.btnCollectSchemeHint.setContentDescription(null);
                this.ivCollectSchemeHand.setContentDescription(null);
            }
        }
    }

    @Override // com.blackhub.bronline.generated.callback.OnClickListener.Listener
    public final void _internalCallbackOnClick(int sourceId, View callbackArg_0) {
        CollectSchemeViewModel collectSchemeViewModel;
        if (sourceId == 1) {
            CollectSchemeViewModel collectSchemeViewModel2 = this.mVm;
            if (collectSchemeViewModel2 != null) {
                collectSchemeViewModel2.showHint();
                return;
            }
            return;
        }
        if (sourceId == 2) {
            CollectSchemeViewModel collectSchemeViewModel3 = this.mVm;
            if (collectSchemeViewModel3 != null) {
                collectSchemeViewModel3.onBgHintClick();
                return;
            }
            return;
        }
        if (sourceId != 3) {
            if (sourceId == 4 && (collectSchemeViewModel = this.mVm) != null) {
                collectSchemeViewModel.closeHint();
                return;
            }
            return;
        }
        CollectSchemeViewModel collectSchemeViewModel4 = this.mVm;
        if (collectSchemeViewModel4 != null) {
            collectSchemeViewModel4.onBgHintClick();
        }
    }
}
