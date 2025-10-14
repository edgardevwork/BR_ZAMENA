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

/* loaded from: classes3.dex */
public final class MiniGameEventsChooseTileBinding implements ViewBinding {

    @NonNull
    public final ImageView ivHalloweenChooseTile;

    @NonNull
    public final ConstraintLayout root;

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final TextView tvHalloweenChooseTileQueue;

    @NonNull
    public final TextView tvHalloweenChooseTileTitle;

    public MiniGameEventsChooseTileBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView ivHalloweenChooseTile, @NonNull ConstraintLayout root, @NonNull TextView tvHalloweenChooseTileQueue, @NonNull TextView tvHalloweenChooseTileTitle) {
        this.rootView = rootView;
        this.ivHalloweenChooseTile = ivHalloweenChooseTile;
        this.root = root;
        this.tvHalloweenChooseTileQueue = tvHalloweenChooseTileQueue;
        this.tvHalloweenChooseTileTitle = tvHalloweenChooseTileTitle;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static MiniGameEventsChooseTileBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static MiniGameEventsChooseTileBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.mini_game_events_choose_tile, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static MiniGameEventsChooseTileBinding bind(@NonNull View rootView) {
        int i = R.id.ivHalloweenChooseTile;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.ivHalloweenChooseTile);
        if (imageView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) rootView;
            i = R.id.tvHalloweenChooseTileQueue;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvHalloweenChooseTileQueue);
            if (textView != null) {
                i = R.id.tvHalloweenChooseTileTitle;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvHalloweenChooseTileTitle);
                if (textView2 != null) {
                    return new MiniGameEventsChooseTileBinding(constraintLayout, imageView, constraintLayout, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
