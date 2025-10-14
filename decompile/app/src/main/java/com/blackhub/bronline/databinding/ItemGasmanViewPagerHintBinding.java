package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;

/* loaded from: classes.dex */
public final class ItemGasmanViewPagerHintBinding implements ViewBinding {

    @NonNull
    public final ImageView ivExample;

    @NonNull
    public final ConstraintLayout rootView;

    /* renamed from: tv */
    @NonNull
    public final TextView f382tv;

    public ItemGasmanViewPagerHintBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView ivExample, @NonNull TextView tv) {
        this.rootView = rootView;
        this.ivExample = ivExample;
        this.f382tv = tv;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemGasmanViewPagerHintBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemGasmanViewPagerHintBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_gasman_view_pager_hint, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static ItemGasmanViewPagerHintBinding bind(@NonNull View rootView) {
        int i = R.id.ivExample;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.ivExample);
        if (imageView != null) {
            i = R.id.f481tv;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.f481tv);
            if (textView != null) {
                return new ItemGasmanViewPagerHintBinding((ConstraintLayout) rootView, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
