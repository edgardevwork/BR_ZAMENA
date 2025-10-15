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
public final class SocialInteraction0Binding implements ViewBinding {

    @NonNull
    public final TextView button4;

    @NonNull
    public final TextView buttonWithNickname;

    @NonNull
    public final ImageView closeInteraction;

    @NonNull
    public final ConstraintLayout rootView;

    public SocialInteraction0Binding(@NonNull ConstraintLayout rootView, @NonNull TextView button4, @NonNull TextView buttonWithNickname, @NonNull ImageView closeInteraction) {
        this.rootView = rootView;
        this.button4 = button4;
        this.buttonWithNickname = buttonWithNickname;
        this.closeInteraction = closeInteraction;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static SocialInteraction0Binding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static SocialInteraction0Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.social_interaction_0, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static SocialInteraction0Binding bind(@NonNull View rootView) {
        int i = R.id.button_4;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.button_4);
        if (textView != null) {
            i = R.id.button_with_nickname;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.button_with_nickname);
            if (textView2 != null) {
                i = R.id.close_interaction;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.close_interaction);
                if (imageView != null) {
                    return new SocialInteraction0Binding((ConstraintLayout) rootView, textView, textView2, imageView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
