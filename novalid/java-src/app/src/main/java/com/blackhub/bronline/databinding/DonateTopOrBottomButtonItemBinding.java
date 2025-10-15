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

/* loaded from: classes2.dex */
public final class DonateTopOrBottomButtonItemBinding implements ViewBinding {

    @NonNull
    public final TextView buttonTitle;

    @NonNull
    public final RelativeLayout rootView;

    public DonateTopOrBottomButtonItemBinding(@NonNull RelativeLayout rootView, @NonNull TextView buttonTitle) {
        this.rootView = rootView;
        this.buttonTitle = buttonTitle;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static DonateTopOrBottomButtonItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static DonateTopOrBottomButtonItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.donate_top_or_bottom_button_item, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static DonateTopOrBottomButtonItemBinding bind(@NonNull View rootView) {
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.buttonTitle);
        if (textView != null) {
            return new DonateTopOrBottomButtonItemBinding((RelativeLayout) rootView, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.buttonTitle)));
    }
}
