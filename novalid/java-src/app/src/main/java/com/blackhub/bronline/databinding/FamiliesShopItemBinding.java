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
public final class FamiliesShopItemBinding implements ViewBinding {

    @NonNull
    public final View familyShopBgItem;

    @NonNull
    public final ImageView familyShopItemsIcon;

    @NonNull
    public final ImageView iconCurrency;

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final TextView titleShopItem;

    @NonNull
    public final TextView valuePrice;

    public FamiliesShopItemBinding(@NonNull ConstraintLayout rootView, @NonNull View familyShopBgItem, @NonNull ImageView familyShopItemsIcon, @NonNull ImageView iconCurrency, @NonNull TextView titleShopItem, @NonNull TextView valuePrice) {
        this.rootView = rootView;
        this.familyShopBgItem = familyShopBgItem;
        this.familyShopItemsIcon = familyShopItemsIcon;
        this.iconCurrency = iconCurrency;
        this.titleShopItem = titleShopItem;
        this.valuePrice = valuePrice;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FamiliesShopItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FamiliesShopItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.families_shop_item, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static FamiliesShopItemBinding bind(@NonNull View rootView) {
        int i = R.id.family_shop_bg_item;
        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.family_shop_bg_item);
        if (viewFindChildViewById != null) {
            i = R.id.family_shop_items_icon;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.family_shop_items_icon);
            if (imageView != null) {
                i = R.id.icon_currency;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.icon_currency);
                if (imageView2 != null) {
                    i = R.id.title_shop_item;
                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.title_shop_item);
                    if (textView != null) {
                        i = R.id.value_price;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.value_price);
                        if (textView2 != null) {
                            return new FamiliesShopItemBinding((ConstraintLayout) rootView, viewFindChildViewById, imageView, imageView2, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
