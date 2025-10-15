package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;

/* loaded from: classes.dex */
public final class FamiliesMenuRankOrColorItemBinding implements ViewBinding {

    @NonNull
    public final View color;

    @NonNull
    public final View colorsBorder;

    @NonNull
    public final ImageView ifCurrentColor;

    @NonNull
    public final SwitchCompat rankAccessSwitch;

    @NonNull
    public final ImageView renameRank;

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final TextView valueMenu1;

    @NonNull
    public final TextView valueMenu2;

    public FamiliesMenuRankOrColorItemBinding(@NonNull ConstraintLayout rootView, @NonNull View color, @NonNull View colorsBorder, @NonNull ImageView ifCurrentColor, @NonNull SwitchCompat rankAccessSwitch, @NonNull ImageView renameRank, @NonNull TextView valueMenu1, @NonNull TextView valueMenu2) {
        this.rootView = rootView;
        this.color = color;
        this.colorsBorder = colorsBorder;
        this.ifCurrentColor = ifCurrentColor;
        this.rankAccessSwitch = rankAccessSwitch;
        this.renameRank = renameRank;
        this.valueMenu1 = valueMenu1;
        this.valueMenu2 = valueMenu2;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FamiliesMenuRankOrColorItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FamiliesMenuRankOrColorItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.families_menu_rank_or_color_item, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static FamiliesMenuRankOrColorItemBinding bind(@NonNull View rootView) {
        int i = R.id.color;
        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.color);
        if (viewFindChildViewById != null) {
            i = R.id.colors_border;
            View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.colors_border);
            if (viewFindChildViewById2 != null) {
                i = R.id.if_current_color;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.if_current_color);
                if (imageView != null) {
                    i = R.id.rank_access_switch;
                    SwitchCompat switchCompat = (SwitchCompat) ViewBindings.findChildViewById(rootView, R.id.rank_access_switch);
                    if (switchCompat != null) {
                        i = R.id.rename_rank;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.rename_rank);
                        if (imageView2 != null) {
                            i = R.id.value_menu_1;
                            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.value_menu_1);
                            if (textView != null) {
                                i = R.id.value_menu_2;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.value_menu_2);
                                if (textView2 != null) {
                                    return new FamiliesMenuRankOrColorItemBinding((ConstraintLayout) rootView, viewFindChildViewById, viewFindChildViewById2, imageView, switchCompat, imageView2, textView, textView2);
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
