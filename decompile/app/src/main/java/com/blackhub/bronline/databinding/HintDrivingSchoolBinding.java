package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;

/* loaded from: classes.dex */
public final class HintDrivingSchoolBinding implements ViewBinding {

    @NonNull
    public final LinearLayout blockHintDrivingSchoolTasks;

    @NonNull
    public final ImageView ivHintDrivingSchooInstructor;

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final RecyclerView rvHintDrivingSchoolAdditionalQuests;

    @NonNull
    public final RecyclerView rvHintDrivingSchoolMainQuests;

    @NonNull
    public final TextView tvHintDrivingSchoolAdditionalTitle;

    @NonNull
    public final TextView tvHintDrivingSchoolInstructor;

    @NonNull
    public final TextView tvHintDrivingSchoolMainTitle;

    @NonNull
    public final TextView tvHintDrivingSchoolTextIfWithoutAdditionalQuests;

    @NonNull
    public final View underlineHintDrivingSchool;

    public HintDrivingSchoolBinding(@NonNull ConstraintLayout rootView, @NonNull LinearLayout blockHintDrivingSchoolTasks, @NonNull ImageView ivHintDrivingSchooInstructor, @NonNull RecyclerView rvHintDrivingSchoolAdditionalQuests, @NonNull RecyclerView rvHintDrivingSchoolMainQuests, @NonNull TextView tvHintDrivingSchoolAdditionalTitle, @NonNull TextView tvHintDrivingSchoolInstructor, @NonNull TextView tvHintDrivingSchoolMainTitle, @NonNull TextView tvHintDrivingSchoolTextIfWithoutAdditionalQuests, @NonNull View underlineHintDrivingSchool) {
        this.rootView = rootView;
        this.blockHintDrivingSchoolTasks = blockHintDrivingSchoolTasks;
        this.ivHintDrivingSchooInstructor = ivHintDrivingSchooInstructor;
        this.rvHintDrivingSchoolAdditionalQuests = rvHintDrivingSchoolAdditionalQuests;
        this.rvHintDrivingSchoolMainQuests = rvHintDrivingSchoolMainQuests;
        this.tvHintDrivingSchoolAdditionalTitle = tvHintDrivingSchoolAdditionalTitle;
        this.tvHintDrivingSchoolInstructor = tvHintDrivingSchoolInstructor;
        this.tvHintDrivingSchoolMainTitle = tvHintDrivingSchoolMainTitle;
        this.tvHintDrivingSchoolTextIfWithoutAdditionalQuests = tvHintDrivingSchoolTextIfWithoutAdditionalQuests;
        this.underlineHintDrivingSchool = underlineHintDrivingSchool;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static HintDrivingSchoolBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static HintDrivingSchoolBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.hint_driving_school, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static HintDrivingSchoolBinding bind(@NonNull View rootView) {
        int i = R.id.blockHintDrivingSchoolTasks;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.blockHintDrivingSchoolTasks);
        if (linearLayout != null) {
            i = R.id.ivHintDrivingSchooInstructor;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.ivHintDrivingSchooInstructor);
            if (imageView != null) {
                i = R.id.rvHintDrivingSchoolAdditionalQuests;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.rvHintDrivingSchoolAdditionalQuests);
                if (recyclerView != null) {
                    i = R.id.rvHintDrivingSchoolMainQuests;
                    RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.rvHintDrivingSchoolMainQuests);
                    if (recyclerView2 != null) {
                        i = R.id.tvHintDrivingSchoolAdditionalTitle;
                        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvHintDrivingSchoolAdditionalTitle);
                        if (textView != null) {
                            i = R.id.tvHintDrivingSchoolInstructor;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvHintDrivingSchoolInstructor);
                            if (textView2 != null) {
                                i = R.id.tvHintDrivingSchoolMainTitle;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvHintDrivingSchoolMainTitle);
                                if (textView3 != null) {
                                    i = R.id.tvHintDrivingSchoolTextIfWithoutAdditionalQuests;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvHintDrivingSchoolTextIfWithoutAdditionalQuests);
                                    if (textView4 != null) {
                                        i = R.id.underlineHintDrivingSchool;
                                        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.underlineHintDrivingSchool);
                                        if (viewFindChildViewById != null) {
                                            return new HintDrivingSchoolBinding((ConstraintLayout) rootView, linearLayout, imageView, recyclerView, recyclerView2, textView, textView2, textView3, textView4, viewFindChildViewById);
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
