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

/* loaded from: classes3.dex */
public final class MenuActionItemBinding implements ViewBinding {

    @NonNull
    public final ImageView itemMenuImage;

    @NonNull
    public final TextView itemMenuNameButton;

    @NonNull
    public final ConstraintLayout rootView;

    public MenuActionItemBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView itemMenuImage, @NonNull TextView itemMenuNameButton) {
        this.rootView = rootView;
        this.itemMenuImage = itemMenuImage;
        this.itemMenuNameButton = itemMenuNameButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static MenuActionItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static MenuActionItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.menu_action_item, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static MenuActionItemBinding bind(@NonNull View rootView) {
        int i = R.id.item_menu_image;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.item_menu_image);
        if (imageView != null) {
            i = R.id.item_menu_name_button;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.item_menu_name_button);
            if (textView != null) {
                return new MenuActionItemBinding((ConstraintLayout) rootView, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
