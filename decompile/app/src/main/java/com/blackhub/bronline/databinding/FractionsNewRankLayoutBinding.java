package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;

/* loaded from: classes.dex */
public final class FractionsNewRankLayoutBinding implements ViewBinding {

    @NonNull
    public final View bgEffectShadow;

    @NonNull
    public final View bgViewEllipse;

    @NonNull
    public final AppCompatButton buttonGetReward;

    @NonNull
    public final ImageView imageViewLavr;

    @NonNull
    public final ImageView imageViewStaffRank;

    @NonNull
    public final ImageView ivAward1;

    @NonNull
    public final ImageView ivAward2;

    @NonNull
    public final ImageView ivAward3;

    @NonNull
    public final View mainViewNewRank;

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final TextView textViewCongratulation;

    @NonNull
    public final TextView textViewNewRankReceived;

    @NonNull
    public final TextView textViewRank;

    @NonNull
    public final TextView textViewReward1;

    @NonNull
    public final TextView textViewReward2;

    @NonNull
    public final TextView textViewReward3;

    public FractionsNewRankLayoutBinding(@NonNull ConstraintLayout rootView, @NonNull View bgEffectShadow, @NonNull View bgViewEllipse, @NonNull AppCompatButton buttonGetReward, @NonNull ImageView imageViewLavr, @NonNull ImageView imageViewStaffRank, @NonNull ImageView ivAward1, @NonNull ImageView ivAward2, @NonNull ImageView ivAward3, @NonNull View mainViewNewRank, @NonNull TextView textViewCongratulation, @NonNull TextView textViewNewRankReceived, @NonNull TextView textViewRank, @NonNull TextView textViewReward1, @NonNull TextView textViewReward2, @NonNull TextView textViewReward3) {
        this.rootView = rootView;
        this.bgEffectShadow = bgEffectShadow;
        this.bgViewEllipse = bgViewEllipse;
        this.buttonGetReward = buttonGetReward;
        this.imageViewLavr = imageViewLavr;
        this.imageViewStaffRank = imageViewStaffRank;
        this.ivAward1 = ivAward1;
        this.ivAward2 = ivAward2;
        this.ivAward3 = ivAward3;
        this.mainViewNewRank = mainViewNewRank;
        this.textViewCongratulation = textViewCongratulation;
        this.textViewNewRankReceived = textViewNewRankReceived;
        this.textViewRank = textViewRank;
        this.textViewReward1 = textViewReward1;
        this.textViewReward2 = textViewReward2;
        this.textViewReward3 = textViewReward3;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FractionsNewRankLayoutBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FractionsNewRankLayoutBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fractions_new_rank_layout, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static FractionsNewRankLayoutBinding bind(@NonNull View rootView) {
        int i = R.id.bg_effect_shadow;
        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.bg_effect_shadow);
        if (viewFindChildViewById != null) {
            i = R.id.bg_view_ellipse;
            View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.bg_view_ellipse);
            if (viewFindChildViewById2 != null) {
                i = R.id.button_get_reward;
                AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.button_get_reward);
                if (appCompatButton != null) {
                    i = R.id.image_view_lavr;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.image_view_lavr);
                    if (imageView != null) {
                        i = R.id.image_view_staff_rank;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.image_view_staff_rank);
                        if (imageView2 != null) {
                            i = R.id.iv_award_1;
                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_award_1);
                            if (imageView3 != null) {
                                i = R.id.iv_award_2;
                                ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_award_2);
                                if (imageView4 != null) {
                                    i = R.id.iv_award_3;
                                    ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_award_3);
                                    if (imageView5 != null) {
                                        i = R.id.main_view_new_rank;
                                        View viewFindChildViewById3 = ViewBindings.findChildViewById(rootView, R.id.main_view_new_rank);
                                        if (viewFindChildViewById3 != null) {
                                            i = R.id.text_view_congratulation;
                                            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_view_congratulation);
                                            if (textView != null) {
                                                i = R.id.text_view_new_rank_received;
                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_view_new_rank_received);
                                                if (textView2 != null) {
                                                    i = R.id.text_view_rank;
                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_view_rank);
                                                    if (textView3 != null) {
                                                        i = R.id.text_view_reward_1;
                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_view_reward_1);
                                                        if (textView4 != null) {
                                                            i = R.id.text_view_reward_2;
                                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_view_reward_2);
                                                            if (textView5 != null) {
                                                                i = R.id.text_view_reward_3;
                                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_view_reward_3);
                                                                if (textView6 != null) {
                                                                    return new FractionsNewRankLayoutBinding((ConstraintLayout) rootView, viewFindChildViewById, viewFindChildViewById2, appCompatButton, imageView, imageView2, imageView3, imageView4, imageView5, viewFindChildViewById3, textView, textView2, textView3, textView4, textView5, textView6);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
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
