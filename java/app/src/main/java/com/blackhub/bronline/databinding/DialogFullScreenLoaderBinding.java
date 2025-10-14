package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewFlipper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.bless.client.R;


public final class DialogFullScreenLoaderBinding implements ViewBinding {

    @NonNull
    public final ImageView imgStep1;

    @NonNull
    public final ImageView imgStep2;

    @NonNull
    public final ImageView imgStep3;

    @NonNull
    public final LottieAnimationView pbFullScreenDialog;

    @NonNull
    public final LinearLayout rootView;

    @NonNull
    public final TextView tvTitle;

    @NonNull
    public final ViewFlipper viewLoaderFlipper;

    public DialogFullScreenLoaderBinding(@NonNull LinearLayout rootView, @NonNull ImageView imgStep1, @NonNull ImageView imgStep2, @NonNull ImageView imgStep3, @NonNull LottieAnimationView pbFullScreenDialog, @NonNull TextView tvTitle, @NonNull ViewFlipper viewLoaderFlipper) {
        this.rootView = rootView;
        this.imgStep1 = imgStep1;
        this.imgStep2 = imgStep2;
        this.imgStep3 = imgStep3;
        this.pbFullScreenDialog = pbFullScreenDialog;
        this.tvTitle = tvTitle;
        this.viewLoaderFlipper = viewLoaderFlipper;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static DialogFullScreenLoaderBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static DialogFullScreenLoaderBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.dialog_full_screen_loader, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static DialogFullScreenLoaderBinding bind(@NonNull View rootView) {
        int i = R.id.imgStep1;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.imgStep1);
        if (imageView != null) {
            i = R.id.imgStep2;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.imgStep2);
            if (imageView2 != null) {
                i = R.id.imgStep3;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.imgStep3);
                if (imageView3 != null) {
                    i = R.id.pbFullScreenDialog;
                    LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(rootView, R.id.pbFullScreenDialog);
                    if (lottieAnimationView != null) {
                        i = R.id.tvTitle;
                        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvTitle);
                        if (textView != null) {
                            i = R.id.viewLoaderFlipper;
                            ViewFlipper viewFlipper = (ViewFlipper) ViewBindings.findChildViewById(rootView, R.id.viewLoaderFlipper);
                            if (viewFlipper != null) {
                                return new DialogFullScreenLoaderBinding((LinearLayout) rootView, imageView, imageView2, imageView3, lottieAnimationView, textView, viewFlipper);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
