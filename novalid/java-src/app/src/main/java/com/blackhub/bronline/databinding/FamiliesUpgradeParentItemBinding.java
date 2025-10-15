package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;

/* loaded from: classes.dex */
public final class FamiliesUpgradeParentItemBinding implements ViewBinding {

    @NonNull
    public final TextView potential;

    @NonNull
    public final TextView potentialValue;

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final RecyclerView upgradeValues;

    public FamiliesUpgradeParentItemBinding(@NonNull ConstraintLayout rootView, @NonNull TextView potential, @NonNull TextView potentialValue, @NonNull RecyclerView upgradeValues) {
        this.rootView = rootView;
        this.potential = potential;
        this.potentialValue = potentialValue;
        this.upgradeValues = upgradeValues;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FamiliesUpgradeParentItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FamiliesUpgradeParentItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.families_upgrade_parent_item, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static FamiliesUpgradeParentItemBinding bind(@NonNull View rootView) {
        int i = R.id.potential;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.potential);
        if (textView != null) {
            i = R.id.potential_value;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.potential_value);
            if (textView2 != null) {
                i = R.id.upgrade_values;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.upgrade_values);
                if (recyclerView != null) {
                    return new FamiliesUpgradeParentItemBinding((ConstraintLayout) rootView, textView, textView2, recyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
