package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;

/* loaded from: classes2.dex */
public final class DrivingSchoolMainLayoutBinding implements ViewBinding {

    @NonNull
    public final RecyclerView blockWitchTypeSchools;

    @NonNull
    public final AppCompatButton buttonStartCourse;

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final TextView text1;

    @NonNull
    public final TextView text2;

    @NonNull
    public final TextView text3;

    @NonNull
    public final TextView titleDrivingSchool;

    public DrivingSchoolMainLayoutBinding(@NonNull ConstraintLayout rootView, @NonNull RecyclerView blockWitchTypeSchools, @NonNull AppCompatButton buttonStartCourse, @NonNull TextView text1, @NonNull TextView text2, @NonNull TextView text3, @NonNull TextView titleDrivingSchool) {
        this.rootView = rootView;
        this.blockWitchTypeSchools = blockWitchTypeSchools;
        this.buttonStartCourse = buttonStartCourse;
        this.text1 = text1;
        this.text2 = text2;
        this.text3 = text3;
        this.titleDrivingSchool = titleDrivingSchool;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static DrivingSchoolMainLayoutBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static DrivingSchoolMainLayoutBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.driving_school_main_layout, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static DrivingSchoolMainLayoutBinding bind(@NonNull View rootView) {
        int i = R.id.block_witch_type_schools;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.block_witch_type_schools);
        if (recyclerView != null) {
            i = R.id.button_start_course;
            AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.button_start_course);
            if (appCompatButton != null) {
                i = R.id.text_1;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_1);
                if (textView != null) {
                    i = R.id.text_2;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_2);
                    if (textView2 != null) {
                        i = R.id.text_3;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_3);
                        if (textView3 != null) {
                            i = R.id.title_driving_school;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title_driving_school);
                            if (textView4 != null) {
                                return new DrivingSchoolMainLayoutBinding((ConstraintLayout) rootView, recyclerView, appCompatButton, textView, textView2, textView3, textView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
