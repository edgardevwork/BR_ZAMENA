package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.blackhub.bronline.game.gui.electric.view.ProgressBarWithListener;
import com.blackhub.bronline.game.gui.electric.viewmodel.RaiseChargeViewModel;
import com.bless.client.R;


public abstract class FragmentRaiseChargeBinding extends ViewDataBinding {

    @NonNull
    public final ConstraintLayout blockRaiseChargeDark;

    @NonNull
    public final LinearLayout blockRaiseChargeHint;

    @NonNull
    public final AppCompatButton btnRaiseChargeAttach;

    @NonNull
    public final ImageView btnRaiseChargeAttachAnimationOne;

    @NonNull
    public final ImageView btnRaiseChargeAttachAnimationTwo;

    @NonNull
    public final ImageButton btnRaiseChargeHint;

    @NonNull
    public final ImageButton btnRaiseChargeHintClose;

    @NonNull
    public final TextView btnRaiseChargeHintDesc;

    @NonNull
    public final AppCompatButton btnRaiseChargeRaise;

    @NonNull
    public final Guideline glRaiseChargeFive;

    @NonNull
    public final Guideline glRaiseChargeFour;

    @NonNull
    public final Guideline glRaiseChargeOne;

    @NonNull
    public final Guideline glRaiseChargeSix;

    @NonNull
    public final Guideline glRaiseChargeThree;

    @NonNull
    public final Guideline glRaiseChargeTwo;

    @NonNull
    public final AppCompatImageView ivRaiseChargeFour;

    @NonNull
    public final ImageView ivRaiseChargeHand;

    @NonNull
    public final AppCompatImageView ivRaiseChargeOne;

    @NonNull
    public final AppCompatImageView ivRaiseChargeThree;

    @NonNull
    public final AppCompatImageView ivRaiseChargeTwo;

    @Bindable
    public RaiseChargeViewModel mVm;

    @NonNull
    public final View markerRaiseChargeFour;

    @NonNull
    public final View markerRaiseChargeOne;

    @NonNull
    public final View markerRaiseChargeThree;

    @NonNull
    public final View markerRaiseChargeTwo;

    @NonNull
    public final ConstraintLayout mlRaiseCharge;

    @NonNull
    public final ProgressBarWithListener pbRaiseChargeFour;

    @NonNull
    public final ProgressBarWithListener pbRaiseChargeHintOne;

    @NonNull
    public final ProgressBarWithListener pbRaiseChargeHintTwo;

    @NonNull
    public final ProgressBarWithListener pbRaiseChargeOne;

    @NonNull
    public final ProgressBarWithListener pbRaiseChargeThree;

    @NonNull
    public final ProgressBarWithListener pbRaiseChargeTwo;

    @NonNull
    public final TextView tvRaiseChargeHelp;

    public abstract void setVm(@Nullable RaiseChargeViewModel vm);

    public FragmentRaiseChargeBinding(Object _bindingComponent, View _root, int _localFieldCount, ConstraintLayout blockRaiseChargeDark, LinearLayout blockRaiseChargeHint, AppCompatButton btnRaiseChargeAttach, ImageView btnRaiseChargeAttachAnimationOne, ImageView btnRaiseChargeAttachAnimationTwo, ImageButton btnRaiseChargeHint, ImageButton btnRaiseChargeHintClose, TextView btnRaiseChargeHintDesc, AppCompatButton btnRaiseChargeRaise, Guideline glRaiseChargeFive, Guideline glRaiseChargeFour, Guideline glRaiseChargeOne, Guideline glRaiseChargeSix, Guideline glRaiseChargeThree, Guideline glRaiseChargeTwo, AppCompatImageView ivRaiseChargeFour, ImageView ivRaiseChargeHand, AppCompatImageView ivRaiseChargeOne, AppCompatImageView ivRaiseChargeThree, AppCompatImageView ivRaiseChargeTwo, View markerRaiseChargeFour, View markerRaiseChargeOne, View markerRaiseChargeThree, View markerRaiseChargeTwo, ConstraintLayout mlRaiseCharge, ProgressBarWithListener pbRaiseChargeFour, ProgressBarWithListener pbRaiseChargeHintOne, ProgressBarWithListener pbRaiseChargeHintTwo, ProgressBarWithListener pbRaiseChargeOne, ProgressBarWithListener pbRaiseChargeThree, ProgressBarWithListener pbRaiseChargeTwo, TextView tvRaiseChargeHelp) {
        super(_bindingComponent, _root, _localFieldCount);
        this.blockRaiseChargeDark = blockRaiseChargeDark;
        this.blockRaiseChargeHint = blockRaiseChargeHint;
        this.btnRaiseChargeAttach = btnRaiseChargeAttach;
        this.btnRaiseChargeAttachAnimationOne = btnRaiseChargeAttachAnimationOne;
        this.btnRaiseChargeAttachAnimationTwo = btnRaiseChargeAttachAnimationTwo;
        this.btnRaiseChargeHint = btnRaiseChargeHint;
        this.btnRaiseChargeHintClose = btnRaiseChargeHintClose;
        this.btnRaiseChargeHintDesc = btnRaiseChargeHintDesc;
        this.btnRaiseChargeRaise = btnRaiseChargeRaise;
        this.glRaiseChargeFive = glRaiseChargeFive;
        this.glRaiseChargeFour = glRaiseChargeFour;
        this.glRaiseChargeOne = glRaiseChargeOne;
        this.glRaiseChargeSix = glRaiseChargeSix;
        this.glRaiseChargeThree = glRaiseChargeThree;
        this.glRaiseChargeTwo = glRaiseChargeTwo;
        this.ivRaiseChargeFour = ivRaiseChargeFour;
        this.ivRaiseChargeHand = ivRaiseChargeHand;
        this.ivRaiseChargeOne = ivRaiseChargeOne;
        this.ivRaiseChargeThree = ivRaiseChargeThree;
        this.ivRaiseChargeTwo = ivRaiseChargeTwo;
        this.markerRaiseChargeFour = markerRaiseChargeFour;
        this.markerRaiseChargeOne = markerRaiseChargeOne;
        this.markerRaiseChargeThree = markerRaiseChargeThree;
        this.markerRaiseChargeTwo = markerRaiseChargeTwo;
        this.mlRaiseCharge = mlRaiseCharge;
        this.pbRaiseChargeFour = pbRaiseChargeFour;
        this.pbRaiseChargeHintOne = pbRaiseChargeHintOne;
        this.pbRaiseChargeHintTwo = pbRaiseChargeHintTwo;
        this.pbRaiseChargeOne = pbRaiseChargeOne;
        this.pbRaiseChargeThree = pbRaiseChargeThree;
        this.pbRaiseChargeTwo = pbRaiseChargeTwo;
        this.tvRaiseChargeHelp = tvRaiseChargeHelp;
    }

    @Nullable
    public RaiseChargeViewModel getVm() {
        return this.mVm;
    }

    @NonNull
    public static FragmentRaiseChargeBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentRaiseChargeBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (FragmentRaiseChargeBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_raise_charge, root, attachToRoot, component);
    }

    @NonNull
    public static FragmentRaiseChargeBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentRaiseChargeBinding inflate(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (FragmentRaiseChargeBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_raise_charge, null, false, component);
    }

    public static FragmentRaiseChargeBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentRaiseChargeBinding bind(@NonNull View view, @Nullable Object component) {
        return (FragmentRaiseChargeBinding) ViewDataBinding.bind(component, view, R.layout.fragment_raise_charge);
    }
}
