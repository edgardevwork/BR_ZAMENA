package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;

/* loaded from: classes2.dex */
public final class BlackPassMainNewBinding implements ViewBinding {

    @NonNull
    public final ComposeView composeViewBlackPassMainFullScreen;

    @NonNull
    public final ConstraintLayout rootView;

    public BlackPassMainNewBinding(@NonNull ConstraintLayout rootView, @NonNull ComposeView composeViewBlackPassMainFullScreen) {
        this.rootView = rootView;
        this.composeViewBlackPassMainFullScreen = composeViewBlackPassMainFullScreen;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static BlackPassMainNewBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static BlackPassMainNewBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.black_pass_main_new, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static BlackPassMainNewBinding bind(@NonNull View rootView) {
        ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(rootView, R.id.compose_view_black_pass_main_full_screen);
        if (composeView != null) {
            return new BlackPassMainNewBinding((ConstraintLayout) rootView, composeView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.compose_view_black_pass_main_full_screen)));
    }
}
