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
public final class EntertainmentSystemDialogInfoBinding implements ViewBinding {

    @NonNull
    public final View dialogInfoBgEffect;

    @NonNull
    public final View dialogInfoBgView;

    @NonNull
    public final TextView dialogInfoBodyItem;

    @NonNull
    public final AppCompatImageButton dialogInfoButtonClose;

    @NonNull
    public final TextView dialogInfoTitleItem;

    @NonNull
    public final ConstraintLayout rootView;

    public EntertainmentSystemDialogInfoBinding(@NonNull ConstraintLayout rootView, @NonNull View dialogInfoBgEffect, @NonNull View dialogInfoBgView, @NonNull TextView dialogInfoBodyItem, @NonNull AppCompatImageButton dialogInfoButtonClose, @NonNull TextView dialogInfoTitleItem) {
        this.rootView = rootView;
        this.dialogInfoBgEffect = dialogInfoBgEffect;
        this.dialogInfoBgView = dialogInfoBgView;
        this.dialogInfoBodyItem = dialogInfoBodyItem;
        this.dialogInfoButtonClose = dialogInfoButtonClose;
        this.dialogInfoTitleItem = dialogInfoTitleItem;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static EntertainmentSystemDialogInfoBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static EntertainmentSystemDialogInfoBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.entertainment_system_dialog_info, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static EntertainmentSystemDialogInfoBinding bind(@NonNull View rootView) {
        int i = R.id.dialog_info_bg_effect;
        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.dialog_info_bg_effect);
        if (viewFindChildViewById != null) {
            i = R.id.dialog_info_bg_view;
            View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.dialog_info_bg_view);
            if (viewFindChildViewById2 != null) {
                i = R.id.dialog_info_body_item;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.dialog_info_body_item);
                if (textView != null) {
                    i = R.id.dialog_info_button_close;
                    AppCompatImageButton appCompatImageButton = (AppCompatImageButton) ViewBindings.findChildViewById(rootView, R.id.dialog_info_button_close);
                    if (appCompatImageButton != null) {
                        i = R.id.dialog_info_title_item;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.dialog_info_title_item);
                        if (textView2 != null) {
                            return new EntertainmentSystemDialogInfoBinding((ConstraintLayout) rootView, viewFindChildViewById, viewFindChildViewById2, textView, appCompatImageButton, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
