package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;

/* loaded from: classes.dex */
public final class FractionProgressInOrganizationItemBinding implements ViewBinding {

    @NonNull
    public final ImageView iconFractionsProgressExperience;

    @NonNull
    public final AppCompatButton imageButtonGetNewRank;

    @NonNull
    public final ImageView imageViewStaff;

    @NonNull
    public final ProgressBar progressBarStaffExperience;

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final TextView textViewRankStatus;

    @NonNull
    public final TextView textViewRankUnavailableContactLeader;

    @NonNull
    public final TextView textViewStaffLevel;

    @NonNull
    public final TextView textViewStaffName;

    @NonNull
    public final TextView tvFractionsExperienceFromTo;

    @NonNull
    public final View viewRankStatusReceive;

    @NonNull
    public final View viewRankStatusReceived;

    public FractionProgressInOrganizationItemBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView iconFractionsProgressExperience, @NonNull AppCompatButton imageButtonGetNewRank, @NonNull ImageView imageViewStaff, @NonNull ProgressBar progressBarStaffExperience, @NonNull TextView textViewRankStatus, @NonNull TextView textViewRankUnavailableContactLeader, @NonNull TextView textViewStaffLevel, @NonNull TextView textViewStaffName, @NonNull TextView tvFractionsExperienceFromTo, @NonNull View viewRankStatusReceive, @NonNull View viewRankStatusReceived) {
        this.rootView = rootView;
        this.iconFractionsProgressExperience = iconFractionsProgressExperience;
        this.imageButtonGetNewRank = imageButtonGetNewRank;
        this.imageViewStaff = imageViewStaff;
        this.progressBarStaffExperience = progressBarStaffExperience;
        this.textViewRankStatus = textViewRankStatus;
        this.textViewRankUnavailableContactLeader = textViewRankUnavailableContactLeader;
        this.textViewStaffLevel = textViewStaffLevel;
        this.textViewStaffName = textViewStaffName;
        this.tvFractionsExperienceFromTo = tvFractionsExperienceFromTo;
        this.viewRankStatusReceive = viewRankStatusReceive;
        this.viewRankStatusReceived = viewRankStatusReceived;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FractionProgressInOrganizationItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FractionProgressInOrganizationItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fraction_progress_in_organization_item, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static FractionProgressInOrganizationItemBinding bind(@NonNull View rootView) {
        int i = R.id.icon_fractions_progress_experience;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.icon_fractions_progress_experience);
        if (imageView != null) {
            i = R.id.image_button_get_new_rank;
            AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.image_button_get_new_rank);
            if (appCompatButton != null) {
                i = R.id.image_view_staff;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.image_view_staff);
                if (imageView2 != null) {
                    i = R.id.progress_bar_staff_experience;
                    ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progress_bar_staff_experience);
                    if (progressBar != null) {
                        i = R.id.text_view_rank_status;
                        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_view_rank_status);
                        if (textView != null) {
                            i = R.id.text_view_rank_unavailable_contact_leader;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_view_rank_unavailable_contact_leader);
                            if (textView2 != null) {
                                i = R.id.text_view_staff_level;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_view_staff_level);
                                if (textView3 != null) {
                                    i = R.id.text_view_staff_name;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_view_staff_name);
                                    if (textView4 != null) {
                                        i = R.id.tv_fractions_experience_from_to;
                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_fractions_experience_from_to);
                                        if (textView5 != null) {
                                            i = R.id.view_rank_status_receive;
                                            View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.view_rank_status_receive);
                                            if (viewFindChildViewById != null) {
                                                i = R.id.view_rank_status_received;
                                                View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.view_rank_status_received);
                                                if (viewFindChildViewById2 != null) {
                                                    return new FractionProgressInOrganizationItemBinding((ConstraintLayout) rootView, imageView, appCompatButton, imageView2, progressBar, textView, textView2, textView3, textView4, textView5, viewFindChildViewById, viewFindChildViewById2);
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
