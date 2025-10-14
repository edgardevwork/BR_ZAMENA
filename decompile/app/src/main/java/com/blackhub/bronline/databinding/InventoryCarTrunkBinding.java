package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;

/* loaded from: classes.dex */
public final class InventoryCarTrunkBinding implements ViewBinding {

    @NonNull
    public final View carTrunkBgItemsInBag;

    @NonNull
    public final View carTrunkBgItemsInCar;

    @NonNull
    public final View carTrunkBgMainButtons;

    @NonNull
    public final View carTrunkBgNameCar;

    @NonNull
    public final View carTrunkBgUsersBag;

    @NonNull
    public final View carTrunkBgValuesForBag;

    @NonNull
    public final TextView carTrunkDivWeight;

    @NonNull
    public final TextView carTrunkDivWeightUsers;

    @NonNull
    public final ImageView carTrunkIconBag;

    @NonNull
    public final ImageView carTrunkIconBagUsers;

    @NonNull
    public final RecyclerView carTrunkListItemsInCar;

    @NonNull
    public final RecyclerView carTrunkListItemsInInventory;

    @NonNull
    public final ImageButton carTrunkMainButtonExit;

    @NonNull
    public final RecyclerView carTrunkMainButtons;

    @NonNull
    public final TextView carTrunkTextNameCar;

    @NonNull
    public final TextView carTrunkTitleActualWeight;

    @NonNull
    public final TextView carTrunkTitleActualWeightUsers;

    @NonNull
    public final TextView carTrunkTitleMaxWeight;

    @NonNull
    public final TextView carTrunkTitleMaxWeightUsers;

    @NonNull
    public final TextView carTrunkTitleTypeWeight;

    @NonNull
    public final TextView carTrunkTitleTypeWeightUsers;

    @NonNull
    public final TextView carTrunkTitleUsersBag;

    @NonNull
    public final TextView carTrunkTitleWeight;

    @NonNull
    public final TextView carTrunkTitleWeightUsers;

    @NonNull
    public final View familyBg;

    @NonNull
    public final RecyclerView playersSlotsInCarTrunk;

    @NonNull
    public final ConstraintLayout rootView;

    public InventoryCarTrunkBinding(@NonNull ConstraintLayout rootView, @NonNull View carTrunkBgItemsInBag, @NonNull View carTrunkBgItemsInCar, @NonNull View carTrunkBgMainButtons, @NonNull View carTrunkBgNameCar, @NonNull View carTrunkBgUsersBag, @NonNull View carTrunkBgValuesForBag, @NonNull TextView carTrunkDivWeight, @NonNull TextView carTrunkDivWeightUsers, @NonNull ImageView carTrunkIconBag, @NonNull ImageView carTrunkIconBagUsers, @NonNull RecyclerView carTrunkListItemsInCar, @NonNull RecyclerView carTrunkListItemsInInventory, @NonNull ImageButton carTrunkMainButtonExit, @NonNull RecyclerView carTrunkMainButtons, @NonNull TextView carTrunkTextNameCar, @NonNull TextView carTrunkTitleActualWeight, @NonNull TextView carTrunkTitleActualWeightUsers, @NonNull TextView carTrunkTitleMaxWeight, @NonNull TextView carTrunkTitleMaxWeightUsers, @NonNull TextView carTrunkTitleTypeWeight, @NonNull TextView carTrunkTitleTypeWeightUsers, @NonNull TextView carTrunkTitleUsersBag, @NonNull TextView carTrunkTitleWeight, @NonNull TextView carTrunkTitleWeightUsers, @NonNull View familyBg, @NonNull RecyclerView playersSlotsInCarTrunk) {
        this.rootView = rootView;
        this.carTrunkBgItemsInBag = carTrunkBgItemsInBag;
        this.carTrunkBgItemsInCar = carTrunkBgItemsInCar;
        this.carTrunkBgMainButtons = carTrunkBgMainButtons;
        this.carTrunkBgNameCar = carTrunkBgNameCar;
        this.carTrunkBgUsersBag = carTrunkBgUsersBag;
        this.carTrunkBgValuesForBag = carTrunkBgValuesForBag;
        this.carTrunkDivWeight = carTrunkDivWeight;
        this.carTrunkDivWeightUsers = carTrunkDivWeightUsers;
        this.carTrunkIconBag = carTrunkIconBag;
        this.carTrunkIconBagUsers = carTrunkIconBagUsers;
        this.carTrunkListItemsInCar = carTrunkListItemsInCar;
        this.carTrunkListItemsInInventory = carTrunkListItemsInInventory;
        this.carTrunkMainButtonExit = carTrunkMainButtonExit;
        this.carTrunkMainButtons = carTrunkMainButtons;
        this.carTrunkTextNameCar = carTrunkTextNameCar;
        this.carTrunkTitleActualWeight = carTrunkTitleActualWeight;
        this.carTrunkTitleActualWeightUsers = carTrunkTitleActualWeightUsers;
        this.carTrunkTitleMaxWeight = carTrunkTitleMaxWeight;
        this.carTrunkTitleMaxWeightUsers = carTrunkTitleMaxWeightUsers;
        this.carTrunkTitleTypeWeight = carTrunkTitleTypeWeight;
        this.carTrunkTitleTypeWeightUsers = carTrunkTitleTypeWeightUsers;
        this.carTrunkTitleUsersBag = carTrunkTitleUsersBag;
        this.carTrunkTitleWeight = carTrunkTitleWeight;
        this.carTrunkTitleWeightUsers = carTrunkTitleWeightUsers;
        this.familyBg = familyBg;
        this.playersSlotsInCarTrunk = playersSlotsInCarTrunk;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static InventoryCarTrunkBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static InventoryCarTrunkBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.inventory_car_trunk, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static InventoryCarTrunkBinding bind(@NonNull View rootView) {
        int i = R.id.car_trunk_bg_items_in_bag;
        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.car_trunk_bg_items_in_bag);
        if (viewFindChildViewById != null) {
            i = R.id.car_trunk_bg_items_in_car;
            View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.car_trunk_bg_items_in_car);
            if (viewFindChildViewById2 != null) {
                i = R.id.car_trunk_bg_main_buttons;
                View viewFindChildViewById3 = ViewBindings.findChildViewById(rootView, R.id.car_trunk_bg_main_buttons);
                if (viewFindChildViewById3 != null) {
                    i = R.id.car_trunk_bg_name_car;
                    View viewFindChildViewById4 = ViewBindings.findChildViewById(rootView, R.id.car_trunk_bg_name_car);
                    if (viewFindChildViewById4 != null) {
                        i = R.id.car_trunk_bg_users_bag;
                        View viewFindChildViewById5 = ViewBindings.findChildViewById(rootView, R.id.car_trunk_bg_users_bag);
                        if (viewFindChildViewById5 != null) {
                            i = R.id.car_trunk_bg_values_for_bag;
                            View viewFindChildViewById6 = ViewBindings.findChildViewById(rootView, R.id.car_trunk_bg_values_for_bag);
                            if (viewFindChildViewById6 != null) {
                                i = R.id.car_trunk_div_weight;
                                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.car_trunk_div_weight);
                                if (textView != null) {
                                    i = R.id.car_trunk_div_weight_users;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.car_trunk_div_weight_users);
                                    if (textView2 != null) {
                                        i = R.id.car_trunk_icon_bag;
                                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.car_trunk_icon_bag);
                                        if (imageView != null) {
                                            i = R.id.car_trunk_icon_bag_users;
                                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.car_trunk_icon_bag_users);
                                            if (imageView2 != null) {
                                                i = R.id.car_trunk_list_items_in_car;
                                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.car_trunk_list_items_in_car);
                                                if (recyclerView != null) {
                                                    i = R.id.car_trunk_list_items_in_inventory;
                                                    RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.car_trunk_list_items_in_inventory);
                                                    if (recyclerView2 != null) {
                                                        i = R.id.car_trunk_main_button_exit;
                                                        ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.car_trunk_main_button_exit);
                                                        if (imageButton != null) {
                                                            i = R.id.car_trunk_main_buttons;
                                                            RecyclerView recyclerView3 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.car_trunk_main_buttons);
                                                            if (recyclerView3 != null) {
                                                                i = R.id.car_trunk_text_name_car;
                                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.car_trunk_text_name_car);
                                                                if (textView3 != null) {
                                                                    i = R.id.car_trunk_title_actual_weight;
                                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.car_trunk_title_actual_weight);
                                                                    if (textView4 != null) {
                                                                        i = R.id.car_trunk_title_actual_weight_users;
                                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.car_trunk_title_actual_weight_users);
                                                                        if (textView5 != null) {
                                                                            i = R.id.car_trunk_title_max_weight;
                                                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.car_trunk_title_max_weight);
                                                                            if (textView6 != null) {
                                                                                i = R.id.car_trunk_title_max_weight_users;
                                                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.car_trunk_title_max_weight_users);
                                                                                if (textView7 != null) {
                                                                                    i = R.id.car_trunk_title_type_weight;
                                                                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.car_trunk_title_type_weight);
                                                                                    if (textView8 != null) {
                                                                                        i = R.id.car_trunk_title_type_weight_users;
                                                                                        TextView textView9 = (TextView) ViewBindings.findChildViewById(rootView, R.id.car_trunk_title_type_weight_users);
                                                                                        if (textView9 != null) {
                                                                                            i = R.id.car_trunk_title_users_bag;
                                                                                            TextView textView10 = (TextView) ViewBindings.findChildViewById(rootView, R.id.car_trunk_title_users_bag);
                                                                                            if (textView10 != null) {
                                                                                                i = R.id.car_trunk_title_weight;
                                                                                                TextView textView11 = (TextView) ViewBindings.findChildViewById(rootView, R.id.car_trunk_title_weight);
                                                                                                if (textView11 != null) {
                                                                                                    i = R.id.car_trunk_title_weight_users;
                                                                                                    TextView textView12 = (TextView) ViewBindings.findChildViewById(rootView, R.id.car_trunk_title_weight_users);
                                                                                                    if (textView12 != null) {
                                                                                                        i = R.id.family_bg;
                                                                                                        View viewFindChildViewById7 = ViewBindings.findChildViewById(rootView, R.id.family_bg);
                                                                                                        if (viewFindChildViewById7 != null) {
                                                                                                            i = R.id.players_slots_in_car_trunk;
                                                                                                            RecyclerView recyclerView4 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.players_slots_in_car_trunk);
                                                                                                            if (recyclerView4 != null) {
                                                                                                                return new InventoryCarTrunkBinding((ConstraintLayout) rootView, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3, viewFindChildViewById4, viewFindChildViewById5, viewFindChildViewById6, textView, textView2, imageView, imageView2, recyclerView, recyclerView2, imageButton, recyclerView3, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, viewFindChildViewById7, recyclerView4);
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
