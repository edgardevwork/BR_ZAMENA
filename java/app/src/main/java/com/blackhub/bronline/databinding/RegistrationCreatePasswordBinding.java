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
import com.blackhub.bronline.game.common.CustomEditTextWithBackPressEvent;
import com.bless.client.R;

/* loaded from: classes3.dex */
public final class RegistrationCreatePasswordBinding implements ViewBinding {

    @NonNull
    public final LinearLayout backButt;

    @NonNull
    public final CustomEditTextWithBackPressEvent edit1;

    @NonNull
    public final CustomEditTextWithBackPressEvent edit2;

    @NonNull
    public final CustomEditTextWithBackPressEvent edit3;

    @NonNull
    public final TextView headerText;

    @NonNull
    public final AppCompatButton regButt;

    @NonNull
    public final TextView restoreText;

    @NonNull
    public final LinearLayout rootView;

    public RegistrationCreatePasswordBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout backButt, @NonNull CustomEditTextWithBackPressEvent edit1, @NonNull CustomEditTextWithBackPressEvent edit2, @NonNull CustomEditTextWithBackPressEvent edit3, @NonNull TextView headerText, @NonNull AppCompatButton regButt, @NonNull TextView restoreText) {
        this.rootView = rootView;
        this.backButt = backButt;
        this.edit1 = edit1;
        this.edit2 = edit2;
        this.edit3 = edit3;
        this.headerText = headerText;
        this.regButt = regButt;
        this.restoreText = restoreText;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static RegistrationCreatePasswordBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static RegistrationCreatePasswordBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.registration_create_password, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static RegistrationCreatePasswordBinding bind(@NonNull View rootView) {
        int i = R.id.back_butt;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.back_butt);
        if (linearLayout != null) {
            i = R.id.edit1;
            CustomEditTextWithBackPressEvent customEditTextWithBackPressEvent = (CustomEditTextWithBackPressEvent) ViewBindings.findChildViewById(rootView, R.id.edit1);
            if (customEditTextWithBackPressEvent != null) {
                i = R.id.edit2;
                CustomEditTextWithBackPressEvent customEditTextWithBackPressEvent2 = (CustomEditTextWithBackPressEvent) ViewBindings.findChildViewById(rootView, R.id.edit2);
                if (customEditTextWithBackPressEvent2 != null) {
                    i = R.id.edit3;
                    CustomEditTextWithBackPressEvent customEditTextWithBackPressEvent3 = (CustomEditTextWithBackPressEvent) ViewBindings.findChildViewById(rootView, R.id.edit3);
                    if (customEditTextWithBackPressEvent3 != null) {
                        i = R.id.header_text;
                        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.header_text);
                        if (textView != null) {
                            i = R.id.reg_butt;
                            AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.reg_butt);
                            if (appCompatButton != null) {
                                i = R.id.restore_text;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.restore_text);
                                if (textView2 != null) {
                                    return new RegistrationCreatePasswordBinding((LinearLayout) rootView, linearLayout, customEditTextWithBackPressEvent, customEditTextWithBackPressEvent2, customEditTextWithBackPressEvent3, textView, appCompatButton, textView2);
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
