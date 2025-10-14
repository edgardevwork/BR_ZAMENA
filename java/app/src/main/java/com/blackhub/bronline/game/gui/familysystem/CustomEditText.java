package com.blackhub.bronline.game.gui.familysystem;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.GUIManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: CustomEditText.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class CustomEditText extends AppCompatEditText {
    public static final int $stable = 8;
    public int counter;

    @Nullable
    public GUIManager guiManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomEditText(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setGUIManager(@Nullable GUIManager getGuiManager) {
        this.guiManager = getGuiManager;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onKeyPreIme(int keyCode, @Nullable KeyEvent event) throws JSONException {
        if (keyCode != 4) {
            return false;
        }
        int i = this.counter + 1;
        this.counter = i;
        if (i % 2 == 0) {
            return false;
        }
        putValueTokenForGetCost(sendToServerValueOfToken());
        return false;
    }

    @Override // android.widget.TextView
    public void onEditorAction(int actionCode) throws JSONException {
        super.onEditorAction(actionCode);
        if (actionCode == 3 || actionCode == 4 || actionCode == 6) {
            putValueTokenForGetCost(sendToServerValueOfToken());
        }
    }

    public final int sendToServerValueOfToken() {
        String strValueOf = String.valueOf(super.getText());
        Intrinsics.checkNotNull(strValueOf);
        if (strValueOf.length() <= 0 || strValueOf.charAt(0) == '0') {
            return 0;
        }
        return Integer.parseInt(strValueOf);
    }

    public final void putValueTokenForGetCost(int valueOfToken) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("t", 9);
            jSONObject.put("s", 1);
            jSONObject.put("v", valueOfToken);
            GUIManager gUIManager = this.guiManager;
            if (gUIManager != null) {
                gUIManager.sendJsonData(45, jSONObject);
            }
        } catch (Exception unused) {
        }
    }
}

