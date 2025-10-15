package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;

/* loaded from: classes.dex */
public final class LauncherDialogPrivacyBinding implements ViewBinding {

    @NonNull
    public final View bgEffectShadow;

    @NonNull
    public final AppCompatButton buttonNo;

    @NonNull
    public final AppCompatButton buttonOk;

    @NonNull
    public final View mainViewDialogPrivacy;

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final TextView textViewPrivacyPolicyLink;

    @NonNull
    public final TextView textViewPrivacyPolicyTitle;

    public LauncherDialogPrivacyBinding(@NonNull ConstraintLayout rootView, @NonNull View bgEffectShadow, @NonNull AppCompatButton buttonNo, @NonNull AppCompatButton buttonOk, @NonNull View mainViewDialogPrivacy, @NonNull TextView textViewPrivacyPolicyLink, @NonNull TextView textViewPrivacyPolicyTitle) {
        this.rootView = rootView;
        this.bgEffectShadow = bgEffectShadow;
        this.buttonNo = buttonNo;
        this.buttonOk = buttonOk;
        this.mainViewDialogPrivacy = mainViewDialogPrivacy;
        this.textViewPrivacyPolicyLink = textViewPrivacyPolicyLink;
        this.textViewPrivacyPolicyTitle = textViewPrivacyPolicyTitle;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static LauncherDialogPrivacyBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static LauncherDialogPrivacyBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.launcher_dialog_privacy, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static LauncherDialogPrivacyBinding bind(@NonNull View rootView) {
        int i = R.id.bg_effect_shadow;
        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.bg_effect_shadow);
        if (viewFindChildViewById != null) {
            i = R.id.button_no;
            AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.button_no);
            if (appCompatButton != null) {
                i = R.id.button_ok;
                AppCompatButton appCompatButton2 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.button_ok);
                if (appCompatButton2 != null) {
                    i = R.id.main_view_dialog_privacy;
                    View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.main_view_dialog_privacy);
                    if (viewFindChildViewById2 != null) {
                        i = R.id.text_view_privacy_policy_link;
                        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_view_privacy_policy_link);
                        if (textView != null) {
                            i = R.id.text_view_privacy_policy_title;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_view_privacy_policy_title);
                            if (textView2 != null) {
                                return new LauncherDialogPrivacyBinding((ConstraintLayout) rootView, viewFindChildViewById, appCompatButton, appCompatButton2, viewFindChildViewById2, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
