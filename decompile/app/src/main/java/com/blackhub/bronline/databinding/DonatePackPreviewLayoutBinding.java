package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;

/* loaded from: classes2.dex */
public final class DonatePackPreviewLayoutBinding implements ViewBinding {

    @NonNull
    public final AppCompatButton button;

    @NonNull
    public final AppCompatButton donateButtonBack;

    @NonNull
    public final RecyclerView donatePackRV;

    @NonNull
    public final TextView header;

    @NonNull
    public final ImageView image;

    @NonNull
    public final RelativeLayout listFl1;

    @NonNull
    public final LinearLayout listLl1;

    @NonNull
    public final FrameLayout rootView;

    @NonNull
    public final TextView strokedPrice;

    public DonatePackPreviewLayoutBinding(@NonNull FrameLayout rootView, @NonNull AppCompatButton button, @NonNull AppCompatButton donateButtonBack, @NonNull RecyclerView donatePackRV, @NonNull TextView header, @NonNull ImageView image, @NonNull RelativeLayout listFl1, @NonNull LinearLayout listLl1, @NonNull TextView strokedPrice) {
        this.rootView = rootView;
        this.button = button;
        this.donateButtonBack = donateButtonBack;
        this.donatePackRV = donatePackRV;
        this.header = header;
        this.image = image;
        this.listFl1 = listFl1;
        this.listLl1 = listLl1;
        this.strokedPrice = strokedPrice;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static DonatePackPreviewLayoutBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static DonatePackPreviewLayoutBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.donate_pack_preview_layout, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static DonatePackPreviewLayoutBinding bind(@NonNull View rootView) {
        int i = R.id.button;
        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.button);
        if (appCompatButton != null) {
            i = R.id.donateButtonBack;
            AppCompatButton appCompatButton2 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.donateButtonBack);
            if (appCompatButton2 != null) {
                i = R.id.donatePackRV;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.donatePackRV);
                if (recyclerView != null) {
                    i = R.id.header;
                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.header);
                    if (textView != null) {
                        i = R.id.image;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.image);
                        if (imageView != null) {
                            i = R.id.list_fl_1;
                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.list_fl_1);
                            if (relativeLayout != null) {
                                i = R.id.list_ll_1;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.list_ll_1);
                                if (linearLayout != null) {
                                    i = R.id.strokedPrice;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.strokedPrice);
                                    if (textView2 != null) {
                                        return new DonatePackPreviewLayoutBinding((FrameLayout) rootView, appCompatButton, appCompatButton2, recyclerView, textView, imageView, relativeLayout, linearLayout, textView2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
