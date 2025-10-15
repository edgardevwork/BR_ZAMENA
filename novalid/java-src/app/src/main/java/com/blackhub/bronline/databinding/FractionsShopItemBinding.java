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
public final class FractionsShopItemBinding implements ViewBinding {

    @NonNull
    public final ImageView imageViewBoxImage;

    @NonNull
    public final View mainRootView;

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final TextView textViewPrice;

    @NonNull
    public final TextView textViewTitle;

    public FractionsShopItemBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView imageViewBoxImage, @NonNull View mainRootView, @NonNull TextView textViewPrice, @NonNull TextView textViewTitle) {
        this.rootView = rootView;
        this.imageViewBoxImage = imageViewBoxImage;
        this.mainRootView = mainRootView;
        this.textViewPrice = textViewPrice;
        this.textViewTitle = textViewTitle;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FractionsShopItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FractionsShopItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fractions_shop_item, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static FractionsShopItemBinding bind(@NonNull View rootView) {
        int i = R.id.image_view_box_image;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.image_view_box_image);
        if (imageView != null) {
            i = R.id.main_root_view;
            View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.main_root_view);
            if (viewFindChildViewById != null) {
                i = R.id.text_view_price;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_view_price);
                if (textView != null) {
                    i = R.id.text_view_title;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_view_title);
                    if (textView2 != null) {
                        return new FractionsShopItemBinding((ConstraintLayout) rootView, imageView, viewFindChildViewById, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
