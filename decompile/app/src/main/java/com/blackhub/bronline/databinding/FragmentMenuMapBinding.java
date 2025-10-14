package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;

/* loaded from: classes.dex */
public final class FragmentMenuMapBinding implements ViewBinding {

    @NonNull
    public final AppCompatButton newMenuMapButtonBackToMenu;

    @NonNull
    public final ConstraintLayout rootView;

    public FragmentMenuMapBinding(@NonNull ConstraintLayout rootView, @NonNull AppCompatButton newMenuMapButtonBackToMenu) {
        this.rootView = rootView;
        this.newMenuMapButtonBackToMenu = newMenuMapButtonBackToMenu;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FragmentMenuMapBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentMenuMapBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_menu_map, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static FragmentMenuMapBinding bind(@NonNull View rootView) {
        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.new_menu_map_button_back_to_menu);
        if (appCompatButton != null) {
            return new FragmentMenuMapBinding((ConstraintLayout) rootView, appCompatButton);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.new_menu_map_button_back_to_menu)));
    }
}
