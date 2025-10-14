package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;

/* loaded from: classes.dex */
public final class HalloweenLobbyBinding implements ViewBinding {

    @NonNull
    public final AppCompatButton invite;

    @NonNull
    public final RelativeLayout leaderPart;

    @NonNull
    public final TextView playerList;

    @NonNull
    public final LinearLayout playerPart;

    @NonNull
    public final LinearLayout rootView;

    /* renamed from: rv */
    @NonNull
    public final RecyclerView f380rv;

    @NonNull
    public final AppCompatButton start;

    @NonNull
    public final TextView startHint;

    @NonNull
    public final TextView textView15;

    @NonNull
    public final View view6;

    public HalloweenLobbyBinding(@NonNull LinearLayout rootView, @NonNull AppCompatButton invite, @NonNull RelativeLayout leaderPart, @NonNull TextView playerList, @NonNull LinearLayout playerPart, @NonNull RecyclerView rv, @NonNull AppCompatButton start, @NonNull TextView startHint, @NonNull TextView textView15, @NonNull View view6) {
        this.rootView = rootView;
        this.invite = invite;
        this.leaderPart = leaderPart;
        this.playerList = playerList;
        this.playerPart = playerPart;
        this.f380rv = rv;
        this.start = start;
        this.startHint = startHint;
        this.textView15 = textView15;
        this.view6 = view6;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static HalloweenLobbyBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static HalloweenLobbyBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.halloween_lobby, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static HalloweenLobbyBinding bind(@NonNull View rootView) {
        int i = R.id.invite;
        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.invite);
        if (appCompatButton != null) {
            i = R.id.leader_part;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.leader_part);
            if (relativeLayout != null) {
                i = R.id.playerList;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.playerList);
                if (textView != null) {
                    i = R.id.player_part;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.player_part);
                    if (linearLayout != null) {
                        i = R.id.f480rv;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.f480rv);
                        if (recyclerView != null) {
                            i = R.id.start;
                            AppCompatButton appCompatButton2 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.start);
                            if (appCompatButton2 != null) {
                                i = R.id.start_hint;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.start_hint);
                                if (textView2 != null) {
                                    i = R.id.textView15;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.textView15);
                                    if (textView3 != null) {
                                        i = R.id.view6;
                                        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.view6);
                                        if (viewFindChildViewById != null) {
                                            return new HalloweenLobbyBinding((LinearLayout) rootView, appCompatButton, relativeLayout, textView, linearLayout, recyclerView, appCompatButton2, textView2, textView3, viewFindChildViewById);
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
