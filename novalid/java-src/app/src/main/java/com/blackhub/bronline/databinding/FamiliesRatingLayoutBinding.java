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
public final class FamiliesRatingLayoutBinding implements ViewBinding {

    @NonNull
    public final View bgTitleTableWithColumns;

    @NonNull
    public final View bodyTable;

    @NonNull
    public final AppCompatButton buttonTopPrices;

    @NonNull
    public final RecyclerView currentFamily;

    @NonNull
    public final TextView familyIcon;

    @NonNull
    public final TextView familyNick;

    @NonNull
    public final RecyclerView familyTop;

    @NonNull
    public final View leftBg;

    @NonNull
    public final View leftBottomBlock;

    @NonNull
    public final ImageView otherTopIcon;

    @NonNull
    public final TextView playersGames;

    @NonNull
    public final View rightBg;

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final TextView titleOtherTop;

    @NonNull
    public final TextView titleRating;

    @NonNull
    public final TextView titleRatingOther;

    @NonNull
    public final ImageView topIcon;

    @NonNull
    public final TextView topPosition;

    @NonNull
    public final TextView topTable;

    @NonNull
    public final TextView valueCaptured;

    @NonNull
    public final TextView valueOtherTop;

    public FamiliesRatingLayoutBinding(@NonNull ConstraintLayout rootView, @NonNull View bgTitleTableWithColumns, @NonNull View bodyTable, @NonNull AppCompatButton buttonTopPrices, @NonNull RecyclerView currentFamily, @NonNull TextView familyIcon, @NonNull TextView familyNick, @NonNull RecyclerView familyTop, @NonNull View leftBg, @NonNull View leftBottomBlock, @NonNull ImageView otherTopIcon, @NonNull TextView playersGames, @NonNull View rightBg, @NonNull TextView titleOtherTop, @NonNull TextView titleRating, @NonNull TextView titleRatingOther, @NonNull ImageView topIcon, @NonNull TextView topPosition, @NonNull TextView topTable, @NonNull TextView valueCaptured, @NonNull TextView valueOtherTop) {
        this.rootView = rootView;
        this.bgTitleTableWithColumns = bgTitleTableWithColumns;
        this.bodyTable = bodyTable;
        this.buttonTopPrices = buttonTopPrices;
        this.currentFamily = currentFamily;
        this.familyIcon = familyIcon;
        this.familyNick = familyNick;
        this.familyTop = familyTop;
        this.leftBg = leftBg;
        this.leftBottomBlock = leftBottomBlock;
        this.otherTopIcon = otherTopIcon;
        this.playersGames = playersGames;
        this.rightBg = rightBg;
        this.titleOtherTop = titleOtherTop;
        this.titleRating = titleRating;
        this.titleRatingOther = titleRatingOther;
        this.topIcon = topIcon;
        this.topPosition = topPosition;
        this.topTable = topTable;
        this.valueCaptured = valueCaptured;
        this.valueOtherTop = valueOtherTop;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FamiliesRatingLayoutBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FamiliesRatingLayoutBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.families_rating_layout, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static FamiliesRatingLayoutBinding bind(@NonNull View rootView) {
        int i = R.id.bg_title_table_with_columns;
        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.bg_title_table_with_columns);
        if (viewFindChildViewById != null) {
            i = R.id.body_table;
            View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.body_table);
            if (viewFindChildViewById2 != null) {
                i = R.id.button_top_prices;
                AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.button_top_prices);
                if (appCompatButton != null) {
                    i = R.id.current_family;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.current_family);
                    if (recyclerView != null) {
                        i = R.id.family_icon;
                        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.family_icon);
                        if (textView != null) {
                            i = R.id.family_nick;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.family_nick);
                            if (textView2 != null) {
                                i = R.id.family_top;
                                RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.family_top);
                                if (recyclerView2 != null) {
                                    i = R.id.left_bg;
                                    View viewFindChildViewById3 = ViewBindings.findChildViewById(rootView, R.id.left_bg);
                                    if (viewFindChildViewById3 != null) {
                                        i = R.id.left_bottom_block;
                                        View viewFindChildViewById4 = ViewBindings.findChildViewById(rootView, R.id.left_bottom_block);
                                        if (viewFindChildViewById4 != null) {
                                            i = R.id.other_top_icon;
                                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.other_top_icon);
                                            if (imageView != null) {
                                                i = R.id.players_games;
                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.players_games);
                                                if (textView3 != null) {
                                                    i = R.id.right_bg;
                                                    View viewFindChildViewById5 = ViewBindings.findChildViewById(rootView, R.id.right_bg);
                                                    if (viewFindChildViewById5 != null) {
                                                        i = R.id.title_other_top;
                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title_other_top);
                                                        if (textView4 != null) {
                                                            i = R.id.title_rating;
                                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title_rating);
                                                            if (textView5 != null) {
                                                                i = R.id.title_rating_other;
                                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title_rating_other);
                                                                if (textView6 != null) {
                                                                    i = R.id.top_icon;
                                                                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.top_icon);
                                                                    if (imageView2 != null) {
                                                                        i = R.id.top_position;
                                                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.top_position);
                                                                        if (textView7 != null) {
                                                                            i = R.id.top_table;
                                                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.top_table);
                                                                            if (textView8 != null) {
                                                                                i = R.id.value_captured;
                                                                                TextView textView9 = (TextView) ViewBindings.findChildViewById(rootView, R.id.value_captured);
                                                                                if (textView9 != null) {
                                                                                    i = R.id.value_other_top;
                                                                                    TextView textView10 = (TextView) ViewBindings.findChildViewById(rootView, R.id.value_other_top);
                                                                                    if (textView10 != null) {
                                                                                        return new FamiliesRatingLayoutBinding((ConstraintLayout) rootView, viewFindChildViewById, viewFindChildViewById2, appCompatButton, recyclerView, textView, textView2, recyclerView2, viewFindChildViewById3, viewFindChildViewById4, imageView, textView3, viewFindChildViewById5, textView4, textView5, textView6, imageView2, textView7, textView8, textView9, textView10);
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
