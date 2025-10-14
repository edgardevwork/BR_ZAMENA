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
public final class FamiliesQuestsLayoutBinding implements ViewBinding {

    @NonNull
    public final View bodyRightBlock;

    @NonNull
    public final AppCompatButton buttonStartQuest;

    @NonNull
    public final View leftTitleDiver;

    @NonNull
    public final View present1Bg;

    @NonNull
    public final ImageView present1Item;

    @NonNull
    public final TextView present1Value;

    @NonNull
    public final View present2Bg;

    @NonNull
    public final ImageView present2Item;

    @NonNull
    public final TextView present2Value;

    @NonNull
    public final View present3Bg;

    @NonNull
    public final ImageView present3Item;

    @NonNull
    public final TextView present3Value;

    @NonNull
    public final RecyclerView questionsList;

    @NonNull
    public final TextView questsTitle;

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final View titleLeftBlock;

    @NonNull
    public final TextView titleQuestsDescription;

    @NonNull
    public final TextView titleQuestsPresent;

    @NonNull
    public final TextView valueQuestsDescription;

    public FamiliesQuestsLayoutBinding(@NonNull ConstraintLayout rootView, @NonNull View bodyRightBlock, @NonNull AppCompatButton buttonStartQuest, @NonNull View leftTitleDiver, @NonNull View present1Bg, @NonNull ImageView present1Item, @NonNull TextView present1Value, @NonNull View present2Bg, @NonNull ImageView present2Item, @NonNull TextView present2Value, @NonNull View present3Bg, @NonNull ImageView present3Item, @NonNull TextView present3Value, @NonNull RecyclerView questionsList, @NonNull TextView questsTitle, @NonNull View titleLeftBlock, @NonNull TextView titleQuestsDescription, @NonNull TextView titleQuestsPresent, @NonNull TextView valueQuestsDescription) {
        this.rootView = rootView;
        this.bodyRightBlock = bodyRightBlock;
        this.buttonStartQuest = buttonStartQuest;
        this.leftTitleDiver = leftTitleDiver;
        this.present1Bg = present1Bg;
        this.present1Item = present1Item;
        this.present1Value = present1Value;
        this.present2Bg = present2Bg;
        this.present2Item = present2Item;
        this.present2Value = present2Value;
        this.present3Bg = present3Bg;
        this.present3Item = present3Item;
        this.present3Value = present3Value;
        this.questionsList = questionsList;
        this.questsTitle = questsTitle;
        this.titleLeftBlock = titleLeftBlock;
        this.titleQuestsDescription = titleQuestsDescription;
        this.titleQuestsPresent = titleQuestsPresent;
        this.valueQuestsDescription = valueQuestsDescription;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FamiliesQuestsLayoutBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FamiliesQuestsLayoutBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.families_quests_layout, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static FamiliesQuestsLayoutBinding bind(@NonNull View rootView) {
        int i = R.id.body_right_block;
        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.body_right_block);
        if (viewFindChildViewById != null) {
            i = R.id.button_start_quest;
            AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.button_start_quest);
            if (appCompatButton != null) {
                i = R.id.left_title_diver;
                View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.left_title_diver);
                if (viewFindChildViewById2 != null) {
                    i = R.id.present_1_bg;
                    View viewFindChildViewById3 = ViewBindings.findChildViewById(rootView, R.id.present_1_bg);
                    if (viewFindChildViewById3 != null) {
                        i = R.id.present_1_item;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.present_1_item);
                        if (imageView != null) {
                            i = R.id.present_1_value;
                            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.present_1_value);
                            if (textView != null) {
                                i = R.id.present_2_bg;
                                View viewFindChildViewById4 = ViewBindings.findChildViewById(rootView, R.id.present_2_bg);
                                if (viewFindChildViewById4 != null) {
                                    i = R.id.present_2_item;
                                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.present_2_item);
                                    if (imageView2 != null) {
                                        i = R.id.present_2_value;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.present_2_value);
                                        if (textView2 != null) {
                                            i = R.id.present_3_bg;
                                            View viewFindChildViewById5 = ViewBindings.findChildViewById(rootView, R.id.present_3_bg);
                                            if (viewFindChildViewById5 != null) {
                                                i = R.id.present_3_item;
                                                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.present_3_item);
                                                if (imageView3 != null) {
                                                    i = R.id.present_3_value;
                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.present_3_value);
                                                    if (textView3 != null) {
                                                        i = R.id.questions_list;
                                                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.questions_list);
                                                        if (recyclerView != null) {
                                                            i = R.id.quests_title;
                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.quests_title);
                                                            if (textView4 != null) {
                                                                i = R.id.title_left_block;
                                                                View viewFindChildViewById6 = ViewBindings.findChildViewById(rootView, R.id.title_left_block);
                                                                if (viewFindChildViewById6 != null) {
                                                                    i = R.id.title_quests_description;
                                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title_quests_description);
                                                                    if (textView5 != null) {
                                                                        i = R.id.title_quests_present;
                                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title_quests_present);
                                                                        if (textView6 != null) {
                                                                            i = R.id.value_quests_description;
                                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.value_quests_description);
                                                                            if (textView7 != null) {
                                                                                return new FamiliesQuestsLayoutBinding((ConstraintLayout) rootView, viewFindChildViewById, appCompatButton, viewFindChildViewById2, viewFindChildViewById3, imageView, textView, viewFindChildViewById4, imageView2, textView2, viewFindChildViewById5, imageView3, textView3, recyclerView, textView4, viewFindChildViewById6, textView5, textView6, textView7);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
