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
@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\nJ\u0006\u0010\u000b\u001a\u00020\bJ\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006J\u0006\u0010\r\u001a\u00020\bJ\u0016\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006J\u0016\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/craft/CraftActionWithJSON;", "", "guiManager", "Lcom/blackhub/bronline/game/GUIManager;", "(Lcom/blackhub/bronline/game/GUIManager;)V", "screenId", "", "receivingElement", "", "idElement", "(Ljava/lang/Integer;)V", "sendBuyVipClick", "sendCancelCreation", "sendCloseScreen", "sendNewItemPressed", "typeKey", "itemId", "sendStartCreation", "valueOfElement", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
