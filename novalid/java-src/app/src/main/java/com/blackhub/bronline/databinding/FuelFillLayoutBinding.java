package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.blackhub.bronline.game.common.CountAnimationTextView;
import com.bless.client.R;

/* loaded from: classes.dex */
public final class FuelFillLayoutBinding implements ViewBinding {

    @NonNull
    public final View fflBackground;

    @NonNull
    public final AppCompatImageButton fflButtonClose;

    @NonNull
    public final AppCompatButton fflButtonConfirmation;

    @NonNull
    public final TextView fflCurrentValueOfFuel;

    @NonNull
    public final CountAnimationTextView fflCurrentValueOfPrice;

    @NonNull
    public final View fflCurrentValueOfPriceBg;

    @NonNull
    public final TextView fflCurrentValueOfPriceRuble;

    @NonNull
    public final RecyclerView fflFuelList;

    @NonNull
    public final SeekBar fflFuelSeekbar;

    @NonNull
    public final TextView fflRecommendFuel;

    @NonNull
    public final ConstraintLayout rootView;

    public FuelFillLayoutBinding(@NonNull ConstraintLayout rootView, @NonNull View fflBackground, @NonNull AppCompatImageButton fflButtonClose, @NonNull AppCompatButton fflButtonConfirmation, @NonNull TextView fflCurrentValueOfFuel, @NonNull CountAnimationTextView fflCurrentValueOfPrice, @NonNull View fflCurrentValueOfPriceBg, @NonNull TextView fflCurrentValueOfPriceRuble, @NonNull RecyclerView fflFuelList, @NonNull SeekBar fflFuelSeekbar, @NonNull TextView fflRecommendFuel) {
        this.rootView = rootView;
        this.fflBackground = fflBackground;
        this.fflButtonClose = fflButtonClose;
        this.fflButtonConfirmation = fflButtonConfirmation;
        this.fflCurrentValueOfFuel = fflCurrentValueOfFuel;
        this.fflCurrentValueOfPrice = fflCurrentValueOfPrice;
        this.fflCurrentValueOfPriceBg = fflCurrentValueOfPriceBg;
        this.fflCurrentValueOfPriceRuble = fflCurrentValueOfPriceRuble;
        this.fflFuelList = fflFuelList;
        this.fflFuelSeekbar = fflFuelSeekbar;
        this.fflRecommendFuel = fflRecommendFuel;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FuelFillLayoutBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FuelFillLayoutBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fuel_fill_layout, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static FuelFillLayoutBinding bind(@NonNull View rootView) {
        int i = R.id.ffl_background;
        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.ffl_background);
        if (viewFindChildViewById != null) {
            i = R.id.ffl_button_close;
            AppCompatImageButton appCompatImageButton = (AppCompatImageButton) ViewBindings.findChildViewById(rootView, R.id.ffl_button_close);
            if (appCompatImageButton != null) {
                i = R.id.ffl_button_confirmation;
                AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.ffl_button_confirmation);
                if (appCompatButton != null) {
                    i = R.id.ffl_current_value_of_fuel;
                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.ffl_current_value_of_fuel);
                    if (textView != null) {
                        i = R.id.ffl_current_value_of_price;
                        CountAnimationTextView countAnimationTextView = (CountAnimationTextView) ViewBindings.findChildViewById(rootView, R.id.ffl_current_value_of_price);
                        if (countAnimationTextView != null) {
                            i = R.id.ffl_current_value_of_price_bg;
                            View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.ffl_current_value_of_price_bg);
                            if (viewFindChildViewById2 != null) {
                                i = R.id.ffl_current_value_of_price_ruble;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.ffl_current_value_of_price_ruble);
                                if (textView2 != null) {
                                    i = R.id.ffl_fuel_list;
                                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.ffl_fuel_list);
                                    if (recyclerView != null) {
                                        i = R.id.ffl_fuel_seekbar;
                                        SeekBar seekBar = (SeekBar) ViewBindings.findChildViewById(rootView, R.id.ffl_fuel_seekbar);
                                        if (seekBar != null) {
                                            i = R.id.ffl_recommend_fuel;
                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.ffl_recommend_fuel);
                                            if (textView3 != null) {
                                                return new FuelFillLayoutBinding((ConstraintLayout) rootView, viewFindChildViewById, appCompatImageButton, appCompatButton, textView, countAnimationTextView, viewFindChildViewById2, textView2, recyclerView, seekBar, textView3);
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
