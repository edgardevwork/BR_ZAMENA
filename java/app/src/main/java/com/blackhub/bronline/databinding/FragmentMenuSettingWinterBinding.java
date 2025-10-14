package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.blackhub.bronline.game.gui.menupausesettingandmap.p016ui.CustomSliderWithFourDots;
import com.bless.client.R;


public abstract class FragmentMenuSettingWinterBinding extends ViewDataBinding {

    @NonNull
    public final CustomSliderWithFourDots sbNewMenuSettingWinterShowIntensity;

    @NonNull
    public final SwitchCompat switchNewMenuSettingWinter;

    @NonNull
    public final TextView tvNewMenuSettingShowIntensityValue;

    @NonNull
    public final TextView tvNewMenuSettingWinterShowIntensityTitle;

    @NonNull
    public final TextView tvNewMenuSettingWinterSlip;

    @NonNull
    public final View viewNewMenuSettingWinter;

    public FragmentMenuSettingWinterBinding(Object _bindingComponent, View _root, int _localFieldCount, CustomSliderWithFourDots sbNewMenuSettingWinterShowIntensity, SwitchCompat switchNewMenuSettingWinter, TextView tvNewMenuSettingShowIntensityValue, TextView tvNewMenuSettingWinterShowIntensityTitle, TextView tvNewMenuSettingWinterSlip, View viewNewMenuSettingWinter) {
        super(_bindingComponent, _root, _localFieldCount);
        this.sbNewMenuSettingWinterShowIntensity = sbNewMenuSettingWinterShowIntensity;
        this.switchNewMenuSettingWinter = switchNewMenuSettingWinter;
        this.tvNewMenuSettingShowIntensityValue = tvNewMenuSettingShowIntensityValue;
        this.tvNewMenuSettingWinterShowIntensityTitle = tvNewMenuSettingWinterShowIntensityTitle;
        this.tvNewMenuSettingWinterSlip = tvNewMenuSettingWinterSlip;
        this.viewNewMenuSettingWinter = viewNewMenuSettingWinter;
    }

    @NonNull
    public static FragmentMenuSettingWinterBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentMenuSettingWinterBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (FragmentMenuSettingWinterBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_menu_setting_winter, root, attachToRoot, component);
    }

    @NonNull
    public static FragmentMenuSettingWinterBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentMenuSettingWinterBinding inflate(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (FragmentMenuSettingWinterBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_menu_setting_winter, null, false, component);
    }

    public static FragmentMenuSettingWinterBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentMenuSettingWinterBinding bind(@NonNull View view, @Nullable Object component) {
        return (FragmentMenuSettingWinterBinding) ViewDataBinding.bind(component, view, R.layout.fragment_menu_setting_winter);
    }
}
