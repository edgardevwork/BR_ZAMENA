package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;

/* loaded from: classes3.dex */
public final class RegFingerprintBinding implements ViewBinding {

    @NonNull
    public final ImageView autoImg;

    @NonNull
    public final Switch autoSwitch;

    @NonNull
    public final LinearLayout autoText;

    @NonNull
    public final LinearLayout back;

    @NonNull
    public final AppCompatButton buttSkip;

    @NonNull
    public final ImageView fingerImg;

    @NonNull
    public final FrameLayout rootView;

    public RegFingerprintBinding(@NonNull FrameLayout rootView, @NonNull ImageView autoImg, @NonNull Switch autoSwitch, @NonNull LinearLayout autoText, @NonNull LinearLayout back, @NonNull AppCompatButton buttSkip, @NonNull ImageView fingerImg) {
        this.rootView = rootView;
        this.autoImg = autoImg;
        this.autoSwitch = autoSwitch;
        this.autoText = autoText;
        this.back = back;
        this.buttSkip = buttSkip;
        this.fingerImg = fingerImg;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static RegFingerprintBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static RegFingerprintBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.reg_fingerprint, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static RegFingerprintBinding bind(@NonNull View rootView) {
        int i = R.id.auto_img;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.auto_img);
        if (imageView != null) {
            i = R.id.auto_switch;
            Switch r5 = (Switch) ViewBindings.findChildViewById(rootView, R.id.auto_switch);
            if (r5 != null) {
                i = R.id.auto_text;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.auto_text);
                if (linearLayout != null) {
                    i = R.id.back;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.back);
                    if (linearLayout2 != null) {
                        i = R.id.butt_skip;
                        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.butt_skip);
                        if (appCompatButton != null) {
                            i = R.id.finger_img;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.finger_img);
                            if (imageView2 != null) {
                                return new RegFingerprintBinding((FrameLayout) rootView, imageView, r5, linearLayout, linearLayout2, appCompatButton, imageView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
