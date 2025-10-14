package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
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
public final class FamiliesMenuFamilySettingLayoutBinding implements ViewBinding {

    @NonNull
    public final View bodyRightBlock;

    @NonNull
    public final ImageView buttonApplyRename;

    @NonNull
    public final ImageView buttonBackToMenu;

    @NonNull
    public final ImageView editRanksName;

    @NonNull
    public final EditText editTextRankName;

    @NonNull
    public final View leftTitleDiver;

    @NonNull
    public final RecyclerView menuList;

    @NonNull
    public final RecyclerView ranksOrChatsColorSetting;

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final View tablesTitleLeftBlock;

    @NonNull
    public final TextView titleLeftBlock;

    @NonNull
    public final TextView titleRank;

    @NonNull
    public final TextView titleRightBlock;

    public FamiliesMenuFamilySettingLayoutBinding(@NonNull ConstraintLayout rootView, @NonNull View bodyRightBlock, @NonNull ImageView buttonApplyRename, @NonNull ImageView buttonBackToMenu, @NonNull ImageView editRanksName, @NonNull EditText editTextRankName, @NonNull View leftTitleDiver, @NonNull RecyclerView menuList, @NonNull RecyclerView ranksOrChatsColorSetting, @NonNull View tablesTitleLeftBlock, @NonNull TextView titleLeftBlock, @NonNull TextView titleRank, @NonNull TextView titleRightBlock) {
        this.rootView = rootView;
        this.bodyRightBlock = bodyRightBlock;
        this.buttonApplyRename = buttonApplyRename;
        this.buttonBackToMenu = buttonBackToMenu;
        this.editRanksName = editRanksName;
        this.editTextRankName = editTextRankName;
        this.leftTitleDiver = leftTitleDiver;
        this.menuList = menuList;
        this.ranksOrChatsColorSetting = ranksOrChatsColorSetting;
        this.tablesTitleLeftBlock = tablesTitleLeftBlock;
        this.titleLeftBlock = titleLeftBlock;
        this.titleRank = titleRank;
        this.titleRightBlock = titleRightBlock;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FamiliesMenuFamilySettingLayoutBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FamiliesMenuFamilySettingLayoutBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.families_menu_family_setting_layout, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static FamiliesMenuFamilySettingLayoutBinding bind(@NonNull View rootView) {
        int i = R.id.body_right_block;
        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.body_right_block);
        if (viewFindChildViewById != null) {
            i = R.id.button_apply_rename;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.button_apply_rename);
            if (imageView != null) {
                i = R.id.button_back_to_menu;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.button_back_to_menu);
                if (imageView2 != null) {
                    i = R.id.edit_ranks_name;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.edit_ranks_name);
                    if (imageView3 != null) {
                        i = R.id.edit_text_rank_name;
                        EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.edit_text_rank_name);
                        if (editText != null) {
                            i = R.id.left_title_diver;
                            View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.left_title_diver);
                            if (viewFindChildViewById2 != null) {
                                i = R.id.menu_list;
                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.menu_list);
                                if (recyclerView != null) {
                                    i = R.id.ranks_or_chats_color_setting;
                                    RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.ranks_or_chats_color_setting);
                                    if (recyclerView2 != null) {
                                        i = R.id.tables_title_left_block;
                                        View viewFindChildViewById3 = ViewBindings.findChildViewById(rootView, R.id.tables_title_left_block);
                                        if (viewFindChildViewById3 != null) {
                                            i = R.id.title_left_block;
                                            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.title_left_block);
                                            if (textView != null) {
                                                i = R.id.title_rank;
                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title_rank);
                                                if (textView2 != null) {
                                                    i = R.id.title_right_block;
                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title_right_block);
                                                    if (textView3 != null) {
                                                        return new FamiliesMenuFamilySettingLayoutBinding((ConstraintLayout) rootView, viewFindChildViewById, imageView, imageView2, imageView3, editText, viewFindChildViewById2, recyclerView, recyclerView2, viewFindChildViewById3, textView, textView2, textView3);
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
