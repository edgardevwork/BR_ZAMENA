package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.blackhub.bronline.game.common.UIContainer;
import com.bless.client.R;

/* loaded from: classes3.dex */
public final class TuningDialogBinding implements ViewBinding {

    @NonNull
    public final AppCompatButton headerBackToMainMenu;

    @NonNull
    public final AppCompatButton headerExit;

    @NonNull
    public final RelativeLayout headerTuning;

    @NonNull
    public final ConstraintLayout processDiagnostic;

    @NonNull
    public final TextView progressValuePercent;

    @NonNull
    public final RelativeLayout rootView;

    @NonNull
    public final TextView titleDiagnosticInProgress;

    @NonNull
    public final TextView titleThisCar;

    @NonNull
    public final UIContainer tuningMyContainer;

    @NonNull
    public final ProgressBar tuningProgressBar;

    @NonNull
    public final TextView valuePlayersMoney;

    public TuningDialogBinding(@NonNull RelativeLayout rootView, @NonNull AppCompatButton headerBackToMainMenu, @NonNull AppCompatButton headerExit, @NonNull RelativeLayout headerTuning, @NonNull ConstraintLayout processDiagnostic, @NonNull TextView progressValuePercent, @NonNull TextView titleDiagnosticInProgress, @NonNull TextView titleThisCar, @NonNull UIContainer tuningMyContainer, @NonNull ProgressBar tuningProgressBar, @NonNull TextView valuePlayersMoney) {
        this.rootView = rootView;
        this.headerBackToMainMenu = headerBackToMainMenu;
        this.headerExit = headerExit;
        this.headerTuning = headerTuning;
        this.processDiagnostic = processDiagnostic;
        this.progressValuePercent = progressValuePercent;
        this.titleDiagnosticInProgress = titleDiagnosticInProgress;
        this.titleThisCar = titleThisCar;
        this.tuningMyContainer = tuningMyContainer;
        this.tuningProgressBar = tuningProgressBar;
        this.valuePlayersMoney = valuePlayersMoney;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static TuningDialogBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static TuningDialogBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.tuning_dialog, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static TuningDialogBinding bind(@NonNull View rootView) {
        int i = R.id.header_back_to_main_menu;
        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.header_back_to_main_menu);
        if (appCompatButton != null) {
            i = R.id.header_exit;
            AppCompatButton appCompatButton2 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.header_exit);
            if (appCompatButton2 != null) {
                i = R.id.header_tuning;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.header_tuning);
                if (relativeLayout != null) {
                    i = R.id.process_diagnostic;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.process_diagnostic);
                    if (constraintLayout != null) {
                        i = R.id.progress_value_percent;
                        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.progress_value_percent);
                        if (textView != null) {
                            i = R.id.title_diagnostic_in_progress;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title_diagnostic_in_progress);
                            if (textView2 != null) {
                                i = R.id.title_this_car;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title_this_car);
                                if (textView3 != null) {
                                    i = R.id.tuning_my_container;
                                    UIContainer uIContainer = (UIContainer) ViewBindings.findChildViewById(rootView, R.id.tuning_my_container);
                                    if (uIContainer != null) {
                                        i = R.id.tuning_progress_bar;
                                        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.tuning_progress_bar);
                                        if (progressBar != null) {
                                            i = R.id.value_players_money;
                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.value_players_money);
                                            if (textView4 != null) {
                                                return new TuningDialogBinding((RelativeLayout) rootView, appCompatButton, appCompatButton2, relativeLayout, constraintLayout, textView, textView2, textView3, uIContainer, progressBar, textView4);
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
