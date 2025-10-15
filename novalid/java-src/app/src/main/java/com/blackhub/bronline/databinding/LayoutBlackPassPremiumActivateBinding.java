package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.p003ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;

/* loaded from: classes3.dex */
public final class LayoutBlackPassPremiumActivateBinding implements ViewBinding {

    @NonNull
    public final ImageView bannerBonusIcon1;

    @NonNull
    public final ImageView bannerBonusIcon2;

    @NonNull
    public final ImageView bannerBonusIcon3;

    @NonNull
    public final ImageView bannerBonusIcon4;

    @NonNull
    public final ImageView bannerBonusIcon5;

    @NonNull
    public final TextView bannerBonusTitleText1;

    @NonNull
    public final TextView bannerBonusTitleText2;

    @NonNull
    public final TextView bannerBonusTitleText3;

    @NonNull
    public final TextView bannerBonusTitleText4;

    @NonNull
    public final TextView bannerBonusTitleText5;

    @NonNull
    public final TextView btnPurchasePremium;

    @NonNull
    public final TextView btnPurchasePremiumDeluxe;

    @NonNull
    public final ComposeView composeViewBlackPassBgEffect;

    @NonNull
    public final ImageView imgPremiumPrize;

    @NonNull
    public final ImageButton imgbShowPremiumDeluxePrizes;

    @NonNull
    public final ImageButton imgbShowPremiumPrizes;

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final TextView tvPremiumDeluxeInclude;

    @NonNull
    public final TextView tvPremiumDeluxeSubtitle;

    @NonNull
    public final TextView tvPremiumDeluxeTitle;

    @NonNull
    public final TextView tvPremiumDeluxeUniqueCar;

    @NonNull
    public final TextView tvPremiumDescription;

    @NonNull
    public final TextView tvPremiumSubtitle;

    @NonNull
    public final TextView tvPremiumTitle;

    @NonNull
    public final View viewBgPremiumBlock;

    @NonNull
    public final View viewBgPremiumDeluxeBlock;

    @NonNull
    public final View viewPremiumDeluxeIncludesBg;

    @NonNull
    public final View viewPremiumDeluxeUniqueCarBg;

    public LayoutBlackPassPremiumActivateBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView bannerBonusIcon1, @NonNull ImageView bannerBonusIcon2, @NonNull ImageView bannerBonusIcon3, @NonNull ImageView bannerBonusIcon4, @NonNull ImageView bannerBonusIcon5, @NonNull TextView bannerBonusTitleText1, @NonNull TextView bannerBonusTitleText2, @NonNull TextView bannerBonusTitleText3, @NonNull TextView bannerBonusTitleText4, @NonNull TextView bannerBonusTitleText5, @NonNull TextView btnPurchasePremium, @NonNull TextView btnPurchasePremiumDeluxe, @NonNull ComposeView composeViewBlackPassBgEffect, @NonNull ImageView imgPremiumPrize, @NonNull ImageButton imgbShowPremiumDeluxePrizes, @NonNull ImageButton imgbShowPremiumPrizes, @NonNull TextView tvPremiumDeluxeInclude, @NonNull TextView tvPremiumDeluxeSubtitle, @NonNull TextView tvPremiumDeluxeTitle, @NonNull TextView tvPremiumDeluxeUniqueCar, @NonNull TextView tvPremiumDescription, @NonNull TextView tvPremiumSubtitle, @NonNull TextView tvPremiumTitle, @NonNull View viewBgPremiumBlock, @NonNull View viewBgPremiumDeluxeBlock, @NonNull View viewPremiumDeluxeIncludesBg, @NonNull View viewPremiumDeluxeUniqueCarBg) {
        this.rootView = rootView;
        this.bannerBonusIcon1 = bannerBonusIcon1;
        this.bannerBonusIcon2 = bannerBonusIcon2;
        this.bannerBonusIcon3 = bannerBonusIcon3;
        this.bannerBonusIcon4 = bannerBonusIcon4;
        this.bannerBonusIcon5 = bannerBonusIcon5;
        this.bannerBonusTitleText1 = bannerBonusTitleText1;
        this.bannerBonusTitleText2 = bannerBonusTitleText2;
        this.bannerBonusTitleText3 = bannerBonusTitleText3;
        this.bannerBonusTitleText4 = bannerBonusTitleText4;
        this.bannerBonusTitleText5 = bannerBonusTitleText5;
        this.btnPurchasePremium = btnPurchasePremium;
        this.btnPurchasePremiumDeluxe = btnPurchasePremiumDeluxe;
        this.composeViewBlackPassBgEffect = composeViewBlackPassBgEffect;
        this.imgPremiumPrize = imgPremiumPrize;
        this.imgbShowPremiumDeluxePrizes = imgbShowPremiumDeluxePrizes;
        this.imgbShowPremiumPrizes = imgbShowPremiumPrizes;
        this.tvPremiumDeluxeInclude = tvPremiumDeluxeInclude;
        this.tvPremiumDeluxeSubtitle = tvPremiumDeluxeSubtitle;
        this.tvPremiumDeluxeTitle = tvPremiumDeluxeTitle;
        this.tvPremiumDeluxeUniqueCar = tvPremiumDeluxeUniqueCar;
        this.tvPremiumDescription = tvPremiumDescription;
        this.tvPremiumSubtitle = tvPremiumSubtitle;
        this.tvPremiumTitle = tvPremiumTitle;
        this.viewBgPremiumBlock = viewBgPremiumBlock;
        this.viewBgPremiumDeluxeBlock = viewBgPremiumDeluxeBlock;
        this.viewPremiumDeluxeIncludesBg = viewPremiumDeluxeIncludesBg;
        this.viewPremiumDeluxeUniqueCarBg = viewPremiumDeluxeUniqueCarBg;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static LayoutBlackPassPremiumActivateBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static LayoutBlackPassPremiumActivateBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.layout_black_pass_premium_activate, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static LayoutBlackPassPremiumActivateBinding bind(@NonNull View rootView) {
        int i = R.id.banner_bonus_icon_1;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.banner_bonus_icon_1);
        if (imageView != null) {
            i = R.id.banner_bonus_icon_2;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.banner_bonus_icon_2);
            if (imageView2 != null) {
                i = R.id.banner_bonus_icon_3;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.banner_bonus_icon_3);
                if (imageView3 != null) {
                    i = R.id.banner_bonus_icon_4;
                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.banner_bonus_icon_4);
                    if (imageView4 != null) {
                        i = R.id.banner_bonus_icon_5;
                        ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.banner_bonus_icon_5);
                        if (imageView5 != null) {
                            i = R.id.banner_bonus_title_text_1;
                            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.banner_bonus_title_text_1);
                            if (textView != null) {
                                i = R.id.banner_bonus_title_text_2;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.banner_bonus_title_text_2);
                                if (textView2 != null) {
                                    i = R.id.banner_bonus_title_text_3;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.banner_bonus_title_text_3);
                                    if (textView3 != null) {
                                        i = R.id.banner_bonus_title_text_4;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.banner_bonus_title_text_4);
                                        if (textView4 != null) {
                                            i = R.id.banner_bonus_title_text_5;
                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.banner_bonus_title_text_5);
                                            if (textView5 != null) {
                                                i = R.id.btnPurchasePremium;
                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.btnPurchasePremium);
                                                if (textView6 != null) {
                                                    i = R.id.btnPurchasePremiumDeluxe;
                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.btnPurchasePremiumDeluxe);
                                                    if (textView7 != null) {
                                                        i = R.id.composeViewBlackPassBgEffect;
                                                        ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(rootView, R.id.composeViewBlackPassBgEffect);
                                                        if (composeView != null) {
                                                            i = R.id.imgPremiumPrize;
                                                            ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.imgPremiumPrize);
                                                            if (imageView6 != null) {
                                                                i = R.id.imgbShowPremiumDeluxePrizes;
                                                                ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.imgbShowPremiumDeluxePrizes);
                                                                if (imageButton != null) {
                                                                    i = R.id.imgbShowPremiumPrizes;
                                                                    ImageButton imageButton2 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.imgbShowPremiumPrizes);
                                                                    if (imageButton2 != null) {
                                                                        i = R.id.tvPremiumDeluxeInclude;
                                                                        TextView textView8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvPremiumDeluxeInclude);
                                                                        if (textView8 != null) {
                                                                            i = R.id.tvPremiumDeluxeSubtitle;
                                                                            TextView textView9 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvPremiumDeluxeSubtitle);
                                                                            if (textView9 != null) {
                                                                                i = R.id.tvPremiumDeluxeTitle;
                                                                                TextView textView10 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvPremiumDeluxeTitle);
                                                                                if (textView10 != null) {
                                                                                    i = R.id.tvPremiumDeluxeUniqueCar;
                                                                                    TextView textView11 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvPremiumDeluxeUniqueCar);
                                                                                    if (textView11 != null) {
                                                                                        i = R.id.tvPremiumDescription;
                                                                                        TextView textView12 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvPremiumDescription);
                                                                                        if (textView12 != null) {
                                                                                            i = R.id.tvPremiumSubtitle;
                                                                                            TextView textView13 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvPremiumSubtitle);
                                                                                            if (textView13 != null) {
                                                                                                i = R.id.tvPremiumTitle;
                                                                                                TextView textView14 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvPremiumTitle);
                                                                                                if (textView14 != null) {
                                                                                                    i = R.id.viewBgPremiumBlock;
                                                                                                    View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.viewBgPremiumBlock);
                                                                                                    if (viewFindChildViewById != null) {
                                                                                                        i = R.id.viewBgPremiumDeluxeBlock;
                                                                                                        View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.viewBgPremiumDeluxeBlock);
                                                                                                        if (viewFindChildViewById2 != null) {
                                                                                                            i = R.id.viewPremiumDeluxeIncludesBg;
                                                                                                            View viewFindChildViewById3 = ViewBindings.findChildViewById(rootView, R.id.viewPremiumDeluxeIncludesBg);
                                                                                                            if (viewFindChildViewById3 != null) {
                                                                                                                i = R.id.viewPremiumDeluxeUniqueCarBg;
                                                                                                                View viewFindChildViewById4 = ViewBindings.findChildViewById(rootView, R.id.viewPremiumDeluxeUniqueCarBg);
                                                                                                                if (viewFindChildViewById4 != null) {
                                                                                                                    return new LayoutBlackPassPremiumActivateBinding((ConstraintLayout) rootView, imageView, imageView2, imageView3, imageView4, imageView5, textView, textView2, textView3, textView4, textView5, textView6, textView7, composeView, imageView6, imageButton, imageButton2, textView8, textView9, textView10, textView11, textView12, textView13, textView14, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3, viewFindChildViewById4);
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
