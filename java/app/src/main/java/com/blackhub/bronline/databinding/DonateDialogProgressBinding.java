package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;


public final class DonateDialogProgressBinding implements ViewBinding {

    @NonNull
    public final ProgressBar loader;

    @NonNull
    public final LinearLayout rootView;

    public DonateDialogProgressBinding(@NonNull LinearLayout rootView, @NonNull ProgressBar loader) {
        this.rootView = rootView;
        this.loader = loader;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static DonateDialogProgressBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static DonateDialogProgressBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.donate_dialog_progress, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static DonateDialogProgressBinding bind(@NonNull View rootView) {
        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.loader);
        if (progressBar != null) {
            return new DonateDialogProgressBinding((LinearLayout) rootView, progressBar);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.loader)));
    }
}
