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
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;


public final class DrivingSchoolClassInfoLayoutBinding implements ViewBinding {

    @NonNull
    public final View bgIconRadialMenu;

    @NonNull
    public final AppCompatButton buttonStartPracticeOnSchool;

    @NonNull
    public final View dividerVerticalAllInfo;

    @NonNull
    public final View dividerVerticalTrafficSigns;

    @NonNull
    public final ImageView iconRadialMenu;

    @NonNull
    public final View iconScroll;

    @NonNull
    public final ConstraintLayout mainBlock;

    @NonNull
    public final ImageView menuIcon;

    @NonNull
    public final RecyclerView radialMenuItems;

    @NonNull
    public final TextView radialTextInfo1;

    @NonNull
    public final TextView radialTextInfo2;

    @NonNull
    public final TextView radialTextInfo3;

    @NonNull
    public final NestedScrollView rootNestedScroll;

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final RecyclerView signItems;

    @NonNull
    public final TextView textHelpInfo;

    @NonNull
    public final TextView titleAllInfo;

    @NonNull
    public final TextView titleTrafficSigns;

    @NonNull
    public final TextView titleTutor;

    @NonNull
    public final TextView typeTutorInfoTitle;

    public DrivingSchoolClassInfoLayoutBinding(@NonNull ConstraintLayout rootView, @NonNull View bgIconRadialMenu, @NonNull AppCompatButton buttonStartPracticeOnSchool, @NonNull View dividerVerticalAllInfo, @NonNull View dividerVerticalTrafficSigns, @NonNull ImageView iconRadialMenu, @NonNull View iconScroll, @NonNull ConstraintLayout mainBlock, @NonNull ImageView menuIcon, @NonNull RecyclerView radialMenuItems, @NonNull TextView radialTextInfo1, @NonNull TextView radialTextInfo2, @NonNull TextView radialTextInfo3, @NonNull NestedScrollView rootNestedScroll, @NonNull RecyclerView signItems, @NonNull TextView textHelpInfo, @NonNull TextView titleAllInfo, @NonNull TextView titleTrafficSigns, @NonNull TextView titleTutor, @NonNull TextView typeTutorInfoTitle) {
        this.rootView = rootView;
        this.bgIconRadialMenu = bgIconRadialMenu;
        this.buttonStartPracticeOnSchool = buttonStartPracticeOnSchool;
        this.dividerVerticalAllInfo = dividerVerticalAllInfo;
        this.dividerVerticalTrafficSigns = dividerVerticalTrafficSigns;
        this.iconRadialMenu = iconRadialMenu;
        this.iconScroll = iconScroll;
        this.mainBlock = mainBlock;
        this.menuIcon = menuIcon;
        this.radialMenuItems = radialMenuItems;
        this.radialTextInfo1 = radialTextInfo1;
        this.radialTextInfo2 = radialTextInfo2;
        this.radialTextInfo3 = radialTextInfo3;
        this.rootNestedScroll = rootNestedScroll;
        this.signItems = signItems;
        this.textHelpInfo = textHelpInfo;
        this.titleAllInfo = titleAllInfo;
        this.titleTrafficSigns = titleTrafficSigns;
        this.titleTutor = titleTutor;
        this.typeTutorInfoTitle = typeTutorInfoTitle;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static DrivingSchoolClassInfoLayoutBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static DrivingSchoolClassInfoLayoutBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.driving_school_class_info_layout, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static DrivingSchoolClassInfoLayoutBinding bind(@NonNull View rootView) {
        int i = R.id.bg_icon_radial_menu;
        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.bg_icon_radial_menu);
        if (viewFindChildViewById != null) {
            i = R.id.button_start_practice_on_school;
            AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.button_start_practice_on_school);
            if (appCompatButton != null) {
                i = R.id.divider_vertical_all_info;
                View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.divider_vertical_all_info);
                if (viewFindChildViewById2 != null) {
                    i = R.id.divider_vertical_traffic_signs;
                    View viewFindChildViewById3 = ViewBindings.findChildViewById(rootView, R.id.divider_vertical_traffic_signs);
                    if (viewFindChildViewById3 != null) {
                        i = R.id.icon_radial_menu;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.icon_radial_menu);
                        if (imageView != null) {
                            i = R.id.icon_scroll;
                            View viewFindChildViewById4 = ViewBindings.findChildViewById(rootView, R.id.icon_scroll);
                            if (viewFindChildViewById4 != null) {
                                i = R.id.main_block;
                                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.main_block);
                                if (constraintLayout != null) {
                                    i = R.id.menu_icon;
                                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.menu_icon);
                                    if (imageView2 != null) {
                                        i = R.id.radial_menu_items;
                                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.radial_menu_items);
                                        if (recyclerView != null) {
                                            i = R.id.radial_text_info_1;
                                            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.radial_text_info_1);
                                            if (textView != null) {
                                                i = R.id.radial_text_info_2;
                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.radial_text_info_2);
                                                if (textView2 != null) {
                                                    i = R.id.radial_text_info_3;
                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.radial_text_info_3);
                                                    if (textView3 != null) {
                                                        i = R.id.root_nested_scroll;
                                                        NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(rootView, R.id.root_nested_scroll);
                                                        if (nestedScrollView != null) {
                                                            i = R.id.sign_items;
                                                            RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.sign_items);
                                                            if (recyclerView2 != null) {
                                                                i = R.id.text_help_info;
                                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_help_info);
                                                                if (textView4 != null) {
                                                                    i = R.id.title_all_info;
                                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title_all_info);
                                                                    if (textView5 != null) {
                                                                        i = R.id.title_traffic_signs;
                                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title_traffic_signs);
                                                                        if (textView6 != null) {
                                                                            i = R.id.title_tutor;
                                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title_tutor);
                                                                            if (textView7 != null) {
                                                                                i = R.id.type_tutor_info_title;
                                                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.type_tutor_info_title);
                                                                                if (textView8 != null) {
                                                                                    return new DrivingSchoolClassInfoLayoutBinding((ConstraintLayout) rootView, viewFindChildViewById, appCompatButton, viewFindChildViewById2, viewFindChildViewById3, imageView, viewFindChildViewById4, constraintLayout, imageView2, recyclerView, textView, textView2, textView3, nestedScrollView, recyclerView2, textView4, textView5, textView6, textView7, textView8);
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
