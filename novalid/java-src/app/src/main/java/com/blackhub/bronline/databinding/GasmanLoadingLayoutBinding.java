package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;

/* loaded from: classes.dex */
public final class GasmanLoadingLayoutBinding implements ViewBinding {

    @NonNull
    public final Guideline guidelineHorizontal50;

    @NonNull
    public final ImageView imageViewLogo;

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final TextView textViewLoadingOfStation;

    @NonNull
    public final TextView textViewLoadingPercents;

    public GasmanLoadingLayoutBinding(@NonNull ConstraintLayout rootView, @NonNull Guideline guidelineHorizontal50, @NonNull ImageView imageViewLogo, @NonNull TextView textViewLoadingOfStation, @NonNull TextView textViewLoadingPercents) {
        this.rootView = rootView;
        this.guidelineHorizontal50 = guidelineHorizontal50;
        this.imageViewLogo = imageViewLogo;
        this.textViewLoadingOfStation = textViewLoadingOfStation;
        this.textViewLoadingPercents = textViewLoadingPercents;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static GasmanLoadingLayoutBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static GasmanLoadingLayoutBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.gasman_loading_layout, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static GasmanLoadingLayoutBinding bind(@NonNull View rootView) {
        int i = R.id.guideline_horizontal_50;
        Guideline guideline = (Guideline) ViewBindings.findChildViewById(rootView, R.id.guideline_horizontal_50);
        if (guideline != null) {
            i = R.id.image_view_logo;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.image_view_logo);
            if (imageView != null) {
                i = R.id.text_view_loading_of_station;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_view_loading_of_station);
                if (textView != null) {
                    i = R.id.text_view_loading_percents;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_view_loading_percents);
                    if (textView2 != null) {
                        return new GasmanLoadingLayoutBinding((ConstraintLayout) rootView, guideline, imageView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
