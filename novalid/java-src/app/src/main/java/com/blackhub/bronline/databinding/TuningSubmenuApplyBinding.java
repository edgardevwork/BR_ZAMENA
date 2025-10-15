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
public final class TuningSubmenuApplyBinding implements ViewBinding {

    @NonNull
    public final ConstraintLayout blockPrice;

    @NonNull
    public final AppCompatButton buttonApplyBuy;

    @NonNull
    public final ImageView buttonCloseSubmenuApply;

    @NonNull
    public final TextView changeTitleSubmenuApply;

    @NonNull
    public final ImageView iconMoneyApply;

    @NonNull
    public final View lineSubmenuApply;

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final TextView titlePriceAction;

    @NonNull
    public final TextView titleSubmenuApply;

    @NonNull
    public final TextView tuningValuePriceApply;

    @NonNull
    public final View viewSpeedInfo;

    public TuningSubmenuApplyBinding(@NonNull ConstraintLayout rootView, @NonNull ConstraintLayout blockPrice, @NonNull AppCompatButton buttonApplyBuy, @NonNull ImageView buttonCloseSubmenuApply, @NonNull TextView changeTitleSubmenuApply, @NonNull ImageView iconMoneyApply, @NonNull View lineSubmenuApply, @NonNull TextView titlePriceAction, @NonNull TextView titleSubmenuApply, @NonNull TextView tuningValuePriceApply, @NonNull View viewSpeedInfo) {
        this.rootView = rootView;
        this.blockPrice = blockPrice;
        this.buttonApplyBuy = buttonApplyBuy;
        this.buttonCloseSubmenuApply = buttonCloseSubmenuApply;
        this.changeTitleSubmenuApply = changeTitleSubmenuApply;
        this.iconMoneyApply = iconMoneyApply;
        this.lineSubmenuApply = lineSubmenuApply;
        this.titlePriceAction = titlePriceAction;
        this.titleSubmenuApply = titleSubmenuApply;
        this.tuningValuePriceApply = tuningValuePriceApply;
        this.viewSpeedInfo = viewSpeedInfo;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static TuningSubmenuApplyBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static TuningSubmenuApplyBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.tuning_submenu_apply, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static TuningSubmenuApplyBinding bind(@NonNull View rootView) {
        int i = R.id.block_price;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.block_price);
        if (constraintLayout != null) {
            i = R.id.button_apply_buy;
            AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.button_apply_buy);
            if (appCompatButton != null) {
                i = R.id.button_close_submenu_apply;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.button_close_submenu_apply);
                if (imageView != null) {
                    i = R.id.change_title_submenu_apply;
                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.change_title_submenu_apply);
                    if (textView != null) {
                        i = R.id.icon_money_apply;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.icon_money_apply);
                        if (imageView2 != null) {
                            i = R.id.line_submenu_apply;
                            View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.line_submenu_apply);
                            if (viewFindChildViewById != null) {
                                i = R.id.title_price_action;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title_price_action);
                                if (textView2 != null) {
                                    i = R.id.title_submenu_apply;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title_submenu_apply);
                                    if (textView3 != null) {
                                        i = R.id.tuning_value_price_apply;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tuning_value_price_apply);
                                        if (textView4 != null) {
                                            i = R.id.view_speed_info;
                                            View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.view_speed_info);
                                            if (viewFindChildViewById2 != null) {
                                                return new TuningSubmenuApplyBinding((ConstraintLayout) rootView, constraintLayout, appCompatButton, imageView, textView, imageView2, viewFindChildViewById, textView2, textView3, textView4, viewFindChildViewById2);
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
