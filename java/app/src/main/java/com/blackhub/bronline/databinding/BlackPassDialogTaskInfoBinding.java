package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;


public final class BlackPassDialogTaskInfoBinding implements ViewBinding {

    @NonNull
    public final ImageView bpTaskClose;

    @NonNull
    public final TextView bpTaskCoins;

    @NonNull
    public final TextView bpTaskDescription;

    @NonNull
    public final AppCompatButton bpTaskExch;

    @NonNull
    public final TextView bpTaskExp;

    @NonNull
    public final TextView bpTaskHeader;

    @NonNull
    public final TextView bpTaskName;

    @NonNull
    public final AppCompatButton bpTaskTrack;

    @NonNull
    public final ImageView imageView11;

    @NonNull
    public final TextView imageView12;

    @NonNull
    public final FrameLayout rootView;

    @NonNull
    public final TextView textView32;

    @NonNull
    public final TextView textView34;

    public BlackPassDialogTaskInfoBinding(@NonNull FrameLayout rootView, @NonNull ImageView bpTaskClose, @NonNull TextView bpTaskCoins, @NonNull TextView bpTaskDescription, @NonNull AppCompatButton bpTaskExch, @NonNull TextView bpTaskExp, @NonNull TextView bpTaskHeader, @NonNull TextView bpTaskName, @NonNull AppCompatButton bpTaskTrack, @NonNull ImageView imageView11, @NonNull TextView imageView12, @NonNull TextView textView32, @NonNull TextView textView34) {
        this.rootView = rootView;
        this.bpTaskClose = bpTaskClose;
        this.bpTaskCoins = bpTaskCoins;
        this.bpTaskDescription = bpTaskDescription;
        this.bpTaskExch = bpTaskExch;
        this.bpTaskExp = bpTaskExp;
        this.bpTaskHeader = bpTaskHeader;
        this.bpTaskName = bpTaskName;
        this.bpTaskTrack = bpTaskTrack;
        this.imageView11 = imageView11;
        this.imageView12 = imageView12;
        this.textView32 = textView32;
        this.textView34 = textView34;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static BlackPassDialogTaskInfoBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static BlackPassDialogTaskInfoBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.black_pass_dialog_task_info, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static BlackPassDialogTaskInfoBinding bind(@NonNull View rootView) {
        int i = R.id.bp_task_close;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.bp_task_close);
        if (imageView != null) {
            i = R.id.bp_task_coins;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.bp_task_coins);
            if (textView != null) {
                i = R.id.bp_task_description;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.bp_task_description);
                if (textView2 != null) {
                    i = R.id.bp_task_exch;
                    AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.bp_task_exch);
                    if (appCompatButton != null) {
                        i = R.id.bp_task_exp;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.bp_task_exp);
                        if (textView3 != null) {
                            i = R.id.bp_task_header;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.bp_task_header);
                            if (textView4 != null) {
                                i = R.id.bp_task_name;
                                TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.bp_task_name);
                                if (textView5 != null) {
                                    i = R.id.bp_task_track;
                                    AppCompatButton appCompatButton2 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.bp_task_track);
                                    if (appCompatButton2 != null) {
                                        i = R.id.imageView11;
                                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.imageView11);
                                        if (imageView2 != null) {
                                            i = R.id.imageView12;
                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.imageView12);
                                            if (textView6 != null) {
                                                i = R.id.textView32;
                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.textView32);
                                                if (textView7 != null) {
                                                    i = R.id.textView34;
                                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.textView34);
                                                    if (textView8 != null) {
                                                        return new BlackPassDialogTaskInfoBinding((FrameLayout) rootView, imageView, textView, textView2, appCompatButton, textView3, textView4, textView5, appCompatButton2, imageView2, textView6, textView7, textView8);
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
