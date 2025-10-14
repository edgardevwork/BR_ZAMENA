package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;

/* loaded from: classes.dex */
public final class EntertainmentSystemTopItemBinding implements ViewBinding {

    @NonNull
    public final ImageView gameIcon;

    @NonNull
    public final ImageView leftIcon;

    @NonNull
    public final TextView playersGames;

    @NonNull
    public final TextView playersNick;

    @NonNull
    public final ImageView rightIcon;

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final TextView topPosition;

    @NonNull
    public final View topPositionBg;

    public EntertainmentSystemTopItemBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView gameIcon, @NonNull ImageView leftIcon, @NonNull TextView playersGames, @NonNull TextView playersNick, @NonNull ImageView rightIcon, @NonNull TextView topPosition, @NonNull View topPositionBg) {
        this.rootView = rootView;
        this.gameIcon = gameIcon;
        this.leftIcon = leftIcon;
        this.playersGames = playersGames;
        this.playersNick = playersNick;
        this.rightIcon = rightIcon;
        this.topPosition = topPosition;
        this.topPositionBg = topPositionBg;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static EntertainmentSystemTopItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static EntertainmentSystemTopItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.entertainment_system_top_item, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static EntertainmentSystemTopItemBinding bind(@NonNull View rootView) {
        int i = R.id.game_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.game_icon);
        if (imageView != null) {
            i = R.id.left_icon;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.left_icon);
            if (imageView2 != null) {
                i = R.id.players_games;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.players_games);
                if (textView != null) {
                    i = R.id.players_nick;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.players_nick);
                    if (textView2 != null) {
                        i = R.id.right_icon;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.right_icon);
                        if (imageView3 != null) {
                            i = R.id.top_position;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.top_position);
                            if (textView3 != null) {
                                i = R.id.top_position_bg;
                                View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.top_position_bg);
                                if (viewFindChildViewById != null) {
                                    return new EntertainmentSystemTopItemBinding((ConstraintLayout) rootView, imageView, imageView2, textView, textView2, imageView3, textView3, viewFindChildViewById);
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
