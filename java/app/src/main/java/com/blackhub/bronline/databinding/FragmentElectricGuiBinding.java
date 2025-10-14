package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.blackhub.bronline.game.common.UIContainer;
import com.blackhub.bronline.game.gui.electric.viewmodel.ElectricViewModel;
import com.bless.client.R;


public abstract class FragmentElectricGuiBinding extends ViewDataBinding {

    @NonNull
    public final ImageButton btnClose;

    @NonNull
    public final ConstraintLayout constraintLayout;

    @Bindable
    public ElectricViewModel mVm;

    @NonNull
    public final UIContainer mainContainer;

    public abstract void setVm(@Nullable ElectricViewModel vm);

    public FragmentElectricGuiBinding(Object _bindingComponent, View _root, int _localFieldCount, ImageButton btnClose, ConstraintLayout constraintLayout, UIContainer mainContainer) {
        super(_bindingComponent, _root, _localFieldCount);
        this.btnClose = btnClose;
        this.constraintLayout = constraintLayout;
        this.mainContainer = mainContainer;
    }

    @Nullable
    public ElectricViewModel getVm() {
        return this.mVm;
    }

    @NonNull
    public static FragmentElectricGuiBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentElectricGuiBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (FragmentElectricGuiBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_electric_gui, root, attachToRoot, component);
    }

    @NonNull
    public static FragmentElectricGuiBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentElectricGuiBinding inflate(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (FragmentElectricGuiBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_electric_gui, null, false, component);
    }

    public static FragmentElectricGuiBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentElectricGuiBinding bind(@NonNull View view, @Nullable Object component) {
        return (FragmentElectricGuiBinding) ViewDataBinding.bind(component, view, R.layout.fragment_electric_gui);
    }
}
