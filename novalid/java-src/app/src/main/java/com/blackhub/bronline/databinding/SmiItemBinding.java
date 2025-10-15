package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;

/* loaded from: classes3.dex */
public final class SmiItemBinding implements ViewBinding {

    @NonNull
    public final TextView nameSmiElement;

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final SwitchCompat switchSmiElement;

    public SmiItemBinding(@NonNull ConstraintLayout rootView, @NonNull TextView nameSmiElement, @NonNull SwitchCompat switchSmiElement) {
        this.rootView = rootView;
        this.nameSmiElement = nameSmiElement;
        this.switchSmiElement = switchSmiElement;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static SmiItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static SmiItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.smi_item, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static SmiItemBinding bind(@NonNull View rootView) {
        int i = R.id.name_smi_element;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.name_smi_element);
        if (textView != null) {
            i = R.id.switch_smi_element;
            SwitchCompat switchCompat = (SwitchCompat) ViewBindings.findChildViewById(rootView, R.id.switch_smi_element);
            if (switchCompat != null) {
                return new SmiItemBinding((ConstraintLayout) rootView, textView, switchCompat);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
