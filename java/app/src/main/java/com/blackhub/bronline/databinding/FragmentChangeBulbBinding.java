package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.blackhub.bronline.game.gui.electric.view.CircleView;
import com.blackhub.bronline.game.gui.electric.viewmodel.ChangeBulbViewModel;
import com.bless.client.R;


public abstract class FragmentChangeBulbBinding extends ViewDataBinding {

    @NonNull
    public final FrameLayout blockChangeBulbDark;

    @NonNull
    public final FrameLayout blockChangeBulbElementOne;

    @NonNull
    public final LinearLayout blockChangeBulbHint;

    @NonNull
    public final View blockChangeBulbRight;

    @NonNull
    public final ImageButton btnChangeBulbHint;

    @NonNull
    public final ImageButton btnChangeBulbHintClose;

    @NonNull
    public final TextView btnChangeBulbHintDesc;

    @NonNull
    public final ConstraintLayout constraintLayout;

    @NonNull
    public final CircleView cvChangeBulbGlassBig;

    @NonNull
    public final CircleView cvChangeBulbGlassSmall;

    @NonNull
    public final Group groupChangeBulb;

    @NonNull
    public final AppCompatImageView ivChangeBulbBulbBroke;

    @NonNull
    public final AppCompatImageView ivChangeBulbBulbFull;

    @NonNull
    public final AppCompatImageView ivChangeBulbElementOne;

    @NonNull
    public final AppCompatImageView ivChangeBulbLeg;

    @NonNull
    public final AppCompatImageView ivChangeBulbNeck;

    @Bindable
    public ChangeBulbViewModel mVm;

    @NonNull
    public final TextView tvChangeBulbHelp;

    @NonNull
    public final TextView tvChangeBulbTitle;

    public abstract void setVm(@Nullable ChangeBulbViewModel vm);

    public FragmentChangeBulbBinding(Object _bindingComponent, View _root, int _localFieldCount, FrameLayout blockChangeBulbDark, FrameLayout blockChangeBulbElementOne, LinearLayout blockChangeBulbHint, View blockChangeBulbRight, ImageButton btnChangeBulbHint, ImageButton btnChangeBulbHintClose, TextView btnChangeBulbHintDesc, ConstraintLayout constraintLayout, CircleView cvChangeBulbGlassBig, CircleView cvChangeBulbGlassSmall, Group groupChangeBulb, AppCompatImageView ivChangeBulbBulbBroke, AppCompatImageView ivChangeBulbBulbFull, AppCompatImageView ivChangeBulbElementOne, AppCompatImageView ivChangeBulbLeg, AppCompatImageView ivChangeBulbNeck, TextView tvChangeBulbHelp, TextView tvChangeBulbTitle) {
        super(_bindingComponent, _root, _localFieldCount);
        this.blockChangeBulbDark = blockChangeBulbDark;
        this.blockChangeBulbElementOne = blockChangeBulbElementOne;
        this.blockChangeBulbHint = blockChangeBulbHint;
        this.blockChangeBulbRight = blockChangeBulbRight;
        this.btnChangeBulbHint = btnChangeBulbHint;
        this.btnChangeBulbHintClose = btnChangeBulbHintClose;
        this.btnChangeBulbHintDesc = btnChangeBulbHintDesc;
        this.constraintLayout = constraintLayout;
        this.cvChangeBulbGlassBig = cvChangeBulbGlassBig;
        this.cvChangeBulbGlassSmall = cvChangeBulbGlassSmall;
        this.groupChangeBulb = groupChangeBulb;
        this.ivChangeBulbBulbBroke = ivChangeBulbBulbBroke;
        this.ivChangeBulbBulbFull = ivChangeBulbBulbFull;
        this.ivChangeBulbElementOne = ivChangeBulbElementOne;
        this.ivChangeBulbLeg = ivChangeBulbLeg;
        this.ivChangeBulbNeck = ivChangeBulbNeck;
        this.tvChangeBulbHelp = tvChangeBulbHelp;
        this.tvChangeBulbTitle = tvChangeBulbTitle;
    }

    @Nullable
    public ChangeBulbViewModel getVm() {
        return this.mVm;
    }

    @NonNull
    public static FragmentChangeBulbBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentChangeBulbBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (FragmentChangeBulbBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_change_bulb, root, attachToRoot, component);
    }

    @NonNull
    public static FragmentChangeBulbBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentChangeBulbBinding inflate(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (FragmentChangeBulbBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_change_bulb, null, false, component);
    }

    public static FragmentChangeBulbBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentChangeBulbBinding bind(@NonNull View view, @Nullable Object component) {
        return (FragmentChangeBulbBinding) ViewDataBinding.bind(component, view, R.layout.fragment_change_bulb);
    }
}
