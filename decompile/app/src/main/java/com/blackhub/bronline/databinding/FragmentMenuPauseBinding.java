package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
public final class FragmentMenuPauseBinding implements ViewBinding {

    @NonNull
    public final AppCompatButton btnNativeTools;

    @NonNull
    public final AppCompatButton newMenuPauseButtonBackToGame;

    @NonNull
    public final RecyclerView newMenuPauseButtons;

    @NonNull
    public final TextView newMenuPausePlayersNick;

    @NonNull
    public final TextView newMenuPauseServer;

    @NonNull
    public final ConstraintLayout newMenuRootId;

    @NonNull
    public final ConstraintLayout rootView;

    public FragmentMenuPauseBinding(@NonNull ConstraintLayout rootView, @NonNull AppCompatButton btnNativeTools, @NonNull AppCompatButton newMenuPauseButtonBackToGame, @NonNull RecyclerView newMenuPauseButtons, @NonNull TextView newMenuPausePlayersNick, @NonNull TextView newMenuPauseServer, @NonNull ConstraintLayout newMenuRootId) {
        this.rootView = rootView;
        this.btnNativeTools = btnNativeTools;
        this.newMenuPauseButtonBackToGame = newMenuPauseButtonBackToGame;
        this.newMenuPauseButtons = newMenuPauseButtons;
        this.newMenuPausePlayersNick = newMenuPausePlayersNick;
        this.newMenuPauseServer = newMenuPauseServer;
        this.newMenuRootId = newMenuRootId;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FragmentMenuPauseBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentMenuPauseBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_menu_pause, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static FragmentMenuPauseBinding bind(@NonNull View rootView) {
        int i = R.id.btnNativeTools;
        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.btnNativeTools);
        if (appCompatButton != null) {
            i = R.id.new_menu_pause_button_back_to_game;
            AppCompatButton appCompatButton2 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.new_menu_pause_button_back_to_game);
            if (appCompatButton2 != null) {
                i = R.id.new_menu_pause_buttons;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.new_menu_pause_buttons);
                if (recyclerView != null) {
                    i = R.id.new_menu_pause_players_nick;
                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.new_menu_pause_players_nick);
                    if (textView != null) {
                        i = R.id.new_menu_pause_server;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.new_menu_pause_server);
                        if (textView2 != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) rootView;
                            return new FragmentMenuPauseBinding(constraintLayout, appCompatButton, appCompatButton2, recyclerView, textView, textView2, constraintLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
