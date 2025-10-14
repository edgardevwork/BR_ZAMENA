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
public abstract class FragmentGasmanGame9Binding extends ViewDataBinding {

    @NonNull
    public final ConstraintLayout containerRoot;

    @NonNull
    public final Guideline guidelineVertical16Percent;

    @NonNull
    public final Guideline guidelineVerticalFiftyPercent;

    @NonNull
    public final ImageView ivAnimationGas;

    @NonNull
    public final ImageView ivCornerDropArea1;

    @NonNull
    public final ImageView ivCornerDropArea2;

    @NonNull
    public final ImageView ivCornerDropArea3;

    @NonNull
    public final ImageView ivCornerPipeTopPlot;

    @NonNull
    public final ImageView ivCornerPipeTopPlot1;

    @NonNull
    public final ImageView ivCornerPipeTopPlot2;

    @NonNull
    public final ImageView ivCornerPipeTopPlot3;

    @NonNull
    public final ImageView ivCornerStaticPipe1;

    @NonNull
    public final ImageView ivCornerStaticPipe2;

    @NonNull
    public final ImageView ivEndArrows1;

    @NonNull
    public final ImageView ivEndPoint;

    @NonNull
    public final ImageView ivStartArrows;

    @NonNull
    public final ImageView ivStartPoint;

    @NonNull
    public final ImageView ivStraightDropArea1;

    @NonNull
    public final ImageView ivStraightPipeBotPlot;

    @NonNull
    public final ImageView ivStraightPipeBotPlot1;

    @NonNull
    public final ImageView ivTeePipeDropArea1;

    @NonNull
    public final ImageView ivTeePipeMiddlePlot;

    @NonNull
    public final ImageView ivTeePipeMiddlePlot1;

    @NonNull
    public final ImageView ivTeeStaticPipe1;

    @Bindable
    public GasmanParentViewModel mVm;

    @NonNull
    public final TextView tvBotPlot;

    @NonNull
    public final TextView tvMiddlePlot;

    @NonNull
    public final TextView tvTopPlot;

    public abstract void setVm(@Nullable GasmanParentViewModel vm);

    public FragmentGasmanGame9Binding(Object _bindingComponent, View _root, int _localFieldCount, ConstraintLayout containerRoot, Guideline guidelineVertical16Percent, Guideline guidelineVerticalFiftyPercent, ImageView ivAnimationGas, ImageView ivCornerDropArea1, ImageView ivCornerDropArea2, ImageView ivCornerDropArea3, ImageView ivCornerPipeTopPlot, ImageView ivCornerPipeTopPlot1, ImageView ivCornerPipeTopPlot2, ImageView ivCornerPipeTopPlot3, ImageView ivCornerStaticPipe1, ImageView ivCornerStaticPipe2, ImageView ivEndArrows1, ImageView ivEndPoint, ImageView ivStartArrows, ImageView ivStartPoint, ImageView ivStraightDropArea1, ImageView ivStraightPipeBotPlot, ImageView ivStraightPipeBotPlot1, ImageView ivTeePipeDropArea1, ImageView ivTeePipeMiddlePlot, ImageView ivTeePipeMiddlePlot1, ImageView ivTeeStaticPipe1, TextView tvBotPlot, TextView tvMiddlePlot, TextView tvTopPlot) {
        super(_bindingComponent, _root, _localFieldCount);
        this.containerRoot = containerRoot;
        this.guidelineVertical16Percent = guidelineVertical16Percent;
        this.guidelineVerticalFiftyPercent = guidelineVerticalFiftyPercent;
        this.ivAnimationGas = ivAnimationGas;
        this.ivCornerDropArea1 = ivCornerDropArea1;
        this.ivCornerDropArea2 = ivCornerDropArea2;
        this.ivCornerDropArea3 = ivCornerDropArea3;
        this.ivCornerPipeTopPlot = ivCornerPipeTopPlot;
        this.ivCornerPipeTopPlot1 = ivCornerPipeTopPlot1;
        this.ivCornerPipeTopPlot2 = ivCornerPipeTopPlot2;
        this.ivCornerPipeTopPlot3 = ivCornerPipeTopPlot3;
        this.ivCornerStaticPipe1 = ivCornerStaticPipe1;
        this.ivCornerStaticPipe2 = ivCornerStaticPipe2;
        this.ivEndArrows1 = ivEndArrows1;
        this.ivEndPoint = ivEndPoint;
        this.ivStartArrows = ivStartArrows;
        this.ivStartPoint = ivStartPoint;
        this.ivStraightDropArea1 = ivStraightDropArea1;
        this.ivStraightPipeBotPlot = ivStraightPipeBotPlot;
        this.ivStraightPipeBotPlot1 = ivStraightPipeBotPlot1;
        this.ivTeePipeDropArea1 = ivTeePipeDropArea1;
        this.ivTeePipeMiddlePlot = ivTeePipeMiddlePlot;
        this.ivTeePipeMiddlePlot1 = ivTeePipeMiddlePlot1;
        this.ivTeeStaticPipe1 = ivTeeStaticPipe1;
        this.tvBotPlot = tvBotPlot;
        this.tvMiddlePlot = tvMiddlePlot;
        this.tvTopPlot = tvTopPlot;
    }

    @Nullable
    public GasmanParentViewModel getVm() {
        return this.mVm;
    }

    @NonNull
    public static FragmentGasmanGame9Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentGasmanGame9Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (FragmentGasmanGame9Binding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_gasman_game_9, root, attachToRoot, component);
    }

    @NonNull
    public static FragmentGasmanGame9Binding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentGasmanGame9Binding inflate(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (FragmentGasmanGame9Binding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_gasman_game_9, null, false, component);
    }

    public static FragmentGasmanGame9Binding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentGasmanGame9Binding bind(@NonNull View view, @Nullable Object component) {
        return (FragmentGasmanGame9Binding) ViewDataBinding.bind(component, view, R.layout.fragment_gasman_game_9);
    }
}
