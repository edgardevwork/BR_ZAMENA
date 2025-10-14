package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;


public final class DonatePackPreviewItemNewBinding implements ViewBinding {

    @NonNull
    public final FrameLayout rootView;

    @NonNull
    public final TextView textView;

    public DonatePackPreviewItemNewBinding(@NonNull FrameLayout rootView, @NonNull TextView textView) {
        this.rootView = rootView;
        this.textView = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static DonatePackPreviewItemNewBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static DonatePackPreviewItemNewBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.donate_pack_preview_item_new, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static DonatePackPreviewItemNewBinding bind(@NonNull View rootView) {
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_view);
        if (textView != null) {
            return new DonatePackPreviewItemNewBinding((FrameLayout) rootView, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.text_view)));
    }
}
