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
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.blackhub.bronline.game.gui.electric.view.FindProblemView;
import com.blackhub.bronline.game.gui.electric.viewmodel.FindProblemViewModel;
import com.bless.client.R;

/* loaded from: classes2.dex */
public abstract class FragmentFindProblemBinding extends ViewDataBinding {

    @NonNull
    public final FrameLayout blockFindProblemCustomView;

    @NonNull
    public final FrameLayout blockFindProblemDark;

    @NonNull
    public final FrameLayout blockFindProblemElementOne;

    @NonNull
    public final FrameLayout blockFindProblemElementThree;

    @NonNull
    public final FrameLayout blockFindProblemElementTwo;

    @NonNull
    public final LinearLayout blockFindProblemHint;

    @NonNull
    public final View blockFindProblemLeft;

    @NonNull
    public final FrameLayout blockFindProblemProbeBlack;

    @NonNull
    public final FrameLayout blockFindProblemProbeRed;

    @NonNull
    public final View blockFindProblemRight;

    @NonNull
    public final FrameLayout blockFindProblemTargetOhm;

    @NonNull
    public final ImageButton btnFindProblemHint;

    @NonNull
    public final ImageButton btnFindProblemHintClose;

    @NonNull
    public final TextView btnFindProblemHintDesc;

    @NonNull
    public final AppCompatButton btnFindProblemNext;

    @NonNull
    public final FindProblemView cvFindProblemView;

    @NonNull
    public final Group groupMultimeterFull;

    @NonNull
    public final AppCompatImageView ivFindProblemElementOne;

    @NonNull
    public final AppCompatImageView ivFindProblemElementThree;

    @NonNull
    public final AppCompatImageView ivFindProblemElementTwoFour;

    @NonNull
    public final AppCompatImageView ivFindProblemElementTwoOne;

    @NonNull
    public final AppCompatImageView ivFindProblemElementTwoStable;

    @NonNull
    public final AppCompatImageView ivFindProblemElementTwoThree;

    @NonNull
    public final AppCompatImageView ivFindProblemElementTwoTwo;

    @NonNull
    public final ImageView ivFindProblemFuseBlackFour;

    @NonNull
    public final ImageView ivFindProblemFuseBlackOne;

    @NonNull
    public final ImageView ivFindProblemFuseBlackThree;

    @NonNull
    public final ImageView ivFindProblemFuseBlackTwo;

    @NonNull
    public final ImageView ivFindProblemFuseGrayFour;

    @NonNull
    public final ImageView ivFindProblemFuseGrayOne;

    @NonNull
    public final ImageView ivFindProblemFuseGrayThree;

    @NonNull
    public final ImageView ivFindProblemFuseGrayTwo;

    @NonNull
    public final ImageView ivFindProblemFuseRedFour;

    @NonNull
    public final ImageView ivFindProblemFuseRedOne;

    @NonNull
    public final ImageView ivFindProblemFuseRedThree;

    @NonNull
    public final ImageView ivFindProblemFuseRedTwo;

    @NonNull
    public final ImageView ivFindProblemHand;

    @NonNull
    public final AppCompatImageView ivFindProblemMultimeter;

    @NonNull
    public final AppCompatImageView ivFindProblemMultimeterDisplay;

    @NonNull
    public final AppCompatImageView ivFindProblemProbeBlack;

    @NonNull
    public final AppCompatImageView ivFindProblemProbeRed;

    @NonNull
    public final ImageView ivFindProblemVoltagePointBlack;

    @NonNull
    public final ImageView ivFindProblemVoltagePointRedFour;

    @NonNull
    public final ImageView ivFindProblemVoltagePointRedOne;

    @NonNull
    public final ImageView ivFindProblemVoltagePointRedThree;

    @NonNull
    public final ImageView ivFindProblemVoltagePointRedTwo;

    @Bindable
    public FindProblemViewModel mVm;

    @NonNull
    public final ConstraintLayout mlFindProblem;

    @NonNull
    public final TextView tvFindProblemHelp;

    @NonNull
    public final TextView tvFindProblemMultimeterText;

    @NonNull
    public final TextView tvFindProblemTargetOhm;

    @NonNull
    public final TextView tvFindProblemTitle;

    public abstract void setVm(@Nullable FindProblemViewModel vm);

    public FragmentFindProblemBinding(Object _bindingComponent, View _root, int _localFieldCount, FrameLayout blockFindProblemCustomView, FrameLayout blockFindProblemDark, FrameLayout blockFindProblemElementOne, FrameLayout blockFindProblemElementThree, FrameLayout blockFindProblemElementTwo, LinearLayout blockFindProblemHint, View blockFindProblemLeft, FrameLayout blockFindProblemProbeBlack, FrameLayout blockFindProblemProbeRed, View blockFindProblemRight, FrameLayout blockFindProblemTargetOhm, ImageButton btnFindProblemHint, ImageButton btnFindProblemHintClose, TextView btnFindProblemHintDesc, AppCompatButton btnFindProblemNext, FindProblemView cvFindProblemView, Group groupMultimeterFull, AppCompatImageView ivFindProblemElementOne, AppCompatImageView ivFindProblemElementThree, AppCompatImageView ivFindProblemElementTwoFour, AppCompatImageView ivFindProblemElementTwoOne, AppCompatImageView ivFindProblemElementTwoStable, AppCompatImageView ivFindProblemElementTwoThree, AppCompatImageView ivFindProblemElementTwoTwo, ImageView ivFindProblemFuseBlackFour, ImageView ivFindProblemFuseBlackOne, ImageView ivFindProblemFuseBlackThree, ImageView ivFindProblemFuseBlackTwo, ImageView ivFindProblemFuseGrayFour, ImageView ivFindProblemFuseGrayOne, ImageView ivFindProblemFuseGrayThree, ImageView ivFindProblemFuseGrayTwo, ImageView ivFindProblemFuseRedFour, ImageView ivFindProblemFuseRedOne, ImageView ivFindProblemFuseRedThree, ImageView ivFindProblemFuseRedTwo, ImageView ivFindProblemHand, AppCompatImageView ivFindProblemMultimeter, AppCompatImageView ivFindProblemMultimeterDisplay, AppCompatImageView ivFindProblemProbeBlack, AppCompatImageView ivFindProblemProbeRed, ImageView ivFindProblemVoltagePointBlack, ImageView ivFindProblemVoltagePointRedFour, ImageView ivFindProblemVoltagePointRedOne, ImageView ivFindProblemVoltagePointRedThree, ImageView ivFindProblemVoltagePointRedTwo, ConstraintLayout mlFindProblem, TextView tvFindProblemHelp, TextView tvFindProblemMultimeterText, TextView tvFindProblemTargetOhm, TextView tvFindProblemTitle) {
        super(_bindingComponent, _root, _localFieldCount);
        this.blockFindProblemCustomView = blockFindProblemCustomView;
        this.blockFindProblemDark = blockFindProblemDark;
        this.blockFindProblemElementOne = blockFindProblemElementOne;
        this.blockFindProblemElementThree = blockFindProblemElementThree;
        this.blockFindProblemElementTwo = blockFindProblemElementTwo;
        this.blockFindProblemHint = blockFindProblemHint;
        this.blockFindProblemLeft = blockFindProblemLeft;
        this.blockFindProblemProbeBlack = blockFindProblemProbeBlack;
        this.blockFindProblemProbeRed = blockFindProblemProbeRed;
        this.blockFindProblemRight = blockFindProblemRight;
        this.blockFindProblemTargetOhm = blockFindProblemTargetOhm;
        this.btnFindProblemHint = btnFindProblemHint;
        this.btnFindProblemHintClose = btnFindProblemHintClose;
        this.btnFindProblemHintDesc = btnFindProblemHintDesc;
        this.btnFindProblemNext = btnFindProblemNext;
        this.cvFindProblemView = cvFindProblemView;
        this.groupMultimeterFull = groupMultimeterFull;
        this.ivFindProblemElementOne = ivFindProblemElementOne;
        this.ivFindProblemElementThree = ivFindProblemElementThree;
        this.ivFindProblemElementTwoFour = ivFindProblemElementTwoFour;
        this.ivFindProblemElementTwoOne = ivFindProblemElementTwoOne;
        this.ivFindProblemElementTwoStable = ivFindProblemElementTwoStable;
        this.ivFindProblemElementTwoThree = ivFindProblemElementTwoThree;
        this.ivFindProblemElementTwoTwo = ivFindProblemElementTwoTwo;
        this.ivFindProblemFuseBlackFour = ivFindProblemFuseBlackFour;
        this.ivFindProblemFuseBlackOne = ivFindProblemFuseBlackOne;
        this.ivFindProblemFuseBlackThree = ivFindProblemFuseBlackThree;
        this.ivFindProblemFuseBlackTwo = ivFindProblemFuseBlackTwo;
        this.ivFindProblemFuseGrayFour = ivFindProblemFuseGrayFour;
        this.ivFindProblemFuseGrayOne = ivFindProblemFuseGrayOne;
        this.ivFindProblemFuseGrayThree = ivFindProblemFuseGrayThree;
        this.ivFindProblemFuseGrayTwo = ivFindProblemFuseGrayTwo;
        this.ivFindProblemFuseRedFour = ivFindProblemFuseRedFour;
        this.ivFindProblemFuseRedOne = ivFindProblemFuseRedOne;
        this.ivFindProblemFuseRedThree = ivFindProblemFuseRedThree;
        this.ivFindProblemFuseRedTwo = ivFindProblemFuseRedTwo;
        this.ivFindProblemHand = ivFindProblemHand;
        this.ivFindProblemMultimeter = ivFindProblemMultimeter;
        this.ivFindProblemMultimeterDisplay = ivFindProblemMultimeterDisplay;
        this.ivFindProblemProbeBlack = ivFindProblemProbeBlack;
        this.ivFindProblemProbeRed = ivFindProblemProbeRed;
        this.ivFindProblemVoltagePointBlack = ivFindProblemVoltagePointBlack;
        this.ivFindProblemVoltagePointRedFour = ivFindProblemVoltagePointRedFour;
        this.ivFindProblemVoltagePointRedOne = ivFindProblemVoltagePointRedOne;
        this.ivFindProblemVoltagePointRedThree = ivFindProblemVoltagePointRedThree;
        this.ivFindProblemVoltagePointRedTwo = ivFindProblemVoltagePointRedTwo;
        this.mlFindProblem = mlFindProblem;
        this.tvFindProblemHelp = tvFindProblemHelp;
        this.tvFindProblemMultimeterText = tvFindProblemMultimeterText;
        this.tvFindProblemTargetOhm = tvFindProblemTargetOhm;
        this.tvFindProblemTitle = tvFindProblemTitle;
    }

    @Nullable
    public FindProblemViewModel getVm() {
        return this.mVm;
    }

    @NonNull
    public static FragmentFindProblemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentFindProblemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (FragmentFindProblemBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_find_problem, root, attachToRoot, component);
    }

    @NonNull
    public static FragmentFindProblemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentFindProblemBinding inflate(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (FragmentFindProblemBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_find_problem, null, false, component);
    }

    public static FragmentFindProblemBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentFindProblemBinding bind(@NonNull View view, @Nullable Object component) {
        return (FragmentFindProblemBinding) ViewDataBinding.bind(component, view, R.layout.fragment_find_problem);
    }
}
