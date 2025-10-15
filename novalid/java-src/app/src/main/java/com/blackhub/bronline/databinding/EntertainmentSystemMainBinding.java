package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;

/* loaded from: classes.dex */
public final class EntertainmentSystemMainBinding implements ViewBinding {

    @NonNull
    public final AppCompatButton buttonBack;

    @NonNull
    public final AppCompatButton buttonClose;

    @NonNull
    public final AppCompatButton buttonInfo;

    @NonNull
    public final AppCompatImageButton buttonTop;

    @NonNull
    public final FrameLayout myContainer;

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final TextView title;

    public EntertainmentSystemMainBinding(@NonNull ConstraintLayout rootView, @NonNull AppCompatButton buttonBack, @NonNull AppCompatButton buttonClose, @NonNull AppCompatButton buttonInfo, @NonNull AppCompatImageButton buttonTop, @NonNull FrameLayout myContainer, @NonNull TextView title) {
        this.rootView = rootView;
        this.buttonBack = buttonBack;
        this.buttonClose = buttonClose;
        this.buttonInfo = buttonInfo;
        this.buttonTop = buttonTop;
        this.myContainer = myContainer;
        this.title = title;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static EntertainmentSystemMainBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static EntertainmentSystemMainBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.entertainment_system_main, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static EntertainmentSystemMainBinding bind(@NonNull View rootView) {
        int i = R.id.button_back;
        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.button_back);
        if (appCompatButton != null) {
            i = R.id.button_close;
            AppCompatButton appCompatButton2 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.button_close);
            if (appCompatButton2 != null) {
                i = R.id.button_info;
                AppCompatButton appCompatButton3 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.button_info);
                if (appCompatButton3 != null) {
                    i = R.id.button_top;
                    AppCompatImageButton appCompatImageButton = (AppCompatImageButton) ViewBindings.findChildViewById(rootView, R.id.button_top);
                    if (appCompatImageButton != null) {
                        i = R.id.my_container;
                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.my_container);
                        if (frameLayout != null) {
                            i = R.id.title;
                            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.title);
                            if (textView != null) {
                                return new EntertainmentSystemMainBinding((ConstraintLayout) rootView, appCompatButton, appCompatButton2, appCompatButton3, appCompatImageButton, frameLayout, textView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
