package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;

/* loaded from: classes.dex */
public final class ItemNewNotificationBinding implements ViewBinding {

    @NonNull
    public final TextView btNotificationApply;

    @NonNull
    public final ProgressBar pbNotificationTimer;

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final TextView tvNotification;

    @NonNull
    public final View viewNotificationApplyButton;

    @NonNull
    public final View viewNotificationBackground;

    public ItemNewNotificationBinding(@NonNull ConstraintLayout rootView, @NonNull TextView btNotificationApply, @NonNull ProgressBar pbNotificationTimer, @NonNull TextView tvNotification, @NonNull View viewNotificationApplyButton, @NonNull View viewNotificationBackground) {
        this.rootView = rootView;
        this.btNotificationApply = btNotificationApply;
        this.pbNotificationTimer = pbNotificationTimer;
        this.tvNotification = tvNotification;
        this.viewNotificationApplyButton = viewNotificationApplyButton;
        this.viewNotificationBackground = viewNotificationBackground;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemNewNotificationBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemNewNotificationBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_new_notification, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static ItemNewNotificationBinding bind(@NonNull View rootView) {
        int i = R.id.btNotificationApply;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.btNotificationApply);
        if (textView != null) {
            i = R.id.pbNotificationTimer;
            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.pbNotificationTimer);
            if (progressBar != null) {
                i = R.id.tvNotification;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvNotification);
                if (textView2 != null) {
                    i = R.id.viewNotificationApplyButton;
                    View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.viewNotificationApplyButton);
                    if (viewFindChildViewById != null) {
                        i = R.id.viewNotificationBackground;
                        View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.viewNotificationBackground);
                        if (viewFindChildViewById2 != null) {
                            return new ItemNewNotificationBinding((ConstraintLayout) rootView, textView, progressBar, textView2, viewFindChildViewById, viewFindChildViewById2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
