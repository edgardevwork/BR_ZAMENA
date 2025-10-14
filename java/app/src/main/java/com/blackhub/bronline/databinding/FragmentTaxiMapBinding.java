package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.blackhub.bronline.game.gui.taximap.TaxiMapViewModel;
import com.bless.client.R;

/* loaded from: classes2.dex */
public abstract class FragmentTaxiMapBinding extends ViewDataBinding {

    @NonNull
    public final ImageView brTaxiMapDest;

    @NonNull
    public final Button brTaxiMapExit;

    @NonNull
    public final RelativeLayout brTaxiMapMap;

    @NonNull
    public final Button brTaxiMapSelect;

    @Bindable
    public TaxiMapViewModel mVm;

    public abstract void setVm(@Nullable TaxiMapViewModel vm);

    public FragmentTaxiMapBinding(Object _bindingComponent, View _root, int _localFieldCount, ImageView brTaxiMapDest, Button brTaxiMapExit, RelativeLayout brTaxiMapMap, Button brTaxiMapSelect) {
        super(_bindingComponent, _root, _localFieldCount);
        this.brTaxiMapDest = brTaxiMapDest;
        this.brTaxiMapExit = brTaxiMapExit;
        this.brTaxiMapMap = brTaxiMapMap;
        this.brTaxiMapSelect = brTaxiMapSelect;
    }

    @Nullable
    public TaxiMapViewModel getVm() {
        return this.mVm;
    }

    @NonNull
    public static FragmentTaxiMapBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentTaxiMapBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (FragmentTaxiMapBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_taxi_map, root, attachToRoot, component);
    }

    @NonNull
    public static FragmentTaxiMapBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentTaxiMapBinding inflate(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (FragmentTaxiMapBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_taxi_map, null, false, component);
    }

    public static FragmentTaxiMapBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentTaxiMapBinding bind(@NonNull View view, @Nullable Object component) {
        return (FragmentTaxiMapBinding) ViewDataBinding.bind(component, view, R.layout.fragment_taxi_map);
    }
}
