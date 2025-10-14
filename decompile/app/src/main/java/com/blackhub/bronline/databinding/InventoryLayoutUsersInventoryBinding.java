package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;

/* loaded from: classes.dex */
public final class InventoryLayoutUsersInventoryBinding implements ViewBinding {

    @NonNull
    public final CoordinatorLayout coordinatorForSnackbar;

    @NonNull
    public final View invBgItemsInBag;

    @NonNull
    public final View invBgThisItem;

    @NonNull
    public final View invBgTitleInfo;

    @NonNull
    public final TextView invDivWeight;

    @NonNull
    public final ImageView invIconThisItem;

    @NonNull
    public final TextView invInfoThisItem;

    @NonNull
    public final RecyclerView invListItemsInInventory;

    @NonNull
    public final TextView invTitleActualWeight;

    @NonNull
    public final TextView invTitleInventory;

    @NonNull
    public final TextView invTitleMaxWeight;

    @NonNull
    public final TextView invTitleThisItem;

    @NonNull
    public final TextView invTitleTypeWeight;

    @NonNull
    public final TextView invTitleWeight;

    @NonNull
    public final TextView invValueItemsWeight;

    @NonNull
    public final ConstraintLayout playersBlock;

    @NonNull
    public final RecyclerView playersButtonsAction;

    @NonNull
    public final View playersDonateStatusBg;

    @NonNull
    public final ImageView playersDonateStatusIcon;

    @NonNull
    public final TextView playersIdValue;

    @NonNull
    public final TextView playersLevel;

    @NonNull
    public final View playersLevelBg;

    @NonNull
    public final View playersNameBg;

    @NonNull
    public final TextView playersNameValue;

    @NonNull
    public final FrameLayout playersSkinView;

    @NonNull
    public final RecyclerView playersSlots;

    @NonNull
    public final RecyclerView playersStateInfo;

    @NonNull
    public final LinearLayout rootView;

    public InventoryLayoutUsersInventoryBinding(@NonNull LinearLayout rootView, @NonNull CoordinatorLayout coordinatorForSnackbar, @NonNull View invBgItemsInBag, @NonNull View invBgThisItem, @NonNull View invBgTitleInfo, @NonNull TextView invDivWeight, @NonNull ImageView invIconThisItem, @NonNull TextView invInfoThisItem, @NonNull RecyclerView invListItemsInInventory, @NonNull TextView invTitleActualWeight, @NonNull TextView invTitleInventory, @NonNull TextView invTitleMaxWeight, @NonNull TextView invTitleThisItem, @NonNull TextView invTitleTypeWeight, @NonNull TextView invTitleWeight, @NonNull TextView invValueItemsWeight, @NonNull ConstraintLayout playersBlock, @NonNull RecyclerView playersButtonsAction, @NonNull View playersDonateStatusBg, @NonNull ImageView playersDonateStatusIcon, @NonNull TextView playersIdValue, @NonNull TextView playersLevel, @NonNull View playersLevelBg, @NonNull View playersNameBg, @NonNull TextView playersNameValue, @NonNull FrameLayout playersSkinView, @NonNull RecyclerView playersSlots, @NonNull RecyclerView playersStateInfo) {
        this.rootView = rootView;
        this.coordinatorForSnackbar = coordinatorForSnackbar;
        this.invBgItemsInBag = invBgItemsInBag;
        this.invBgThisItem = invBgThisItem;
        this.invBgTitleInfo = invBgTitleInfo;
        this.invDivWeight = invDivWeight;
        this.invIconThisItem = invIconThisItem;
        this.invInfoThisItem = invInfoThisItem;
        this.invListItemsInInventory = invListItemsInInventory;
        this.invTitleActualWeight = invTitleActualWeight;
        this.invTitleInventory = invTitleInventory;
        this.invTitleMaxWeight = invTitleMaxWeight;
        this.invTitleThisItem = invTitleThisItem;
        this.invTitleTypeWeight = invTitleTypeWeight;
        this.invTitleWeight = invTitleWeight;
        this.invValueItemsWeight = invValueItemsWeight;
        this.playersBlock = playersBlock;
        this.playersButtonsAction = playersButtonsAction;
        this.playersDonateStatusBg = playersDonateStatusBg;
        this.playersDonateStatusIcon = playersDonateStatusIcon;
        this.playersIdValue = playersIdValue;
        this.playersLevel = playersLevel;
        this.playersLevelBg = playersLevelBg;
        this.playersNameBg = playersNameBg;
        this.playersNameValue = playersNameValue;
        this.playersSkinView = playersSkinView;
        this.playersSlots = playersSlots;
        this.playersStateInfo = playersStateInfo;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static InventoryLayoutUsersInventoryBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static InventoryLayoutUsersInventoryBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.inventory_layout_users_inventory, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static InventoryLayoutUsersInventoryBinding bind(@NonNull View rootView) {
        int i = R.id.coordinator_for_snackbar;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ViewBindings.findChildViewById(rootView, R.id.coordinator_for_snackbar);
        if (coordinatorLayout != null) {
            i = R.id.inv_bg_items_in_bag;
            View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.inv_bg_items_in_bag);
            if (viewFindChildViewById != null) {
                i = R.id.inv_bg_this_item;
                View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.inv_bg_this_item);
                if (viewFindChildViewById2 != null) {
                    i = R.id.inv_bg_title_info;
                    View viewFindChildViewById3 = ViewBindings.findChildViewById(rootView, R.id.inv_bg_title_info);
                    if (viewFindChildViewById3 != null) {
                        i = R.id.inv_div_weight;
                        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.inv_div_weight);
                        if (textView != null) {
                            i = R.id.inv_icon_this_item;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.inv_icon_this_item);
                            if (imageView != null) {
                                i = R.id.inv_info_this_item;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.inv_info_this_item);
                                if (textView2 != null) {
                                    i = R.id.inv_list_items_in_inventory;
                                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.inv_list_items_in_inventory);
                                    if (recyclerView != null) {
                                        i = R.id.inv_title_actual_weight;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.inv_title_actual_weight);
                                        if (textView3 != null) {
                                            i = R.id.inv_title_inventory;
                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.inv_title_inventory);
                                            if (textView4 != null) {
                                                i = R.id.inv_title_max_weight;
                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.inv_title_max_weight);
                                                if (textView5 != null) {
                                                    i = R.id.inv_title_this_item;
                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.inv_title_this_item);
                                                    if (textView6 != null) {
                                                        i = R.id.inv_title_type_weight;
                                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.inv_title_type_weight);
                                                        if (textView7 != null) {
                                                            i = R.id.inv_title_weight;
                                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.inv_title_weight);
                                                            if (textView8 != null) {
                                                                i = R.id.inv_value_items_weight;
                                                                TextView textView9 = (TextView) ViewBindings.findChildViewById(rootView, R.id.inv_value_items_weight);
                                                                if (textView9 != null) {
                                                                    i = R.id.players_block;
                                                                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.players_block);
                                                                    if (constraintLayout != null) {
                                                                        i = R.id.players_buttons_action;
                                                                        RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.players_buttons_action);
                                                                        if (recyclerView2 != null) {
                                                                            i = R.id.players_donate_status_bg;
                                                                            View viewFindChildViewById4 = ViewBindings.findChildViewById(rootView, R.id.players_donate_status_bg);
                                                                            if (viewFindChildViewById4 != null) {
                                                                                i = R.id.players_donate_status_icon;
                                                                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.players_donate_status_icon);
                                                                                if (imageView2 != null) {
                                                                                    i = R.id.players_id_value;
                                                                                    TextView textView10 = (TextView) ViewBindings.findChildViewById(rootView, R.id.players_id_value);
                                                                                    if (textView10 != null) {
                                                                                        i = R.id.players_level;
                                                                                        TextView textView11 = (TextView) ViewBindings.findChildViewById(rootView, R.id.players_level);
                                                                                        if (textView11 != null) {
                                                                                            i = R.id.players_level_bg;
                                                                                            View viewFindChildViewById5 = ViewBindings.findChildViewById(rootView, R.id.players_level_bg);
                                                                                            if (viewFindChildViewById5 != null) {
                                                                                                i = R.id.players_name_bg;
                                                                                                View viewFindChildViewById6 = ViewBindings.findChildViewById(rootView, R.id.players_name_bg);
                                                                                                if (viewFindChildViewById6 != null) {
                                                                                                    i = R.id.players_name_value;
                                                                                                    TextView textView12 = (TextView) ViewBindings.findChildViewById(rootView, R.id.players_name_value);
                                                                                                    if (textView12 != null) {
                                                                                                        i = R.id.players_skin_view;
                                                                                                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.players_skin_view);
                                                                                                        if (frameLayout != null) {
                                                                                                            i = R.id.players_slots;
                                                                                                            RecyclerView recyclerView3 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.players_slots);
                                                                                                            if (recyclerView3 != null) {
                                                                                                                i = R.id.players_state_info;
                                                                                                                RecyclerView recyclerView4 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.players_state_info);
                                                                                                                if (recyclerView4 != null) {
                                                                                                                    return new InventoryLayoutUsersInventoryBinding((LinearLayout) rootView, coordinatorLayout, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3, textView, imageView, textView2, recyclerView, textView3, textView4, textView5, textView6, textView7, textView8, textView9, constraintLayout, recyclerView2, viewFindChildViewById4, imageView2, textView10, textView11, viewFindChildViewById5, viewFindChildViewById6, textView12, frameLayout, recyclerView3, recyclerView4);
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
