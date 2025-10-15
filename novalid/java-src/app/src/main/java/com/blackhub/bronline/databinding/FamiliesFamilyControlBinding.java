package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;

/* loaded from: classes.dex */
public final class FamiliesFamilyControlBinding implements ViewBinding {

    @NonNull
    public final RecyclerView actionWithPlayer;

    @NonNull
    public final View bgFamilySkin;

    @NonNull
    public final View bodyPlayersInfo;

    @NonNull
    public final View bodyRightBlock;

    @NonNull
    public final ImageView buttonBackToMenu;

    @NonNull
    public final ImageView buttonPlayersFilter;

    @NonNull
    public final ImageView buttonPlayersSearch;

    @NonNull
    public final EditText editTextSearch;

    @NonNull
    public final FrameLayout familySkin;

    @NonNull
    public final View leftTitleDiver;

    @NonNull
    public final View mainBodyPlayersInfo;

    @NonNull
    public final TextView personalFile;

    @NonNull
    public final TextView phoneNumber;

    @NonNull
    public final TextView phoneNumberValue;

    @NonNull
    public final RecyclerView playersFilterList;

    @NonNull
    public final NestedScrollView playersInfo;

    @NonNull
    public final TextView playersLevel;

    @NonNull
    public final TextView playersLevelValue;

    @NonNull
    public final RecyclerView playersList;

    @NonNull
    public final TextView playersPosition;

    @NonNull
    public final TextView playersPositionValue;

    @NonNull
    public final TextView playersRank;

    @NonNull
    public final TextView playersRankValue;

    @NonNull
    public final TextView reprimands;

    @NonNull
    public final TextView reprimandsValue;

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final View tablesTitleLeftBlock;

    @NonNull
    public final TextView titleLeftBlock;

    @NonNull
    public final TextView titleRightBlock;

    public FamiliesFamilyControlBinding(@NonNull ConstraintLayout rootView, @NonNull RecyclerView actionWithPlayer, @NonNull View bgFamilySkin, @NonNull View bodyPlayersInfo, @NonNull View bodyRightBlock, @NonNull ImageView buttonBackToMenu, @NonNull ImageView buttonPlayersFilter, @NonNull ImageView buttonPlayersSearch, @NonNull EditText editTextSearch, @NonNull FrameLayout familySkin, @NonNull View leftTitleDiver, @NonNull View mainBodyPlayersInfo, @NonNull TextView personalFile, @NonNull TextView phoneNumber, @NonNull TextView phoneNumberValue, @NonNull RecyclerView playersFilterList, @NonNull NestedScrollView playersInfo, @NonNull TextView playersLevel, @NonNull TextView playersLevelValue, @NonNull RecyclerView playersList, @NonNull TextView playersPosition, @NonNull TextView playersPositionValue, @NonNull TextView playersRank, @NonNull TextView playersRankValue, @NonNull TextView reprimands, @NonNull TextView reprimandsValue, @NonNull View tablesTitleLeftBlock, @NonNull TextView titleLeftBlock, @NonNull TextView titleRightBlock) {
        this.rootView = rootView;
        this.actionWithPlayer = actionWithPlayer;
        this.bgFamilySkin = bgFamilySkin;
        this.bodyPlayersInfo = bodyPlayersInfo;
        this.bodyRightBlock = bodyRightBlock;
        this.buttonBackToMenu = buttonBackToMenu;
        this.buttonPlayersFilter = buttonPlayersFilter;
        this.buttonPlayersSearch = buttonPlayersSearch;
        this.editTextSearch = editTextSearch;
        this.familySkin = familySkin;
        this.leftTitleDiver = leftTitleDiver;
        this.mainBodyPlayersInfo = mainBodyPlayersInfo;
        this.personalFile = personalFile;
        this.phoneNumber = phoneNumber;
        this.phoneNumberValue = phoneNumberValue;
        this.playersFilterList = playersFilterList;
        this.playersInfo = playersInfo;
        this.playersLevel = playersLevel;
        this.playersLevelValue = playersLevelValue;
        this.playersList = playersList;
        this.playersPosition = playersPosition;
        this.playersPositionValue = playersPositionValue;
        this.playersRank = playersRank;
        this.playersRankValue = playersRankValue;
        this.reprimands = reprimands;
        this.reprimandsValue = reprimandsValue;
        this.tablesTitleLeftBlock = tablesTitleLeftBlock;
        this.titleLeftBlock = titleLeftBlock;
        this.titleRightBlock = titleRightBlock;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FamiliesFamilyControlBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FamiliesFamilyControlBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.families_family_control, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static FamiliesFamilyControlBinding bind(@NonNull View rootView) {
        int i = R.id.action_with_player;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.action_with_player);
        if (recyclerView != null) {
            i = R.id.bg_family_skin;
            View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.bg_family_skin);
            if (viewFindChildViewById != null) {
                i = R.id.body_players_info;
                View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.body_players_info);
                if (viewFindChildViewById2 != null) {
                    i = R.id.body_right_block;
                    View viewFindChildViewById3 = ViewBindings.findChildViewById(rootView, R.id.body_right_block);
                    if (viewFindChildViewById3 != null) {
                        i = R.id.button_back_to_menu;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.button_back_to_menu);
                        if (imageView != null) {
                            i = R.id.button_players_filter;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.button_players_filter);
                            if (imageView2 != null) {
                                i = R.id.button_players_search;
                                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.button_players_search);
                                if (imageView3 != null) {
                                    i = R.id.edit_text_search;
                                    EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.edit_text_search);
                                    if (editText != null) {
                                        i = R.id.family_skin;
                                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.family_skin);
                                        if (frameLayout != null) {
                                            i = R.id.left_title_diver;
                                            View viewFindChildViewById4 = ViewBindings.findChildViewById(rootView, R.id.left_title_diver);
                                            if (viewFindChildViewById4 != null) {
                                                i = R.id.main_body_players_info;
                                                View viewFindChildViewById5 = ViewBindings.findChildViewById(rootView, R.id.main_body_players_info);
                                                if (viewFindChildViewById5 != null) {
                                                    i = R.id.personal_file;
                                                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.personal_file);
                                                    if (textView != null) {
                                                        i = R.id.phone_number;
                                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.phone_number);
                                                        if (textView2 != null) {
                                                            i = R.id.phone_number_value;
                                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.phone_number_value);
                                                            if (textView3 != null) {
                                                                i = R.id.players_filter_list;
                                                                RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.players_filter_list);
                                                                if (recyclerView2 != null) {
                                                                    i = R.id.players_info;
                                                                    NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(rootView, R.id.players_info);
                                                                    if (nestedScrollView != null) {
                                                                        i = R.id.players_level;
                                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.players_level);
                                                                        if (textView4 != null) {
                                                                            i = R.id.players_level_value;
                                                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.players_level_value);
                                                                            if (textView5 != null) {
                                                                                i = R.id.players_list;
                                                                                RecyclerView recyclerView3 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.players_list);
                                                                                if (recyclerView3 != null) {
                                                                                    i = R.id.players_position;
                                                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.players_position);
                                                                                    if (textView6 != null) {
                                                                                        i = R.id.players_position_value;
                                                                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.players_position_value);
                                                                                        if (textView7 != null) {
                                                                                            i = R.id.players_rank;
                                                                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.players_rank);
                                                                                            if (textView8 != null) {
                                                                                                i = R.id.players_rank_value;
                                                                                                TextView textView9 = (TextView) ViewBindings.findChildViewById(rootView, R.id.players_rank_value);
                                                                                                if (textView9 != null) {
                                                                                                    i = R.id.reprimands;
                                                                                                    TextView textView10 = (TextView) ViewBindings.findChildViewById(rootView, R.id.reprimands);
                                                                                                    if (textView10 != null) {
                                                                                                        i = R.id.reprimands_value;
                                                                                                        TextView textView11 = (TextView) ViewBindings.findChildViewById(rootView, R.id.reprimands_value);
                                                                                                        if (textView11 != null) {
                                                                                                            i = R.id.tables_title_left_block;
                                                                                                            View viewFindChildViewById6 = ViewBindings.findChildViewById(rootView, R.id.tables_title_left_block);
                                                                                                            if (viewFindChildViewById6 != null) {
                                                                                                                i = R.id.title_left_block;
                                                                                                                TextView textView12 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title_left_block);
                                                                                                                if (textView12 != null) {
                                                                                                                    i = R.id.title_right_block;
                                                                                                                    TextView textView13 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title_right_block);
                                                                                                                    if (textView13 != null) {
                                                                                                                        return new FamiliesFamilyControlBinding((ConstraintLayout) rootView, recyclerView, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3, imageView, imageView2, imageView3, editText, frameLayout, viewFindChildViewById4, viewFindChildViewById5, textView, textView2, textView3, recyclerView2, nestedScrollView, textView4, textView5, recyclerView3, textView6, textView7, textView8, textView9, textView10, textView11, viewFindChildViewById6, textView12, textView13);
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
