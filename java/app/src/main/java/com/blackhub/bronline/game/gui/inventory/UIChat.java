package com.blackhub.bronline.game.gui.inventory;

import android.app.Dialog;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.game.core.JNIActivity;
import com.blackhub.bronline.game.gui.inventory.adapters.InventoryChatAdapter;
import com.blackhub.bronline.game.gui.inventory.data.InvMessageObj;
import com.blackhub.bronline.game.gui.inventory.network.InvActionWithJSON;
import com.blackhub.bronline.game.gui.inventory.viewmodel.InventoryAndExchangeViewModel;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* compiled from: UIChat.kt */
@StabilityInferred(parameters = 0)

public final class UIChat {
    public static final int $stable = 8;

    @Nullable
    public Dialog dialog;

    @Nullable
    public final InventoryAndExchangeViewModel inventoryAndExchangeViewModel;

    @NotNull
    public final GUIUsersInventory mainRoot;

    @Nullable
    public InventoryChatAdapter messageAdapter;

    @Nullable
    public RecyclerView viewMessage;

    public UIChat(@NotNull GUIUsersInventory mainRoot, @Nullable String str, @Nullable InventoryAndExchangeViewModel inventoryAndExchangeViewModel) {
        Intrinsics.checkNotNullParameter(mainRoot, "mainRoot");
        this.mainRoot = mainRoot;
        this.inventoryAndExchangeViewModel = inventoryAndExchangeViewModel;
        Dialog dialog = new Dialog(JNIActivity.getContext());
        dialog.setContentView(R.layout.inventory_layout_chat);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        this.dialog = dialog;
        this.viewMessage = (RecyclerView) dialog.findViewById(R.id.inv_chat_body_with_messages);
        Context contextRequireContext = mainRoot.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        this.messageAdapter = new InventoryChatAdapter(str, contextRequireContext);
        RecyclerView recyclerView = this.viewMessage;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(mainRoot.getContext(), 1, false));
            recyclerView.setAdapter(this.messageAdapter);
        }
        setClickableLogic();
    }

    public final void setClickableLogic() {
        Dialog dialog = this.dialog;
        Button button = dialog != null ? (Button) dialog.findViewById(R.id.inv_chat_close_chat) : null;
        if (button != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.inventory.UIChat$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UIChat.setClickableLogic$lambda$2(this.f$0, view);
                }
            });
        }
        Dialog dialog2 = this.dialog;
        final EditText editText = dialog2 != null ? (EditText) dialog2.findViewById(R.id.edit_text_message_in_chat) : null;
        Dialog dialog3 = this.dialog;
        View viewFindViewById = dialog3 != null ? dialog3.findViewById(R.id.chat_button_send_message) : null;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.inventory.UIChat$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) throws JSONException {
                    UIChat.setClickableLogic$lambda$3(editText, this, view);
                }
            });
        }
    }

    public static final void setClickableLogic$lambda$2(UIChat this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.closeChat();
    }

    public static final void setClickableLogic$lambda$3(EditText editText, UIChat this$0, View view) throws JSONException {
        Editable text;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String strValueOf = String.valueOf(editText != null ? editText.getText() : null);
        if (strValueOf.length() > 0) {
            InvActionWithJSON.INSTANCE.sendMessageToServer(31, strValueOf);
            InventoryAndExchangeViewModel inventoryAndExchangeViewModel = this$0.inventoryAndExchangeViewModel;
            if (inventoryAndExchangeViewModel != null) {
                inventoryAndExchangeViewModel.setNewMessage(new InvMessageObj(true, 1, strValueOf, 0, "", 0));
            }
            if (editText == null || (text = editText.getText()) == null) {
                return;
            }
            text.clear();
        }
    }

    public final void showDialogChat() {
        Dialog dialog = this.dialog;
        if (dialog != null) {
            dialog.show();
        }
    }

    public final void closeChat() {
        Dialog dialog = this.dialog;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    public final void setNewMessage(@NotNull InvMessageObj newMessage) {
        Intrinsics.checkNotNullParameter(newMessage, "newMessage");
        InventoryChatAdapter inventoryChatAdapter = this.messageAdapter;
        if (inventoryChatAdapter != null) {
            inventoryChatAdapter.updateMessage(newMessage);
        }
        if (newMessage.getIfMyMessage()) {
            this.mainRoot.setCounter(0);
            GUIUsersInventory gUIUsersInventory = this.mainRoot;
            gUIUsersInventory.updateCountWithNewMessages(gUIUsersInventory.getCounter());
        }
    }
}

