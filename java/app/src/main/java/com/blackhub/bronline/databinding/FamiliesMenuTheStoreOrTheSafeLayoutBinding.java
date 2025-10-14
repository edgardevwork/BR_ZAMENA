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
import com.bless.client.R;

/* loaded from: classes.dex */
public final class FamiliesMenuTheStoreOrTheSafeLayoutBinding implements ViewBinding {

    @NonNull
    public final TextView actionTitle;

    @NonNull
    public final TextView allMoney;

    @NonNull
    public final TextView allMoneyValue;

    @NonNull
    public final TextView armor;

    @NonNull
    public final TextView armorValue;

    @NonNull
    public final View bgStore;

    @NonNull
    public final View bodyRightBlock;

    @NonNull
    public final View bodyStoreInfo;

    @NonNull
    public final View bottomRightBlock;

    @NonNull
    public final ImageView buttonBackToMenu;

    @NonNull
    public final AppCompatButton buttonGoToTheContents;

    @NonNull
    public final View leftTitleDiver;

    @NonNull
    public final View mainBodyStoreInfo;

    @NonNull
    public final TextView masks;

    @NonNull
    public final TextView masksValue;

    @NonNull
    public final TextView materials;

    @NonNull
    public final TextView materialsValue;

    @NonNull
    public final TextView oil;

    @NonNull
    public final TextView oilValue;

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final TextView storeTitle;

    @NonNull
    public final View tablesTitleLeftBlock;

    @NonNull
    public final TextView titleContentsOfTheSafe;

    @NonNull
    public final TextView titleLeftBlock;

    @NonNull
    public final TextView titleRightBlock;

    @NonNull
    public final RecyclerView upgradeList;

    public FamiliesMenuTheStoreOrTheSafeLayoutBinding(@NonNull ConstraintLayout rootView, @NonNull TextView actionTitle, @NonNull TextView allMoney, @NonNull TextView allMoneyValue, @NonNull TextView armor, @NonNull TextView armorValue, @NonNull View bgStore, @NonNull View bodyRightBlock, @NonNull View bodyStoreInfo, @NonNull View bottomRightBlock, @NonNull ImageView buttonBackToMenu, @NonNull AppCompatButton buttonGoToTheContents, @NonNull View leftTitleDiver, @NonNull View mainBodyStoreInfo, @NonNull TextView masks, @NonNull TextView masksValue, @NonNull TextView materials, @NonNull TextView materialsValue, @NonNull TextView oil, @NonNull TextView oilValue, @NonNull TextView storeTitle, @NonNull View tablesTitleLeftBlock, @NonNull TextView titleContentsOfTheSafe, @NonNull TextView titleLeftBlock, @NonNull TextView titleRightBlock, @NonNull RecyclerView upgradeList) {
        this.rootView = rootView;
        this.actionTitle = actionTitle;
        this.allMoney = allMoney;
        this.allMoneyValue = allMoneyValue;
        this.armor = armor;
        this.armorValue = armorValue;
        this.bgStore = bgStore;
        this.bodyRightBlock = bodyRightBlock;
        this.bodyStoreInfo = bodyStoreInfo;
        this.bottomRightBlock = bottomRightBlock;
        this.buttonBackToMenu = buttonBackToMenu;
        this.buttonGoToTheContents = buttonGoToTheContents;
        this.leftTitleDiver = leftTitleDiver;
        this.mainBodyStoreInfo = mainBodyStoreInfo;
        this.masks = masks;
        this.masksValue = masksValue;
        this.materials = materials;
        this.materialsValue = materialsValue;
        this.oil = oil;
        this.oilValue = oilValue;
        this.storeTitle = storeTitle;
        this.tablesTitleLeftBlock = tablesTitleLeftBlock;
        this.titleContentsOfTheSafe = titleContentsOfTheSafe;
        this.titleLeftBlock = titleLeftBlock;
        this.titleRightBlock = titleRightBlock;
        this.upgradeList = upgradeList;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FamiliesMenuTheStoreOrTheSafeLayoutBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FamiliesMenuTheStoreOrTheSafeLayoutBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.families_menu_the_store_or_the_safe_layout, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static FamiliesMenuTheStoreOrTheSafeLayoutBinding bind(@NonNull View rootView) {
        int i = R.id.action_title;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.action_title);
        if (textView != null) {
            i = R.id.all_money;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.all_money);
            if (textView2 != null) {
                i = R.id.all_money_value;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.all_money_value);
                if (textView3 != null) {
                    i = R.id.armor;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.armor);
                    if (textView4 != null) {
                        i = R.id.armor_value;
                        TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.armor_value);
                        if (textView5 != null) {
                            i = R.id.bg_store;
                            View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.bg_store);
                            if (viewFindChildViewById != null) {
                                i = R.id.body_right_block;
                                View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.body_right_block);
                                if (viewFindChildViewById2 != null) {
                                    i = R.id.body_store_info;
                                    View viewFindChildViewById3 = ViewBindings.findChildViewById(rootView, R.id.body_store_info);
                                    if (viewFindChildViewById3 != null) {
                                        i = R.id.bottom_right_block;
                                        View viewFindChildViewById4 = ViewBindings.findChildViewById(rootView, R.id.bottom_right_block);
                                        if (viewFindChildViewById4 != null) {
                                            i = R.id.button_back_to_menu;
                                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.button_back_to_menu);
                                            if (imageView != null) {
                                                i = R.id.button_go_to_the_contents;
                                                AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.button_go_to_the_contents);
                                                if (appCompatButton != null) {
                                                    i = R.id.left_title_diver;
                                                    View viewFindChildViewById5 = ViewBindings.findChildViewById(rootView, R.id.left_title_diver);
                                                    if (viewFindChildViewById5 != null) {
                                                        i = R.id.main_body_store_info;
                                                        View viewFindChildViewById6 = ViewBindings.findChildViewById(rootView, R.id.main_body_store_info);
                                                        if (viewFindChildViewById6 != null) {
                                                            i = R.id.masks;
                                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.masks);
                                                            if (textView6 != null) {
                                                                i = R.id.masks_value;
                                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.masks_value);
                                                                if (textView7 != null) {
                                                                    i = R.id.materials;
                                                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.materials);
                                                                    if (textView8 != null) {
                                                                        i = R.id.materials_value;
                                                                        TextView textView9 = (TextView) ViewBindings.findChildViewById(rootView, R.id.materials_value);
                                                                        if (textView9 != null) {
                                                                            i = R.id.oil;
                                                                            TextView textView10 = (TextView) ViewBindings.findChildViewById(rootView, R.id.oil);
                                                                            if (textView10 != null) {
                                                                                i = R.id.oil_value;
                                                                                TextView textView11 = (TextView) ViewBindings.findChildViewById(rootView, R.id.oil_value);
                                                                                if (textView11 != null) {
                                                                                    i = R.id.store_title;
                                                                                    TextView textView12 = (TextView) ViewBindings.findChildViewById(rootView, R.id.store_title);
                                                                                    if (textView12 != null) {
                                                                                        i = R.id.tables_title_left_block;
                                                                                        View viewFindChildViewById7 = ViewBindings.findChildViewById(rootView, R.id.tables_title_left_block);
                                                                                        if (viewFindChildViewById7 != null) {
                                                                                            i = R.id.title_contents_of_the_safe;
                                                                                            TextView textView13 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title_contents_of_the_safe);
                                                                                            if (textView13 != null) {
                                                                                                i = R.id.title_left_block;
                                                                                                TextView textView14 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title_left_block);
                                                                                                if (textView14 != null) {
                                                                                                    i = R.id.title_right_block;
                                                                                                    TextView textView15 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title_right_block);
                                                                                                    if (textView15 != null) {
                                                                                                        i = R.id.upgrade_list;
                                                                                                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.upgrade_list);
                                                                                                        if (recyclerView != null) {
                                                                                                            return new FamiliesMenuTheStoreOrTheSafeLayoutBinding((ConstraintLayout) rootView, textView, textView2, textView3, textView4, textView5, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3, viewFindChildViewById4, imageView, appCompatButton, viewFindChildViewById5, viewFindChildViewById6, textView6, textView7, textView8, textView9, textView10, textView11, textView12, viewFindChildViewById7, textView13, textView14, textView15, recyclerView);
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
