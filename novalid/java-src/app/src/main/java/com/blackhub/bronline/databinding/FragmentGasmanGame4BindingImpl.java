package com.blackhub.bronline.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Barrier;
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
public class FragmentGasmanGame4BindingImpl extends FragmentGasmanGame4Binding {

    @Nullable
    public static final ViewDataBinding.IncludedLayouts sIncludes = null;

    @Nullable
    public static final SparseIntArray sViewsWithIds;
    public long mDirtyFlags;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.guidelineVertical16Percent, 17);
        sparseIntArray.put(R.id.tvTopPlot, 18);
        sparseIntArray.put(R.id.ivStraightPipeMiddlePlot, 19);
        sparseIntArray.put(R.id.tvMiddlePlot, 20);
        sparseIntArray.put(R.id.tvBotPlot, 21);
        sparseIntArray.put(R.id.ivAnimationGas, 22);
        sparseIntArray.put(R.id.guidelineHorizontalTop, 23);
        sparseIntArray.put(R.id.barrierVerticalTop, 24);
        sparseIntArray.put(R.id.ivStartPoint, 25);
        sparseIntArray.put(R.id.ivStartArrows, 26);
        sparseIntArray.put(R.id.ivEndArrows1, 27);
        sparseIntArray.put(R.id.ivEndPoint, 28);
    }

    public FragmentGasmanGame4BindingImpl(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 29, sIncludes, sViewsWithIds));
    }

    public FragmentGasmanGame4BindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1, (Barrier) bindings[24], (ConstraintLayout) bindings[0], (Guideline) bindings[23], (Guideline) bindings[17], (ImageView) bindings[22], (ImageView) bindings[12], (ImageView) bindings[16], (ImageView) bindings[1], (ImageView) bindings[2], (ImageView) bindings[3], (ImageView) bindings[10], (ImageView) bindings[11], (ImageView) bindings[15], (ImageView) bindings[27], (ImageView) bindings[28], (ImageView) bindings[26], (ImageView) bindings[25], (ImageView) bindings[19], (ImageView) bindings[4], (ImageView) bindings[8], (ImageView) bindings[13], (ImageView) bindings[5], (ImageView) bindings[6], (ImageView) bindings[7], (ImageView) bindings[9], (ImageView) bindings[14], (TextView) bindings[21], (TextView) bindings[20], (TextView) bindings[18]);
        this.mDirtyFlags = -1L;
        this.containerRoot.setTag(null);
        this.ivCornerDropArea1.setTag(null);
        this.ivCornerDropArea2.setTag(null);
        this.ivCornerPipeTopPlot.setTag(null);
        this.ivCornerPipeTopPlot1.setTag(null);
        this.ivCornerPipeTopPlot2.setTag(null);
        this.ivCornerStaticPipe1.setTag(null);
        this.ivCornerStaticPipe2.setTag(null);
        this.ivCornerStaticPipe3.setTag(null);
        this.ivStraightPipeMiddlePlot1.setTag(null);
        this.ivStraightStaticPipe1.setTag(null);
        this.ivStraightStaticPipe2.setTag(null);
        this.ivTeePipeBotPlot.setTag(null);
        this.ivTeePipeBotPlot1.setTag(null);
        this.ivTeePipeBotPlot2.setTag(null);
        this.ivTeePipeDropArea1.setTag(null);
        this.ivTeePipeDropArea2.setTag(null);
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

    @Override // com.blackhub.bronline.databinding.FragmentGasmanGame4Binding
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

    /* JADX WARN: Removed duplicated region for block: B:48:0x0045  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void executeBindings() {
        long j;
        int oneHundred;
        int i;
        int i2;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        GasmanParentViewModel gasmanParentViewModel = this.mVm;
        long j2 = j & 7;
        int i3 = 0;
        if (j2 != 0) {
            StateFlow<GasmanParentUIState> uiState = gasmanParentViewModel != null ? gasmanParentViewModel.getUiState() : null;
            ViewDataBindingKtx.updateStateFlowRegistration(this, 0, uiState);
            GasmanParentUIState value = uiState != null ? uiState.getValue() : null;
            GasmanSizesItem gasmanSizesItem = value != null ? value.getGasmanSizesItem() : null;
            if (gasmanSizesItem != null) {
                int fortyFour = gasmanSizesItem.getFortyFour();
                int oneHundredThirty = gasmanSizesItem.getOneHundredThirty();
                int eightyEight = gasmanSizesItem.getEightyEight();
                oneHundred = gasmanSizesItem.getOneHundred();
                i = fortyFour;
                i3 = eightyEight;
                i2 = oneHundredThirty;
            } else {
                oneHundred = 0;
                i = 0;
                i2 = 0;
            }
        }
        if (j2 != 0) {
            ViewDataBindingAdaptersKt.setHeight(this.ivCornerDropArea1, i3);
            ViewDataBindingAdaptersKt.setWidth(this.ivCornerDropArea1, i3);
            ViewDataBindingAdaptersKt.setHeight(this.ivCornerDropArea2, i3);
            ViewDataBindingAdaptersKt.setWidth(this.ivCornerDropArea2, i3);
            ViewDataBindingAdaptersKt.setHeight(this.ivCornerPipeTopPlot, i3);
            ViewDataBindingAdaptersKt.setWidth(this.ivCornerPipeTopPlot, i3);
            ViewDataBindingAdaptersKt.setHeight(this.ivCornerPipeTopPlot1, i3);
            ViewDataBindingAdaptersKt.setWidth(this.ivCornerPipeTopPlot1, i3);
            ViewDataBindingAdaptersKt.setHeight(this.ivCornerPipeTopPlot2, i3);
            ViewDataBindingAdaptersKt.setWidth(this.ivCornerPipeTopPlot2, i3);
            ViewDataBindingAdaptersKt.setHeight(this.ivCornerStaticPipe1, i3);
            ViewDataBindingAdaptersKt.setWidth(this.ivCornerStaticPipe1, i3);
            ViewDataBindingAdaptersKt.setHeight(this.ivCornerStaticPipe2, i3);
            ViewDataBindingAdaptersKt.setWidth(this.ivCornerStaticPipe2, i3);
            ViewDataBindingAdaptersKt.setHeight(this.ivCornerStaticPipe3, i3);
            ViewDataBindingAdaptersKt.setWidth(this.ivCornerStaticPipe3, i3);
            ViewDataBindingAdaptersKt.setHeight(this.ivStraightPipeMiddlePlot1, oneHundred);
            ViewDataBindingAdaptersKt.setWidth(this.ivStraightPipeMiddlePlot1, i3);
            ViewDataBindingAdaptersKt.setHeight(this.ivStraightStaticPipe1, i);
            ViewDataBindingAdaptersKt.setWidth(this.ivStraightStaticPipe1, i3);
            ViewDataBindingAdaptersKt.setWidth(this.ivStraightStaticPipe2, i);
            ViewDataBindingAdaptersKt.setHeight(this.ivStraightStaticPipe2, oneHundred);
            ViewDataBindingAdaptersKt.setHeight(this.ivTeePipeBotPlot, i3);
            ViewDataBindingAdaptersKt.setWidth(this.ivTeePipeBotPlot, i2);
            ViewDataBindingAdaptersKt.setHeight(this.ivTeePipeBotPlot1, i3);
            ViewDataBindingAdaptersKt.setWidth(this.ivTeePipeBotPlot1, i2);
            ViewDataBindingAdaptersKt.setHeight(this.ivTeePipeBotPlot2, i3);
            ViewDataBindingAdaptersKt.setWidth(this.ivTeePipeBotPlot2, i2);
            ViewDataBindingAdaptersKt.setHeight(this.ivTeePipeDropArea1, oneHundred);
            ViewDataBindingAdaptersKt.setWidth(this.ivTeePipeDropArea1, i3);
            ViewDataBindingAdaptersKt.setHeight(this.ivTeePipeDropArea2, i3);
            ViewDataBindingAdaptersKt.setWidth(this.ivTeePipeDropArea2, i2);
        }
    }
}
