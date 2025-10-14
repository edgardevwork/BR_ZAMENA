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
public final class FamiliesMenuCarParkLayoutBinding implements ViewBinding {

    @NonNull
    public final RecyclerView actionWithCar;

    @NonNull
    public final View bodyRightBlock;

    @NonNull
    public final ImageView buttonBackToMenu;

    @NonNull
    public final RecyclerView carList;

    @NonNull
    public final View leftTitleDiver;

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final View tablesTitleLeftBlock;

    @NonNull
    public final TextView titleLeftBlock;

    @NonNull
    public final TextView titleRightBlock;

    public FamiliesMenuCarParkLayoutBinding(@NonNull ConstraintLayout rootView, @NonNull RecyclerView actionWithCar, @NonNull View bodyRightBlock, @NonNull ImageView buttonBackToMenu, @NonNull RecyclerView carList, @NonNull View leftTitleDiver, @NonNull View tablesTitleLeftBlock, @NonNull TextView titleLeftBlock, @NonNull TextView titleRightBlock) {
        this.rootView = rootView;
        this.actionWithCar = actionWithCar;
        this.bodyRightBlock = bodyRightBlock;
        this.buttonBackToMenu = buttonBackToMenu;
        this.carList = carList;
        this.leftTitleDiver = leftTitleDiver;
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
    public static FamiliesMenuCarParkLayoutBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FamiliesMenuCarParkLayoutBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.families_menu_car_park_layout, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static FamiliesMenuCarParkLayoutBinding bind(@NonNull View rootView) {
        int i = R.id.action_with_car;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.action_with_car);
        if (recyclerView != null) {
            i = R.id.body_right_block;
            View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.body_right_block);
            if (viewFindChildViewById != null) {
                i = R.id.button_back_to_menu;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.button_back_to_menu);
                if (imageView != null) {
                    i = R.id.car_list;
                    RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.car_list);
                    if (recyclerView2 != null) {
                        i = R.id.left_title_diver;
                        View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.left_title_diver);
                        if (viewFindChildViewById2 != null) {
                            i = R.id.tables_title_left_block;
                            View viewFindChildViewById3 = ViewBindings.findChildViewById(rootView, R.id.tables_title_left_block);
                            if (viewFindChildViewById3 != null) {
                                i = R.id.title_left_block;
                                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.title_left_block);
                                if (textView != null) {
                                    i = R.id.title_right_block;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title_right_block);
                                    if (textView2 != null) {
                                        return new FamiliesMenuCarParkLayoutBinding((ConstraintLayout) rootView, recyclerView, viewFindChildViewById, imageView, recyclerView2, viewFindChildViewById2, viewFindChildViewById3, textView, textView2);
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
