package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;

/* loaded from: classes.dex */
public final class InventoryItemInSlotBinding implements ViewBinding {

    @NonNull
    public final ImageView iconTelephone;

    @NonNull
    public final View invSlotActiveBg;

    @NonNull
    public final ImageView playersItem;

    @NonNull
    public final View playersItemBg;

    @NonNull
    public final ConstraintLayout rootView;

    public InventoryItemInSlotBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView iconTelephone, @NonNull View invSlotActiveBg, @NonNull ImageView playersItem, @NonNull View playersItemBg) {
        this.rootView = rootView;
        this.iconTelephone = iconTelephone;
        this.invSlotActiveBg = invSlotActiveBg;
        this.playersItem = playersItem;
        this.playersItemBg = playersItemBg;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static InventoryItemInSlotBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static InventoryItemInSlotBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.inventory_item_in_slot, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static InventoryItemInSlotBinding bind(@NonNull View rootView) {
        int i = R.id.icon_telephone;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.icon_telephone);
        if (imageView != null) {
            i = R.id.inv_slot_active_bg;
            View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.inv_slot_active_bg);
            if (viewFindChildViewById != null) {
                i = R.id.players_item;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.players_item);
                if (imageView2 != null) {
                    i = R.id.players_item_bg;
                    View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.players_item_bg);
                    if (viewFindChildViewById2 != null) {
                        return new InventoryItemInSlotBinding((ConstraintLayout) rootView, imageView, viewFindChildViewById, imageView2, viewFindChildViewById2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
