package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;

/* loaded from: classes.dex */
public final class FractionMainMenuLayoutBinding implements ViewBinding {

    @NonNull
    public final CardView cardViewFractionTasks;

    @NonNull
    public final ImageButton imageButtonFractionsTasks;

    @NonNull
    public final RecyclerView recyclerView;

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final TextView textViewFractionTasks;

    @NonNull
    public final TextView textViewProgressInOrganisation;

    public FractionMainMenuLayoutBinding(@NonNull ConstraintLayout rootView, @NonNull CardView cardViewFractionTasks, @NonNull ImageButton imageButtonFractionsTasks, @NonNull RecyclerView recyclerView, @NonNull TextView textViewFractionTasks, @NonNull TextView textViewProgressInOrganisation) {
        this.rootView = rootView;
        this.cardViewFractionTasks = cardViewFractionTasks;
        this.imageButtonFractionsTasks = imageButtonFractionsTasks;
        this.recyclerView = recyclerView;
        this.textViewFractionTasks = textViewFractionTasks;
        this.textViewProgressInOrganisation = textViewProgressInOrganisation;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FractionMainMenuLayoutBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FractionMainMenuLayoutBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fraction_main_menu_layout, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static FractionMainMenuLayoutBinding bind(@NonNull View rootView) {
        int i = R.id.card_view_fraction_tasks;
        CardView cardView = (CardView) ViewBindings.findChildViewById(rootView, R.id.card_view_fraction_tasks);
        if (cardView != null) {
            i = R.id.image_button_fractions_tasks;
            ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.image_button_fractions_tasks);
            if (imageButton != null) {
                i = R.id.recyclerView;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.recyclerView);
                if (recyclerView != null) {
                    i = R.id.text_view_fraction_tasks;
                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_view_fraction_tasks);
                    if (textView != null) {
                        i = R.id.text_view_progress_in_organisation;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_view_progress_in_organisation);
                        if (textView2 != null) {
                            return new FractionMainMenuLayoutBinding((ConstraintLayout) rootView, cardView, imageButton, recyclerView, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
