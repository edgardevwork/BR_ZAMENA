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

/* loaded from: classes3.dex */
public final class TuningTypeItemBinding implements ViewBinding {

    @NonNull
    public final View bgClickTitle;

    @NonNull
    public final View bgTitleTypeTuning;

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final TextView titleTypeTuning;

    public TuningTypeItemBinding(@NonNull ConstraintLayout rootView, @NonNull View bgClickTitle, @NonNull View bgTitleTypeTuning, @NonNull TextView titleTypeTuning) {
        this.rootView = rootView;
        this.bgClickTitle = bgClickTitle;
        this.bgTitleTypeTuning = bgTitleTypeTuning;
        this.titleTypeTuning = titleTypeTuning;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static TuningTypeItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static TuningTypeItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.tuning_type_item, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static TuningTypeItemBinding bind(@NonNull View rootView) {
        int i = R.id.bg_click_title;
        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.bg_click_title);
        if (viewFindChildViewById != null) {
            i = R.id.bg_title_type_tuning;
            View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.bg_title_type_tuning);
            if (viewFindChildViewById2 != null) {
                i = R.id.title_type_tuning;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.title_type_tuning);
                if (textView != null) {
                    return new TuningTypeItemBinding((ConstraintLayout) rootView, viewFindChildViewById, viewFindChildViewById2, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
