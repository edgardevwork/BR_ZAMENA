package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
public final class EntertainmentSystemTopLayoutBinding implements ViewBinding {

    @NonNull
    public final ImageView arrowSubmenu;

    @NonNull
    public final View bodyTable;

    @NonNull
    public final RecyclerView currentPlayer;

    @NonNull
    public final View leftBg;

    @NonNull
    public final RecyclerView listWithGamesFilter;

    @NonNull
    public final ImageView otherTopIcon;

    @NonNull
    public final RecyclerView playersTop;

    @NonNull
    public final View rightBg;

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final TextView title1;

    @NonNull
    public final TextView title2;

    @NonNull
    public final TextView title3;

    @NonNull
    public final TextView title4;

    @NonNull
    public final TextView titleGame;

    @NonNull
    public final TextView titleGameOther;

    @NonNull
    public final TextView titleOtherTop;

    @NonNull
    public final ImageView topIcon;

    @NonNull
    public final View topTable;

    @NonNull
    public final TextView valueGame;

    @NonNull
    public final TextView valueGameOther;

    @NonNull
    public final TextView valueOtherTop;

    public EntertainmentSystemTopLayoutBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView arrowSubmenu, @NonNull View bodyTable, @NonNull RecyclerView currentPlayer, @NonNull View leftBg, @NonNull RecyclerView listWithGamesFilter, @NonNull ImageView otherTopIcon, @NonNull RecyclerView playersTop, @NonNull View rightBg, @NonNull TextView title1, @NonNull TextView title2, @NonNull TextView title3, @NonNull TextView title4, @NonNull TextView titleGame, @NonNull TextView titleGameOther, @NonNull TextView titleOtherTop, @NonNull ImageView topIcon, @NonNull View topTable, @NonNull TextView valueGame, @NonNull TextView valueGameOther, @NonNull TextView valueOtherTop) {
        this.rootView = rootView;
        this.arrowSubmenu = arrowSubmenu;
        this.bodyTable = bodyTable;
        this.currentPlayer = currentPlayer;
        this.leftBg = leftBg;
        this.listWithGamesFilter = listWithGamesFilter;
        this.otherTopIcon = otherTopIcon;
        this.playersTop = playersTop;
        this.rightBg = rightBg;
        this.title1 = title1;
        this.title2 = title2;
        this.title3 = title3;
        this.title4 = title4;
        this.titleGame = titleGame;
        this.titleGameOther = titleGameOther;
        this.titleOtherTop = titleOtherTop;
        this.topIcon = topIcon;
        this.topTable = topTable;
        this.valueGame = valueGame;
        this.valueGameOther = valueGameOther;
        this.valueOtherTop = valueOtherTop;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static EntertainmentSystemTopLayoutBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static EntertainmentSystemTopLayoutBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.entertainment_system_top_layout, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static EntertainmentSystemTopLayoutBinding bind(@NonNull View rootView) {
        int i = R.id.arrow_submenu;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.arrow_submenu);
        if (imageView != null) {
            i = R.id.body_table;
            View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.body_table);
            if (viewFindChildViewById != null) {
                i = R.id.current_player;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.current_player);
                if (recyclerView != null) {
                    i = R.id.left_bg;
                    View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.left_bg);
                    if (viewFindChildViewById2 != null) {
                        i = R.id.list_with_games_filter;
                        RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.list_with_games_filter);
                        if (recyclerView2 != null) {
                            i = R.id.other_top_icon;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.other_top_icon);
                            if (imageView2 != null) {
                                i = R.id.players_top;
                                RecyclerView recyclerView3 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.players_top);
                                if (recyclerView3 != null) {
                                    i = R.id.right_bg;
                                    View viewFindChildViewById3 = ViewBindings.findChildViewById(rootView, R.id.right_bg);
                                    if (viewFindChildViewById3 != null) {
                                        i = R.id.title_1;
                                        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.title_1);
                                        if (textView != null) {
                                            i = R.id.title_2;
                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title_2);
                                            if (textView2 != null) {
                                                i = R.id.title_3;
                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title_3);
                                                if (textView3 != null) {
                                                    i = R.id.title_4;
                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title_4);
                                                    if (textView4 != null) {
                                                        i = R.id.title_game;
                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title_game);
                                                        if (textView5 != null) {
                                                            i = R.id.title_game_other;
                                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title_game_other);
                                                            if (textView6 != null) {
                                                                i = R.id.title_other_top;
                                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title_other_top);
                                                                if (textView7 != null) {
                                                                    i = R.id.top_icon;
                                                                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.top_icon);
                                                                    if (imageView3 != null) {
                                                                        i = R.id.top_table;
                                                                        View viewFindChildViewById4 = ViewBindings.findChildViewById(rootView, R.id.top_table);
                                                                        if (viewFindChildViewById4 != null) {
                                                                            i = R.id.value_game;
                                                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.value_game);
                                                                            if (textView8 != null) {
                                                                                i = R.id.value_game_other;
                                                                                TextView textView9 = (TextView) ViewBindings.findChildViewById(rootView, R.id.value_game_other);
                                                                                if (textView9 != null) {
                                                                                    i = R.id.value_other_top;
                                                                                    TextView textView10 = (TextView) ViewBindings.findChildViewById(rootView, R.id.value_other_top);
                                                                                    if (textView10 != null) {
                                                                                        return new EntertainmentSystemTopLayoutBinding((ConstraintLayout) rootView, imageView, viewFindChildViewById, recyclerView, viewFindChildViewById2, recyclerView2, imageView2, recyclerView3, viewFindChildViewById3, textView, textView2, textView3, textView4, textView5, textView6, textView7, imageView3, viewFindChildViewById4, textView8, textView9, textView10);
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
