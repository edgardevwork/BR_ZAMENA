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
public final class FamiliesRatingItemBinding implements ViewBinding {

    @NonNull
    public final ImageView familyIcon;

    @NonNull
    public final TextView familyNick;

    @NonNull
    public final TextView familyRep;

    @NonNull
    public final ImageView leftIcon;

    @NonNull
    public final ImageView rightIcon;

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final View topBg;

    @NonNull
    public final TextView topPosition;

    @NonNull
    public final TextView valueCaptured;

    public FamiliesRatingItemBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView familyIcon, @NonNull TextView familyNick, @NonNull TextView familyRep, @NonNull ImageView leftIcon, @NonNull ImageView rightIcon, @NonNull View topBg, @NonNull TextView topPosition, @NonNull TextView valueCaptured) {
        this.rootView = rootView;
        this.familyIcon = familyIcon;
        this.familyNick = familyNick;
        this.familyRep = familyRep;
        this.leftIcon = leftIcon;
        this.rightIcon = rightIcon;
        this.topBg = topBg;
        this.topPosition = topPosition;
        this.valueCaptured = valueCaptured;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FamiliesRatingItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FamiliesRatingItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.families_rating_item, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static FamiliesRatingItemBinding bind(@NonNull View rootView) {
        int i = R.id.family_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.family_icon);
        if (imageView != null) {
            i = R.id.family_nick;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.family_nick);
            if (textView != null) {
                i = R.id.family_rep;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.family_rep);
                if (textView2 != null) {
                    i = R.id.left_icon;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.left_icon);
                    if (imageView2 != null) {
                        i = R.id.right_icon;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.right_icon);
                        if (imageView3 != null) {
                            i = R.id.top_bg;
                            View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.top_bg);
                            if (viewFindChildViewById != null) {
                                i = R.id.top_position;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.top_position);
                                if (textView3 != null) {
                                    i = R.id.value_captured;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.value_captured);
                                    if (textView4 != null) {
                                        return new FamiliesRatingItemBinding((ConstraintLayout) rootView, imageView, textView, textView2, imageView2, imageView3, viewFindChildViewById, textView3, textView4);
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
