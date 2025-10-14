package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.bless.client.R;

/* loaded from: classes.dex */
public final class FragmentInitializationBinding implements ViewBinding {

    @NonNull
    public final FragmentContainerView fragmentContainerView;

    @NonNull
    public final TextView loadingText;

    @NonNull
    public final LottieAnimationView progressBar;

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final TextView tvBr;

    @NonNull
    public final TextView tvBr2;

    public FragmentInitializationBinding(@NonNull ConstraintLayout rootView, @NonNull FragmentContainerView fragmentContainerView, @NonNull TextView loadingText, @NonNull LottieAnimationView progressBar, @NonNull TextView tvBr, @NonNull TextView tvBr2) {
        this.rootView = rootView;
        this.fragmentContainerView = fragmentContainerView;
        this.loadingText = loadingText;
        this.progressBar = progressBar;
        this.tvBr = tvBr;
        this.tvBr2 = tvBr2;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FragmentInitializationBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentInitializationBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_initialization, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static FragmentInitializationBinding bind(@NonNull View rootView) {
        int i = R.id.fragment_container_view;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(rootView, R.id.fragment_container_view);
        if (fragmentContainerView != null) {
            i = R.id.loading_text;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.loading_text);
            if (textView != null) {
                i = R.id.progress_bar;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(rootView, R.id.progress_bar);
                if (lottieAnimationView != null) {
                    i = R.id.tv_br;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_br);
                    if (textView2 != null) {
                        i = R.id.tv_br_2;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_br_2);
                        if (textView3 != null) {
                            return new FragmentInitializationBinding((ConstraintLayout) rootView, fragmentContainerView, textView, lottieAnimationView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
