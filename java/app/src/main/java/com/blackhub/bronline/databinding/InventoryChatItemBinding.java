package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;

/* loaded from: classes.dex */
public final class InventoryChatItemBinding implements ViewBinding {

    @NonNull
    public final RelativeLayout blockWithActions;

    @NonNull
    public final TextView chatPlayersNick;

    @NonNull
    public final TextView chatTextMessage;

    @NonNull
    public final TextView finalActionText;

    @NonNull
    public final RelativeLayout rootView;

    public InventoryChatItemBinding(@NonNull RelativeLayout rootView, @NonNull RelativeLayout blockWithActions, @NonNull TextView chatPlayersNick, @NonNull TextView chatTextMessage, @NonNull TextView finalActionText) {
        this.rootView = rootView;
        this.blockWithActions = blockWithActions;
        this.chatPlayersNick = chatPlayersNick;
        this.chatTextMessage = chatTextMessage;
        this.finalActionText = finalActionText;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static InventoryChatItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static InventoryChatItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.inventory_chat_item, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static InventoryChatItemBinding bind(@NonNull View rootView) {
        int i = R.id.block_with_actions;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.block_with_actions);
        if (relativeLayout != null) {
            i = R.id.chat_players_nick;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.chat_players_nick);
            if (textView != null) {
                i = R.id.chat_text_message;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.chat_text_message);
                if (textView2 != null) {
                    i = R.id.final_action_text;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.final_action_text);
                    if (textView3 != null) {
                        return new InventoryChatItemBinding((RelativeLayout) rootView, relativeLayout, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
