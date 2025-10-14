package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;

/* loaded from: classes3.dex */
public final class PlayersListItemBinding implements ViewBinding {

    @NonNull
    public final TextView playerId;

    @NonNull
    public final TextView playerLevel;

    @NonNull
    public final TextView playerName;

    @NonNull
    public final TextView playerPing;

    @NonNull
    public final ConstraintLayout rootView;

    public PlayersListItemBinding(@NonNull ConstraintLayout rootView, @NonNull TextView playerId, @NonNull TextView playerLevel, @NonNull TextView playerName, @NonNull TextView playerPing) {
        this.rootView = rootView;
        this.playerId = playerId;
        this.playerLevel = playerLevel;
        this.playerName = playerName;
        this.playerPing = playerPing;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static PlayersListItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static PlayersListItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.players_list_item, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static PlayersListItemBinding bind(@NonNull View rootView) {
        int i = R.id.player_id;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.player_id);
        if (textView != null) {
            i = R.id.player_level;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.player_level);
            if (textView2 != null) {
                i = R.id.player_name;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.player_name);
                if (textView3 != null) {
                    i = R.id.player_ping;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.player_ping);
                    if (textView4 != null) {
                        return new PlayersListItemBinding((ConstraintLayout) rootView, textView, textView2, textView3, textView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
