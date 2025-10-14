package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;

/* loaded from: classes3.dex */
public final class TuningResetApplyBinding implements ViewBinding {

    @NonNull
    public final AppCompatButton buttonApplyResetDetails;

    @NonNull
    public final ImageView buttonCloseSubmenuApply;

    @NonNull
    public final View lineSubmenuApply;

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final TextView titlePriceAction;

    @NonNull
    public final TextView titleSubmenuApply;

    @NonNull
    public final View viewResetApply;

    public TuningResetApplyBinding(@NonNull ConstraintLayout rootView, @NonNull AppCompatButton buttonApplyResetDetails, @NonNull ImageView buttonCloseSubmenuApply, @NonNull View lineSubmenuApply, @NonNull TextView titlePriceAction, @NonNull TextView titleSubmenuApply, @NonNull View viewResetApply) {
        this.rootView = rootView;
        this.buttonApplyResetDetails = buttonApplyResetDetails;
        this.buttonCloseSubmenuApply = buttonCloseSubmenuApply;
        this.lineSubmenuApply = lineSubmenuApply;
        this.titlePriceAction = titlePriceAction;
        this.titleSubmenuApply = titleSubmenuApply;
        this.viewResetApply = viewResetApply;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static TuningResetApplyBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static TuningResetApplyBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.tuning_reset_apply, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static TuningResetApplyBinding bind(@NonNull View rootView) {
        int i = R.id.button_apply_reset_details;
        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.button_apply_reset_details);
        if (appCompatButton != null) {
            i = R.id.button_close_submenu_apply;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.button_close_submenu_apply);
            if (imageView != null) {
                i = R.id.line_submenu_apply;
                View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.line_submenu_apply);
                if (viewFindChildViewById != null) {
                    i = R.id.title_price_action;
                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.title_price_action);
                    if (textView != null) {
                        i = R.id.title_submenu_apply;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title_submenu_apply);
                        if (textView2 != null) {
                            i = R.id.view_reset_apply;
                            View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.view_reset_apply);
                            if (viewFindChildViewById2 != null) {
                                return new TuningResetApplyBinding((ConstraintLayout) rootView, appCompatButton, imageView, viewFindChildViewById, textView, textView2, viewFindChildViewById2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
