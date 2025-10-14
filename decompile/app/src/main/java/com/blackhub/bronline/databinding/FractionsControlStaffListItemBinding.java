package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;

/* loaded from: classes.dex */
public final class FractionsControlStaffListItemBinding implements ViewBinding {

    @NonNull
    public final ImageView imageViewOnline;

    @NonNull
    public final ImageView imageViewStaffRank;

    @NonNull
    public final ImageView imageViewTopRank;

    @NonNull
    public final ProgressBar progressBarRankExperience;

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final TextView textViewNickname;

    @NonNull
    public final TextView textViewRank;

    public FractionsControlStaffListItemBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView imageViewOnline, @NonNull ImageView imageViewStaffRank, @NonNull ImageView imageViewTopRank, @NonNull ProgressBar progressBarRankExperience, @NonNull TextView textViewNickname, @NonNull TextView textViewRank) {
        this.rootView = rootView;
        this.imageViewOnline = imageViewOnline;
        this.imageViewStaffRank = imageViewStaffRank;
        this.imageViewTopRank = imageViewTopRank;
        this.progressBarRankExperience = progressBarRankExperience;
        this.textViewNickname = textViewNickname;
        this.textViewRank = textViewRank;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FractionsControlStaffListItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FractionsControlStaffListItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fractions_control_staff_list_item, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static FractionsControlStaffListItemBinding bind(@NonNull View rootView) {
        int i = R.id.image_view_online;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.image_view_online);
        if (imageView != null) {
            i = R.id.image_view_staff_rank;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.image_view_staff_rank);
            if (imageView2 != null) {
                i = R.id.image_view_top_rank;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.image_view_top_rank);
                if (imageView3 != null) {
                    i = R.id.progress_bar_rank_experience;
                    ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progress_bar_rank_experience);
                    if (progressBar != null) {
                        i = R.id.text_view_nickname;
                        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_view_nickname);
                        if (textView != null) {
                            i = R.id.text_view_rank;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_view_rank);
                            if (textView2 != null) {
                                return new FractionsControlStaffListItemBinding((ConstraintLayout) rootView, imageView, imageView2, imageView3, progressBar, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
