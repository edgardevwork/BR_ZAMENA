package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;

/* loaded from: classes3.dex */
public final class SpawnLocationLayoutBinding implements ViewBinding {

    @NonNull
    public final AppCompatButton buttonEnter;

    @NonNull
    public final CoordinatorLayout coordinatorForSnackbar;

    @NonNull
    public final RecyclerView recyclerViewSpawnLocation;

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final TextView tvSpawnPlace;

    public SpawnLocationLayoutBinding(@NonNull ConstraintLayout rootView, @NonNull AppCompatButton buttonEnter, @NonNull CoordinatorLayout coordinatorForSnackbar, @NonNull RecyclerView recyclerViewSpawnLocation, @NonNull TextView tvSpawnPlace) {
        this.rootView = rootView;
        this.buttonEnter = buttonEnter;
        this.coordinatorForSnackbar = coordinatorForSnackbar;
        this.recyclerViewSpawnLocation = recyclerViewSpawnLocation;
        this.tvSpawnPlace = tvSpawnPlace;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static SpawnLocationLayoutBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static SpawnLocationLayoutBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.spawn_location_layout, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static SpawnLocationLayoutBinding bind(@NonNull View rootView) {
        int i = R.id.button_enter;
        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.button_enter);
        if (appCompatButton != null) {
            i = R.id.coordinator_for_snackbar;
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ViewBindings.findChildViewById(rootView, R.id.coordinator_for_snackbar);
            if (coordinatorLayout != null) {
                i = R.id.recycler_view_spawn_location;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.recycler_view_spawn_location);
                if (recyclerView != null) {
                    i = R.id.tv_spawn_place;
                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_spawn_place);
                    if (textView != null) {
                        return new SpawnLocationLayoutBinding((ConstraintLayout) rootView, appCompatButton, coordinatorLayout, recyclerView, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
