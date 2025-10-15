package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;

/* loaded from: classes3.dex */
public final class RegistrationEnterBinding implements ViewBinding {

    @NonNull
    public final AppCompatButton enter;

    @NonNull
    public final AppCompatButton googleEnter;

    @NonNull
    public final LinearLayout regLl;

    @NonNull
    public final LinearLayout rootView;

    @NonNull
    public final TextView textHeader;

    @NonNull
    public final TextView textView20;

    @NonNull
    public final AppCompatButton vkEnter;

    public RegistrationEnterBinding(@NonNull LinearLayout rootView, @NonNull AppCompatButton enter, @NonNull AppCompatButton googleEnter, @NonNull LinearLayout regLl, @NonNull TextView textHeader, @NonNull TextView textView20, @NonNull AppCompatButton vkEnter) {
        this.rootView = rootView;
        this.enter = enter;
        this.googleEnter = googleEnter;
        this.regLl = regLl;
        this.textHeader = textHeader;
        this.textView20 = textView20;
        this.vkEnter = vkEnter;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static RegistrationEnterBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static RegistrationEnterBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.registration_enter, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static RegistrationEnterBinding bind(@NonNull View rootView) {
        int i = R.id.enter;
        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.enter);
        if (appCompatButton != null) {
            i = R.id.google_enter;
            AppCompatButton appCompatButton2 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.google_enter);
            if (appCompatButton2 != null) {
                LinearLayout linearLayout = (LinearLayout) rootView;
                i = R.id.text_header;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_header);
                if (textView != null) {
                    i = R.id.textView20;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.textView20);
                    if (textView2 != null) {
                        i = R.id.vk_enter;
                        AppCompatButton appCompatButton3 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.vk_enter);
                        if (appCompatButton3 != null) {
                            return new RegistrationEnterBinding(linearLayout, appCompatButton, appCompatButton2, linearLayout, textView, textView2, appCompatButton3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
