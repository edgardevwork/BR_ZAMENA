package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.blackhub.bronline.game.gui.electric.viewmodel.CollectSchemeViewModel;
import com.bless.client.R;
import com.google.android.material.divider.MaterialDivider;

/* loaded from: classes2.dex */
public abstract class FragmentCollectSchemeBinding extends ViewDataBinding {

    @NonNull
    public final View blockCollectSchemeCenter;

    @NonNull
    public final View blockCollectSchemeDark;

    @NonNull
    public final LinearLayout blockCollectSchemeHint;

    @NonNull
    public final TableLayout blockCollectSchemeTarget;

    @NonNull
    public final ConstraintLayout blockCollectSchemeTimer;

    @NonNull
    public final View blockCollectSchemeTransparent;

    @NonNull
    public final ImageButton btnCollectSchemeHint;

    @NonNull
    public final ImageButton btnCollectSchemeHintClose;

    @NonNull
    public final TextView btnCollectSchemeHintDesc;

    @NonNull
    public final MaterialDivider divCollectSchemeOne;

    @NonNull
    public final Group groupCollectSchemeHintOne;

    @NonNull
    public final Group groupCollectSchemeHintThree;

    @NonNull
    public final Group groupCollectSchemeHintTwo;

    @NonNull
    public final Guideline guidelineCollectSchemeLeft;

    @NonNull
    public final Guideline guidelineCollectSchemeRight;

    @NonNull
    public final AppCompatImageView ivCollectSchemeBulbColorSchemeOneFive;

    @NonNull
    public final AppCompatImageView ivCollectSchemeBulbColorSchemeOneFour;

    @NonNull
    public final AppCompatImageView ivCollectSchemeBulbColorSchemeOneOne;

    @NonNull
    public final AppCompatImageView ivCollectSchemeBulbColorSchemeOneThree;

    @NonNull
    public final AppCompatImageView ivCollectSchemeBulbColorSchemeOneTwo;

    @NonNull
    public final AppCompatImageView ivCollectSchemeBulbColorSchemeTwoFive;

    @NonNull
    public final AppCompatImageView ivCollectSchemeBulbColorSchemeTwoFour;

    @NonNull
    public final AppCompatImageView ivCollectSchemeBulbColorSchemeTwoOne;

    @NonNull
    public final AppCompatImageView ivCollectSchemeBulbColorSchemeTwoThree;

    @NonNull
    public final AppCompatImageView ivCollectSchemeBulbColorSchemeTwoTwo;

    @NonNull
    public final ImageView ivCollectSchemeHand;

    @NonNull
    public final AppCompatImageView ivCollectSchemeTime;

    @NonNull
    public final AppCompatImageView ivCollectSchemeTrafficLight;

    @Bindable
    public CollectSchemeViewModel mVm;

    @NonNull
    public final ConstraintLayout mlCollectScheme;

    @NonNull
    public final BlockToggleSwitchElectricBinding rbCollectSchemeToggleSwitchOneFive;

    @NonNull
    public final BlockToggleSwitchElectricBinding rbCollectSchemeToggleSwitchOneFour;

    @NonNull
    public final BlockToggleSwitchElectricBinding rbCollectSchemeToggleSwitchOneOne;

    @NonNull
    public final BlockToggleSwitchElectricBinding rbCollectSchemeToggleSwitchOneThree;

    @NonNull
    public final BlockToggleSwitchElectricBinding rbCollectSchemeToggleSwitchOneTwo;

    @NonNull
    public final BlockToggleSwitchElectricBinding rbCollectSchemeToggleSwitchTwoFive;

    @NonNull
    public final BlockToggleSwitchElectricBinding rbCollectSchemeToggleSwitchTwoFour;

    @NonNull
    public final BlockToggleSwitchElectricBinding rbCollectSchemeToggleSwitchTwoOne;

    @NonNull
    public final BlockToggleSwitchElectricBinding rbCollectSchemeToggleSwitchTwoThree;

    @NonNull
    public final BlockToggleSwitchElectricBinding rbCollectSchemeToggleSwitchTwoTwo;

    @NonNull
    public final AppCompatTextView tvCollectSchemeTime;

    @NonNull
    public final TextView tvCollectSchemeTitle;

    @NonNull
    public final AppCompatTextView tvCollectSchemeTitleScheme;

    public abstract void setVm(@Nullable CollectSchemeViewModel vm);

    public FragmentCollectSchemeBinding(Object _bindingComponent, View _root, int _localFieldCount, View blockCollectSchemeCenter, View blockCollectSchemeDark, LinearLayout blockCollectSchemeHint, TableLayout blockCollectSchemeTarget, ConstraintLayout blockCollectSchemeTimer, View blockCollectSchemeTransparent, ImageButton btnCollectSchemeHint, ImageButton btnCollectSchemeHintClose, TextView btnCollectSchemeHintDesc, MaterialDivider divCollectSchemeOne, Group groupCollectSchemeHintOne, Group groupCollectSchemeHintThree, Group groupCollectSchemeHintTwo, Guideline guidelineCollectSchemeLeft, Guideline guidelineCollectSchemeRight, AppCompatImageView ivCollectSchemeBulbColorSchemeOneFive, AppCompatImageView ivCollectSchemeBulbColorSchemeOneFour, AppCompatImageView ivCollectSchemeBulbColorSchemeOneOne, AppCompatImageView ivCollectSchemeBulbColorSchemeOneThree, AppCompatImageView ivCollectSchemeBulbColorSchemeOneTwo, AppCompatImageView ivCollectSchemeBulbColorSchemeTwoFive, AppCompatImageView ivCollectSchemeBulbColorSchemeTwoFour, AppCompatImageView ivCollectSchemeBulbColorSchemeTwoOne, AppCompatImageView ivCollectSchemeBulbColorSchemeTwoThree, AppCompatImageView ivCollectSchemeBulbColorSchemeTwoTwo, ImageView ivCollectSchemeHand, AppCompatImageView ivCollectSchemeTime, AppCompatImageView ivCollectSchemeTrafficLight, ConstraintLayout mlCollectScheme, BlockToggleSwitchElectricBinding rbCollectSchemeToggleSwitchOneFive, BlockToggleSwitchElectricBinding rbCollectSchemeToggleSwitchOneFour, BlockToggleSwitchElectricBinding rbCollectSchemeToggleSwitchOneOne, BlockToggleSwitchElectricBinding rbCollectSchemeToggleSwitchOneThree, BlockToggleSwitchElectricBinding rbCollectSchemeToggleSwitchOneTwo, BlockToggleSwitchElectricBinding rbCollectSchemeToggleSwitchTwoFive, BlockToggleSwitchElectricBinding rbCollectSchemeToggleSwitchTwoFour, BlockToggleSwitchElectricBinding rbCollectSchemeToggleSwitchTwoOne, BlockToggleSwitchElectricBinding rbCollectSchemeToggleSwitchTwoThree, BlockToggleSwitchElectricBinding rbCollectSchemeToggleSwitchTwoTwo, AppCompatTextView tvCollectSchemeTime, TextView tvCollectSchemeTitle, AppCompatTextView tvCollectSchemeTitleScheme) {
        super(_bindingComponent, _root, _localFieldCount);
        this.blockCollectSchemeCenter = blockCollectSchemeCenter;
        this.blockCollectSchemeDark = blockCollectSchemeDark;
        this.blockCollectSchemeHint = blockCollectSchemeHint;
        this.blockCollectSchemeTarget = blockCollectSchemeTarget;
        this.blockCollectSchemeTimer = blockCollectSchemeTimer;
        this.blockCollectSchemeTransparent = blockCollectSchemeTransparent;
        this.btnCollectSchemeHint = btnCollectSchemeHint;
        this.btnCollectSchemeHintClose = btnCollectSchemeHintClose;
        this.btnCollectSchemeHintDesc = btnCollectSchemeHintDesc;
        this.divCollectSchemeOne = divCollectSchemeOne;
        this.groupCollectSchemeHintOne = groupCollectSchemeHintOne;
        this.groupCollectSchemeHintThree = groupCollectSchemeHintThree;
        this.groupCollectSchemeHintTwo = groupCollectSchemeHintTwo;
        this.guidelineCollectSchemeLeft = guidelineCollectSchemeLeft;
        this.guidelineCollectSchemeRight = guidelineCollectSchemeRight;
        this.ivCollectSchemeBulbColorSchemeOneFive = ivCollectSchemeBulbColorSchemeOneFive;
        this.ivCollectSchemeBulbColorSchemeOneFour = ivCollectSchemeBulbColorSchemeOneFour;
        this.ivCollectSchemeBulbColorSchemeOneOne = ivCollectSchemeBulbColorSchemeOneOne;
        this.ivCollectSchemeBulbColorSchemeOneThree = ivCollectSchemeBulbColorSchemeOneThree;
        this.ivCollectSchemeBulbColorSchemeOneTwo = ivCollectSchemeBulbColorSchemeOneTwo;
        this.ivCollectSchemeBulbColorSchemeTwoFive = ivCollectSchemeBulbColorSchemeTwoFive;
        this.ivCollectSchemeBulbColorSchemeTwoFour = ivCollectSchemeBulbColorSchemeTwoFour;
        this.ivCollectSchemeBulbColorSchemeTwoOne = ivCollectSchemeBulbColorSchemeTwoOne;
        this.ivCollectSchemeBulbColorSchemeTwoThree = ivCollectSchemeBulbColorSchemeTwoThree;
        this.ivCollectSchemeBulbColorSchemeTwoTwo = ivCollectSchemeBulbColorSchemeTwoTwo;
        this.ivCollectSchemeHand = ivCollectSchemeHand;
        this.ivCollectSchemeTime = ivCollectSchemeTime;
        this.ivCollectSchemeTrafficLight = ivCollectSchemeTrafficLight;
        this.mlCollectScheme = mlCollectScheme;
        this.rbCollectSchemeToggleSwitchOneFive = rbCollectSchemeToggleSwitchOneFive;
        this.rbCollectSchemeToggleSwitchOneFour = rbCollectSchemeToggleSwitchOneFour;
        this.rbCollectSchemeToggleSwitchOneOne = rbCollectSchemeToggleSwitchOneOne;
        this.rbCollectSchemeToggleSwitchOneThree = rbCollectSchemeToggleSwitchOneThree;
        this.rbCollectSchemeToggleSwitchOneTwo = rbCollectSchemeToggleSwitchOneTwo;
        this.rbCollectSchemeToggleSwitchTwoFive = rbCollectSchemeToggleSwitchTwoFive;
        this.rbCollectSchemeToggleSwitchTwoFour = rbCollectSchemeToggleSwitchTwoFour;
        this.rbCollectSchemeToggleSwitchTwoOne = rbCollectSchemeToggleSwitchTwoOne;
        this.rbCollectSchemeToggleSwitchTwoThree = rbCollectSchemeToggleSwitchTwoThree;
        this.rbCollectSchemeToggleSwitchTwoTwo = rbCollectSchemeToggleSwitchTwoTwo;
        this.tvCollectSchemeTime = tvCollectSchemeTime;
        this.tvCollectSchemeTitle = tvCollectSchemeTitle;
        this.tvCollectSchemeTitleScheme = tvCollectSchemeTitleScheme;
    }

    @Nullable
    public CollectSchemeViewModel getVm() {
        return this.mVm;
    }

    @NonNull
    public static FragmentCollectSchemeBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentCollectSchemeBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (FragmentCollectSchemeBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_collect_scheme, root, attachToRoot, component);
    }

    @NonNull
    public static FragmentCollectSchemeBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentCollectSchemeBinding inflate(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (FragmentCollectSchemeBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_collect_scheme, null, false, component);
    }

    public static FragmentCollectSchemeBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentCollectSchemeBinding bind(@NonNull View view, @Nullable Object component) {
        return (FragmentCollectSchemeBinding) ViewDataBinding.bind(component, view, R.layout.fragment_collect_scheme);
    }
}
