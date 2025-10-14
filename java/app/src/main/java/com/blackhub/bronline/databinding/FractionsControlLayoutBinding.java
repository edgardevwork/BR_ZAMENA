package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.blackhub.bronline.game.common.CustomEditTextWithBackPressEvent;
import com.bless.client.R;

/* loaded from: classes.dex */
public final class FractionsControlLayoutBinding implements ViewBinding {

    @NonNull
    public final View bodyRightBlock;

    @NonNull
    public final CustomEditTextWithBackPressEvent editTextSearchPlayer;

    @NonNull
    public final FrameLayout frameLayoutRenderSkin;

    @NonNull
    public final ImageButton imageButtonSearchPlayer;

    @NonNull
    public final ImageButton imageButtonSortBy;

    @NonNull
    public final RecyclerView recyclerViewControlFraction;

    @NonNull
    public final RecyclerView recyclerViewSortBy;

    @NonNull
    public final RecyclerView recyclerViewStaffList;

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final TextView textViewFractionStaffTitle;

    @NonNull
    public final TextView textViewPlayersInformation;

    @NonNull
    public final TextView textViewPlayersLevel;

    @NonNull
    public final TextView textViewPlayersNickname;

    @NonNull
    public final TextView textViewPlayersPhoneNumber;

    @NonNull
    public final TextView textViewPlayersRank;

    @NonNull
    public final TextView textViewPlayersReprimands;

    @NonNull
    public final TextView textViewPosition;

    @NonNull
    public final View titleLeftBlock;

    @NonNull
    public final View viewDivider;

    @NonNull
    public final View viewPlayerInformation;

    @NonNull
    public final View viewRenderSkin;

    @NonNull
    public final View viewSkinEllipse;

    public FractionsControlLayoutBinding(@NonNull ConstraintLayout rootView, @NonNull View bodyRightBlock, @NonNull CustomEditTextWithBackPressEvent editTextSearchPlayer, @NonNull FrameLayout frameLayoutRenderSkin, @NonNull ImageButton imageButtonSearchPlayer, @NonNull ImageButton imageButtonSortBy, @NonNull RecyclerView recyclerViewControlFraction, @NonNull RecyclerView recyclerViewSortBy, @NonNull RecyclerView recyclerViewStaffList, @NonNull TextView textViewFractionStaffTitle, @NonNull TextView textViewPlayersInformation, @NonNull TextView textViewPlayersLevel, @NonNull TextView textViewPlayersNickname, @NonNull TextView textViewPlayersPhoneNumber, @NonNull TextView textViewPlayersRank, @NonNull TextView textViewPlayersReprimands, @NonNull TextView textViewPosition, @NonNull View titleLeftBlock, @NonNull View viewDivider, @NonNull View viewPlayerInformation, @NonNull View viewRenderSkin, @NonNull View viewSkinEllipse) {
        this.rootView = rootView;
        this.bodyRightBlock = bodyRightBlock;
        this.editTextSearchPlayer = editTextSearchPlayer;
        this.frameLayoutRenderSkin = frameLayoutRenderSkin;
        this.imageButtonSearchPlayer = imageButtonSearchPlayer;
        this.imageButtonSortBy = imageButtonSortBy;
        this.recyclerViewControlFraction = recyclerViewControlFraction;
        this.recyclerViewSortBy = recyclerViewSortBy;
        this.recyclerViewStaffList = recyclerViewStaffList;
        this.textViewFractionStaffTitle = textViewFractionStaffTitle;
        this.textViewPlayersInformation = textViewPlayersInformation;
        this.textViewPlayersLevel = textViewPlayersLevel;
        this.textViewPlayersNickname = textViewPlayersNickname;
        this.textViewPlayersPhoneNumber = textViewPlayersPhoneNumber;
        this.textViewPlayersRank = textViewPlayersRank;
        this.textViewPlayersReprimands = textViewPlayersReprimands;
        this.textViewPosition = textViewPosition;
        this.titleLeftBlock = titleLeftBlock;
        this.viewDivider = viewDivider;
        this.viewPlayerInformation = viewPlayerInformation;
        this.viewRenderSkin = viewRenderSkin;
        this.viewSkinEllipse = viewSkinEllipse;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FractionsControlLayoutBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FractionsControlLayoutBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fractions_control_layout, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static FractionsControlLayoutBinding bind(@NonNull View rootView) {
        int i = R.id.body_right_block;
        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.body_right_block);
        if (viewFindChildViewById != null) {
            i = R.id.edit_text_search_player;
            CustomEditTextWithBackPressEvent customEditTextWithBackPressEvent = (CustomEditTextWithBackPressEvent) ViewBindings.findChildViewById(rootView, R.id.edit_text_search_player);
            if (customEditTextWithBackPressEvent != null) {
                i = R.id.frame_layout_render_skin;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.frame_layout_render_skin);
                if (frameLayout != null) {
                    i = R.id.image_button_search_player;
                    ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.image_button_search_player);
                    if (imageButton != null) {
                        i = R.id.image_button_sort_by;
                        ImageButton imageButton2 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.image_button_sort_by);
                        if (imageButton2 != null) {
                            i = R.id.recycler_view_control_fraction;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.recycler_view_control_fraction);
                            if (recyclerView != null) {
                                i = R.id.recycler_view_sort_by;
                                RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.recycler_view_sort_by);
                                if (recyclerView2 != null) {
                                    i = R.id.recycler_view_staff_list;
                                    RecyclerView recyclerView3 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.recycler_view_staff_list);
                                    if (recyclerView3 != null) {
                                        i = R.id.text_view_fraction_staff_title;
                                        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_view_fraction_staff_title);
                                        if (textView != null) {
                                            i = R.id.text_view_players_information;
                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_view_players_information);
                                            if (textView2 != null) {
                                                i = R.id.text_view_players_level;
                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_view_players_level);
                                                if (textView3 != null) {
                                                    i = R.id.text_view_players_nickname;
                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_view_players_nickname);
                                                    if (textView4 != null) {
                                                        i = R.id.text_view_players_phone_number;
                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_view_players_phone_number);
                                                        if (textView5 != null) {
                                                            i = R.id.text_view_players_rank;
                                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_view_players_rank);
                                                            if (textView6 != null) {
                                                                i = R.id.text_view_players_reprimands;
                                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_view_players_reprimands);
                                                                if (textView7 != null) {
                                                                    i = R.id.text_view_position;
                                                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_view_position);
                                                                    if (textView8 != null) {
                                                                        i = R.id.title_left_block;
                                                                        View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.title_left_block);
                                                                        if (viewFindChildViewById2 != null) {
                                                                            i = R.id.view_divider;
                                                                            View viewFindChildViewById3 = ViewBindings.findChildViewById(rootView, R.id.view_divider);
                                                                            if (viewFindChildViewById3 != null) {
                                                                                i = R.id.view_player_information;
                                                                                View viewFindChildViewById4 = ViewBindings.findChildViewById(rootView, R.id.view_player_information);
                                                                                if (viewFindChildViewById4 != null) {
                                                                                    i = R.id.view_render_skin;
                                                                                    View viewFindChildViewById5 = ViewBindings.findChildViewById(rootView, R.id.view_render_skin);
                                                                                    if (viewFindChildViewById5 != null) {
                                                                                        i = R.id.view_skin_ellipse;
                                                                                        View viewFindChildViewById6 = ViewBindings.findChildViewById(rootView, R.id.view_skin_ellipse);
                                                                                        if (viewFindChildViewById6 != null) {
                                                                                            return new FractionsControlLayoutBinding((ConstraintLayout) rootView, viewFindChildViewById, customEditTextWithBackPressEvent, frameLayout, imageButton, imageButton2, recyclerView, recyclerView2, recyclerView3, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, viewFindChildViewById2, viewFindChildViewById3, viewFindChildViewById4, viewFindChildViewById5, viewFindChildViewById6);
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
