package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;

/* loaded from: classes.dex */
public final class InventoryPlayersStateItemBinding implements ViewBinding {

    @NonNull
    public final ProgressBar invItemsProgressBar;

    @NonNull
    public final ImageView invStateItemIcon;

    @NonNull
    public final ConstraintLayout rootView;

    public InventoryPlayersStateItemBinding(@NonNull ConstraintLayout rootView, @NonNull ProgressBar invItemsProgressBar, @NonNull ImageView invStateItemIcon) {
        this.rootView = rootView;
        this.invItemsProgressBar = invItemsProgressBar;
        this.invStateItemIcon = invStateItemIcon;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static InventoryPlayersStateItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static InventoryPlayersStateItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.inventory_players_state_item, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static InventoryPlayersStateItemBinding bind(@NonNull View rootView) {
        int i = R.id.inv_items_progress_bar;
        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.inv_items_progress_bar);
        if (progressBar != null) {
            i = R.id.inv_state_item_icon;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.inv_state_item_icon);
            if (imageView != null) {
                return new InventoryPlayersStateItemBinding((ConstraintLayout) rootView, progressBar, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
