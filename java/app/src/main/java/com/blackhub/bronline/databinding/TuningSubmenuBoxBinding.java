package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;

/* loaded from: classes3.dex */
public final class TuningSubmenuBoxBinding implements ViewBinding {

    @NonNull
    public final View bgBoxOpenCard;

    @NonNull
    public final RelativeLayout blockOpenCards;

    @NonNull
    public final RelativeLayout boxCardInvisible;

    @NonNull
    public final RelativeLayout boxCardVisible;

    @NonNull
    public final AppCompatButton buttonExitCardView;

    @NonNull
    public final ImageView iconCardInvisible;

    @NonNull
    public final ImageView iconCardVisible;

    @NonNull
    public final LinearLayout leftBlock;

    @NonNull
    public final TextView nameDetailInBox;

    @NonNull
    public final TextView nameThisBox;

    @NonNull
    public final RecyclerView recvBoxItems;

    @NonNull
    public final LinearLayout rightBlock;

    @NonNull
    public final RelativeLayout rootView;

    @NonNull
    public final TextView titleCheckBoxInvisible;

    @NonNull
    public final TextView titleThisBoxWindow;

    @NonNull
    public final ConstraintLayout tuningPriceBox;

    @NonNull
    public final TextView tuningValuePriceBox;

    @NonNull
    public final TextView typeDetailInBox;

    @NonNull
    public final LinearLayout viewBoxBuying;

    public TuningSubmenuBoxBinding(@NonNull RelativeLayout rootView, @NonNull View bgBoxOpenCard, @NonNull RelativeLayout blockOpenCards, @NonNull RelativeLayout boxCardInvisible, @NonNull RelativeLayout boxCardVisible, @NonNull AppCompatButton buttonExitCardView, @NonNull ImageView iconCardInvisible, @NonNull ImageView iconCardVisible, @NonNull LinearLayout leftBlock, @NonNull TextView nameDetailInBox, @NonNull TextView nameThisBox, @NonNull RecyclerView recvBoxItems, @NonNull LinearLayout rightBlock, @NonNull TextView titleCheckBoxInvisible, @NonNull TextView titleThisBoxWindow, @NonNull ConstraintLayout tuningPriceBox, @NonNull TextView tuningValuePriceBox, @NonNull TextView typeDetailInBox, @NonNull LinearLayout viewBoxBuying) {
        this.rootView = rootView;
        this.bgBoxOpenCard = bgBoxOpenCard;
        this.blockOpenCards = blockOpenCards;
        this.boxCardInvisible = boxCardInvisible;
        this.boxCardVisible = boxCardVisible;
        this.buttonExitCardView = buttonExitCardView;
        this.iconCardInvisible = iconCardInvisible;
        this.iconCardVisible = iconCardVisible;
        this.leftBlock = leftBlock;
        this.nameDetailInBox = nameDetailInBox;
        this.nameThisBox = nameThisBox;
        this.recvBoxItems = recvBoxItems;
        this.rightBlock = rightBlock;
        this.titleCheckBoxInvisible = titleCheckBoxInvisible;
        this.titleThisBoxWindow = titleThisBoxWindow;
        this.tuningPriceBox = tuningPriceBox;
        this.tuningValuePriceBox = tuningValuePriceBox;
        this.typeDetailInBox = typeDetailInBox;
        this.viewBoxBuying = viewBoxBuying;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static TuningSubmenuBoxBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static TuningSubmenuBoxBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.tuning_submenu_box, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static TuningSubmenuBoxBinding bind(@NonNull View rootView) {
        int i = R.id.bg_box_open_card;
        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.bg_box_open_card);
        if (viewFindChildViewById != null) {
            i = R.id.block_open_cards;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.block_open_cards);
            if (relativeLayout != null) {
                i = R.id.box_card_invisible;
                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.box_card_invisible);
                if (relativeLayout2 != null) {
                    i = R.id.box_card_visible;
                    RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.box_card_visible);
                    if (relativeLayout3 != null) {
                        i = R.id.button_exit_card_view;
                        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.button_exit_card_view);
                        if (appCompatButton != null) {
                            i = R.id.icon_card_invisible;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.icon_card_invisible);
                            if (imageView != null) {
                                i = R.id.icon_card_visible;
                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.icon_card_visible);
                                if (imageView2 != null) {
                                    i = R.id.left_block;
                                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.left_block);
                                    if (linearLayout != null) {
                                        i = R.id.name_detail_in_box;
                                        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.name_detail_in_box);
                                        if (textView != null) {
                                            i = R.id.name_this_box;
                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.name_this_box);
                                            if (textView2 != null) {
                                                i = R.id.recv_box_items;
                                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.recv_box_items);
                                                if (recyclerView != null) {
                                                    i = R.id.right_block;
                                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.right_block);
                                                    if (linearLayout2 != null) {
                                                        i = R.id.title_check_box_invisible;
                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title_check_box_invisible);
                                                        if (textView3 != null) {
                                                            i = R.id.title_this_box_window;
                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title_this_box_window);
                                                            if (textView4 != null) {
                                                                i = R.id.tuning_price_box;
                                                                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.tuning_price_box);
                                                                if (constraintLayout != null) {
                                                                    i = R.id.tuning_value_price_box;
                                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tuning_value_price_box);
                                                                    if (textView5 != null) {
                                                                        i = R.id.type_detail_in_box;
                                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.type_detail_in_box);
                                                                        if (textView6 != null) {
                                                                            i = R.id.view_box_buying;
                                                                            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.view_box_buying);
                                                                            if (linearLayout3 != null) {
                                                                                return new TuningSubmenuBoxBinding((RelativeLayout) rootView, viewFindChildViewById, relativeLayout, relativeLayout2, relativeLayout3, appCompatButton, imageView, imageView2, linearLayout, textView, textView2, recyclerView, linearLayout2, textView3, textView4, constraintLayout, textView5, textView6, linearLayout3);
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
