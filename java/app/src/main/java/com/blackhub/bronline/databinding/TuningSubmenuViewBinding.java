package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;

/* loaded from: classes3.dex */
public final class TuningSubmenuViewBinding implements ViewBinding {

    @NonNull
    public final RecyclerView recvSubmenuItems;

    @NonNull
    public final LinearLayout rootView;

    @NonNull
    public final AppCompatButton tuningSubmenuClose;

    @NonNull
    public final TextView tuningSubmenuTitle;

    @NonNull
    public final View underline;

    public TuningSubmenuViewBinding(@NonNull LinearLayout rootView, @NonNull RecyclerView recvSubmenuItems, @NonNull AppCompatButton tuningSubmenuClose, @NonNull TextView tuningSubmenuTitle, @NonNull View underline) {
        this.rootView = rootView;
        this.recvSubmenuItems = recvSubmenuItems;
        this.tuningSubmenuClose = tuningSubmenuClose;
        this.tuningSubmenuTitle = tuningSubmenuTitle;
        this.underline = underline;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static TuningSubmenuViewBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static TuningSubmenuViewBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.tuning_submenu_view, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static TuningSubmenuViewBinding bind(@NonNull View rootView) {
        int i = R.id.recv_submenu_items;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.recv_submenu_items);
        if (recyclerView != null) {
            i = R.id.tuning_submenu_close;
            AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.tuning_submenu_close);
            if (appCompatButton != null) {
                i = R.id.tuning_submenu_title;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tuning_submenu_title);
                if (textView != null) {
                    i = R.id.underline;
                    View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.underline);
                    if (viewFindChildViewById != null) {
                        return new TuningSubmenuViewBinding((LinearLayout) rootView, recyclerView, appCompatButton, textView, viewFindChildViewById);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
