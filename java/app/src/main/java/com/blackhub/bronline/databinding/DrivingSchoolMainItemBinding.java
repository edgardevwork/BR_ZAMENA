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

/* loaded from: classes2.dex */
public final class DrivingSchoolMainItemBinding implements ViewBinding {

    @NonNull
    public final View bgMaskDrivingSchool;

    @NonNull
    public final View bgPrice;

    @NonNull
    public final View drivingSchoolBg;

    @NonNull
    public final View drivingSchoolMainItem;

    @NonNull
    public final TextView drivingSchoolValuePrice;

    @NonNull
    public final ImageView iconDrivingSchool;

    @NonNull
    public final ImageView iconIfNoActiveDrivingSchool;

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final TextView textIfNotActualDrivingSchool;

    @NonNull
    public final TextView titleMainItem;

    public DrivingSchoolMainItemBinding(@NonNull ConstraintLayout rootView, @NonNull View bgMaskDrivingSchool, @NonNull View bgPrice, @NonNull View drivingSchoolBg, @NonNull View drivingSchoolMainItem, @NonNull TextView drivingSchoolValuePrice, @NonNull ImageView iconDrivingSchool, @NonNull ImageView iconIfNoActiveDrivingSchool, @NonNull TextView textIfNotActualDrivingSchool, @NonNull TextView titleMainItem) {
        this.rootView = rootView;
        this.bgMaskDrivingSchool = bgMaskDrivingSchool;
        this.bgPrice = bgPrice;
        this.drivingSchoolBg = drivingSchoolBg;
        this.drivingSchoolMainItem = drivingSchoolMainItem;
        this.drivingSchoolValuePrice = drivingSchoolValuePrice;
        this.iconDrivingSchool = iconDrivingSchool;
        this.iconIfNoActiveDrivingSchool = iconIfNoActiveDrivingSchool;
        this.textIfNotActualDrivingSchool = textIfNotActualDrivingSchool;
        this.titleMainItem = titleMainItem;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static DrivingSchoolMainItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static DrivingSchoolMainItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.driving_school_main_item, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static DrivingSchoolMainItemBinding bind(@NonNull View rootView) {
        int i = R.id.bg_mask_driving_school;
        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.bg_mask_driving_school);
        if (viewFindChildViewById != null) {
            i = R.id.bg_price;
            View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.bg_price);
            if (viewFindChildViewById2 != null) {
                i = R.id.driving_school_bg;
                View viewFindChildViewById3 = ViewBindings.findChildViewById(rootView, R.id.driving_school_bg);
                if (viewFindChildViewById3 != null) {
                    i = R.id.driving_school_main_item;
                    View viewFindChildViewById4 = ViewBindings.findChildViewById(rootView, R.id.driving_school_main_item);
                    if (viewFindChildViewById4 != null) {
                        i = R.id.driving_school_value_price;
                        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.driving_school_value_price);
                        if (textView != null) {
                            i = R.id.icon_driving_school;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.icon_driving_school);
                            if (imageView != null) {
                                i = R.id.icon_if_no_active_driving_school;
                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.icon_if_no_active_driving_school);
                                if (imageView2 != null) {
                                    i = R.id.text_if_not_actual_driving_school;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_if_not_actual_driving_school);
                                    if (textView2 != null) {
                                        i = R.id.title_main_item;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title_main_item);
                                        if (textView3 != null) {
                                            return new DrivingSchoolMainItemBinding((ConstraintLayout) rootView, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3, viewFindChildViewById4, textView, imageView, imageView2, textView2, textView3);
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
