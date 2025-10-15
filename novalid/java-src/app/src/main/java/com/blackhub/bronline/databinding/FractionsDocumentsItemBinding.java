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
public final class FractionsDocumentsItemBinding implements ViewBinding {

    @NonNull
    public final ImageView imageViewChecked;

    @NonNull
    public final TextView questTitle;

    @NonNull
    public final ConstraintLayout rootView;

    public FractionsDocumentsItemBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView imageViewChecked, @NonNull TextView questTitle) {
        this.rootView = rootView;
        this.imageViewChecked = imageViewChecked;
        this.questTitle = questTitle;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FractionsDocumentsItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FractionsDocumentsItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fractions_documents_item, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static FractionsDocumentsItemBinding bind(@NonNull View rootView) {
        int i = R.id.image_view_checked;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.image_view_checked);
        if (imageView != null) {
            i = R.id.quest_title;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.quest_title);
            if (textView != null) {
                return new FractionsDocumentsItemBinding((ConstraintLayout) rootView, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
