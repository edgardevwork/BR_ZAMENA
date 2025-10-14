package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.blackhub.bronline.launcher.CustomEditTextForMainActivity;
import com.bless.client.R;

/* loaded from: classes.dex */
public final class FragmentMainBinding implements ViewBinding {

    @NonNull
    public final View bgBottomGradient;

    @NonNull
    public final ImageButton buttonDiscord;

    @NonNull
    public final AppCompatButton buttonPlay;

    @NonNull
    public final AppCompatButton buttonSettings;

    @NonNull
    public final ImageButton buttonTelegram;

    @NonNull
    public final ImageButton buttonVk;

    @NonNull
    public final CustomEditTextForMainActivity editTextName;

    @NonNull
    public final CustomEditTextForMainActivity editTextSurname;

    @NonNull
    public final Guideline guidelineHorizontalForButtons;

    @NonNull
    public final ImageButton ibInfo;

    @NonNull
    public final ImageView ivBRLogo;

    @NonNull
    public final ConstraintLayout mainActivityRoot;

    @NonNull
    public final ProgressBar progressBar;

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final TextView textViewInfoAboutNickname;

    @NonNull
    public final TextView tvBlackRussia;

    public FragmentMainBinding(@NonNull ConstraintLayout rootView, @NonNull View bgBottomGradient, @NonNull ImageButton buttonDiscord, @NonNull AppCompatButton buttonPlay, @NonNull AppCompatButton buttonSettings, @NonNull ImageButton buttonTelegram, @NonNull ImageButton buttonVk, @NonNull CustomEditTextForMainActivity editTextName, @NonNull CustomEditTextForMainActivity editTextSurname, @NonNull Guideline guidelineHorizontalForButtons, @NonNull ImageButton ibInfo, @NonNull ImageView ivBRLogo, @NonNull ConstraintLayout mainActivityRoot, @NonNull ProgressBar progressBar, @NonNull TextView textViewInfoAboutNickname, @NonNull TextView tvBlackRussia) {
        this.rootView = rootView;
        this.bgBottomGradient = bgBottomGradient;
        this.buttonDiscord = buttonDiscord;
        this.buttonPlay = buttonPlay;
        this.buttonSettings = buttonSettings;
        this.buttonTelegram = buttonTelegram;
        this.buttonVk = buttonVk;
        this.editTextName = editTextName;
        this.editTextSurname = editTextSurname;
        this.guidelineHorizontalForButtons = guidelineHorizontalForButtons;
        this.ibInfo = ibInfo;
        this.ivBRLogo = ivBRLogo;
        this.mainActivityRoot = mainActivityRoot;
        this.progressBar = progressBar;
        this.textViewInfoAboutNickname = textViewInfoAboutNickname;
        this.tvBlackRussia = tvBlackRussia;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FragmentMainBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentMainBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_main, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static FragmentMainBinding bind(@NonNull View rootView) {
        int i = R.id.bgBottomGradient;
        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.bgBottomGradient);
        if (viewFindChildViewById != null) {
            i = R.id.button_discord;
            ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.button_discord);
            if (imageButton != null) {
                i = R.id.button_play;
                AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.button_play);
                if (appCompatButton != null) {
                    i = R.id.button_settings;
                    AppCompatButton appCompatButton2 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.button_settings);
                    if (appCompatButton2 != null) {
                        i = R.id.button_telegram;
                        ImageButton imageButton2 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.button_telegram);
                        if (imageButton2 != null) {
                            i = R.id.button_vk;
                            ImageButton imageButton3 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.button_vk);
                            if (imageButton3 != null) {
                                i = R.id.edit_text_name;
                                CustomEditTextForMainActivity customEditTextForMainActivity = (CustomEditTextForMainActivity) ViewBindings.findChildViewById(rootView, R.id.edit_text_name);
                                if (customEditTextForMainActivity != null) {
                                    i = R.id.edit_text_surname;
                                    CustomEditTextForMainActivity customEditTextForMainActivity2 = (CustomEditTextForMainActivity) ViewBindings.findChildViewById(rootView, R.id.edit_text_surname);
                                    if (customEditTextForMainActivity2 != null) {
                                        i = R.id.guidelineHorizontalForButtons;
                                        Guideline guideline = (Guideline) ViewBindings.findChildViewById(rootView, R.id.guidelineHorizontalForButtons);
                                        if (guideline != null) {
                                            i = R.id.ib_info;
                                            ImageButton imageButton4 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.ib_info);
                                            if (imageButton4 != null) {
                                                i = R.id.ivBRLogo;
                                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.ivBRLogo);
                                                if (imageView != null) {
                                                    ConstraintLayout constraintLayout = (ConstraintLayout) rootView;
                                                    i = R.id.progress_bar;
                                                    ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progress_bar);
                                                    if (progressBar != null) {
                                                        i = R.id.text_view_info_about_nickname;
                                                        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_view_info_about_nickname);
                                                        if (textView != null) {
                                                            i = R.id.tvBlackRussia;
                                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvBlackRussia);
                                                            if (textView2 != null) {
                                                                return new FragmentMainBinding(constraintLayout, viewFindChildViewById, imageButton, appCompatButton, appCompatButton2, imageButton2, imageButton3, customEditTextForMainActivity, customEditTextForMainActivity2, guideline, imageButton4, imageView, constraintLayout, progressBar, textView, textView2);
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
