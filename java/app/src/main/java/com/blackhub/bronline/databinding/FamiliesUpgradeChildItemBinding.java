package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;

/* loaded from: classes.dex */
public final class FamiliesUpgradeChildItemBinding implements ViewBinding {

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final TextView titleUpgrade;

    @NonNull
    public final TextView valueUpgrade;

    public FamiliesUpgradeChildItemBinding(@NonNull ConstraintLayout rootView, @NonNull TextView titleUpgrade, @NonNull TextView valueUpgrade) {
        this.rootView = rootView;
        this.titleUpgrade = titleUpgrade;
        this.valueUpgrade = valueUpgrade;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FamiliesUpgradeChildItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FamiliesUpgradeChildItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.families_upgrade_child_item, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static FamiliesUpgradeChildItemBinding bind(@NonNull View rootView) {
        int i = R.id.title_upgrade;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.title_upgrade);
        if (textView != null) {
            i = R.id.value_upgrade;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.value_upgrade);
            if (textView2 != null) {
                return new FamiliesUpgradeChildItemBinding((ConstraintLayout) rootView, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
