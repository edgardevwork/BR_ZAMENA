package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;

/* loaded from: classes.dex */
public final class DrivingSchoolSignInfoItemBinding implements ViewBinding {

    @NonNull
    public final View blockWithLeftSign;

    @NonNull
    public final View blockWithRightSign;

    @NonNull
    public final View dividerHorizontalUnderline;

    @NonNull
    public final ImageView iconSingLeft;

    @NonNull
    public final ImageView iconSingRight;

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final TextView textSignLeft;

    @NonNull
    public final TextView textSignRight;

    @NonNull
    public final TextView titleSignLeft;

    @NonNull
    public final TextView titleSignRight;

    public DrivingSchoolSignInfoItemBinding(@NonNull ConstraintLayout rootView, @NonNull View blockWithLeftSign, @NonNull View blockWithRightSign, @NonNull View dividerHorizontalUnderline, @NonNull ImageView iconSingLeft, @NonNull ImageView iconSingRight, @NonNull TextView textSignLeft, @NonNull TextView textSignRight, @NonNull TextView titleSignLeft, @NonNull TextView titleSignRight) {
        this.rootView = rootView;
        this.blockWithLeftSign = blockWithLeftSign;
        this.blockWithRightSign = blockWithRightSign;
        this.dividerHorizontalUnderline = dividerHorizontalUnderline;
        this.iconSingLeft = iconSingLeft;
        this.iconSingRight = iconSingRight;
        this.textSignLeft = textSignLeft;
        this.textSignRight = textSignRight;
        this.titleSignLeft = titleSignLeft;
        this.titleSignRight = titleSignRight;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static DrivingSchoolSignInfoItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static DrivingSchoolSignInfoItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.driving_school_sign_info_item, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static DrivingSchoolSignInfoItemBinding bind(@NonNull View rootView) {
        int i = R.id.block_with_left_sign;
        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.block_with_left_sign);
        if (viewFindChildViewById != null) {
            i = R.id.block_with_right_sign;
            View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.block_with_right_sign);
            if (viewFindChildViewById2 != null) {
                i = R.id.divider_horizontal_underline;
                View viewFindChildViewById3 = ViewBindings.findChildViewById(rootView, R.id.divider_horizontal_underline);
                if (viewFindChildViewById3 != null) {
                    i = R.id.icon_sing_left;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.icon_sing_left);
                    if (imageView != null) {
                        i = R.id.icon_sing_right;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.icon_sing_right);
                        if (imageView2 != null) {
                            i = R.id.text_sign_left;
                            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_sign_left);
                            if (textView != null) {
                                i = R.id.text_sign_right;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_sign_right);
                                if (textView2 != null) {
                                    i = R.id.title_sign_left;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title_sign_left);
                                    if (textView3 != null) {
                                        i = R.id.title_sign_right;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title_sign_right);
                                        if (textView4 != null) {
                                            return new DrivingSchoolSignInfoItemBinding((ConstraintLayout) rootView, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3, imageView, imageView2, textView, textView2, textView3, textView4);
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
