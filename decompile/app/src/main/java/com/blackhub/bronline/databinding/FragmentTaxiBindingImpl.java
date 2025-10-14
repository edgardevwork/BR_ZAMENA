package com.blackhub.bronline.databinding;

import android.text.SpannedString;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewDataBindingKtx;
import androidx.lifecycle.LifecycleOwner;
import com.blackhub.bronline.game.core.utils.ViewDataBindingAdaptersKt;
import com.blackhub.bronline.game.gui.taxi.TaxiUiState;
import com.blackhub.bronline.game.gui.taxi.TaxiViewModel;
import com.blackhub.bronline.generated.callback.OnClickListener;
import com.bless.client.R;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes3.dex */
public class FragmentTaxiBindingImpl extends FragmentTaxiBinding implements OnClickListener.Listener {

    @Nullable
    public static final ViewDataBinding.IncludedLayouts sIncludes;

    @Nullable
    public static final SparseIntArray sViewsWithIds;

    @Nullable
    public final View.OnClickListener mCallback1;

    @Nullable
    public final View.OnClickListener mCallback2;

    @Nullable
    public final View.OnClickListener mCallback3;

    @Nullable
    public final View.OnClickListener mCallback4;

    @Nullable
    public final View.OnClickListener mCallback5;
    public long mDirtyFlags;

    @NonNull
    public final FrameLayout mboundView0;

    @NonNull
    public final FrameLayout mboundView1;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(21);
        sIncludes = includedLayouts;
        includedLayouts.setIncludes(1, new String[]{"br_taxi_comment"}, new int[]{16}, new int[]{R.layout.br_taxi_comment});
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.view5, 17);
        sparseIntArray.put(R.id.br_taxi_type, 18);
        sparseIntArray.put(R.id.br_taxi_order_text, 19);
        sparseIntArray.put(R.id.br_taxi_vborder, 20);
    }

    public FragmentTaxiBindingImpl(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 21, sIncludes, sViewsWithIds));
    }

    public FragmentTaxiBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2, (BrTaxiCommentBinding) bindings[16], (AppCompatButton) bindings[14], (TextView) bindings[5], (AppCompatButton) bindings[2], (ImageView) bindings[15], (TextView) bindings[4], (TextView) bindings[10], (TextView) bindings[8], (AppCompatButton) bindings[12], (TextView) bindings[19], (AppCompatButton) bindings[13], (TextView) bindings[9], (TextView) bindings[3], (TextView) bindings[7], (TextView) bindings[11], (TextView) bindings[18], (TextView) bindings[6], (View) bindings[20], (View) bindings[17]);
        this.mDirtyFlags = -1L;
        setContainedBinding(this.blockTaxiComment);
        this.brTaxiAccept.setTag(null);
        this.brTaxiCash.setTag(null);
        this.brTaxiClose.setTag(null);
        this.brTaxiComm.setTag(null);
        this.brTaxiCountOrders.setTag(null);
        this.brTaxiDist.setTag(null);
        this.brTaxiEnd.setTag(null);
        this.brTaxiNext.setTag(null);
        this.brTaxiPrev.setTag(null);
        this.brTaxiPrice.setTag(null);
        this.brTaxiRating.setTag(null);
        this.brTaxiStart.setTag(null);
        this.brTaxiTime.setTag(null);
        this.brTaxiTypeText.setTag(null);
        FrameLayout frameLayout = (FrameLayout) bindings[0];
        this.mboundView0 = frameLayout;
        frameLayout.setTag(null);
        FrameLayout frameLayout2 = (FrameLayout) bindings[1];
        this.mboundView1 = frameLayout2;
        frameLayout2.setTag(null);
        setRootTag(root);
        this.mCallback4 = new OnClickListener(this, 4);
        this.mCallback2 = new OnClickListener(this, 2);
        this.mCallback5 = new OnClickListener(this, 5);
        this.mCallback3 = new OnClickListener(this, 3);
        this.mCallback1 = new OnClickListener(this, 1);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 8L;
        }
        this.blockTaxiComment.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.mDirtyFlags != 0) {
                    return true;
                }
                return this.blockTaxiComment.hasPendingBindings();
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
        setVm((TaxiViewModel) variable);
        return true;
    }

    @Override // com.blackhub.bronline.databinding.FragmentTaxiBinding
    public void setVm(@Nullable TaxiViewModel Vm) {
        this.mVm = Vm;
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        notifyPropertyChanged(2);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.blockTaxiComment.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        if (localFieldId == 0) {
            return onChangeBlockTaxiComment((BrTaxiCommentBinding) object, fieldId);
        }
        if (localFieldId != 1) {
            return false;
        }
        return onChangeVmUiState((StateFlow) object, fieldId);
    }

    public final boolean onChangeBlockTaxiComment(BrTaxiCommentBinding BlockTaxiComment, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    private boolean onChangeVmUiState(StateFlow<TaxiUiState> VmUiState, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0064  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void executeBindings() {
        long j;
        int commentResId;
        boolean zIsCommentVisible;
        boolean zIsHasComment;
        String str;
        String brTaxiPrice;
        SpannedString brTaxiTime;
        SpannedString brTaxiStart;
        String brTaxiTypeText;
        String brTaxiCountOrders;
        String str2;
        SpannedString spannedString;
        SpannedString spannedString2;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        TaxiViewModel taxiViewModel = this.mVm;
        long j2 = 14 & j;
        if (j2 == 0) {
            commentResId = 0;
            zIsCommentVisible = false;
            zIsHasComment = false;
            str = null;
            brTaxiPrice = null;
            brTaxiTime = null;
            brTaxiStart = null;
            brTaxiTypeText = null;
            brTaxiCountOrders = null;
            str2 = null;
            spannedString = null;
            spannedString2 = null;
        } else {
            StateFlow<TaxiUiState> uiState = taxiViewModel != null ? taxiViewModel.getUiState() : null;
            ViewDataBindingKtx.updateStateFlowRegistration(this, 1, uiState);
            TaxiUiState value = uiState != null ? uiState.getValue() : null;
            if (value != null) {
                brTaxiPrice = value.getBrTaxiPrice();
                commentResId = value.getCommentResId();
                brTaxiTime = value.getBrTaxiTime();
                zIsHasComment = value.isHasComment();
                brTaxiStart = value.getBrTaxiStart();
                brTaxiTypeText = value.getBrTaxiTypeText();
                brTaxiCountOrders = value.getBrTaxiCountOrders();
                String brTaxiCash = value.getBrTaxiCash();
                String brTaxiRating = value.getBrTaxiRating();
                SpannedString brTaxiEnd = value.getBrTaxiEnd();
                SpannedString brTaxiDist = value.getBrTaxiDist();
                zIsCommentVisible = value.isCommentVisible();
                str = brTaxiCash;
                str2 = brTaxiRating;
                spannedString = brTaxiEnd;
                spannedString2 = brTaxiDist;
            }
        }
        if ((j & 12) != 0) {
            this.blockTaxiComment.setData(taxiViewModel);
        }
        if (j2 != 0) {
            ViewDataBindingAdaptersKt.setVisible(this.blockTaxiComment.getRoot(), zIsCommentVisible);
            this.brTaxiCash.setText(str);
            this.brTaxiComm.setEnabled(zIsHasComment);
            ViewDataBindingAdaptersKt.setImageResource(this.brTaxiComm, commentResId);
            this.brTaxiCountOrders.setText(brTaxiCountOrders);
            this.brTaxiDist.setText(spannedString2);
            this.brTaxiEnd.setText(spannedString);
            this.brTaxiPrice.setText(brTaxiPrice);
            this.brTaxiRating.setText(str2);
            this.brTaxiStart.setText(brTaxiStart);
            this.brTaxiTime.setText(brTaxiTime);
            this.brTaxiTypeText.setText(brTaxiTypeText);
        }
        if ((j & 8) != 0) {
            ViewDataBindingAdaptersKt.setOnClickListenerWithAnimate(this.brTaxiAccept, this.mCallback4, null);
            ViewDataBindingAdaptersKt.setOnClickListenerWithAnimate(this.brTaxiClose, this.mCallback1, null);
            ViewDataBindingAdaptersKt.setOnClickListenerWithAnimate(this.brTaxiComm, this.mCallback5, null);
            ViewDataBindingAdaptersKt.setOnClickListenerWithAnimate(this.brTaxiNext, this.mCallback2, null);
            ViewDataBindingAdaptersKt.setOnClickListenerWithAnimate(this.brTaxiPrev, this.mCallback3, null);
        }
        ViewDataBinding.executeBindingsOn(this.blockTaxiComment);
    }

    @Override // com.blackhub.bronline.generated.callback.OnClickListener.Listener
    public final void _internalCallbackOnClick(int sourceId, View callbackArg_0) {
        TaxiViewModel taxiViewModel;
        if (sourceId == 1) {
            TaxiViewModel taxiViewModel2 = this.mVm;
            if (taxiViewModel2 != null) {
                taxiViewModel2.sendCloseScreen();
                return;
            }
            return;
        }
        if (sourceId == 2) {
            TaxiViewModel taxiViewModel3 = this.mVm;
            if (taxiViewModel3 != null) {
                taxiViewModel3.sendNext();
                return;
            }
            return;
        }
        if (sourceId == 3) {
            TaxiViewModel taxiViewModel4 = this.mVm;
            if (taxiViewModel4 != null) {
                taxiViewModel4.sendPrew();
                return;
            }
            return;
        }
        if (sourceId != 4) {
            if (sourceId == 5 && (taxiViewModel = this.mVm) != null) {
                taxiViewModel.setCommentVisible(true);
                return;
            }
            return;
        }
        TaxiViewModel taxiViewModel5 = this.mVm;
        if (taxiViewModel5 != null) {
            taxiViewModel5.sendAccept();
        }
    }
}
