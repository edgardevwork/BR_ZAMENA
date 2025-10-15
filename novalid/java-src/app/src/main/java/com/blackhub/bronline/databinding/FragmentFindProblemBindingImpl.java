package com.blackhub.bronline.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewDataBindingKtx;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.blackhub.bronline.game.core.utils.ViewDataBindingAdaptersKt;
import com.blackhub.bronline.game.gui.electric.state.FindProblemUiState;
import com.blackhub.bronline.game.gui.electric.view.FindProblemView;
import com.blackhub.bronline.game.gui.electric.viewmodel.FindProblemViewModel;
import com.blackhub.bronline.generated.callback.OnClickListener;
import com.bless.client.R;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes3.dex */
public class FragmentFindProblemBindingImpl extends FragmentFindProblemBinding implements OnClickListener.Listener {

    @Nullable
    public static final ViewDataBinding.IncludedLayouts sIncludes = null;

    @Nullable
    public static final SparseIntArray sViewsWithIds;

    @Nullable
    public final View.OnClickListener mCallback21;

    @Nullable
    public final View.OnClickListener mCallback22;

    @Nullable
    public final View.OnClickListener mCallback23;

    @Nullable
    public final View.OnClickListener mCallback24;

    @Nullable
    public final View.OnClickListener mCallback25;

    @Nullable
    public final View.OnClickListener mCallback26;

    @Nullable
    public final View.OnClickListener mCallback27;

    @Nullable
    public final View.OnClickListener mCallback28;

    @Nullable
    public final View.OnClickListener mCallback29;

    @Nullable
    public final View.OnClickListener mCallback30;

    @Nullable
    public final View.OnClickListener mCallback31;
    public long mDirtyFlags;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.tvFindProblemTitle, 38);
        sparseIntArray.put(R.id.tvFindProblemHelp, 39);
        sparseIntArray.put(R.id.blockFindProblemLeft, 40);
        sparseIntArray.put(R.id.blockFindProblemCustomView, 41);
        sparseIntArray.put(R.id.cvFindProblemView, 42);
        sparseIntArray.put(R.id.tvFindProblemTargetOhm, 43);
        sparseIntArray.put(R.id.blockFindProblemRight, 44);
        sparseIntArray.put(R.id.blockFindProblemElementOne, 45);
        sparseIntArray.put(R.id.ivFindProblemElementTwoFour, 46);
        sparseIntArray.put(R.id.ivFindProblemElementTwoThree, 47);
        sparseIntArray.put(R.id.ivFindProblemElementTwoTwo, 48);
        sparseIntArray.put(R.id.ivFindProblemElementTwoOne, 49);
        sparseIntArray.put(R.id.ivFindProblemMultimeter, 50);
    }

    public FragmentFindProblemBindingImpl(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 51, sIncludes, sViewsWithIds));
    }

    public FragmentFindProblemBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1, (FrameLayout) bindings[41], (FrameLayout) bindings[32], (FrameLayout) bindings[45], (FrameLayout) bindings[22], (FrameLayout) bindings[20], (LinearLayout) bindings[33], (View) bindings[40], (FrameLayout) bindings[26], (FrameLayout) bindings[28], (View) bindings[44], (FrameLayout) bindings[18], (ImageButton) bindings[31], (ImageButton) bindings[34], (TextView) bindings[35], (AppCompatButton) bindings[30], (FindProblemView) bindings[42], (Group) bindings[36], (AppCompatImageView) bindings[19], (AppCompatImageView) bindings[23], (AppCompatImageView) bindings[46], (AppCompatImageView) bindings[49], (AppCompatImageView) bindings[21], (AppCompatImageView) bindings[47], (AppCompatImageView) bindings[48], (ImageView) bindings[15], (ImageView) bindings[6], (ImageView) bindings[12], (ImageView) bindings[9], (ImageView) bindings[16], (ImageView) bindings[7], (ImageView) bindings[13], (ImageView) bindings[10], (ImageView) bindings[17], (ImageView) bindings[8], (ImageView) bindings[14], (ImageView) bindings[11], (ImageView) bindings[37], (AppCompatImageView) bindings[50], (AppCompatImageView) bindings[24], (AppCompatImageView) bindings[27], (AppCompatImageView) bindings[29], (ImageView) bindings[1], (ImageView) bindings[5], (ImageView) bindings[2], (ImageView) bindings[4], (ImageView) bindings[3], (ConstraintLayout) bindings[0], (TextView) bindings[39], (TextView) bindings[25], (TextView) bindings[43], (TextView) bindings[38]);
        this.mDirtyFlags = -1L;
        this.blockFindProblemDark.setTag(null);
        this.blockFindProblemElementThree.setTag(null);
        this.blockFindProblemElementTwo.setTag(null);
        this.blockFindProblemHint.setTag(null);
        this.blockFindProblemProbeBlack.setTag(null);
        this.blockFindProblemProbeRed.setTag(null);
        this.blockFindProblemTargetOhm.setTag(null);
        this.btnFindProblemHint.setTag(null);
        this.btnFindProblemHintClose.setTag(null);
        this.btnFindProblemHintDesc.setTag(null);
        this.btnFindProblemNext.setTag(null);
        this.groupMultimeterFull.setTag(null);
        this.ivFindProblemElementOne.setTag(null);
        this.ivFindProblemElementThree.setTag(null);
        this.ivFindProblemElementTwoStable.setTag(null);
        this.ivFindProblemFuseBlackFour.setTag(null);
        this.ivFindProblemFuseBlackOne.setTag(null);
        this.ivFindProblemFuseBlackThree.setTag(null);
        this.ivFindProblemFuseBlackTwo.setTag(null);
        this.ivFindProblemFuseGrayFour.setTag(null);
        this.ivFindProblemFuseGrayOne.setTag(null);
        this.ivFindProblemFuseGrayThree.setTag(null);
        this.ivFindProblemFuseGrayTwo.setTag(null);
        this.ivFindProblemFuseRedFour.setTag(null);
        this.ivFindProblemFuseRedOne.setTag(null);
        this.ivFindProblemFuseRedThree.setTag(null);
        this.ivFindProblemFuseRedTwo.setTag(null);
        this.ivFindProblemHand.setTag(null);
        this.ivFindProblemMultimeterDisplay.setTag(null);
        this.ivFindProblemProbeBlack.setTag(null);
        this.ivFindProblemProbeRed.setTag(null);
        this.ivFindProblemVoltagePointBlack.setTag(null);
        this.ivFindProblemVoltagePointRedFour.setTag(null);
        this.ivFindProblemVoltagePointRedOne.setTag(null);
        this.ivFindProblemVoltagePointRedThree.setTag(null);
        this.ivFindProblemVoltagePointRedTwo.setTag(null);
        this.mlFindProblem.setTag(null);
        this.tvFindProblemMultimeterText.setTag(null);
        setRootTag(root);
        this.mCallback27 = new OnClickListener(this, 7);
        this.mCallback30 = new OnClickListener(this, 10);
        this.mCallback28 = new OnClickListener(this, 8);
        this.mCallback31 = new OnClickListener(this, 11);
        this.mCallback25 = new OnClickListener(this, 5);
        this.mCallback26 = new OnClickListener(this, 6);
        this.mCallback23 = new OnClickListener(this, 3);
        this.mCallback24 = new OnClickListener(this, 4);
        this.mCallback21 = new OnClickListener(this, 1);
        this.mCallback29 = new OnClickListener(this, 9);
        this.mCallback22 = new OnClickListener(this, 2);
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
        setVm((FindProblemViewModel) variable);
        return true;
    }

    @Override // com.blackhub.bronline.databinding.FragmentFindProblemBinding
    public void setVm(@Nullable FindProblemViewModel Vm) {
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

    private boolean onChangeVmUiState(StateFlow<FindProblemUiState> VmUiState, int fieldId) {
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
        long j2;
        float elevationHintSix;
        float f;
        float f2;
        float f3;
        float elevationHintSeven;
        float f4;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean zIsHintShow;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        String str;
        String str2;
        float f5;
        float elevationHintFourOrFive;
        float elevationHintTwo;
        float elevationHintFour;
        float elevationHintOne;
        float elevationHintThreeOrSeven;
        boolean z18;
        boolean zIsHandViewShow;
        boolean zIsFuseRedTwoWithProbeVisible;
        boolean zIsFuseGrayFourVisible;
        boolean zIsShowHintFourOrFive;
        boolean zIsHintBtnCloseVisible;
        boolean zIsFuseGrayTwoVisible;
        boolean zIsFuseRedOneWithProbeVisible;
        boolean zIsMultimeterVisible;
        boolean zIsFuseRedThreeWithProbeVisible;
        boolean zIsFuseGrayOneVisible;
        String textMultimeter;
        String hintText;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        FindProblemViewModel findProblemViewModel = this.mVm;
        long j3 = 7 & j;
        float f6 = 0.0f;
        boolean zIsFuseRedFourWithProbeVisible = false;
        if (j3 != 0) {
            StateFlow<FindProblemUiState> uiState = findProblemViewModel != null ? findProblemViewModel.getUiState() : null;
            ViewDataBindingKtx.updateStateFlowRegistration(this, 0, uiState);
            FindProblemUiState value = uiState != null ? uiState.getValue() : null;
            if (value != null) {
                zIsFuseRedFourWithProbeVisible = value.isFuseRedFourWithProbeVisible();
                boolean zIsFuseGrayThreeVisible = value.isFuseGrayThreeVisible();
                float elevationHintEight = value.getElevationHintEight();
                zIsHandViewShow = value.isHandViewShow();
                zIsFuseRedTwoWithProbeVisible = value.isFuseRedTwoWithProbeVisible();
                zIsFuseGrayFourVisible = value.isFuseGrayFourVisible();
                zIsShowHintFourOrFive = value.isShowHintFourOrFive();
                zIsHintShow = value.isHintShow();
                zIsHintBtnCloseVisible = value.isHintBtnCloseVisible();
                elevationHintFourOrFive = value.getElevationHintFourOrFive();
                zIsFuseGrayTwoVisible = value.isFuseGrayTwoVisible();
                zIsFuseRedOneWithProbeVisible = value.isFuseRedOneWithProbeVisible();
                zIsMultimeterVisible = value.isMultimeterVisible();
                elevationHintSeven = value.getElevationHintSeven();
                elevationHintTwo = value.getElevationHintTwo();
                elevationHintFour = value.getElevationHintFour();
                zIsFuseRedThreeWithProbeVisible = value.isFuseRedThreeWithProbeVisible();
                elevationHintOne = value.getElevationHintOne();
                zIsFuseGrayOneVisible = value.isFuseGrayOneVisible();
                textMultimeter = value.getTextMultimeter();
                hintText = value.getHintText();
                elevationHintThreeOrSeven = value.getElevationHintThreeOrSeven();
                elevationHintSix = value.getElevationHintSix();
                z18 = zIsFuseGrayThreeVisible;
                f6 = elevationHintEight;
            } else {
                elevationHintSix = 0.0f;
                elevationHintFourOrFive = 0.0f;
                elevationHintSeven = 0.0f;
                elevationHintTwo = 0.0f;
                elevationHintFour = 0.0f;
                elevationHintOne = 0.0f;
                elevationHintThreeOrSeven = 0.0f;
                z18 = false;
                zIsHandViewShow = false;
                zIsFuseRedTwoWithProbeVisible = false;
                zIsFuseGrayFourVisible = false;
                zIsShowHintFourOrFive = false;
                zIsHintShow = false;
                zIsHintBtnCloseVisible = false;
                zIsFuseGrayTwoVisible = false;
                zIsFuseRedOneWithProbeVisible = false;
                zIsMultimeterVisible = false;
                zIsFuseRedThreeWithProbeVisible = false;
                zIsFuseGrayOneVisible = false;
                textMultimeter = null;
                hintText = null;
            }
            boolean z19 = !zIsFuseRedFourWithProbeVisible;
            z12 = zIsFuseRedFourWithProbeVisible;
            z9 = z18;
            z16 = zIsHandViewShow;
            z15 = zIsFuseRedTwoWithProbeVisible;
            z17 = zIsShowHintFourOrFive;
            z3 = zIsHintBtnCloseVisible;
            f2 = elevationHintFourOrFive;
            z11 = zIsFuseGrayTwoVisible;
            z13 = zIsFuseRedOneWithProbeVisible;
            z4 = zIsMultimeterVisible;
            f5 = elevationHintTwo;
            f4 = elevationHintFour;
            z14 = zIsFuseRedThreeWithProbeVisible;
            z7 = zIsFuseGrayOneVisible;
            str2 = textMultimeter;
            f = elevationHintThreeOrSeven;
            z10 = !zIsFuseRedTwoWithProbeVisible;
            z6 = !zIsFuseRedOneWithProbeVisible;
            z5 = !zIsMultimeterVisible;
            z8 = !zIsFuseRedThreeWithProbeVisible;
            j2 = j;
            f3 = f6;
            z2 = zIsFuseGrayFourVisible;
            f6 = elevationHintOne;
            str = hintText;
            z = z19;
        } else {
            j2 = j;
            elevationHintSix = 0.0f;
            f = 0.0f;
            f2 = 0.0f;
            f3 = 0.0f;
            elevationHintSeven = 0.0f;
            f4 = 0.0f;
            z = false;
            z2 = false;
            z3 = false;
            z4 = false;
            z5 = false;
            z6 = false;
            zIsHintShow = false;
            z7 = false;
            z8 = false;
            z9 = false;
            z10 = false;
            z11 = false;
            z12 = false;
            z13 = false;
            z14 = false;
            z15 = false;
            z16 = false;
            z17 = false;
            str = null;
            str2 = null;
            f5 = 0.0f;
        }
        if (j3 != 0) {
            ViewDataBindingAdaptersKt.setVisible(this.blockFindProblemDark, zIsHintShow);
            ViewDataBindingAdaptersKt.setElevation(this.blockFindProblemElementThree, f6);
            ViewDataBindingAdaptersKt.setVisible(this.blockFindProblemElementThree, z5);
            ViewDataBindingAdaptersKt.setElevation(this.blockFindProblemElementTwo, elevationHintSix);
            ViewDataBindingAdaptersKt.setVisible(this.blockFindProblemHint, zIsHintShow);
            ViewDataBindingAdaptersKt.setElevation(this.blockFindProblemProbeBlack, f5);
            ViewDataBindingAdaptersKt.setElevation(this.blockFindProblemProbeRed, f);
            ViewDataBindingAdaptersKt.setElevation(this.blockFindProblemTargetOhm, f2);
            ViewDataBindingAdaptersKt.setVisible(this.btnFindProblemHintClose, z3);
            ViewDataBindingAdaptersKt.setTextHtml(this.btnFindProblemHintDesc, str);
            ViewDataBindingAdaptersKt.setElevation(this.btnFindProblemNext, f3);
            ViewDataBindingAdaptersKt.setVisible(this.groupMultimeterFull, z4);
            ViewDataBindingAdaptersKt.setElevation(this.ivFindProblemFuseBlackOne, elevationHintSix);
            ViewDataBindingAdaptersKt.setElevation(this.ivFindProblemFuseBlackTwo, elevationHintSix);
            ViewDataBindingAdaptersKt.setEnable(this.ivFindProblemFuseGrayFour, z);
            ViewDataBindingAdaptersKt.setVisible(this.ivFindProblemFuseGrayFour, z2);
            ViewDataBindingAdaptersKt.setElevation(this.ivFindProblemFuseGrayOne, f2);
            ViewDataBindingAdaptersKt.setEnable(this.ivFindProblemFuseGrayOne, z6);
            ViewDataBindingAdaptersKt.setVisible(this.ivFindProblemFuseGrayOne, z7);
            ViewDataBindingAdaptersKt.setEnable(this.ivFindProblemFuseGrayThree, z8);
            ViewDataBindingAdaptersKt.setVisible(this.ivFindProblemFuseGrayThree, z9);
            ViewDataBindingAdaptersKt.setEnable(this.ivFindProblemFuseGrayTwo, z10);
            ViewDataBindingAdaptersKt.setVisible(this.ivFindProblemFuseGrayTwo, z11);
            ViewDataBindingAdaptersKt.setVisible(this.ivFindProblemFuseRedFour, z12);
            ViewDataBindingAdaptersKt.setElevation(this.ivFindProblemFuseRedOne, f4);
            ViewDataBindingAdaptersKt.setVisible(this.ivFindProblemFuseRedOne, z13);
            ViewDataBindingAdaptersKt.setVisible(this.ivFindProblemFuseRedThree, z14);
            ViewDataBindingAdaptersKt.setVisible(this.ivFindProblemFuseRedTwo, z15);
            ViewDataBindingAdaptersKt.setVisible(this.ivFindProblemHand, z16);
            ViewDataBindingAdaptersKt.setElevation(this.ivFindProblemMultimeterDisplay, f2);
            ViewDataBindingAdaptersKt.setVisible(this.ivFindProblemMultimeterDisplay, z17);
            ViewDataBindingAdaptersKt.setElevation(this.ivFindProblemProbeBlack, f5);
            ViewDataBindingAdaptersKt.setElevation(this.ivFindProblemProbeRed, f);
            ViewDataBindingAdaptersKt.setElevation(this.ivFindProblemVoltagePointBlack, f5);
            float f7 = elevationHintSeven;
            ViewDataBindingAdaptersKt.setElevation(this.ivFindProblemVoltagePointRedFour, f7);
            ViewDataBindingAdaptersKt.setElevation(this.ivFindProblemVoltagePointRedOne, f);
            ViewDataBindingAdaptersKt.setElevation(this.ivFindProblemVoltagePointRedThree, f7);
            ViewDataBindingAdaptersKt.setElevation(this.ivFindProblemVoltagePointRedTwo, f7);
            TextViewBindingAdapter.setText(this.tvFindProblemMultimeterText, str2);
            ViewDataBindingAdaptersKt.setElevation(this.tvFindProblemMultimeterText, f2);
        }
        if ((j2 & 4) != 0) {
            ViewDataBindingAdaptersKt.setOnClickListener(this.blockFindProblemDark, this.mCallback30, null);
            ViewDataBindingAdaptersKt.setOnClickListenerWithAnimate(this.btnFindProblemHint, this.mCallback29, null);
            ViewDataBindingAdaptersKt.setOnClickListenerWithAnimate(this.btnFindProblemHintClose, this.mCallback31, null);
            ViewDataBindingAdaptersKt.setOnClickListenerWithAnimate(this.btnFindProblemNext, this.mCallback28, null);
            ViewDataBindingAdaptersKt.setOnClickListenerWithAnimate(this.ivFindProblemElementOne, this.mCallback25, null);
            ViewDataBindingAdaptersKt.setOnClickListener(this.ivFindProblemElementThree, this.mCallback27, null);
            ViewDataBindingAdaptersKt.setOnClickListenerWithAnimate(this.ivFindProblemElementTwoStable, this.mCallback26, null);
            ViewDataBindingAdaptersKt.setOnClickListenerWithAnimate(this.ivFindProblemFuseGrayFour, this.mCallback24, null);
            ViewDataBindingAdaptersKt.setOnClickListenerWithAnimate(this.ivFindProblemFuseGrayOne, this.mCallback21, null);
            ViewDataBindingAdaptersKt.setOnClickListenerWithAnimate(this.ivFindProblemFuseGrayThree, this.mCallback23, null);
            ViewDataBindingAdaptersKt.setOnClickListenerWithAnimate(this.ivFindProblemFuseGrayTwo, this.mCallback22, null);
            if (ViewDataBinding.getBuildSdkInt() >= 4) {
                this.btnFindProblemHint.setContentDescription(null);
                this.ivFindProblemFuseBlackFour.setContentDescription(null);
                this.ivFindProblemFuseBlackOne.setContentDescription(null);
                this.ivFindProblemFuseBlackThree.setContentDescription(null);
                this.ivFindProblemFuseBlackTwo.setContentDescription(null);
                this.ivFindProblemFuseGrayFour.setContentDescription(null);
                this.ivFindProblemFuseGrayOne.setContentDescription(null);
                this.ivFindProblemFuseGrayThree.setContentDescription(null);
                this.ivFindProblemFuseGrayTwo.setContentDescription(null);
                this.ivFindProblemFuseRedFour.setContentDescription(null);
                this.ivFindProblemFuseRedOne.setContentDescription(null);
                this.ivFindProblemFuseRedThree.setContentDescription(null);
                this.ivFindProblemFuseRedTwo.setContentDescription(null);
                this.ivFindProblemHand.setContentDescription(null);
                this.ivFindProblemVoltagePointBlack.setContentDescription(null);
                this.ivFindProblemVoltagePointRedFour.setContentDescription(null);
                this.ivFindProblemVoltagePointRedOne.setContentDescription(null);
                this.ivFindProblemVoltagePointRedThree.setContentDescription(null);
                this.ivFindProblemVoltagePointRedTwo.setContentDescription(null);
            }
        }
    }

    @Override // com.blackhub.bronline.generated.callback.OnClickListener.Listener
    public final void _internalCallbackOnClick(int sourceId, View callbackArg_0) {
        switch (sourceId) {
            case 1:
                FindProblemViewModel findProblemViewModel = this.mVm;
                if (findProblemViewModel != null) {
                    findProblemViewModel.onFuseGrayClick(1);
                    break;
                }
                break;
            case 2:
                FindProblemViewModel findProblemViewModel2 = this.mVm;
                if (findProblemViewModel2 != null) {
                    findProblemViewModel2.onFuseGrayClick(2);
                    break;
                }
                break;
            case 3:
                FindProblemViewModel findProblemViewModel3 = this.mVm;
                if (findProblemViewModel3 != null) {
                    findProblemViewModel3.onFuseGrayClick(3);
                    break;
                }
                break;
            case 4:
                FindProblemViewModel findProblemViewModel4 = this.mVm;
                if (findProblemViewModel4 != null) {
                    findProblemViewModel4.onFuseGrayClick(4);
                    break;
                }
                break;
            case 5:
                FindProblemViewModel findProblemViewModel5 = this.mVm;
                if (findProblemViewModel5 != null) {
                    findProblemViewModel5.showErrorMessageForBulb();
                    break;
                }
                break;
            case 6:
                FindProblemViewModel findProblemViewModel6 = this.mVm;
                if (findProblemViewModel6 != null) {
                    findProblemViewModel6.showErrorMessageForFuse();
                    break;
                }
                break;
            case 7:
                FindProblemViewModel findProblemViewModel7 = this.mVm;
                if (findProblemViewModel7 != null) {
                    findProblemViewModel7.changeMultimeterVisible(true);
                    break;
                }
                break;
            case 8:
                FindProblemViewModel findProblemViewModel8 = this.mVm;
                if (findProblemViewModel8 != null) {
                    findProblemViewModel8.selectNextGame();
                    break;
                }
                break;
            case 9:
                FindProblemViewModel findProblemViewModel9 = this.mVm;
                if (findProblemViewModel9 != null) {
                    findProblemViewModel9.showHint();
                    break;
                }
                break;
            case 10:
                FindProblemViewModel findProblemViewModel10 = this.mVm;
                if (findProblemViewModel10 != null) {
                    findProblemViewModel10.onDarkClick();
                    break;
                }
                break;
            case 11:
                FindProblemViewModel findProblemViewModel11 = this.mVm;
                if (findProblemViewModel11 != null) {
                    findProblemViewModel11.closeHint();
                    break;
                }
                break;
        }
    }
}
