package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;

/* loaded from: classes3.dex */
public final class MiniGameEventsPopupDialogBinding implements ViewBinding {

    @NonNull
    public final LinearLayout miniGameBody;

    @NonNull
    public final AppCompatButton miniGamesApplyOne;

    @NonNull
    public final AppCompatButton miniGamesApplyTwo;

    @NonNull
    public final AppCompatButton miniGamesClose;

    @NonNull
    public final TextView miniGamesContent;

    @NonNull
    public final TextView miniGamesHeader;

    @NonNull
    public final ConstraintLayout rootView;

    public MiniGameEventsPopupDialogBinding(@NonNull ConstraintLayout rootView, @NonNull LinearLayout miniGameBody, @NonNull AppCompatButton miniGamesApplyOne, @NonNull AppCompatButton miniGamesApplyTwo, @NonNull AppCompatButton miniGamesClose, @NonNull TextView miniGamesContent, @NonNull TextView miniGamesHeader) {
        this.rootView = rootView;
        this.miniGameBody = miniGameBody;
        this.miniGamesApplyOne = miniGamesApplyOne;
        this.miniGamesApplyTwo = miniGamesApplyTwo;
        this.miniGamesClose = miniGamesClose;
        this.miniGamesContent = miniGamesContent;
        this.miniGamesHeader = miniGamesHeader;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static MiniGameEventsPopupDialogBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static MiniGameEventsPopupDialogBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.mini_game_events_popup_dialog, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static MiniGameEventsPopupDialogBinding bind(@NonNull View rootView) {
        int i = R.id.mini_game_body;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.mini_game_body);
        if (linearLayout != null) {
            i = R.id.mini_games_apply_one;
            AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.mini_games_apply_one);
            if (appCompatButton != null) {
                i = R.id.mini_games_apply_two;
                AppCompatButton appCompatButton2 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.mini_games_apply_two);
                if (appCompatButton2 != null) {
                    i = R.id.mini_games_close;
                    AppCompatButton appCompatButton3 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.mini_games_close);
                    if (appCompatButton3 != null) {
                        i = R.id.mini_games_content;
                        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.mini_games_content);
                        if (textView != null) {
                            i = R.id.mini_games_header;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.mini_games_header);
                            if (textView2 != null) {
                                return new MiniGameEventsPopupDialogBinding((ConstraintLayout) rootView, linearLayout, appCompatButton, appCompatButton2, appCompatButton3, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
