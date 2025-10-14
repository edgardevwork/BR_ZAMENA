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
public final class NewMenuPauseActionButtonItemBinding implements ViewBinding {

    @NonNull
    public final View newMenuPauseActionButtonsAura;

    @NonNull
    public final ImageView newMenuPauseActionButtonsIcon;

    @NonNull
    public final TextView newMenuPauseActionButtonsText;

    @NonNull
    public final ConstraintLayout rootView;

    public NewMenuPauseActionButtonItemBinding(@NonNull ConstraintLayout rootView, @NonNull View newMenuPauseActionButtonsAura, @NonNull ImageView newMenuPauseActionButtonsIcon, @NonNull TextView newMenuPauseActionButtonsText) {
        this.rootView = rootView;
        this.newMenuPauseActionButtonsAura = newMenuPauseActionButtonsAura;
        this.newMenuPauseActionButtonsIcon = newMenuPauseActionButtonsIcon;
        this.newMenuPauseActionButtonsText = newMenuPauseActionButtonsText;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static NewMenuPauseActionButtonItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static NewMenuPauseActionButtonItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.new_menu_pause_action_button_item, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static NewMenuPauseActionButtonItemBinding bind(@NonNull View rootView) {
        int i = R.id.new_menu_pause_action_buttons_aura;
        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.new_menu_pause_action_buttons_aura);
        if (viewFindChildViewById != null) {
            i = R.id.new_menu_pause_action_buttons_icon;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.new_menu_pause_action_buttons_icon);
            if (imageView != null) {
                i = R.id.new_menu_pause_action_buttons_text;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.new_menu_pause_action_buttons_text);
                if (textView != null) {
                    return new NewMenuPauseActionButtonItemBinding((ConstraintLayout) rootView, viewFindChildViewById, imageView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
