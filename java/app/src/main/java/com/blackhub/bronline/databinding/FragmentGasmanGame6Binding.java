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


public abstract class FragmentGasmanGame6Binding extends ViewDataBinding {

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
    public final ImageView ivCornerPipeTopPlot;

    @NonNull
    public final ImageView ivCornerPipeTopPlot1;

    @NonNull
    public final ImageView ivCornerStaticPipe1;

    @NonNull
    public final ImageView ivCornerStaticPipe2;

    @NonNull
    public final ImageView ivCornerStaticPipe3;

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
    public final ImageView ivStraightPipeMiddlePlot;

    @NonNull
    public final ImageView ivStraightPipeMiddlePlot1;

    @NonNull
    public final ImageView ivStraightPipeMiddlePlot2;

    @NonNull
    public final ImageView ivTeePipeBotPlot;

    @NonNull
    public final ImageView ivTeePipeBotPlot1;

    @NonNull
    public final ImageView ivTeePipeBotPlot2;

    @NonNull
    public final ImageView ivTeePipeDropArea1;

    @NonNull
    public final ImageView ivTeePipeDropArea2;

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

    @NonNull
    public final View vStub;

    public abstract void setVm(@Nullable GasmanParentViewModel vm);

    public FragmentGasmanGame6Binding(Object _bindingComponent, View _root, int _localFieldCount, ConstraintLayout containerRoot, Guideline guidelineHorizontalTop, Guideline guidelineVertical16Percent, ImageView ivAnimationGas, ImageView ivCornerDropArea1, ImageView ivCornerPipeTopPlot, ImageView ivCornerPipeTopPlot1, ImageView ivCornerStaticPipe1, ImageView ivCornerStaticPipe2, ImageView ivCornerStaticPipe3, ImageView ivEndArrows1, ImageView ivEndArrows2, ImageView ivEndPoint, ImageView ivStartArrows, ImageView ivStartPoint, ImageView ivStraightDropArea1, ImageView ivStraightDropArea2, ImageView ivStraightPipeMiddlePlot, ImageView ivStraightPipeMiddlePlot1, ImageView ivStraightPipeMiddlePlot2, ImageView ivTeePipeBotPlot, ImageView ivTeePipeBotPlot1, ImageView ivTeePipeBotPlot2, ImageView ivTeePipeDropArea1, ImageView ivTeePipeDropArea2, ImageView ivTeeStaticPipe1, TextView tvBotPlot, TextView tvMiddlePlot, TextView tvTopPlot, View vStub) {
        super(_bindingComponent, _root, _localFieldCount);
        this.containerRoot = containerRoot;
        this.guidelineHorizontalTop = guidelineHorizontalTop;
        this.guidelineVertical16Percent = guidelineVertical16Percent;
        this.ivAnimationGas = ivAnimationGas;
        this.ivCornerDropArea1 = ivCornerDropArea1;
        this.ivCornerPipeTopPlot = ivCornerPipeTopPlot;
        this.ivCornerPipeTopPlot1 = ivCornerPipeTopPlot1;
        this.ivCornerStaticPipe1 = ivCornerStaticPipe1;
        this.ivCornerStaticPipe2 = ivCornerStaticPipe2;
        this.ivCornerStaticPipe3 = ivCornerStaticPipe3;
        this.ivEndArrows1 = ivEndArrows1;
        this.ivEndArrows2 = ivEndArrows2;
        this.ivEndPoint = ivEndPoint;
        this.ivStartArrows = ivStartArrows;
        this.ivStartPoint = ivStartPoint;
        this.ivStraightDropArea1 = ivStraightDropArea1;
        this.ivStraightDropArea2 = ivStraightDropArea2;
        this.ivStraightPipeMiddlePlot = ivStraightPipeMiddlePlot;
        this.ivStraightPipeMiddlePlot1 = ivStraightPipeMiddlePlot1;
        this.ivStraightPipeMiddlePlot2 = ivStraightPipeMiddlePlot2;
        this.ivTeePipeBotPlot = ivTeePipeBotPlot;
        this.ivTeePipeBotPlot1 = ivTeePipeBotPlot1;
        this.ivTeePipeBotPlot2 = ivTeePipeBotPlot2;
        this.ivTeePipeDropArea1 = ivTeePipeDropArea1;
        this.ivTeePipeDropArea2 = ivTeePipeDropArea2;
        this.ivTeeStaticPipe1 = ivTeeStaticPipe1;
        this.tvBotPlot = tvBotPlot;
        this.tvMiddlePlot = tvMiddlePlot;
        this.tvTopPlot = tvTopPlot;
        this.vStub = vStub;
    }

    @Nullable
    public GasmanParentViewModel getVm() {
        return this.mVm;
    }

    @NonNull
    public static FragmentGasmanGame6Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentGasmanGame6Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (FragmentGasmanGame6Binding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_gasman_game_6, root, attachToRoot, component);
    }

    @NonNull
    public static FragmentGasmanGame6Binding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentGasmanGame6Binding inflate(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (FragmentGasmanGame6Binding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_gasman_game_6, null, false, component);
    }

    public static FragmentGasmanGame6Binding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentGasmanGame6Binding bind(@NonNull View view, @Nullable Object component) {
        return (FragmentGasmanGame6Binding) ViewDataBinding.bind(component, view, R.layout.fragment_gasman_game_6);
    }
}
