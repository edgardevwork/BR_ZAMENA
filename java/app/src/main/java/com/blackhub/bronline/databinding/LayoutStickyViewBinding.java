package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.bless.client.R;

/* loaded from: classes3.dex */
public final class LayoutStickyViewBinding implements ViewBinding {

    @NonNull
    public final TextView rootView;

    @NonNull
    public final TextView stickyView;

    public LayoutStickyViewBinding(@NonNull TextView rootView, @NonNull TextView stickyView) {
        this.rootView = rootView;
        this.stickyView = stickyView;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public TextView getRoot() {
        return this.rootView;
    }

    @NonNull
    public static LayoutStickyViewBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static LayoutStickyViewBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.layout_sticky_view, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static LayoutStickyViewBinding bind(@NonNull View rootView) {
        if (rootView == null) {
            throw new NullPointerException("rootView");
        }
        TextView textView = (TextView) rootView;
        return new LayoutStickyViewBinding(textView, textView);
    }
}
