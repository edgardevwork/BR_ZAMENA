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
public class FragmentGasmanGame6BindingImpl extends FragmentGasmanGame6Binding {

    @Nullable
    public static final ViewDataBinding.IncludedLayouts sIncludes = null;

    @Nullable
    public static final SparseIntArray sViewsWithIds;
    public long mDirtyFlags;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.guidelineVertical16Percent, 19);
        sparseIntArray.put(R.id.tvTopPlot, 20);
        sparseIntArray.put(R.id.tvMiddlePlot, 21);
        sparseIntArray.put(R.id.tvBotPlot, 22);
        sparseIntArray.put(R.id.ivAnimationGas, 23);
        sparseIntArray.put(R.id.guidelineHorizontalTop, 24);
        sparseIntArray.put(R.id.ivStartPoint, 25);
        sparseIntArray.put(R.id.ivStartArrows, 26);
        sparseIntArray.put(R.id.ivEndArrows1, 27);
        sparseIntArray.put(R.id.ivEndArrows2, 28);
        sparseIntArray.put(R.id.ivEndPoint, 29);
    }

    public FragmentGasmanGame6BindingImpl(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 30, sIncludes, sViewsWithIds));
    }

    public FragmentGasmanGame6BindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1, (ConstraintLayout) bindings[0], (Guideline) bindings[24], (Guideline) bindings[19], (ImageView) bindings[23], (ImageView) bindings[12], (ImageView) bindings[1], (ImageView) bindings[2], (ImageView) bindings[14], (ImageView) bindings[15], (ImageView) bindings[17], (ImageView) bindings[27], (ImageView) bindings[28], (ImageView) bindings[29], (ImageView) bindings[26], (ImageView) bindings[25], (ImageView) bindings[10], (ImageView) bindings[18], (ImageView) bindings[3], (ImageView) bindings[4], (ImageView) bindings[5], (ImageView) bindings[6], (ImageView) bindings[7], (ImageView) bindings[8], (ImageView) bindings[13], (ImageView) bindings[16], (ImageView) bindings[11], (TextView) bindings[22], (TextView) bindings[21], (TextView) bindings[20], (View) bindings[9]);
        this.mDirtyFlags = -1L;
        this.containerRoot.setTag(null);
        this.ivCornerDropArea1.setTag(null);
        this.ivCornerPipeTopPlot.setTag(null);
        this.ivCornerPipeTopPlot1.setTag(null);
        this.ivCornerStaticPipe1.setTag(null);
        this.ivCornerStaticPipe2.setTag(null);
        this.ivCornerStaticPipe3.setTag(null);
        this.ivStraightDropArea1.setTag(null);
        this.ivStraightDropArea2.setTag(null);
        this.ivStraightPipeMiddlePlot.setTag(null);
        this.ivStraightPipeMiddlePlot1.setTag(null);
        this.ivStraightPipeMiddlePlot2.setTag(null);
        this.ivTeePipeBotPlot.setTag(null);
        this.ivTeePipeBotPlot1.setTag(null);
        this.ivTeePipeBotPlot2.setTag(null);
        this.ivTeePipeDropArea1.setTag(null);
        this.ivTeePipeDropArea2.setTag(null);
        this.ivTeeStaticPipe1.setTag(null);
        this.vStub.setTag(null);
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

    @Override // com.blackhub.bronline.databinding.FragmentGasmanGame6Binding
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
        int oneHundredThirty;
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
                oneHundredThirty = gasmanSizesItem.getOneHundredThirty();
                int eightyEight = gasmanSizesItem.getEightyEight();
                i = fortyFour;
                i2 = eightyEight;
            } else {
                i = 0;
                oneHundredThirty = 0;
            }
        }
        if (j2 != 0) {
            ViewDataBindingAdaptersKt.setHeight(this.ivCornerDropArea1, i2);
            ViewDataBindingAdaptersKt.setWidth(this.ivCornerDropArea1, i2);
            ViewDataBindingAdaptersKt.setHeight(this.ivCornerPipeTopPlot, i2);
            ViewDataBindingAdaptersKt.setWidth(this.ivCornerPipeTopPlot, i2);
            ViewDataBindingAdaptersKt.setHeight(this.ivCornerPipeTopPlot1, i2);
            ViewDataBindingAdaptersKt.setWidth(this.ivCornerPipeTopPlot1, i2);
            ViewDataBindingAdaptersKt.setHeight(this.ivCornerStaticPipe1, i2);
            ViewDataBindingAdaptersKt.setWidth(this.ivCornerStaticPipe1, i2);
            ViewDataBindingAdaptersKt.setHeight(this.ivCornerStaticPipe2, i2);
            ViewDataBindingAdaptersKt.setWidth(this.ivCornerStaticPipe2, i2);
            ViewDataBindingAdaptersKt.setHeight(this.ivCornerStaticPipe3, i2);
            ViewDataBindingAdaptersKt.setWidth(this.ivCornerStaticPipe3, i2);
            ViewDataBindingAdaptersKt.setHeight(this.ivStraightDropArea1, oneHundredThirty);
            ViewDataBindingAdaptersKt.setWidth(this.ivStraightDropArea1, i);
            ViewDataBindingAdaptersKt.setHeight(this.ivStraightDropArea2, oneHundredThirty);
            ViewDataBindingAdaptersKt.setWidth(this.ivStraightDropArea2, i);
            ViewDataBindingAdaptersKt.setHeight(this.ivStraightPipeMiddlePlot, i);
            ViewDataBindingAdaptersKt.setWidth(this.ivStraightPipeMiddlePlot, oneHundredThirty);
            ViewDataBindingAdaptersKt.setHeight(this.ivStraightPipeMiddlePlot1, i);
            ViewDataBindingAdaptersKt.setWidth(this.ivStraightPipeMiddlePlot1, oneHundredThirty);
            ViewDataBindingAdaptersKt.setHeight(this.ivStraightPipeMiddlePlot2, i);
            ViewDataBindingAdaptersKt.setWidth(this.ivStraightPipeMiddlePlot2, oneHundredThirty);
            ViewDataBindingAdaptersKt.setHeight(this.ivTeePipeBotPlot, i2);
            ViewDataBindingAdaptersKt.setWidth(this.ivTeePipeBotPlot, oneHundredThirty);
            ViewDataBindingAdaptersKt.setHeight(this.ivTeePipeBotPlot1, i2);
            ViewDataBindingAdaptersKt.setWidth(this.ivTeePipeBotPlot1, oneHundredThirty);
            ViewDataBindingAdaptersKt.setHeight(this.ivTeePipeBotPlot2, i2);
            ViewDataBindingAdaptersKt.setWidth(this.ivTeePipeBotPlot2, oneHundredThirty);
            ViewDataBindingAdaptersKt.setHeight(this.ivTeePipeDropArea1, i2);
            ViewDataBindingAdaptersKt.setWidth(this.ivTeePipeDropArea1, oneHundredThirty);
            ViewDataBindingAdaptersKt.setHeight(this.ivTeePipeDropArea2, i2);
            ViewDataBindingAdaptersKt.setWidth(this.ivTeePipeDropArea2, oneHundredThirty);
            ViewDataBindingAdaptersKt.setHeight(this.ivTeeStaticPipe1, oneHundredThirty);
            ViewDataBindingAdaptersKt.setWidth(this.ivTeeStaticPipe1, i2);
            ViewDataBindingAdaptersKt.setHeight(this.vStub, i);
            ViewDataBindingAdaptersKt.setWidth(this.vStub, oneHundredThirty);
        }
    }
}
