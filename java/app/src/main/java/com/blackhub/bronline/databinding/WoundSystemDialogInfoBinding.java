package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;

/* loaded from: classes3.dex */
public final class WoundSystemDialogInfoBinding implements ViewBinding {

    @NonNull
    public final View borderWsDialog;

    @NonNull
    public final View closeWsDialog;

    @NonNull
    public final ImageView iconDoctor;

    @NonNull
    public final ImageView iconFriends;

    @NonNull
    public final View lineWs;

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final TextView textDoctor;

    @NonNull
    public final TextView textFriends;

    @NonNull
    public final TextView textInfoWsDialog;

    @NonNull
    public final TextView textSubinfoDialog;

    @NonNull
    public final TextView titleWsDialog;

    @NonNull
    public final View wsBg;

    @NonNull
    public final View wsRadialBgDialog;

    public WoundSystemDialogInfoBinding(@NonNull ConstraintLayout rootView, @NonNull View borderWsDialog, @NonNull View closeWsDialog, @NonNull ImageView iconDoctor, @NonNull ImageView iconFriends, @NonNull View lineWs, @NonNull TextView textDoctor, @NonNull TextView textFriends, @NonNull TextView textInfoWsDialog, @NonNull TextView textSubinfoDialog, @NonNull TextView titleWsDialog, @NonNull View wsBg, @NonNull View wsRadialBgDialog) {
        this.rootView = rootView;
        this.borderWsDialog = borderWsDialog;
        this.closeWsDialog = closeWsDialog;
        this.iconDoctor = iconDoctor;
        this.iconFriends = iconFriends;
        this.lineWs = lineWs;
        this.textDoctor = textDoctor;
        this.textFriends = textFriends;
        this.textInfoWsDialog = textInfoWsDialog;
        this.textSubinfoDialog = textSubinfoDialog;
        this.titleWsDialog = titleWsDialog;
        this.wsBg = wsBg;
        this.wsRadialBgDialog = wsRadialBgDialog;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static WoundSystemDialogInfoBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static WoundSystemDialogInfoBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.wound_system_dialog_info, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static WoundSystemDialogInfoBinding bind(@NonNull View rootView) {
        int i = R.id.border_ws_dialog;
        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.border_ws_dialog);
        if (viewFindChildViewById != null) {
            i = R.id.close_ws_dialog;
            View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.close_ws_dialog);
            if (viewFindChildViewById2 != null) {
                i = R.id.icon_doctor;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.icon_doctor);
                if (imageView != null) {
                    i = R.id.icon_friends;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.icon_friends);
                    if (imageView2 != null) {
                        i = R.id.line_ws;
                        View viewFindChildViewById3 = ViewBindings.findChildViewById(rootView, R.id.line_ws);
                        if (viewFindChildViewById3 != null) {
                            i = R.id.text_doctor;
                            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_doctor);
                            if (textView != null) {
                                i = R.id.text_friends;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_friends);
                                if (textView2 != null) {
                                    i = R.id.text_info_ws_dialog;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_info_ws_dialog);
                                    if (textView3 != null) {
                                        i = R.id.text_subinfo_dialog;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_subinfo_dialog);
                                        if (textView4 != null) {
                                            i = R.id.title_ws_dialog;
                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title_ws_dialog);
                                            if (textView5 != null) {
                                                i = R.id.ws_bg;
                                                View viewFindChildViewById4 = ViewBindings.findChildViewById(rootView, R.id.ws_bg);
                                                if (viewFindChildViewById4 != null) {
                                                    i = R.id.ws_radial_bg_dialog;
                                                    View viewFindChildViewById5 = ViewBindings.findChildViewById(rootView, R.id.ws_radial_bg_dialog);
                                                    if (viewFindChildViewById5 != null) {
                                                        return new WoundSystemDialogInfoBinding((ConstraintLayout) rootView, viewFindChildViewById, viewFindChildViewById2, imageView, imageView2, viewFindChildViewById3, textView, textView2, textView3, textView4, textView5, viewFindChildViewById4, viewFindChildViewById5);
                                                    }
                                                }
                                            }
                                        }
                                    }
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
