package com.blackhub.bronline.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.blackhub.bronline.game.gui.menupausesettingandmap.p016ui.CustomSliderWithFourDots;
import com.bless.client.R;

/* loaded from: classes3.dex */
public class FragmentMenuSettingWinterBindingImpl extends FragmentMenuSettingWinterBinding {

    @Nullable
    public static final ViewDataBinding.IncludedLayouts sIncludes = null;

    @Nullable
    public static final SparseIntArray sViewsWithIds;
    public long mDirtyFlags;

    @NonNull
    public final NestedScrollView mboundView0;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        return true;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.viewNewMenuSettingWinter, 1);
        sparseIntArray.put(R.id.tvNewMenuSettingWinterShowIntensityTitle, 2);
        sparseIntArray.put(R.id.tvNewMenuSettingShowIntensityValue, 3);
        sparseIntArray.put(R.id.sbNewMenuSettingWinterShowIntensity, 4);
        sparseIntArray.put(R.id.tvNewMenuSettingWinterSlip, 5);
        sparseIntArray.put(R.id.switchNewMenuSettingWinter, 6);
    }

    public FragmentMenuSettingWinterBindingImpl(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }

    public FragmentMenuSettingWinterBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (CustomSliderWithFourDots) bindings[4], (SwitchCompat) bindings[6], (TextView) bindings[3], (TextView) bindings[2], (TextView) bindings[5], (View) bindings[1]);
        this.mDirtyFlags = -1L;
        NestedScrollView nestedScrollView = (NestedScrollView) bindings[0];
        this.mboundView0 = nestedScrollView;
        nestedScrollView.setTag(null);
        setRootTag(root);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 1L;
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
    public void executeBindings() {
        synchronized (this) {
            this.mDirtyFlags = 0L;
        }
    }
}
