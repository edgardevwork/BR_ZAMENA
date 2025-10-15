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
public final class DonateDialogResultBinding implements ViewBinding {

    @NonNull
    public final AppCompatButton close;

    @NonNull
    public final TextView dwBold;

    @NonNull
    public final AppCompatButton dwButtonOk;

    @NonNull
    public final TextView dwCaption;

    @NonNull
    public final TextView dwDefault;

    @NonNull
    public final View dwIcon;

    @NonNull
    public final LinearLayout dwRoot;

    @NonNull
    public final LinearLayout rootView;

    public DonateDialogResultBinding(@NonNull LinearLayout rootView, @NonNull AppCompatButton close, @NonNull TextView dwBold, @NonNull AppCompatButton dwButtonOk, @NonNull TextView dwCaption, @NonNull TextView dwDefault, @NonNull View dwIcon, @NonNull LinearLayout dwRoot) {
        this.rootView = rootView;
        this.close = close;
        this.dwBold = dwBold;
        this.dwButtonOk = dwButtonOk;
        this.dwCaption = dwCaption;
        this.dwDefault = dwDefault;
        this.dwIcon = dwIcon;
        this.dwRoot = dwRoot;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static DonateDialogResultBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static DonateDialogResultBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.donate_dialog_result, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static DonateDialogResultBinding bind(@NonNull View rootView) {
        int i = R.id.close;
        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.close);
        if (appCompatButton != null) {
            i = R.id.dw_bold;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.dw_bold);
            if (textView != null) {
                i = R.id.dw_button_ok;
                AppCompatButton appCompatButton2 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.dw_button_ok);
                if (appCompatButton2 != null) {
                    i = R.id.dw_caption;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.dw_caption);
                    if (textView2 != null) {
                        i = R.id.dw_default;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.dw_default);
                        if (textView3 != null) {
                            i = R.id.dw_icon;
                            View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.dw_icon);
                            if (viewFindChildViewById != null) {
                                LinearLayout linearLayout = (LinearLayout) rootView;
                                return new DonateDialogResultBinding(linearLayout, appCompatButton, textView, appCompatButton2, textView2, textView3, viewFindChildViewById, linearLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
