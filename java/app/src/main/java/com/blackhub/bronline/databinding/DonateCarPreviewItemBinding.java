package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;


public final class DonateCarPreviewItemBinding implements ViewBinding {

    @NonNull
    public final AppCompatButton border;

    @NonNull
    public final View color;

    @NonNull
    public final TextView free;

    @NonNull
    public final TextView paid;

    @NonNull
    public final ConstraintLayout rootView;

    public DonateCarPreviewItemBinding(@NonNull ConstraintLayout rootView, @NonNull AppCompatButton border, @NonNull View color, @NonNull TextView free, @NonNull TextView paid) {
        this.rootView = rootView;
        this.border = border;
        this.color = color;
        this.free = free;
        this.paid = paid;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static DonateCarPreviewItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static DonateCarPreviewItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.donate_car_preview_item, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static DonateCarPreviewItemBinding bind(@NonNull View rootView) {
        int i = R.id.border;
        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.border);
        if (appCompatButton != null) {
            i = R.id.color;
            View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.color);
            if (viewFindChildViewById != null) {
                i = R.id.free;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.free);
                if (textView != null) {
                    i = R.id.paid;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.paid);
                    if (textView2 != null) {
                        return new DonateCarPreviewItemBinding((ConstraintLayout) rootView, appCompatButton, viewFindChildViewById, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
