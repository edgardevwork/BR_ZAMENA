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
import com.blackhub.bronline.game.common.UIContainer;
import com.bless.client.R;

/* loaded from: classes.dex */
public final class FamiliesMainContainerBinding implements ViewBinding {

    @NonNull
    public final View bgBlackCoinView;

    @NonNull
    public final View bgMoneyView;

    @NonNull
    public final View bgTitleMask;

    @NonNull
    public final View blackCoinUnderline;

    @NonNull
    public final TextView blackCoinValue;

    @NonNull
    public final ImageView buttonAddMoney;

    @NonNull
    public final AppCompatButton buttonBack;

    @NonNull
    public final AppCompatButton buttonClose;

    @NonNull
    public final AppCompatButton buttonFamiliesSetting;

    @NonNull
    public final ImageView buttonNotification;

    @NonNull
    public final AppCompatButton buttonTop;

    @NonNull
    public final ImageView familyBgImage;

    @NonNull
    public final UIContainer mainContainer;

    @NonNull
    public final View moneyUnderline;

    @NonNull
    public final TextView moneyValue;

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final View titleDiver;

    @NonNull
    public final TextView titleText;

    @NonNull
    public final TextView valueNotification;

    public FamiliesMainContainerBinding(@NonNull ConstraintLayout rootView, @NonNull View bgBlackCoinView, @NonNull View bgMoneyView, @NonNull View bgTitleMask, @NonNull View blackCoinUnderline, @NonNull TextView blackCoinValue, @NonNull ImageView buttonAddMoney, @NonNull AppCompatButton buttonBack, @NonNull AppCompatButton buttonClose, @NonNull AppCompatButton buttonFamiliesSetting, @NonNull ImageView buttonNotification, @NonNull AppCompatButton buttonTop, @NonNull ImageView familyBgImage, @NonNull UIContainer mainContainer, @NonNull View moneyUnderline, @NonNull TextView moneyValue, @NonNull View titleDiver, @NonNull TextView titleText, @NonNull TextView valueNotification) {
        this.rootView = rootView;
        this.bgBlackCoinView = bgBlackCoinView;
        this.bgMoneyView = bgMoneyView;
        this.bgTitleMask = bgTitleMask;
        this.blackCoinUnderline = blackCoinUnderline;
        this.blackCoinValue = blackCoinValue;
        this.buttonAddMoney = buttonAddMoney;
        this.buttonBack = buttonBack;
        this.buttonClose = buttonClose;
        this.buttonFamiliesSetting = buttonFamiliesSetting;
        this.buttonNotification = buttonNotification;
        this.buttonTop = buttonTop;
        this.familyBgImage = familyBgImage;
        this.mainContainer = mainContainer;
        this.moneyUnderline = moneyUnderline;
        this.moneyValue = moneyValue;
        this.titleDiver = titleDiver;
        this.titleText = titleText;
        this.valueNotification = valueNotification;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FamiliesMainContainerBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FamiliesMainContainerBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.families_main_container, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static FamiliesMainContainerBinding bind(@NonNull View rootView) {
        int i = R.id.bg_black_coin_view;
        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.bg_black_coin_view);
        if (viewFindChildViewById != null) {
            i = R.id.bg_money_view;
            View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.bg_money_view);
            if (viewFindChildViewById2 != null) {
                i = R.id.bg_title_mask;
                View viewFindChildViewById3 = ViewBindings.findChildViewById(rootView, R.id.bg_title_mask);
                if (viewFindChildViewById3 != null) {
                    i = R.id.black_coin_underline;
                    View viewFindChildViewById4 = ViewBindings.findChildViewById(rootView, R.id.black_coin_underline);
                    if (viewFindChildViewById4 != null) {
                        i = R.id.black_coin_value;
                        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.black_coin_value);
                        if (textView != null) {
                            i = R.id.button_add_money;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.button_add_money);
                            if (imageView != null) {
                                i = R.id.button_back;
                                AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.button_back);
                                if (appCompatButton != null) {
                                    i = R.id.button_close;
                                    AppCompatButton appCompatButton2 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.button_close);
                                    if (appCompatButton2 != null) {
                                        i = R.id.button_families_setting;
                                        AppCompatButton appCompatButton3 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.button_families_setting);
                                        if (appCompatButton3 != null) {
                                            i = R.id.button_notification;
                                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.button_notification);
                                            if (imageView2 != null) {
                                                i = R.id.button_top;
                                                AppCompatButton appCompatButton4 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.button_top);
                                                if (appCompatButton4 != null) {
                                                    i = R.id.family_bg_image;
                                                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.family_bg_image);
                                                    if (imageView3 != null) {
                                                        i = R.id.main_container;
                                                        UIContainer uIContainer = (UIContainer) ViewBindings.findChildViewById(rootView, R.id.main_container);
                                                        if (uIContainer != null) {
                                                            i = R.id.money_underline;
                                                            View viewFindChildViewById5 = ViewBindings.findChildViewById(rootView, R.id.money_underline);
                                                            if (viewFindChildViewById5 != null) {
                                                                i = R.id.money_value;
                                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.money_value);
                                                                if (textView2 != null) {
                                                                    i = R.id.title_diver;
                                                                    View viewFindChildViewById6 = ViewBindings.findChildViewById(rootView, R.id.title_diver);
                                                                    if (viewFindChildViewById6 != null) {
                                                                        i = R.id.title_text;
                                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title_text);
                                                                        if (textView3 != null) {
                                                                            i = R.id.value_notification;
                                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.value_notification);
                                                                            if (textView4 != null) {
                                                                                return new FamiliesMainContainerBinding((ConstraintLayout) rootView, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3, viewFindChildViewById4, textView, imageView, appCompatButton, appCompatButton2, appCompatButton3, imageView2, appCompatButton4, imageView3, uIContainer, viewFindChildViewById5, textView2, viewFindChildViewById6, textView3, textView4);
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
