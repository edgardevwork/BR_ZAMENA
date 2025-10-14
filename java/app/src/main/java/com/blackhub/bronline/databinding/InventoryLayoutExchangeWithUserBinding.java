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
import com.blackhub.bronline.game.gui.inventory.CustomEditText;
import com.bless.client.R;

/* loaded from: classes.dex */
public final class InventoryLayoutExchangeWithUserBinding implements ViewBinding {

    @NonNull
    public final View exchangeBgButtonChat;

    @NonNull
    public final ImageView exchangeBgIconInfo;

    @NonNull
    public final View exchangeBgItemsInBag;

    @NonNull
    public final View exchangeBgItemsInCar;

    @NonNull
    public final View exchangeBgMoneyFromOther;

    @NonNull
    public final View exchangeBgPlayersName;

    @NonNull
    public final View exchangeBgTextInfo;

    @NonNull
    public final View exchangeBgUsersBag;

    @NonNull
    public final ImageButton exchangeBgValuesForBag;

    @NonNull
    public final TextView exchangeButtonApply;

    @NonNull
    public final TextView exchangeButtonCancel;

    @NonNull
    public final TextView exchangeDivWeightUsers;

    @NonNull
    public final CustomEditText exchangeEdittextMoney;

    @NonNull
    public final ImageView exchangeIconBagUsers;

    @NonNull
    public final RecyclerView exchangeListItemsInCar;

    @NonNull
    public final RecyclerView exchangeListItemsInInventory;

    @NonNull
    public final TextView exchangeMoneyFromText;

    @NonNull
    public final TextView exchangeMoneyFromTitle;

    @NonNull
    public final TextView exchangeTextInfo;

    @NonNull
    public final TextView exchangeTextMoney;

    @NonNull
    public final TextView exchangeTextOpenChat;

    @NonNull
    public final TextView exchangeTextPlayersNick;

    @NonNull
    public final TextView exchangeTextValueMessage;

    @NonNull
    public final TextView exchangeTitleActualWeightUsers;

    @NonNull
    public final TextView exchangeTitleMaxWeightUsers;

    @NonNull
    public final TextView exchangeTitleMyMoney;

    @NonNull
    public final TextView exchangeTitleTypeWeightUsers;

    @NonNull
    public final TextView exchangeTitleUsersBag;

    @NonNull
    public final TextView exchangeTitleWeightUsers;

    @NonNull
    public final TextView exchangeValueMoneyFrom;

    @NonNull
    public final TextView exchangeValueMyMoney;

    @NonNull
    public final View helpExchangeView;

    @NonNull
    public final RecyclerView playersSlotsInExchange;

    @NonNull
    public final ConstraintLayout rootView;

    public InventoryLayoutExchangeWithUserBinding(@NonNull ConstraintLayout rootView, @NonNull View exchangeBgButtonChat, @NonNull ImageView exchangeBgIconInfo, @NonNull View exchangeBgItemsInBag, @NonNull View exchangeBgItemsInCar, @NonNull View exchangeBgMoneyFromOther, @NonNull View exchangeBgPlayersName, @NonNull View exchangeBgTextInfo, @NonNull View exchangeBgUsersBag, @NonNull ImageButton exchangeBgValuesForBag, @NonNull TextView exchangeButtonApply, @NonNull TextView exchangeButtonCancel, @NonNull TextView exchangeDivWeightUsers, @NonNull CustomEditText exchangeEdittextMoney, @NonNull ImageView exchangeIconBagUsers, @NonNull RecyclerView exchangeListItemsInCar, @NonNull RecyclerView exchangeListItemsInInventory, @NonNull TextView exchangeMoneyFromText, @NonNull TextView exchangeMoneyFromTitle, @NonNull TextView exchangeTextInfo, @NonNull TextView exchangeTextMoney, @NonNull TextView exchangeTextOpenChat, @NonNull TextView exchangeTextPlayersNick, @NonNull TextView exchangeTextValueMessage, @NonNull TextView exchangeTitleActualWeightUsers, @NonNull TextView exchangeTitleMaxWeightUsers, @NonNull TextView exchangeTitleMyMoney, @NonNull TextView exchangeTitleTypeWeightUsers, @NonNull TextView exchangeTitleUsersBag, @NonNull TextView exchangeTitleWeightUsers, @NonNull TextView exchangeValueMoneyFrom, @NonNull TextView exchangeValueMyMoney, @NonNull View helpExchangeView, @NonNull RecyclerView playersSlotsInExchange) {
        this.rootView = rootView;
        this.exchangeBgButtonChat = exchangeBgButtonChat;
        this.exchangeBgIconInfo = exchangeBgIconInfo;
        this.exchangeBgItemsInBag = exchangeBgItemsInBag;
        this.exchangeBgItemsInCar = exchangeBgItemsInCar;
        this.exchangeBgMoneyFromOther = exchangeBgMoneyFromOther;
        this.exchangeBgPlayersName = exchangeBgPlayersName;
        this.exchangeBgTextInfo = exchangeBgTextInfo;
        this.exchangeBgUsersBag = exchangeBgUsersBag;
        this.exchangeBgValuesForBag = exchangeBgValuesForBag;
        this.exchangeButtonApply = exchangeButtonApply;
        this.exchangeButtonCancel = exchangeButtonCancel;
        this.exchangeDivWeightUsers = exchangeDivWeightUsers;
        this.exchangeEdittextMoney = exchangeEdittextMoney;
        this.exchangeIconBagUsers = exchangeIconBagUsers;
        this.exchangeListItemsInCar = exchangeListItemsInCar;
        this.exchangeListItemsInInventory = exchangeListItemsInInventory;
        this.exchangeMoneyFromText = exchangeMoneyFromText;
        this.exchangeMoneyFromTitle = exchangeMoneyFromTitle;
        this.exchangeTextInfo = exchangeTextInfo;
        this.exchangeTextMoney = exchangeTextMoney;
        this.exchangeTextOpenChat = exchangeTextOpenChat;
        this.exchangeTextPlayersNick = exchangeTextPlayersNick;
        this.exchangeTextValueMessage = exchangeTextValueMessage;
        this.exchangeTitleActualWeightUsers = exchangeTitleActualWeightUsers;
        this.exchangeTitleMaxWeightUsers = exchangeTitleMaxWeightUsers;
        this.exchangeTitleMyMoney = exchangeTitleMyMoney;
        this.exchangeTitleTypeWeightUsers = exchangeTitleTypeWeightUsers;
        this.exchangeTitleUsersBag = exchangeTitleUsersBag;
        this.exchangeTitleWeightUsers = exchangeTitleWeightUsers;
        this.exchangeValueMoneyFrom = exchangeValueMoneyFrom;
        this.exchangeValueMyMoney = exchangeValueMyMoney;
        this.helpExchangeView = helpExchangeView;
        this.playersSlotsInExchange = playersSlotsInExchange;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static InventoryLayoutExchangeWithUserBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static InventoryLayoutExchangeWithUserBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.inventory_layout_exchange_with_user, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static InventoryLayoutExchangeWithUserBinding bind(@NonNull View rootView) {
        int i = R.id.exchange_bg_button_chat;
        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.exchange_bg_button_chat);
        if (viewFindChildViewById != null) {
            i = R.id.exchange_bg_icon_info;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.exchange_bg_icon_info);
            if (imageView != null) {
                i = R.id.exchange_bg_items_in_bag;
                View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.exchange_bg_items_in_bag);
                if (viewFindChildViewById2 != null) {
                    i = R.id.exchange_bg_items_in_car;
                    View viewFindChildViewById3 = ViewBindings.findChildViewById(rootView, R.id.exchange_bg_items_in_car);
                    if (viewFindChildViewById3 != null) {
                        i = R.id.exchange_bg_money_from_other;
                        View viewFindChildViewById4 = ViewBindings.findChildViewById(rootView, R.id.exchange_bg_money_from_other);
                        if (viewFindChildViewById4 != null) {
                            i = R.id.exchange_bg_players_name;
                            View viewFindChildViewById5 = ViewBindings.findChildViewById(rootView, R.id.exchange_bg_players_name);
                            if (viewFindChildViewById5 != null) {
                                i = R.id.exchange_bg_text_info;
                                View viewFindChildViewById6 = ViewBindings.findChildViewById(rootView, R.id.exchange_bg_text_info);
                                if (viewFindChildViewById6 != null) {
                                    i = R.id.exchange_bg_users_bag;
                                    View viewFindChildViewById7 = ViewBindings.findChildViewById(rootView, R.id.exchange_bg_users_bag);
                                    if (viewFindChildViewById7 != null) {
                                        i = R.id.exchange_bg_values_for_bag;
                                        ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.exchange_bg_values_for_bag);
                                        if (imageButton != null) {
                                            i = R.id.exchange_button_apply;
                                            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.exchange_button_apply);
                                            if (textView != null) {
                                                i = R.id.exchange_button_cancel;
                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.exchange_button_cancel);
                                                if (textView2 != null) {
                                                    i = R.id.exchange_div_weight_users;
                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.exchange_div_weight_users);
                                                    if (textView3 != null) {
                                                        i = R.id.exchange_edittext_money;
                                                        CustomEditText customEditText = (CustomEditText) ViewBindings.findChildViewById(rootView, R.id.exchange_edittext_money);
                                                        if (customEditText != null) {
                                                            i = R.id.exchange_icon_bag_users;
                                                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.exchange_icon_bag_users);
                                                            if (imageView2 != null) {
                                                                i = R.id.exchange_list_items_in_car;
                                                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.exchange_list_items_in_car);
                                                                if (recyclerView != null) {
                                                                    i = R.id.exchange_list_items_in_inventory;
                                                                    RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.exchange_list_items_in_inventory);
                                                                    if (recyclerView2 != null) {
                                                                        i = R.id.exchange_money_from_text;
                                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.exchange_money_from_text);
                                                                        if (textView4 != null) {
                                                                            i = R.id.exchange_money_from_title;
                                                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.exchange_money_from_title);
                                                                            if (textView5 != null) {
                                                                                i = R.id.exchange_text_info;
                                                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.exchange_text_info);
                                                                                if (textView6 != null) {
                                                                                    i = R.id.exchange_text_money;
                                                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.exchange_text_money);
                                                                                    if (textView7 != null) {
                                                                                        i = R.id.exchange_text_open_chat;
                                                                                        TextView textView8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.exchange_text_open_chat);
                                                                                        if (textView8 != null) {
                                                                                            i = R.id.exchange_text_players_nick;
                                                                                            TextView textView9 = (TextView) ViewBindings.findChildViewById(rootView, R.id.exchange_text_players_nick);
                                                                                            if (textView9 != null) {
                                                                                                i = R.id.exchange_text_value_message;
                                                                                                TextView textView10 = (TextView) ViewBindings.findChildViewById(rootView, R.id.exchange_text_value_message);
                                                                                                if (textView10 != null) {
                                                                                                    i = R.id.exchange_title_actual_weight_users;
                                                                                                    TextView textView11 = (TextView) ViewBindings.findChildViewById(rootView, R.id.exchange_title_actual_weight_users);
                                                                                                    if (textView11 != null) {
                                                                                                        i = R.id.exchange_title_max_weight_users;
                                                                                                        TextView textView12 = (TextView) ViewBindings.findChildViewById(rootView, R.id.exchange_title_max_weight_users);
                                                                                                        if (textView12 != null) {
                                                                                                            i = R.id.exchange_title_my_money;
                                                                                                            TextView textView13 = (TextView) ViewBindings.findChildViewById(rootView, R.id.exchange_title_my_money);
                                                                                                            if (textView13 != null) {
                                                                                                                i = R.id.exchange_title_type_weight_users;
                                                                                                                TextView textView14 = (TextView) ViewBindings.findChildViewById(rootView, R.id.exchange_title_type_weight_users);
                                                                                                                if (textView14 != null) {
                                                                                                                    i = R.id.exchange_title_users_bag;
                                                                                                                    TextView textView15 = (TextView) ViewBindings.findChildViewById(rootView, R.id.exchange_title_users_bag);
                                                                                                                    if (textView15 != null) {
                                                                                                                        i = R.id.exchange_title_weight_users;
                                                                                                                        TextView textView16 = (TextView) ViewBindings.findChildViewById(rootView, R.id.exchange_title_weight_users);
                                                                                                                        if (textView16 != null) {
                                                                                                                            i = R.id.exchange_value_money_from;
                                                                                                                            TextView textView17 = (TextView) ViewBindings.findChildViewById(rootView, R.id.exchange_value_money_from);
                                                                                                                            if (textView17 != null) {
                                                                                                                                i = R.id.exchange_value_my_money;
                                                                                                                                TextView textView18 = (TextView) ViewBindings.findChildViewById(rootView, R.id.exchange_value_my_money);
                                                                                                                                if (textView18 != null) {
                                                                                                                                    i = R.id.help_exchange_view;
                                                                                                                                    View viewFindChildViewById8 = ViewBindings.findChildViewById(rootView, R.id.help_exchange_view);
                                                                                                                                    if (viewFindChildViewById8 != null) {
                                                                                                                                        i = R.id.players_slots_in_exchange;
                                                                                                                                        RecyclerView recyclerView3 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.players_slots_in_exchange);
                                                                                                                                        if (recyclerView3 != null) {
                                                                                                                                            return new InventoryLayoutExchangeWithUserBinding((ConstraintLayout) rootView, viewFindChildViewById, imageView, viewFindChildViewById2, viewFindChildViewById3, viewFindChildViewById4, viewFindChildViewById5, viewFindChildViewById6, viewFindChildViewById7, imageButton, textView, textView2, textView3, customEditText, imageView2, recyclerView, recyclerView2, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, textView17, textView18, viewFindChildViewById8, recyclerView3);
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
