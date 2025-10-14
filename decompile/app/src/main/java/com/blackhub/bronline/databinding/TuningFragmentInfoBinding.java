package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;

/* loaded from: classes3.dex */
public final class TuningFragmentInfoBinding implements ViewBinding {

    @NonNull
    public final AppCompatButton backToSubmenuInfo;

    @NonNull
    public final View bgFragmentInfoText;

    @NonNull
    public final TextView bodyInfoText;

    @NonNull
    public final ImageView buttonBackDetailsInfoText;

    @NonNull
    public final View helpViewText;

    @NonNull
    public final LinearLayout menuBlockInfo;

    @NonNull
    public final RelativeLayout rootView;

    @NonNull
    public final TextView titleInfoText;

    @NonNull
    public final AppCompatButton tuningViewBox;

    @NonNull
    public final View underlineTitleText;

    @NonNull
    public final RelativeLayout viewDetailsInfo;

    public TuningFragmentInfoBinding(@NonNull RelativeLayout rootView, @NonNull AppCompatButton backToSubmenuInfo, @NonNull View bgFragmentInfoText, @NonNull TextView bodyInfoText, @NonNull ImageView buttonBackDetailsInfoText, @NonNull View helpViewText, @NonNull LinearLayout menuBlockInfo, @NonNull TextView titleInfoText, @NonNull AppCompatButton tuningViewBox, @NonNull View underlineTitleText, @NonNull RelativeLayout viewDetailsInfo) {
        this.rootView = rootView;
        this.backToSubmenuInfo = backToSubmenuInfo;
        this.bgFragmentInfoText = bgFragmentInfoText;
        this.bodyInfoText = bodyInfoText;
        this.buttonBackDetailsInfoText = buttonBackDetailsInfoText;
        this.helpViewText = helpViewText;
        this.menuBlockInfo = menuBlockInfo;
        this.titleInfoText = titleInfoText;
        this.tuningViewBox = tuningViewBox;
        this.underlineTitleText = underlineTitleText;
        this.viewDetailsInfo = viewDetailsInfo;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static TuningFragmentInfoBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static TuningFragmentInfoBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.tuning_fragment_info, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static TuningFragmentInfoBinding bind(@NonNull View rootView) {
        int i = R.id.back_to_submenu_info;
        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.back_to_submenu_info);
        if (appCompatButton != null) {
            i = R.id.bg_fragment_info_text;
            View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.bg_fragment_info_text);
            if (viewFindChildViewById != null) {
                i = R.id.body_info_text;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.body_info_text);
                if (textView != null) {
                    i = R.id.button_back_details_info_text;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.button_back_details_info_text);
                    if (imageView != null) {
                        i = R.id.help_view_text;
                        View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.help_view_text);
                        if (viewFindChildViewById2 != null) {
                            i = R.id.menu_block_info;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.menu_block_info);
                            if (linearLayout != null) {
                                i = R.id.title_info_text;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title_info_text);
                                if (textView2 != null) {
                                    i = R.id.tuning_view_box;
                                    AppCompatButton appCompatButton2 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.tuning_view_box);
                                    if (appCompatButton2 != null) {
                                        i = R.id.underline_title_text;
                                        View viewFindChildViewById3 = ViewBindings.findChildViewById(rootView, R.id.underline_title_text);
                                        if (viewFindChildViewById3 != null) {
                                            RelativeLayout relativeLayout = (RelativeLayout) rootView;
                                            return new TuningFragmentInfoBinding(relativeLayout, appCompatButton, viewFindChildViewById, textView, imageView, viewFindChildViewById2, linearLayout, textView2, appCompatButton2, viewFindChildViewById3, relativeLayout);
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
