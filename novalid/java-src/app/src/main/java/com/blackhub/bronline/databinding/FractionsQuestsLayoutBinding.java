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
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;

/* loaded from: classes.dex */
public final class FractionsQuestsLayoutBinding implements ViewBinding {

    @NonNull
    public final ImageView award1Item;

    @NonNull
    public final TextView award1Value;

    @NonNull
    public final ImageView award2Item;

    @NonNull
    public final TextView award2Value;

    @NonNull
    public final ImageView award3Item;

    @NonNull
    public final TextView award3Value;

    @NonNull
    public final View bodyRightBlock;

    @NonNull
    public final AppCompatButton buttonStartQuest;

    @NonNull
    public final View leftTitleDiver;

    @NonNull
    public final TextView questsTitle;

    @NonNull
    public final RecyclerView recyclerViewTasksList;

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final View titleLeftBlock;

    @NonNull
    public final TextView titleQuestsAward;

    @NonNull
    public final TextView titleQuestsDescription;

    @NonNull
    public final TextView titleQuestsGoal;

    @NonNull
    public final TextView valueGoalsDescription;

    @NonNull
    public final TextView valueQuestsDescription;

    public FractionsQuestsLayoutBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView award1Item, @NonNull TextView award1Value, @NonNull ImageView award2Item, @NonNull TextView award2Value, @NonNull ImageView award3Item, @NonNull TextView award3Value, @NonNull View bodyRightBlock, @NonNull AppCompatButton buttonStartQuest, @NonNull View leftTitleDiver, @NonNull TextView questsTitle, @NonNull RecyclerView recyclerViewTasksList, @NonNull View titleLeftBlock, @NonNull TextView titleQuestsAward, @NonNull TextView titleQuestsDescription, @NonNull TextView titleQuestsGoal, @NonNull TextView valueGoalsDescription, @NonNull TextView valueQuestsDescription) {
        this.rootView = rootView;
        this.award1Item = award1Item;
        this.award1Value = award1Value;
        this.award2Item = award2Item;
        this.award2Value = award2Value;
        this.award3Item = award3Item;
        this.award3Value = award3Value;
        this.bodyRightBlock = bodyRightBlock;
        this.buttonStartQuest = buttonStartQuest;
        this.leftTitleDiver = leftTitleDiver;
        this.questsTitle = questsTitle;
        this.recyclerViewTasksList = recyclerViewTasksList;
        this.titleLeftBlock = titleLeftBlock;
        this.titleQuestsAward = titleQuestsAward;
        this.titleQuestsDescription = titleQuestsDescription;
        this.titleQuestsGoal = titleQuestsGoal;
        this.valueGoalsDescription = valueGoalsDescription;
        this.valueQuestsDescription = valueQuestsDescription;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FractionsQuestsLayoutBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FractionsQuestsLayoutBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fractions_quests_layout, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static FractionsQuestsLayoutBinding bind(@NonNull View rootView) {
        int i = R.id.award_1_item;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.award_1_item);
        if (imageView != null) {
            i = R.id.award_1_value;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.award_1_value);
            if (textView != null) {
                i = R.id.award_2_item;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.award_2_item);
                if (imageView2 != null) {
                    i = R.id.award_2_value;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.award_2_value);
                    if (textView2 != null) {
                        i = R.id.award_3_item;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.award_3_item);
                        if (imageView3 != null) {
                            i = R.id.award_3_value;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.award_3_value);
                            if (textView3 != null) {
                                i = R.id.body_right_block;
                                View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.body_right_block);
                                if (viewFindChildViewById != null) {
                                    i = R.id.button_start_quest;
                                    AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.button_start_quest);
                                    if (appCompatButton != null) {
                                        i = R.id.left_title_diver;
                                        View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.left_title_diver);
                                        if (viewFindChildViewById2 != null) {
                                            i = R.id.quests_title;
                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.quests_title);
                                            if (textView4 != null) {
                                                i = R.id.recycler_view_tasks_list;
                                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.recycler_view_tasks_list);
                                                if (recyclerView != null) {
                                                    i = R.id.title_left_block;
                                                    View viewFindChildViewById3 = ViewBindings.findChildViewById(rootView, R.id.title_left_block);
                                                    if (viewFindChildViewById3 != null) {
                                                        i = R.id.title_quests_award;
                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title_quests_award);
                                                        if (textView5 != null) {
                                                            i = R.id.title_quests_description;
                                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title_quests_description);
                                                            if (textView6 != null) {
                                                                i = R.id.title_quests_goal;
                                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title_quests_goal);
                                                                if (textView7 != null) {
                                                                    i = R.id.value_goals_description;
                                                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.value_goals_description);
                                                                    if (textView8 != null) {
                                                                        i = R.id.value_quests_description;
                                                                        TextView textView9 = (TextView) ViewBindings.findChildViewById(rootView, R.id.value_quests_description);
                                                                        if (textView9 != null) {
                                                                            return new FractionsQuestsLayoutBinding((ConstraintLayout) rootView, imageView, textView, imageView2, textView2, imageView3, textView3, viewFindChildViewById, appCompatButton, viewFindChildViewById2, textView4, recyclerView, viewFindChildViewById3, textView5, textView6, textView7, textView8, textView9);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
