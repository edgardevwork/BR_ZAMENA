package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.blackhub.bronline.game.common.CustomEditTextWithBackPressEvent;
import com.bless.client.R;

/* loaded from: classes3.dex */
public final class WindowDialogBinding implements ViewBinding {

    @NonNull
    public final AppCompatButton dwButtonCancel;

    @NonNull
    public final AppCompatButton dwButtonOk;

    @NonNull
    public final TextView dwCaption;

    @NonNull
    public final View dwDivider;

    @NonNull
    public final CustomEditTextWithBackPressEvent dwEdittext;

    @NonNull
    public final LinearLayout dwHeader;

    @NonNull
    public final TextView dwInfo;

    @NonNull
    public final TextView dwListButton;

    @NonNull
    public final LinearLayout dwRoot;

    @NonNull
    public final LinearLayout dwRootButtons;

    @NonNull
    public final NestedScrollView dwScrollInfo;

    @NonNull
    public final LinearLayout dwScrollLayout;

    @NonNull
    public final LinearLayout dwScrollRoot;

    @NonNull
    public final ScrollView dwScrollview;

    @NonNull
    public final LinearLayout rootView;

    public WindowDialogBinding(@NonNull LinearLayout rootView, @NonNull AppCompatButton dwButtonCancel, @NonNull AppCompatButton dwButtonOk, @NonNull TextView dwCaption, @NonNull View dwDivider, @NonNull CustomEditTextWithBackPressEvent dwEdittext, @NonNull LinearLayout dwHeader, @NonNull TextView dwInfo, @NonNull TextView dwListButton, @NonNull LinearLayout dwRoot, @NonNull LinearLayout dwRootButtons, @NonNull NestedScrollView dwScrollInfo, @NonNull LinearLayout dwScrollLayout, @NonNull LinearLayout dwScrollRoot, @NonNull ScrollView dwScrollview) {
        this.rootView = rootView;
        this.dwButtonCancel = dwButtonCancel;
        this.dwButtonOk = dwButtonOk;
        this.dwCaption = dwCaption;
        this.dwDivider = dwDivider;
        this.dwEdittext = dwEdittext;
        this.dwHeader = dwHeader;
        this.dwInfo = dwInfo;
        this.dwListButton = dwListButton;
        this.dwRoot = dwRoot;
        this.dwRootButtons = dwRootButtons;
        this.dwScrollInfo = dwScrollInfo;
        this.dwScrollLayout = dwScrollLayout;
        this.dwScrollRoot = dwScrollRoot;
        this.dwScrollview = dwScrollview;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static WindowDialogBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static WindowDialogBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.window_dialog, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static WindowDialogBinding bind(@NonNull View rootView) {
        int i = R.id.dw_button_cancel;
        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.dw_button_cancel);
        if (appCompatButton != null) {
            i = R.id.dw_button_ok;
            AppCompatButton appCompatButton2 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.dw_button_ok);
            if (appCompatButton2 != null) {
                i = R.id.dw_caption;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.dw_caption);
                if (textView != null) {
                    i = R.id.dw_divider;
                    View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.dw_divider);
                    if (viewFindChildViewById != null) {
                        i = R.id.dw_edittext;
                        CustomEditTextWithBackPressEvent customEditTextWithBackPressEvent = (CustomEditTextWithBackPressEvent) ViewBindings.findChildViewById(rootView, R.id.dw_edittext);
                        if (customEditTextWithBackPressEvent != null) {
                            i = R.id.dw_header;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.dw_header);
                            if (linearLayout != null) {
                                i = R.id.dw_info;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.dw_info);
                                if (textView2 != null) {
                                    i = R.id.dw_list_button;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.dw_list_button);
                                    if (textView3 != null) {
                                        LinearLayout linearLayout2 = (LinearLayout) rootView;
                                        i = R.id.dw_root_buttons;
                                        LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.dw_root_buttons);
                                        if (linearLayout3 != null) {
                                            i = R.id.dw_scroll_info;
                                            NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(rootView, R.id.dw_scroll_info);
                                            if (nestedScrollView != null) {
                                                i = R.id.dw_scroll_layout;
                                                LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.dw_scroll_layout);
                                                if (linearLayout4 != null) {
                                                    i = R.id.dw_scroll_root;
                                                    LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.dw_scroll_root);
                                                    if (linearLayout5 != null) {
                                                        i = R.id.dw_scrollview;
                                                        ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(rootView, R.id.dw_scrollview);
                                                        if (scrollView != null) {
                                                            return new WindowDialogBinding(linearLayout2, appCompatButton, appCompatButton2, textView, viewFindChildViewById, customEditTextWithBackPressEvent, linearLayout, textView2, textView3, linearLayout2, linearLayout3, nestedScrollView, linearLayout4, linearLayout5, scrollView);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
