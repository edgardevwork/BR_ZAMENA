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
public final class FamiliesMenuUpgradeItemBinding implements ViewBinding {

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final TextView upgradeTitle;

    @NonNull
    public final TextView upgradeValue;

    public FamiliesMenuUpgradeItemBinding(@NonNull ConstraintLayout rootView, @NonNull TextView upgradeTitle, @NonNull TextView upgradeValue) {
        this.rootView = rootView;
        this.upgradeTitle = upgradeTitle;
        this.upgradeValue = upgradeValue;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FamiliesMenuUpgradeItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FamiliesMenuUpgradeItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.families_menu_upgrade_item, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static FamiliesMenuUpgradeItemBinding bind(@NonNull View rootView) {
        int i = R.id.upgrade_title;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.upgrade_title);
        if (textView != null) {
            i = R.id.upgrade_value;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.upgrade_value);
            if (textView2 != null) {
                return new FamiliesMenuUpgradeItemBinding((ConstraintLayout) rootView, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
