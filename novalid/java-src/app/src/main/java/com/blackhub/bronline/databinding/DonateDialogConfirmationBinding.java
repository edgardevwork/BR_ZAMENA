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

/* loaded from: classes2.dex */
public final class DonateDialogConfirmationBinding implements ViewBinding {

    @NonNull
    public final AppCompatButton dwButtonCancel;

    @NonNull
    public final AppCompatButton dwButtonOk;

    @NonNull
    public final TextView dwCaption;

    @NonNull
    public final TextView dwInfo;

    @NonNull
    public final LinearLayout dwRoot;

    @NonNull
    public final LinearLayout rootView;

    public DonateDialogConfirmationBinding(@NonNull LinearLayout rootView, @NonNull AppCompatButton dwButtonCancel, @NonNull AppCompatButton dwButtonOk, @NonNull TextView dwCaption, @NonNull TextView dwInfo, @NonNull LinearLayout dwRoot) {
        this.rootView = rootView;
        this.dwButtonCancel = dwButtonCancel;
        this.dwButtonOk = dwButtonOk;
        this.dwCaption = dwCaption;
        this.dwInfo = dwInfo;
        this.dwRoot = dwRoot;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static DonateDialogConfirmationBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static DonateDialogConfirmationBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.donate_dialog_confirmation, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static DonateDialogConfirmationBinding bind(@NonNull View rootView) {
        int i = R.id.dw_button_cancel;
        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.dw_button_cancel);
        if (appCompatButton != null) {
            i = R.id.dw_button_ok;
            AppCompatButton appCompatButton2 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.dw_button_ok);
            if (appCompatButton2 != null) {
                i = R.id.dw_caption;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.dw_caption);
                if (textView != null) {
                    i = R.id.dw_info;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.dw_info);
                    if (textView2 != null) {
                        LinearLayout linearLayout = (LinearLayout) rootView;
                        return new DonateDialogConfirmationBinding(linearLayout, appCompatButton, appCompatButton2, textView, textView2, linearLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
