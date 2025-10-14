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

/* loaded from: classes3.dex */
public final class UncleCallBinding implements ViewBinding {

    @NonNull
    public final ImageView hintCall;

    @NonNull
    public final ImageView imageView13;

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final TextView textView21;

    public UncleCallBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView hintCall, @NonNull ImageView imageView13, @NonNull TextView textView21) {
        this.rootView = rootView;
        this.hintCall = hintCall;
        this.imageView13 = imageView13;
        this.textView21 = textView21;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static UncleCallBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static UncleCallBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.uncle_call, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static UncleCallBinding bind(@NonNull View rootView) {
        int i = R.id.hint_call;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.hint_call);
        if (imageView != null) {
            i = R.id.imageView13;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.imageView13);
            if (imageView2 != null) {
                i = R.id.textView21;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.textView21);
                if (textView != null) {
                    return new UncleCallBinding((ConstraintLayout) rootView, imageView, imageView2, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
