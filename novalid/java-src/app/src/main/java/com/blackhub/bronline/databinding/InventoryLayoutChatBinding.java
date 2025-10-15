package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;

/* loaded from: classes.dex */
public final class InventoryLayoutChatBinding implements ViewBinding {

    @NonNull
    public final View chatButtonSendMessage;

    @NonNull
    public final CoordinatorLayout coordinatorForSnackbar;

    @NonNull
    public final EditText editTextMessageInChat;

    @NonNull
    public final RecyclerView invChatBodyWithMessages;

    @NonNull
    public final AppCompatButton invChatCloseChat;

    @NonNull
    public final View invChatVerticalLine;

    @NonNull
    public final ConstraintLayout rootView;

    public InventoryLayoutChatBinding(@NonNull ConstraintLayout rootView, @NonNull View chatButtonSendMessage, @NonNull CoordinatorLayout coordinatorForSnackbar, @NonNull EditText editTextMessageInChat, @NonNull RecyclerView invChatBodyWithMessages, @NonNull AppCompatButton invChatCloseChat, @NonNull View invChatVerticalLine) {
        this.rootView = rootView;
        this.chatButtonSendMessage = chatButtonSendMessage;
        this.coordinatorForSnackbar = coordinatorForSnackbar;
        this.editTextMessageInChat = editTextMessageInChat;
        this.invChatBodyWithMessages = invChatBodyWithMessages;
        this.invChatCloseChat = invChatCloseChat;
        this.invChatVerticalLine = invChatVerticalLine;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static InventoryLayoutChatBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static InventoryLayoutChatBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.inventory_layout_chat, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static InventoryLayoutChatBinding bind(@NonNull View rootView) {
        int i = R.id.chat_button_send_message;
        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.chat_button_send_message);
        if (viewFindChildViewById != null) {
            i = R.id.coordinator_for_snackbar;
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ViewBindings.findChildViewById(rootView, R.id.coordinator_for_snackbar);
            if (coordinatorLayout != null) {
                i = R.id.edit_text_message_in_chat;
                EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.edit_text_message_in_chat);
                if (editText != null) {
                    i = R.id.inv_chat_body_with_messages;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.inv_chat_body_with_messages);
                    if (recyclerView != null) {
                        i = R.id.inv_chat_close_chat;
                        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.inv_chat_close_chat);
                        if (appCompatButton != null) {
                            i = R.id.inv_chat_vertical_line;
                            View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.inv_chat_vertical_line);
                            if (viewFindChildViewById2 != null) {
                                return new InventoryLayoutChatBinding((ConstraintLayout) rootView, viewFindChildViewById, coordinatorLayout, editText, recyclerView, appCompatButton, viewFindChildViewById2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
