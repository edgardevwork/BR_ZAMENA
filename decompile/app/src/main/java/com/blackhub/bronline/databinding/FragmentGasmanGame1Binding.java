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
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.blackhub.bronline.game.gui.gasmangame.viewmodel.GasmanParentViewModel;
import com.bless.client.R;

/* loaded from: classes2.dex */
public abstract class FragmentGasmanGame1Binding extends ViewDataBinding {

    @NonNull
    public final ConstraintLayout containerRoot;

    @NonNull
    public final Guideline guidelineHorizontalTop;

    @NonNull
    public final Guideline guidelineVertical16Percent;

    @NonNull
    public final Guideline guidelineVerticalEndButtons;

    @NonNull
    public final ImageView ivAnimationGas;

    @NonNull
    public final ImageView ivCornerDropArea1;

    @NonNull
    public final ImageView ivCornerDropArea2;

    @NonNull
    public final ImageView ivCornerDropArea3;

    @NonNull
    public final ImageView ivCornerPipeMiddlePlot;

    @NonNull
    public final ImageView ivCornerPipeMiddlePlot1;

    @NonNull
    public final ImageView ivCornerPipeMiddlePlot2;

    @NonNull
    public final ImageView ivCornerPipeMiddlePlot3;

    @NonNull
    public final ImageView ivEndArrows1;

    @NonNull
    public final ImageView ivEndArrows2;

    @NonNull
    public final ImageView ivEndPoint;

    @NonNull
    public final ImageView ivStartArrows;

    @NonNull
    public final ImageView ivStartPoint;

    @NonNull
    public final ImageView ivStaticCorner1;

    @NonNull
    public final ImageView ivStaticCorner2;

    @NonNull
    public final ImageView ivStaticStraightPlot1;

    @NonNull
    public final ImageView ivStaticStraightPlot2;

    @NonNull
    public final ImageView ivStaticStraightPlot3;

    @NonNull
    public final ImageView ivStaticStraightPlot4;

    @NonNull
    public final ImageView ivStaticTeePipeLong;

    @NonNull
    public final ImageView ivStraightDropArea1;

    @NonNull
    public final ImageView ivStraightDropArea2;

    @NonNull
    public final ImageView ivStraightPipeTopPlot;

    @NonNull
    public final ImageView ivStraightPipeTopPlot1;

    @NonNull
    public final ImageView ivStraightPipeTopPlot2;

    @NonNull
    public final ImageView ivTeePipeBotPlot;

    @Bindable
    public GasmanParentViewModel mVm;

    @NonNull
    public final TextView tvBotPlot;

    @NonNull
    public final TextView tvMiddlePlot;

    @NonNull
    public final TextView tvTopPlot;

    public abstract void setVm(@Nullable GasmanParentViewModel vm);

    public FragmentGasmanGame1Binding(Object _bindingComponent, View _root, int _localFieldCount, ConstraintLayout containerRoot, Guideline guidelineHorizontalTop, Guideline guidelineVertical16Percent, Guideline guidelineVerticalEndButtons, ImageView ivAnimationGas, ImageView ivCornerDropArea1, ImageView ivCornerDropArea2, ImageView ivCornerDropArea3, ImageView ivCornerPipeMiddlePlot, ImageView ivCornerPipeMiddlePlot1, ImageView ivCornerPipeMiddlePlot2, ImageView ivCornerPipeMiddlePlot3, ImageView ivEndArrows1, ImageView ivEndArrows2, ImageView ivEndPoint, ImageView ivStartArrows, ImageView ivStartPoint, ImageView ivStaticCorner1, ImageView ivStaticCorner2, ImageView ivStaticStraightPlot1, ImageView ivStaticStraightPlot2, ImageView ivStaticStraightPlot3, ImageView ivStaticStraightPlot4, ImageView ivStaticTeePipeLong, ImageView ivStraightDropArea1, ImageView ivStraightDropArea2, ImageView ivStraightPipeTopPlot, ImageView ivStraightPipeTopPlot1, ImageView ivStraightPipeTopPlot2, ImageView ivTeePipeBotPlot, TextView tvBotPlot, TextView tvMiddlePlot, TextView tvTopPlot) {
        super(_bindingComponent, _root, _localFieldCount);
        this.containerRoot = containerRoot;
        this.guidelineHorizontalTop = guidelineHorizontalTop;
        this.guidelineVertical16Percent = guidelineVertical16Percent;
        this.guidelineVerticalEndButtons = guidelineVerticalEndButtons;
        this.ivAnimationGas = ivAnimationGas;
        this.ivCornerDropArea1 = ivCornerDropArea1;
        this.ivCornerDropArea2 = ivCornerDropArea2;
        this.ivCornerDropArea3 = ivCornerDropArea3;
        this.ivCornerPipeMiddlePlot = ivCornerPipeMiddlePlot;
        this.ivCornerPipeMiddlePlot1 = ivCornerPipeMiddlePlot1;
        this.ivCornerPipeMiddlePlot2 = ivCornerPipeMiddlePlot2;
        this.ivCornerPipeMiddlePlot3 = ivCornerPipeMiddlePlot3;
        this.ivEndArrows1 = ivEndArrows1;
        this.ivEndArrows2 = ivEndArrows2;
        this.ivEndPoint = ivEndPoint;
        this.ivStartArrows = ivStartArrows;
        this.ivStartPoint = ivStartPoint;
        this.ivStaticCorner1 = ivStaticCorner1;
        this.ivStaticCorner2 = ivStaticCorner2;
        this.ivStaticStraightPlot1 = ivStaticStraightPlot1;
        this.ivStaticStraightPlot2 = ivStaticStraightPlot2;
        this.ivStaticStraightPlot3 = ivStaticStraightPlot3;
        this.ivStaticStraightPlot4 = ivStaticStraightPlot4;
        this.ivStaticTeePipeLong = ivStaticTeePipeLong;
        this.ivStraightDropArea1 = ivStraightDropArea1;
        this.ivStraightDropArea2 = ivStraightDropArea2;
        this.ivStraightPipeTopPlot = ivStraightPipeTopPlot;
        this.ivStraightPipeTopPlot1 = ivStraightPipeTopPlot1;
        this.ivStraightPipeTopPlot2 = ivStraightPipeTopPlot2;
        this.ivTeePipeBotPlot = ivTeePipeBotPlot;
        this.tvBotPlot = tvBotPlot;
        this.tvMiddlePlot = tvMiddlePlot;
        this.tvTopPlot = tvTopPlot;
    }

    @Nullable
    public GasmanParentViewModel getVm() {
        return this.mVm;
    }

    @NonNull
    public static FragmentGasmanGame1Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentGasmanGame1Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (FragmentGasmanGame1Binding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_gasman_game_1, root, attachToRoot, component);
    }

    @NonNull
    public static FragmentGasmanGame1Binding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentGasmanGame1Binding inflate(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (FragmentGasmanGame1Binding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_gasman_game_1, null, false, component);
    }

    public static FragmentGasmanGame1Binding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentGasmanGame1Binding bind(@NonNull View view, @Nullable Object component) {
        return (FragmentGasmanGame1Binding) ViewDataBinding.bind(component, view, R.layout.fragment_gasman_game_1);
    }
}
