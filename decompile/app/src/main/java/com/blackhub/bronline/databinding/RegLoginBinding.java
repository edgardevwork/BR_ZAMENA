package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.blackhub.bronline.game.common.CustomEditTextWithBackPressEvent;
import com.bless.client.R;
import com.google.android.material.switchmaterial.SwitchMaterial;

/* loaded from: classes3.dex */
public final class RegLoginBinding implements ViewBinding {

    @NonNull
    public final ImageView autoImg;

    @NonNull
    public final SwitchMaterial autoSwitch;

    @NonNull
    public final LinearLayout autoText;

    @NonNull
    public final LinearLayout backBut;

    @NonNull
    public final LinearLayout fingerprintBut;

    @NonNull
    public final CustomEditTextWithBackPressEvent passwordEnter;

    @NonNull
    public final TextView passwordText;

    @NonNull
    public final AppCompatButton playBut;

    @NonNull
    public final LinearLayout rootView;

    public RegLoginBinding(@NonNull LinearLayout rootView, @NonNull ImageView autoImg, @NonNull SwitchMaterial autoSwitch, @NonNull LinearLayout autoText, @NonNull LinearLayout backBut, @NonNull LinearLayout fingerprintBut, @NonNull CustomEditTextWithBackPressEvent passwordEnter, @NonNull TextView passwordText, @NonNull AppCompatButton playBut) {
        this.rootView = rootView;
        this.autoImg = autoImg;
        this.autoSwitch = autoSwitch;
        this.autoText = autoText;
        this.backBut = backBut;
        this.fingerprintBut = fingerprintBut;
        this.passwordEnter = passwordEnter;
        this.passwordText = passwordText;
        this.playBut = playBut;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static RegLoginBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static RegLoginBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.reg_login, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static RegLoginBinding bind(@NonNull View rootView) {
        int i = R.id.auto_img;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.auto_img);
        if (imageView != null) {
            i = R.id.auto_switch;
            SwitchMaterial switchMaterial = (SwitchMaterial) ViewBindings.findChildViewById(rootView, R.id.auto_switch);
            if (switchMaterial != null) {
                i = R.id.auto_text;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.auto_text);
                if (linearLayout != null) {
                    i = R.id.back_but;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.back_but);
                    if (linearLayout2 != null) {
                        i = R.id.fingerprint_but;
                        LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.fingerprint_but);
                        if (linearLayout3 != null) {
                            i = R.id.password_enter;
                            CustomEditTextWithBackPressEvent customEditTextWithBackPressEvent = (CustomEditTextWithBackPressEvent) ViewBindings.findChildViewById(rootView, R.id.password_enter);
                            if (customEditTextWithBackPressEvent != null) {
                                i = R.id.password_text;
                                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.password_text);
                                if (textView != null) {
                                    i = R.id.play_but;
                                    AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.play_but);
                                    if (appCompatButton != null) {
                                        return new RegLoginBinding((LinearLayout) rootView, imageView, switchMaterial, linearLayout, linearLayout2, linearLayout3, customEditTextWithBackPressEvent, textView, appCompatButton);
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
