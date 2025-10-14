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
public final class RegPersonBinding implements ViewBinding {

    @NonNull
    public final ImageView arrowLeft;

    @NonNull
    public final ImageView arrowRight;

    @NonNull
    public final TextView hintPerson;

    @NonNull
    public final ImageView perosnImg;

    @NonNull
    public final ImageView personCloseH;

    @NonNull
    public final AppCompatButton playButt;

    @NonNull
    public final ConstraintLayout rootView;

    public RegPersonBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView arrowLeft, @NonNull ImageView arrowRight, @NonNull TextView hintPerson, @NonNull ImageView perosnImg, @NonNull ImageView personCloseH, @NonNull AppCompatButton playButt) {
        this.rootView = rootView;
        this.arrowLeft = arrowLeft;
        this.arrowRight = arrowRight;
        this.hintPerson = hintPerson;
        this.perosnImg = perosnImg;
        this.personCloseH = personCloseH;
        this.playButt = playButt;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static RegPersonBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static RegPersonBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.reg_person, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static RegPersonBinding bind(@NonNull View rootView) {
        int i = R.id.arrow_left;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.arrow_left);
        if (imageView != null) {
            i = R.id.arrow_right;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.arrow_right);
            if (imageView2 != null) {
                i = R.id.hint_person;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.hint_person);
                if (textView != null) {
                    i = R.id.perosn_img;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.perosn_img);
                    if (imageView3 != null) {
                        i = R.id.person_close_h;
                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.person_close_h);
                        if (imageView4 != null) {
                            i = R.id.play_butt;
                            AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.play_butt);
                            if (appCompatButton != null) {
                                return new RegPersonBinding((ConstraintLayout) rootView, imageView, imageView2, textView, imageView3, imageView4, appCompatButton);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
