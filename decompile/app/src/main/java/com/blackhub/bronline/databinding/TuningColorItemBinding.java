package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;

/* loaded from: classes3.dex */
public final class TuningColorItemBinding implements ViewBinding {

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final View tuningColorItemBorder;

    @NonNull
    public final View tuningColorItemCheckedStartColor;

    @NonNull
    public final View tuningColorItemColor;

    public TuningColorItemBinding(@NonNull ConstraintLayout rootView, @NonNull View tuningColorItemBorder, @NonNull View tuningColorItemCheckedStartColor, @NonNull View tuningColorItemColor) {
        this.rootView = rootView;
        this.tuningColorItemBorder = tuningColorItemBorder;
        this.tuningColorItemCheckedStartColor = tuningColorItemCheckedStartColor;
        this.tuningColorItemColor = tuningColorItemColor;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static TuningColorItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static TuningColorItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.tuning_color_item, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static TuningColorItemBinding bind(@NonNull View rootView) {
        int i = R.id.tuning_color_item_border;
        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.tuning_color_item_border);
        if (viewFindChildViewById != null) {
            i = R.id.tuning_color_item_checked_start_color;
            View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.tuning_color_item_checked_start_color);
            if (viewFindChildViewById2 != null) {
                i = R.id.tuning_color_item_color;
                View viewFindChildViewById3 = ViewBindings.findChildViewById(rootView, R.id.tuning_color_item_color);
                if (viewFindChildViewById3 != null) {
                    return new TuningColorItemBinding((ConstraintLayout) rootView, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
