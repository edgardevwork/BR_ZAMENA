package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.p003ui.platform.ComposeView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.blackhub.bronline.game.gui.tutorialhints.TutorialViewModel;
import com.bless.client.R;


public abstract class FragmentTutorialGuiBinding extends ViewDataBinding {

    @NonNull
    public final FrameLayout constraintLayout;

    @NonNull
    public final ComposeView cvTutorial;

    @NonNull
    public final HintBottomBinding inTutorialHintBottom;

    @NonNull
    public final HintDrivingSchoolBinding inTutorialHintDrivingSchool;

    @NonNull
    public final UncleCallBinding inTutorialUncleCall;

    @Bindable
    public TutorialViewModel mVm;

    public abstract void setVm(@Nullable TutorialViewModel vm);

    public FragmentTutorialGuiBinding(Object _bindingComponent, View _root, int _localFieldCount, FrameLayout constraintLayout, ComposeView cvTutorial, HintBottomBinding inTutorialHintBottom, HintDrivingSchoolBinding inTutorialHintDrivingSchool, UncleCallBinding inTutorialUncleCall) {
        super(_bindingComponent, _root, _localFieldCount);
        this.constraintLayout = constraintLayout;
        this.cvTutorial = cvTutorial;
        this.inTutorialHintBottom = inTutorialHintBottom;
        this.inTutorialHintDrivingSchool = inTutorialHintDrivingSchool;
        this.inTutorialUncleCall = inTutorialUncleCall;
    }

    @Nullable
    public TutorialViewModel getVm() {
        return this.mVm;
    }

    @NonNull
    public static FragmentTutorialGuiBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentTutorialGuiBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (FragmentTutorialGuiBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_tutorial_gui, root, attachToRoot, component);
    }

    @NonNull
    public static FragmentTutorialGuiBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentTutorialGuiBinding inflate(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (FragmentTutorialGuiBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_tutorial_gui, null, false, component);
    }

    public static FragmentTutorialGuiBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentTutorialGuiBinding bind(@NonNull View view, @Nullable Object component) {
        return (FragmentTutorialGuiBinding) ViewDataBinding.bind(component, view, R.layout.fragment_tutorial_gui);
    }
}
