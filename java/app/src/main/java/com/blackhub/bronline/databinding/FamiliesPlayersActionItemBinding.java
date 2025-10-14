package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;

/* loaded from: classes.dex */
public final class FamiliesPlayersActionItemBinding implements ViewBinding {

    @NonNull
    public final TextView actionsTitle;

    @NonNull
    public final TextView actionsValue;

    @NonNull
    public final AppCompatButton buttonKick;

    @NonNull
    public final ImageView buttonMinusAction;

    @NonNull
    public final ImageView buttonPlusAction;

    @NonNull
    public final ConstraintLayout rootView;

    public FamiliesPlayersActionItemBinding(@NonNull ConstraintLayout rootView, @NonNull TextView actionsTitle, @NonNull TextView actionsValue, @NonNull AppCompatButton buttonKick, @NonNull ImageView buttonMinusAction, @NonNull ImageView buttonPlusAction) {
        this.rootView = rootView;
        this.actionsTitle = actionsTitle;
        this.actionsValue = actionsValue;
        this.buttonKick = buttonKick;
        this.buttonMinusAction = buttonMinusAction;
        this.buttonPlusAction = buttonPlusAction;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FamiliesPlayersActionItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FamiliesPlayersActionItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.families_players_action_item, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static FamiliesPlayersActionItemBinding bind(@NonNull View rootView) {
        int i = R.id.actions_title;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.actions_title);
        if (textView != null) {
            i = R.id.actions_value;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.actions_value);
            if (textView2 != null) {
                i = R.id.button_kick;
                AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.button_kick);
                if (appCompatButton != null) {
                    i = R.id.button_minus_action;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.button_minus_action);
                    if (imageView != null) {
                        i = R.id.button_plus_action;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.button_plus_action);
                        if (imageView2 != null) {
                            return new FamiliesPlayersActionItemBinding((ConstraintLayout) rootView, textView, textView2, appCompatButton, imageView, imageView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
