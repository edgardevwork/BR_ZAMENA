package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
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
public final class FractionMainContainerBinding implements ViewBinding {

    @NonNull
    public final View bgMoneyView;

    @NonNull
    public final View bgTitleMask;

    @NonNull
    public final View bgTitleView;

    @NonNull
    public final ImageButton buttonAddMoney;

    @NonNull
    public final ImageButton buttonBack;

    @NonNull
    public final AppCompatButton buttonClose;

    @NonNull
    public final ImageButton buttonFractionsDocuments;

    @NonNull
    public final ImageButton buttonFractionsSetting;

    @NonNull
    public final ImageButton buttonMoneyShop;

    @NonNull
    public final ImageView iconTitleFraction;

    @NonNull
    public final ImageView imageViewFractionBackgroundRes;

    @NonNull
    public final UIContainer mainContainer;

    @NonNull
    public final View moneyUnderline;

    @NonNull
    public final TextView moneyValue;

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final TextView textTitleFraction;

    @NonNull
    public final View titleDiver;

    public FractionMainContainerBinding(@NonNull ConstraintLayout rootView, @NonNull View bgMoneyView, @NonNull View bgTitleMask, @NonNull View bgTitleView, @NonNull ImageButton buttonAddMoney, @NonNull ImageButton buttonBack, @NonNull AppCompatButton buttonClose, @NonNull ImageButton buttonFractionsDocuments, @NonNull ImageButton buttonFractionsSetting, @NonNull ImageButton buttonMoneyShop, @NonNull ImageView iconTitleFraction, @NonNull ImageView imageViewFractionBackgroundRes, @NonNull UIContainer mainContainer, @NonNull View moneyUnderline, @NonNull TextView moneyValue, @NonNull TextView textTitleFraction, @NonNull View titleDiver) {
        this.rootView = rootView;
        this.bgMoneyView = bgMoneyView;
        this.bgTitleMask = bgTitleMask;
        this.bgTitleView = bgTitleView;
        this.buttonAddMoney = buttonAddMoney;
        this.buttonBack = buttonBack;
        this.buttonClose = buttonClose;
        this.buttonFractionsDocuments = buttonFractionsDocuments;
        this.buttonFractionsSetting = buttonFractionsSetting;
        this.buttonMoneyShop = buttonMoneyShop;
        this.iconTitleFraction = iconTitleFraction;
        this.imageViewFractionBackgroundRes = imageViewFractionBackgroundRes;
        this.mainContainer = mainContainer;
        this.moneyUnderline = moneyUnderline;
        this.moneyValue = moneyValue;
        this.textTitleFraction = textTitleFraction;
        this.titleDiver = titleDiver;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FractionMainContainerBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FractionMainContainerBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fraction_main_container, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static FractionMainContainerBinding bind(@NonNull View rootView) {
        int i = R.id.bg_money_view;
        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.bg_money_view);
        if (viewFindChildViewById != null) {
            i = R.id.bg_title_mask;
            View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.bg_title_mask);
            if (viewFindChildViewById2 != null) {
                i = R.id.bg_title_view;
                View viewFindChildViewById3 = ViewBindings.findChildViewById(rootView, R.id.bg_title_view);
                if (viewFindChildViewById3 != null) {
                    i = R.id.button_add_money;
                    ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.button_add_money);
                    if (imageButton != null) {
                        i = R.id.button_back;
                        ImageButton imageButton2 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.button_back);
                        if (imageButton2 != null) {
                            i = R.id.button_close;
                            AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.button_close);
                            if (appCompatButton != null) {
                                i = R.id.button_fractions_documents;
                                ImageButton imageButton3 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.button_fractions_documents);
                                if (imageButton3 != null) {
                                    i = R.id.button_fractions_setting;
                                    ImageButton imageButton4 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.button_fractions_setting);
                                    if (imageButton4 != null) {
                                        i = R.id.button_money_shop;
                                        ImageButton imageButton5 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.button_money_shop);
                                        if (imageButton5 != null) {
                                            i = R.id.icon_title_fraction;
                                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.icon_title_fraction);
                                            if (imageView != null) {
                                                i = R.id.image_view_fraction_background_res;
                                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.image_view_fraction_background_res);
                                                if (imageView2 != null) {
                                                    i = R.id.main_container;
                                                    UIContainer uIContainer = (UIContainer) ViewBindings.findChildViewById(rootView, R.id.main_container);
                                                    if (uIContainer != null) {
                                                        i = R.id.money_underline;
                                                        View viewFindChildViewById4 = ViewBindings.findChildViewById(rootView, R.id.money_underline);
                                                        if (viewFindChildViewById4 != null) {
                                                            i = R.id.money_value;
                                                            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.money_value);
                                                            if (textView != null) {
                                                                i = R.id.text_title_fraction;
                                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_title_fraction);
                                                                if (textView2 != null) {
                                                                    i = R.id.title_diver;
                                                                    View viewFindChildViewById5 = ViewBindings.findChildViewById(rootView, R.id.title_diver);
                                                                    if (viewFindChildViewById5 != null) {
                                                                        return new FractionMainContainerBinding((ConstraintLayout) rootView, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3, imageButton, imageButton2, appCompatButton, imageButton3, imageButton4, imageButton5, imageView, imageView2, uIContainer, viewFindChildViewById4, textView, textView2, viewFindChildViewById5);
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
