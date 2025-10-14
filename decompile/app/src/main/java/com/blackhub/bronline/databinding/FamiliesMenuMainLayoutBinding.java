package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;

/* loaded from: classes.dex */
public final class FamiliesMenuMainLayoutBinding implements ViewBinding {

    @NonNull
    public final TextView ammunitionTitle;

    @NonNull
    public final TextView ammunitionValue;

    @NonNull
    public final TextView armorTitle;

    @NonNull
    public final TextView armorValue;

    @NonNull
    public final View bgFamilySkin;

    @NonNull
    public final View bodyFamilyInfo;

    @NonNull
    public final View bodyRightBlock;

    @NonNull
    public final FrameLayout familySkin;

    @NonNull
    public final TextView familyStatusTitle;

    @NonNull
    public final TextView familyStatusValue;

    @NonNull
    public final View leftTitleDiver;

    @NonNull
    public final TextView masksTitle;

    @NonNull
    public final TextView masksValue;

    @NonNull
    public final TextView materialsTitle;

    @NonNull
    public final TextView materialsValue;

    @NonNull
    public final RecyclerView menuList;

    @NonNull
    public final TextView moneyTitle;

    @NonNull
    public final TextView moneyValue;

    @NonNull
    public final TextView oilsTitle;

    @NonNull
    public final TextView oilsValue;

    @NonNull
    public final TextView peopleTitle;

    @NonNull
    public final TextView peopleValue;

    @NonNull
    public final TextView playersNick;

    @NonNull
    public final TextView reputationsTitle;

    @NonNull
    public final TextView reputationsValue;

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final View tablesTitleLeftBlock;

    @NonNull
    public final TextView titleLeftBlock;

    @NonNull
    public final TextView titleRightBlock;

    @NonNull
    public final TextView upgradePeopleTitle;

    @NonNull
    public final TextView upgradePeopleValue;

    @NonNull
    public final TextView upgradeStorageTitle;

    @NonNull
    public final TextView upgradeStorageValue;

    @NonNull
    public final TextView upgradeWeaponTitle;

    @NonNull
    public final TextView upgradeWeaponValue;

    public FamiliesMenuMainLayoutBinding(@NonNull ConstraintLayout rootView, @NonNull TextView ammunitionTitle, @NonNull TextView ammunitionValue, @NonNull TextView armorTitle, @NonNull TextView armorValue, @NonNull View bgFamilySkin, @NonNull View bodyFamilyInfo, @NonNull View bodyRightBlock, @NonNull FrameLayout familySkin, @NonNull TextView familyStatusTitle, @NonNull TextView familyStatusValue, @NonNull View leftTitleDiver, @NonNull TextView masksTitle, @NonNull TextView masksValue, @NonNull TextView materialsTitle, @NonNull TextView materialsValue, @NonNull RecyclerView menuList, @NonNull TextView moneyTitle, @NonNull TextView moneyValue, @NonNull TextView oilsTitle, @NonNull TextView oilsValue, @NonNull TextView peopleTitle, @NonNull TextView peopleValue, @NonNull TextView playersNick, @NonNull TextView reputationsTitle, @NonNull TextView reputationsValue, @NonNull View tablesTitleLeftBlock, @NonNull TextView titleLeftBlock, @NonNull TextView titleRightBlock, @NonNull TextView upgradePeopleTitle, @NonNull TextView upgradePeopleValue, @NonNull TextView upgradeStorageTitle, @NonNull TextView upgradeStorageValue, @NonNull TextView upgradeWeaponTitle, @NonNull TextView upgradeWeaponValue) {
        this.rootView = rootView;
        this.ammunitionTitle = ammunitionTitle;
        this.ammunitionValue = ammunitionValue;
        this.armorTitle = armorTitle;
        this.armorValue = armorValue;
        this.bgFamilySkin = bgFamilySkin;
        this.bodyFamilyInfo = bodyFamilyInfo;
        this.bodyRightBlock = bodyRightBlock;
        this.familySkin = familySkin;
        this.familyStatusTitle = familyStatusTitle;
        this.familyStatusValue = familyStatusValue;
        this.leftTitleDiver = leftTitleDiver;
        this.masksTitle = masksTitle;
        this.masksValue = masksValue;
        this.materialsTitle = materialsTitle;
        this.materialsValue = materialsValue;
        this.menuList = menuList;
        this.moneyTitle = moneyTitle;
        this.moneyValue = moneyValue;
        this.oilsTitle = oilsTitle;
        this.oilsValue = oilsValue;
        this.peopleTitle = peopleTitle;
        this.peopleValue = peopleValue;
        this.playersNick = playersNick;
        this.reputationsTitle = reputationsTitle;
        this.reputationsValue = reputationsValue;
        this.tablesTitleLeftBlock = tablesTitleLeftBlock;
        this.titleLeftBlock = titleLeftBlock;
        this.titleRightBlock = titleRightBlock;
        this.upgradePeopleTitle = upgradePeopleTitle;
        this.upgradePeopleValue = upgradePeopleValue;
        this.upgradeStorageTitle = upgradeStorageTitle;
        this.upgradeStorageValue = upgradeStorageValue;
        this.upgradeWeaponTitle = upgradeWeaponTitle;
        this.upgradeWeaponValue = upgradeWeaponValue;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FamiliesMenuMainLayoutBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FamiliesMenuMainLayoutBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.families_menu_main_layout, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static FamiliesMenuMainLayoutBinding bind(@NonNull View rootView) {
        int i = R.id.ammunition_title;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.ammunition_title);
        if (textView != null) {
            i = R.id.ammunition_value;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.ammunition_value);
            if (textView2 != null) {
                i = R.id.armor_title;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.armor_title);
                if (textView3 != null) {
                    i = R.id.armor_value;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.armor_value);
                    if (textView4 != null) {
                        i = R.id.bg_family_skin;
                        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.bg_family_skin);
                        if (viewFindChildViewById != null) {
                            i = R.id.body_family_info;
                            View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.body_family_info);
                            if (viewFindChildViewById2 != null) {
                                i = R.id.body_right_block;
                                View viewFindChildViewById3 = ViewBindings.findChildViewById(rootView, R.id.body_right_block);
                                if (viewFindChildViewById3 != null) {
                                    i = R.id.family_skin;
                                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.family_skin);
                                    if (frameLayout != null) {
                                        i = R.id.family_status_title;
                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.family_status_title);
                                        if (textView5 != null) {
                                            i = R.id.family_status_value;
                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.family_status_value);
                                            if (textView6 != null) {
                                                i = R.id.left_title_diver;
                                                View viewFindChildViewById4 = ViewBindings.findChildViewById(rootView, R.id.left_title_diver);
                                                if (viewFindChildViewById4 != null) {
                                                    i = R.id.masks_title;
                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.masks_title);
                                                    if (textView7 != null) {
                                                        i = R.id.masks_value;
                                                        TextView textView8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.masks_value);
                                                        if (textView8 != null) {
                                                            i = R.id.materials_title;
                                                            TextView textView9 = (TextView) ViewBindings.findChildViewById(rootView, R.id.materials_title);
                                                            if (textView9 != null) {
                                                                i = R.id.materials_value;
                                                                TextView textView10 = (TextView) ViewBindings.findChildViewById(rootView, R.id.materials_value);
                                                                if (textView10 != null) {
                                                                    i = R.id.menu_list;
                                                                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.menu_list);
                                                                    if (recyclerView != null) {
                                                                        i = R.id.money_title;
                                                                        TextView textView11 = (TextView) ViewBindings.findChildViewById(rootView, R.id.money_title);
                                                                        if (textView11 != null) {
                                                                            i = R.id.money_value;
                                                                            TextView textView12 = (TextView) ViewBindings.findChildViewById(rootView, R.id.money_value);
                                                                            if (textView12 != null) {
                                                                                i = R.id.oils_title;
                                                                                TextView textView13 = (TextView) ViewBindings.findChildViewById(rootView, R.id.oils_title);
                                                                                if (textView13 != null) {
                                                                                    i = R.id.oils_value;
                                                                                    TextView textView14 = (TextView) ViewBindings.findChildViewById(rootView, R.id.oils_value);
                                                                                    if (textView14 != null) {
                                                                                        i = R.id.people_title;
                                                                                        TextView textView15 = (TextView) ViewBindings.findChildViewById(rootView, R.id.people_title);
                                                                                        if (textView15 != null) {
                                                                                            i = R.id.people_value;
                                                                                            TextView textView16 = (TextView) ViewBindings.findChildViewById(rootView, R.id.people_value);
                                                                                            if (textView16 != null) {
                                                                                                i = R.id.players_nick;
                                                                                                TextView textView17 = (TextView) ViewBindings.findChildViewById(rootView, R.id.players_nick);
                                                                                                if (textView17 != null) {
                                                                                                    i = R.id.reputations_title;
                                                                                                    TextView textView18 = (TextView) ViewBindings.findChildViewById(rootView, R.id.reputations_title);
                                                                                                    if (textView18 != null) {
                                                                                                        i = R.id.reputations_value;
                                                                                                        TextView textView19 = (TextView) ViewBindings.findChildViewById(rootView, R.id.reputations_value);
                                                                                                        if (textView19 != null) {
                                                                                                            i = R.id.tables_title_left_block;
                                                                                                            View viewFindChildViewById5 = ViewBindings.findChildViewById(rootView, R.id.tables_title_left_block);
                                                                                                            if (viewFindChildViewById5 != null) {
                                                                                                                i = R.id.title_left_block;
                                                                                                                TextView textView20 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title_left_block);
                                                                                                                if (textView20 != null) {
                                                                                                                    i = R.id.title_right_block;
                                                                                                                    TextView textView21 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title_right_block);
                                                                                                                    if (textView21 != null) {
                                                                                                                        i = R.id.upgrade_people_title;
                                                                                                                        TextView textView22 = (TextView) ViewBindings.findChildViewById(rootView, R.id.upgrade_people_title);
                                                                                                                        if (textView22 != null) {
                                                                                                                            i = R.id.upgrade_people_value;
                                                                                                                            TextView textView23 = (TextView) ViewBindings.findChildViewById(rootView, R.id.upgrade_people_value);
                                                                                                                            if (textView23 != null) {
                                                                                                                                i = R.id.upgrade_storage_title;
                                                                                                                                TextView textView24 = (TextView) ViewBindings.findChildViewById(rootView, R.id.upgrade_storage_title);
                                                                                                                                if (textView24 != null) {
                                                                                                                                    i = R.id.upgrade_storage_value;
                                                                                                                                    TextView textView25 = (TextView) ViewBindings.findChildViewById(rootView, R.id.upgrade_storage_value);
                                                                                                                                    if (textView25 != null) {
                                                                                                                                        i = R.id.upgrade_weapon_title;
                                                                                                                                        TextView textView26 = (TextView) ViewBindings.findChildViewById(rootView, R.id.upgrade_weapon_title);
                                                                                                                                        if (textView26 != null) {
                                                                                                                                            i = R.id.upgrade_weapon_value;
                                                                                                                                            TextView textView27 = (TextView) ViewBindings.findChildViewById(rootView, R.id.upgrade_weapon_value);
                                                                                                                                            if (textView27 != null) {
                                                                                                                                                return new FamiliesMenuMainLayoutBinding((ConstraintLayout) rootView, textView, textView2, textView3, textView4, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3, frameLayout, textView5, textView6, viewFindChildViewById4, textView7, textView8, textView9, textView10, recyclerView, textView11, textView12, textView13, textView14, textView15, textView16, textView17, textView18, textView19, viewFindChildViewById5, textView20, textView21, textView22, textView23, textView24, textView25, textView26, textView27);
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
