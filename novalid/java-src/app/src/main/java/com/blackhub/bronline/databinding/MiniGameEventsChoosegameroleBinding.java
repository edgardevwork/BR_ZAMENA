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

/* loaded from: classes3.dex */
public final class MiniGameEventsChoosegameroleBinding implements ViewBinding {

    @NonNull
    public final AppCompatButton btnHalloweenChooseGameRoleBack;

    @NonNull
    public final AppCompatButton btnHalloweenChooseGameRoleNext;

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final RecyclerView rvHalloweenChooseGameRole;

    @NonNull
    public final TextView tvHalloweenChooseGameRoleHeader;

    public MiniGameEventsChoosegameroleBinding(@NonNull ConstraintLayout rootView, @NonNull AppCompatButton btnHalloweenChooseGameRoleBack, @NonNull AppCompatButton btnHalloweenChooseGameRoleNext, @NonNull RecyclerView rvHalloweenChooseGameRole, @NonNull TextView tvHalloweenChooseGameRoleHeader) {
        this.rootView = rootView;
        this.btnHalloweenChooseGameRoleBack = btnHalloweenChooseGameRoleBack;
        this.btnHalloweenChooseGameRoleNext = btnHalloweenChooseGameRoleNext;
        this.rvHalloweenChooseGameRole = rvHalloweenChooseGameRole;
        this.tvHalloweenChooseGameRoleHeader = tvHalloweenChooseGameRoleHeader;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static MiniGameEventsChoosegameroleBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static MiniGameEventsChoosegameroleBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.mini_game_events_choosegamerole, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static MiniGameEventsChoosegameroleBinding bind(@NonNull View rootView) {
        int i = R.id.btnHalloweenChooseGameRoleBack;
        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.btnHalloweenChooseGameRoleBack);
        if (appCompatButton != null) {
            i = R.id.btnHalloweenChooseGameRoleNext;
            AppCompatButton appCompatButton2 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.btnHalloweenChooseGameRoleNext);
            if (appCompatButton2 != null) {
                i = R.id.rvHalloweenChooseGameRole;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.rvHalloweenChooseGameRole);
                if (recyclerView != null) {
                    i = R.id.tvHalloweenChooseGameRoleHeader;
                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvHalloweenChooseGameRoleHeader);
                    if (textView != null) {
                        return new MiniGameEventsChoosegameroleBinding((ConstraintLayout) rootView, appCompatButton, appCompatButton2, recyclerView, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
