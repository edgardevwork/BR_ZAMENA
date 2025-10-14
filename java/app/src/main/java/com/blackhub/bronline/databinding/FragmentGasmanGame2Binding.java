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
public abstract class FragmentGasmanGame2Binding extends ViewDataBinding {

    @NonNull
    public final ConstraintLayout containerRoot;

    @NonNull
    public final Guideline guidelineHorizontalTop;

    @NonNull
    public final Guideline guidelineVertical16Percent;

    @NonNull
    public final ImageView ivAnimationGas;

    @NonNull
    public final ImageView ivCornerDropArea1;

    @NonNull
    public final ImageView ivCornerDropArea2;

    @NonNull
    public final ImageView ivCornerPipeTopPlot;

    @NonNull
    public final ImageView ivCornerPipeTopPlot1;

    @NonNull
    public final ImageView ivCornerPipeTopPlot2;

    @NonNull
    public final ImageView ivCornerStaticPipe1;

    @NonNull
    public final ImageView ivCornerStaticPipe2;

    @NonNull
    public final ImageView ivCornerStaticPipe3;

    @NonNull
    public final ImageView ivCornerStaticPipe4;

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
    public final ImageView ivStraightDropArea1;

    @NonNull
    public final ImageView ivStraightDropArea2;

    @NonNull
    public final ImageView ivStraightLongStaticPipe;

    @NonNull
    public final ImageView ivStraightPipeMiddlePlot;

    @NonNull
    public final ImageView ivStraightPipeMiddlePlot1;

    @NonNull
    public final ImageView ivStraightPipeMiddlePlot2;

    @NonNull
    public final ImageView ivStraightPipeMiddlePlot3;

    @NonNull
    public final ImageView ivTeePipeBotPlot;

    @NonNull
    public final ImageView ivTeePipeBotPlot1;

    @NonNull
    public final ImageView ivTeePipeDropArea;

    @Bindable
    public GasmanParentViewModel mVm;

    @NonNull
    public final TextView tvBotPlot;

    @NonNull
    public final TextView tvMiddlePlot;

    @NonNull
    public final TextView tvTopPlot;

    public abstract void setVm(@Nullable GasmanParentViewModel vm);

    public FragmentGasmanGame2Binding(Object _bindingComponent, View _root, int _localFieldCount, ConstraintLayout containerRoot, Guideline guidelineHorizontalTop, Guideline guidelineVertical16Percent, ImageView ivAnimationGas, ImageView ivCornerDropArea1, ImageView ivCornerDropArea2, ImageView ivCornerPipeTopPlot, ImageView ivCornerPipeTopPlot1, ImageView ivCornerPipeTopPlot2, ImageView ivCornerStaticPipe1, ImageView ivCornerStaticPipe2, ImageView ivCornerStaticPipe3, ImageView ivCornerStaticPipe4, ImageView ivEndArrows1, ImageView ivEndArrows2, ImageView ivEndPoint, ImageView ivStartArrows, ImageView ivStartPoint, ImageView ivStraightDropArea1, ImageView ivStraightDropArea2, ImageView ivStraightLongStaticPipe, ImageView ivStraightPipeMiddlePlot, ImageView ivStraightPipeMiddlePlot1, ImageView ivStraightPipeMiddlePlot2, ImageView ivStraightPipeMiddlePlot3, ImageView ivTeePipeBotPlot, ImageView ivTeePipeBotPlot1, ImageView ivTeePipeDropArea, TextView tvBotPlot, TextView tvMiddlePlot, TextView tvTopPlot) {
        super(_bindingComponent, _root, _localFieldCount);
        this.containerRoot = containerRoot;
        this.guidelineHorizontalTop = guidelineHorizontalTop;
        this.guidelineVertical16Percent = guidelineVertical16Percent;
        this.ivAnimationGas = ivAnimationGas;
        this.ivCornerDropArea1 = ivCornerDropArea1;
        this.ivCornerDropArea2 = ivCornerDropArea2;
        this.ivCornerPipeTopPlot = ivCornerPipeTopPlot;
        this.ivCornerPipeTopPlot1 = ivCornerPipeTopPlot1;
        this.ivCornerPipeTopPlot2 = ivCornerPipeTopPlot2;
        this.ivCornerStaticPipe1 = ivCornerStaticPipe1;
        this.ivCornerStaticPipe2 = ivCornerStaticPipe2;
        this.ivCornerStaticPipe3 = ivCornerStaticPipe3;
        this.ivCornerStaticPipe4 = ivCornerStaticPipe4;
        this.ivEndArrows1 = ivEndArrows1;
        this.ivEndArrows2 = ivEndArrows2;
        this.ivEndPoint = ivEndPoint;
        this.ivStartArrows = ivStartArrows;
        this.ivStartPoint = ivStartPoint;
        this.ivStraightDropArea1 = ivStraightDropArea1;
        this.ivStraightDropArea2 = ivStraightDropArea2;
        this.ivStraightLongStaticPipe = ivStraightLongStaticPipe;
        this.ivStraightPipeMiddlePlot = ivStraightPipeMiddlePlot;
        this.ivStraightPipeMiddlePlot1 = ivStraightPipeMiddlePlot1;
        this.ivStraightPipeMiddlePlot2 = ivStraightPipeMiddlePlot2;
        this.ivStraightPipeMiddlePlot3 = ivStraightPipeMiddlePlot3;
        this.ivTeePipeBotPlot = ivTeePipeBotPlot;
        this.ivTeePipeBotPlot1 = ivTeePipeBotPlot1;
        this.ivTeePipeDropArea = ivTeePipeDropArea;
        this.tvBotPlot = tvBotPlot;
        this.tvMiddlePlot = tvMiddlePlot;
        this.tvTopPlot = tvTopPlot;
    }

    @Nullable
    public GasmanParentViewModel getVm() {
        return this.mVm;
    }

    @NonNull
    public static FragmentGasmanGame2Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentGasmanGame2Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (FragmentGasmanGame2Binding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_gasman_game_2, root, attachToRoot, component);
    }

    @NonNull
    public static FragmentGasmanGame2Binding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentGasmanGame2Binding inflate(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (FragmentGasmanGame2Binding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_gasman_game_2, null, false, component);
    }

    public static FragmentGasmanGame2Binding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentGasmanGame2Binding bind(@NonNull View view, @Nullable Object component) {
        return (FragmentGasmanGame2Binding) ViewDataBinding.bind(component, view, R.layout.fragment_gasman_game_2);
    }
}
