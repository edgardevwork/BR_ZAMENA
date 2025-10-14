package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;

/* loaded from: classes.dex */
public final class ItemOldNotificationBinding implements ViewBinding {

    @NonNull
    public final AppCompatButton btOldNotificationApply;

    @NonNull
    public final ProgressBar pbOldNotificationTimer;

    @NonNull
    public final FrameLayout rootView;

    @NonNull
    public final TextView tvOldNotificationBody;

    @NonNull
    public final TextView tvOldNotificationRubles;

    public ItemOldNotificationBinding(@NonNull FrameLayout rootView, @NonNull AppCompatButton btOldNotificationApply, @NonNull ProgressBar pbOldNotificationTimer, @NonNull TextView tvOldNotificationBody, @NonNull TextView tvOldNotificationRubles) {
        this.rootView = rootView;
        this.btOldNotificationApply = btOldNotificationApply;
        this.pbOldNotificationTimer = pbOldNotificationTimer;
        this.tvOldNotificationBody = tvOldNotificationBody;
        this.tvOldNotificationRubles = tvOldNotificationRubles;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemOldNotificationBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemOldNotificationBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_old_notification, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static ItemOldNotificationBinding bind(@NonNull View rootView) {
        int i = R.id.btOldNotificationApply;
        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.btOldNotificationApply);
        if (appCompatButton != null) {
            i = R.id.pbOldNotificationTimer;
            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.pbOldNotificationTimer);
            if (progressBar != null) {
                i = R.id.tvOldNotificationBody;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvOldNotificationBody);
                if (textView != null) {
                    i = R.id.tvOldNotificationRubles;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvOldNotificationRubles);
                    if (textView2 != null) {
                        return new ItemOldNotificationBinding((FrameLayout) rootView, appCompatButton, progressBar, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
