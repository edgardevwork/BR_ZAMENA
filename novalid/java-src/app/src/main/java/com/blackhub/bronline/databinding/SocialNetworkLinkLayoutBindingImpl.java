package com.blackhub.bronline.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.game.gui.socialnetworklink.viewmodel.SocialNetworkLinkViewModel;
import com.bless.client.R;

/* loaded from: classes3.dex */
public class SocialNetworkLinkLayoutBindingImpl extends SocialNetworkLinkLayoutBinding {

    @Nullable
    public static final ViewDataBinding.IncludedLayouts sIncludes = null;

    @Nullable
    public static final SparseIntArray sViewsWithIds;
    public long mDirtyFlags;

    @NonNull
    public final ConstraintLayout mboundView0;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.social_network_link_button_close, 1);
        sparseIntArray.put(R.id.social_network_link_title, 2);
        sparseIntArray.put(R.id.social_network_link_description, 3);
        sparseIntArray.put(R.id.social_network_link_presents_title, 4);
        sparseIntArray.put(R.id.social_network_link_vip_present_bg, 5);
        sparseIntArray.put(R.id.social_network_link_add, 6);
        sparseIntArray.put(R.id.social_network_link_money_present_bg, 7);
        sparseIntArray.put(R.id.social_network_link_buttons, 8);
        sparseIntArray.put(R.id.social_network_link_checkbox, 9);
        sparseIntArray.put(R.id.social_network_link_checkbox_text, 10);
    }

    public SocialNetworkLinkLayoutBindingImpl(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }

    public SocialNetworkLinkLayoutBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (View) bindings[6], (AppCompatButton) bindings[1], (RecyclerView) bindings[8], (AppCompatCheckBox) bindings[9], (TextView) bindings[10], (TextView) bindings[3], (View) bindings[7], (TextView) bindings[4], (View) bindings[2], (View) bindings[5]);
        this.mDirtyFlags = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.mboundView0 = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(root);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 2L;
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
        setVm((SocialNetworkLinkViewModel) variable);
        return true;
    }

    @Override // com.blackhub.bronline.databinding.SocialNetworkLinkLayoutBinding
    public void setVm(@Nullable SocialNetworkLinkViewModel Vm) {
        this.mVm = Vm;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.mDirtyFlags = 0L;
        }
    }
}
