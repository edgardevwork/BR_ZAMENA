package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;

/* loaded from: classes.dex */
public final class FuelFillItemBinding implements ViewBinding {

    @NonNull
    public final TextView ffiPriceOfFuel;

    @NonNull
    public final TextView ffiTypeOfFuel;

    @NonNull
    public final ConstraintLayout rootView;

    public FuelFillItemBinding(@NonNull ConstraintLayout rootView, @NonNull TextView ffiPriceOfFuel, @NonNull TextView ffiTypeOfFuel) {
        this.rootView = rootView;
        this.ffiPriceOfFuel = ffiPriceOfFuel;
        this.ffiTypeOfFuel = ffiTypeOfFuel;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FuelFillItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FuelFillItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fuel_fill_item, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static FuelFillItemBinding bind(@NonNull View rootView) {
        int i = R.id.ffi_price_of_fuel;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.ffi_price_of_fuel);
        if (textView != null) {
            i = R.id.ffi_type_of_fuel;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.ffi_type_of_fuel);
            if (textView2 != null) {
                return new FuelFillItemBinding((ConstraintLayout) rootView, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
