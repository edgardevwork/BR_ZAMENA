package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
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
public final class PlayerListDialogBinding implements ViewBinding {

    @NonNull
    public final ImageView iconClearSearchText;

    @NonNull
    public final ImageView iconSearchView;

    @NonNull
    public final AppCompatButton playersListClose;

    @NonNull
    public final TextView playersListValuePlayers;

    @NonNull
    public final RecyclerView recyclerViewPlayersList;

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final EditText searchView;

    @NonNull
    public final TextView textViewId;

    @NonNull
    public final TextView textViewLevel;

    @NonNull
    public final TextView textViewNickName;

    @NonNull
    public final TextView textViewPing;

    @NonNull
    public final TextView textViewPlayersList;

    public PlayerListDialogBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView iconClearSearchText, @NonNull ImageView iconSearchView, @NonNull AppCompatButton playersListClose, @NonNull TextView playersListValuePlayers, @NonNull RecyclerView recyclerViewPlayersList, @NonNull EditText searchView, @NonNull TextView textViewId, @NonNull TextView textViewLevel, @NonNull TextView textViewNickName, @NonNull TextView textViewPing, @NonNull TextView textViewPlayersList) {
        this.rootView = rootView;
        this.iconClearSearchText = iconClearSearchText;
        this.iconSearchView = iconSearchView;
        this.playersListClose = playersListClose;
        this.playersListValuePlayers = playersListValuePlayers;
        this.recyclerViewPlayersList = recyclerViewPlayersList;
        this.searchView = searchView;
        this.textViewId = textViewId;
        this.textViewLevel = textViewLevel;
        this.textViewNickName = textViewNickName;
        this.textViewPing = textViewPing;
        this.textViewPlayersList = textViewPlayersList;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static PlayerListDialogBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static PlayerListDialogBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.player_list_dialog, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static PlayerListDialogBinding bind(@NonNull View rootView) {
        int i = R.id.icon_clear_search_text;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.icon_clear_search_text);
        if (imageView != null) {
            i = R.id.icon_search_view;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.icon_search_view);
            if (imageView2 != null) {
                i = R.id.players_list_close;
                AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.players_list_close);
                if (appCompatButton != null) {
                    i = R.id.players_list_value_players;
                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.players_list_value_players);
                    if (textView != null) {
                        i = R.id.recycler_view_players_list;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.recycler_view_players_list);
                        if (recyclerView != null) {
                            i = R.id.search_view;
                            EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.search_view);
                            if (editText != null) {
                                i = R.id.text_view_id;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_view_id);
                                if (textView2 != null) {
                                    i = R.id.text_view_level;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_view_level);
                                    if (textView3 != null) {
                                        i = R.id.text_view_nick_name;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_view_nick_name);
                                        if (textView4 != null) {
                                            i = R.id.text_view_ping;
                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_view_ping);
                                            if (textView5 != null) {
                                                i = R.id.text_view_players_list;
                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_view_players_list);
                                                if (textView6 != null) {
                                                    return new PlayerListDialogBinding((ConstraintLayout) rootView, imageView, imageView2, appCompatButton, textView, recyclerView, editText, textView2, textView3, textView4, textView5, textView6);
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
