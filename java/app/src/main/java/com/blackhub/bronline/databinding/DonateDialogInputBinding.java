package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;

/* loaded from: classes2.dex */
public final class DonateDialogInputBinding implements ViewBinding {

    @NonNull
    public final AppCompatButton dwButtonCancel;

    @NonNull
    public final AppCompatButton dwButtonOk;

    @NonNull
    public final TextView dwCaption;

    @NonNull
    public final LinearLayout dwRoot;

    @NonNull
    public final TextView info;

    @NonNull
    public final EditText input;

    @NonNull
    public final LinearLayout rootView;

    @NonNull
    public final LinearLayout subedit;

    @NonNull
    public final TextView value;

    public DonateDialogInputBinding(@NonNull LinearLayout rootView, @NonNull AppCompatButton dwButtonCancel, @NonNull AppCompatButton dwButtonOk, @NonNull TextView dwCaption, @NonNull LinearLayout dwRoot, @NonNull TextView info, @NonNull EditText input, @NonNull LinearLayout subedit, @NonNull TextView value) {
        this.rootView = rootView;
        this.dwButtonCancel = dwButtonCancel;
        this.dwButtonOk = dwButtonOk;
        this.dwCaption = dwCaption;
        this.dwRoot = dwRoot;
        this.info = info;
        this.input = input;
        this.subedit = subedit;
        this.value = value;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static DonateDialogInputBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static DonateDialogInputBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.donate_dialog_input, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static DonateDialogInputBinding bind(@NonNull View rootView) {
        int i = R.id.dw_button_cancel;
        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.dw_button_cancel);
        if (appCompatButton != null) {
            i = R.id.dw_button_ok;
            AppCompatButton appCompatButton2 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.dw_button_ok);
            if (appCompatButton2 != null) {
                i = R.id.dw_caption;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.dw_caption);
                if (textView != null) {
                    LinearLayout linearLayout = (LinearLayout) rootView;
                    i = R.id.info;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.info);
                    if (textView2 != null) {
                        i = R.id.input;
                        EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.input);
                        if (editText != null) {
                            i = R.id.subedit;
                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.subedit);
                            if (linearLayout2 != null) {
                                i = R.id.value;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.value);
                                if (textView3 != null) {
                                    return new DonateDialogInputBinding(linearLayout, appCompatButton, appCompatButton2, textView, linearLayout, textView2, editText, linearLayout2, textView3);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
