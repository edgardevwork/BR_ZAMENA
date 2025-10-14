package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;


public final class DonateServicesLayoutBinding implements ViewBinding {

    @NonNull
    public final RecyclerView donateServiceCurrentItem;

    @NonNull
    public final RecyclerView donateServicesRV;

    @NonNull
    public final LinearLayout listLl1;

    @NonNull
    public final LinearLayout rootView;

    public DonateServicesLayoutBinding(@NonNull LinearLayout rootView, @NonNull RecyclerView donateServiceCurrentItem, @NonNull RecyclerView donateServicesRV, @NonNull LinearLayout listLl1) {
        this.rootView = rootView;
        this.donateServiceCurrentItem = donateServiceCurrentItem;
        this.donateServicesRV = donateServicesRV;
        this.listLl1 = listLl1;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static DonateServicesLayoutBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static DonateServicesLayoutBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.donate_services_layout, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static DonateServicesLayoutBinding bind(@NonNull View rootView) {
        int i = R.id.donate_service_current_item;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.donate_service_current_item);
        if (recyclerView != null) {
            i = R.id.donateServicesRV;
            RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.donateServicesRV);
            if (recyclerView2 != null) {
                i = R.id.list_ll_1;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.list_ll_1);
                if (linearLayout != null) {
                    return new DonateServicesLayoutBinding((LinearLayout) rootView, recyclerView, recyclerView2, linearLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
