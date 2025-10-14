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
@Metadata(m7104d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u000f\u001a\u00020\u0010J\b\u0010\u0011\u001a\u00020\u0010H\u0002J\u000e\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0010R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/inventory/UIChat;", "", "mainRoot", "Lcom/blackhub/bronline/game/gui/inventory/GUIUsersInventory;", "playersNickname", "", "inventoryAndExchangeViewModel", "Lcom/blackhub/bronline/game/gui/inventory/viewmodel/InventoryAndExchangeViewModel;", "(Lcom/blackhub/bronline/game/gui/inventory/GUIUsersInventory;Ljava/lang/String;Lcom/blackhub/bronline/game/gui/inventory/viewmodel/InventoryAndExchangeViewModel;)V", "dialog", "Landroid/app/Dialog;", "messageAdapter", "Lcom/blackhub/bronline/game/gui/inventory/adapters/InventoryChatAdapter;", "viewMessage", "Landroidx/recyclerview/widget/RecyclerView;", "closeChat", "", "setClickableLogic", "setNewMessage", "newMessage", "Lcom/blackhub/bronline/game/gui/inventory/data/InvMessageObj;", "showDialogChat", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
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
