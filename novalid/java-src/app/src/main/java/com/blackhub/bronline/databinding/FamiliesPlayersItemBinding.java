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

/* loaded from: classes.dex */
public final class FamiliesPlayersItemBinding implements ViewBinding {

    @NonNull
    public final TextView playersNick;

    @NonNull
    public final TextView playersRank;

    @NonNull
    public final View playersStatus;

    @NonNull
    public final ConstraintLayout rootView;

    public FamiliesPlayersItemBinding(@NonNull ConstraintLayout rootView, @NonNull TextView playersNick, @NonNull TextView playersRank, @NonNull View playersStatus) {
        this.rootView = rootView;
        this.playersNick = playersNick;
        this.playersRank = playersRank;
        this.playersStatus = playersStatus;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FamiliesPlayersItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FamiliesPlayersItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.families_players_item, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static FamiliesPlayersItemBinding bind(@NonNull View rootView) {
        int i = R.id.players_nick;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.players_nick);
        if (textView != null) {
            i = R.id.players_rank;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.players_rank);
            if (textView2 != null) {
                i = R.id.players_status;
                View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.players_status);
                if (viewFindChildViewById != null) {
                    return new FamiliesPlayersItemBinding((ConstraintLayout) rootView, textView, textView2, viewFindChildViewById);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
