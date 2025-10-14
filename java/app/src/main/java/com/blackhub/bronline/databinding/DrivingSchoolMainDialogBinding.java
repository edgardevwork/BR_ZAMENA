package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.blackhub.bronline.game.common.UIContainer;
import com.bless.client.R;


public final class DrivingSchoolMainDialogBinding implements ViewBinding {

    @NonNull
    public final View drivingSchoolClose;

    @NonNull
    public final UIContainer drivingSchoolMainContainer;

    @NonNull
    public final ConstraintLayout rootView;

    public DrivingSchoolMainDialogBinding(@NonNull ConstraintLayout rootView, @NonNull View drivingSchoolClose, @NonNull UIContainer drivingSchoolMainContainer) {
        this.rootView = rootView;
        this.drivingSchoolClose = drivingSchoolClose;
        this.drivingSchoolMainContainer = drivingSchoolMainContainer;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static DrivingSchoolMainDialogBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static DrivingSchoolMainDialogBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.driving_school_main_dialog, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static DrivingSchoolMainDialogBinding bind(@NonNull View rootView) {
        int i = R.id.driving_school_close;
        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.driving_school_close);
        if (viewFindChildViewById != null) {
            i = R.id.driving_school_main_container;
            UIContainer uIContainer = (UIContainer) ViewBindings.findChildViewById(rootView, R.id.driving_school_main_container);
            if (uIContainer != null) {
                return new DrivingSchoolMainDialogBinding((ConstraintLayout) rootView, viewFindChildViewById, uIContainer);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
