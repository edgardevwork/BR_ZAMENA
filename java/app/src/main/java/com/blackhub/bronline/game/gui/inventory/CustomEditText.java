package com.blackhub.bronline.game.gui.inventory;

import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.GUIManager;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: CustomEditText.kt */
@StabilityInferred(parameters = 0)

public final class CustomEditText extends AppCompatEditText {
    public static final int $stable = 8;

    @Nullable
    public GUIManager guiManager;

    @Nullable
    public GUIUsersInventory root;
    public int saveValueOfMoney;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomEditText(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setGUIManager(@Nullable GUIManager guiManager) {
        this.guiManager = guiManager;
    }

    public final void setMainRoot(@Nullable GUIUsersInventory root) {
        this.root = root;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onKeyPreIme(int keyCode, @Nullable KeyEvent event) throws JSONException {
        if (keyCode == 4 && this.saveValueOfMoney != sendToServerMyValueOfMoney()) {
            if (sendToServerMyValueOfMoney() > 20000000) {
                sendMessageError("Нельзя передать за раз больше 20.000.000 ₽");
            } else {
                putInfoForClickCancelOrNextOrDismiss(sendToServerMyValueOfMoney());
            }
        }
        GUIUsersInventory gUIUsersInventory = this.root;
        if (gUIUsersInventory == null) {
            return false;
        }
        gUIUsersInventory.removeFocusableForEditText();
        return false;
    }

    @Override // android.widget.TextView
    public void onEditorAction(int actionCode) throws JSONException {
        super.onEditorAction(actionCode);
        if (actionCode == 3 || actionCode == 5 || actionCode == 6) {
            if (this.saveValueOfMoney != sendToServerMyValueOfMoney()) {
                if (sendToServerMyValueOfMoney() > 20000000) {
                    sendMessageError("Нельзя передать за раз больше 20.000.000 ₽");
                } else {
                    putInfoForClickCancelOrNextOrDismiss(sendToServerMyValueOfMoney());
                }
            }
            GUIUsersInventory gUIUsersInventory = this.root;
            if (gUIUsersInventory != null) {
                gUIUsersInventory.removeFocusableForEditText();
            }
        }
    }

    public final int sendToServerMyValueOfMoney() {
        Editable text = super.getText();
        Objects.requireNonNull(text);
        String string = text.toString();
        if (string.length() <= 0 || string.charAt(0) == '0') {
            return 0;
        }
        return Integer.parseInt(string);
    }

    public final void putInfoForClickCancelOrNextOrDismiss(int valueOfMoney) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("t", 6);
            jSONObject.put("em", valueOfMoney);
            GUIManager gUIManager = this.guiManager;
            Intrinsics.checkNotNull(gUIManager);
            gUIManager.sendJsonData(33, jSONObject);
            this.saveValueOfMoney = sendToServerMyValueOfMoney();
        } catch (Exception unused) {
        }
    }

    public final void sendMessageError(String message) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("o", 1);
            jSONObject.put("t", 2);
            jSONObject.put("d", 2);
            jSONObject.put("i", message);
            jSONObject.put("s", -1);
            GUIManager gUIManager = this.guiManager;
            Intrinsics.checkNotNull(gUIManager);
            gUIManager.onPacketIncoming(13, jSONObject);
            jSONObject2.put("t", 6);
            jSONObject2.put("s", 0);
            GUIManager gUIManager2 = this.guiManager;
            Intrinsics.checkNotNull(gUIManager2);
            gUIManager2.onPacketIncoming(33, jSONObject2);
        } catch (Exception unused) {
        }
    }
}

