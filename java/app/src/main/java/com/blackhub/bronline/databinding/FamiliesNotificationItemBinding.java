package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;

/* loaded from: classes.dex */
public final class FamiliesNotificationItemBinding implements ViewBinding {

    @NonNull
    public final TextView notificationsAuthor;

    @NonNull
    public final TextView notificationsValue;

    @NonNull
    public final ConstraintLayout rootView;

    public FamiliesNotificationItemBinding(@NonNull ConstraintLayout rootView, @NonNull TextView notificationsAuthor, @NonNull TextView notificationsValue) {
        this.rootView = rootView;
        this.notificationsAuthor = notificationsAuthor;
        this.notificationsValue = notificationsValue;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FamiliesNotificationItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FamiliesNotificationItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.families_notification_item, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static FamiliesNotificationItemBinding bind(@NonNull View rootView) {
        int i = R.id.notifications_author;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.notifications_author);
        if (textView != null) {
            i = R.id.notifications_value;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.notifications_value);
            if (textView2 != null) {
                return new FamiliesNotificationItemBinding((ConstraintLayout) rootView, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
