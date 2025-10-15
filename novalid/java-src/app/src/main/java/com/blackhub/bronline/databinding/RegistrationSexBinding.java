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

/* loaded from: classes3.dex */
public final class RegistrationSexBinding implements ViewBinding {

    @NonNull
    public final AppCompatButton butt;

    @NonNull
    public final ImageView femaleButt;

    @NonNull
    public final ImageView logo;

    @NonNull
    public final ImageView maleButt;

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final TextView textView24;

    public RegistrationSexBinding(@NonNull ConstraintLayout rootView, @NonNull AppCompatButton butt, @NonNull ImageView femaleButt, @NonNull ImageView logo, @NonNull ImageView maleButt, @NonNull TextView textView24) {
        this.rootView = rootView;
        this.butt = butt;
        this.femaleButt = femaleButt;
        this.logo = logo;
        this.maleButt = maleButt;
        this.textView24 = textView24;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static RegistrationSexBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static RegistrationSexBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.registration_sex, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static RegistrationSexBinding bind(@NonNull View rootView) {
        int i = R.id.butt;
        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.butt);
        if (appCompatButton != null) {
            i = R.id.female_butt;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.female_butt);
            if (imageView != null) {
                i = R.id.logo;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.logo);
                if (imageView2 != null) {
                    i = R.id.male_butt;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.male_butt);
                    if (imageView3 != null) {
                        i = R.id.textView24;
                        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.textView24);
                        if (textView != null) {
                            return new RegistrationSexBinding((ConstraintLayout) rootView, appCompatButton, imageView, imageView2, imageView3, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
