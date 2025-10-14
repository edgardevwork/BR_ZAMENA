package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;

/* loaded from: classes.dex */
public final class FamiliesNotificationLayoutBinding implements ViewBinding {

    @NonNull
    public final ImageView addNewNotification;

    @NonNull
    public final EditText editTextNotification;

    @NonNull
    public final RecyclerView familyNotifications;

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final View titleNotification;

    public FamiliesNotificationLayoutBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView addNewNotification, @NonNull EditText editTextNotification, @NonNull RecyclerView familyNotifications, @NonNull View titleNotification) {
        this.rootView = rootView;
        this.addNewNotification = addNewNotification;
        this.editTextNotification = editTextNotification;
        this.familyNotifications = familyNotifications;
        this.titleNotification = titleNotification;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FamiliesNotificationLayoutBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FamiliesNotificationLayoutBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.families_notification_layout, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static FamiliesNotificationLayoutBinding bind(@NonNull View rootView) {
        int i = R.id.add_new_notification;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.add_new_notification);
        if (imageView != null) {
            i = R.id.edit_text_notification;
            EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.edit_text_notification);
            if (editText != null) {
                i = R.id.family_notifications;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.family_notifications);
                if (recyclerView != null) {
                    i = R.id.title_notification;
                    View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.title_notification);
                    if (viewFindChildViewById != null) {
                        return new FamiliesNotificationLayoutBinding((ConstraintLayout) rootView, imageView, editText, recyclerView, viewFindChildViewById);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
