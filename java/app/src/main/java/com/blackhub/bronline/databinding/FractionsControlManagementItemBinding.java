package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;

/* loaded from: classes.dex */
public final class FractionsControlManagementItemBinding implements ViewBinding {

    @NonNull
    public final ImageButton imageButtonMinus;

    @NonNull
    public final ImageButton imageButtonPlus;

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final TextView textViewChangingParameter;

    @NonNull
    public final TextView textViewChangingParameterTitle;

    public FractionsControlManagementItemBinding(@NonNull ConstraintLayout rootView, @NonNull ImageButton imageButtonMinus, @NonNull ImageButton imageButtonPlus, @NonNull TextView textViewChangingParameter, @NonNull TextView textViewChangingParameterTitle) {
        this.rootView = rootView;
        this.imageButtonMinus = imageButtonMinus;
        this.imageButtonPlus = imageButtonPlus;
        this.textViewChangingParameter = textViewChangingParameter;
        this.textViewChangingParameterTitle = textViewChangingParameterTitle;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FractionsControlManagementItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FractionsControlManagementItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fractions_control_management_item, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static FractionsControlManagementItemBinding bind(@NonNull View rootView) {
        int i = R.id.image_button_minus;
        ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.image_button_minus);
        if (imageButton != null) {
            i = R.id.image_button_plus;
            ImageButton imageButton2 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.image_button_plus);
            if (imageButton2 != null) {
                i = R.id.text_view_changing_parameter;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_view_changing_parameter);
                if (textView != null) {
                    i = R.id.text_view_changing_parameter_title;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_view_changing_parameter_title);
                    if (textView2 != null) {
                        return new FractionsControlManagementItemBinding((ConstraintLayout) rootView, imageButton, imageButton2, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
