package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;

/* loaded from: classes3.dex */
public final class TuningFragmentTypeListBinding implements ViewBinding {

    @NonNull
    public final AppCompatButton buttonViewCarType;

    @NonNull
    public final RecyclerView recvTypeTuningList;

    @NonNull
    public final RelativeLayout rootView;

    @NonNull
    public final RelativeLayout typeViewMain;

    public TuningFragmentTypeListBinding(@NonNull RelativeLayout rootView, @NonNull AppCompatButton buttonViewCarType, @NonNull RecyclerView recvTypeTuningList, @NonNull RelativeLayout typeViewMain) {
        this.rootView = rootView;
        this.buttonViewCarType = buttonViewCarType;
        this.recvTypeTuningList = recvTypeTuningList;
        this.typeViewMain = typeViewMain;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static TuningFragmentTypeListBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static TuningFragmentTypeListBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.tuning_fragment_type_list, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static TuningFragmentTypeListBinding bind(@NonNull View rootView) {
        int i = R.id.button_view_car_type;
        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.button_view_car_type);
        if (appCompatButton != null) {
            i = R.id.recv_type_tuning_list;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.recv_type_tuning_list);
            if (recyclerView != null) {
                RelativeLayout relativeLayout = (RelativeLayout) rootView;
                return new TuningFragmentTypeListBinding(relativeLayout, appCompatButton, recyclerView, relativeLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
