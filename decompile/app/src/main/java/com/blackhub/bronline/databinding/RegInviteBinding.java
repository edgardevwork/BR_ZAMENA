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
public final class RegInviteBinding implements ViewBinding {

    @NonNull
    public final AppCompatButton butContinue;

    @NonNull
    public final AppCompatButton butSkip;

    @NonNull
    public final CustomEditTextWithBackPressEvent inviteNick;

    @NonNull
    public final LinearLayout rootView;

    @NonNull
    public final TextView textInvite;

    @NonNull
    public final View view9;

    public RegInviteBinding(@NonNull LinearLayout rootView, @NonNull AppCompatButton butContinue, @NonNull AppCompatButton butSkip, @NonNull CustomEditTextWithBackPressEvent inviteNick, @NonNull TextView textInvite, @NonNull View view9) {
        this.rootView = rootView;
        this.butContinue = butContinue;
        this.butSkip = butSkip;
        this.inviteNick = inviteNick;
        this.textInvite = textInvite;
        this.view9 = view9;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static RegInviteBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static RegInviteBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.reg_invite, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static RegInviteBinding bind(@NonNull View rootView) {
        int i = R.id.but_continue;
        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.but_continue);
        if (appCompatButton != null) {
            i = R.id.but_skip;
            AppCompatButton appCompatButton2 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.but_skip);
            if (appCompatButton2 != null) {
                i = R.id.invite_nick;
                CustomEditTextWithBackPressEvent customEditTextWithBackPressEvent = (CustomEditTextWithBackPressEvent) ViewBindings.findChildViewById(rootView, R.id.invite_nick);
                if (customEditTextWithBackPressEvent != null) {
                    i = R.id.text_invite;
                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_invite);
                    if (textView != null) {
                        i = R.id.view9;
                        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.view9);
                        if (viewFindChildViewById != null) {
                            return new RegInviteBinding((LinearLayout) rootView, appCompatButton, appCompatButton2, customEditTextWithBackPressEvent, textView, viewFindChildViewById);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
