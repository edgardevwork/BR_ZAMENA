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


public final class DonateServicesItemBinding implements ViewBinding {

    @NonNull
    public final TextView donateServicesItemButtonLeft;

    @NonNull
    public final TextView donateServicesItemButtonRight;

    @NonNull
    public final TextView donateServicesItemSales;

    @NonNull
    public final ConstraintLayout rootView;

    public DonateServicesItemBinding(@NonNull ConstraintLayout rootView, @NonNull TextView donateServicesItemButtonLeft, @NonNull TextView donateServicesItemButtonRight, @NonNull TextView donateServicesItemSales) {
        this.rootView = rootView;
        this.donateServicesItemButtonLeft = donateServicesItemButtonLeft;
        this.donateServicesItemButtonRight = donateServicesItemButtonRight;
        this.donateServicesItemSales = donateServicesItemSales;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static DonateServicesItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static DonateServicesItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.donate_services_item, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static DonateServicesItemBinding bind(@NonNull View rootView) {
        int i = R.id.donate_services_item_button_left;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.donate_services_item_button_left);
        if (textView != null) {
            i = R.id.donate_services_item_button_right;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.donate_services_item_button_right);
            if (textView2 != null) {
                i = R.id.donate_services_item_sales;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.donate_services_item_sales);
                if (textView3 != null) {
                    return new DonateServicesItemBinding((ConstraintLayout) rootView, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
