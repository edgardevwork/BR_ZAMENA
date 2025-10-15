package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.bless.client.R;

/* loaded from: classes.dex */
public final class HalloweenWaitForStartBinding implements ViewBinding {

    @NonNull
    public final AppCompatButton btnHalloweenWaitForStartCancel;

    @NonNull
    public final LottieAnimationView lottieHalloweenWaitForStart;

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final TextView tvHalloweenWaitForStartHeader;

    @NonNull
    public final TextView tvHalloweenWaitForStartInfo;

    public HalloweenWaitForStartBinding(@NonNull ConstraintLayout rootView, @NonNull AppCompatButton btnHalloweenWaitForStartCancel, @NonNull LottieAnimationView lottieHalloweenWaitForStart, @NonNull TextView tvHalloweenWaitForStartHeader, @NonNull TextView tvHalloweenWaitForStartInfo) {
        this.rootView = rootView;
        this.btnHalloweenWaitForStartCancel = btnHalloweenWaitForStartCancel;
        this.lottieHalloweenWaitForStart = lottieHalloweenWaitForStart;
        this.tvHalloweenWaitForStartHeader = tvHalloweenWaitForStartHeader;
        this.tvHalloweenWaitForStartInfo = tvHalloweenWaitForStartInfo;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static HalloweenWaitForStartBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static HalloweenWaitForStartBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.halloween_wait_for_start, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static HalloweenWaitForStartBinding bind(@NonNull View rootView) {
        int i = R.id.btnHalloweenWaitForStartCancel;
        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.btnHalloweenWaitForStartCancel);
        if (appCompatButton != null) {
            i = R.id.lottieHalloweenWaitForStart;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(rootView, R.id.lottieHalloweenWaitForStart);
            if (lottieAnimationView != null) {
                i = R.id.tvHalloweenWaitForStartHeader;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvHalloweenWaitForStartHeader);
                if (textView != null) {
                    i = R.id.tvHalloweenWaitForStartInfo;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvHalloweenWaitForStartInfo);
                    if (textView2 != null) {
                        return new HalloweenWaitForStartBinding((ConstraintLayout) rootView, appCompatButton, lottieAnimationView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
