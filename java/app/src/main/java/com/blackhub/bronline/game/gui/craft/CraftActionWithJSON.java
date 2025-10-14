package com.blackhub.bronline.game.gui.craft;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.GUIManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: CraftActionWithJSON.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class CraftActionWithJSON {
    public static final int $stable = 8;

    @NotNull
    public final GUIManager guiManager;
    public final int screenId;

    public CraftActionWithJSON(@NotNull GUIManager guiManager) {
        Intrinsics.checkNotNullParameter(guiManager, "guiManager");
        this.guiManager = guiManager;
        this.screenId = 49;
    }

    public final void sendCloseScreen() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("c", 1);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void sendStartCreation(int idElement, int valueOfElement) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 1);
        jSONObject.put("id", idElement);
        jSONObject.put("ct", valueOfElement);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public static /* synthetic */ void receivingElement$default(CraftActionWithJSON craftActionWithJSON, Integer num, int i, Object obj) throws JSONException {
        if ((i & 1) != 0) {
            num = null;
        }
        craftActionWithJSON.receivingElement(num);
    }

    public final void receivingElement(@Nullable Integer idElement) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 3);
        if (idElement != null) {
            jSONObject.put("id", idElement.intValue());
        }
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void sendCancelCreation(int idElement) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 4);
        jSONObject.put("id", idElement);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void sendNewItemPressed(int typeKey, int itemId) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", typeKey);
        jSONObject.put("id", itemId);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void sendBuyVipClick() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 6);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }
}

