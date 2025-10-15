package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
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
public final class DonateCarPreviewLayoutBinding implements ViewBinding {

    @NonNull
    public final AppCompatButton button;

    @NonNull
    public final RecyclerView colorSelectRV;

    @NonNull
    public final AppCompatButton donateButtonBack;

    @NonNull
    public final ImageView donateCarPreviewImage;

    @NonNull
    public final TextView donateCarPreviewName;

    @NonNull
    public final TextView priceStroked;

    @NonNull
    public final ProgressBar progress0100;

    @NonNull
    public final ProgressBar progressCapacity;

    @NonNull
    public final ProgressBar progressMax;

    @NonNull
    public final ProgressBar progressTrunk;

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final View rootViewCarCharacteristics;

    @NonNull
    public final TextView text0100;

    @NonNull
    public final TextView textCapacity;

    @NonNull
    public final TextView textMax;

    @NonNull
    public final TextView textTrunk;

    @NonNull
    public final TextView textViewColor;

    public DonateCarPreviewLayoutBinding(@NonNull ConstraintLayout rootView, @NonNull AppCompatButton button, @NonNull RecyclerView colorSelectRV, @NonNull AppCompatButton donateButtonBack, @NonNull ImageView donateCarPreviewImage, @NonNull TextView donateCarPreviewName, @NonNull TextView priceStroked, @NonNull ProgressBar progress0100, @NonNull ProgressBar progressCapacity, @NonNull ProgressBar progressMax, @NonNull ProgressBar progressTrunk, @NonNull View rootViewCarCharacteristics, @NonNull TextView text0100, @NonNull TextView textCapacity, @NonNull TextView textMax, @NonNull TextView textTrunk, @NonNull TextView textViewColor) {
        this.rootView = rootView;
        this.button = button;
        this.colorSelectRV = colorSelectRV;
        this.donateButtonBack = donateButtonBack;
        this.donateCarPreviewImage = donateCarPreviewImage;
        this.donateCarPreviewName = donateCarPreviewName;
        this.priceStroked = priceStroked;
        this.progress0100 = progress0100;
        this.progressCapacity = progressCapacity;
        this.progressMax = progressMax;
        this.progressTrunk = progressTrunk;
        this.rootViewCarCharacteristics = rootViewCarCharacteristics;
        this.text0100 = text0100;
        this.textCapacity = textCapacity;
        this.textMax = textMax;
        this.textTrunk = textTrunk;
        this.textViewColor = textViewColor;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static DonateCarPreviewLayoutBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static DonateCarPreviewLayoutBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.donate_car_preview_layout, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static DonateCarPreviewLayoutBinding bind(@NonNull View rootView) {
        int i = R.id.button;
        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.button);
        if (appCompatButton != null) {
            i = R.id.colorSelectRV;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.colorSelectRV);
            if (recyclerView != null) {
                i = R.id.donateButtonBack;
                AppCompatButton appCompatButton2 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.donateButtonBack);
                if (appCompatButton2 != null) {
                    i = R.id.donateCarPreviewImage;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.donateCarPreviewImage);
                    if (imageView != null) {
                        i = R.id.donateCarPreviewName;
                        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.donateCarPreviewName);
                        if (textView != null) {
                            i = R.id.priceStroked;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.priceStroked);
                            if (textView2 != null) {
                                i = R.id.progress_0100;
                                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progress_0100);
                                if (progressBar != null) {
                                    i = R.id.progress_capacity;
                                    ProgressBar progressBar2 = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progress_capacity);
                                    if (progressBar2 != null) {
                                        i = R.id.progress_max;
                                        ProgressBar progressBar3 = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progress_max);
                                        if (progressBar3 != null) {
                                            i = R.id.progress_trunk;
                                            ProgressBar progressBar4 = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progress_trunk);
                                            if (progressBar4 != null) {
                                                i = R.id.root_view_car_characteristics;
                                                View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.root_view_car_characteristics);
                                                if (viewFindChildViewById != null) {
                                                    i = R.id.text_0100;
                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_0100);
                                                    if (textView3 != null) {
                                                        i = R.id.text_capacity;
                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_capacity);
                                                        if (textView4 != null) {
                                                            i = R.id.text_max;
                                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_max);
                                                            if (textView5 != null) {
                                                                i = R.id.text_trunk;
                                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_trunk);
                                                                if (textView6 != null) {
                                                                    i = R.id.text_view_color;
                                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_view_color);
                                                                    if (textView7 != null) {
                                                                        return new DonateCarPreviewLayoutBinding((ConstraintLayout) rootView, appCompatButton, recyclerView, appCompatButton2, imageView, textView, textView2, progressBar, progressBar2, progressBar3, progressBar4, viewFindChildViewById, textView3, textView4, textView5, textView6, textView7);
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
