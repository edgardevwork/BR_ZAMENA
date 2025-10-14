package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;

/* loaded from: classes3.dex */
public final class TuningSubmenuItemBinding implements ViewBinding {

    @NonNull
    public final ImageView bgSubmenuItem;

    @NonNull
    public final ImageView iconSubmenuItem;

    @NonNull
    public final TextView nameSubmenuItem;

    @NonNull
    public final RelativeLayout rootView;

    public TuningSubmenuItemBinding(@NonNull RelativeLayout rootView, @NonNull ImageView bgSubmenuItem, @NonNull ImageView iconSubmenuItem, @NonNull TextView nameSubmenuItem) {
        this.rootView = rootView;
        this.bgSubmenuItem = bgSubmenuItem;
        this.iconSubmenuItem = iconSubmenuItem;
        this.nameSubmenuItem = nameSubmenuItem;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static TuningSubmenuItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static TuningSubmenuItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.tuning_submenu_item, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static TuningSubmenuItemBinding bind(@NonNull View rootView) {
        int i = R.id.bg_submenu_item;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.bg_submenu_item);
        if (imageView != null) {
            i = R.id.icon_submenu_item;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.icon_submenu_item);
            if (imageView2 != null) {
                i = R.id.name_submenu_item;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.name_submenu_item);
                if (textView != null) {
                    return new TuningSubmenuItemBinding((RelativeLayout) rootView, imageView, imageView2, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
