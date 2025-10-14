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
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.blackhub.bronline.game.common.dotrvindicator.DotViewIndicator;
import com.bless.client.R;

/* loaded from: classes.dex */
public final class FamiliesUpgradesLayoutBinding implements ViewBinding {

    @NonNull
    public final RecyclerView allUpgradeParameters;

    @NonNull
    public final View bgStore;

    @NonNull
    public final View bodyRightBlock;

    @NonNull
    public final View bodyUpgradeInfo;

    @NonNull
    public final ConstraintLayout bodyUpgradeInfoNewLayout;

    @NonNull
    public final ImageView buttonBackToMenu;

    @NonNull
    public final AppCompatButton buttonUpgrade;

    @NonNull
    public final View leftTitleDiver;

    @NonNull
    public final View mainBodyUpgradeInfo;

    @NonNull
    public final TextView moneyOnStore;

    @NonNull
    public final TextView moneyOnStoreValue;

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final View tablesTitleLeftBlock;

    @NonNull
    public final TextView titleLeftBlock;

    @NonNull
    public final TextView titleRightBlock;

    @NonNull
    public final RecyclerView upgradeList;

    @NonNull
    public final TextView upgradeTitle;

    @NonNull
    public final DotViewIndicator viewDotIndicator;

    public FamiliesUpgradesLayoutBinding(@NonNull ConstraintLayout rootView, @NonNull RecyclerView allUpgradeParameters, @NonNull View bgStore, @NonNull View bodyRightBlock, @NonNull View bodyUpgradeInfo, @NonNull ConstraintLayout bodyUpgradeInfoNewLayout, @NonNull ImageView buttonBackToMenu, @NonNull AppCompatButton buttonUpgrade, @NonNull View leftTitleDiver, @NonNull View mainBodyUpgradeInfo, @NonNull TextView moneyOnStore, @NonNull TextView moneyOnStoreValue, @NonNull View tablesTitleLeftBlock, @NonNull TextView titleLeftBlock, @NonNull TextView titleRightBlock, @NonNull RecyclerView upgradeList, @NonNull TextView upgradeTitle, @NonNull DotViewIndicator viewDotIndicator) {
        this.rootView = rootView;
        this.allUpgradeParameters = allUpgradeParameters;
        this.bgStore = bgStore;
        this.bodyRightBlock = bodyRightBlock;
        this.bodyUpgradeInfo = bodyUpgradeInfo;
        this.bodyUpgradeInfoNewLayout = bodyUpgradeInfoNewLayout;
        this.buttonBackToMenu = buttonBackToMenu;
        this.buttonUpgrade = buttonUpgrade;
        this.leftTitleDiver = leftTitleDiver;
        this.mainBodyUpgradeInfo = mainBodyUpgradeInfo;
        this.moneyOnStore = moneyOnStore;
        this.moneyOnStoreValue = moneyOnStoreValue;
        this.tablesTitleLeftBlock = tablesTitleLeftBlock;
        this.titleLeftBlock = titleLeftBlock;
        this.titleRightBlock = titleRightBlock;
        this.upgradeList = upgradeList;
        this.upgradeTitle = upgradeTitle;
        this.viewDotIndicator = viewDotIndicator;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FamiliesUpgradesLayoutBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FamiliesUpgradesLayoutBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.families_upgrades_layout, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static FamiliesUpgradesLayoutBinding bind(@NonNull View rootView) {
        int i = R.id.all_upgrade_parameters;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.all_upgrade_parameters);
        if (recyclerView != null) {
            i = R.id.bg_store;
            View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.bg_store);
            if (viewFindChildViewById != null) {
                i = R.id.body_right_block;
                View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.body_right_block);
                if (viewFindChildViewById2 != null) {
                    i = R.id.body_upgrade_info;
                    View viewFindChildViewById3 = ViewBindings.findChildViewById(rootView, R.id.body_upgrade_info);
                    if (viewFindChildViewById3 != null) {
                        i = R.id.body_upgrade_info_new_layout;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.body_upgrade_info_new_layout);
                        if (constraintLayout != null) {
                            i = R.id.button_back_to_menu;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.button_back_to_menu);
                            if (imageView != null) {
                                i = R.id.button_upgrade;
                                AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.button_upgrade);
                                if (appCompatButton != null) {
                                    i = R.id.left_title_diver;
                                    View viewFindChildViewById4 = ViewBindings.findChildViewById(rootView, R.id.left_title_diver);
                                    if (viewFindChildViewById4 != null) {
                                        i = R.id.main_body_upgrade_info;
                                        View viewFindChildViewById5 = ViewBindings.findChildViewById(rootView, R.id.main_body_upgrade_info);
                                        if (viewFindChildViewById5 != null) {
                                            i = R.id.money_on_store;
                                            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.money_on_store);
                                            if (textView != null) {
                                                i = R.id.money_on_store_value;
                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.money_on_store_value);
                                                if (textView2 != null) {
                                                    i = R.id.tables_title_left_block;
                                                    View viewFindChildViewById6 = ViewBindings.findChildViewById(rootView, R.id.tables_title_left_block);
                                                    if (viewFindChildViewById6 != null) {
                                                        i = R.id.title_left_block;
                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title_left_block);
                                                        if (textView3 != null) {
                                                            i = R.id.title_right_block;
                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title_right_block);
                                                            if (textView4 != null) {
                                                                i = R.id.upgrade_list;
                                                                RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.upgrade_list);
                                                                if (recyclerView2 != null) {
                                                                    i = R.id.upgrade_title;
                                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.upgrade_title);
                                                                    if (textView5 != null) {
                                                                        i = R.id.view_dot_indicator;
                                                                        DotViewIndicator dotViewIndicator = (DotViewIndicator) ViewBindings.findChildViewById(rootView, R.id.view_dot_indicator);
                                                                        if (dotViewIndicator != null) {
                                                                            return new FamiliesUpgradesLayoutBinding((ConstraintLayout) rootView, recyclerView, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3, constraintLayout, imageView, appCompatButton, viewFindChildViewById4, viewFindChildViewById5, textView, textView2, viewFindChildViewById6, textView3, textView4, recyclerView2, textView5, dotViewIndicator);
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
