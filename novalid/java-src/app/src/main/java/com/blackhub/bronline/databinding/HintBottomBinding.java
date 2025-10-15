package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;

/* loaded from: classes.dex */
public final class HintBottomBinding implements ViewBinding {

    @NonNull
    public final TextView headerHint;

    @NonNull
    public final RelativeLayout rootView;

    @NonNull
    public final TextView textHint;

    public HintBottomBinding(@NonNull RelativeLayout rootView, @NonNull TextView headerHint, @NonNull TextView textHint) {
        this.rootView = rootView;
        this.headerHint = headerHint;
        this.textHint = textHint;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static HintBottomBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static HintBottomBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.hint_bottom, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static HintBottomBinding bind(@NonNull View rootView) {
        int i = R.id.header_hint;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.header_hint);
        if (textView != null) {
            i = R.id.text_hint;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_hint);
            if (textView2 != null) {
                return new HintBottomBinding((RelativeLayout) rootView, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
