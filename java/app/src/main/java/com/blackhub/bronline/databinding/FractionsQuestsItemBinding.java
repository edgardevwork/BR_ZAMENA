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
public final class FractionsQuestsItemBinding implements ViewBinding {

    @NonNull
    public final ImageView ivAward1;

    @NonNull
    public final ImageView ivAward2;

    @NonNull
    public final TextView questTitle;

    @NonNull
    public final ConstraintLayout rootView;

    public FractionsQuestsItemBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView ivAward1, @NonNull ImageView ivAward2, @NonNull TextView questTitle) {
        this.rootView = rootView;
        this.ivAward1 = ivAward1;
        this.ivAward2 = ivAward2;
        this.questTitle = questTitle;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FractionsQuestsItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FractionsQuestsItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fractions_quests_item, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static FractionsQuestsItemBinding bind(@NonNull View rootView) {
        int i = R.id.iv_award_1;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_award_1);
        if (imageView != null) {
            i = R.id.iv_award_2;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_award_2);
            if (imageView2 != null) {
                i = R.id.quest_title;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.quest_title);
                if (textView != null) {
                    return new FractionsQuestsItemBinding((ConstraintLayout) rootView, imageView, imageView2, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
