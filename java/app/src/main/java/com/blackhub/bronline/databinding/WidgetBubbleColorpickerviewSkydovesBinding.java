package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;

/* loaded from: classes3.dex */
public final class WidgetBubbleColorpickerviewSkydovesBinding implements ViewBinding {

    @NonNull
    public final AppCompatImageView imBubble;

    @NonNull
    public final FrameLayout layout;

    @NonNull
    public final FrameLayout rootView;

    public WidgetBubbleColorpickerviewSkydovesBinding(@NonNull FrameLayout rootView, @NonNull AppCompatImageView imBubble, @NonNull FrameLayout layout) {
        this.rootView = rootView;
        this.imBubble = imBubble;
        this.layout = layout;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static WidgetBubbleColorpickerviewSkydovesBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static WidgetBubbleColorpickerviewSkydovesBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.widget_bubble_colorpickerview_skydoves, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static WidgetBubbleColorpickerviewSkydovesBinding bind(@NonNull View rootView) {
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.imBubble);
        if (appCompatImageView != null) {
            FrameLayout frameLayout = (FrameLayout) rootView;
            return new WidgetBubbleColorpickerviewSkydovesBinding(frameLayout, appCompatImageView, frameLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.imBubble)));
    }
}
