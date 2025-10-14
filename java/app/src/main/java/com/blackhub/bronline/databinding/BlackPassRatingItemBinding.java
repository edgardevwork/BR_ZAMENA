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

/* loaded from: classes2.dex */
public final class BlackPassRatingItemBinding implements ViewBinding {

    @NonNull
    public final ImageView bpiRatingMedal;

    @NonNull
    public final TextView bpiRatingPlayersExperience;

    @NonNull
    public final TextView bpiRatingPlayersNick;

    @NonNull
    public final ConstraintLayout rootView;

    public BlackPassRatingItemBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView bpiRatingMedal, @NonNull TextView bpiRatingPlayersExperience, @NonNull TextView bpiRatingPlayersNick) {
        this.rootView = rootView;
        this.bpiRatingMedal = bpiRatingMedal;
        this.bpiRatingPlayersExperience = bpiRatingPlayersExperience;
        this.bpiRatingPlayersNick = bpiRatingPlayersNick;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static BlackPassRatingItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static BlackPassRatingItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.black_pass_rating_item, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static BlackPassRatingItemBinding bind(@NonNull View rootView) {
        int i = R.id.bpi_rating_medal;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.bpi_rating_medal);
        if (imageView != null) {
            i = R.id.bpi_rating_players_experience;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.bpi_rating_players_experience);
            if (textView != null) {
                i = R.id.bpi_rating_players_nick;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.bpi_rating_players_nick);
                if (textView2 != null) {
                    return new BlackPassRatingItemBinding((ConstraintLayout) rootView, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
