package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.compose.p003ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.blackhub.bronline.game.common.roundcornerprogressbar.RoundCornerProgressBar;
import com.bless.client.R;

/* loaded from: classes.dex */
public final class FragmentLoaderBinding implements ViewBinding {

    @NonNull
    public final ConstraintLayout backgroundLoader;

    @NonNull
    public final AppCompatButton buttonCancel;

    @NonNull
    public final AppCompatButton buttonRepeat;

    @NonNull
    public final ComposeView cvFilesInfoList;

    @NonNull
    public final TextView loadingPercent;

    @NonNull
    public final TextView loadingText;

    @NonNull
    public final RoundCornerProgressBar progressBar;

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final TextView tvBr;

    @NonNull
    public final TextView tvBr2;

    @NonNull
    public final TextView tvSizeOfUpdate;

    public FragmentLoaderBinding(@NonNull ConstraintLayout rootView, @NonNull ConstraintLayout backgroundLoader, @NonNull AppCompatButton buttonCancel, @NonNull AppCompatButton buttonRepeat, @NonNull ComposeView cvFilesInfoList, @NonNull TextView loadingPercent, @NonNull TextView loadingText, @NonNull RoundCornerProgressBar progressBar, @NonNull TextView tvBr, @NonNull TextView tvBr2, @NonNull TextView tvSizeOfUpdate) {
        this.rootView = rootView;
        this.backgroundLoader = backgroundLoader;
        this.buttonCancel = buttonCancel;
        this.buttonRepeat = buttonRepeat;
        this.cvFilesInfoList = cvFilesInfoList;
        this.loadingPercent = loadingPercent;
        this.loadingText = loadingText;
        this.progressBar = progressBar;
        this.tvBr = tvBr;
        this.tvBr2 = tvBr2;
        this.tvSizeOfUpdate = tvSizeOfUpdate;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FragmentLoaderBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentLoaderBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_loader, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static FragmentLoaderBinding bind(@NonNull View rootView) {
        ConstraintLayout constraintLayout = (ConstraintLayout) rootView;
        int i = R.id.button_cancel;
        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.button_cancel);
        if (appCompatButton != null) {
            i = R.id.button_repeat;
            AppCompatButton appCompatButton2 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.button_repeat);
            if (appCompatButton2 != null) {
                i = R.id.cvFilesInfoList;
                ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(rootView, R.id.cvFilesInfoList);
                if (composeView != null) {
                    i = R.id.loading_percent;
                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.loading_percent);
                    if (textView != null) {
                        i = R.id.loading_text;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.loading_text);
                        if (textView2 != null) {
                            i = R.id.progress_bar;
                            RoundCornerProgressBar roundCornerProgressBar = (RoundCornerProgressBar) ViewBindings.findChildViewById(rootView, R.id.progress_bar);
                            if (roundCornerProgressBar != null) {
                                i = R.id.tv_br;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_br);
                                if (textView3 != null) {
                                    i = R.id.tv_br_2;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_br_2);
                                    if (textView4 != null) {
                                        i = R.id.tv_size_of_update;
                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_size_of_update);
                                        if (textView5 != null) {
                                            return new FragmentLoaderBinding(constraintLayout, constraintLayout, appCompatButton, appCompatButton2, composeView, textView, textView2, roundCornerProgressBar, textView3, textView4, textView5);
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
