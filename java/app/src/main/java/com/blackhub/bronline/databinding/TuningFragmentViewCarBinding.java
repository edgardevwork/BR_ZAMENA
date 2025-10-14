package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;

/* loaded from: classes3.dex */
public final class TuningFragmentViewCarBinding implements ViewBinding {

    @NonNull
    public final AppCompatButton backMenuView;

    @NonNull
    public final ImageView buttonDoorView;

    @NonNull
    public final ImageView buttonLightView;

    @NonNull
    public final LinearLayout containerSwitchView;

    @NonNull
    public final RelativeLayout rootView;

    public TuningFragmentViewCarBinding(@NonNull RelativeLayout rootView, @NonNull AppCompatButton backMenuView, @NonNull ImageView buttonDoorView, @NonNull ImageView buttonLightView, @NonNull LinearLayout containerSwitchView) {
        this.rootView = rootView;
        this.backMenuView = backMenuView;
        this.buttonDoorView = buttonDoorView;
        this.buttonLightView = buttonLightView;
        this.containerSwitchView = containerSwitchView;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static TuningFragmentViewCarBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static TuningFragmentViewCarBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.tuning_fragment_view_car, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static TuningFragmentViewCarBinding bind(@NonNull View rootView) {
        int i = R.id.back_menu_view;
        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.back_menu_view);
        if (appCompatButton != null) {
            i = R.id.button_door_view;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.button_door_view);
            if (imageView != null) {
                i = R.id.button_light_view;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.button_light_view);
                if (imageView2 != null) {
                    i = R.id.container_switch_view;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.container_switch_view);
                    if (linearLayout != null) {
                        return new TuningFragmentViewCarBinding((RelativeLayout) rootView, appCompatButton, imageView, imageView2, linearLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
