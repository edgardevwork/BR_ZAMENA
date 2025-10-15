package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.blackhub.bronline.game.gui.electric.viewmodel.SumContactsViewModel;
import com.bless.client.R;

/* loaded from: classes2.dex */
public abstract class FragmentSumContactsBinding extends ViewDataBinding {

    @NonNull
    public final FrameLayout blockSumContactsBulbOne;

    @NonNull
    public final FrameLayout blockSumContactsBulbThree;

    @NonNull
    public final FrameLayout blockSumContactsBulbTwo;

    @NonNull
    public final FrameLayout blockSumContactsDark;

    @NonNull
    public final LinearLayout blockSumContactsHint;

    @NonNull
    public final View blockSumContactsMain;

    @NonNull
    public final View blockSumContactsRight;

    @NonNull
    public final ImageButton btnSumContactsHint;

    @NonNull
    public final ImageButton btnSumContactsHintClose;

    @NonNull
    public final TextView btnSumContactsHintDesc;

    @NonNull
    public final AppCompatImageView ivSumContactsCircleOne;

    @NonNull
    public final AppCompatImageView ivSumContactsCircleThree;

    @NonNull
    public final AppCompatImageView ivSumContactsCircleTwo;

    @NonNull
    public final TextView ivSumContactsCubeOne;

    @NonNull
    public final TextView ivSumContactsCubeThree;

    @NonNull
    public final TextView ivSumContactsCubeTwo;

    @NonNull
    public final ImageView ivSumContactsHand;

    @NonNull
    public final AppCompatImageView ivSumContactsPipeCurveBlue;

    @NonNull
    public final AppCompatImageView ivSumContactsPipeCurveRed;

    @NonNull
    public final AppCompatImageView ivSumContactsPipeCurveRedReverse;

    @NonNull
    public final AppCompatImageView ivSumContactsPipeCurveYellow;

    @NonNull
    public final AppCompatImageView ivSumContactsPipeStraightBlue;

    @NonNull
    public final AppCompatImageView ivSumContactsPipeStraightYellow;

    @Bindable
    public SumContactsViewModel mVm;

    @NonNull
    public final ConstraintLayout mlSumContacts;

    @NonNull
    public final AppCompatTextView tvSumContactsBlockRightTitle;

    @NonNull
    public final TextView tvSumContactsBulbOne;

    @NonNull
    public final TextView tvSumContactsBulbThree;

    @NonNull
    public final TextView tvSumContactsBulbTwo;

    @NonNull
    public final TextView tvSumContactsHelp;

    @NonNull
    public final TextView tvSumContactsTitle;

    public abstract void setVm(@Nullable SumContactsViewModel vm);

    public FragmentSumContactsBinding(Object _bindingComponent, View _root, int _localFieldCount, FrameLayout blockSumContactsBulbOne, FrameLayout blockSumContactsBulbThree, FrameLayout blockSumContactsBulbTwo, FrameLayout blockSumContactsDark, LinearLayout blockSumContactsHint, View blockSumContactsMain, View blockSumContactsRight, ImageButton btnSumContactsHint, ImageButton btnSumContactsHintClose, TextView btnSumContactsHintDesc, AppCompatImageView ivSumContactsCircleOne, AppCompatImageView ivSumContactsCircleThree, AppCompatImageView ivSumContactsCircleTwo, TextView ivSumContactsCubeOne, TextView ivSumContactsCubeThree, TextView ivSumContactsCubeTwo, ImageView ivSumContactsHand, AppCompatImageView ivSumContactsPipeCurveBlue, AppCompatImageView ivSumContactsPipeCurveRed, AppCompatImageView ivSumContactsPipeCurveRedReverse, AppCompatImageView ivSumContactsPipeCurveYellow, AppCompatImageView ivSumContactsPipeStraightBlue, AppCompatImageView ivSumContactsPipeStraightYellow, ConstraintLayout mlSumContacts, AppCompatTextView tvSumContactsBlockRightTitle, TextView tvSumContactsBulbOne, TextView tvSumContactsBulbThree, TextView tvSumContactsBulbTwo, TextView tvSumContactsHelp, TextView tvSumContactsTitle) {
        super(_bindingComponent, _root, _localFieldCount);
        this.blockSumContactsBulbOne = blockSumContactsBulbOne;
        this.blockSumContactsBulbThree = blockSumContactsBulbThree;
        this.blockSumContactsBulbTwo = blockSumContactsBulbTwo;
        this.blockSumContactsDark = blockSumContactsDark;
        this.blockSumContactsHint = blockSumContactsHint;
        this.blockSumContactsMain = blockSumContactsMain;
        this.blockSumContactsRight = blockSumContactsRight;
        this.btnSumContactsHint = btnSumContactsHint;
        this.btnSumContactsHintClose = btnSumContactsHintClose;
        this.btnSumContactsHintDesc = btnSumContactsHintDesc;
        this.ivSumContactsCircleOne = ivSumContactsCircleOne;
        this.ivSumContactsCircleThree = ivSumContactsCircleThree;
        this.ivSumContactsCircleTwo = ivSumContactsCircleTwo;
        this.ivSumContactsCubeOne = ivSumContactsCubeOne;
        this.ivSumContactsCubeThree = ivSumContactsCubeThree;
        this.ivSumContactsCubeTwo = ivSumContactsCubeTwo;
        this.ivSumContactsHand = ivSumContactsHand;
        this.ivSumContactsPipeCurveBlue = ivSumContactsPipeCurveBlue;
        this.ivSumContactsPipeCurveRed = ivSumContactsPipeCurveRed;
        this.ivSumContactsPipeCurveRedReverse = ivSumContactsPipeCurveRedReverse;
        this.ivSumContactsPipeCurveYellow = ivSumContactsPipeCurveYellow;
        this.ivSumContactsPipeStraightBlue = ivSumContactsPipeStraightBlue;
        this.ivSumContactsPipeStraightYellow = ivSumContactsPipeStraightYellow;
        this.mlSumContacts = mlSumContacts;
        this.tvSumContactsBlockRightTitle = tvSumContactsBlockRightTitle;
        this.tvSumContactsBulbOne = tvSumContactsBulbOne;
        this.tvSumContactsBulbThree = tvSumContactsBulbThree;
        this.tvSumContactsBulbTwo = tvSumContactsBulbTwo;
        this.tvSumContactsHelp = tvSumContactsHelp;
        this.tvSumContactsTitle = tvSumContactsTitle;
    }

    @Nullable
    public SumContactsViewModel getVm() {
        return this.mVm;
    }

    @NonNull
    public static FragmentSumContactsBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentSumContactsBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (FragmentSumContactsBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_sum_contacts, root, attachToRoot, component);
    }

    @NonNull
    public static FragmentSumContactsBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentSumContactsBinding inflate(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (FragmentSumContactsBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_sum_contacts, null, false, component);
    }

    public static FragmentSumContactsBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentSumContactsBinding bind(@NonNull View view, @Nullable Object component) {
        return (FragmentSumContactsBinding) ViewDataBinding.bind(component, view, R.layout.fragment_sum_contacts);
    }
}
