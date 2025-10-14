package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;

/* loaded from: classes2.dex */
public final class ActivityMainBinding implements ViewBinding {

    @NonNull
    public final ComposeView cvTestInfo;

    @NonNull
    public final FragmentContainerView fragmentContainerView;

    @NonNull
    public final ImageView ivBackground;

    @NonNull
    public final ConstraintLayout rootView;

    public ActivityMainBinding(@NonNull ConstraintLayout rootView, @NonNull ComposeView cvTestInfo, @NonNull FragmentContainerView fragmentContainerView, @NonNull ImageView ivBackground) {
        this.rootView = rootView;
        this.cvTestInfo = cvTestInfo;
        this.fragmentContainerView = fragmentContainerView;
        this.ivBackground = ivBackground;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_main, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static ActivityMainBinding bind(@NonNull View rootView) {
        int i = R.id.cvTestInfo;
        ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(rootView, R.id.cvTestInfo);
        if (composeView != null) {
            i = R.id.fragment_container_view;
            FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(rootView, R.id.fragment_container_view);
            if (fragmentContainerView != null) {
                i = R.id.ivBackground;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.ivBackground);
                if (imageView != null) {
                    return new ActivityMainBinding((ConstraintLayout) rootView, composeView, fragmentContainerView, imageView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
