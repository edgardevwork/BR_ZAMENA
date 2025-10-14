package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;

/* loaded from: classes.dex */
public final class HintItemBinding implements ViewBinding {

    @NonNull
    public final ProgressBar hintProgressQuest;

    @NonNull
    public final TextView hintStatusQuest;

    @NonNull
    public final TextView hintTitleAdditionalQuestItem;

    @NonNull
    public final ConstraintLayout rootView;

    public HintItemBinding(@NonNull ConstraintLayout rootView, @NonNull ProgressBar hintProgressQuest, @NonNull TextView hintStatusQuest, @NonNull TextView hintTitleAdditionalQuestItem) {
        this.rootView = rootView;
        this.hintProgressQuest = hintProgressQuest;
        this.hintStatusQuest = hintStatusQuest;
        this.hintTitleAdditionalQuestItem = hintTitleAdditionalQuestItem;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static HintItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static HintItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.hint_item, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static HintItemBinding bind(@NonNull View rootView) {
        int i = R.id.hint_progress_quest;
        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.hint_progress_quest);
        if (progressBar != null) {
            i = R.id.hint_status_quest;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.hint_status_quest);
            if (textView != null) {
                i = R.id.hint_title_additional_quest_item;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.hint_title_additional_quest_item);
                if (textView2 != null) {
                    return new HintItemBinding((ConstraintLayout) rootView, progressBar, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
