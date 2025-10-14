package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;

/* loaded from: classes.dex */
public final class FamiliesTopPresentItemBinding implements ViewBinding {

    @NonNull
    public final TextView presentTitle;

    @NonNull
    public final TextView presentValue;

    @NonNull
    public final LinearLayout rootView;

    public FamiliesTopPresentItemBinding(@NonNull LinearLayout rootView, @NonNull TextView presentTitle, @NonNull TextView presentValue) {
        this.rootView = rootView;
        this.presentTitle = presentTitle;
        this.presentValue = presentValue;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FamiliesTopPresentItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FamiliesTopPresentItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.families_top_present_item, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static FamiliesTopPresentItemBinding bind(@NonNull View rootView) {
        int i = R.id.present_title;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.present_title);
        if (textView != null) {
            i = R.id.present_value;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.present_value);
            if (textView2 != null) {
                return new FamiliesTopPresentItemBinding((LinearLayout) rootView, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
