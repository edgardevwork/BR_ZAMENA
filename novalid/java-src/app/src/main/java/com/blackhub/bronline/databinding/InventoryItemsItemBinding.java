package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;

/* loaded from: classes.dex */
public final class InventoryItemsItemBinding implements ViewBinding {

    @NonNull
    public final View bgItemsAura;

    @NonNull
    public final View bgMask;

    @NonNull
    public final ImageView iconIfNoActive;

    @NonNull
    public final View invBgItem;

    @NonNull
    public final View invItemActiveBg;

    @NonNull
    public final ImageView invItemItemsIcon;

    @NonNull
    public final TextView invValueItems;

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final View testBottomFill;

    @NonNull
    public final TextView textIfNotActual;

    public InventoryItemsItemBinding(@NonNull ConstraintLayout rootView, @NonNull View bgItemsAura, @NonNull View bgMask, @NonNull ImageView iconIfNoActive, @NonNull View invBgItem, @NonNull View invItemActiveBg, @NonNull ImageView invItemItemsIcon, @NonNull TextView invValueItems, @NonNull View testBottomFill, @NonNull TextView textIfNotActual) {
        this.rootView = rootView;
        this.bgItemsAura = bgItemsAura;
        this.bgMask = bgMask;
        this.iconIfNoActive = iconIfNoActive;
        this.invBgItem = invBgItem;
        this.invItemActiveBg = invItemActiveBg;
        this.invItemItemsIcon = invItemItemsIcon;
        this.invValueItems = invValueItems;
        this.testBottomFill = testBottomFill;
        this.textIfNotActual = textIfNotActual;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static InventoryItemsItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static InventoryItemsItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.inventory_items_item, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static InventoryItemsItemBinding bind(@NonNull View rootView) {
        int i = R.id.bg_items_aura;
        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.bg_items_aura);
        if (viewFindChildViewById != null) {
            i = R.id.bg_mask;
            View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.bg_mask);
            if (viewFindChildViewById2 != null) {
                i = R.id.icon_if_no_active;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.icon_if_no_active);
                if (imageView != null) {
                    i = R.id.inv_bg_item;
                    View viewFindChildViewById3 = ViewBindings.findChildViewById(rootView, R.id.inv_bg_item);
                    if (viewFindChildViewById3 != null) {
                        i = R.id.inv_item_active_bg;
                        View viewFindChildViewById4 = ViewBindings.findChildViewById(rootView, R.id.inv_item_active_bg);
                        if (viewFindChildViewById4 != null) {
                            i = R.id.inv_item_items_icon;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.inv_item_items_icon);
                            if (imageView2 != null) {
                                i = R.id.inv_value_items;
                                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.inv_value_items);
                                if (textView != null) {
                                    i = R.id.test_bottom_fill;
                                    View viewFindChildViewById5 = ViewBindings.findChildViewById(rootView, R.id.test_bottom_fill);
                                    if (viewFindChildViewById5 != null) {
                                        i = R.id.text_if_not_actual;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_if_not_actual);
                                        if (textView2 != null) {
                                            return new InventoryItemsItemBinding((ConstraintLayout) rootView, viewFindChildViewById, viewFindChildViewById2, imageView, viewFindChildViewById3, viewFindChildViewById4, imageView2, textView, viewFindChildViewById5, textView2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
