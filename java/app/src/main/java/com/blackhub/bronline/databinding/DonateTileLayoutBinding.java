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
import com.blackhub.bronline.game.common.dotrvindicator.DotViewIndicator;
import com.bless.client.R;


public final class DonateTileLayoutBinding implements ViewBinding {

    @NonNull
    public final AppCompatButton donateButtonBack;

    @NonNull
    public final TextView donateTextHeader;

    @NonNull
    public final RecyclerView mainRV;

    @NonNull
    public final View mainRVBg;

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final DotViewIndicator rvIndicator;

    public DonateTileLayoutBinding(@NonNull ConstraintLayout rootView, @NonNull AppCompatButton donateButtonBack, @NonNull TextView donateTextHeader, @NonNull RecyclerView mainRV, @NonNull View mainRVBg, @NonNull DotViewIndicator rvIndicator) {
        this.rootView = rootView;
        this.donateButtonBack = donateButtonBack;
        this.donateTextHeader = donateTextHeader;
        this.mainRV = mainRV;
        this.mainRVBg = mainRVBg;
        this.rvIndicator = rvIndicator;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static DonateTileLayoutBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static DonateTileLayoutBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.donate_tile_layout, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static DonateTileLayoutBinding bind(@NonNull View rootView) {
        int i = R.id.donateButtonBack;
        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.donateButtonBack);
        if (appCompatButton != null) {
            i = R.id.donateTextHeader;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.donateTextHeader);
            if (textView != null) {
                i = R.id.mainRV;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.mainRV);
                if (recyclerView != null) {
                    i = R.id.mainRV_bg;
                    View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.mainRV_bg);
                    if (viewFindChildViewById != null) {
                        i = R.id.rvIndicator;
                        DotViewIndicator dotViewIndicator = (DotViewIndicator) ViewBindings.findChildViewById(rootView, R.id.rvIndicator);
                        if (dotViewIndicator != null) {
                            return new DonateTileLayoutBinding((ConstraintLayout) rootView, appCompatButton, textView, recyclerView, viewFindChildViewById, dotViewIndicator);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
