package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;

/* loaded from: classes.dex */
public final class InventoryDialogValueApplyBinding implements ViewBinding {

    @NonNull
    public final View dialogValueApplyBgEffect;

    @NonNull
    public final View dialogValueApplyBgView;

    @NonNull
    public final AppCompatButton dialogValueApplyButtonApply;

    @NonNull
    public final ImageView dialogValueApplyButtonClose;

    @NonNull
    public final ImageView dialogValueApplyItemsIcon;

    @NonNull
    public final TextView dialogValueApplyMaxValue;

    @NonNull
    public final TextView dialogValueApplyMinValue;

    @NonNull
    public final SeekBar dialogValueApplySeekbarWithValue;

    @NonNull
    public final TextView dialogValueApplyTitleItem;

    @NonNull
    public final ConstraintLayout rootView;

    public InventoryDialogValueApplyBinding(@NonNull ConstraintLayout rootView, @NonNull View dialogValueApplyBgEffect, @NonNull View dialogValueApplyBgView, @NonNull AppCompatButton dialogValueApplyButtonApply, @NonNull ImageView dialogValueApplyButtonClose, @NonNull ImageView dialogValueApplyItemsIcon, @NonNull TextView dialogValueApplyMaxValue, @NonNull TextView dialogValueApplyMinValue, @NonNull SeekBar dialogValueApplySeekbarWithValue, @NonNull TextView dialogValueApplyTitleItem) {
        this.rootView = rootView;
        this.dialogValueApplyBgEffect = dialogValueApplyBgEffect;
        this.dialogValueApplyBgView = dialogValueApplyBgView;
        this.dialogValueApplyButtonApply = dialogValueApplyButtonApply;
        this.dialogValueApplyButtonClose = dialogValueApplyButtonClose;
        this.dialogValueApplyItemsIcon = dialogValueApplyItemsIcon;
        this.dialogValueApplyMaxValue = dialogValueApplyMaxValue;
        this.dialogValueApplyMinValue = dialogValueApplyMinValue;
        this.dialogValueApplySeekbarWithValue = dialogValueApplySeekbarWithValue;
        this.dialogValueApplyTitleItem = dialogValueApplyTitleItem;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static InventoryDialogValueApplyBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static InventoryDialogValueApplyBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.inventory_dialog_value_apply, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static InventoryDialogValueApplyBinding bind(@NonNull View rootView) {
        int i = R.id.dialog_value_apply_bg_effect;
        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.dialog_value_apply_bg_effect);
        if (viewFindChildViewById != null) {
            i = R.id.dialog_value_apply_bg_view;
            View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.dialog_value_apply_bg_view);
            if (viewFindChildViewById2 != null) {
                i = R.id.dialog_value_apply_button_apply;
                AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.dialog_value_apply_button_apply);
                if (appCompatButton != null) {
                    i = R.id.dialog_value_apply_button_close;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.dialog_value_apply_button_close);
                    if (imageView != null) {
                        i = R.id.dialog_value_apply_items_icon;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.dialog_value_apply_items_icon);
                        if (imageView2 != null) {
                            i = R.id.dialog_value_apply_max_value;
                            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.dialog_value_apply_max_value);
                            if (textView != null) {
                                i = R.id.dialog_value_apply_min_value;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.dialog_value_apply_min_value);
                                if (textView2 != null) {
                                    i = R.id.dialog_value_apply_seekbar_with_value;
                                    SeekBar seekBar = (SeekBar) ViewBindings.findChildViewById(rootView, R.id.dialog_value_apply_seekbar_with_value);
                                    if (seekBar != null) {
                                        i = R.id.dialog_value_apply_title_item;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.dialog_value_apply_title_item);
                                        if (textView3 != null) {
                                            return new InventoryDialogValueApplyBinding((ConstraintLayout) rootView, viewFindChildViewById, viewFindChildViewById2, appCompatButton, imageView, imageView2, textView, textView2, seekBar, textView3);
                                        }
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
