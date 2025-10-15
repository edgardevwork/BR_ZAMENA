package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;

/* loaded from: classes.dex */
public final class EntertainmentSystemFinalWindowBinding implements ViewBinding {

    @NonNull
    public final AppCompatImageButton closeFinalWindow;

    @NonNull
    public final TextView gamesStatus;

    @NonNull
    public final ConstraintLayout rootView;

    public EntertainmentSystemFinalWindowBinding(@NonNull ConstraintLayout rootView, @NonNull AppCompatImageButton closeFinalWindow, @NonNull TextView gamesStatus) {
        this.rootView = rootView;
        this.closeFinalWindow = closeFinalWindow;
        this.gamesStatus = gamesStatus;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static EntertainmentSystemFinalWindowBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static EntertainmentSystemFinalWindowBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.entertainment_system_final_window, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static EntertainmentSystemFinalWindowBinding bind(@NonNull View rootView) {
        int i = R.id.close_final_window;
        AppCompatImageButton appCompatImageButton = (AppCompatImageButton) ViewBindings.findChildViewById(rootView, R.id.close_final_window);
        if (appCompatImageButton != null) {
            i = R.id.games_status;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.games_status);
            if (textView != null) {
                return new EntertainmentSystemFinalWindowBinding((ConstraintLayout) rootView, appCompatImageButton, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
