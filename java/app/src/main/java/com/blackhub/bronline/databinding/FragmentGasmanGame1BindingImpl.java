package com.blackhub.bronline.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewDataBindingKtx;
import com.blackhub.bronline.game.core.utils.ViewDataBindingAdaptersKt;
import com.blackhub.bronline.game.gui.gasmangame.uistate.GasmanParentUIState;
import com.blackhub.bronline.game.gui.gasmangame.uistate.GasmanSizesItem;
import com.blackhub.bronline.game.gui.gasmangame.viewmodel.GasmanParentViewModel;
import com.bless.client.R;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes3.dex */
public class FragmentGasmanGame1BindingImpl extends FragmentGasmanGame1Binding {

    @Nullable
    public static final ViewDataBinding.IncludedLayouts sIncludes = null;

    @Nullable
    public static final SparseIntArray sViewsWithIds;
    public long mDirtyFlags;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.guidelineVertical16Percent, 20);
        sparseIntArray.put(R.id.guidelineHorizontalTop, 21);
        sparseIntArray.put(R.id.guidelineVerticalEndButtons, 22);
        sparseIntArray.put(R.id.tvTopPlot, 23);
        sparseIntArray.put(R.id.tvMiddlePlot, 24);
        sparseIntArray.put(R.id.ivTeePipeBotPlot, 25);
        sparseIntArray.put(R.id.tvBotPlot, 26);
        sparseIntArray.put(R.id.ivAnimationGas, 27);
        sparseIntArray.put(R.id.ivStartPoint, 28);
        sparseIntArray.put(R.id.ivStartArrows, 29);
        sparseIntArray.put(R.id.ivEndArrows1, 30);
        sparseIntArray.put(R.id.ivEndArrows2, 31);
        sparseIntArray.put(R.id.ivEndPoint, 32);
    }

    public FragmentGasmanGame1BindingImpl(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 33, sIncludes, sViewsWithIds));
    }

    public FragmentGasmanGame1BindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1, (ConstraintLayout) bindings[0], (Guideline) bindings[21], (Guideline) bindings[20], (Guideline) bindings[22], (ImageView) bindings[27], (ImageView) bindings[10], (ImageView) bindings[17], (ImageView) bindings[18], (ImageView) bindings[7], (ImageView) bindings[4], (ImageView) bindings[5], (ImageView) bindings[6], (ImageView) bindings[30], (ImageView) bindings[31], (ImageView) bindings[32], (ImageView) bindings[29], (ImageView) bindings[28], (ImageView) bindings[11], (ImageView) bindings[13], (ImageView) bindings[9], (ImageView) bindings[12], (ImageView) bindings[16], (ImageView) bindings[19], (ImageView) bindings[15], (ImageView) bindings[8], (ImageView) bindings[14], (ImageView) bindings[3], (ImageView) bindings[1], (ImageView) bindings[2], (ImageView) bindings[25], (TextView) bindings[26], (TextView) bindings[24], (TextView) bindings[23]);
        this.mDirtyFlags = -1L;
        this.containerRoot.setTag(null);
        this.ivCornerDropArea1.setTag(null);
        this.ivCornerDropArea2.setTag(null);
        this.ivCornerDropArea3.setTag(null);
        this.ivCornerPipeMiddlePlot.setTag(null);
        this.ivCornerPipeMiddlePlot1.setTag(null);
        this.ivCornerPipeMiddlePlot2.setTag(null);
        this.ivCornerPipeMiddlePlot3.setTag(null);
        this.ivStaticCorner1.setTag(null);
        this.ivStaticCorner2.setTag(null);
        this.ivStaticStraightPlot1.setTag(null);
        this.ivStaticStraightPlot2.setTag(null);
        this.ivStaticStraightPlot3.setTag(null);
        this.ivStaticStraightPlot4.setTag(null);
        this.ivStaticTeePipeLong.setTag(null);
        this.ivStraightDropArea1.setTag(null);
        this.ivStraightDropArea2.setTag(null);
        this.ivStraightPipeTopPlot.setTag(null);
        this.ivStraightPipeTopPlot1.setTag(null);
        this.ivStraightPipeTopPlot2.setTag(null);
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
        setVm((GasmanParentViewModel) variable);
        return true;
    }

    @Override // com.blackhub.bronline.databinding.FragmentGasmanGame1Binding
    public void setVm(@Nullable GasmanParentViewModel Vm) {
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

    private boolean onChangeVmUiState(StateFlow<GasmanParentUIState> VmUiState, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0040  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void executeBindings() {
        long j;
        int i;
        int oneHundredThirtyTwo;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        GasmanParentViewModel gasmanParentViewModel = this.mVm;
        long j2 = j & 7;
        int i2 = 0;
        if (j2 != 0) {
            StateFlow<GasmanParentUIState> uiState = gasmanParentViewModel != null ? gasmanParentViewModel.getUiState() : null;
            ViewDataBindingKtx.updateStateFlowRegistration(this, 0, uiState);
            GasmanParentUIState value = uiState != null ? uiState.getValue() : null;
            GasmanSizesItem gasmanSizesItem = value != null ? value.getGasmanSizesItem() : null;
            if (gasmanSizesItem != null) {
                int fortyFour = gasmanSizesItem.getFortyFour();
                oneHundredThirtyTwo = gasmanSizesItem.getOneHundredThirtyTwo();
                int eightyEight = gasmanSizesItem.getEightyEight();
                i = fortyFour;
                i2 = eightyEight;
            } else {
                i = 0;
                oneHundredThirtyTwo = 0;
            }
        }
        if (j2 != 0) {
            ViewDataBindingAdaptersKt.setHeight(this.ivCornerDropArea1, i2);
            ViewDataBindingAdaptersKt.setWidth(this.ivCornerDropArea1, i2);
            ViewDataBindingAdaptersKt.setHeight(this.ivCornerDropArea2, i2);
            ViewDataBindingAdaptersKt.setWidth(this.ivCornerDropArea2, i2);
            ViewDataBindingAdaptersKt.setHeight(this.ivCornerDropArea3, i2);
            ViewDataBindingAdaptersKt.setWidth(this.ivCornerDropArea3, i2);
            ViewDataBindingAdaptersKt.setHeight(this.ivCornerPipeMiddlePlot, i2);
            ViewDataBindingAdaptersKt.setWidth(this.ivCornerPipeMiddlePlot, i2);
            ViewDataBindingAdaptersKt.setHeight(this.ivCornerPipeMiddlePlot1, i2);
            ViewDataBindingAdaptersKt.setWidth(this.ivCornerPipeMiddlePlot1, i2);
            ViewDataBindingAdaptersKt.setHeight(this.ivCornerPipeMiddlePlot2, i2);
            ViewDataBindingAdaptersKt.setWidth(this.ivCornerPipeMiddlePlot2, i2);
            ViewDataBindingAdaptersKt.setHeight(this.ivCornerPipeMiddlePlot3, i2);
            ViewDataBindingAdaptersKt.setWidth(this.ivCornerPipeMiddlePlot3, i2);
            ViewDataBindingAdaptersKt.setHeight(this.ivStaticCorner1, i2);
            ViewDataBindingAdaptersKt.setWidth(this.ivStaticCorner1, i2);
            ViewDataBindingAdaptersKt.setHeight(this.ivStaticCorner2, i2);
            ViewDataBindingAdaptersKt.setWidth(this.ivStaticCorner2, i2);
            ViewDataBindingAdaptersKt.setHeight(this.ivStaticStraightPlot1, i2);
            ViewDataBindingAdaptersKt.setWidth(this.ivStaticStraightPlot1, i);
            ViewDataBindingAdaptersKt.setHeight(this.ivStaticStraightPlot2, i2);
            ViewDataBindingAdaptersKt.setWidth(this.ivStaticStraightPlot2, i);
            ViewDataBindingAdaptersKt.setHeight(this.ivStaticStraightPlot3, i2);
            ViewDataBindingAdaptersKt.setWidth(this.ivStaticStraightPlot3, i);
            ViewDataBindingAdaptersKt.setHeight(this.ivStaticStraightPlot4, i2);
            ViewDataBindingAdaptersKt.setWidth(this.ivStaticStraightPlot4, i);
            ViewDataBindingAdaptersKt.setHeight(this.ivStaticTeePipeLong, i2);
            ViewDataBindingAdaptersKt.setWidth(this.ivStaticTeePipeLong, oneHundredThirtyTwo);
            ViewDataBindingAdaptersKt.setHeight(this.ivStraightDropArea1, i2);
            ViewDataBindingAdaptersKt.setWidth(this.ivStraightDropArea1, i);
            ViewDataBindingAdaptersKt.setHeight(this.ivStraightDropArea2, i);
            ViewDataBindingAdaptersKt.setWidth(this.ivStraightDropArea2, i2);
            ViewDataBindingAdaptersKt.setHeight(this.ivStraightPipeTopPlot, i2);
            ViewDataBindingAdaptersKt.setWidth(this.ivStraightPipeTopPlot, i);
            ViewDataBindingAdaptersKt.setHeight(this.ivStraightPipeTopPlot1, i2);
            ViewDataBindingAdaptersKt.setWidth(this.ivStraightPipeTopPlot1, i);
            ViewDataBindingAdaptersKt.setHeight(this.ivStraightPipeTopPlot2, i2);
            ViewDataBindingAdaptersKt.setWidth(this.ivStraightPipeTopPlot2, i);
        }
    }
}
