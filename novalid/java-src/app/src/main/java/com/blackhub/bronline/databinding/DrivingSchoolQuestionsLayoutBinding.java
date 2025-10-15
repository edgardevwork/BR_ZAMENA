package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;

/* loaded from: classes.dex */
public final class DrivingSchoolQuestionsLayoutBinding implements ViewBinding {

    @NonNull
    public final RecyclerView answersList;

    @NonNull
    public final View correctAnswersBg;

    @NonNull
    public final ImageView iconClock;

    @NonNull
    public final ImageView iconCorrectAnswer;

    @NonNull
    public final ImageView questionsIconBg;

    @NonNull
    public final ImageView questionsIconRes;

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final TextView thisQuestionValue;

    @NonNull
    public final TextView thisQuestionsText;

    @NonNull
    public final View timerBg;

    @NonNull
    public final TextView valueCorrectAnswers;

    @NonNull
    public final TextView valueTimer;

    public DrivingSchoolQuestionsLayoutBinding(@NonNull ConstraintLayout rootView, @NonNull RecyclerView answersList, @NonNull View correctAnswersBg, @NonNull ImageView iconClock, @NonNull ImageView iconCorrectAnswer, @NonNull ImageView questionsIconBg, @NonNull ImageView questionsIconRes, @NonNull TextView thisQuestionValue, @NonNull TextView thisQuestionsText, @NonNull View timerBg, @NonNull TextView valueCorrectAnswers, @NonNull TextView valueTimer) {
        this.rootView = rootView;
        this.answersList = answersList;
        this.correctAnswersBg = correctAnswersBg;
        this.iconClock = iconClock;
        this.iconCorrectAnswer = iconCorrectAnswer;
        this.questionsIconBg = questionsIconBg;
        this.questionsIconRes = questionsIconRes;
        this.thisQuestionValue = thisQuestionValue;
        this.thisQuestionsText = thisQuestionsText;
        this.timerBg = timerBg;
        this.valueCorrectAnswers = valueCorrectAnswers;
        this.valueTimer = valueTimer;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static DrivingSchoolQuestionsLayoutBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static DrivingSchoolQuestionsLayoutBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.driving_school_questions_layout, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static DrivingSchoolQuestionsLayoutBinding bind(@NonNull View rootView) {
        int i = R.id.answers_list;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.answers_list);
        if (recyclerView != null) {
            i = R.id.correct_answers_bg;
            View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.correct_answers_bg);
            if (viewFindChildViewById != null) {
                i = R.id.icon_clock;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.icon_clock);
                if (imageView != null) {
                    i = R.id.icon_correct_answer;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.icon_correct_answer);
                    if (imageView2 != null) {
                        i = R.id.questions_icon_bg;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.questions_icon_bg);
                        if (imageView3 != null) {
                            i = R.id.questions_icon_res;
                            ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.questions_icon_res);
                            if (imageView4 != null) {
                                i = R.id.this_question_value;
                                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.this_question_value);
                                if (textView != null) {
                                    i = R.id.this_questions_text;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.this_questions_text);
                                    if (textView2 != null) {
                                        i = R.id.timer_bg;
                                        View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.timer_bg);
                                        if (viewFindChildViewById2 != null) {
                                            i = R.id.value_correct_answers;
                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.value_correct_answers);
                                            if (textView3 != null) {
                                                i = R.id.value_timer;
                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.value_timer);
                                                if (textView4 != null) {
                                                    return new DrivingSchoolQuestionsLayoutBinding((ConstraintLayout) rootView, recyclerView, viewFindChildViewById, imageView, imageView2, imageView3, imageView4, textView, textView2, viewFindChildViewById2, textView3, textView4);
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
