package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;

/* loaded from: classes3.dex */
public final class WidgetRoundCornerProgressBarBinding implements ViewBinding {

    @NonNull
    public final LinearLayout containerProgress;

    @NonNull
    public final RelativeLayout containerProgressHolder;

    @NonNull
    public final LinearLayout containerSecondaryProgress;

    @NonNull
    public final LinearLayout layoutBackground;

    @NonNull
    public final LinearLayout rootView;

    public WidgetRoundCornerProgressBarBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout containerProgress, @NonNull RelativeLayout containerProgressHolder, @NonNull LinearLayout containerSecondaryProgress, @NonNull LinearLayout layoutBackground) {
        this.rootView = rootView;
        this.containerProgress = containerProgress;
        this.containerProgressHolder = containerProgressHolder;
        this.containerSecondaryProgress = containerSecondaryProgress;
        this.layoutBackground = layoutBackground;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static WidgetRoundCornerProgressBarBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static WidgetRoundCornerProgressBarBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.widget_round_corner_progress_bar, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static WidgetRoundCornerProgressBarBinding bind(@NonNull View rootView) {
        int i = R.id.container_progress;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.container_progress);
        if (linearLayout != null) {
            i = R.id.container_progress_holder;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.container_progress_holder);
            if (relativeLayout != null) {
                i = R.id.container_secondary_progress;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.container_secondary_progress);
                if (linearLayout2 != null) {
                    LinearLayout linearLayout3 = (LinearLayout) rootView;
                    return new WidgetRoundCornerProgressBarBinding(linearLayout3, linearLayout, relativeLayout, linearLayout2, linearLayout3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
