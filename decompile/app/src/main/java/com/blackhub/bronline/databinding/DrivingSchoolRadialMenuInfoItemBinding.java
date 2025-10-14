package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;

/* loaded from: classes.dex */
public final class DrivingSchoolRadialMenuInfoItemBinding implements ViewBinding {

    @NonNull
    public final View blockWithLeftRadialMenu;

    @NonNull
    public final View blockWithRightRadialMenu;

    @NonNull
    public final View dividerHorizontalUnderline;

    @NonNull
    public final ImageView iconLeftAction;

    @NonNull
    public final ImageView iconRightAction;

    @NonNull
    public final TextView numberLeftAction;

    @NonNull
    public final TextView numberRightAction;

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final TextView textLeftAction;

    @NonNull
    public final TextView textRightAction;

    @NonNull
    public final TextView titleLeftAction;

    @NonNull
    public final TextView titleRightAction;

    public DrivingSchoolRadialMenuInfoItemBinding(@NonNull ConstraintLayout rootView, @NonNull View blockWithLeftRadialMenu, @NonNull View blockWithRightRadialMenu, @NonNull View dividerHorizontalUnderline, @NonNull ImageView iconLeftAction, @NonNull ImageView iconRightAction, @NonNull TextView numberLeftAction, @NonNull TextView numberRightAction, @NonNull TextView textLeftAction, @NonNull TextView textRightAction, @NonNull TextView titleLeftAction, @NonNull TextView titleRightAction) {
        this.rootView = rootView;
        this.blockWithLeftRadialMenu = blockWithLeftRadialMenu;
        this.blockWithRightRadialMenu = blockWithRightRadialMenu;
        this.dividerHorizontalUnderline = dividerHorizontalUnderline;
        this.iconLeftAction = iconLeftAction;
        this.iconRightAction = iconRightAction;
        this.numberLeftAction = numberLeftAction;
        this.numberRightAction = numberRightAction;
        this.textLeftAction = textLeftAction;
        this.textRightAction = textRightAction;
        this.titleLeftAction = titleLeftAction;
        this.titleRightAction = titleRightAction;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static DrivingSchoolRadialMenuInfoItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static DrivingSchoolRadialMenuInfoItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.driving_school_radial_menu_info_item, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static DrivingSchoolRadialMenuInfoItemBinding bind(@NonNull View rootView) {
        int i = R.id.block_with_left_radial_menu;
        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.block_with_left_radial_menu);
        if (viewFindChildViewById != null) {
            i = R.id.block_with_right_radial_menu;
            View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.block_with_right_radial_menu);
            if (viewFindChildViewById2 != null) {
                i = R.id.divider_horizontal_underline;
                View viewFindChildViewById3 = ViewBindings.findChildViewById(rootView, R.id.divider_horizontal_underline);
                if (viewFindChildViewById3 != null) {
                    i = R.id.icon_left_action;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.icon_left_action);
                    if (imageView != null) {
                        i = R.id.icon_right_action;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.icon_right_action);
                        if (imageView2 != null) {
                            i = R.id.number_left_action;
                            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.number_left_action);
                            if (textView != null) {
                                i = R.id.number_right_action;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.number_right_action);
                                if (textView2 != null) {
                                    i = R.id.text_left_action;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_left_action);
                                    if (textView3 != null) {
                                        i = R.id.text_right_action;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_right_action);
                                        if (textView4 != null) {
                                            i = R.id.title_left_action;
                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title_left_action);
                                            if (textView5 != null) {
                                                i = R.id.title_right_action;
                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title_right_action);
                                                if (textView6 != null) {
                                                    return new DrivingSchoolRadialMenuInfoItemBinding((ConstraintLayout) rootView, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3, imageView, imageView2, textView, textView2, textView3, textView4, textView5, textView6);
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
