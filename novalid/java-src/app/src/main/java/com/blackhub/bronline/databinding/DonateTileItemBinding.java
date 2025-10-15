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

/* loaded from: classes2.dex */
public final class DonateTileItemBinding implements ViewBinding {

    @NonNull
    public final AppCompatButton donateItemButton;

    @NonNull
    public final TextView donateItemDefaultAdditional;

    @NonNull
    public final TextView donateItemDefaultBadgeNew;

    @NonNull
    public final TextView donateItemDefaultBadgePercent;

    @NonNull
    public final TextView donateItemDefaultBadgeText;

    @NonNull
    public final TextView donateItemDefaultBadgeTime;

    @NonNull
    public final View donateItemDefaultBg;

    @NonNull
    public final TextView donateItemDefaultHeader;

    @NonNull
    public final ImageView donateItemDefaultIcon;

    @NonNull
    public final TextView donateItemDefaultPrice;

    @NonNull
    public final TextView donateItemDefaultPriceStroked;

    @NonNull
    public final TextView donateItemDefaultSubHeader;

    @NonNull
    public final TextView donateItemLimitCount;

    @NonNull
    public final TextView donateItemLimitTitle;

    @NonNull
    public final View donateItemPresentBg;

    @NonNull
    public final ImageView donateItemPresentIcon;

    @NonNull
    public final TextView donateItemPresentStatusTitle;

    @NonNull
    public final TextView donateItemPresentStatusValueOfTime;

    @NonNull
    public final TextView donateItemPresentSubTitle;

    @NonNull
    public final TextView donateItemPresentTitle;

    @NonNull
    public final ConstraintLayout rootView;

    public DonateTileItemBinding(@NonNull ConstraintLayout rootView, @NonNull AppCompatButton donateItemButton, @NonNull TextView donateItemDefaultAdditional, @NonNull TextView donateItemDefaultBadgeNew, @NonNull TextView donateItemDefaultBadgePercent, @NonNull TextView donateItemDefaultBadgeText, @NonNull TextView donateItemDefaultBadgeTime, @NonNull View donateItemDefaultBg, @NonNull TextView donateItemDefaultHeader, @NonNull ImageView donateItemDefaultIcon, @NonNull TextView donateItemDefaultPrice, @NonNull TextView donateItemDefaultPriceStroked, @NonNull TextView donateItemDefaultSubHeader, @NonNull TextView donateItemLimitCount, @NonNull TextView donateItemLimitTitle, @NonNull View donateItemPresentBg, @NonNull ImageView donateItemPresentIcon, @NonNull TextView donateItemPresentStatusTitle, @NonNull TextView donateItemPresentStatusValueOfTime, @NonNull TextView donateItemPresentSubTitle, @NonNull TextView donateItemPresentTitle) {
        this.rootView = rootView;
        this.donateItemButton = donateItemButton;
        this.donateItemDefaultAdditional = donateItemDefaultAdditional;
        this.donateItemDefaultBadgeNew = donateItemDefaultBadgeNew;
        this.donateItemDefaultBadgePercent = donateItemDefaultBadgePercent;
        this.donateItemDefaultBadgeText = donateItemDefaultBadgeText;
        this.donateItemDefaultBadgeTime = donateItemDefaultBadgeTime;
        this.donateItemDefaultBg = donateItemDefaultBg;
        this.donateItemDefaultHeader = donateItemDefaultHeader;
        this.donateItemDefaultIcon = donateItemDefaultIcon;
        this.donateItemDefaultPrice = donateItemDefaultPrice;
        this.donateItemDefaultPriceStroked = donateItemDefaultPriceStroked;
        this.donateItemDefaultSubHeader = donateItemDefaultSubHeader;
        this.donateItemLimitCount = donateItemLimitCount;
        this.donateItemLimitTitle = donateItemLimitTitle;
        this.donateItemPresentBg = donateItemPresentBg;
        this.donateItemPresentIcon = donateItemPresentIcon;
        this.donateItemPresentStatusTitle = donateItemPresentStatusTitle;
        this.donateItemPresentStatusValueOfTime = donateItemPresentStatusValueOfTime;
        this.donateItemPresentSubTitle = donateItemPresentSubTitle;
        this.donateItemPresentTitle = donateItemPresentTitle;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static DonateTileItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static DonateTileItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.donate_tile_item, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static DonateTileItemBinding bind(@NonNull View rootView) {
        int i = R.id.donate_item_button;
        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.donate_item_button);
        if (appCompatButton != null) {
            i = R.id.donate_item_default_additional;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.donate_item_default_additional);
            if (textView != null) {
                i = R.id.donate_item_default_badge_new;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.donate_item_default_badge_new);
                if (textView2 != null) {
                    i = R.id.donate_item_default_badge_percent;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.donate_item_default_badge_percent);
                    if (textView3 != null) {
                        i = R.id.donate_item_default_badge_text;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.donate_item_default_badge_text);
                        if (textView4 != null) {
                            i = R.id.donate_item_default_badge_time;
                            TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.donate_item_default_badge_time);
                            if (textView5 != null) {
                                i = R.id.donate_item_default_bg;
                                View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.donate_item_default_bg);
                                if (viewFindChildViewById != null) {
                                    i = R.id.donate_item_default_header;
                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.donate_item_default_header);
                                    if (textView6 != null) {
                                        i = R.id.donate_item_default_icon;
                                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.donate_item_default_icon);
                                        if (imageView != null) {
                                            i = R.id.donate_item_default_price;
                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.donate_item_default_price);
                                            if (textView7 != null) {
                                                i = R.id.donate_item_default_price_stroked;
                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.donate_item_default_price_stroked);
                                                if (textView8 != null) {
                                                    i = R.id.donate_item_default_sub_header;
                                                    TextView textView9 = (TextView) ViewBindings.findChildViewById(rootView, R.id.donate_item_default_sub_header);
                                                    if (textView9 != null) {
                                                        i = R.id.donate_item_limit_count;
                                                        TextView textView10 = (TextView) ViewBindings.findChildViewById(rootView, R.id.donate_item_limit_count);
                                                        if (textView10 != null) {
                                                            i = R.id.donate_item_limit_title;
                                                            TextView textView11 = (TextView) ViewBindings.findChildViewById(rootView, R.id.donate_item_limit_title);
                                                            if (textView11 != null) {
                                                                i = R.id.donate_item_present_bg;
                                                                View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.donate_item_present_bg);
                                                                if (viewFindChildViewById2 != null) {
                                                                    i = R.id.donate_item_present_icon;
                                                                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.donate_item_present_icon);
                                                                    if (imageView2 != null) {
                                                                        i = R.id.donate_item_present_status_title;
                                                                        TextView textView12 = (TextView) ViewBindings.findChildViewById(rootView, R.id.donate_item_present_status_title);
                                                                        if (textView12 != null) {
                                                                            i = R.id.donate_item_present_status_value_of_time;
                                                                            TextView textView13 = (TextView) ViewBindings.findChildViewById(rootView, R.id.donate_item_present_status_value_of_time);
                                                                            if (textView13 != null) {
                                                                                i = R.id.donate_item_present_sub_title;
                                                                                TextView textView14 = (TextView) ViewBindings.findChildViewById(rootView, R.id.donate_item_present_sub_title);
                                                                                if (textView14 != null) {
                                                                                    i = R.id.donate_item_present_title;
                                                                                    TextView textView15 = (TextView) ViewBindings.findChildViewById(rootView, R.id.donate_item_present_title);
                                                                                    if (textView15 != null) {
                                                                                        return new DonateTileItemBinding((ConstraintLayout) rootView, appCompatButton, textView, textView2, textView3, textView4, textView5, viewFindChildViewById, textView6, imageView, textView7, textView8, textView9, textView10, textView11, viewFindChildViewById2, imageView2, textView12, textView13, textView14, textView15);
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
