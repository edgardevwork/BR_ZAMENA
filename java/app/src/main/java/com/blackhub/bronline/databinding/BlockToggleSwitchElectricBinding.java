package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;

/* loaded from: classes2.dex */
public final class BlockToggleSwitchElectricBinding implements ViewBinding {

    @NonNull
    public final AppCompatImageView ivToggleSwitchBulbColor;

    @NonNull
    public final LinearLayoutCompat mlEleTricToogleSwitch;

    @NonNull
    public final LinearLayoutCompat rootView;

    @NonNull
    public final RadioButton switchOff;

    @NonNull
    public final RadioButton switchOn;

    @NonNull
    public final RadioGroup toggle;

    public BlockToggleSwitchElectricBinding(@NonNull LinearLayoutCompat rootView, @NonNull AppCompatImageView ivToggleSwitchBulbColor, @NonNull LinearLayoutCompat mlEleTricToogleSwitch, @NonNull RadioButton switchOff, @NonNull RadioButton switchOn, @NonNull RadioGroup toggle) {
        this.rootView = rootView;
        this.ivToggleSwitchBulbColor = ivToggleSwitchBulbColor;
        this.mlEleTricToogleSwitch = mlEleTricToogleSwitch;
        this.switchOff = switchOff;
        this.switchOn = switchOn;
        this.toggle = toggle;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }

    @NonNull
    public static BlockToggleSwitchElectricBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static BlockToggleSwitchElectricBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.block_toggle_switch_electric, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static BlockToggleSwitchElectricBinding bind(@NonNull View rootView) {
        int i = R.id.iv_toggle_switch_bulb_color;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.iv_toggle_switch_bulb_color);
        if (appCompatImageView != null) {
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) rootView;
            i = R.id.switch_off;
            RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(rootView, R.id.switch_off);
            if (radioButton != null) {
                i = R.id.switch_on;
                RadioButton radioButton2 = (RadioButton) ViewBindings.findChildViewById(rootView, R.id.switch_on);
                if (radioButton2 != null) {
                    i = R.id.toggle;
                    RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(rootView, R.id.toggle);
                    if (radioGroup != null) {
                        return new BlockToggleSwitchElectricBinding(linearLayoutCompat, appCompatImageView, linearLayoutCompat, radioButton, radioButton2, radioGroup);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
