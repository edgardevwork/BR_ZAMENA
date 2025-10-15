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
public final class ItemNewMenuSettingMainTitleBinding implements ViewBinding {

    @NonNull
    public final TextView newMenuSettingMainTitleText;

    @NonNull
    public final LinearLayout rootView;

    public ItemNewMenuSettingMainTitleBinding(@NonNull LinearLayout rootView, @NonNull TextView newMenuSettingMainTitleText) {
        this.rootView = rootView;
        this.newMenuSettingMainTitleText = newMenuSettingMainTitleText;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemNewMenuSettingMainTitleBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemNewMenuSettingMainTitleBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_new_menu_setting_main_title, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static ItemNewMenuSettingMainTitleBinding bind(@NonNull View rootView) {
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.new_menu_setting_main_title_text);
        if (textView != null) {
            return new ItemNewMenuSettingMainTitleBinding((LinearLayout) rootView, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.new_menu_setting_main_title_text)));
    }
}
